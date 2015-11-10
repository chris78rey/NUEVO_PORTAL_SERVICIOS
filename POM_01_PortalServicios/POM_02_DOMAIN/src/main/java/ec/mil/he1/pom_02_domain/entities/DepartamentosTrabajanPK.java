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
public class DepartamentosTrabajanPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;

    public DepartamentosTrabajanPK() {
    }

    public DepartamentosTrabajanPK(String prsCodigo, String dprCodigo, String dprAraCodigo) {
        this.prsCodigo = prsCodigo;
        this.dprCodigo = dprCodigo;
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prsCodigo != null ? prsCodigo.hashCode() : 0);
        hash += (dprCodigo != null ? dprCodigo.hashCode() : 0);
        hash += (dprAraCodigo != null ? dprAraCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentosTrabajanPK)) {
            return false;
        }
        DepartamentosTrabajanPK other = (DepartamentosTrabajanPK) object;
        if ((this.prsCodigo == null && other.prsCodigo != null) || (this.prsCodigo != null && !this.prsCodigo.equals(other.prsCodigo))) {
            return false;
        }
        if ((this.dprCodigo == null && other.dprCodigo != null) || (this.dprCodigo != null && !this.dprCodigo.equals(other.dprCodigo))) {
            return false;
        }
        if ((this.dprAraCodigo == null && other.dprAraCodigo != null) || (this.dprAraCodigo != null && !this.dprAraCodigo.equals(other.dprAraCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DepartamentosTrabajanPK[ prsCodigo=" + prsCodigo + ", dprCodigo=" + dprCodigo + ", dprAraCodigo=" + dprAraCodigo + " ]";
    }
    
}
