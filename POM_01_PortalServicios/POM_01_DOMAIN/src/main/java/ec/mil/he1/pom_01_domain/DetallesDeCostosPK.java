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
public class DetallesDeCostosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ELMCSTPRD_ELMCST_NUMERO")
    private int elmcstprdElmcstNumero;
    @Basic(optional = false)
    @Column(name = "ELMCSTPRD_PRD_NUMERO")
    private int elmcstprdPrdNumero;
    @Basic(optional = false)
    @Column(name = "CST_CODIGO")
    private String cstCodigo;
    @Basic(optional = false)
    @Column(name = "AGNCST_TIPO")
    private String agncstTipo;
    @Basic(optional = false)
    @Column(name = "AGNCST_CODIGO")
    private String agncstCodigo;

    public DetallesDeCostosPK() {
    }

    public DetallesDeCostosPK(int elmcstprdElmcstNumero, int elmcstprdPrdNumero, String cstCodigo, String agncstTipo, String agncstCodigo) {
        this.elmcstprdElmcstNumero = elmcstprdElmcstNumero;
        this.elmcstprdPrdNumero = elmcstprdPrdNumero;
        this.cstCodigo = cstCodigo;
        this.agncstTipo = agncstTipo;
        this.agncstCodigo = agncstCodigo;
    }

    public int getElmcstprdElmcstNumero() {
        return elmcstprdElmcstNumero;
    }

    public void setElmcstprdElmcstNumero(int elmcstprdElmcstNumero) {
        this.elmcstprdElmcstNumero = elmcstprdElmcstNumero;
    }

    public int getElmcstprdPrdNumero() {
        return elmcstprdPrdNumero;
    }

    public void setElmcstprdPrdNumero(int elmcstprdPrdNumero) {
        this.elmcstprdPrdNumero = elmcstprdPrdNumero;
    }

    public String getCstCodigo() {
        return cstCodigo;
    }

    public void setCstCodigo(String cstCodigo) {
        this.cstCodigo = cstCodigo;
    }

    public String getAgncstTipo() {
        return agncstTipo;
    }

    public void setAgncstTipo(String agncstTipo) {
        this.agncstTipo = agncstTipo;
    }

    public String getAgncstCodigo() {
        return agncstCodigo;
    }

    public void setAgncstCodigo(String agncstCodigo) {
        this.agncstCodigo = agncstCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) elmcstprdElmcstNumero;
        hash += (int) elmcstprdPrdNumero;
        hash += (cstCodigo != null ? cstCodigo.hashCode() : 0);
        hash += (agncstTipo != null ? agncstTipo.hashCode() : 0);
        hash += (agncstCodigo != null ? agncstCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDeCostosPK)) {
            return false;
        }
        DetallesDeCostosPK other = (DetallesDeCostosPK) object;
        if (this.elmcstprdElmcstNumero != other.elmcstprdElmcstNumero) {
            return false;
        }
        if (this.elmcstprdPrdNumero != other.elmcstprdPrdNumero) {
            return false;
        }
        if ((this.cstCodigo == null && other.cstCodigo != null) || (this.cstCodigo != null && !this.cstCodigo.equals(other.cstCodigo))) {
            return false;
        }
        if ((this.agncstTipo == null && other.agncstTipo != null) || (this.agncstTipo != null && !this.agncstTipo.equals(other.agncstTipo))) {
            return false;
        }
        if ((this.agncstCodigo == null && other.agncstCodigo != null) || (this.agncstCodigo != null && !this.agncstCodigo.equals(other.agncstCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDeCostosPK[ elmcstprdElmcstNumero=" + elmcstprdElmcstNumero + ", elmcstprdPrdNumero=" + elmcstprdPrdNumero + ", cstCodigo=" + cstCodigo + ", agncstTipo=" + agncstTipo + ", agncstCodigo=" + agncstCodigo + " ]";
    }
    
}
