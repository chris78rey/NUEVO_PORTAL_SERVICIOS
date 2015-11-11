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
public class ExcretasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FCHSCL_NUMERO")
    private int fchsclNumero;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;

    public ExcretasPK() {
    }

    public ExcretasPK(int fchsclNumero, String tipo) {
        this.fchsclNumero = fchsclNumero;
        this.tipo = tipo;
    }

    public int getFchsclNumero() {
        return fchsclNumero;
    }

    public void setFchsclNumero(int fchsclNumero) {
        this.fchsclNumero = fchsclNumero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fchsclNumero;
        hash += (tipo != null ? tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcretasPK)) {
            return false;
        }
        ExcretasPK other = (ExcretasPK) object;
        if (this.fchsclNumero != other.fchsclNumero) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ExcretasPK[ fchsclNumero=" + fchsclNumero + ", tipo=" + tipo + " ]";
    }
    
}
