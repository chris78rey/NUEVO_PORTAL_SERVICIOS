/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @Column(name = "PRSMDC_DPR_ARA_CODIGO")
    private String prsmdcDprAraCodigo;
    @Column(name = "FECHA_PRESCRIPCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPrescripcion;
    @Column(name = "PRSMDC_DPR_CODIGO")
    private String prsmdcDprCodigo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Column(name = "ITM_CODIGO")
    private Short itmCodigo;
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
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DSCBTC_NUMERO")
    private Integer dscbtcNumero;
    @Column(name = "IDENTIFICADOR")
    private BigInteger identificador;

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

    public String getPrsmdcDprAraCodigo() {
        return prsmdcDprAraCodigo;
    }

    public void setPrsmdcDprAraCodigo(String prsmdcDprAraCodigo) {
        this.prsmdcDprAraCodigo = prsmdcDprAraCodigo;
    }

    public Date getFechaPrescripcion() {
        return fechaPrescripcion;
    }

    public void setFechaPrescripcion(Date fechaPrescripcion) {
        this.fechaPrescripcion = fechaPrescripcion;
    }

    public String getPrsmdcDprCodigo() {
        return prsmdcDprCodigo;
    }

    public void setPrsmdcDprCodigo(String prsmdcDprCodigo) {
        this.prsmdcDprCodigo = prsmdcDprCodigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public Short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(Short itmCodigo) {
        this.itmCodigo = itmCodigo;
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

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public Integer getDscbtcNumero() {
        return dscbtcNumero;
    }

    public void setDscbtcNumero(Integer dscbtcNumero) {
        this.dscbtcNumero = dscbtcNumero;
    }

    public BigInteger getIdentificador() {
        return identificador;
    }

    public void setIdentificador(BigInteger identificador) {
        this.identificador = identificador;
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
        return "ec.mil.he1.pom_01_domain.DetallesPrescripcion[ detallesPrescripcionPK=" + detallesPrescripcionPK + " ]";
    }
    
}
