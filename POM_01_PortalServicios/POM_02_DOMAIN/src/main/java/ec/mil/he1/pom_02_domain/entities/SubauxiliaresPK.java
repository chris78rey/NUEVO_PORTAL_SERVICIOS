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
public class SubauxiliaresPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "A_SC_CNT_MYR_EMP_CODIGO")
    private String aScCntMyrEmpCodigo;
    @Basic(optional = false)
    @Column(name = "A_SC_CNT_MYR_CODIGO")
    private String aScCntMyrCodigo;
    @Basic(optional = false)
    @Column(name = "A_SC_CNT_CODIGO")
    private String aScCntCodigo;
    @Basic(optional = false)
    @Column(name = "A_SC_CODIGO")
    private String aScCodigo;
    @Basic(optional = false)
    @Column(name = "A_CODIGO")
    private String aCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public SubauxiliaresPK() {
    }

    public SubauxiliaresPK(String aScCntMyrEmpCodigo, String aScCntMyrCodigo, String aScCntCodigo, String aScCodigo, String aCodigo, String codigo) {
        this.aScCntMyrEmpCodigo = aScCntMyrEmpCodigo;
        this.aScCntMyrCodigo = aScCntMyrCodigo;
        this.aScCntCodigo = aScCntCodigo;
        this.aScCodigo = aScCodigo;
        this.aCodigo = aCodigo;
        this.codigo = codigo;
    }

    public String getAScCntMyrEmpCodigo() {
        return aScCntMyrEmpCodigo;
    }

    public void setAScCntMyrEmpCodigo(String aScCntMyrEmpCodigo) {
        this.aScCntMyrEmpCodigo = aScCntMyrEmpCodigo;
    }

    public String getAScCntMyrCodigo() {
        return aScCntMyrCodigo;
    }

    public void setAScCntMyrCodigo(String aScCntMyrCodigo) {
        this.aScCntMyrCodigo = aScCntMyrCodigo;
    }

    public String getAScCntCodigo() {
        return aScCntCodigo;
    }

    public void setAScCntCodigo(String aScCntCodigo) {
        this.aScCntCodigo = aScCntCodigo;
    }

    public String getAScCodigo() {
        return aScCodigo;
    }

    public void setAScCodigo(String aScCodigo) {
        this.aScCodigo = aScCodigo;
    }

    public String getACodigo() {
        return aCodigo;
    }

    public void setACodigo(String aCodigo) {
        this.aCodigo = aCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aScCntMyrEmpCodigo != null ? aScCntMyrEmpCodigo.hashCode() : 0);
        hash += (aScCntMyrCodigo != null ? aScCntMyrCodigo.hashCode() : 0);
        hash += (aScCntCodigo != null ? aScCntCodigo.hashCode() : 0);
        hash += (aScCodigo != null ? aScCodigo.hashCode() : 0);
        hash += (aCodigo != null ? aCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubauxiliaresPK)) {
            return false;
        }
        SubauxiliaresPK other = (SubauxiliaresPK) object;
        if ((this.aScCntMyrEmpCodigo == null && other.aScCntMyrEmpCodigo != null) || (this.aScCntMyrEmpCodigo != null && !this.aScCntMyrEmpCodigo.equals(other.aScCntMyrEmpCodigo))) {
            return false;
        }
        if ((this.aScCntMyrCodigo == null && other.aScCntMyrCodigo != null) || (this.aScCntMyrCodigo != null && !this.aScCntMyrCodigo.equals(other.aScCntMyrCodigo))) {
            return false;
        }
        if ((this.aScCntCodigo == null && other.aScCntCodigo != null) || (this.aScCntCodigo != null && !this.aScCntCodigo.equals(other.aScCntCodigo))) {
            return false;
        }
        if ((this.aScCodigo == null && other.aScCodigo != null) || (this.aScCodigo != null && !this.aScCodigo.equals(other.aScCodigo))) {
            return false;
        }
        if ((this.aCodigo == null && other.aCodigo != null) || (this.aCodigo != null && !this.aCodigo.equals(other.aCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SubauxiliaresPK[ aScCntMyrEmpCodigo=" + aScCntMyrEmpCodigo + ", aScCntMyrCodigo=" + aScCntMyrCodigo + ", aScCntCodigo=" + aScCntCodigo + ", aScCodigo=" + aScCodigo + ", aCodigo=" + aCodigo + ", codigo=" + codigo + " ]";
    }
    
}
