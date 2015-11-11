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
public class RetencionesRelacionDependencPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RTNFNT_EMP_CODIGO")
    private String rtnfntEmpCodigo;
    @Basic(optional = false)
    @Column(name = "RTNFNT_ANIO")
    private short rtnfntAnio;
    @Basic(optional = false)
    @Column(name = "RTNFNT_TIPO")
    private String rtnfntTipo;
    @Basic(optional = false)
    @Column(name = "IDENTIFICACION_EMP")
    private String identificacionEmp;
    @Basic(optional = false)
    @Column(name = "RTNFNT_MES")
    private short rtnfntMes;

    public RetencionesRelacionDependencPK() {
    }

    public RetencionesRelacionDependencPK(String rtnfntEmpCodigo, short rtnfntAnio, String rtnfntTipo, String identificacionEmp, short rtnfntMes) {
        this.rtnfntEmpCodigo = rtnfntEmpCodigo;
        this.rtnfntAnio = rtnfntAnio;
        this.rtnfntTipo = rtnfntTipo;
        this.identificacionEmp = identificacionEmp;
        this.rtnfntMes = rtnfntMes;
    }

    public String getRtnfntEmpCodigo() {
        return rtnfntEmpCodigo;
    }

    public void setRtnfntEmpCodigo(String rtnfntEmpCodigo) {
        this.rtnfntEmpCodigo = rtnfntEmpCodigo;
    }

    public short getRtnfntAnio() {
        return rtnfntAnio;
    }

    public void setRtnfntAnio(short rtnfntAnio) {
        this.rtnfntAnio = rtnfntAnio;
    }

    public String getRtnfntTipo() {
        return rtnfntTipo;
    }

    public void setRtnfntTipo(String rtnfntTipo) {
        this.rtnfntTipo = rtnfntTipo;
    }

    public String getIdentificacionEmp() {
        return identificacionEmp;
    }

    public void setIdentificacionEmp(String identificacionEmp) {
        this.identificacionEmp = identificacionEmp;
    }

    public short getRtnfntMes() {
        return rtnfntMes;
    }

    public void setRtnfntMes(short rtnfntMes) {
        this.rtnfntMes = rtnfntMes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rtnfntEmpCodigo != null ? rtnfntEmpCodigo.hashCode() : 0);
        hash += (int) rtnfntAnio;
        hash += (rtnfntTipo != null ? rtnfntTipo.hashCode() : 0);
        hash += (identificacionEmp != null ? identificacionEmp.hashCode() : 0);
        hash += (int) rtnfntMes;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesRelacionDependencPK)) {
            return false;
        }
        RetencionesRelacionDependencPK other = (RetencionesRelacionDependencPK) object;
        if ((this.rtnfntEmpCodigo == null && other.rtnfntEmpCodigo != null) || (this.rtnfntEmpCodigo != null && !this.rtnfntEmpCodigo.equals(other.rtnfntEmpCodigo))) {
            return false;
        }
        if (this.rtnfntAnio != other.rtnfntAnio) {
            return false;
        }
        if ((this.rtnfntTipo == null && other.rtnfntTipo != null) || (this.rtnfntTipo != null && !this.rtnfntTipo.equals(other.rtnfntTipo))) {
            return false;
        }
        if ((this.identificacionEmp == null && other.identificacionEmp != null) || (this.identificacionEmp != null && !this.identificacionEmp.equals(other.identificacionEmp))) {
            return false;
        }
        if (this.rtnfntMes != other.rtnfntMes) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RetencionesRelacionDependencPK[ rtnfntEmpCodigo=" + rtnfntEmpCodigo + ", rtnfntAnio=" + rtnfntAnio + ", rtnfntTipo=" + rtnfntTipo + ", identificacionEmp=" + identificacionEmp + ", rtnfntMes=" + rtnfntMes + " ]";
    }
    
}
