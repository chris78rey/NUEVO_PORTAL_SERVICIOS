/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_04_portalservicios.controllers;

import ec.mil.he1.pom_03_ejb.stateless.procesos.LoginSessionBeanRemote;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import javax.naming.NamingException;

/**
 *
 * @author christian_ruiz
 */
@Named(value = "loginController")
@SessionScoped
public class LoginController implements Serializable {

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    @EJB
    private transient LoginSessionBeanRemote loginSessionBean;

    private static long serialVersionUID = -6373523075944545987L;

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
        System.out.println("actionEvent*************************");

    }

    public String accionIngresoPersonal() throws IOException, NamingException, SQLException {
        System.out.println("this = " + this);
        return null;
    }

}
