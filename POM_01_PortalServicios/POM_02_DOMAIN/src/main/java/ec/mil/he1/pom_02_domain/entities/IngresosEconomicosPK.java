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
public class IngresosEconomicosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FCHSCL_NUMERO")
    private int fchsclNumero;
    @Basic(optional = false)
    @Column(name = "APORTANTE")
    private String aportante;

    public IngresosEconomicosPK() {
    }

    public IngresosEconomicosPK(int fchsclNumero, String aportante) {
        this.fchsclNumero = fchsclNumero;
        this.aportante = aportante;
    }

    public int getFchsclNumero() {
        return fchsclNumero;
    }

    public void setFchsclNumero(int fchsclNumero) {
        this.fchsclNumero = fchsclNumero;
    }

    public String getAportante() {
        return aportante;
    }

    public void setAportante(String aportante) {
        this.aportante = aportante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fchsclNumero;
        hash += (aportante != null ? aportante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngresosEconomicosPK)) {
            return false;
        }
        IngresosEconomicosPK other = (IngresosEconomicosPK) object;
        if (this.fchsclNumero != other.fchsclNumero) {
            return false;
        }
        if ((this.aportante == null && other.aportante != null) || (this.aportante != null && !this.aportante.equals(other.aportante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.IngresosEconomicosPK[ fchsclNumero=" + fchsclNumero + ", aportante=" + aportante + " ]";
    }
    
}
