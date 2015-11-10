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
public class RetencionesVentasSriPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VNTSRI_IVA_EMP_CODIGO")
    private String vntsriIvaEmpCodigo;
    @Basic(optional = false)
    @Column(name = "VNTSRI_IVA_PERIODO")
    private String vntsriIvaPeriodo;
    @Basic(optional = false)
    @Column(name = "VNTSRI_NUMERO")
    private int vntsriNumero;
    @Basic(optional = false)
    @Column(name = "CODIGO_RF")
    private String codigoRf;

    public RetencionesVentasSriPK() {
    }

    public RetencionesVentasSriPK(String vntsriIvaEmpCodigo, String vntsriIvaPeriodo, int vntsriNumero, String codigoRf) {
        this.vntsriIvaEmpCodigo = vntsriIvaEmpCodigo;
        this.vntsriIvaPeriodo = vntsriIvaPeriodo;
        this.vntsriNumero = vntsriNumero;
        this.codigoRf = codigoRf;
    }

    public String getVntsriIvaEmpCodigo() {
        return vntsriIvaEmpCodigo;
    }

    public void setVntsriIvaEmpCodigo(String vntsriIvaEmpCodigo) {
        this.vntsriIvaEmpCodigo = vntsriIvaEmpCodigo;
    }

    public String getVntsriIvaPeriodo() {
        return vntsriIvaPeriodo;
    }

    public void setVntsriIvaPeriodo(String vntsriIvaPeriodo) {
        this.vntsriIvaPeriodo = vntsriIvaPeriodo;
    }

    public int getVntsriNumero() {
        return vntsriNumero;
    }

    public void setVntsriNumero(int vntsriNumero) {
        this.vntsriNumero = vntsriNumero;
    }

    public String getCodigoRf() {
        return codigoRf;
    }

    public void setCodigoRf(String codigoRf) {
        this.codigoRf = codigoRf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vntsriIvaEmpCodigo != null ? vntsriIvaEmpCodigo.hashCode() : 0);
        hash += (vntsriIvaPeriodo != null ? vntsriIvaPeriodo.hashCode() : 0);
        hash += (int) vntsriNumero;
        hash += (codigoRf != null ? codigoRf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesVentasSriPK)) {
            return false;
        }
        RetencionesVentasSriPK other = (RetencionesVentasSriPK) object;
        if ((this.vntsriIvaEmpCodigo == null && other.vntsriIvaEmpCodigo != null) || (this.vntsriIvaEmpCodigo != null && !this.vntsriIvaEmpCodigo.equals(other.vntsriIvaEmpCodigo))) {
            return false;
        }
        if ((this.vntsriIvaPeriodo == null && other.vntsriIvaPeriodo != null) || (this.vntsriIvaPeriodo != null && !this.vntsriIvaPeriodo.equals(other.vntsriIvaPeriodo))) {
            return false;
        }
        if (this.vntsriNumero != other.vntsriNumero) {
            return false;
        }
        if ((this.codigoRf == null && other.codigoRf != null) || (this.codigoRf != null && !this.codigoRf.equals(other.codigoRf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RetencionesVentasSriPK[ vntsriIvaEmpCodigo=" + vntsriIvaEmpCodigo + ", vntsriIvaPeriodo=" + vntsriIvaPeriodo + ", vntsriNumero=" + vntsriNumero + ", codigoRf=" + codigoRf + " ]";
    }
    
}
