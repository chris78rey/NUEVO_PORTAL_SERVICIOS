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
public class ComplementosAResultadosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CMPLMT_CODIGO")
    private int cmplmtCodigo;
    @Basic(optional = false)
    @Column(name = "DTLEXM_EXM_NUMERO")
    private int dtlexmExmNumero;
    @Basic(optional = false)
    @Column(name = "DTLEXM_VRBEXM_CODIGO")
    private int dtlexmVrbexmCodigo;

    public ComplementosAResultadosPK() {
    }

    public ComplementosAResultadosPK(int cmplmtCodigo, int dtlexmExmNumero, int dtlexmVrbexmCodigo) {
        this.cmplmtCodigo = cmplmtCodigo;
        this.dtlexmExmNumero = dtlexmExmNumero;
        this.dtlexmVrbexmCodigo = dtlexmVrbexmCodigo;
    }

    public int getCmplmtCodigo() {
        return cmplmtCodigo;
    }

    public void setCmplmtCodigo(int cmplmtCodigo) {
        this.cmplmtCodigo = cmplmtCodigo;
    }

    public int getDtlexmExmNumero() {
        return dtlexmExmNumero;
    }

    public void setDtlexmExmNumero(int dtlexmExmNumero) {
        this.dtlexmExmNumero = dtlexmExmNumero;
    }

    public int getDtlexmVrbexmCodigo() {
        return dtlexmVrbexmCodigo;
    }

    public void setDtlexmVrbexmCodigo(int dtlexmVrbexmCodigo) {
        this.dtlexmVrbexmCodigo = dtlexmVrbexmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cmplmtCodigo;
        hash += (int) dtlexmExmNumero;
        hash += (int) dtlexmVrbexmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplementosAResultadosPK)) {
            return false;
        }
        ComplementosAResultadosPK other = (ComplementosAResultadosPK) object;
        if (this.cmplmtCodigo != other.cmplmtCodigo) {
            return false;
        }
        if (this.dtlexmExmNumero != other.dtlexmExmNumero) {
            return false;
        }
        if (this.dtlexmVrbexmCodigo != other.dtlexmVrbexmCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ComplementosAResultadosPK[ cmplmtCodigo=" + cmplmtCodigo + ", dtlexmExmNumero=" + dtlexmExmNumero + ", dtlexmVrbexmCodigo=" + dtlexmVrbexmCodigo + " ]";
    }
    
}
