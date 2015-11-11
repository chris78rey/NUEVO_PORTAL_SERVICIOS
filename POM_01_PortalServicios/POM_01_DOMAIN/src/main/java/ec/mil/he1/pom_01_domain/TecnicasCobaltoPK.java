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
public class TecnicasCobaltoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FCHCBL_NUMERO")
    private int fchcblNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private short numero;

    public TecnicasCobaltoPK() {
    }

    public TecnicasCobaltoPK(int fchcblNumero, short numero) {
        this.fchcblNumero = fchcblNumero;
        this.numero = numero;
    }

    public int getFchcblNumero() {
        return fchcblNumero;
    }

    public void setFchcblNumero(int fchcblNumero) {
        this.fchcblNumero = fchcblNumero;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fchcblNumero;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TecnicasCobaltoPK)) {
            return false;
        }
        TecnicasCobaltoPK other = (TecnicasCobaltoPK) object;
        if (this.fchcblNumero != other.fchcblNumero) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TecnicasCobaltoPK[ fchcblNumero=" + fchcblNumero + ", numero=" + numero + " ]";
    }
    
}
