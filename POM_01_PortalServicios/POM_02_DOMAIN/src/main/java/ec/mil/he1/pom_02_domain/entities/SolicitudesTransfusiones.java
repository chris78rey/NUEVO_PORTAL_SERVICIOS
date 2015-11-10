/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "SOLICITUDES_TRANSFUSIONES")
@NamedQueries({
    @NamedQuery(name = "SolicitudesTransfusiones.findAll", query = "SELECT s FROM SolicitudesTransfusiones s")})
public class SolicitudesTransfusiones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA_DE_TRANSFUSION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeTransfusion;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "REACCIONES")
    private String reacciones;
    @Column(name = "EMBARAZOS")
    private Short embarazos;
    @Column(name = "OTROS_PRODUCTOS")
    private String otrosProductos;
    @Column(name = "TIPO_DE_SANGRE")
    private String tipoDeSangre;
    @Column(name = "SCREEN_ANTICUERPOS")
    private String screenAnticuerpos;
    @Column(name = "PRUEBAS_CRUZADAS")
    private String pruebasCruzadas;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "HJEVLCLN_NUMERO")
    private BigInteger hjevlclnNumero;
    @Column(name = "DGN_DGN_ID")
    private Long dgnDgnId;
    @Column(name = "FECHA_TRANSFUSION_ATERIOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTransfusionAterior;
    @OneToMany(mappedBy = "solicitudesTransfusiones", fetch = FetchType.LAZY)
    private List<JustificacionHemoderivados> justificacionHemoderivadosList;
    @OneToMany(mappedBy = "solicitudesTransfusiones", fetch = FetchType.LAZY)
    private List<Transfusiones> transfusionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudesTransfusiones", fetch = FetchType.LAZY)
    private List<DetallesTransfusiones> detallesTransfusionesList;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public SolicitudesTransfusiones() {
    }

    public SolicitudesTransfusiones(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFechaDeTransfusion() {
        return fechaDeTransfusion;
    }

    public void setFechaDeTransfusion(Date fechaDeTransfusion) {
        this.fechaDeTransfusion = fechaDeTransfusion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getReacciones() {
        return reacciones;
    }

    public void setReacciones(String reacciones) {
        this.reacciones = reacciones;
    }

    public Short getEmbarazos() {
        return embarazos;
    }

    public void setEmbarazos(Short embarazos) {
        this.embarazos = embarazos;
    }

    public String getOtrosProductos() {
        return otrosProductos;
    }

    public void setOtrosProductos(String otrosProductos) {
        this.otrosProductos = otrosProductos;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public String getScreenAnticuerpos() {
        return screenAnticuerpos;
    }

    public void setScreenAnticuerpos(String screenAnticuerpos) {
        this.screenAnticuerpos = screenAnticuerpos;
    }

    public String getPruebasCruzadas() {
        return pruebasCruzadas;
    }

    public void setPruebasCruzadas(String pruebasCruzadas) {
        this.pruebasCruzadas = pruebasCruzadas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigInteger getHjevlclnNumero() {
        return hjevlclnNumero;
    }

    public void setHjevlclnNumero(BigInteger hjevlclnNumero) {
        this.hjevlclnNumero = hjevlclnNumero;
    }

    public Long getDgnDgnId() {
        return dgnDgnId;
    }

    public void setDgnDgnId(Long dgnDgnId) {
        this.dgnDgnId = dgnDgnId;
    }

    public Date getFechaTransfusionAterior() {
        return fechaTransfusionAterior;
    }

    public void setFechaTransfusionAterior(Date fechaTransfusionAterior) {
        this.fechaTransfusionAterior = fechaTransfusionAterior;
    }

    public List<JustificacionHemoderivados> getJustificacionHemoderivadosList() {
        return justificacionHemoderivadosList;
    }

    public void setJustificacionHemoderivadosList(List<JustificacionHemoderivados> justificacionHemoderivadosList) {
        this.justificacionHemoderivadosList = justificacionHemoderivadosList;
    }

    public List<Transfusiones> getTransfusionesList() {
        return transfusionesList;
    }

    public void setTransfusionesList(List<Transfusiones> transfusionesList) {
        this.transfusionesList = transfusionesList;
    }

    public List<DetallesTransfusiones> getDetallesTransfusionesList() {
        return detallesTransfusionesList;
    }

    public void setDetallesTransfusionesList(List<DetallesTransfusiones> detallesTransfusionesList) {
        this.detallesTransfusionesList = detallesTransfusionesList;
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

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudesTransfusiones)) {
            return false;
        }
        SolicitudesTransfusiones other = (SolicitudesTransfusiones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SolicitudesTransfusiones[ numero=" + numero + " ]";
    }
    
}
