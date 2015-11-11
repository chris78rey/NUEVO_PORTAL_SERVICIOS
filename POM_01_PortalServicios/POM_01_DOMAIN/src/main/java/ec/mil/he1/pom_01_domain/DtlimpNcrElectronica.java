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
@Table(name = "DTLIMP_NCR_ELECTRONICA")
@NamedQueries({
    @NamedQuery(name = "DtlimpNcrElectronica.findAll", query = "SELECT d FROM DtlimpNcrElectronica d")})
public class DtlimpNcrElectronica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "NCL_NCES_NCR_CAJA")
    private String nclNcesNcrCaja;
    @Column(name = "NCL_NCES_NCR_NUMERO")
    private Integer nclNcesNcrNumero;
    @Column(name = "NCL_DTLFCT_DOCUMENTO")
    private Character nclDtlfctDocumento;
    @Column(name = "NCL_DTLFCT_NUMERO")
    private Long nclDtlfctNumero;
    @Column(name = "NCL_DTLFCT_DETALLE")
    private Integer nclDtlfctDetalle;
    @Column(name = "NCL_DTLFCT_SEGURO")
    private Character nclDtlfctSeguro;
    @Column(name = "CODIGO")
    private Short codigo;
    @Column(name = "CODIGO_PORCENTAJE")
    private Short codigoPorcentaje;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TARIFA")
    private BigDecimal tarifa;
    @Column(name = "BASE_IMPONIBLE")
    private BigDecimal baseImponible;
    @Column(name = "VALOR")
    private BigDecimal valor;

    public DtlimpNcrElectronica() {
    }

    public DtlimpNcrElectronica(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNclNcesNcrCaja() {
        return nclNcesNcrCaja;
    }

    public void setNclNcesNcrCaja(String nclNcesNcrCaja) {
        this.nclNcesNcrCaja = nclNcesNcrCaja;
    }

    public Integer getNclNcesNcrNumero() {
        return nclNcesNcrNumero;
    }

    public void setNclNcesNcrNumero(Integer nclNcesNcrNumero) {
        this.nclNcesNcrNumero = nclNcesNcrNumero;
    }

    public Character getNclDtlfctDocumento() {
        return nclDtlfctDocumento;
    }

    public void setNclDtlfctDocumento(Character nclDtlfctDocumento) {
        this.nclDtlfctDocumento = nclDtlfctDocumento;
    }

    public Long getNclDtlfctNumero() {
        return nclDtlfctNumero;
    }

    public void setNclDtlfctNumero(Long nclDtlfctNumero) {
        this.nclDtlfctNumero = nclDtlfctNumero;
    }

    public Integer getNclDtlfctDetalle() {
        return nclDtlfctDetalle;
    }

    public void setNclDtlfctDetalle(Integer nclDtlfctDetalle) {
        this.nclDtlfctDetalle = nclDtlfctDetalle;
    }

    public Character getNclDtlfctSeguro() {
        return nclDtlfctSeguro;
    }

    public void setNclDtlfctSeguro(Character nclDtlfctSeguro) {
        this.nclDtlfctSeguro = nclDtlfctSeguro;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DtlimpNcrElectronica)) {
            return false;
        }
        DtlimpNcrElectronica other = (DtlimpNcrElectronica) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DtlimpNcrElectronica[ numero=" + numero + " ]";
    }
    
}
