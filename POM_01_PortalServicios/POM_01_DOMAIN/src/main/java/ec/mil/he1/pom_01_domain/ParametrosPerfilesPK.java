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
public class ParametrosPerfilesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRMROL_CODIGO")
    private String prmrolCodigo;
    @Basic(optional = false)
    @Column(name = "PRFEMP_CODIGO")
    private String prfempCodigo;
    @Basic(optional = false)
    @Column(name = "PRMROL_EMP_CODIGO")
    private String prmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "PRFEMP_EMP_CODIGO")
    private String prfempEmpCodigo;

    public ParametrosPerfilesPK() {
    }

    public ParametrosPerfilesPK(String prmrolCodigo, String prfempCodigo, String prmrolEmpCodigo, String prfempEmpCodigo) {
        this.prmrolCodigo = prmrolCodigo;
        this.prfempCodigo = prfempCodigo;
        this.prmrolEmpCodigo = prmrolEmpCodigo;
        this.prfempEmpCodigo = prfempEmpCodigo;
    }

    public String getPrmrolCodigo() {
        return prmrolCodigo;
    }

    public void setPrmrolCodigo(String prmrolCodigo) {
        this.prmrolCodigo = prmrolCodigo;
    }

    public String getPrfempCodigo() {
        return prfempCodigo;
    }

    public void setPrfempCodigo(String prfempCodigo) {
        this.prfempCodigo = prfempCodigo;
    }

    public String getPrmrolEmpCodigo() {
        return prmrolEmpCodigo;
    }

    public void setPrmrolEmpCodigo(String prmrolEmpCodigo) {
        this.prmrolEmpCodigo = prmrolEmpCodigo;
    }

    public String getPrfempEmpCodigo() {
        return prfempEmpCodigo;
    }

    public void setPrfempEmpCodigo(String prfempEmpCodigo) {
        this.prfempEmpCodigo = prfempEmpCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmrolCodigo != null ? prmrolCodigo.hashCode() : 0);
        hash += (prfempCodigo != null ? prfempCodigo.hashCode() : 0);
        hash += (prmrolEmpCodigo != null ? prmrolEmpCodigo.hashCode() : 0);
        hash += (prfempEmpCodigo != null ? prfempEmpCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosPerfilesPK)) {
            return false;
        }
        ParametrosPerfilesPK other = (ParametrosPerfilesPK) object;
        if ((this.prmrolCodigo == null && other.prmrolCodigo != null) || (this.prmrolCodigo != null && !this.prmrolCodigo.equals(other.prmrolCodigo))) {
            return false;
        }
        if ((this.prfempCodigo == null && other.prfempCodigo != null) || (this.prfempCodigo != null && !this.prfempCodigo.equals(other.prfempCodigo))) {
            return false;
        }
        if ((this.prmrolEmpCodigo == null && other.prmrolEmpCodigo != null) || (this.prmrolEmpCodigo != null && !this.prmrolEmpCodigo.equals(other.prmrolEmpCodigo))) {
            return false;
        }
        if ((this.prfempEmpCodigo == null && other.prfempEmpCodigo != null) || (this.prfempEmpCodigo != null && !this.prfempEmpCodigo.equals(other.prfempEmpCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ParametrosPerfilesPK[ prmrolCodigo=" + prmrolCodigo + ", prfempCodigo=" + prfempCodigo + ", prmrolEmpCodigo=" + prmrolEmpCodigo + ", prfempEmpCodigo=" + prfempEmpCodigo + " ]";
    }
    
}
