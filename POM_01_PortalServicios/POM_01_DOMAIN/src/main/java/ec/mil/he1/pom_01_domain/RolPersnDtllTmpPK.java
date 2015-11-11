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
public class RolPersnDtllTmpPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRN_IDPERSONAL")
    private long prnIdpersonal;
    @Basic(optional = false)
    @Column(name = "RPG_IDROLPAGOS")
    private long rpgIdrolpagos;

    public RolPersnDtllTmpPK() {
    }

    public RolPersnDtllTmpPK(long prnIdpersonal, long rpgIdrolpagos) {
        this.prnIdpersonal = prnIdpersonal;
        this.rpgIdrolpagos = rpgIdrolpagos;
    }

    public long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public long getRpgIdrolpagos() {
        return rpgIdrolpagos;
    }

    public void setRpgIdrolpagos(long rpgIdrolpagos) {
        this.rpgIdrolpagos = rpgIdrolpagos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prnIdpersonal;
        hash += (int) rpgIdrolpagos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolPersnDtllTmpPK)) {
            return false;
        }
        RolPersnDtllTmpPK other = (RolPersnDtllTmpPK) object;
        if (this.prnIdpersonal != other.prnIdpersonal) {
            return false;
        }
        if (this.rpgIdrolpagos != other.rpgIdrolpagos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RolPersnDtllTmpPK[ prnIdpersonal=" + prnIdpersonal + ", rpgIdrolpagos=" + rpgIdrolpagos + " ]";
    }
    
}
