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
public class ContraReferenciasDiagPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DGNPCN_DGNPCN_ID")
    private long dgnpcnDgnpcnId;
    @Basic(optional = false)
    @Column(name = "CNTRFR_NUMERO")
    private int cntrfrNumero;

    public ContraReferenciasDiagPK() {
    }

    public ContraReferenciasDiagPK(long dgnpcnDgnpcnId, int cntrfrNumero) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
        this.cntrfrNumero = cntrfrNumero;
    }

    public long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public int getCntrfrNumero() {
        return cntrfrNumero;
    }

    public void setCntrfrNumero(int cntrfrNumero) {
        this.cntrfrNumero = cntrfrNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dgnpcnDgnpcnId;
        hash += (int) cntrfrNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContraReferenciasDiagPK)) {
            return false;
        }
        ContraReferenciasDiagPK other = (ContraReferenciasDiagPK) object;
        if (this.dgnpcnDgnpcnId != other.dgnpcnDgnpcnId) {
            return false;
        }
        if (this.cntrfrNumero != other.cntrfrNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ContraReferenciasDiagPK[ dgnpcnDgnpcnId=" + dgnpcnDgnpcnId + ", cntrfrNumero=" + cntrfrNumero + " ]";
    }
    
}
