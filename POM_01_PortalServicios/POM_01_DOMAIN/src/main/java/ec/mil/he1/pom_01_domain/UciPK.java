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
public class UciPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EPC_PRMATN_NUMERO")
    private int epcPrmatnNumero;
    @Basic(optional = false)
    @Column(name = "EPC_PRMATN_PCN_NUMERO_HC")
    private int epcPrmatnPcnNumeroHc;

    public UciPK() {
    }

    public UciPK(int epcPrmatnNumero, int epcPrmatnPcnNumeroHc) {
        this.epcPrmatnNumero = epcPrmatnNumero;
        this.epcPrmatnPcnNumeroHc = epcPrmatnPcnNumeroHc;
    }

    public int getEpcPrmatnNumero() {
        return epcPrmatnNumero;
    }

    public void setEpcPrmatnNumero(int epcPrmatnNumero) {
        this.epcPrmatnNumero = epcPrmatnNumero;
    }

    public int getEpcPrmatnPcnNumeroHc() {
        return epcPrmatnPcnNumeroHc;
    }

    public void setEpcPrmatnPcnNumeroHc(int epcPrmatnPcnNumeroHc) {
        this.epcPrmatnPcnNumeroHc = epcPrmatnPcnNumeroHc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) epcPrmatnNumero;
        hash += (int) epcPrmatnPcnNumeroHc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UciPK)) {
            return false;
        }
        UciPK other = (UciPK) object;
        if (this.epcPrmatnNumero != other.epcPrmatnNumero) {
            return false;
        }
        if (this.epcPrmatnPcnNumeroHc != other.epcPrmatnPcnNumeroHc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.UciPK[ epcPrmatnNumero=" + epcPrmatnNumero + ", epcPrmatnPcnNumeroHc=" + epcPrmatnPcnNumeroHc + " ]";
    }
    
}
