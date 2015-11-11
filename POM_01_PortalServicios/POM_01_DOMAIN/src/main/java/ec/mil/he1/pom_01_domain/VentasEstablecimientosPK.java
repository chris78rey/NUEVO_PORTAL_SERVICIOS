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
public class VentasEstablecimientosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IVA_EMP_CODIGO")
    private String ivaEmpCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "IVA_PERIODO")
    private String ivaPeriodo;

    public VentasEstablecimientosPK() {
    }

    public VentasEstablecimientosPK(String ivaEmpCodigo, String codigo, String ivaPeriodo) {
        this.ivaEmpCodigo = ivaEmpCodigo;
        this.codigo = codigo;
        this.ivaPeriodo = ivaPeriodo;
    }

    public String getIvaEmpCodigo() {
        return ivaEmpCodigo;
    }

    public void setIvaEmpCodigo(String ivaEmpCodigo) {
        this.ivaEmpCodigo = ivaEmpCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIvaPeriodo() {
        return ivaPeriodo;
    }

    public void setIvaPeriodo(String ivaPeriodo) {
        this.ivaPeriodo = ivaPeriodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ivaEmpCodigo != null ? ivaEmpCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        hash += (ivaPeriodo != null ? ivaPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentasEstablecimientosPK)) {
            return false;
        }
        VentasEstablecimientosPK other = (VentasEstablecimientosPK) object;
        if ((this.ivaEmpCodigo == null && other.ivaEmpCodigo != null) || (this.ivaEmpCodigo != null && !this.ivaEmpCodigo.equals(other.ivaEmpCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        if ((this.ivaPeriodo == null && other.ivaPeriodo != null) || (this.ivaPeriodo != null && !this.ivaPeriodo.equals(other.ivaPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.VentasEstablecimientosPK[ ivaEmpCodigo=" + ivaEmpCodigo + ", codigo=" + codigo + ", ivaPeriodo=" + ivaPeriodo + " ]";
    }
    
}
