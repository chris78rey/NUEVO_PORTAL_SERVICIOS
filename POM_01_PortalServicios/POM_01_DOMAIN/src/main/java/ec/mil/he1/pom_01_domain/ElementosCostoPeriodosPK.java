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
public class ElementosCostoPeriodosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ELMCST_NUMERO")
    private int elmcstNumero;
    @Basic(optional = false)
    @Column(name = "PRD_NUMERO")
    private int prdNumero;

    public ElementosCostoPeriodosPK() {
    }

    public ElementosCostoPeriodosPK(int elmcstNumero, int prdNumero) {
        this.elmcstNumero = elmcstNumero;
        this.prdNumero = prdNumero;
    }

    public int getElmcstNumero() {
        return elmcstNumero;
    }

    public void setElmcstNumero(int elmcstNumero) {
        this.elmcstNumero = elmcstNumero;
    }

    public int getPrdNumero() {
        return prdNumero;
    }

    public void setPrdNumero(int prdNumero) {
        this.prdNumero = prdNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) elmcstNumero;
        hash += (int) prdNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElementosCostoPeriodosPK)) {
            return false;
        }
        ElementosCostoPeriodosPK other = (ElementosCostoPeriodosPK) object;
        if (this.elmcstNumero != other.elmcstNumero) {
            return false;
        }
        if (this.prdNumero != other.prdNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ElementosCostoPeriodosPK[ elmcstNumero=" + elmcstNumero + ", prdNumero=" + prdNumero + " ]";
    }
    
}
