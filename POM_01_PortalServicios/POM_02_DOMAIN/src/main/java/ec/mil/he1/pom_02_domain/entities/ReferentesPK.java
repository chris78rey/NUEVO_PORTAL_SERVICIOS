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
public class ReferentesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private int pcnNumeroHc;

    public ReferentesPK() {
    }

    public ReferentesPK(int numero, int pcnNumeroHc) {
        this.numero = numero;
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        hash += (int) numero;
        hash += (int) pcnNumeroHc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReferentesPK)) {
            return false;
        }
        ReferentesPK other = (ReferentesPK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.pcnNumeroHc != other.pcnNumeroHc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ReferentesPK[ numero=" + numero + ", pcnNumeroHc=" + pcnNumeroHc + " ]";
    }
    
}
