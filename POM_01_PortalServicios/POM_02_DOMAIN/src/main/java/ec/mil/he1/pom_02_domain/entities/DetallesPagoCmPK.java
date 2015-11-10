/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class DetallesPagoCmPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PGS_CM_NUMERO")
    private int pgsCmNumero;
    @Basic(optional = false)
    @Column(name = "DTLHNRMDC_NUMERO")
    private int dtlhnrmdcNumero;

    public DetallesPagoCmPK() {
    }

    public DetallesPagoCmPK(int pgsCmNumero, int dtlhnrmdcNumero) {
        this.pgsCmNumero = pgsCmNumero;
        this.dtlhnrmdcNumero = dtlhnrmdcNumero;
    }

    public int getPgsCmNumero() {
        return pgsCmNumero;
    }

    public void setPgsCmNumero(int pgsCmNumero) {
        this.pgsCmNumero = pgsCmNumero;
    }

    public int getDtlhnrmdcNumero() {
        return dtlhnrmdcNumero;
    }

    public void setDtlhnrmdcNumero(int dtlhnrmdcNumero) {
        this.dtlhnrmdcNumero = dtlhnrmdcNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pgsCmNumero;
        hash += (int) dtlhnrmdcNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPagoCmPK)) {
            return false;
        }
        DetallesPagoCmPK other = (DetallesPagoCmPK) object;
        if (this.pgsCmNumero != other.pgsCmNumero) {
            return false;
        }
        if (this.dtlhnrmdcNumero != other.dtlhnrmdcNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesPagoCmPK[ pgsCmNumero=" + pgsCmNumero + ", dtlhnrmdcNumero=" + dtlhnrmdcNumero + " ]";
    }
    
}
