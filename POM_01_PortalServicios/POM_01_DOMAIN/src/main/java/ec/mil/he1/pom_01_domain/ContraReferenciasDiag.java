/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CONTRA_REFERENCIAS_DIAG")
@NamedQueries({
    @NamedQuery(name = "ContraReferenciasDiag.findAll", query = "SELECT c FROM ContraReferenciasDiag c")})
public class ContraReferenciasDiag implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContraReferenciasDiagPK contraReferenciasDiagPK;

    public ContraReferenciasDiag() {
    }

    public ContraReferenciasDiag(ContraReferenciasDiagPK contraReferenciasDiagPK) {
        this.contraReferenciasDiagPK = contraReferenciasDiagPK;
    }

    public ContraReferenciasDiag(long dgnpcnDgnpcnId, int cntrfrNumero) {
        this.contraReferenciasDiagPK = new ContraReferenciasDiagPK(dgnpcnDgnpcnId, cntrfrNumero);
    }

    public ContraReferenciasDiagPK getContraReferenciasDiagPK() {
        return contraReferenciasDiagPK;
    }

    public void setContraReferenciasDiagPK(ContraReferenciasDiagPK contraReferenciasDiagPK) {
        this.contraReferenciasDiagPK = contraReferenciasDiagPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contraReferenciasDiagPK != null ? contraReferenciasDiagPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContraReferenciasDiag)) {
            return false;
        }
        ContraReferenciasDiag other = (ContraReferenciasDiag) object;
        if ((this.contraReferenciasDiagPK == null && other.contraReferenciasDiagPK != null) || (this.contraReferenciasDiagPK != null && !this.contraReferenciasDiagPK.equals(other.contraReferenciasDiagPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ContraReferenciasDiag[ contraReferenciasDiagPK=" + contraReferenciasDiagPK + " ]";
    }
    
}
