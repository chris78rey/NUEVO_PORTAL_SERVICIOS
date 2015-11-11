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
public class VariablesEnPerfilesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRF_CODIGO")
    private String prfCodigo;
    @Basic(optional = false)
    @Column(name = "VRBEXM_CODIGO")
    private int vrbexmCodigo;

    public VariablesEnPerfilesPK() {
    }

    public VariablesEnPerfilesPK(String prfCodigo, int vrbexmCodigo) {
        this.prfCodigo = prfCodigo;
        this.vrbexmCodigo = vrbexmCodigo;
    }

    public String getPrfCodigo() {
        return prfCodigo;
    }

    public void setPrfCodigo(String prfCodigo) {
        this.prfCodigo = prfCodigo;
    }

    public int getVrbexmCodigo() {
        return vrbexmCodigo;
    }

    public void setVrbexmCodigo(int vrbexmCodigo) {
        this.vrbexmCodigo = vrbexmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prfCodigo != null ? prfCodigo.hashCode() : 0);
        hash += (int) vrbexmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariablesEnPerfilesPK)) {
            return false;
        }
        VariablesEnPerfilesPK other = (VariablesEnPerfilesPK) object;
        if ((this.prfCodigo == null && other.prfCodigo != null) || (this.prfCodigo != null && !this.prfCodigo.equals(other.prfCodigo))) {
            return false;
        }
        if (this.vrbexmCodigo != other.vrbexmCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.VariablesEnPerfilesPK[ prfCodigo=" + prfCodigo + ", vrbexmCodigo=" + vrbexmCodigo + " ]";
    }
    
}
