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
public class CargosTareasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TRADPR_CODIGO")
    private int tradprCodigo;
    @Basic(optional = false)
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Basic(optional = false)
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;

    public CargosTareasPK() {
    }

    public CargosTareasPK(int tradprCodigo, Character crgTipo, String crgCodigo) {
        this.tradprCodigo = tradprCodigo;
        this.crgTipo = crgTipo;
        this.crgCodigo = crgCodigo;
    }

    public int getTradprCodigo() {
        return tradprCodigo;
    }

    public void setTradprCodigo(int tradprCodigo) {
        this.tradprCodigo = tradprCodigo;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tradprCodigo;
        hash += (crgTipo != null ? crgTipo.hashCode() : 0);
        hash += (crgCodigo != null ? crgCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargosTareasPK)) {
            return false;
        }
        CargosTareasPK other = (CargosTareasPK) object;
        if (this.tradprCodigo != other.tradprCodigo) {
            return false;
        }
        if ((this.crgTipo == null && other.crgTipo != null) || (this.crgTipo != null && !this.crgTipo.equals(other.crgTipo))) {
            return false;
        }
        if ((this.crgCodigo == null && other.crgCodigo != null) || (this.crgCodigo != null && !this.crgCodigo.equals(other.crgCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CargosTareasPK[ tradprCodigo=" + tradprCodigo + ", crgTipo=" + crgTipo + ", crgCodigo=" + crgCodigo + " ]";
    }
    
}
