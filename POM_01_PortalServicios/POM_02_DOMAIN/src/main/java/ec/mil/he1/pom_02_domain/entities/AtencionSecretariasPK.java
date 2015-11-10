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
public class AtencionSecretariasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRS_COD_MED")
    private String prsCodMed;
    @Basic(optional = false)
    @Column(name = "PRS_COD_SEC")
    private String prsCodSec;

    public AtencionSecretariasPK() {
    }

    public AtencionSecretariasPK(String prsCodMed, String prsCodSec) {
        this.prsCodMed = prsCodMed;
        this.prsCodSec = prsCodSec;
    }

    public String getPrsCodMed() {
        return prsCodMed;
    }

    public void setPrsCodMed(String prsCodMed) {
        this.prsCodMed = prsCodMed;
    }

    public String getPrsCodSec() {
        return prsCodSec;
    }

    public void setPrsCodSec(String prsCodSec) {
        this.prsCodSec = prsCodSec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prsCodMed != null ? prsCodMed.hashCode() : 0);
        hash += (prsCodSec != null ? prsCodSec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtencionSecretariasPK)) {
            return false;
        }
        AtencionSecretariasPK other = (AtencionSecretariasPK) object;
        if ((this.prsCodMed == null && other.prsCodMed != null) || (this.prsCodMed != null && !this.prsCodMed.equals(other.prsCodMed))) {
            return false;
        }
        if ((this.prsCodSec == null && other.prsCodSec != null) || (this.prsCodSec != null && !this.prsCodSec.equals(other.prsCodSec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AtencionSecretariasPK[ prsCodMed=" + prsCodMed + ", prsCodSec=" + prsCodSec + " ]";
    }
    
}
