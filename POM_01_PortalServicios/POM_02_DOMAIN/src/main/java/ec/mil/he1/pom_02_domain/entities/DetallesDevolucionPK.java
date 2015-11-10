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
public class DetallesDevolucionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DVL_NUMERO")
    private int dvlNumero;
    @Basic(optional = false)
    @Column(name = "DTLFCT_DOCUMENTO")
    private Character dtlfctDocumento;
    @Basic(optional = false)
    @Column(name = "DTLFCT_FCT_NUMERO")
    private int dtlfctFctNumero;
    @Basic(optional = false)
    @Column(name = "DTLFCT_NUMERO")
    private long dtlfctNumero;
    @Basic(optional = false)
    @Column(name = "DTLFCT_DETALLE")
    private int dtlfctDetalle;

    public DetallesDevolucionPK() {
    }

    public DetallesDevolucionPK(int dvlNumero, Character dtlfctDocumento, int dtlfctFctNumero, long dtlfctNumero, int dtlfctDetalle) {
        this.dvlNumero = dvlNumero;
        this.dtlfctDocumento = dtlfctDocumento;
        this.dtlfctFctNumero = dtlfctFctNumero;
        this.dtlfctNumero = dtlfctNumero;
        this.dtlfctDetalle = dtlfctDetalle;
    }

    public int getDvlNumero() {
        return dvlNumero;
    }

    public void setDvlNumero(int dvlNumero) {
        this.dvlNumero = dvlNumero;
    }

    public Character getDtlfctDocumento() {
        return dtlfctDocumento;
    }

    public void setDtlfctDocumento(Character dtlfctDocumento) {
        this.dtlfctDocumento = dtlfctDocumento;
    }

    public int getDtlfctFctNumero() {
        return dtlfctFctNumero;
    }

    public void setDtlfctFctNumero(int dtlfctFctNumero) {
        this.dtlfctFctNumero = dtlfctFctNumero;
    }

    public long getDtlfctNumero() {
        return dtlfctNumero;
    }

    public void setDtlfctNumero(long dtlfctNumero) {
        this.dtlfctNumero = dtlfctNumero;
    }

    public int getDtlfctDetalle() {
        return dtlfctDetalle;
    }

    public void setDtlfctDetalle(int dtlfctDetalle) {
        this.dtlfctDetalle = dtlfctDetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dvlNumero;
        hash += (dtlfctDocumento != null ? dtlfctDocumento.hashCode() : 0);
        hash += (int) dtlfctFctNumero;
        hash += (int) dtlfctNumero;
        hash += (int) dtlfctDetalle;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDevolucionPK)) {
            return false;
        }
        DetallesDevolucionPK other = (DetallesDevolucionPK) object;
        if (this.dvlNumero != other.dvlNumero) {
            return false;
        }
        if ((this.dtlfctDocumento == null && other.dtlfctDocumento != null) || (this.dtlfctDocumento != null && !this.dtlfctDocumento.equals(other.dtlfctDocumento))) {
            return false;
        }
        if (this.dtlfctFctNumero != other.dtlfctFctNumero) {
            return false;
        }
        if (this.dtlfctNumero != other.dtlfctNumero) {
            return false;
        }
        if (this.dtlfctDetalle != other.dtlfctDetalle) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesDevolucionPK[ dvlNumero=" + dvlNumero + ", dtlfctDocumento=" + dtlfctDocumento + ", dtlfctFctNumero=" + dtlfctFctNumero + ", dtlfctNumero=" + dtlfctNumero + ", dtlfctDetalle=" + dtlfctDetalle + " ]";
    }
    
}
