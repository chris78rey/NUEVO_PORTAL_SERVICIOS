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
public class DetallesPromocionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRM_CODIGO")
    private String prmCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;

    public DetallesPromocionesPK() {
    }

    public DetallesPromocionesPK(String prmCodigo, String dprAraCodigo, String dprCodigo) {
        this.prmCodigo = prmCodigo;
        this.dprAraCodigo = dprAraCodigo;
        this.dprCodigo = dprCodigo;
    }

    public String getPrmCodigo() {
        return prmCodigo;
    }

    public void setPrmCodigo(String prmCodigo) {
        this.prmCodigo = prmCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmCodigo != null ? prmCodigo.hashCode() : 0);
        hash += (dprAraCodigo != null ? dprAraCodigo.hashCode() : 0);
        hash += (dprCodigo != null ? dprCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPromocionesPK)) {
            return false;
        }
        DetallesPromocionesPK other = (DetallesPromocionesPK) object;
        if ((this.prmCodigo == null && other.prmCodigo != null) || (this.prmCodigo != null && !this.prmCodigo.equals(other.prmCodigo))) {
            return false;
        }
        if ((this.dprAraCodigo == null && other.dprAraCodigo != null) || (this.dprAraCodigo != null && !this.dprAraCodigo.equals(other.dprAraCodigo))) {
            return false;
        }
        if ((this.dprCodigo == null && other.dprCodigo != null) || (this.dprCodigo != null && !this.dprCodigo.equals(other.dprCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesPromocionesPK[ prmCodigo=" + prmCodigo + ", dprAraCodigo=" + dprAraCodigo + ", dprCodigo=" + dprCodigo + " ]";
    }
    
}
