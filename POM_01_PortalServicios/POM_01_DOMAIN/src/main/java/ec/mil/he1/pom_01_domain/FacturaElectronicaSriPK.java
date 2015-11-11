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
public class FacturaElectronicaSriPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FCT_CAJA")
    private String fctCaja;
    @Basic(optional = false)
    @Column(name = "FCT_NUMERO")
    private int fctNumero;

    public FacturaElectronicaSriPK() {
    }

    public FacturaElectronicaSriPK(String fctCaja, int fctNumero) {
        this.fctCaja = fctCaja;
        this.fctNumero = fctNumero;
    }

    public String getFctCaja() {
        return fctCaja;
    }

    public void setFctCaja(String fctCaja) {
        this.fctCaja = fctCaja;
    }

    public int getFctNumero() {
        return fctNumero;
    }

    public void setFctNumero(int fctNumero) {
        this.fctNumero = fctNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fctCaja != null ? fctCaja.hashCode() : 0);
        hash += (int) fctNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaElectronicaSriPK)) {
            return false;
        }
        FacturaElectronicaSriPK other = (FacturaElectronicaSriPK) object;
        if ((this.fctCaja == null && other.fctCaja != null) || (this.fctCaja != null && !this.fctCaja.equals(other.fctCaja))) {
            return false;
        }
        if (this.fctNumero != other.fctNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FacturaElectronicaSriPK[ fctCaja=" + fctCaja + ", fctNumero=" + fctNumero + " ]";
    }
    
}
