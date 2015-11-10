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
public class PermisosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COMPONENTE")
    private String componente;
    @Basic(optional = false)
    @Column(name = "MDL_MODULO")
    private String mdlModulo;
    @Basic(optional = false)
    @Column(name = "ROLE")
    private String role;

    public PermisosPK() {
    }

    public PermisosPK(String componente, String mdlModulo, String role) {
        this.componente = componente;
        this.mdlModulo = mdlModulo;
        this.role = role;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getMdlModulo() {
        return mdlModulo;
    }

    public void setMdlModulo(String mdlModulo) {
        this.mdlModulo = mdlModulo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (componente != null ? componente.hashCode() : 0);
        hash += (mdlModulo != null ? mdlModulo.hashCode() : 0);
        hash += (role != null ? role.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermisosPK)) {
            return false;
        }
        PermisosPK other = (PermisosPK) object;
        if ((this.componente == null && other.componente != null) || (this.componente != null && !this.componente.equals(other.componente))) {
            return false;
        }
        if ((this.mdlModulo == null && other.mdlModulo != null) || (this.mdlModulo != null && !this.mdlModulo.equals(other.mdlModulo))) {
            return false;
        }
        if ((this.role == null && other.role != null) || (this.role != null && !this.role.equals(other.role))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PermisosPK[ componente=" + componente + ", mdlModulo=" + mdlModulo + ", role=" + role + " ]";
    }
    
}
