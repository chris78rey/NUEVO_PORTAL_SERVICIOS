/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DTLIMP_FACTURA_ELECTRONICA_SRI")
@NamedQueries({
    @NamedQuery(name = "DtlimpFacturaElectronicaSri.findAll", query = "SELECT d FROM DtlimpFacturaElectronicaSri d")})
public class DtlimpFacturaElectronicaSri implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private BigDecimal numero;
    @Column(name = "DTL_DOCUMENTO")
    private Character dtlDocumento;
    @Column(name = "DTL_NUMERO")
    private Long dtlNumero;
    @Column(name = "DTL_DETALLE")
    private Integer dtlDetalle;
    @Column(name = "DTL_SEGURO")
    private Character dtlSeguro;
    @Column(name = "CODIGO")
    private Short codigo;
    @Column(name = "CODIGO_PORCENTAJE")
    private Short codigoPorcentaje;
    @Column(name = "TARIFA")
    private BigDecimal tarifa;
    @Column(name = "BASE_IMPONIBLE")
    private BigDecimal baseImponible;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "FCT_CAJA")
    private String fctCaja;
    @Column(name = "FCT_NUMERO")
    private Integer fctNumero;

    public DtlimpFacturaElectronicaSri() {
    }

    public DtlimpFacturaElectronicaSri(BigDecimal numero) {
        this.numero = numero;
    }

    public BigDecimal getNumero() {
        return numero;
    }

    public void setNumero(BigDecimal numero) {
        this.numero = numero;
    }

    public Character getDtlDocumento() {
        return dtlDocumento;
    }

    public void setDtlDocumento(Character dtlDocumento) {
        this.dtlDocumento = dtlDocumento;
    }

    public Long getDtlNumero() {
        return dtlNumero;
    }

    public void setDtlNumero(Long dtlNumero) {
        this.dtlNumero = dtlNumero;
    }

    public Integer getDtlDetalle() {
        return dtlDetalle;
    }

    public void setDtlDetalle(Integer dtlDetalle) {
        this.dtlDetalle = dtlDetalle;
    }

    public Character getDtlSeguro() {
        return dtlSeguro;
    }

    public void setDtlSeguro(Character dtlSeguro) {
        this.dtlSeguro = dtlSeguro;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public Short getCodigoPorcentaje() {
        return codigoPorcentaje;
    }

    public void setCodigoPorcentaje(Short codigoPorcentaje) {
        this.codigoPorcentaje = codigoPorcentaje;
    }

    public BigDecimal getTarifa() {
        return tarifa;
    }

    public void setTarifa(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }

    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(BigDecimal baseImponible) {
        this.baseImponible = baseImponible;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getFctCaja() {
        return fctCaja;
    }

    public void setFctCaja(String fctCaja) {
        this.fctCaja = fctCaja;
    }

    public Integer getFctNumero() {
        return fctNumero;
    }

    public void setFctNumero(Integer fctNumero) {
        this.fctNumero = fctNumero;
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
        if (!(object instanceof DtlimpFacturaElectronicaSri)) {
            return false;
        }
        DtlimpFacturaElectronicaSri other = (DtlimpFacturaElectronicaSri) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DtlimpFacturaElectronicaSri[ numero=" + numero + " ]";
    }
    
}
