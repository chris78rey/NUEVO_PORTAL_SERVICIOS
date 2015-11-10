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
public class ParametrosRolesEmpleadoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMPROL_EMP_CODIGO")
    private String emprolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "EMPROL_CODIGO")
    private int emprolCodigo;
    @Basic(optional = false)
    @Column(name = "PRMROL_EMP_CODIGO")
    private String prmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "PRMROL_CODIGO")
    private String prmrolCodigo;

    public ParametrosRolesEmpleadoPK() {
    }

    public ParametrosRolesEmpleadoPK(String emprolEmpCodigo, int emprolCodigo, String prmrolEmpCodigo, String prmrolCodigo) {
        this.emprolEmpCodigo = emprolEmpCodigo;
        this.emprolCodigo = emprolCodigo;
        this.prmrolEmpCodigo = prmrolEmpCodigo;
        this.prmrolCodigo = prmrolCodigo;
    }

    public String getEmprolEmpCodigo() {
        return emprolEmpCodigo;
    }

    public void setEmprolEmpCodigo(String emprolEmpCodigo) {
        this.emprolEmpCodigo = emprolEmpCodigo;
    }

    public int getEmprolCodigo() {
        return emprolCodigo;
    }

    public void setEmprolCodigo(int emprolCodigo) {
        this.emprolCodigo = emprolCodigo;
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
        hash += (emprolEmpCodigo != null ? emprolEmpCodigo.hashCode() : 0);
        hash += (int) emprolCodigo;
        hash += (prmrolEmpCodigo != null ? prmrolEmpCodigo.hashCode() : 0);
        hash += (prmrolCodigo != null ? prmrolCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosRolesEmpleadoPK)) {
            return false;
        }
        ParametrosRolesEmpleadoPK other = (ParametrosRolesEmpleadoPK) object;
        if ((this.emprolEmpCodigo == null && other.emprolEmpCodigo != null) || (this.emprolEmpCodigo != null && !this.emprolEmpCodigo.equals(other.emprolEmpCodigo))) {
            return false;
        }
        if (this.emprolCodigo != other.emprolCodigo) {
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
        return "ec.mil.he1.pom_02_domain.entities.ParametrosRolesEmpleadoPK[ emprolEmpCodigo=" + emprolEmpCodigo + ", emprolCodigo=" + emprolCodigo + ", prmrolEmpCodigo=" + prmrolEmpCodigo + ", prmrolCodigo=" + prmrolCodigo + " ]";
    }
    
}
