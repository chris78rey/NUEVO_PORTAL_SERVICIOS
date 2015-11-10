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
public class GermenesDePruebasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DTLEXM_EXM_NUMERO")
    private int dtlexmExmNumero;
    @Basic(optional = false)
    @Column(name = "DTLEXM_VRBEXM_CODIGO")
    private int dtlexmVrbexmCodigo;
    @Basic(optional = false)
    @Column(name = "GRM_CODIGO")
    private String grmCodigo;

    public GermenesDePruebasPK() {
    }

    public GermenesDePruebasPK(int dtlexmExmNumero, int dtlexmVrbexmCodigo, String grmCodigo) {
        this.dtlexmExmNumero = dtlexmExmNumero;
        this.dtlexmVrbexmCodigo = dtlexmVrbexmCodigo;
        this.grmCodigo = grmCodigo;
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

    public String getGrmCodigo() {
        return grmCodigo;
    }

    public void setGrmCodigo(String grmCodigo) {
        this.grmCodigo = grmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dtlexmExmNumero;
        hash += (int) dtlexmVrbexmCodigo;
        hash += (grmCodigo != null ? grmCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GermenesDePruebasPK)) {
            return false;
        }
        GermenesDePruebasPK other = (GermenesDePruebasPK) object;
        if (this.dtlexmExmNumero != other.dtlexmExmNumero) {
            return false;
        }
        if (this.dtlexmVrbexmCodigo != other.dtlexmVrbexmCodigo) {
            return false;
        }
        if ((this.grmCodigo == null && other.grmCodigo != null) || (this.grmCodigo != null && !this.grmCodigo.equals(other.grmCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.GermenesDePruebasPK[ dtlexmExmNumero=" + dtlexmExmNumero + ", dtlexmVrbexmCodigo=" + dtlexmVrbexmCodigo + ", grmCodigo=" + grmCodigo + " ]";
    }
    
}
