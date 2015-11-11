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
public class RegistrosObstetriciaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private int pcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public RegistrosObstetriciaPK() {
    }

    public RegistrosObstetriciaPK(int pcnNumeroHc, int numero) {
        this.pcnNumeroHc = pcnNumeroHc;
        this.numero = numero;
    }

    public int getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(int pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
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
        hash += (int) pcnNumeroHc;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrosObstetriciaPK)) {
            return false;
        }
        RegistrosObstetriciaPK other = (RegistrosObstetriciaPK) object;
        if (this.pcnNumeroHc != other.pcnNumeroHc) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RegistrosObstetriciaPK[ pcnNumeroHc=" + pcnNumeroHc + ", numero=" + numero + " ]";
    }
    
}
