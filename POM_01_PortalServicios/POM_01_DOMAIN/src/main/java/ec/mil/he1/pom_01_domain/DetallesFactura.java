/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DETALLES_FACTURA")
@NamedQueries({
    @NamedQuery(name = "DetallesFactura.findAll", query = "SELECT d FROM DetallesFactura d")})
public class DetallesFactura implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesFacturaPK detallesFacturaPK;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_ARA_CODIGO_PERTENECIENTE_A")
    private String dprAraCodigoPertenecienteA;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_CODIGO_PERTENECIENTE_A")
    private String dprCodigoPertenecienteA;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "PORCENTAJE_PROMOCION")
    private BigDecimal porcentajePromocion;
    @Column(name = "DESCUENTO_OTORGADO")
    private BigDecimal descuentoOtorgado;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "COMISION")
    private BigDecimal comision;
    @Column(name = "IVA_EXCENTO")
    private Character ivaExcento;
    @Column(name = "SEGURO")
    private Character seguro;
    @Column(name = "SERVICIO")
    private String servicio;

    public DetallesFactura() {
    }

    public DetallesFactura(DetallesFacturaPK detallesFacturaPK) {
        this.detallesFacturaPK = detallesFacturaPK;
    }

    public DetallesFactura(String fctCaja, Character documento, long numero, int detalle, int fctNumero) {
        this.detallesFacturaPK = new DetallesFacturaPK(fctCaja, documento, numero, detalle, fctNumero);
    }

    public DetallesFacturaPK getDetallesFacturaPK() {
        return detallesFacturaPK;
    }

    public void setDetallesFacturaPK(DetallesFacturaPK detallesFacturaPK) {
        this.detallesFacturaPK = detallesFacturaPK;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprAraCodigoPertenecienteA() {
        return dprAraCodigoPertenecienteA;
    }

    public void setDprAraCodigoPertenecienteA(String dprAraCodigoPertenecienteA) {
        this.dprAraCodigoPertenecienteA = dprAraCodigoPertenecienteA;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprCodigoPertenecienteA() {
        return dprCodigoPertenecienteA;
    }

    public void setDprCodigoPertenecienteA(String dprCodigoPertenecienteA) {
        this.dprCodigoPertenecienteA = dprCodigoPertenecienteA;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getPorcentajePromocion() {
        return porcentajePromocion;
    }

    public void setPorcentajePromocion(BigDecimal porcentajePromocion) {
        this.porcentajePromocion = porcentajePromocion;
    }

    public BigDecimal getDescuentoOtorgado() {
        return descuentoOtorgado;
    }

    public void setDescuentoOtorgado(BigDecimal descuentoOtorgado) {
        this.descuentoOtorgado = descuentoOtorgado;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getComision() {
        return comision;
    }

    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    public Character getIvaExcento() {
        return ivaExcento;
    }

    public void setIvaExcento(Character ivaExcento) {
        this.ivaExcento = ivaExcento;
    }

    public Character getSeguro() {
        return seguro;
    }

    public void setSeguro(Character seguro) {
        this.seguro = seguro;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesFacturaPK != null ? detallesFacturaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesFactura)) {
            return false;
        }
        DetallesFactura other = (DetallesFactura) object;
        if ((this.detallesFacturaPK == null && other.detallesFacturaPK != null) || (this.detallesFacturaPK != null && !this.detallesFacturaPK.equals(other.detallesFacturaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesFactura[ detallesFacturaPK=" + detallesFacturaPK + " ]";
    }
    
}
