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
public class ComplementosDeVariablesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CMPLMT_CODIGO")
    private int cmplmtCodigo;
    @Basic(optional = false)
    @Column(name = "VRBEXM_CODIGO")
    private int vrbexmCodigo;

    public ComplementosDeVariablesPK() {
    }

    public ComplementosDeVariablesPK(int cmplmtCodigo, int vrbexmCodigo) {
        this.cmplmtCodigo = cmplmtCodigo;
        this.vrbexmCodigo = vrbexmCodigo;
    }

    public int getCmplmtCodigo() {
        return cmplmtCodigo;
    }

    public void setCmplmtCodigo(int cmplmtCodigo) {
        this.cmplmtCodigo = cmplmtCodigo;
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
        hash += (int) cmplmtCodigo;
        hash += (int) vrbexmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplementosDeVariablesPK)) {
            return false;
        }
        ComplementosDeVariablesPK other = (ComplementosDeVariablesPK) object;
        if (this.cmplmtCodigo != other.cmplmtCodigo) {
            return false;
        }
        if (this.vrbexmCodigo != other.vrbexmCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComplementosDeVariablesPK[ cmplmtCodigo=" + cmplmtCodigo + ", vrbexmCodigo=" + vrbexmCodigo + " ]";
    }
    
}
