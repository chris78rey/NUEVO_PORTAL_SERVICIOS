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
public class FraccionamientosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "UND_NUMERO")
    private String undNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO_FRACCION")
    private String numeroFraccion;

    public FraccionamientosPK() {
    }

    public FraccionamientosPK(String undNumero, String numeroFraccion) {
        this.undNumero = undNumero;
        this.numeroFraccion = numeroFraccion;
    }

    public String getUndNumero() {
        return undNumero;
    }

    public void setUndNumero(String undNumero) {
        this.undNumero = undNumero;
    }

    public String getNumeroFraccion() {
        return numeroFraccion;
    }

    public void setNumeroFraccion(String numeroFraccion) {
        this.numeroFraccion = numeroFraccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (undNumero != null ? undNumero.hashCode() : 0);
        hash += (numeroFraccion != null ? numeroFraccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FraccionamientosPK)) {
            return false;
        }
        FraccionamientosPK other = (FraccionamientosPK) object;
        if ((this.undNumero == null && other.undNumero != null) || (this.undNumero != null && !this.undNumero.equals(other.undNumero))) {
            return false;
        }
        if ((this.numeroFraccion == null && other.numeroFraccion != null) || (this.numeroFraccion != null && !this.numeroFraccion.equals(other.numeroFraccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.FraccionamientosPK[ undNumero=" + undNumero + ", numeroFraccion=" + numeroFraccion + " ]";
    }
    
}
