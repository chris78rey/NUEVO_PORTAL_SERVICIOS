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
public class InformacionesAnestesicasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_PCN_NUMERO_HC")
    private int prtoprslcPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_NUMERO")
    private int prtoprslcNumero;

    public InformacionesAnestesicasPK() {
    }

    public InformacionesAnestesicasPK(int prtoprslcPcnNumeroHc, int prtoprslcNumero) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
        this.prtoprslcNumero = prtoprslcNumero;
    }

    public int getPrtoprslcPcnNumeroHc() {
        return prtoprslcPcnNumeroHc;
    }

    public void setPrtoprslcPcnNumeroHc(int prtoprslcPcnNumeroHc) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
    }

    public int getPrtoprslcNumero() {
        return prtoprslcNumero;
    }

    public void setPrtoprslcNumero(int prtoprslcNumero) {
        this.prtoprslcNumero = prtoprslcNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prtoprslcPcnNumeroHc;
        hash += (int) prtoprslcNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionesAnestesicasPK)) {
            return false;
        }
        InformacionesAnestesicasPK other = (InformacionesAnestesicasPK) object;
        if (this.prtoprslcPcnNumeroHc != other.prtoprslcPcnNumeroHc) {
            return false;
        }
        if (this.prtoprslcNumero != other.prtoprslcNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.InformacionesAnestesicasPK[ prtoprslcPcnNumeroHc=" + prtoprslcPcnNumeroHc + ", prtoprslcNumero=" + prtoprslcNumero + " ]";
    }
    
}
