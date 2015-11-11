package ec.mil.he1.pom_04_portalservicios.classespackage;

import ec.mil.he1.pom_01_domain.ContraReferenciasDiag;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.JsfUtil;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.PaginationHelper;
import ec.mil.he1.pom_04_portalservicios.beanpackage.ContraReferenciasDiagFacade;

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

@Named("contraReferenciasDiagController")
@SessionScoped
public class ContraReferenciasDiagController implements Serializable {

    private ContraReferenciasDiag current;
    private DataModel items = null;
    @EJB
    private ec.mil.he1.pom_04_portalservicios.beanpackage.ContraReferenciasDiagFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public ContraReferenciasDiagController() {
    }

    public ContraReferenciasDiag getSelected() {
        if (current == null) {
            current = new ContraReferenciasDiag();
            current.setContraReferenciasDiagPK(new ec.mil.he1.pom_01_domain.ContraReferenciasDiagPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private ContraReferenciasDiagFacade getFacade() {
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
        current = (ContraReferenciasDiag) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new ContraReferenciasDiag();
        current.setContraReferenciasDiagPK(new ec.mil.he1.pom_01_domain.ContraReferenciasDiagPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ContraReferenciasDiagCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (ContraReferenciasDiag) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ContraReferenciasDiagUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (ContraReferenciasDiag) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ContraReferenciasDiagDeleted"));
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

    public ContraReferenciasDiag getContraReferenciasDiag(ec.mil.he1.pom_01_domain.ContraReferenciasDiagPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = ContraReferenciasDiag.class)
    public static class ContraReferenciasDiagControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ContraReferenciasDiagController controller = (ContraReferenciasDiagController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "contraReferenciasDiagController");
            return controller.getContraReferenciasDiag(getKey(value));
        }

        ec.mil.he1.pom_01_domain.ContraReferenciasDiagPK getKey(String value) {
            ec.mil.he1.pom_01_domain.ContraReferenciasDiagPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new ec.mil.he1.pom_01_domain.ContraReferenciasDiagPK();
            key.setDgnpcnDgnpcnId(Long.parseLong(values[0]));
            key.setCntrfrNumero(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(ec.mil.he1.pom_01_domain.ContraReferenciasDiagPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getDgnpcnDgnpcnId());
            sb.append(SEPARATOR);
            sb.append(value.getCntrfrNumero());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof ContraReferenciasDiag) {
                ContraReferenciasDiag o = (ContraReferenciasDiag) object;
                return getStringKey(o.getContraReferenciasDiagPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + ContraReferenciasDiag.class.getName());
            }
        }

    }

}
