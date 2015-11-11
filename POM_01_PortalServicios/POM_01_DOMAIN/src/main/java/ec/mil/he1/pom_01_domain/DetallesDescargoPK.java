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
public class DetallesDescargoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DSCBTC_NUMERO")
    private int dscbtcNumero;
    @Basic(optional = false)
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Basic(optional = false)
    @Column(name = "ITM_CODIGO")
    private short itmCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;

    public DetallesDescargoPK() {
    }

    public DetallesDescargoPK(int dscbtcNumero, Character itmTipo, short itmCodigo, String itmSbsCodigo, String itmSbsSccCodigo) {
        this.dscbtcNumero = dscbtcNumero;
        this.itmTipo = itmTipo;
        this.itmCodigo = itmCodigo;
        this.itmSbsCodigo = itmSbsCodigo;
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public int getDscbtcNumero() {
        return dscbtcNumero;
    }

    public void setDscbtcNumero(int dscbtcNumero) {
        this.dscbtcNumero = dscbtcNumero;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dscbtcNumero;
        hash += (itmTipo != null ? itmTipo.hashCode() : 0);
        hash += (int) itmCodigo;
        hash += (itmSbsCodigo != null ? itmSbsCodigo.hashCode() : 0);
        hash += (itmSbsSccCodigo != null ? itmSbsSccCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDescargoPK)) {
            return false;
        }
        DetallesDescargoPK other = (DetallesDescargoPK) object;
        if (this.dscbtcNumero != other.dscbtcNumero) {
            return false;
        }
        if ((this.itmTipo == null && other.itmTipo != null) || (this.itmTipo != null && !this.itmTipo.equals(other.itmTipo))) {
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
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDescargoPK[ dscbtcNumero=" + dscbtcNumero + ", itmTipo=" + itmTipo + ", itmCodigo=" + itmCodigo + ", itmSbsCodigo=" + itmSbsCodigo + ", itmSbsSccCodigo=" + itmSbsSccCodigo + " ]";
    }
    
}
