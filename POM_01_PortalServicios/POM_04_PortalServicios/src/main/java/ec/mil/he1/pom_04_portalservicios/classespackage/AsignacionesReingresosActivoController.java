package ec.mil.he1.pom_04_portalservicios.classespackage;

import ec.mil.he1.pom_01_domain.AsignacionesReingresosActivo;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.JsfUtil;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.PaginationHelper;
import ec.mil.he1.pom_04_portalservicios.beanpackage.AsignacionesReingresosActivoFacade;

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

@Named("asignacionesReingresosActivoController")
@SessionScoped
public class AsignacionesReingresosActivoController implements Serializable {

    private AsignacionesReingresosActivo current;
    private DataModel items = null;
    @EJB
    private ec.mil.he1.pom_04_portalservicios.beanpackage.AsignacionesReingresosActivoFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public AsignacionesReingresosActivoController() {
    }

    public AsignacionesReingresosActivo getSelected() {
        if (current == null) {
            current = new AsignacionesReingresosActivo();
            current.setAsignacionesReingresosActivoPK(new ec.mil.he1.pom_01_domain.AsignacionesReingresosActivoPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private AsignacionesReingresosActivoFacade getFacade() {
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
        current = (AsignacionesReingresosActivo) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new AsignacionesReingresosActivo();
        current.setAsignacionesReingresosActivoPK(new ec.mil.he1.pom_01_domain.AsignacionesReingresosActivoPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AsignacionesReingresosActivoCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (AsignacionesReingresosActivo) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AsignacionesReingresosActivoUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (AsignacionesReingresosActivo) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AsignacionesReingresosActivoDeleted"));
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

    public AsignacionesReingresosActivo getAsignacionesReingresosActivo(ec.mil.he1.pom_01_domain.AsignacionesReingresosActivoPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = AsignacionesReingresosActivo.class)
    public static class AsignacionesReingresosActivoControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AsignacionesReingresosActivoController controller = (AsignacionesReingresosActivoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "asignacionesReingresosActivoController");
            return controller.getAsignacionesReingresosActivo(getKey(value));
        }

        ec.mil.he1.pom_01_domain.AsignacionesReingresosActivoPK getKey(String value) {
            ec.mil.he1.pom_01_domain.AsignacionesReingresosActivoPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new ec.mil.he1.pom_01_domain.AsignacionesReingresosActivoPK();
            key.setEmpCodigo(values[0]);
            key.setTipoMovimiento(values[1]);
            key.setNumero(Integer.parseInt(values[2]));
            return key;
        }

        String getStringKey(ec.mil.he1.pom_01_domain.AsignacionesReingresosActivoPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getEmpCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getTipoMovimiento());
            sb.append(SEPARATOR);
            sb.append(value.getNumero());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof AsignacionesReingresosActivo) {
                AsignacionesReingresosActivo o = (AsignacionesReingresosActivo) object;
                return getStringKey(o.getAsignacionesReingresosActivoPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + AsignacionesReingresosActivo.class.getName());
            }
        }

    }

}
