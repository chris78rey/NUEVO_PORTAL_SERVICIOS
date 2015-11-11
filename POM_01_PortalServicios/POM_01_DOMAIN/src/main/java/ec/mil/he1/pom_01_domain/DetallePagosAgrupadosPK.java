/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class DetallePagosAgrupadosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PGOGRP_NUMERO")
    private BigInteger pgogrpNumero;
    @Basic(optional = false)
    @Column(name = "COTCBR_NUMERO")
    private long cotcbrNumero;

    public DetallePagosAgrupadosPK() {
    }

    public DetallePagosAgrupadosPK(BigInteger pgogrpNumero, long cotcbrNumero) {
        this.pgogrpNumero = pgogrpNumero;
        this.cotcbrNumero = cotcbrNumero;
    }

    public BigInteger getPgogrpNumero() {
        return pgogrpNumero;
    }

    public void setPgogrpNumero(BigInteger pgogrpNumero) {
        this.pgogrpNumero = pgogrpNumero;
    }

    public long getCotcbrNumero() {
        return cotcbrNumero;
    }

    public void setCotcbrNumero(long cotcbrNumero) {
        this.cotcbrNumero = cotcbrNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pgogrpNumero != null ? pgogrpNumero.hashCode() : 0);
        hash += (int) cotcbrNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePagosAgrupadosPK)) {
            return false;
        }
        DetallePagosAgrupadosPK other = (DetallePagosAgrupadosPK) object;
        if ((this.pgogrpNumero == null && other.pgogrpNumero != null) || (this.pgogrpNumero != null && !this.pgogrpNumero.equals(other.pgogrpNumero))) {
            return false;
        }
        if (this.cotcbrNumero != other.cotcbrNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallePagosAgrupadosPK[ pgogrpNumero=" + pgogrpNumero + ", cotcbrNumero=" + cotcbrNumero + " ]";
    }
    
}
