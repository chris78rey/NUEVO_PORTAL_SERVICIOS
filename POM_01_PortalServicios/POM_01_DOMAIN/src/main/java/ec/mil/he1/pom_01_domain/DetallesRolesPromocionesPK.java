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
public class DetallesRolesPromocionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRM_CODIGO")
    private String prmCodigo;
    @Basic(optional = false)
    @Column(name = "ROLPRM_ROL")
    private String rolprmRol;

    public DetallesRolesPromocionesPK() {
    }

    public DetallesRolesPromocionesPK(String prmCodigo, String rolprmRol) {
        this.prmCodigo = prmCodigo;
        this.rolprmRol = rolprmRol;
    }

    public String getPrmCodigo() {
        return prmCodigo;
    }

    public void setPrmCodigo(String prmCodigo) {
        this.prmCodigo = prmCodigo;
    }

    public String getRolprmRol() {
        return rolprmRol;
    }

    public void setRolprmRol(String rolprmRol) {
        this.rolprmRol = rolprmRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmCodigo != null ? prmCodigo.hashCode() : 0);
        hash += (rolprmRol != null ? rolprmRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesRolesPromocionesPK)) {
            return false;
        }
        DetallesRolesPromocionesPK other = (DetallesRolesPromocionesPK) object;
        if ((this.prmCodigo == null && other.prmCodigo != null) || (this.prmCodigo != null && !this.prmCodigo.equals(other.prmCodigo))) {
            return false;
        }
        if ((this.rolprmRol == null && other.rolprmRol != null) || (this.rolprmRol != null && !this.rolprmRol.equals(other.rolprmRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesRolesPromocionesPK[ prmCodigo=" + prmCodigo + ", rolprmRol=" + rolprmRol + " ]";
    }
    
}
