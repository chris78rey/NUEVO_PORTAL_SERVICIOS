package ec.mil.he1.pom_04_portalservicios.classespackage;

import ec.mil.he1.pom_01_domain.DatosIntervienen;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.JsfUtil;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.PaginationHelper;
import ec.mil.he1.pom_04_portalservicios.beanpackage.DatosIntervienenFacade;

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

@Named("datosIntervienenController")
@SessionScoped
public class DatosIntervienenController implements Serializable {

    private DatosIntervienen current;
    private DataModel items = null;
    @EJB
    private ec.mil.he1.pom_04_portalservicios.beanpackage.DatosIntervienenFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public DatosIntervienenController() {
    }

    public DatosIntervienen getSelected() {
        if (current == null) {
            current = new DatosIntervienen();
            current.setDatosIntervienenPK(new ec.mil.he1.pom_01_domain.DatosIntervienenPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private DatosIntervienenFacade getFacade() {
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
        current = (DatosIntervienen) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new DatosIntervienen();
        current.setDatosIntervienenPK(new ec.mil.he1.pom_01_domain.DatosIntervienenPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("DatosIntervienenCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (DatosIntervienen) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("DatosIntervienenUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (DatosIntervienen) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("DatosIntervienenDeleted"));
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

    public DatosIntervienen getDatosIntervienen(ec.mil.he1.pom_01_domain.DatosIntervienenPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = DatosIntervienen.class)
    public static class DatosIntervienenControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            DatosIntervienenController controller = (DatosIntervienenController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "datosIntervienenController");
            return controller.getDatosIntervienen(getKey(value));
        }

        ec.mil.he1.pom_01_domain.DatosIntervienenPK getKey(String value) {
            ec.mil.he1.pom_01_domain.DatosIntervienenPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new ec.mil.he1.pom_01_domain.DatosIntervienenPK();
            key.setPrmespPrmrolEmpCodigo(values[0]);
            key.setPrmespPrmrolCodigo(values[1]);
            key.setPrmrolEmpCodigo(values[2]);
            key.setPrmrolCodigo(values[3]);
            return key;
        }

        String getStringKey(ec.mil.he1.pom_01_domain.DatosIntervienenPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getPrmespPrmrolEmpCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getPrmespPrmrolCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getPrmrolEmpCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getPrmrolCodigo());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof DatosIntervienen) {
                DatosIntervienen o = (DatosIntervienen) object;
                return getStringKey(o.getDatosIntervienenPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + DatosIntervienen.class.getName());
            }
        }

    }

}
