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
public class CuentasPlanPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MYR_EMP_CODIGO")
    private String myrEmpCodigo;
    @Basic(optional = false)
    @Column(name = "MYR_CODIGO")
    private String myrCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public CuentasPlanPK() {
    }

    public CuentasPlanPK(String myrEmpCodigo, String myrCodigo, String codigo) {
        this.myrEmpCodigo = myrEmpCodigo;
        this.myrCodigo = myrCodigo;
        this.codigo = codigo;
    }

    public String getMyrEmpCodigo() {
        return myrEmpCodigo;
    }

    public void setMyrEmpCodigo(String myrEmpCodigo) {
        this.myrEmpCodigo = myrEmpCodigo;
    }

    public String getMyrCodigo() {
        return myrCodigo;
    }

    public void setMyrCodigo(String myrCodigo) {
        this.myrCodigo = myrCodigo;
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
        hash += (myrEmpCodigo != null ? myrEmpCodigo.hashCode() : 0);
        hash += (myrCodigo != null ? myrCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasPlanPK)) {
            return false;
        }
        CuentasPlanPK other = (CuentasPlanPK) object;
        if ((this.myrEmpCodigo == null && other.myrEmpCodigo != null) || (this.myrEmpCodigo != null && !this.myrEmpCodigo.equals(other.myrEmpCodigo))) {
            return false;
        }
        if ((this.myrCodigo == null && other.myrCodigo != null) || (this.myrCodigo != null && !this.myrCodigo.equals(other.myrCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CuentasPlanPK[ myrEmpCodigo=" + myrEmpCodigo + ", myrCodigo=" + myrCodigo + ", codigo=" + codigo + " ]";
    }
    
}
