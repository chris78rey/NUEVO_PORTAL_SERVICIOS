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
public class BandejasItemsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "BND_EST_CODIGO")
    private String bndEstCodigo;
    @Basic(optional = false)
    @Column(name = "BND_CODIGO")
    private String bndCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_CODIGO")
    private short itmCodigo;

    public BandejasItemsPK() {
    }

    public BandejasItemsPK(String bndEstCodigo, String bndCodigo, Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo) {
        this.bndEstCodigo = bndEstCodigo;
        this.bndCodigo = bndCodigo;
        this.itmTipo = itmTipo;
        this.itmSbsSccCodigo = itmSbsSccCodigo;
        this.itmSbsCodigo = itmSbsCodigo;
        this.itmCodigo = itmCodigo;
    }

    public String getBndEstCodigo() {
        return bndEstCodigo;
    }

    public void setBndEstCodigo(String bndEstCodigo) {
        this.bndEstCodigo = bndEstCodigo;
    }

    public String getBndCodigo() {
        return bndCodigo;
    }

    public void setBndCodigo(String bndCodigo) {
        this.bndCodigo = bndCodigo;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(short itmCodigo) {
        this.itmCodigo = itmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bndEstCodigo != null ? bndEstCodigo.hashCode() : 0);
        hash += (bndCodigo != null ? bndCodigo.hashCode() : 0);
        hash += (itmTipo != null ? itmTipo.hashCode() : 0);
        hash += (itmSbsSccCodigo != null ? itmSbsSccCodigo.hashCode() : 0);
        hash += (itmSbsCodigo != null ? itmSbsCodigo.hashCode() : 0);
        hash += (int) itmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BandejasItemsPK)) {
            return false;
        }
        BandejasItemsPK other = (BandejasItemsPK) object;
        if ((this.bndEstCodigo == null && other.bndEstCodigo != null) || (this.bndEstCodigo != null && !this.bndEstCodigo.equals(other.bndEstCodigo))) {
            return false;
        }
        if ((this.bndCodigo == null && other.bndCodigo != null) || (this.bndCodigo != null && !this.bndCodigo.equals(other.bndCodigo))) {
            return false;
        }
        if ((this.itmTipo == null && other.itmTipo != null) || (this.itmTipo != null && !this.itmTipo.equals(other.itmTipo))) {
            return false;
        }
        if ((this.itmSbsSccCodigo == null && other.itmSbsSccCodigo != null) || (this.itmSbsSccCodigo != null && !this.itmSbsSccCodigo.equals(other.itmSbsSccCodigo))) {
            return false;
        }
        if ((this.itmSbsCodigo == null && other.itmSbsCodigo != null) || (this.itmSbsCodigo != null && !this.itmSbsCodigo.equals(other.itmSbsCodigo))) {
            return false;
        }
        if (this.itmCodigo != other.itmCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.BandejasItemsPK[ bndEstCodigo=" + bndEstCodigo + ", bndCodigo=" + bndCodigo + ", itmTipo=" + itmTipo + ", itmSbsSccCodigo=" + itmSbsSccCodigo + ", itmSbsCodigo=" + itmSbsCodigo + ", itmCodigo=" + itmCodigo + " ]";
    }
    
}
