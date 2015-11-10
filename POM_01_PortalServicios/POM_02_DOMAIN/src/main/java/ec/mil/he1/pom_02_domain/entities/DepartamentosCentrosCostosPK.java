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
public class DepartamentosCentrosCostosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Basic(optional = false)
    @Column(name = "CNTCST_EMP_CODIGO")
    private String cntcstEmpCodigo;
    @Basic(optional = false)
    @Column(name = "CNTCST_TIPO")
    private String cntcstTipo;
    @Basic(optional = false)
    @Column(name = "CNTCST_AGRUPADOR")
    private String cntcstAgrupador;

    public DepartamentosCentrosCostosPK() {
    }

    public DepartamentosCentrosCostosPK(String dprAraCodigo, String dprCodigo, String cntcstEmpCodigo, String cntcstTipo, String cntcstAgrupador) {
        this.dprAraCodigo = dprAraCodigo;
        this.dprCodigo = dprCodigo;
        this.cntcstEmpCodigo = cntcstEmpCodigo;
        this.cntcstTipo = cntcstTipo;
        this.cntcstAgrupador = cntcstAgrupador;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getCntcstEmpCodigo() {
        return cntcstEmpCodigo;
    }

    public void setCntcstEmpCodigo(String cntcstEmpCodigo) {
        this.cntcstEmpCodigo = cntcstEmpCodigo;
    }

    public String getCntcstTipo() {
        return cntcstTipo;
    }

    public void setCntcstTipo(String cntcstTipo) {
        this.cntcstTipo = cntcstTipo;
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
        hash += (dprAraCodigo != null ? dprAraCodigo.hashCode() : 0);
        hash += (dprCodigo != null ? dprCodigo.hashCode() : 0);
        hash += (cntcstEmpCodigo != null ? cntcstEmpCodigo.hashCode() : 0);
        hash += (cntcstTipo != null ? cntcstTipo.hashCode() : 0);
        hash += (cntcstAgrupador != null ? cntcstAgrupador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentosCentrosCostosPK)) {
            return false;
        }
        DepartamentosCentrosCostosPK other = (DepartamentosCentrosCostosPK) object;
        if ((this.dprAraCodigo == null && other.dprAraCodigo != null) || (this.dprAraCodigo != null && !this.dprAraCodigo.equals(other.dprAraCodigo))) {
            return false;
        }
        if ((this.dprCodigo == null && other.dprCodigo != null) || (this.dprCodigo != null && !this.dprCodigo.equals(other.dprCodigo))) {
            return false;
        }
        if ((this.cntcstEmpCodigo == null && other.cntcstEmpCodigo != null) || (this.cntcstEmpCodigo != null && !this.cntcstEmpCodigo.equals(other.cntcstEmpCodigo))) {
            return false;
        }
        if ((this.cntcstTipo == null && other.cntcstTipo != null) || (this.cntcstTipo != null && !this.cntcstTipo.equals(other.cntcstTipo))) {
            return false;
        }
        if ((this.cntcstAgrupador == null && other.cntcstAgrupador != null) || (this.cntcstAgrupador != null && !this.cntcstAgrupador.equals(other.cntcstAgrupador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DepartamentosCentrosCostosPK[ dprAraCodigo=" + dprAraCodigo + ", dprCodigo=" + dprCodigo + ", cntcstEmpCodigo=" + cntcstEmpCodigo + ", cntcstTipo=" + cntcstTipo + ", cntcstAgrupador=" + cntcstAgrupador + " ]";
    }
    
}
