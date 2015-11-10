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
public class AsientoContablePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ASC_IDASIENTO")
    private long ascIdasiento;
    @Basic(optional = false)
    @Column(name = "RPG_IDROLPAGOS")
    private long rpgIdrolpagos;
    @Basic(optional = false)
    @Column(name = "PRN_IDPERSONAL")
    private long prnIdpersonal;

    public AsientoContablePK() {
    }

    public AsientoContablePK(long ascIdasiento, long rpgIdrolpagos, long prnIdpersonal) {
        this.ascIdasiento = ascIdasiento;
        this.rpgIdrolpagos = rpgIdrolpagos;
        this.prnIdpersonal = prnIdpersonal;
    }

    public long getAscIdasiento() {
        return ascIdasiento;
    }

    public void setAscIdasiento(long ascIdasiento) {
        this.ascIdasiento = ascIdasiento;
    }

    public long getRpgIdrolpagos() {
        return rpgIdrolpagos;
    }

    public void setRpgIdrolpagos(long rpgIdrolpagos) {
        this.rpgIdrolpagos = rpgIdrolpagos;
    }

    public long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ascIdasiento;
        hash += (int) rpgIdrolpagos;
        hash += (int) prnIdpersonal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsientoContablePK)) {
            return false;
        }
        AsientoContablePK other = (AsientoContablePK) object;
        if (this.ascIdasiento != other.ascIdasiento) {
            return false;
        }
        if (this.rpgIdrolpagos != other.rpgIdrolpagos) {
            return false;
        }
        if (this.prnIdpersonal != other.prnIdpersonal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AsientoContablePK[ ascIdasiento=" + ascIdasiento + ", rpgIdrolpagos=" + rpgIdrolpagos + ", prnIdpersonal=" + prnIdpersonal + " ]";
    }
    
}
