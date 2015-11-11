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
public class ComplicacionesTransanestesicaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_PCN_NUMERO_HC")
    private int prtoprslcPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_NUMERO")
    private int prtoprslcNumero;
    @Basic(optional = false)
    @Column(name = "COMPLICACION")
    private String complicacion;

    public ComplicacionesTransanestesicaPK() {
    }

    public ComplicacionesTransanestesicaPK(int prtoprslcPcnNumeroHc, int prtoprslcNumero, String complicacion) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
        this.prtoprslcNumero = prtoprslcNumero;
        this.complicacion = complicacion;
    }

    public int getPrtoprslcPcnNumeroHc() {
        return prtoprslcPcnNumeroHc;
    }

    public void setPrtoprslcPcnNumeroHc(int prtoprslcPcnNumeroHc) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
    }

    public int getPrtoprslcNumero() {
        return prtoprslcNumero;
    }

    public void setPrtoprslcNumero(int prtoprslcNumero) {
        this.prtoprslcNumero = prtoprslcNumero;
    }

    public String getComplicacion() {
        return complicacion;
    }

    public void setComplicacion(String complicacion) {
        this.complicacion = complicacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prtoprslcPcnNumeroHc;
        hash += (int) prtoprslcNumero;
        hash += (complicacion != null ? complicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplicacionesTransanestesicaPK)) {
            return false;
        }
        ComplicacionesTransanestesicaPK other = (ComplicacionesTransanestesicaPK) object;
        if (this.prtoprslcPcnNumeroHc != other.prtoprslcPcnNumeroHc) {
            return false;
        }
        if (this.prtoprslcNumero != other.prtoprslcNumero) {
            return false;
        }
        if ((this.complicacion == null && other.complicacion != null) || (this.complicacion != null && !this.complicacion.equals(other.complicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComplicacionesTransanestesicaPK[ prtoprslcPcnNumeroHc=" + prtoprslcPcnNumeroHc + ", prtoprslcNumero=" + prtoprslcNumero + ", complicacion=" + complicacion + " ]";
    }
    
}
