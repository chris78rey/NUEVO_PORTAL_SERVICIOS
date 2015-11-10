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
public class FacturasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;
    @Basic(optional = false)
    @Column(name = "CAJA")
    private String caja;

    public FacturasPK() {
    }

    public FacturasPK(int numero, String caja) {
        this.numero = numero;
        this.caja = caja;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numero;
        hash += (caja != null ? caja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturasPK)) {
            return false;
        }
        FacturasPK other = (FacturasPK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.caja == null && other.caja != null) || (this.caja != null && !this.caja.equals(other.caja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.FacturasPK[ numero=" + numero + ", caja=" + caja + " ]";
    }
    
}
