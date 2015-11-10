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
public class PostAnestesicosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RGSOPR_PRTOPRSLC_NUMERO")
    private int rgsoprPrtoprslcNumero;
    @Basic(optional = false)
    @Column(name = "RGSOPR_PRTOPRSLC_PCN_NUMERO_HC")
    private int rgsoprPrtoprslcPcnNumeroHc;

    public PostAnestesicosPK() {
    }

    public PostAnestesicosPK(int rgsoprPrtoprslcNumero, int rgsoprPrtoprslcPcnNumeroHc) {
        this.rgsoprPrtoprslcNumero = rgsoprPrtoprslcNumero;
        this.rgsoprPrtoprslcPcnNumeroHc = rgsoprPrtoprslcPcnNumeroHc;
    }

    public int getRgsoprPrtoprslcNumero() {
        return rgsoprPrtoprslcNumero;
    }

    public void setRgsoprPrtoprslcNumero(int rgsoprPrtoprslcNumero) {
        this.rgsoprPrtoprslcNumero = rgsoprPrtoprslcNumero;
    }

    public int getRgsoprPrtoprslcPcnNumeroHc() {
        return rgsoprPrtoprslcPcnNumeroHc;
    }

    public void setRgsoprPrtoprslcPcnNumeroHc(int rgsoprPrtoprslcPcnNumeroHc) {
        this.rgsoprPrtoprslcPcnNumeroHc = rgsoprPrtoprslcPcnNumeroHc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rgsoprPrtoprslcNumero;
        hash += (int) rgsoprPrtoprslcPcnNumeroHc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostAnestesicosPK)) {
            return false;
        }
        PostAnestesicosPK other = (PostAnestesicosPK) object;
        if (this.rgsoprPrtoprslcNumero != other.rgsoprPrtoprslcNumero) {
            return false;
        }
        if (this.rgsoprPrtoprslcPcnNumeroHc != other.rgsoprPrtoprslcPcnNumeroHc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PostAnestesicosPK[ rgsoprPrtoprslcNumero=" + rgsoprPrtoprslcNumero + ", rgsoprPrtoprslcPcnNumeroHc=" + rgsoprPrtoprslcPcnNumeroHc + " ]";
    }
    
}
