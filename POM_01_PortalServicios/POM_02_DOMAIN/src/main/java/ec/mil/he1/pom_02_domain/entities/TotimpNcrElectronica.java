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
@Table(name = "TOTIMP_NCR_ELECTRONICA")
@NamedQueries({
    @NamedQuery(name = "TotimpNcrElectronica.findAll", query = "SELECT t FROM TotimpNcrElectronica t")})
public class TotimpNcrElectronica implements Serializable {
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
    @Column(name = "BASE_IMPONIBLE")
    private BigDecimal baseImponible;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @JoinColumns({
        @JoinColumn(name = "NCES_NCR_CAJA", referencedColumnName = "NCR_CAJA"),
        @JoinColumn(name = "NCES_NCR_NUMERO", referencedColumnName = "NCR_NUMERO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private NotaCreditoElectronica notaCreditoElectronica;

    public TotimpNcrElectronica() {
    }

    public TotimpNcrElectronica(BigDecimal numero) {
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

    public NotaCreditoElectronica getNotaCreditoElectronica() {
        return notaCreditoElectronica;
    }

    public void setNotaCreditoElectronica(NotaCreditoElectronica notaCreditoElectronica) {
        this.notaCreditoElectronica = notaCreditoElectronica;
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
        if (!(object instanceof TotimpNcrElectronica)) {
            return false;
        }
        TotimpNcrElectronica other = (TotimpNcrElectronica) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TotimpNcrElectronica[ numero=" + numero + " ]";
    }
    
}
