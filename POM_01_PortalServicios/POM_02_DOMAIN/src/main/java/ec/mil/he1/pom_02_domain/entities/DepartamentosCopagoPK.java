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
public class DepartamentosCopagoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CPG_CODIGO")
    private String cpgCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;

    public DepartamentosCopagoPK() {
    }

    public DepartamentosCopagoPK(String cpgCodigo, String dprAraCodigo, String dprCodigo) {
        this.cpgCodigo = cpgCodigo;
        this.dprAraCodigo = dprAraCodigo;
        this.dprCodigo = dprCodigo;
    }

    public String getCpgCodigo() {
        return cpgCodigo;
    }

    public void setCpgCodigo(String cpgCodigo) {
        this.cpgCodigo = cpgCodigo;
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
        hash += (cpgCodigo != null ? cpgCodigo.hashCode() : 0);
        hash += (dprAraCodigo != null ? dprAraCodigo.hashCode() : 0);
        hash += (dprCodigo != null ? dprCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentosCopagoPK)) {
            return false;
        }
        DepartamentosCopagoPK other = (DepartamentosCopagoPK) object;
        if ((this.cpgCodigo == null && other.cpgCodigo != null) || (this.cpgCodigo != null && !this.cpgCodigo.equals(other.cpgCodigo))) {
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
        return "ec.mil.he1.pom_02_domain.entities.DepartamentosCopagoPK[ cpgCodigo=" + cpgCodigo + ", dprAraCodigo=" + dprAraCodigo + ", dprCodigo=" + dprCodigo + " ]";
    }
    
}
