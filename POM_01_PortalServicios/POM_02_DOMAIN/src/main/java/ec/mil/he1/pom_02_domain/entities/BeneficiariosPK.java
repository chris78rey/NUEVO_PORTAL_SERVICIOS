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
public class BeneficiariosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ASC_NUMERO")
    private int ascNumero;
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private int pcnNumeroHc;

    public BeneficiariosPK() {
    }

    public BeneficiariosPK(int ascNumero, int pcnNumeroHc) {
        this.ascNumero = ascNumero;
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public int getAscNumero() {
        return ascNumero;
    }

    public void setAscNumero(int ascNumero) {
        this.ascNumero = ascNumero;
    }

    public int getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(int pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ascNumero;
        hash += (int) pcnNumeroHc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeneficiariosPK)) {
            return false;
        }
        BeneficiariosPK other = (BeneficiariosPK) object;
        if (this.ascNumero != other.ascNumero) {
            return false;
        }
        if (this.pcnNumeroHc != other.pcnNumeroHc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.BeneficiariosPK[ ascNumero=" + ascNumero + ", pcnNumeroHc=" + pcnNumeroHc + " ]";
    }
    
}
