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
public class ProcedimientosVariablesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRCHSP_CODIGO")
    private String prchspCodigo;
    @Basic(optional = false)
    @Column(name = "VRBEXM_CODIGO")
    private int vrbexmCodigo;

    public ProcedimientosVariablesPK() {
    }

    public ProcedimientosVariablesPK(String prchspCodigo, int vrbexmCodigo) {
        this.prchspCodigo = prchspCodigo;
        this.vrbexmCodigo = vrbexmCodigo;
    }

    public String getPrchspCodigo() {
        return prchspCodigo;
    }

    public void setPrchspCodigo(String prchspCodigo) {
        this.prchspCodigo = prchspCodigo;
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
        hash += (prchspCodigo != null ? prchspCodigo.hashCode() : 0);
        hash += (int) vrbexmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosVariablesPK)) {
            return false;
        }
        ProcedimientosVariablesPK other = (ProcedimientosVariablesPK) object;
        if ((this.prchspCodigo == null && other.prchspCodigo != null) || (this.prchspCodigo != null && !this.prchspCodigo.equals(other.prchspCodigo))) {
            return false;
        }
        if (this.vrbexmCodigo != other.vrbexmCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ProcedimientosVariablesPK[ prchspCodigo=" + prchspCodigo + ", vrbexmCodigo=" + vrbexmCodigo + " ]";
    }
    
}
