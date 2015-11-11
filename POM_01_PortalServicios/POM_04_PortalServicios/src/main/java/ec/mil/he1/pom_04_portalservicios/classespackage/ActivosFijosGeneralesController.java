package ec.mil.he1.pom_04_portalservicios.classespackage;

import ec.mil.he1.pom_01_domain.ActivosFijosGenerales;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.JsfUtil;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.PaginationHelper;
import ec.mil.he1.pom_04_portalservicios.beanpackage.ActivosFijosGeneralesFacade;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@Named("activosFijosGeneralesController")
@SessionScoped
public class ActivosFijosGeneralesController implements Serializable {

    private ActivosFijosGenerales current;
    private DataModel items = null;
    @EJB
    private ec.mil.he1.pom_04_portalservicios.beanpackage.ActivosFijosGeneralesFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public ActivosFijosGeneralesController() {
    }

    public ActivosFijosGenerales getSelected() {
        if (current == null) {
            current = new ActivosFijosGenerales();
            current.setActivosFijosGeneralesPK(new ec.mil.he1.pom_01_domain.ActivosFijosGeneralesPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private ActivosFijosGeneralesFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (ActivosFijosGenerales) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new ActivosFijosGenerales();
        current.setActivosFijosGeneralesPK(new ec.mil.he1.pom_01_domain.ActivosFijosGeneralesPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ActivosFijosGeneralesCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (ActivosFijosGenerales) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ActivosFijosGeneralesUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (ActivosFijosGenerales) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ActivosFijosGeneralesDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public ActivosFijosGenerales getActivosFijosGenerales(ec.mil.he1.pom_01_domain.ActivosFijosGeneralesPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = ActivosFijosGenerales.class)
    public static class ActivosFijosGeneralesControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ActivosFijosGeneralesController controller = (ActivosFijosGeneralesController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "activosFijosGeneralesController");
            return controller.getActivosFijosGenerales(getKey(value));
        }

        ec.mil.he1.pom_01_domain.ActivosFijosGeneralesPK getKey(String value) {
            ec.mil.he1.pom_01_domain.ActivosFijosGeneralesPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new ec.mil.he1.pom_01_domain.ActivosFijosGeneralesPK();
            key.setSbgactfjoGrpactfjoEmpCodigo(values[0]);
            key.setSbgactfjoGrpactfjoCodigo(Short.parseShort(values[1]));
            key.setSbgactfjoCodigo(Short.parseShort(values[2]));
            key.setCodigo(Short.parseShort(values[3]));
            return key;
        }

        String getStringKey(ec.mil.he1.pom_01_domain.ActivosFijosGeneralesPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getSbgactfjoGrpactfjoEmpCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getSbgactfjoGrpactfjoCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getSbgactfjoCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getCodigo());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof ActivosFijosGenerales) {
                ActivosFijosGenerales o = (ActivosFijosGenerales) object;
                return getStringKey(o.getActivosFijosGeneralesPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + ActivosFijosGenerales.class.getName());
            }
        }

    }

}
