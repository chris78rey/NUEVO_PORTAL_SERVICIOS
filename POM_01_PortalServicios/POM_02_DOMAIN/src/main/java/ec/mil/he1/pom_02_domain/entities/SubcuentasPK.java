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
public class SubcuentasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CNT_MYR_EMP_CODIGO")
    private String cntMyrEmpCodigo;
    @Basic(optional = false)
    @Column(name = "CNT_MYR_CODIGO")
    private String cntMyrCodigo;
    @Basic(optional = false)
    @Column(name = "CNT_CODIGO")
    private String cntCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public SubcuentasPK() {
    }

    public SubcuentasPK(String cntMyrEmpCodigo, String cntMyrCodigo, String cntCodigo, String codigo) {
        this.cntMyrEmpCodigo = cntMyrEmpCodigo;
        this.cntMyrCodigo = cntMyrCodigo;
        this.cntCodigo = cntCodigo;
        this.codigo = codigo;
    }

    public String getCntMyrEmpCodigo() {
        return cntMyrEmpCodigo;
    }

    public void setCntMyrEmpCodigo(String cntMyrEmpCodigo) {
        this.cntMyrEmpCodigo = cntMyrEmpCodigo;
    }

    public String getCntMyrCodigo() {
        return cntMyrCodigo;
    }

    public void setCntMyrCodigo(String cntMyrCodigo) {
        this.cntMyrCodigo = cntMyrCodigo;
    }

    public String getCntCodigo() {
        return cntCodigo;
    }

    public void setCntCodigo(String cntCodigo) {
        this.cntCodigo = cntCodigo;
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
        hash += (cntMyrEmpCodigo != null ? cntMyrEmpCodigo.hashCode() : 0);
        hash += (cntMyrCodigo != null ? cntMyrCodigo.hashCode() : 0);
        hash += (cntCodigo != null ? cntCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubcuentasPK)) {
            return false;
        }
        SubcuentasPK other = (SubcuentasPK) object;
        if ((this.cntMyrEmpCodigo == null && other.cntMyrEmpCodigo != null) || (this.cntMyrEmpCodigo != null && !this.cntMyrEmpCodigo.equals(other.cntMyrEmpCodigo))) {
            return false;
        }
        if ((this.cntMyrCodigo == null && other.cntMyrCodigo != null) || (this.cntMyrCodigo != null && !this.cntMyrCodigo.equals(other.cntMyrCodigo))) {
            return false;
        }
        if ((this.cntCodigo == null && other.cntCodigo != null) || (this.cntCodigo != null && !this.cntCodigo.equals(other.cntCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SubcuentasPK[ cntMyrEmpCodigo=" + cntMyrEmpCodigo + ", cntMyrCodigo=" + cntMyrCodigo + ", cntCodigo=" + cntCodigo + ", codigo=" + codigo + " ]";
    }
    
}
