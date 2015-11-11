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
@Table(name = "INGRESOS_ACTIVOS_FIJOS")
@NamedQueries({
    @NamedQuery(name = "IngresosActivosFijos.findAll", query = "SELECT i FROM IngresosActivosFijos i")})
public class IngresosActivosFijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IngresosActivosFijosPK ingresosActivosFijosPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "MOTIVO_INGRESO")
    private String motivoIngreso;
    @Column(name = "SERIE_FACTURA")
    private String serieFactura;
    @Column(name = "NUMERO_FACTURA")
    private BigInteger numeroFactura;
    @Column(name = "FECHA_FACTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactura;
    @Column(name = "DIAS_PLAZO")
    private Short diasPlazo;
    @Column(name = "AUTORIZACION_SRI")
    private BigInteger autorizacionSri;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PRVACTFJO_EMP_CODIGO")
    private String prvactfjoEmpCodigo;
    @Column(name = "PRVACTFJO_CODIGO")
    private Integer prvactfjoCodigo;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "FECHA_CADUCIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCaducidad;

    public IngresosActivosFijos() {
    }

    public IngresosActivosFijos(IngresosActivosFijosPK ingresosActivosFijosPK) {
        this.ingresosActivosFijosPK = ingresosActivosFijosPK;
    }

    public IngresosActivosFijos(String empCodigo, int numero) {
        this.ingresosActivosFijosPK = new IngresosActivosFijosPK(empCodigo, numero);
    }

    public IngresosActivosFijosPK getIngresosActivosFijosPK() {
        return ingresosActivosFijosPK;
    }

    public void setIngresosActivosFijosPK(IngresosActivosFijosPK ingresosActivosFijosPK) {
        this.ingresosActivosFijosPK = ingresosActivosFijosPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivoIngreso() {
        return motivoIngreso;
    }

    public void setMotivoIngreso(String motivoIngreso) {
        this.motivoIngreso = motivoIngreso;
    }

    public String getSerieFactura() {
        return serieFactura;
    }

    public void setSerieFactura(String serieFactura) {
        this.serieFactura = serieFactura;
    }

    public BigInteger getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(BigInteger numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Short getDiasPlazo() {
        return diasPlazo;
    }

    public void setDiasPlazo(Short diasPlazo) {
        this.diasPlazo = diasPlazo;
    }

    public BigInteger getAutorizacionSri() {
        return autorizacionSri;
    }

    public void setAutorizacionSri(BigInteger autorizacionSri) {
        this.autorizacionSri = autorizacionSri;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getPrvactfjoEmpCodigo() {
        return prvactfjoEmpCodigo;
    }

    public void setPrvactfjoEmpCodigo(String prvactfjoEmpCodigo) {
        this.prvactfjoEmpCodigo = prvactfjoEmpCodigo;
    }

    public Integer getPrvactfjoCodigo() {
        return prvactfjoCodigo;
    }

    public void setPrvactfjoCodigo(Integer prvactfjoCodigo) {
        this.prvactfjoCodigo = prvactfjoCodigo;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ingresosActivosFijosPK != null ? ingresosActivosFijosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngresosActivosFijos)) {
            return false;
        }
        IngresosActivosFijos other = (IngresosActivosFijos) object;
        if ((this.ingresosActivosFijosPK == null && other.ingresosActivosFijosPK != null) || (this.ingresosActivosFijosPK != null && !this.ingresosActivosFijosPK.equals(other.ingresosActivosFijosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.IngresosActivosFijos[ ingresosActivosFijosPK=" + ingresosActivosFijosPK + " ]";
    }
    
}
