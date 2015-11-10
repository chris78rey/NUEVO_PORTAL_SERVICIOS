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
public class CostosAdicionalesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ELMCSTPRD_ELMCST_NUMERO")
    private int elmcstprdElmcstNumero;
    @Basic(optional = false)
    @Column(name = "ELMCSTPRD_PRD_NUMERO")
    private int elmcstprdPrdNumero;
    @Basic(optional = false)
    @Column(name = "COSTO_ADICIONAL")
    private String costoAdicional;

    public CostosAdicionalesPK() {
    }

    public CostosAdicionalesPK(int elmcstprdElmcstNumero, int elmcstprdPrdNumero, String costoAdicional) {
        this.elmcstprdElmcstNumero = elmcstprdElmcstNumero;
        this.elmcstprdPrdNumero = elmcstprdPrdNumero;
        this.costoAdicional = costoAdicional;
    }

    public int getElmcstprdElmcstNumero() {
        return elmcstprdElmcstNumero;
    }

    public void setElmcstprdElmcstNumero(int elmcstprdElmcstNumero) {
        this.elmcstprdElmcstNumero = elmcstprdElmcstNumero;
    }

    public int getElmcstprdPrdNumero() {
        return elmcstprdPrdNumero;
    }

    public void setElmcstprdPrdNumero(int elmcstprdPrdNumero) {
        this.elmcstprdPrdNumero = elmcstprdPrdNumero;
    }

    public String getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(String costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) elmcstprdElmcstNumero;
        hash += (int) elmcstprdPrdNumero;
        hash += (costoAdicional != null ? costoAdicional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostosAdicionalesPK)) {
            return false;
        }
        CostosAdicionalesPK other = (CostosAdicionalesPK) object;
        if (this.elmcstprdElmcstNumero != other.elmcstprdElmcstNumero) {
            return false;
        }
        if (this.elmcstprdPrdNumero != other.elmcstprdPrdNumero) {
            return false;
        }
        if ((this.costoAdicional == null && other.costoAdicional != null) || (this.costoAdicional != null && !this.costoAdicional.equals(other.costoAdicional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CostosAdicionalesPK[ elmcstprdElmcstNumero=" + elmcstprdElmcstNumero + ", elmcstprdPrdNumero=" + elmcstprdPrdNumero + ", costoAdicional=" + costoAdicional + " ]";
    }
    
}
