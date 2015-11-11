package ec.mil.he1.pom_04_portalservicios.classespackage;

import ec.mil.he1.pom_01_domain.AsociacionesTipoDeComproban;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.JsfUtil;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.PaginationHelper;
import ec.mil.he1.pom_04_portalservicios.beanpackage.AsociacionesTipoDeComprobanFacade;

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

@Named("asociacionesTipoDeComprobanController")
@SessionScoped
public class AsociacionesTipoDeComprobanController implements Serializable {

    private AsociacionesTipoDeComproban current;
    private DataModel items = null;
    @EJB
    private ec.mil.he1.pom_04_portalservicios.beanpackage.AsociacionesTipoDeComprobanFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public AsociacionesTipoDeComprobanController() {
    }

    public AsociacionesTipoDeComproban getSelected() {
        if (current == null) {
            current = new AsociacionesTipoDeComproban();
            current.setAsociacionesTipoDeComprobanPK(new ec.mil.he1.pom_01_domain.AsociacionesTipoDeComprobanPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private AsociacionesTipoDeComprobanFacade getFacade() {
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
        current = (AsociacionesTipoDeComproban) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new AsociacionesTipoDeComproban();
        current.setAsociacionesTipoDeComprobanPK(new ec.mil.he1.pom_01_domain.AsociacionesTipoDeComprobanPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AsociacionesTipoDeComprobanCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (AsociacionesTipoDeComproban) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AsociacionesTipoDeComprobanUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (AsociacionesTipoDeComproban) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AsociacionesTipoDeComprobanDeleted"));
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

    public AsociacionesTipoDeComproban getAsociacionesTipoDeComproban(ec.mil.he1.pom_01_domain.AsociacionesTipoDeComprobanPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = AsociacionesTipoDeComproban.class)
    public static class AsociacionesTipoDeComprobanControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AsociacionesTipoDeComprobanController controller = (AsociacionesTipoDeComprobanController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "asociacionesTipoDeComprobanController");
            return controller.getAsociacionesTipoDeComproban(getKey(value));
        }

        ec.mil.he1.pom_01_domain.AsociacionesTipoDeComprobanPK getKey(String value) {
            ec.mil.he1.pom_01_domain.AsociacionesTipoDeComprobanPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new ec.mil.he1.pom_01_domain.AsociacionesTipoDeComprobanPK();
            key.setTpocmpCodigo(values[0]);
            key.setNombre(values[1]);
            return key;
        }

        String getStringKey(ec.mil.he1.pom_01_domain.AsociacionesTipoDeComprobanPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getTpocmpCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getNombre());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof AsociacionesTipoDeComproban) {
                AsociacionesTipoDeComproban o = (AsociacionesTipoDeComproban) object;
                return getStringKey(o.getAsociacionesTipoDeComprobanPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + AsociacionesTipoDeComproban.class.getName());
            }
        }

    }

}
