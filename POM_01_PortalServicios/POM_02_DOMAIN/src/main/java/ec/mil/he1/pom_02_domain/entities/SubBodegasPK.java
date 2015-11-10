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
public class SubBodegasPK implements Serializable {
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
    @Basic(optional = false)
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;

    public SubBodegasPK() {
    }

    public SubBodegasPK(Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo, String dprCodigo, String dprAraCodigo) {
        this.itmTipo = itmTipo;
        this.itmSbsSccCodigo = itmSbsSccCodigo;
        this.itmSbsCodigo = itmSbsCodigo;
        this.itmCodigo = itmCodigo;
        this.dprCodigo = dprCodigo;
        this.dprAraCodigo = dprAraCodigo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itmTipo != null ? itmTipo.hashCode() : 0);
        hash += (itmSbsSccCodigo != null ? itmSbsSccCodigo.hashCode() : 0);
        hash += (itmSbsCodigo != null ? itmSbsCodigo.hashCode() : 0);
        hash += (int) itmCodigo;
        hash += (dprCodigo != null ? dprCodigo.hashCode() : 0);
        hash += (dprAraCodigo != null ? dprAraCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubBodegasPK)) {
            return false;
        }
        SubBodegasPK other = (SubBodegasPK) object;
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
        if ((this.dprCodigo == null && other.dprCodigo != null) || (this.dprCodigo != null && !this.dprCodigo.equals(other.dprCodigo))) {
            return false;
        }
        if ((this.dprAraCodigo == null && other.dprAraCodigo != null) || (this.dprAraCodigo != null && !this.dprAraCodigo.equals(other.dprAraCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SubBodegasPK[ itmTipo=" + itmTipo + ", itmSbsSccCodigo=" + itmSbsSccCodigo + ", itmSbsCodigo=" + itmSbsCodigo + ", itmCodigo=" + itmCodigo + ", dprCodigo=" + dprCodigo + ", dprAraCodigo=" + dprAraCodigo + " ]";
    }
    
}
