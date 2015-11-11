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
public class DatosIntervienenPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRMESP_PRMROL_EMP_CODIGO")
    private String prmespPrmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "PRMESP_PRMROL_CODIGO")
    private String prmespPrmrolCodigo;
    @Basic(optional = false)
    @Column(name = "PRMROL_EMP_CODIGO")
    private String prmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "PRMROL_CODIGO")
    private String prmrolCodigo;

    public DatosIntervienenPK() {
    }

    public DatosIntervienenPK(String prmespPrmrolEmpCodigo, String prmespPrmrolCodigo, String prmrolEmpCodigo, String prmrolCodigo) {
        this.prmespPrmrolEmpCodigo = prmespPrmrolEmpCodigo;
        this.prmespPrmrolCodigo = prmespPrmrolCodigo;
        this.prmrolEmpCodigo = prmrolEmpCodigo;
        this.prmrolCodigo = prmrolCodigo;
    }

    public String getPrmespPrmrolEmpCodigo() {
        return prmespPrmrolEmpCodigo;
    }

    public void setPrmespPrmrolEmpCodigo(String prmespPrmrolEmpCodigo) {
        this.prmespPrmrolEmpCodigo = prmespPrmrolEmpCodigo;
    }

    public String getPrmespPrmrolCodigo() {
        return prmespPrmrolCodigo;
    }

    public void setPrmespPrmrolCodigo(String prmespPrmrolCodigo) {
        this.prmespPrmrolCodigo = prmespPrmrolCodigo;
    }

    public String getPrmrolEmpCodigo() {
        return prmrolEmpCodigo;
    }

    public void setPrmrolEmpCodigo(String prmrolEmpCodigo) {
        this.prmrolEmpCodigo = prmrolEmpCodigo;
    }

    public String getPrmrolCodigo() {
        return prmrolCodigo;
    }

    public void setPrmrolCodigo(String prmrolCodigo) {
        this.prmrolCodigo = prmrolCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmespPrmrolEmpCodigo != null ? prmespPrmrolEmpCodigo.hashCode() : 0);
        hash += (prmespPrmrolCodigo != null ? prmespPrmrolCodigo.hashCode() : 0);
        hash += (prmrolEmpCodigo != null ? prmrolEmpCodigo.hashCode() : 0);
        hash += (prmrolCodigo != null ? prmrolCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosIntervienenPK)) {
            return false;
        }
        DatosIntervienenPK other = (DatosIntervienenPK) object;
        if ((this.prmespPrmrolEmpCodigo == null && other.prmespPrmrolEmpCodigo != null) || (this.prmespPrmrolEmpCodigo != null && !this.prmespPrmrolEmpCodigo.equals(other.prmespPrmrolEmpCodigo))) {
            return false;
        }
        if ((this.prmespPrmrolCodigo == null && other.prmespPrmrolCodigo != null) || (this.prmespPrmrolCodigo != null && !this.prmespPrmrolCodigo.equals(other.prmespPrmrolCodigo))) {
            return false;
        }
        if ((this.prmrolEmpCodigo == null && other.prmrolEmpCodigo != null) || (this.prmrolEmpCodigo != null && !this.prmrolEmpCodigo.equals(other.prmrolEmpCodigo))) {
            return false;
        }
        if ((this.prmrolCodigo == null && other.prmrolCodigo != null) || (this.prmrolCodigo != null && !this.prmrolCodigo.equals(other.prmrolCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DatosIntervienenPK[ prmespPrmrolEmpCodigo=" + prmespPrmrolEmpCodigo + ", prmespPrmrolCodigo=" + prmespPrmrolCodigo + ", prmrolEmpCodigo=" + prmrolEmpCodigo + ", prmrolCodigo=" + prmrolCodigo + " ]";
    }
    
}
