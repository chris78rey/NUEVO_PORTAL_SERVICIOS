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
public class DetallesDeSolicitudPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SLCCMP_CODIGO")
    private int slccmpCodigo;
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

    public DetallesDeSolicitudPK() {
    }

    public DetallesDeSolicitudPK(int slccmpCodigo, Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo) {
        this.slccmpCodigo = slccmpCodigo;
        this.itmTipo = itmTipo;
        this.itmSbsSccCodigo = itmSbsSccCodigo;
        this.itmSbsCodigo = itmSbsCodigo;
        this.itmCodigo = itmCodigo;
    }

    public int getSlccmpCodigo() {
        return slccmpCodigo;
    }

    public void setSlccmpCodigo(int slccmpCodigo) {
        this.slccmpCodigo = slccmpCodigo;
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
        hash += (int) slccmpCodigo;
        hash += (itmTipo != null ? itmTipo.hashCode() : 0);
        hash += (itmSbsSccCodigo != null ? itmSbsSccCodigo.hashCode() : 0);
        hash += (itmSbsCodigo != null ? itmSbsCodigo.hashCode() : 0);
        hash += (int) itmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDeSolicitudPK)) {
            return false;
        }
        DetallesDeSolicitudPK other = (DetallesDeSolicitudPK) object;
        if (this.slccmpCodigo != other.slccmpCodigo) {
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
        return "ec.mil.he1.pom_01_domain.DetallesDeSolicitudPK[ slccmpCodigo=" + slccmpCodigo + ", itmTipo=" + itmTipo + ", itmSbsSccCodigo=" + itmSbsSccCodigo + ", itmSbsCodigo=" + itmSbsCodigo + ", itmCodigo=" + itmCodigo + " ]";
    }
    
}
