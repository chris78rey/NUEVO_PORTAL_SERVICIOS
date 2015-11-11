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
public class EmpleadosCentrosDeCostosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMPROL_EMP_CODIGO")
    private String emprolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "EMPROL_CODIGO")
    private int emprolCodigo;
    @Basic(optional = false)
    @Column(name = "CNTCST_TIPO")
    private String cntcstTipo;
    @Basic(optional = false)
    @Column(name = "CNTCST_EMP_CODIGO")
    private String cntcstEmpCodigo;
    @Basic(optional = false)
    @Column(name = "CNTCST_AGRUPADOR")
    private String cntcstAgrupador;

    public EmpleadosCentrosDeCostosPK() {
    }

    public EmpleadosCentrosDeCostosPK(String emprolEmpCodigo, int emprolCodigo, String cntcstTipo, String cntcstEmpCodigo, String cntcstAgrupador) {
        this.emprolEmpCodigo = emprolEmpCodigo;
        this.emprolCodigo = emprolCodigo;
        this.cntcstTipo = cntcstTipo;
        this.cntcstEmpCodigo = cntcstEmpCodigo;
        this.cntcstAgrupador = cntcstAgrupador;
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

    public String getCntcstTipo() {
        return cntcstTipo;
    }

    public void setCntcstTipo(String cntcstTipo) {
        this.cntcstTipo = cntcstTipo;
    }

    public String getCntcstEmpCodigo() {
        return cntcstEmpCodigo;
    }

    public void setCntcstEmpCodigo(String cntcstEmpCodigo) {
        this.cntcstEmpCodigo = cntcstEmpCodigo;
    }

    public String getCntcstAgrupador() {
        return cntcstAgrupador;
    }

    public void setCntcstAgrupador(String cntcstAgrupador) {
        this.cntcstAgrupador = cntcstAgrupador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emprolEmpCodigo != null ? emprolEmpCodigo.hashCode() : 0);
        hash += (int) emprolCodigo;
        hash += (cntcstTipo != null ? cntcstTipo.hashCode() : 0);
        hash += (cntcstEmpCodigo != null ? cntcstEmpCodigo.hashCode() : 0);
        hash += (cntcstAgrupador != null ? cntcstAgrupador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadosCentrosDeCostosPK)) {
            return false;
        }
        EmpleadosCentrosDeCostosPK other = (EmpleadosCentrosDeCostosPK) object;
        if ((this.emprolEmpCodigo == null && other.emprolEmpCodigo != null) || (this.emprolEmpCodigo != null && !this.emprolEmpCodigo.equals(other.emprolEmpCodigo))) {
            return false;
        }
        if (this.emprolCodigo != other.emprolCodigo) {
            return false;
        }
        if ((this.cntcstTipo == null && other.cntcstTipo != null) || (this.cntcstTipo != null && !this.cntcstTipo.equals(other.cntcstTipo))) {
            return false;
        }
        if ((this.cntcstEmpCodigo == null && other.cntcstEmpCodigo != null) || (this.cntcstEmpCodigo != null && !this.cntcstEmpCodigo.equals(other.cntcstEmpCodigo))) {
            return false;
        }
        if ((this.cntcstAgrupador == null && other.cntcstAgrupador != null) || (this.cntcstAgrupador != null && !this.cntcstAgrupador.equals(other.cntcstAgrupador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EmpleadosCentrosDeCostosPK[ emprolEmpCodigo=" + emprolEmpCodigo + ", emprolCodigo=" + emprolCodigo + ", cntcstTipo=" + cntcstTipo + ", cntcstEmpCodigo=" + cntcstEmpCodigo + ", cntcstAgrupador=" + cntcstAgrupador + " ]";
    }
    
}
