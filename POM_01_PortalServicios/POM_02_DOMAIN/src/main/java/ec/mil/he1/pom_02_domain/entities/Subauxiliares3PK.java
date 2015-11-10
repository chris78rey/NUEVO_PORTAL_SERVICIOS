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
public class Subauxiliares3PK implements Serializable {
    @Basic(optional = false)
    @Column(name = "S_S_A_SC_CNT_MYR_EMP_CODIGO")
    private String sSAScCntMyrEmpCodigo;
    @Basic(optional = false)
    @Column(name = "S_S_A_SC_CNT_MYR_CODIGO")
    private String sSAScCntMyrCodigo;
    @Basic(optional = false)
    @Column(name = "S_S_A_SC_CNT_CODIGO")
    private String sSAScCntCodigo;
    @Basic(optional = false)
    @Column(name = "S_S_A_SC_CODIGO")
    private String sSAScCodigo;
    @Basic(optional = false)
    @Column(name = "S_S_A_CODIGO")
    private String sSACodigo;
    @Basic(optional = false)
    @Column(name = "S_S_CODIGO")
    private String sSCodigo;
    @Basic(optional = false)
    @Column(name = "S_CODIGO")
    private String sCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public Subauxiliares3PK() {
    }

    public Subauxiliares3PK(String sSAScCntMyrEmpCodigo, String sSAScCntMyrCodigo, String sSAScCntCodigo, String sSAScCodigo, String sSACodigo, String sSCodigo, String sCodigo, String codigo) {
        this.sSAScCntMyrEmpCodigo = sSAScCntMyrEmpCodigo;
        this.sSAScCntMyrCodigo = sSAScCntMyrCodigo;
        this.sSAScCntCodigo = sSAScCntCodigo;
        this.sSAScCodigo = sSAScCodigo;
        this.sSACodigo = sSACodigo;
        this.sSCodigo = sSCodigo;
        this.sCodigo = sCodigo;
        this.codigo = codigo;
    }

    public String getSSAScCntMyrEmpCodigo() {
        return sSAScCntMyrEmpCodigo;
    }

    public void setSSAScCntMyrEmpCodigo(String sSAScCntMyrEmpCodigo) {
        this.sSAScCntMyrEmpCodigo = sSAScCntMyrEmpCodigo;
    }

    public String getSSAScCntMyrCodigo() {
        return sSAScCntMyrCodigo;
    }

    public void setSSAScCntMyrCodigo(String sSAScCntMyrCodigo) {
        this.sSAScCntMyrCodigo = sSAScCntMyrCodigo;
    }

    public String getSSAScCntCodigo() {
        return sSAScCntCodigo;
    }

    public void setSSAScCntCodigo(String sSAScCntCodigo) {
        this.sSAScCntCodigo = sSAScCntCodigo;
    }

    public String getSSAScCodigo() {
        return sSAScCodigo;
    }

    public void setSSAScCodigo(String sSAScCodigo) {
        this.sSAScCodigo = sSAScCodigo;
    }

    public String getSSACodigo() {
        return sSACodigo;
    }

    public void setSSACodigo(String sSACodigo) {
        this.sSACodigo = sSACodigo;
    }

    public String getSSCodigo() {
        return sSCodigo;
    }

    public void setSSCodigo(String sSCodigo) {
        this.sSCodigo = sSCodigo;
    }

    public String getSCodigo() {
        return sCodigo;
    }

    public void setSCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
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
        hash += (sSAScCntMyrEmpCodigo != null ? sSAScCntMyrEmpCodigo.hashCode() : 0);
        hash += (sSAScCntMyrCodigo != null ? sSAScCntMyrCodigo.hashCode() : 0);
        hash += (sSAScCntCodigo != null ? sSAScCntCodigo.hashCode() : 0);
        hash += (sSAScCodigo != null ? sSAScCodigo.hashCode() : 0);
        hash += (sSACodigo != null ? sSACodigo.hashCode() : 0);
        hash += (sSCodigo != null ? sSCodigo.hashCode() : 0);
        hash += (sCodigo != null ? sCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subauxiliares3PK)) {
            return false;
        }
        Subauxiliares3PK other = (Subauxiliares3PK) object;
        if ((this.sSAScCntMyrEmpCodigo == null && other.sSAScCntMyrEmpCodigo != null) || (this.sSAScCntMyrEmpCodigo != null && !this.sSAScCntMyrEmpCodigo.equals(other.sSAScCntMyrEmpCodigo))) {
            return false;
        }
        if ((this.sSAScCntMyrCodigo == null && other.sSAScCntMyrCodigo != null) || (this.sSAScCntMyrCodigo != null && !this.sSAScCntMyrCodigo.equals(other.sSAScCntMyrCodigo))) {
            return false;
        }
        if ((this.sSAScCntCodigo == null && other.sSAScCntCodigo != null) || (this.sSAScCntCodigo != null && !this.sSAScCntCodigo.equals(other.sSAScCntCodigo))) {
            return false;
        }
        if ((this.sSAScCodigo == null && other.sSAScCodigo != null) || (this.sSAScCodigo != null && !this.sSAScCodigo.equals(other.sSAScCodigo))) {
            return false;
        }
        if ((this.sSACodigo == null && other.sSACodigo != null) || (this.sSACodigo != null && !this.sSACodigo.equals(other.sSACodigo))) {
            return false;
        }
        if ((this.sSCodigo == null && other.sSCodigo != null) || (this.sSCodigo != null && !this.sSCodigo.equals(other.sSCodigo))) {
            return false;
        }
        if ((this.sCodigo == null && other.sCodigo != null) || (this.sCodigo != null && !this.sCodigo.equals(other.sCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Subauxiliares3PK[ sSAScCntMyrEmpCodigo=" + sSAScCntMyrEmpCodigo + ", sSAScCntMyrCodigo=" + sSAScCntMyrCodigo + ", sSAScCntCodigo=" + sSAScCntCodigo + ", sSAScCodigo=" + sSAScCodigo + ", sSACodigo=" + sSACodigo + ", sSCodigo=" + sSCodigo + ", sCodigo=" + sCodigo + ", codigo=" + codigo + " ]";
    }
    
}
