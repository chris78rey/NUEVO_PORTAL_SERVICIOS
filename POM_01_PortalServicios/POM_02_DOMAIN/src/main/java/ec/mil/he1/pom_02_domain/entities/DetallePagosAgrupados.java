/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLE_PAGOS_AGRUPADOS")
@NamedQueries({
    @NamedQuery(name = "DetallePagosAgrupados.findAll", query = "SELECT d FROM DetallePagosAgrupados d")})
public class DetallePagosAgrupados implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallePagosAgrupadosPK detallePagosAgrupadosPK;
    @Column(name = "SALDO_CUOTA")
    private BigInteger saldoCuota;
    @JoinColumn(name = "COTCBR_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CuotasACobrar cuotasACobrar;
    @JoinColumn(name = "PGOGRP_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PagosAgrupados pagosAgrupados;

    public DetallePagosAgrupados() {
    }

    public DetallePagosAgrupados(DetallePagosAgrupadosPK detallePagosAgrupadosPK) {
        this.detallePagosAgrupadosPK = detallePagosAgrupadosPK;
    }

    public DetallePagosAgrupados(BigInteger pgogrpNumero, long cotcbrNumero) {
        this.detallePagosAgrupadosPK = new DetallePagosAgrupadosPK(pgogrpNumero, cotcbrNumero);
    }

    public DetallePagosAgrupadosPK getDetallePagosAgrupadosPK() {
        return detallePagosAgrupadosPK;
    }

    public void setDetallePagosAgrupadosPK(DetallePagosAgrupadosPK detallePagosAgrupadosPK) {
        this.detallePagosAgrupadosPK = detallePagosAgrupadosPK;
    }

    public BigInteger getSaldoCuota() {
        return saldoCuota;
    }

    public void setSaldoCuota(BigInteger saldoCuota) {
        this.saldoCuota = saldoCuota;
    }

    public CuotasACobrar getCuotasACobrar() {
        return cuotasACobrar;
    }

    public void setCuotasACobrar(CuotasACobrar cuotasACobrar) {
        this.cuotasACobrar = cuotasACobrar;
    }

    public PagosAgrupados getPagosAgrupados() {
        return pagosAgrupados;
    }

    public void setPagosAgrupados(PagosAgrupados pagosAgrupados) {
        this.pagosAgrupados = pagosAgrupados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallePagosAgrupadosPK != null ? detallePagosAgrupadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePagosAgrupados)) {
            return false;
        }
        DetallePagosAgrupados other = (DetallePagosAgrupados) object;
        if ((this.detallePagosAgrupadosPK == null && other.detallePagosAgrupadosPK != null) || (this.detallePagosAgrupadosPK != null && !this.detallePagosAgrupadosPK.equals(other.detallePagosAgrupadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallePagosAgrupados[ detallePagosAgrupadosPK=" + detallePagosAgrupadosPK + " ]";
    }
    
}
