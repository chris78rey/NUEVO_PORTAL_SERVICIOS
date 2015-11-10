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
public class DetallesTemporalesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EGRBTC_NUMERO")
    private int egrbtcNumero;
    @Basic(optional = false)
    @Column(name = "EGRBTC_TIPO")
    private String egrbtcTipo;
    @Basic(optional = false)
    @Column(name = "ITM_CODIGO")
    private short itmCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_TIPO")
    private Character itmTipo;

    public DetallesTemporalesPK() {
    }

    public DetallesTemporalesPK(int egrbtcNumero, String egrbtcTipo, short itmCodigo, String itmSbsCodigo, String itmSbsSccCodigo, Character itmTipo) {
        this.egrbtcNumero = egrbtcNumero;
        this.egrbtcTipo = egrbtcTipo;
        this.itmCodigo = itmCodigo;
        this.itmSbsCodigo = itmSbsCodigo;
        this.itmSbsSccCodigo = itmSbsSccCodigo;
        this.itmTipo = itmTipo;
    }

    public int getEgrbtcNumero() {
        return egrbtcNumero;
    }

    public void setEgrbtcNumero(int egrbtcNumero) {
        this.egrbtcNumero = egrbtcNumero;
    }

    public String getEgrbtcTipo() {
        return egrbtcTipo;
    }

    public void setEgrbtcTipo(String egrbtcTipo) {
        this.egrbtcTipo = egrbtcTipo;
    }

    public short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(short itmCodigo) {
        this.itmCodigo = itmCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) egrbtcNumero;
        hash += (egrbtcTipo != null ? egrbtcTipo.hashCode() : 0);
        hash += (int) itmCodigo;
        hash += (itmSbsCodigo != null ? itmSbsCodigo.hashCode() : 0);
        hash += (itmSbsSccCodigo != null ? itmSbsSccCodigo.hashCode() : 0);
        hash += (itmTipo != null ? itmTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesTemporalesPK)) {
            return false;
        }
        DetallesTemporalesPK other = (DetallesTemporalesPK) object;
        if (this.egrbtcNumero != other.egrbtcNumero) {
            return false;
        }
        if ((this.egrbtcTipo == null && other.egrbtcTipo != null) || (this.egrbtcTipo != null && !this.egrbtcTipo.equals(other.egrbtcTipo))) {
            return false;
        }
        if (this.itmCodigo != other.itmCodigo) {
            return false;
        }
        if ((this.itmSbsCodigo == null && other.itmSbsCodigo != null) || (this.itmSbsCodigo != null && !this.itmSbsCodigo.equals(other.itmSbsCodigo))) {
            return false;
        }
        if ((this.itmSbsSccCodigo == null && other.itmSbsSccCodigo != null) || (this.itmSbsSccCodigo != null && !this.itmSbsSccCodigo.equals(other.itmSbsSccCodigo))) {
            return false;
        }
        if ((this.itmTipo == null && other.itmTipo != null) || (this.itmTipo != null && !this.itmTipo.equals(other.itmTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesTemporalesPK[ egrbtcNumero=" + egrbtcNumero + ", egrbtcTipo=" + egrbtcTipo + ", itmCodigo=" + itmCodigo + ", itmSbsCodigo=" + itmSbsCodigo + ", itmSbsSccCodigo=" + itmSbsSccCodigo + ", itmTipo=" + itmTipo + " ]";
    }
    
}
