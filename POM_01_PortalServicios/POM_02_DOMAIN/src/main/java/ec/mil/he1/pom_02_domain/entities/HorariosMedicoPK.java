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
public class HorariosMedicoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public HorariosMedicoPK() {
    }

    public HorariosMedicoPK(String prsCodigo, int numero) {
        this.prsCodigo = prsCodigo;
        this.numero = numero;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
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
        hash += (prsCodigo != null ? prsCodigo.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorariosMedicoPK)) {
            return false;
        }
        HorariosMedicoPK other = (HorariosMedicoPK) object;
        if ((this.prsCodigo == null && other.prsCodigo != null) || (this.prsCodigo != null && !this.prsCodigo.equals(other.prsCodigo))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.HorariosMedicoPK[ prsCodigo=" + prsCodigo + ", numero=" + numero + " ]";
    }
    
}
