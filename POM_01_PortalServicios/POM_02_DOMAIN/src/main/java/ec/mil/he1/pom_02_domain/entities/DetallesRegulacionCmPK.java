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
public class DetallesRegulacionCmPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;
    @Basic(optional = false)
    @Column(name = "RGL_CM_NUMERO")
    private int rglCmNumero;

    public DetallesRegulacionCmPK() {
    }

    public DetallesRegulacionCmPK(int numero, int rglCmNumero) {
        this.numero = numero;
        this.rglCmNumero = rglCmNumero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getRglCmNumero() {
        return rglCmNumero;
    }

    public void setRglCmNumero(int rglCmNumero) {
        this.rglCmNumero = rglCmNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numero;
        hash += (int) rglCmNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesRegulacionCmPK)) {
            return false;
        }
        DetallesRegulacionCmPK other = (DetallesRegulacionCmPK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.rglCmNumero != other.rglCmNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesRegulacionCmPK[ numero=" + numero + ", rglCmNumero=" + rglCmNumero + " ]";
    }
    
}
