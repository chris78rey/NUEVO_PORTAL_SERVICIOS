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
public class TiposComprobantesEmpresasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Basic(optional = false)
    @Column(name = "TPOCMP_CODIGO")
    private String tpocmpCodigo;

    public TiposComprobantesEmpresasPK() {
    }

    public TiposComprobantesEmpresasPK(String empCodigo, String tpocmpCodigo) {
        this.empCodigo = empCodigo;
        this.tpocmpCodigo = tpocmpCodigo;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getTpocmpCodigo() {
        return tpocmpCodigo;
    }

    public void setTpocmpCodigo(String tpocmpCodigo) {
        this.tpocmpCodigo = tpocmpCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empCodigo != null ? empCodigo.hashCode() : 0);
        hash += (tpocmpCodigo != null ? tpocmpCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposComprobantesEmpresasPK)) {
            return false;
        }
        TiposComprobantesEmpresasPK other = (TiposComprobantesEmpresasPK) object;
        if ((this.empCodigo == null && other.empCodigo != null) || (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
            return false;
        }
        if ((this.tpocmpCodigo == null && other.tpocmpCodigo != null) || (this.tpocmpCodigo != null && !this.tpocmpCodigo.equals(other.tpocmpCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TiposComprobantesEmpresasPK[ empCodigo=" + empCodigo + ", tpocmpCodigo=" + tpocmpCodigo + " ]";
    }
    
}
