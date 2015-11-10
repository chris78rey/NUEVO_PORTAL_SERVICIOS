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
public class DetallesTransfusionFinalesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FRC_UND_NUMERO")
    private String frcUndNumero;
    @Basic(optional = false)
    @Column(name = "FRC_NUMERO_FRACCION")
    private String frcNumeroFraccion;
    @Basic(optional = false)
    @Column(name = "TRS_NUMERO")
    private int trsNumero;

    public DetallesTransfusionFinalesPK() {
    }

    public DetallesTransfusionFinalesPK(String frcUndNumero, String frcNumeroFraccion, int trsNumero) {
        this.frcUndNumero = frcUndNumero;
        this.frcNumeroFraccion = frcNumeroFraccion;
        this.trsNumero = trsNumero;
    }

    public String getFrcUndNumero() {
        return frcUndNumero;
    }

    public void setFrcUndNumero(String frcUndNumero) {
        this.frcUndNumero = frcUndNumero;
    }

    public String getFrcNumeroFraccion() {
        return frcNumeroFraccion;
    }

    public void setFrcNumeroFraccion(String frcNumeroFraccion) {
        this.frcNumeroFraccion = frcNumeroFraccion;
    }

    public int getTrsNumero() {
        return trsNumero;
    }

    public void setTrsNumero(int trsNumero) {
        this.trsNumero = trsNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (frcUndNumero != null ? frcUndNumero.hashCode() : 0);
        hash += (frcNumeroFraccion != null ? frcNumeroFraccion.hashCode() : 0);
        hash += (int) trsNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesTransfusionFinalesPK)) {
            return false;
        }
        DetallesTransfusionFinalesPK other = (DetallesTransfusionFinalesPK) object;
        if ((this.frcUndNumero == null && other.frcUndNumero != null) || (this.frcUndNumero != null && !this.frcUndNumero.equals(other.frcUndNumero))) {
            return false;
        }
        if ((this.frcNumeroFraccion == null && other.frcNumeroFraccion != null) || (this.frcNumeroFraccion != null && !this.frcNumeroFraccion.equals(other.frcNumeroFraccion))) {
            return false;
        }
        if (this.trsNumero != other.trsNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesTransfusionFinalesPK[ frcUndNumero=" + frcUndNumero + ", frcNumeroFraccion=" + frcNumeroFraccion + ", trsNumero=" + trsNumero + " ]";
    }
    
}
