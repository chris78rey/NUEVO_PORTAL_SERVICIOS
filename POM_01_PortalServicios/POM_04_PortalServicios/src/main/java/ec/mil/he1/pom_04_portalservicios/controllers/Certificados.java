/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.mil.he1.pom_04_portalservicios.controllers;

import ec.mil.he1.pom_01_domain.SegUrls;
import ec.mil.he1.pom_01_domain.SegUsuario;
import ec.mil.he1.pom_01_domain.VUsuariosClasif;
import ec.mil.he1.pom_03_ejb.stateless.procesos.ListasComunesRemote;
import java.io.IOException;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import static javax.faces.context.FacesContext.getCurrentInstance;
import javax.servlet.http.HttpSession;

/**
 *
 * @author christian_ruiz
 */
@Named(value="certificados")
@ViewScoped
public class Certificados implements Serializable {
    private static final long serialVersionUID = -754931071112804936L;

    private static String getNumeroHc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String hc = "";
    private String nombre = "";
    private String apellido = "";
    private String servicio = "";
    private String fecha = "";
    private String diagnostico = "";
    private String diagnosticocie10 = "";
    private String tratamiento = "";
    private String reposo = "";
    private String desde = "";
    private String hasta = "";
    private String observaciones = "";
    private String firmaNombre = "";
    private String firmaApellido = ""; 
   
    
    List<Map> listaf = new ArrayList<>();
    private Object segUrlsFacade;
    
    
    public List<Map> listaBuscaFechasCertificados(String pCriterio) {
        return listasComunes.listaBuscaFechasCertificados(pCriterio);
    }
    @EJB
    private ListasComunesRemote listasComunes;
    private SegUsuario segUsuario = new SegUsuario();
    private VUsuariosClasif vUsuariosClasif;

    @PostConstruct
    private void init() {
      out.println("@PostConstruct");
        FacesContext facesContext = getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
        vUsuariosClasif = (VUsuariosClasif) session.getAttribute("vUsuariosClasif");  
    }
    /** Creates a new instance of Certificados */
    public Certificados() {
    }
       public List<Map> getListaf() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        List<Map> listaBuscaFechasCertificados = listasComunes.listaBuscaFechasCertificados(segUsuario.getNumeroHc().toString()   ); 
        return listaBuscaFechasCertificados;
      
    }
   
       public String accion(String id) throws IOException {
        out.println("@PostConstruct");
        FacesContext facesContext = getCurrentInstance();
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
        vUsuariosClasif = (VUsuariosClasif) session.getAttribute("vUsuariosClasif"); 
        //id es el número del certificado
        session.setAttribute("idcertif", id);

        SegUrls segUrl = segUrlsFacade.findURL("reporte Certificado");
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(segUrl.getUrl() + Certificados.getNumeroHc() + "&sddvaxd=" + id);
        return null;
    }

    public String getHc() {
        return hc;
    }

    public void setHc(String hc) {
        this.hc = hc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getDiagnosticocie10() {
        return diagnosticocie10;
    }

    public void setDiagnosticocie10(String diagnosticocie10) {
        this.diagnosticocie10 = diagnosticocie10;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getReposo() {
        return reposo;
    }

    public void setReposo(String reposo) {
        this.reposo = reposo;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFirmaNombre() {
        return firmaNombre;
    }

    public void setFirmaNombre(String firmaNombre) {
        this.firmaNombre = firmaNombre;
    }

    public String getFirmaApellido() {
        return firmaApellido;
    }

    public void setFirmaApellido(String firmaApellido) {
        this.firmaApellido = firmaApellido;
    }
       
       

}
