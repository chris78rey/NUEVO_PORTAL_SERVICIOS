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
public class NovedadesRolesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ROLPGS_EMP_CODIGO")
    private String rolpgsEmpCodigo;
    @Basic(optional = false)
    @Column(name = "ROLPGS_NUMERO")
    private int rolpgsNumero;
    @Basic(optional = false)
    @Column(name = "PRMROL_EMP_CODIGO")
    private String prmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "PRMROL_CODIGO")
    private String prmrolCodigo;
    @Basic(optional = false)
    @Column(name = "EMPROL_EMP_CODIGO")
    private String emprolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "EMPROL_CODIGO")
    private int emprolCodigo;

    public NovedadesRolesPK() {
    }

    public NovedadesRolesPK(String rolpgsEmpCodigo, int rolpgsNumero, String prmrolEmpCodigo, String prmrolCodigo, String emprolEmpCodigo, int emprolCodigo) {
        this.rolpgsEmpCodigo = rolpgsEmpCodigo;
        this.rolpgsNumero = rolpgsNumero;
        this.prmrolEmpCodigo = prmrolEmpCodigo;
        this.prmrolCodigo = prmrolCodigo;
        this.emprolEmpCodigo = emprolEmpCodigo;
        this.emprolCodigo = emprolCodigo;
    }

    public String getRolpgsEmpCodigo() {
        return rolpgsEmpCodigo;
    }

    public void setRolpgsEmpCodigo(String rolpgsEmpCodigo) {
        this.rolpgsEmpCodigo = rolpgsEmpCodigo;
    }

    public int getRolpgsNumero() {
        return rolpgsNumero;
    }

    public void setRolpgsNumero(int rolpgsNumero) {
        this.rolpgsNumero = rolpgsNumero;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolpgsEmpCodigo != null ? rolpgsEmpCodigo.hashCode() : 0);
        hash += (int) rolpgsNumero;
        hash += (prmrolEmpCodigo != null ? prmrolEmpCodigo.hashCode() : 0);
        hash += (prmrolCodigo != null ? prmrolCodigo.hashCode() : 0);
        hash += (emprolEmpCodigo != null ? emprolEmpCodigo.hashCode() : 0);
        hash += (int) emprolCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NovedadesRolesPK)) {
            return false;
        }
        NovedadesRolesPK other = (NovedadesRolesPK) object;
        if ((this.rolpgsEmpCodigo == null && other.rolpgsEmpCodigo != null) || (this.rolpgsEmpCodigo != null && !this.rolpgsEmpCodigo.equals(other.rolpgsEmpCodigo))) {
            return false;
        }
        if (this.rolpgsNumero != other.rolpgsNumero) {
            return false;
        }
        if ((this.prmrolEmpCodigo == null && other.prmrolEmpCodigo != null) || (this.prmrolEmpCodigo != null && !this.prmrolEmpCodigo.equals(other.prmrolEmpCodigo))) {
            return false;
        }
        if ((this.prmrolCodigo == null && other.prmrolCodigo != null) || (this.prmrolCodigo != null && !this.prmrolCodigo.equals(other.prmrolCodigo))) {
            return false;
        }
        if ((this.emprolEmpCodigo == null && other.emprolEmpCodigo != null) || (this.emprolEmpCodigo != null && !this.emprolEmpCodigo.equals(other.emprolEmpCodigo))) {
            return false;
        }
        if (this.emprolCodigo != other.emprolCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.NovedadesRolesPK[ rolpgsEmpCodigo=" + rolpgsEmpCodigo + ", rolpgsNumero=" + rolpgsNumero + ", prmrolEmpCodigo=" + prmrolEmpCodigo + ", prmrolCodigo=" + prmrolCodigo + ", emprolEmpCodigo=" + emprolEmpCodigo + ", emprolCodigo=" + emprolCodigo + " ]";
    }
    
}
