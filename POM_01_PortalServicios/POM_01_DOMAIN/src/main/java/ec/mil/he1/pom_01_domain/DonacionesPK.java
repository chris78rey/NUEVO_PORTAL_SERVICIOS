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
public class DonacionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DNN_NUMERO")
    private int dnnNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO_DONACION")
    private int numeroDonacion;

    public DonacionesPK() {
    }

    public DonacionesPK(int dnnNumero, int numeroDonacion) {
        this.dnnNumero = dnnNumero;
        this.numeroDonacion = numeroDonacion;
    }

    public int getDnnNumero() {
        return dnnNumero;
    }

    public void setDnnNumero(int dnnNumero) {
        this.dnnNumero = dnnNumero;
    }

    public int getNumeroDonacion() {
        return numeroDonacion;
    }

    public void setNumeroDonacion(int numeroDonacion) {
        this.numeroDonacion = numeroDonacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dnnNumero;
        hash += (int) numeroDonacion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DonacionesPK)) {
            return false;
        }
        DonacionesPK other = (DonacionesPK) object;
        if (this.dnnNumero != other.dnnNumero) {
            return false;
        }
        if (this.numeroDonacion != other.numeroDonacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DonacionesPK[ dnnNumero=" + dnnNumero + ", numeroDonacion=" + numeroDonacion + " ]";
    }
    
}
