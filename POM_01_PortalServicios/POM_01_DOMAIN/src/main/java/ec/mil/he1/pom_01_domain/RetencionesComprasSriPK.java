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
public class RetencionesComprasSriPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CMPNCNDSRI_IVA_EMP_CODIGO")
    private String cmpncndsriIvaEmpCodigo;
    @Basic(optional = false)
    @Column(name = "CMPNCNDSRI_IVA_PERIODO")
    private String cmpncndsriIvaPeriodo;
    @Basic(optional = false)
    @Column(name = "CMPNCNDSRI_NUMERO")
    private int cmpncndsriNumero;
    @Basic(optional = false)
    @Column(name = "CODIGO_RF")
    private String codigoRf;

    public RetencionesComprasSriPK() {
    }

    public RetencionesComprasSriPK(String cmpncndsriIvaEmpCodigo, String cmpncndsriIvaPeriodo, int cmpncndsriNumero, String codigoRf) {
        this.cmpncndsriIvaEmpCodigo = cmpncndsriIvaEmpCodigo;
        this.cmpncndsriIvaPeriodo = cmpncndsriIvaPeriodo;
        this.cmpncndsriNumero = cmpncndsriNumero;
        this.codigoRf = codigoRf;
    }

    public String getCmpncndsriIvaEmpCodigo() {
        return cmpncndsriIvaEmpCodigo;
    }

    public void setCmpncndsriIvaEmpCodigo(String cmpncndsriIvaEmpCodigo) {
        this.cmpncndsriIvaEmpCodigo = cmpncndsriIvaEmpCodigo;
    }

    public String getCmpncndsriIvaPeriodo() {
        return cmpncndsriIvaPeriodo;
    }

    public void setCmpncndsriIvaPeriodo(String cmpncndsriIvaPeriodo) {
        this.cmpncndsriIvaPeriodo = cmpncndsriIvaPeriodo;
    }

    public int getCmpncndsriNumero() {
        return cmpncndsriNumero;
    }

    public void setCmpncndsriNumero(int cmpncndsriNumero) {
        this.cmpncndsriNumero = cmpncndsriNumero;
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
        hash += (cmpncndsriIvaEmpCodigo != null ? cmpncndsriIvaEmpCodigo.hashCode() : 0);
        hash += (cmpncndsriIvaPeriodo != null ? cmpncndsriIvaPeriodo.hashCode() : 0);
        hash += (int) cmpncndsriNumero;
        hash += (codigoRf != null ? codigoRf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesComprasSriPK)) {
            return false;
        }
        RetencionesComprasSriPK other = (RetencionesComprasSriPK) object;
        if ((this.cmpncndsriIvaEmpCodigo == null && other.cmpncndsriIvaEmpCodigo != null) || (this.cmpncndsriIvaEmpCodigo != null && !this.cmpncndsriIvaEmpCodigo.equals(other.cmpncndsriIvaEmpCodigo))) {
            return false;
        }
        if ((this.cmpncndsriIvaPeriodo == null && other.cmpncndsriIvaPeriodo != null) || (this.cmpncndsriIvaPeriodo != null && !this.cmpncndsriIvaPeriodo.equals(other.cmpncndsriIvaPeriodo))) {
            return false;
        }
        if (this.cmpncndsriNumero != other.cmpncndsriNumero) {
            return false;
        }
        if ((this.codigoRf == null && other.codigoRf != null) || (this.codigoRf != null && !this.codigoRf.equals(other.codigoRf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RetencionesComprasSriPK[ cmpncndsriIvaEmpCodigo=" + cmpncndsriIvaEmpCodigo + ", cmpncndsriIvaPeriodo=" + cmpncndsriIvaPeriodo + ", cmpncndsriNumero=" + cmpncndsriNumero + ", codigoRf=" + codigoRf + " ]";
    }
    
}
