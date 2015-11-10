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
public class AuxiliaresPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SC_CNT_MYR_EMP_CODIGO")
    private String scCntMyrEmpCodigo;
    @Basic(optional = false)
    @Column(name = "SC_CNT_MYR_CODIGO")
    private String scCntMyrCodigo;
    @Basic(optional = false)
    @Column(name = "SC_CNT_CODIGO")
    private String scCntCodigo;
    @Basic(optional = false)
    @Column(name = "SC_CODIGO")
    private String scCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public AuxiliaresPK() {
    }

    public AuxiliaresPK(String scCntMyrEmpCodigo, String scCntMyrCodigo, String scCntCodigo, String scCodigo, String codigo) {
        this.scCntMyrEmpCodigo = scCntMyrEmpCodigo;
        this.scCntMyrCodigo = scCntMyrCodigo;
        this.scCntCodigo = scCntCodigo;
        this.scCodigo = scCodigo;
        this.codigo = codigo;
    }

    public String getScCntMyrEmpCodigo() {
        return scCntMyrEmpCodigo;
    }

    public void setScCntMyrEmpCodigo(String scCntMyrEmpCodigo) {
        this.scCntMyrEmpCodigo = scCntMyrEmpCodigo;
    }

    public String getScCntMyrCodigo() {
        return scCntMyrCodigo;
    }

    public void setScCntMyrCodigo(String scCntMyrCodigo) {
        this.scCntMyrCodigo = scCntMyrCodigo;
    }

    public String getScCntCodigo() {
        return scCntCodigo;
    }

    public void setScCntCodigo(String scCntCodigo) {
        this.scCntCodigo = scCntCodigo;
    }

    public String getScCodigo() {
        return scCodigo;
    }

    public void setScCodigo(String scCodigo) {
        this.scCodigo = scCodigo;
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
        hash += (scCntMyrEmpCodigo != null ? scCntMyrEmpCodigo.hashCode() : 0);
        hash += (scCntMyrCodigo != null ? scCntMyrCodigo.hashCode() : 0);
        hash += (scCntCodigo != null ? scCntCodigo.hashCode() : 0);
        hash += (scCodigo != null ? scCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuxiliaresPK)) {
            return false;
        }
        AuxiliaresPK other = (AuxiliaresPK) object;
        if ((this.scCntMyrEmpCodigo == null && other.scCntMyrEmpCodigo != null) || (this.scCntMyrEmpCodigo != null && !this.scCntMyrEmpCodigo.equals(other.scCntMyrEmpCodigo))) {
            return false;
        }
        if ((this.scCntMyrCodigo == null && other.scCntMyrCodigo != null) || (this.scCntMyrCodigo != null && !this.scCntMyrCodigo.equals(other.scCntMyrCodigo))) {
            return false;
        }
        if ((this.scCntCodigo == null && other.scCntCodigo != null) || (this.scCntCodigo != null && !this.scCntCodigo.equals(other.scCntCodigo))) {
            return false;
        }
        if ((this.scCodigo == null && other.scCodigo != null) || (this.scCodigo != null && !this.scCodigo.equals(other.scCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AuxiliaresPK[ scCntMyrEmpCodigo=" + scCntMyrEmpCodigo + ", scCntMyrCodigo=" + scCntMyrCodigo + ", scCntCodigo=" + scCntCodigo + ", scCodigo=" + scCodigo + ", codigo=" + codigo + " ]";
    }
    
}
