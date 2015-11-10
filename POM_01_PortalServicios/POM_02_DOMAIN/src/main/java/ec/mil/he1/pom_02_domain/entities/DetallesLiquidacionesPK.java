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
public class DetallesLiquidacionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "LQD_NUMERO")
    private int lqdNumero;
    @Basic(optional = false)
    @Column(name = "PRMROL_EMP_CODIGO")
    private String prmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "PRMROL_CODIGO")
    private String prmrolCodigo;

    public DetallesLiquidacionesPK() {
    }

    public DetallesLiquidacionesPK(int lqdNumero, String prmrolEmpCodigo, String prmrolCodigo) {
        this.lqdNumero = lqdNumero;
        this.prmrolEmpCodigo = prmrolEmpCodigo;
        this.prmrolCodigo = prmrolCodigo;
    }

    public int getLqdNumero() {
        return lqdNumero;
    }

    public void setLqdNumero(int lqdNumero) {
        this.lqdNumero = lqdNumero;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) lqdNumero;
        hash += (prmrolEmpCodigo != null ? prmrolEmpCodigo.hashCode() : 0);
        hash += (prmrolCodigo != null ? prmrolCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesLiquidacionesPK)) {
            return false;
        }
        DetallesLiquidacionesPK other = (DetallesLiquidacionesPK) object;
        if (this.lqdNumero != other.lqdNumero) {
            return false;
        }
        if ((this.prmrolEmpCodigo == null && other.prmrolEmpCodigo != null) || (this.prmrolEmpCodigo != null && !this.prmrolEmpCodigo.equals(other.prmrolEmpCodigo))) {
            return false;
        }
        if ((this.prmrolCodigo == null && other.prmrolCodigo != null) || (this.prmrolCodigo != null && !this.prmrolCodigo.equals(other.prmrolCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesLiquidacionesPK[ lqdNumero=" + lqdNumero + ", prmrolEmpCodigo=" + prmrolEmpCodigo + ", prmrolCodigo=" + prmrolCodigo + " ]";
    }
    
}
