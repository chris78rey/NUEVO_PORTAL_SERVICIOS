package ec.mil.he1.pom_04_portalservicios.jsfclassespackage;

import ec.mil.he1.pom_02_domain.entities.Parroquias;
import ec.mil.he1.pom_04_portalservicios.jsfclassespackage.util.JsfUtil;
import ec.mil.he1.pom_04_portalservicios.jsfclassespackage.util.PaginationHelper;
import ec.mil.he1.pom_04_portalservicios.sessionbean.ParroquiasFacade;

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

@Named("parroquiasController")
@SessionScoped
public class ParroquiasController implements Serializable {

    private Parroquias current;
    private DataModel items = null;
    @EJB
    private ec.mil.he1.pom_04_portalservicios.sessionbean.ParroquiasFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public ParroquiasController() {
    }

    public Parroquias getSelected() {
        if (current == null) {
            current = new Parroquias();
            current.setParroquiasPK(new ec.mil.he1.pom_02_domain.entities.ParroquiasPK());
            selectedItemIndex = -1;
        }
        return current;
    }

    private ParroquiasFacade getFacade() {
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
        current = (Parroquias) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Parroquias();
        current.setParroquiasPK(new ec.mil.he1.pom_02_domain.entities.ParroquiasPK());
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            current.getParroquiasPK().setCntCodigo(current.getCantones().getCantonesPK().getCodigo());
            current.getParroquiasPK().setCntPrvCodigo(current.getCantones().getCantonesPK().getPrvCodigo());
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ParroquiasCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Parroquias) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            current.getParroquiasPK().setCntCodigo(current.getCantones().getCantonesPK().getCodigo());
            current.getParroquiasPK().setCntPrvCodigo(current.getCantones().getCantonesPK().getPrvCodigo());
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ParroquiasUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Parroquias) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ParroquiasDeleted"));
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

    public Parroquias getParroquias(ec.mil.he1.pom_02_domain.entities.ParroquiasPK id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Parroquias.class)
    public static class ParroquiasControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ParroquiasController controller = (ParroquiasController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "parroquiasController");
            return controller.getParroquias(getKey(value));
        }

        ec.mil.he1.pom_02_domain.entities.ParroquiasPK getKey(String value) {
            ec.mil.he1.pom_02_domain.entities.ParroquiasPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new ec.mil.he1.pom_02_domain.entities.ParroquiasPK();
            key.setCntPrvCodigo(values[0]);
            key.setCntCodigo(values[1]);
            key.setCodigo(values[2]);
            return key;
        }

        String getStringKey(ec.mil.he1.pom_02_domain.entities.ParroquiasPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getCntPrvCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getCntCodigo());
            sb.append(SEPARATOR);
            sb.append(value.getCodigo());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Parroquias) {
                Parroquias o = (Parroquias) object;
                return getStringKey(o.getParroquiasPK());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Parroquias.class.getName());
            }
        }

    }

}
