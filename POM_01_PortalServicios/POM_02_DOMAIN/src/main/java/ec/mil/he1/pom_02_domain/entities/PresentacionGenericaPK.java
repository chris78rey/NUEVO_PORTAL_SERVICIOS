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
public class PresentacionGenericaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GEN_CODIGO_P")
    private String genCodigoP;
    @Basic(optional = false)
    @Column(name = "PRE_CODIGO")
    private int preCodigo;

    public PresentacionGenericaPK() {
    }

    public PresentacionGenericaPK(String genCodigoP, int preCodigo) {
        this.genCodigoP = genCodigoP;
        this.preCodigo = preCodigo;
    }

    public String getGenCodigoP() {
        return genCodigoP;
    }

    public void setGenCodigoP(String genCodigoP) {
        this.genCodigoP = genCodigoP;
    }

    public int getPreCodigo() {
        return preCodigo;
    }

    public void setPreCodigo(int preCodigo) {
        this.preCodigo = preCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (genCodigoP != null ? genCodigoP.hashCode() : 0);
        hash += (int) preCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PresentacionGenericaPK)) {
            return false;
        }
        PresentacionGenericaPK other = (PresentacionGenericaPK) object;
        if ((this.genCodigoP == null && other.genCodigoP != null) || (this.genCodigoP != null && !this.genCodigoP.equals(other.genCodigoP))) {
            return false;
        }
        if (this.preCodigo != other.preCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PresentacionGenericaPK[ genCodigoP=" + genCodigoP + ", preCodigo=" + preCodigo + " ]";
    }
    
}
