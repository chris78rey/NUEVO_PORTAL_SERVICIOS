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
public class SecretariasDepartamentosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRS_COD_SEC")
    private String prsCodSec;
    @Basic(optional = false)
    @Column(name = "ARADPR_CODIGO")
    private String aradprCodigo;

    public SecretariasDepartamentosPK() {
    }

    public SecretariasDepartamentosPK(String prsCodSec, String aradprCodigo) {
        this.prsCodSec = prsCodSec;
        this.aradprCodigo = aradprCodigo;
    }

    public String getPrsCodSec() {
        return prsCodSec;
    }

    public void setPrsCodSec(String prsCodSec) {
        this.prsCodSec = prsCodSec;
    }

    public String getAradprCodigo() {
        return aradprCodigo;
    }

    public void setAradprCodigo(String aradprCodigo) {
        this.aradprCodigo = aradprCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prsCodSec != null ? prsCodSec.hashCode() : 0);
        hash += (aradprCodigo != null ? aradprCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecretariasDepartamentosPK)) {
            return false;
        }
        SecretariasDepartamentosPK other = (SecretariasDepartamentosPK) object;
        if ((this.prsCodSec == null && other.prsCodSec != null) || (this.prsCodSec != null && !this.prsCodSec.equals(other.prsCodSec))) {
            return false;
        }
        if ((this.aradprCodigo == null && other.aradprCodigo != null) || (this.aradprCodigo != null && !this.aradprCodigo.equals(other.aradprCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SecretariasDepartamentosPK[ prsCodSec=" + prsCodSec + ", aradprCodigo=" + aradprCodigo + " ]";
    }
    
}
