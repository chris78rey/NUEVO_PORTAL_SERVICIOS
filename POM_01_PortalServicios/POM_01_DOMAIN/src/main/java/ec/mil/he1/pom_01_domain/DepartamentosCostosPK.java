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
public class DepartamentosCostosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Basic(optional = false)
    @Column(name = "ELMCST_NUMERO")
    private int elmcstNumero;

    public DepartamentosCostosPK() {
    }

    public DepartamentosCostosPK(String dprCodigo, String dprAraCodigo, int elmcstNumero) {
        this.dprCodigo = dprCodigo;
        this.dprAraCodigo = dprAraCodigo;
        this.elmcstNumero = elmcstNumero;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public int getElmcstNumero() {
        return elmcstNumero;
    }

    public void setElmcstNumero(int elmcstNumero) {
        this.elmcstNumero = elmcstNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dprCodigo != null ? dprCodigo.hashCode() : 0);
        hash += (dprAraCodigo != null ? dprAraCodigo.hashCode() : 0);
        hash += (int) elmcstNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentosCostosPK)) {
            return false;
        }
        DepartamentosCostosPK other = (DepartamentosCostosPK) object;
        if ((this.dprCodigo == null && other.dprCodigo != null) || (this.dprCodigo != null && !this.dprCodigo.equals(other.dprCodigo))) {
            return false;
        }
        if ((this.dprAraCodigo == null && other.dprAraCodigo != null) || (this.dprAraCodigo != null && !this.dprAraCodigo.equals(other.dprAraCodigo))) {
            return false;
        }
        if (this.elmcstNumero != other.elmcstNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DepartamentosCostosPK[ dprCodigo=" + dprCodigo + ", dprAraCodigo=" + dprAraCodigo + ", elmcstNumero=" + elmcstNumero + " ]";
    }
    
}
