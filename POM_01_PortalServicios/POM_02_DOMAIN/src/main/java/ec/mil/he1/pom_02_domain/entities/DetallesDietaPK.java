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
public class DetallesDietaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private int pcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "PDDDTA_NUMERO")
    private int pdddtaNumero;

    public DetallesDietaPK() {
    }

    public DetallesDietaPK(int pcnNumeroHc, int pdddtaNumero) {
        this.pcnNumeroHc = pcnNumeroHc;
        this.pdddtaNumero = pdddtaNumero;
    }

    public int getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(int pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public int getPdddtaNumero() {
        return pdddtaNumero;
    }

    public void setPdddtaNumero(int pdddtaNumero) {
        this.pdddtaNumero = pdddtaNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pcnNumeroHc;
        hash += (int) pdddtaNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDietaPK)) {
            return false;
        }
        DetallesDietaPK other = (DetallesDietaPK) object;
        if (this.pcnNumeroHc != other.pcnNumeroHc) {
            return false;
        }
        if (this.pdddtaNumero != other.pdddtaNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesDietaPK[ pcnNumeroHc=" + pcnNumeroHc + ", pdddtaNumero=" + pdddtaNumero + " ]";
    }
    
}
