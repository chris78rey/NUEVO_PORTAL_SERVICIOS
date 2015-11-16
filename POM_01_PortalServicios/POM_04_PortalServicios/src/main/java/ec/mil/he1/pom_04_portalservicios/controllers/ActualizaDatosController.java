/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_04_portalservicios.controllers;

import ec.mil.he1.pom_01_domain.Provincias;
import ec.mil.he1.pom_03_ejb.stateless.ProvinciasFacadeRemote;
import ec.mil.he1.pom_03_ejb.stateless.procesos.ListasComunesRemote;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author christian_ruiz
 */
@Named(value = "actualizaDatosController")
@ViewScoped
public class ActualizaDatosController implements Serializable {

    @EJB
    private transient ProvinciasFacadeRemote provinciasFacade;

    private static final long serialVersionUID = 5190460509652921601L;
    @EJB
    private ListasComunesRemote listasComunes;
    private String provincias = "";
    private Provincias prov = new Provincias();

    public Provincias getProv() {
        System.out.println("prov = " + prov.getProvincia());
        return prov;
    }

    public void setProv(Provincias prov) {
        System.out.println("prov = " + prov.getProvincia());
        this.prov = prov;
    }

    public String getProvincias() {
        return provincias;
    }

    public void setProvincias(String provincias) {
        System.out.println("provincias = " + provincias);
//        prov = provinciasFacade.find(provincias);
        this.provincias = provincias;
    }

    public List<Provincias> getListProvincias() {
        return listasComunes.ListProvincias();
    }

    /**
     * Creates a new instance of ActualizaDatosController
     */
    public ActualizaDatosController() {
    }

    public void listen1(AjaxBehaviorEvent event) {
        System.out.println("ingresa");
    }

    /**
     * @return the provinciasFacade
     */
    public ProvinciasFacadeRemote getProvinciasFacade() {
        return provinciasFacade;
    }

    /**
     * @param provinciasFacade the provinciasFacade to set
     */
    public void setProvinciasFacade(ProvinciasFacadeRemote provinciasFacade) {
        this.provinciasFacade = provinciasFacade;
    }


}
