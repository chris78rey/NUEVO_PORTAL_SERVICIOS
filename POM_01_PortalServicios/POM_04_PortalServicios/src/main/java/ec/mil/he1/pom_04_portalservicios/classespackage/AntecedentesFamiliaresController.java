package ec.mil.he1.pom_04_portalservicios.classespackage;

import ec.mil.he1.pom_01_domain.AntecedentesFamiliares;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.JsfUtil;
import ec.mil.he1.pom_04_portalservicios.classespackage.util.PaginationHelper;
import ec.mil.he1.pom_04_portalservicios.beanpackage.AntecedentesFamiliaresFacade;

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

@Named("antecedentesFamiliaresController")
@SessionScoped
public class AntecedentesFamiliaresController implements Serializable {

    private AntecedentesFamiliares current;
    private DataModel items = null;
    @EJB
    private ec.mil.he1.pom_04_portalservicios.beanpackage.AntecedentesFamiliaresFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public AntecedentesFamiliaresController() {
    }

    public AntecedentesFamiliares getSelected() {
        if (current == null) {
            current = new AntecedentesFamiliares();
            current.setAntecedentesFamiliaresPK(new ec.mil.he1.pom_01_domain.AntecedentesFamiliaresPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private AntecedentesFamiliaresFacade getFacade() {
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
        current = (AntecedentesFamiliares) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new AntecedentesFamiliares();
        current.setAntecedentesFamiliaresPK(new ec.mil.he1.pom_01_domain.AntecedentesFamiliaresPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AntecedentesFamiliaresCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (AntecedentesFamiliares) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AntecedentesFamiliaresUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (AntecedentesFamiliares) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AntecedentesFamiliaresDeleted"));
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

    public AntecedentesFamiliares getAntecedentesFamiliares(ec.mil.he1.pom_01_domain.AntecedentesFamiliaresPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = AntecedentesFamiliares.class)
    public static class AntecedentesFamiliaresControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AntecedentesFamiliaresController controller = (AntecedentesFamiliaresController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "antecedentesFamiliaresController");
            return controller.getAntecedentesFamiliares(getKey(value));
        }

        ec.mil.he1.pom_01_domain.AntecedentesFamiliaresPK getKey(String value) {
            ec.mil.he1.pom_01_domain.AntecedentesFamiliaresPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new ec.mil.he1.pom_01_domain.AntecedentesFamiliaresPK();
            key.setTpoantfmlId(Integer.parseInt(values[0]));
            key.setFecha(java.sql.Date.valueOf(values[1]));
            key.setPcnNumeroHc(Integer.parseInt(values[2]));
            return key;
        }

        String getStringKey(ec.mil.he1.pom_01_domain.AntecedentesFamiliaresPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getTpoantfmlId());
            sb.append(SEPARATOR);
            sb.append(value.getFecha());
            sb.append(SEPARATOR);
            sb.append(value.getPcnNumeroHc());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof AntecedentesFamiliares) {
                AntecedentesFamiliares o = (AntecedentesFamiliares) object;
                return getStringKey(o.getAntecedentesFamiliaresPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + AntecedentesFamiliares.class.getName());
            }
        }

    }

}
