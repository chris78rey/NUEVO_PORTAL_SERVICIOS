/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PLANILLA")
@NamedQueries({
    @NamedQuery(name = "Planilla.findAll", query = "SELECT p FROM Planilla p")})
public class Planilla implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO_PLANILLA")
    private Integer numeroPlanilla;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "ENTIDAD")
    private String entidad;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "EMERGENCIA")
    private Character emergencia;
    @Column(name = "BLOQUEADA")
    private Character bloqueada;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "SUBTIPO_IESS")
    private String subtipoIess;
    @Column(name = "TIPO_ESPECIALIDAD")
    private String tipoEspecialidad;
    @Column(name = "ID_ISSFA")
    private String idIssfa;
    @Column(name = "ID_ISSFA_TITULAR")
    private String idIssfaTitular;
    @Column(name = "FUERZA")
    private String fuerza;
    @Column(name = "GRADO")
    private String grado;
    @Column(name = "SITUACION")
    private String situacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "planilla", fetch = FetchType.LAZY)
    private List<DetallesPlanillaPrefact> detallesPlanillaPrefactList;
    @JoinColumn(name = "CJA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cajas cajas;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;

    public Planilla() {
    }

    public Planilla(Integer numeroPlanilla) {
        this.numeroPlanilla = numeroPlanilla;
    }

    public Integer getNumeroPlanilla() {
        return numeroPlanilla;
    }

    public void setNumeroPlanilla(Integer numeroPlanilla) {
        this.numeroPlanilla = numeroPlanilla;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Character getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(Character emergencia) {
        this.emergencia = emergencia;
    }

    public Character getBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(Character bloqueada) {
        this.bloqueada = bloqueada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSubtipoIess() {
        return subtipoIess;
    }

    public void setSubtipoIess(String subtipoIess) {
        this.subtipoIess = subtipoIess;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public String getIdIssfa() {
        return idIssfa;
    }

    public void setIdIssfa(String idIssfa) {
        this.idIssfa = idIssfa;
    }

    public String getIdIssfaTitular() {
        return idIssfaTitular;
    }

    public void setIdIssfaTitular(String idIssfaTitular) {
        this.idIssfaTitular = idIssfaTitular;
    }

    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public List<DetallesPlanillaPrefact> getDetallesPlanillaPrefactList() {
        return detallesPlanillaPrefactList;
    }

    public void setDetallesPlanillaPrefactList(List<DetallesPlanillaPrefact> detallesPlanillaPrefactList) {
        this.detallesPlanillaPrefactList = detallesPlanillaPrefactList;
    }

    public Cajas getCajas() {
        return cajas;
    }

    public void setCajas(Cajas cajas) {
        this.cajas = cajas;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroPlanilla != null ? numeroPlanilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planilla)) {
            return false;
        }
        Planilla other = (Planilla) object;
        if ((this.numeroPlanilla == null && other.numeroPlanilla != null) || (this.numeroPlanilla != null && !this.numeroPlanilla.equals(other.numeroPlanilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Planilla[ numeroPlanilla=" + numeroPlanilla + " ]";
    }
    
}
