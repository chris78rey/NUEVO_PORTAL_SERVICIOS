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
public class Subauxiliares2PK implements Serializable {
    @Basic(optional = false)
    @Column(name = "S_A_SC_CNT_MYR_EMP_CODIGO")
    private String sAScCntMyrEmpCodigo;
    @Basic(optional = false)
    @Column(name = "S_A_SC_CNT_MYR_CODIGO")
    private String sAScCntMyrCodigo;
    @Basic(optional = false)
    @Column(name = "S_A_SC_CNT_CODIGO")
    private String sAScCntCodigo;
    @Basic(optional = false)
    @Column(name = "S_A_SC_CODIGO")
    private String sAScCodigo;
    @Basic(optional = false)
    @Column(name = "S_A_CODIGO")
    private String sACodigo;
    @Basic(optional = false)
    @Column(name = "S_CODIGO")
    private String sCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public Subauxiliares2PK() {
    }

    public Subauxiliares2PK(String sAScCntMyrEmpCodigo, String sAScCntMyrCodigo, String sAScCntCodigo, String sAScCodigo, String sACodigo, String sCodigo, String codigo) {
        this.sAScCntMyrEmpCodigo = sAScCntMyrEmpCodigo;
        this.sAScCntMyrCodigo = sAScCntMyrCodigo;
        this.sAScCntCodigo = sAScCntCodigo;
        this.sAScCodigo = sAScCodigo;
        this.sACodigo = sACodigo;
        this.sCodigo = sCodigo;
        this.codigo = codigo;
    }

    public String getSAScCntMyrEmpCodigo() {
        return sAScCntMyrEmpCodigo;
    }

    public void setSAScCntMyrEmpCodigo(String sAScCntMyrEmpCodigo) {
        this.sAScCntMyrEmpCodigo = sAScCntMyrEmpCodigo;
    }

    public String getSAScCntMyrCodigo() {
        return sAScCntMyrCodigo;
    }

    public void setSAScCntMyrCodigo(String sAScCntMyrCodigo) {
        this.sAScCntMyrCodigo = sAScCntMyrCodigo;
    }

    public String getSAScCntCodigo() {
        return sAScCntCodigo;
    }

    public void setSAScCntCodigo(String sAScCntCodigo) {
        this.sAScCntCodigo = sAScCntCodigo;
    }

    public String getSAScCodigo() {
        return sAScCodigo;
    }

    public void setSAScCodigo(String sAScCodigo) {
        this.sAScCodigo = sAScCodigo;
    }

    public String getSACodigo() {
        return sACodigo;
    }

    public void setSACodigo(String sACodigo) {
        this.sACodigo = sACodigo;
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
        hash += (sAScCntMyrEmpCodigo != null ? sAScCntMyrEmpCodigo.hashCode() : 0);
        hash += (sAScCntMyrCodigo != null ? sAScCntMyrCodigo.hashCode() : 0);
        hash += (sAScCntCodigo != null ? sAScCntCodigo.hashCode() : 0);
        hash += (sAScCodigo != null ? sAScCodigo.hashCode() : 0);
        hash += (sACodigo != null ? sACodigo.hashCode() : 0);
        hash += (sCodigo != null ? sCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subauxiliares2PK)) {
            return false;
        }
        Subauxiliares2PK other = (Subauxiliares2PK) object;
        if ((this.sAScCntMyrEmpCodigo == null && other.sAScCntMyrEmpCodigo != null) || (this.sAScCntMyrEmpCodigo != null && !this.sAScCntMyrEmpCodigo.equals(other.sAScCntMyrEmpCodigo))) {
            return false;
        }
        if ((this.sAScCntMyrCodigo == null && other.sAScCntMyrCodigo != null) || (this.sAScCntMyrCodigo != null && !this.sAScCntMyrCodigo.equals(other.sAScCntMyrCodigo))) {
            return false;
        }
        if ((this.sAScCntCodigo == null && other.sAScCntCodigo != null) || (this.sAScCntCodigo != null && !this.sAScCntCodigo.equals(other.sAScCntCodigo))) {
            return false;
        }
        if ((this.sAScCodigo == null && other.sAScCodigo != null) || (this.sAScCodigo != null && !this.sAScCodigo.equals(other.sAScCodigo))) {
            return false;
        }
        if ((this.sACodigo == null && other.sACodigo != null) || (this.sACodigo != null && !this.sACodigo.equals(other.sACodigo))) {
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
        return "ec.mil.he1.pom_01_domain.Subauxiliares2PK[ sAScCntMyrEmpCodigo=" + sAScCntMyrEmpCodigo + ", sAScCntMyrCodigo=" + sAScCntMyrCodigo + ", sAScCntCodigo=" + sAScCntCodigo + ", sAScCodigo=" + sAScCodigo + ", sACodigo=" + sACodigo + ", sCodigo=" + sCodigo + ", codigo=" + codigo + " ]";
    }
    
}
