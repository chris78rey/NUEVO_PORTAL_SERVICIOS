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
public class DetalleCotizacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_CODIGO")
    private short itmCodigo;
    @Basic(optional = false)
    @Column(name = "OCE_NUMERO")
    private int oceNumero;
    @Basic(optional = false)
    @Column(name = "PRD_CODIGO")
    private short prdCodigo;

    public DetalleCotizacionPK() {
    }

    public DetalleCotizacionPK(String itmSbsCodigo, Character itmTipo, String itmSbsSccCodigo, short itmCodigo, int oceNumero, short prdCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
        this.itmTipo = itmTipo;
        this.itmSbsSccCodigo = itmSbsSccCodigo;
        this.itmCodigo = itmCodigo;
        this.oceNumero = oceNumero;
        this.prdCodigo = prdCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
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

    public short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(short itmCodigo) {
        this.itmCodigo = itmCodigo;
    }

    public int getOceNumero() {
        return oceNumero;
    }

    public void setOceNumero(int oceNumero) {
        this.oceNumero = oceNumero;
    }

    public short getPrdCodigo() {
        return prdCodigo;
    }

    public void setPrdCodigo(short prdCodigo) {
        this.prdCodigo = prdCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itmSbsCodigo != null ? itmSbsCodigo.hashCode() : 0);
        hash += (itmTipo != null ? itmTipo.hashCode() : 0);
        hash += (itmSbsSccCodigo != null ? itmSbsSccCodigo.hashCode() : 0);
        hash += (int) itmCodigo;
        hash += (int) oceNumero;
        hash += (int) prdCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCotizacionPK)) {
            return false;
        }
        DetalleCotizacionPK other = (DetalleCotizacionPK) object;
        if ((this.itmSbsCodigo == null && other.itmSbsCodigo != null) || (this.itmSbsCodigo != null && !this.itmSbsCodigo.equals(other.itmSbsCodigo))) {
            return false;
        }
        if ((this.itmTipo == null && other.itmTipo != null) || (this.itmTipo != null && !this.itmTipo.equals(other.itmTipo))) {
            return false;
        }
        if ((this.itmSbsSccCodigo == null && other.itmSbsSccCodigo != null) || (this.itmSbsSccCodigo != null && !this.itmSbsSccCodigo.equals(other.itmSbsSccCodigo))) {
            return false;
        }
        if (this.itmCodigo != other.itmCodigo) {
            return false;
        }
        if (this.oceNumero != other.oceNumero) {
            return false;
        }
        if (this.prdCodigo != other.prdCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetalleCotizacionPK[ itmSbsCodigo=" + itmSbsCodigo + ", itmTipo=" + itmTipo + ", itmSbsSccCodigo=" + itmSbsSccCodigo + ", itmCodigo=" + itmCodigo + ", oceNumero=" + oceNumero + ", prdCodigo=" + prdCodigo + " ]";
    }
    
}
