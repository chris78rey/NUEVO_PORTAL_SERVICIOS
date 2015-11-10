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
public class EpicrisisPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRMATN_NUMERO")
    private long prmatnNumero;
    @Basic(optional = false)
    @Column(name = "PRMATN_PCN_NUMERO_HC")
    private int prmatnPcnNumeroHc;

    public EpicrisisPK() {
    }

    public EpicrisisPK(long prmatnNumero, int prmatnPcnNumeroHc) {
        this.prmatnNumero = prmatnNumero;
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
    }

    public long getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(long prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public int getPrmatnPcnNumeroHc() {
        return prmatnPcnNumeroHc;
    }

    public void setPrmatnPcnNumeroHc(int prmatnPcnNumeroHc) {
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prmatnNumero;
        hash += (int) prmatnPcnNumeroHc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EpicrisisPK)) {
            return false;
        }
        EpicrisisPK other = (EpicrisisPK) object;
        if (this.prmatnNumero != other.prmatnNumero) {
            return false;
        }
        if (this.prmatnPcnNumeroHc != other.prmatnPcnNumeroHc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EpicrisisPK[ prmatnNumero=" + prmatnNumero + ", prmatnPcnNumeroHc=" + prmatnPcnNumeroHc + " ]";
    }
    
}
