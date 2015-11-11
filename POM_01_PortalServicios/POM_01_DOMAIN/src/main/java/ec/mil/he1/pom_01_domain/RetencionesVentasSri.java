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
@Table(name = "RETENCIONES_VENTAS_SRI")
@NamedQueries({
    @NamedQuery(name = "RetencionesVentasSri.findAll", query = "SELECT r FROM RetencionesVentasSri r")})
public class RetencionesVentasSri implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RetencionesVentasSriPK retencionesVentasSriPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BASE_IMPONIBLE_RF")
    private BigDecimal baseImponibleRf;
    @Column(name = "PORCENTAJE_RF")
    private Short porcentajeRf;
    @Column(name = "VALOR_RETENIDO_RF")
    private BigDecimal valorRetenidoRf;
    @Column(name = "BASE_IMPONIBLE_NO_IVA")
    private BigDecimal baseImponibleNoIva;

    public RetencionesVentasSri() {
    }

    public RetencionesVentasSri(RetencionesVentasSriPK retencionesVentasSriPK) {
        this.retencionesVentasSriPK = retencionesVentasSriPK;
    }

    public RetencionesVentasSri(String vntsriIvaEmpCodigo, String vntsriIvaPeriodo, int vntsriNumero, String codigoRf) {
        this.retencionesVentasSriPK = new RetencionesVentasSriPK(vntsriIvaEmpCodigo, vntsriIvaPeriodo, vntsriNumero, codigoRf);
    }

    public RetencionesVentasSriPK getRetencionesVentasSriPK() {
        return retencionesVentasSriPK;
    }

    public void setRetencionesVentasSriPK(RetencionesVentasSriPK retencionesVentasSriPK) {
        this.retencionesVentasSriPK = retencionesVentasSriPK;
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

    public BigDecimal getBaseImponibleNoIva() {
        return baseImponibleNoIva;
    }

    public void setBaseImponibleNoIva(BigDecimal baseImponibleNoIva) {
        this.baseImponibleNoIva = baseImponibleNoIva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retencionesVentasSriPK != null ? retencionesVentasSriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesVentasSri)) {
            return false;
        }
        RetencionesVentasSri other = (RetencionesVentasSri) object;
        if ((this.retencionesVentasSriPK == null && other.retencionesVentasSriPK != null) || (this.retencionesVentasSriPK != null && !this.retencionesVentasSriPK.equals(other.retencionesVentasSriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RetencionesVentasSri[ retencionesVentasSriPK=" + retencionesVentasSriPK + " ]";
    }
    
}
