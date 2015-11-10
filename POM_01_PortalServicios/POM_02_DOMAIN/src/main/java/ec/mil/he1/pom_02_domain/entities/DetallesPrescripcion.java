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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "DETALLES_PRESCRIPCION")
@NamedQueries({
    @NamedQuery(name = "DetallesPrescripcion.findAll", query = "SELECT d FROM DetallesPrescripcion d")})
public class DetallesPrescripcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesPrescripcionPK detallesPrescripcionPK;
    @Column(name = "FECHA_PRESCRIPCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPrescripcion;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "MEDICAMENTO")
    private String medicamento;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "VIA")
    private String via;
    @Column(name = "FRECUENCIA")
    private Short frecuencia;
    @Column(name = "UNIDAD_FRECUENCIA")
    private String unidadFrecuencia;
    @Column(name = "DURACION")
    private Integer duracion;
    @Column(name = "UNIDAD_DURACION")
    private String unidadDuracion;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "DOSIS_ADMINISTRADA")
    private BigInteger dosisAdministrada;
    @Column(name = "UNIDAD_DOSIS")
    private String unidadDosis;
    @Column(name = "DOSIS_FARMACOLOGICA")
    private BigInteger dosisFarmacologica;
    @Column(name = "IDENTIFICADOR")
    private BigInteger identificador;
    @OneToMany(mappedBy = "detallesPrescripcion", fetch = FetchType.LAZY)
    private List<MomentosCumplimiento> momentosCumplimientoList;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "DSCBTC_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private DescargosDeBotica descargosDeBotica;
    @JoinColumns({
        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "SBS_SCC_CODIGO"),
        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "SBS_CODIGO"),
        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Items items;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumns({
        @JoinColumn(name = "PRSMDC_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false),
        @JoinColumn(name = "PRSMDC_FECHA", referencedColumnName = "FECHA", insertable = false, updatable = false),
        @JoinColumn(name = "PRSMDC_DPR_ARA_CODIGO", referencedColumnName = "DPR_ARA_CODIGO"),
        @JoinColumn(name = "PRSMDC_DPR_CODIGO", referencedColumnName = "DPR_CODIGO")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PrescripcionesMedicas prescripcionesMedicas;

    public DetallesPrescripcion() {
    }

    public DetallesPrescripcion(DetallesPrescripcionPK detallesPrescripcionPK) {
        this.detallesPrescripcionPK = detallesPrescripcionPK;
    }

    public DetallesPrescripcion(int prsmdcPcnNumeroHc, Date prsmdcFecha, short numero) {
        this.detallesPrescripcionPK = new DetallesPrescripcionPK(prsmdcPcnNumeroHc, prsmdcFecha, numero);
    }

    public DetallesPrescripcionPK getDetallesPrescripcionPK() {
        return detallesPrescripcionPK;
    }

    public void setDetallesPrescripcionPK(DetallesPrescripcionPK detallesPrescripcionPK) {
        this.detallesPrescripcionPK = detallesPrescripcionPK;
    }

    public Date getFechaPrescripcion() {
        return fechaPrescripcion;
    }

    public void setFechaPrescripcion(Date fechaPrescripcion) {
        this.fechaPrescripcion = fechaPrescripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public Short getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Short frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getUnidadFrecuencia() {
        return unidadFrecuencia;
    }

    public void setUnidadFrecuencia(String unidadFrecuencia) {
        this.unidadFrecuencia = unidadFrecuencia;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getUnidadDuracion() {
        return unidadDuracion;
    }

    public void setUnidadDuracion(String unidadDuracion) {
        this.unidadDuracion = unidadDuracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getDosisAdministrada() {
        return dosisAdministrada;
    }

    public void setDosisAdministrada(BigInteger dosisAdministrada) {
        this.dosisAdministrada = dosisAdministrada;
    }

    public String getUnidadDosis() {
        return unidadDosis;
    }

    public void setUnidadDosis(String unidadDosis) {
        this.unidadDosis = unidadDosis;
    }

    public BigInteger getDosisFarmacologica() {
        return dosisFarmacologica;
    }

    public void setDosisFarmacologica(BigInteger dosisFarmacologica) {
        this.dosisFarmacologica = dosisFarmacologica;
    }

    public BigInteger getIdentificador() {
        return identificador;
    }

    public void setIdentificador(BigInteger identificador) {
        this.identificador = identificador;
    }

    public List<MomentosCumplimiento> getMomentosCumplimientoList() {
        return momentosCumplimientoList;
    }

    public void setMomentosCumplimientoList(List<MomentosCumplimiento> momentosCumplimientoList) {
        this.momentosCumplimientoList = momentosCumplimientoList;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public DescargosDeBotica getDescargosDeBotica() {
        return descargosDeBotica;
    }

    public void setDescargosDeBotica(DescargosDeBotica descargosDeBotica) {
        this.descargosDeBotica = descargosDeBotica;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public PrescripcionesMedicas getPrescripcionesMedicas() {
        return prescripcionesMedicas;
    }

    public void setPrescripcionesMedicas(PrescripcionesMedicas prescripcionesMedicas) {
        this.prescripcionesMedicas = prescripcionesMedicas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesPrescripcionPK != null ? detallesPrescripcionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPrescripcion)) {
            return false;
        }
        DetallesPrescripcion other = (DetallesPrescripcion) object;
        if ((this.detallesPrescripcionPK == null && other.detallesPrescripcionPK != null) || (this.detallesPrescripcionPK != null && !this.detallesPrescripcionPK.equals(other.detallesPrescripcionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesPrescripcion[ detallesPrescripcionPK=" + detallesPrescripcionPK + " ]";
    }
    
}
