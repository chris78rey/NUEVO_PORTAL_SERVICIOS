/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
    @JoinColumns({
        @JoinColumn(name = "FCT_CAJA", referencedColumnName = "FCT_CAJA"),
        @JoinColumn(name = "FCT_NUMERO", referencedColumnName = "FCT_NUMERO"),
        @JoinColumn(name = "DTL_DOCUMENTO", referencedColumnName = "DTL_DOCUMENTO"),
        @JoinColumn(name = "DTL_NUMERO", referencedColumnName = "DTL_NUMERO"),
        @JoinColumn(name = "DTL_DETALLE", referencedColumnName = "DTL_DETALLE"),
        @JoinColumn(name = "DTL_SEGURO", referencedColumnName = "DTL_SEGURO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private FacturaElectronicaDtlSri facturaElectronicaDtlSri;

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

    public FacturaElectronicaDtlSri getFacturaElectronicaDtlSri() {
        return facturaElectronicaDtlSri;
    }

    public void setFacturaElectronicaDtlSri(FacturaElectronicaDtlSri facturaElectronicaDtlSri) {
        this.facturaElectronicaDtlSri = facturaElectronicaDtlSri;
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
        return "ec.mil.he1.pom_02_domain.entities.DtlimpFacturaElectronicaSri[ numero=" + numero + " ]";
    }
    
}
