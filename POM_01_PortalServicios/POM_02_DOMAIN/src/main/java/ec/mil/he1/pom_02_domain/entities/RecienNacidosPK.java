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
public class RecienNacidosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RGSOBS_PCN_NUMERO_HC")
    private int rgsobsPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "RGSOBS_NUMERO")
    private int rgsobsNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public RecienNacidosPK() {
    }

    public RecienNacidosPK(int rgsobsPcnNumeroHc, int rgsobsNumero, int numero) {
        this.rgsobsPcnNumeroHc = rgsobsPcnNumeroHc;
        this.rgsobsNumero = rgsobsNumero;
        this.numero = numero;
    }

    public int getRgsobsPcnNumeroHc() {
        return rgsobsPcnNumeroHc;
    }

    public void setRgsobsPcnNumeroHc(int rgsobsPcnNumeroHc) {
        this.rgsobsPcnNumeroHc = rgsobsPcnNumeroHc;
    }

    public int getRgsobsNumero() {
        return rgsobsNumero;
    }

    public void setRgsobsNumero(int rgsobsNumero) {
        this.rgsobsNumero = rgsobsNumero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rgsobsPcnNumeroHc;
        hash += (int) rgsobsNumero;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecienNacidosPK)) {
            return false;
        }
        RecienNacidosPK other = (RecienNacidosPK) object;
        if (this.rgsobsPcnNumeroHc != other.rgsobsPcnNumeroHc) {
            return false;
        }
        if (this.rgsobsNumero != other.rgsobsNumero) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RecienNacidosPK[ rgsobsPcnNumeroHc=" + rgsobsPcnNumeroHc + ", rgsobsNumero=" + rgsobsNumero + ", numero=" + numero + " ]";
    }
    
}
