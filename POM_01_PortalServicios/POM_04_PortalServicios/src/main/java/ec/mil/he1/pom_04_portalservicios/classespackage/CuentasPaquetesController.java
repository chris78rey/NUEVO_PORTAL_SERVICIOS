package ec.mil.he1.pom_04_portalservicios.classespackage;

import ec.mil.he1.pom_01_domain.CuentasPaquetes;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.JsfUtil;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.PaginationHelper;
import ec.mil.he1.pom_04_portalservicios.beanpackage.CuentasPaquetesFacade;

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

@Named("cuentasPaquetesController")
@SessionScoped
public class CuentasPaquetesController implements Serializable {

    private CuentasPaquetes current;
    private DataModel items = null;
    @EJB
    private ec.mil.he1.pom_04_portalservicios.beanpackage.CuentasPaquetesFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public CuentasPaquetesController() {
    }

    public CuentasPaquetes getSelected() {
        if (current == null) {
            current = new CuentasPaquetes();
            current.setCuentasPaquetesPK(new ec.mil.he1.pom_01_domain.CuentasPaquetesPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private CuentasPaquetesFacade getFacade() {
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
        current = (CuentasPaquetes) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new CuentasPaquetes();
        current.setCuentasPaquetesPK(new ec.mil.he1.pom_01_domain.CuentasPaquetesPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CuentasPaquetesCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (CuentasPaquetes) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CuentasPaquetesUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (CuentasPaquetes) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("CuentasPaquetesDeleted"));
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

    public CuentasPaquetes getCuentasPaquetes(ec.mil.he1.pom_01_domain.CuentasPaquetesPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = CuentasPaquetes.class)
    public static class CuentasPaquetesControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CuentasPaquetesController controller = (CuentasPaquetesController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "cuentasPaquetesController");
            return controller.getCuentasPaquetes(getKey(value));
        }

        ec.mil.he1.pom_01_domain.CuentasPaquetesPK getKey(String value) {
            ec.mil.he1.pom_01_domain.CuentasPaquetesPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new ec.mil.he1.pom_01_domain.CuentasPaquetesPK();
            key.setCntsDocumento(values[0]);
            key.setCntsNumero(Long.parseLong(values[1]));
            key.setCntsDetalle(Long.parseLong(values[2]));
            key.setCntsSeguro(new Character(values[3].charAt(0)));
            key.setSessionId(values[4]);
            return key;
        }

        String getStringKey(ec.mil.he1.pom_01_domain.CuentasPaquetesPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getCntsDocumento());
            sb.append(SEPARATOR);
            sb.append(value.getCntsNumero());
            sb.append(SEPARATOR);
            sb.append(value.getCntsDetalle());
            sb.append(SEPARATOR);
            sb.append(value.getCntsSeguro());
            sb.append(SEPARATOR);
            sb.append(value.getSessionId());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof CuentasPaquetes) {
                CuentasPaquetes o = (CuentasPaquetes) object;
                return getStringKey(o.getCuentasPaquetesPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + CuentasPaquetes.class.getName());
            }
        }

    }

}
