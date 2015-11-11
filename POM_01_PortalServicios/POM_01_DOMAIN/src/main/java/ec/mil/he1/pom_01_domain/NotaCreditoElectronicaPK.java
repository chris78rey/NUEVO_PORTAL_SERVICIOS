/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class NotaCreditoElectronicaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NCR_CAJA")
    private String ncrCaja;
    @Basic(optional = false)
    @Column(name = "NCR_NUMERO")
    private int ncrNumero;

    public NotaCreditoElectronicaPK() {
    }

    public NotaCreditoElectronicaPK(String ncrCaja, int ncrNumero) {
        this.ncrCaja = ncrCaja;
        this.ncrNumero = ncrNumero;
    }

    public String getNcrCaja() {
        return ncrCaja;
    }

    public void setNcrCaja(String ncrCaja) {
        this.ncrCaja = ncrCaja;
    }

    public int getNcrNumero() {
        return ncrNumero;
    }

    public void setNcrNumero(int ncrNumero) {
        this.ncrNumero = ncrNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ncrCaja != null ? ncrCaja.hashCode() : 0);
        hash += (int) ncrNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaCreditoElectronicaPK)) {
            return false;
        }
        NotaCreditoElectronicaPK other = (NotaCreditoElectronicaPK) object;
        if ((this.ncrCaja == null && other.ncrCaja != null) || (this.ncrCaja != null && !this.ncrCaja.equals(other.ncrCaja))) {
            return false;
        }
        if (this.ncrNumero != other.ncrNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.NotaCreditoElectronicaPK[ ncrCaja=" + ncrCaja + ", ncrNumero=" + ncrNumero + " ]";
    }
    
}
