/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_04_portalservicios.controllers;

import ec.mil.he1.pom_01_domain.SegUsuario;
import ec.mil.he1.pom_01_domain.VUsuariosClasif;
import ec.mil.he1.pom_03_ejb.stateless.VUsuariosClasifFacadeRemote;
import ec.mil.he1.pom_03_ejb.stateless.procesos.LoginSessionBeanRemote;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.naming.NamingException;

/**
 *
 * @author christian_ruiz
 */
@Named(value = "loginController")
@SessionScoped
public class LoginController implements Serializable {

    String paginaSiguiente = "";
    @EJB
    private transient VUsuariosClasifFacadeRemote vUsuariosClasifFacade;
    VUsuariosClasif vUsuariosClasif = new VUsuariosClasif();

    private static final long serialVersionUID = -9036861759497150346L;
    private SegUsuario segUsuario = new SegUsuario();

    String mensaje = "";

    @EJB
    private transient LoginSessionBeanRemote loginSessionBean;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private String password = "";
    private String username = "";
    private String email = "";

    public LoginSessionBeanRemote getLoginSessionBean() {
        return loginSessionBean;
    }

    public void setLoginSessionBean(LoginSessionBeanRemote loginSessionBean) {
        this.loginSessionBean = loginSessionBean;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Creates a new instance of LoginController
     */
    public LoginController() {
    }

    public void buttonActionPersonal(ActionEvent actionEvent) throws SQLException {
        String Login = loginSessionBean.Login(username, password, "2");

        switch (Login) {
            case "1":
                mensaje = "Su usuario y clave estan correctas";
                segUsuario = loginSessionBean.usuarioByCC(this.username);
                //con este objeto se tiene ya los nombres
                vUsuariosClasif = vUsuariosClasifFacade.find(segUsuario.getId());
                paginaSiguiente = "dashboard.xhtml";
                break;
            case "0":
                mensaje = "Usuario o clave mal ingresados";
                break;
            case "-2":
                mensaje = "Usuario con más de un registro";
                break;
            case "4":
                mensaje = "El usuario no tiene acceso al módulo";
                break;
            case "5":
                mensaje = "Módulo inexistente, este mensaje es solo para sistemas";
                break;
            default:
                mensaje = "";

        }

    }

    public String accionIngresoPersonal() throws IOException, NamingException, SQLException {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Warning!", mensaje));
        mensaje = "";
        return paginaSiguiente;
    }

    /**
     * @return the segUsuario
     */
    public SegUsuario getSegUsuario() {
        return segUsuario;
    }

    /**
     * @param segUsuario the segUsuario to set
     */
    public void setSegUsuario(SegUsuario segUsuario) {
        this.segUsuario = segUsuario;
    }

}
