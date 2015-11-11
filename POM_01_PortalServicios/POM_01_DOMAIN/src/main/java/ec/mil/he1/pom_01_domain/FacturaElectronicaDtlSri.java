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
@Table(name = "FACTURA_ELECTRONICA_DTL_SRI")
@NamedQueries({
    @NamedQuery(name = "FacturaElectronicaDtlSri.findAll", query = "SELECT f FROM FacturaElectronicaDtlSri f")})
public class FacturaElectronicaDtlSri implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacturaElectronicaDtlSriPK facturaElectronicaDtlSriPK;
    @Column(name = "CODIGO_PRINCIPAL")
    private String codigoPrincipal;
    @Column(name = "CODIGO_AUXILIAR")
    private String codigoAuxiliar;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CANTIDAD")
    private Long cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO_UNITARIO")
    private BigDecimal precioUnitario;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "PRCTOT_SINIMP")
    private BigDecimal prctotSinimp;
    @Column(name = "DET_ADIC1_NOMBRE")
    private String detAdic1Nombre;
    @Column(name = "DET_ADIC2_NOMBRE")
    private String detAdic2Nombre;
    @Column(name = "DET_ADIC3_NOMBRE")
    private String detAdic3Nombre;
    @Column(name = "DET_ADIC1_VALOR")
    private String detAdic1Valor;
    @Column(name = "DET_ADIC2_VALOR")
    private String detAdic2Valor;
    @Column(name = "DET_ADIC3_VALOR")
    private String detAdic3Valor;

    public FacturaElectronicaDtlSri() {
    }

    public FacturaElectronicaDtlSri(FacturaElectronicaDtlSriPK facturaElectronicaDtlSriPK) {
        this.facturaElectronicaDtlSriPK = facturaElectronicaDtlSriPK;
    }

    public FacturaElectronicaDtlSri(Character dtlDocumento, long dtlNumero, int dtlDetalle, String fctCaja, int fctNumero, Character dtlSeguro) {
        this.facturaElectronicaDtlSriPK = new FacturaElectronicaDtlSriPK(dtlDocumento, dtlNumero, dtlDetalle, fctCaja, fctNumero, dtlSeguro);
    }

    public FacturaElectronicaDtlSriPK getFacturaElectronicaDtlSriPK() {
        return facturaElectronicaDtlSriPK;
    }

    public void setFacturaElectronicaDtlSriPK(FacturaElectronicaDtlSriPK facturaElectronicaDtlSriPK) {
        this.facturaElectronicaDtlSriPK = facturaElectronicaDtlSriPK;
    }

    public String getCodigoPrincipal() {
        return codigoPrincipal;
    }

    public void setCodigoPrincipal(String codigoPrincipal) {
        this.codigoPrincipal = codigoPrincipal;
    }

    public String getCodigoAuxiliar() {
        return codigoAuxiliar;
    }

    public void setCodigoAuxiliar(String codigoAuxiliar) {
        this.codigoAuxiliar = codigoAuxiliar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
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

    public BigDecimal getPrctotSinimp() {
        return prctotSinimp;
    }

    public void setPrctotSinimp(BigDecimal prctotSinimp) {
        this.prctotSinimp = prctotSinimp;
    }

    public String getDetAdic1Nombre() {
        return detAdic1Nombre;
    }

    public void setDetAdic1Nombre(String detAdic1Nombre) {
        this.detAdic1Nombre = detAdic1Nombre;
    }

    public String getDetAdic2Nombre() {
        return detAdic2Nombre;
    }

    public void setDetAdic2Nombre(String detAdic2Nombre) {
        this.detAdic2Nombre = detAdic2Nombre;
    }

    public String getDetAdic3Nombre() {
        return detAdic3Nombre;
    }

    public void setDetAdic3Nombre(String detAdic3Nombre) {
        this.detAdic3Nombre = detAdic3Nombre;
    }

    public String getDetAdic1Valor() {
        return detAdic1Valor;
    }

    public void setDetAdic1Valor(String detAdic1Valor) {
        this.detAdic1Valor = detAdic1Valor;
    }

    public String getDetAdic2Valor() {
        return detAdic2Valor;
    }

    public void setDetAdic2Valor(String detAdic2Valor) {
        this.detAdic2Valor = detAdic2Valor;
    }

    public String getDetAdic3Valor() {
        return detAdic3Valor;
    }

    public void setDetAdic3Valor(String detAdic3Valor) {
        this.detAdic3Valor = detAdic3Valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturaElectronicaDtlSriPK != null ? facturaElectronicaDtlSriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaElectronicaDtlSri)) {
            return false;
        }
        FacturaElectronicaDtlSri other = (FacturaElectronicaDtlSri) object;
        if ((this.facturaElectronicaDtlSriPK == null && other.facturaElectronicaDtlSriPK != null) || (this.facturaElectronicaDtlSriPK != null && !this.facturaElectronicaDtlSriPK.equals(other.facturaElectronicaDtlSriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FacturaElectronicaDtlSri[ facturaElectronicaDtlSriPK=" + facturaElectronicaDtlSriPK + " ]";
    }
    
}
