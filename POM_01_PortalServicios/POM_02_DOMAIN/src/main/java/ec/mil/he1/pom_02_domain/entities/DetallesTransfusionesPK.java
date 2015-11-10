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
public class DetallesTransfusionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SLCTRN_NUMERO")
    private int slctrnNumero;
    @Basic(optional = false)
    @Column(name = "FRN_CODIGO")
    private String frnCodigo;

    public DetallesTransfusionesPK() {
    }

    public DetallesTransfusionesPK(int slctrnNumero, String frnCodigo) {
        this.slctrnNumero = slctrnNumero;
        this.frnCodigo = frnCodigo;
    }

    public int getSlctrnNumero() {
        return slctrnNumero;
    }

    public void setSlctrnNumero(int slctrnNumero) {
        this.slctrnNumero = slctrnNumero;
    }

    public String getFrnCodigo() {
        return frnCodigo;
    }

    public void setFrnCodigo(String frnCodigo) {
        this.frnCodigo = frnCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) slctrnNumero;
        hash += (frnCodigo != null ? frnCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesTransfusionesPK)) {
            return false;
        }
        DetallesTransfusionesPK other = (DetallesTransfusionesPK) object;
        if (this.slctrnNumero != other.slctrnNumero) {
            return false;
        }
        if ((this.frnCodigo == null && other.frnCodigo != null) || (this.frnCodigo != null && !this.frnCodigo.equals(other.frnCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesTransfusionesPK[ slctrnNumero=" + slctrnNumero + ", frnCodigo=" + frnCodigo + " ]";
    }
    
}
