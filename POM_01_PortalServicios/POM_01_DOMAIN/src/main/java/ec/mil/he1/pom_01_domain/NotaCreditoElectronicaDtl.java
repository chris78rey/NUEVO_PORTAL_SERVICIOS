/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "NOTA_CREDITO_ELECTRONICA_DTL")
@NamedQueries({
    @NamedQuery(name = "NotaCreditoElectronicaDtl.findAll", query = "SELECT n FROM NotaCreditoElectronicaDtl n")})
public class NotaCreditoElectronicaDtl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NotaCreditoElectronicaDtlPK notaCreditoElectronicaDtlPK;
    @Column(name = "CODIGO_INTERNO")
    private String codigoInterno;
    @Column(name = "CODIGO_ADICIONAL")
    private String codigoAdicional;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "PRECIO_UNITARIO")
    private BigDecimal precioUnitario;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "PRECIO_TOTAL_SIN_IMPUESTO")
    private BigDecimal precioTotalSinImpuesto;
    @Column(name = "DETALLE_ADICIONAL_NOMBRE1")
    private String detalleAdicionalNombre1;
    @Column(name = "DETALLE_ADICIONAL_VALOR1")
    private String detalleAdicionalValor1;
    @Column(name = "DETALLE_ADICIONAL_NOMBRE2")
    private String detalleAdicionalNombre2;
    @Column(name = "DETALLE_ADICIONAL_VALOR2")
    private String detalleAdicionalValor2;
    @Column(name = "DETALLE_ADICIONAL_NOMBRE3")
    private String detalleAdicionalNombre3;
    @Column(name = "DETALLE_ADICIONAL_VALOR3")
    private String detalleAdicionalValor3;

    public NotaCreditoElectronicaDtl() {
    }

    public NotaCreditoElectronicaDtl(NotaCreditoElectronicaDtlPK notaCreditoElectronicaDtlPK) {
        this.notaCreditoElectronicaDtlPK = notaCreditoElectronicaDtlPK;
    }

    public NotaCreditoElectronicaDtl(String ncesNcrCaja, int ncesNcrNumero, Character dtlfctDocumento, long dtlfctNumero, int dtlfctDetalle, Character dtlfctSeguro) {
        this.notaCreditoElectronicaDtlPK = new NotaCreditoElectronicaDtlPK(ncesNcrCaja, ncesNcrNumero, dtlfctDocumento, dtlfctNumero, dtlfctDetalle, dtlfctSeguro);
    }

    public NotaCreditoElectronicaDtlPK getNotaCreditoElectronicaDtlPK() {
        return notaCreditoElectronicaDtlPK;
    }

    public void setNotaCreditoElectronicaDtlPK(NotaCreditoElectronicaDtlPK notaCreditoElectronicaDtlPK) {
        this.notaCreditoElectronicaDtlPK = notaCreditoElectronicaDtlPK;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getCodigoAdicional() {
        return codigoAdicional;
    }

    public void setCodigoAdicional(String codigoAdicional) {
        this.codigoAdicional = codigoAdicional;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getPrecioTotalSinImpuesto() {
        return precioTotalSinImpuesto;
    }

    public void setPrecioTotalSinImpuesto(BigDecimal precioTotalSinImpuesto) {
        this.precioTotalSinImpuesto = precioTotalSinImpuesto;
    }

    public String getDetalleAdicionalNombre1() {
        return detalleAdicionalNombre1;
    }

    public void setDetalleAdicionalNombre1(String detalleAdicionalNombre1) {
        this.detalleAdicionalNombre1 = detalleAdicionalNombre1;
    }

    public String getDetalleAdicionalValor1() {
        return detalleAdicionalValor1;
    }

    public void setDetalleAdicionalValor1(String detalleAdicionalValor1) {
        this.detalleAdicionalValor1 = detalleAdicionalValor1;
    }

    public String getDetalleAdicionalNombre2() {
        return detalleAdicionalNombre2;
    }

    public void setDetalleAdicionalNombre2(String detalleAdicionalNombre2) {
        this.detalleAdicionalNombre2 = detalleAdicionalNombre2;
    }

    public String getDetalleAdicionalValor2() {
        return detalleAdicionalValor2;
    }

    public void setDetalleAdicionalValor2(String detalleAdicionalValor2) {
        this.detalleAdicionalValor2 = detalleAdicionalValor2;
    }

    public String getDetalleAdicionalNombre3() {
        return detalleAdicionalNombre3;
    }

    public void setDetalleAdicionalNombre3(String detalleAdicionalNombre3) {
        this.detalleAdicionalNombre3 = detalleAdicionalNombre3;
    }

    public String getDetalleAdicionalValor3() {
        return detalleAdicionalValor3;
    }

    public void setDetalleAdicionalValor3(String detalleAdicionalValor3) {
        this.detalleAdicionalValor3 = detalleAdicionalValor3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notaCreditoElectronicaDtlPK != null ? notaCreditoElectronicaDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaCreditoElectronicaDtl)) {
            return false;
        }
        NotaCreditoElectronicaDtl other = (NotaCreditoElectronicaDtl) object;
        if ((this.notaCreditoElectronicaDtlPK == null && other.notaCreditoElectronicaDtlPK != null) || (this.notaCreditoElectronicaDtlPK != null && !this.notaCreditoElectronicaDtlPK.equals(other.notaCreditoElectronicaDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.NotaCreditoElectronicaDtl[ notaCreditoElectronicaDtlPK=" + notaCreditoElectronicaDtlPK + " ]";
    }
    
}
