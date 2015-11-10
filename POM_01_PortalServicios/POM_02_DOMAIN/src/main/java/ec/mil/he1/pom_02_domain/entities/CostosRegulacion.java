/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "COSTOS_REGULACION")
@NamedQueries({
    @NamedQuery(name = "CostosRegulacion.findAll", query = "SELECT c FROM CostosRegulacion c")})
public class CostosRegulacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CostosRegulacionPK costosRegulacionPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COSTO_ACTUAL")
    private BigDecimal costoActual;
    @Column(name = "COSTO_REGULADO")
    private BigDecimal costoRegulado;
    @Column(name = "STOCK_ACTUAL")
    private BigDecimal stockActual;
    @JoinColumns({
        @JoinColumn(name = "DTLCRR_ITM_CODIGO", referencedColumnName = "ITM_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DTLCRR_ITM_SBS_CODIGO", referencedColumnName = "ITM_SBS_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DTLCRR_ITM_SBS_SCC_CODIGO", referencedColumnName = "ITM_SBS_SCC_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DTLCRR_ITM_TIPO", referencedColumnName = "ITM_TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "DTLCRR_RGTCRR_ANIO", referencedColumnName = "RGTCRR_ANIO", insertable = false, updatable = false),
        @JoinColumn(name = "DTLCRR_RGTCRR_MES", referencedColumnName = "RGTCRR_MES", insertable = false, updatable = false),
        @JoinColumn(name = "DTLCRR_RGTCRR_LOCAL", referencedColumnName = "RGTCRR_LOCAL", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DetallesDeCierre detallesDeCierre;
    @JoinColumns({
        @JoinColumn(name = "RGL_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "RGL_NUMERO", referencedColumnName = "NUMERO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Regulaciones regulaciones;

    public CostosRegulacion() {
    }

    public CostosRegulacion(CostosRegulacionPK costosRegulacionPK) {
        this.costosRegulacionPK = costosRegulacionPK;
    }

    public CostosRegulacion(short dtlcrrItmCodigo, String dtlcrrItmSbsCodigo, String dtlcrrItmSbsSccCodigo, Character dtlcrrItmTipo, short dtlcrrRgtcrrAnio, String dtlcrrRgtcrrLocal, short dtlcrrRgtcrrMes, String tipo) {
        this.costosRegulacionPK = new CostosRegulacionPK(dtlcrrItmCodigo, dtlcrrItmSbsCodigo, dtlcrrItmSbsSccCodigo, dtlcrrItmTipo, dtlcrrRgtcrrAnio, dtlcrrRgtcrrLocal, dtlcrrRgtcrrMes, tipo);
    }

    public CostosRegulacionPK getCostosRegulacionPK() {
        return costosRegulacionPK;
    }

    public void setCostosRegulacionPK(CostosRegulacionPK costosRegulacionPK) {
        this.costosRegulacionPK = costosRegulacionPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getCostoActual() {
        return costoActual;
    }

    public void setCostoActual(BigDecimal costoActual) {
        this.costoActual = costoActual;
    }

    public BigDecimal getCostoRegulado() {
        return costoRegulado;
    }

    public void setCostoRegulado(BigDecimal costoRegulado) {
        this.costoRegulado = costoRegulado;
    }

    public BigDecimal getStockActual() {
        return stockActual;
    }

    public void setStockActual(BigDecimal stockActual) {
        this.stockActual = stockActual;
    }

    public DetallesDeCierre getDetallesDeCierre() {
        return detallesDeCierre;
    }

    public void setDetallesDeCierre(DetallesDeCierre detallesDeCierre) {
        this.detallesDeCierre = detallesDeCierre;
    }

    public Regulaciones getRegulaciones() {
        return regulaciones;
    }

    public void setRegulaciones(Regulaciones regulaciones) {
        this.regulaciones = regulaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costosRegulacionPK != null ? costosRegulacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostosRegulacion)) {
            return false;
        }
        CostosRegulacion other = (CostosRegulacion) object;
        if ((this.costosRegulacionPK == null && other.costosRegulacionPK != null) || (this.costosRegulacionPK != null && !this.costosRegulacionPK.equals(other.costosRegulacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CostosRegulacion[ costosRegulacionPK=" + costosRegulacionPK + " ]";
    }
    
}
