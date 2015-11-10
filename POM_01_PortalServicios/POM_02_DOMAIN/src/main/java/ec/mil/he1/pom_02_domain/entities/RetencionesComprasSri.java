/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "RETENCIONES_COMPRAS_SRI")
@NamedQueries({
    @NamedQuery(name = "RetencionesComprasSri.findAll", query = "SELECT r FROM RetencionesComprasSri r")})
public class RetencionesComprasSri implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RetencionesComprasSriPK retencionesComprasSriPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BASE_IMPONIBLE_RF")
    private BigDecimal baseImponibleRf;
    @Column(name = "PORCENTAJE_RF")
    private Short porcentajeRf;
    @Column(name = "VALOR_RETENIDO_RF")
    private BigDecimal valorRetenidoRf;
    @Column(name = "BASE_IMPONIBLE_IVA")
    private BigDecimal baseImponibleIva;
    @Column(name = "BASE_IMPONIBLE_CERO")
    private BigDecimal baseImponibleCero;
    @Column(name = "BASE_IMPONIBLE_NO_IVA")
    private BigDecimal baseImponibleNoIva;
    @JoinColumns({
        @JoinColumn(name = "CMPNCNDSRI_IVA_EMP_CODIGO", referencedColumnName = "IVA_EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "CMPNCNDSRI_IVA_PERIODO", referencedColumnName = "IVA_PERIODO", insertable = false, updatable = false),
        @JoinColumn(name = "CMPNCNDSRI_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ComprasNcNdSri comprasNcNdSri;

    public RetencionesComprasSri() {
    }

    public RetencionesComprasSri(RetencionesComprasSriPK retencionesComprasSriPK) {
        this.retencionesComprasSriPK = retencionesComprasSriPK;
    }

    public RetencionesComprasSri(String cmpncndsriIvaEmpCodigo, String cmpncndsriIvaPeriodo, int cmpncndsriNumero, String codigoRf) {
        this.retencionesComprasSriPK = new RetencionesComprasSriPK(cmpncndsriIvaEmpCodigo, cmpncndsriIvaPeriodo, cmpncndsriNumero, codigoRf);
    }

    public RetencionesComprasSriPK getRetencionesComprasSriPK() {
        return retencionesComprasSriPK;
    }

    public void setRetencionesComprasSriPK(RetencionesComprasSriPK retencionesComprasSriPK) {
        this.retencionesComprasSriPK = retencionesComprasSriPK;
    }

    public BigDecimal getBaseImponibleRf() {
        return baseImponibleRf;
    }

    public void setBaseImponibleRf(BigDecimal baseImponibleRf) {
        this.baseImponibleRf = baseImponibleRf;
    }

    public Short getPorcentajeRf() {
        return porcentajeRf;
    }

    public void setPorcentajeRf(Short porcentajeRf) {
        this.porcentajeRf = porcentajeRf;
    }

    public BigDecimal getValorRetenidoRf() {
        return valorRetenidoRf;
    }

    public void setValorRetenidoRf(BigDecimal valorRetenidoRf) {
        this.valorRetenidoRf = valorRetenidoRf;
    }

    public BigDecimal getBaseImponibleIva() {
        return baseImponibleIva;
    }

    public void setBaseImponibleIva(BigDecimal baseImponibleIva) {
        this.baseImponibleIva = baseImponibleIva;
    }

    public BigDecimal getBaseImponibleCero() {
        return baseImponibleCero;
    }

    public void setBaseImponibleCero(BigDecimal baseImponibleCero) {
        this.baseImponibleCero = baseImponibleCero;
    }

    public BigDecimal getBaseImponibleNoIva() {
        return baseImponibleNoIva;
    }

    public void setBaseImponibleNoIva(BigDecimal baseImponibleNoIva) {
        this.baseImponibleNoIva = baseImponibleNoIva;
    }

    public ComprasNcNdSri getComprasNcNdSri() {
        return comprasNcNdSri;
    }

    public void setComprasNcNdSri(ComprasNcNdSri comprasNcNdSri) {
        this.comprasNcNdSri = comprasNcNdSri;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retencionesComprasSriPK != null ? retencionesComprasSriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesComprasSri)) {
            return false;
        }
        RetencionesComprasSri other = (RetencionesComprasSri) object;
        if ((this.retencionesComprasSriPK == null && other.retencionesComprasSriPK != null) || (this.retencionesComprasSriPK != null && !this.retencionesComprasSriPK.equals(other.retencionesComprasSriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RetencionesComprasSri[ retencionesComprasSriPK=" + retencionesComprasSriPK + " ]";
    }
    
}
