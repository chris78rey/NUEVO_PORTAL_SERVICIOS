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
public class NotaCreditoElectronicaDtlPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NCES_NCR_CAJA")
    private String ncesNcrCaja;
    @Basic(optional = false)
    @Column(name = "NCES_NCR_NUMERO")
    private int ncesNcrNumero;
    @Basic(optional = false)
    @Column(name = "DTLFCT_DOCUMENTO")
    private Character dtlfctDocumento;
    @Basic(optional = false)
    @Column(name = "DTLFCT_NUMERO")
    private long dtlfctNumero;
    @Basic(optional = false)
    @Column(name = "DTLFCT_DETALLE")
    private int dtlfctDetalle;
    @Basic(optional = false)
    @Column(name = "DTLFCT_SEGURO")
    private Character dtlfctSeguro;

    public NotaCreditoElectronicaDtlPK() {
    }

    public NotaCreditoElectronicaDtlPK(String ncesNcrCaja, int ncesNcrNumero, Character dtlfctDocumento, long dtlfctNumero, int dtlfctDetalle, Character dtlfctSeguro) {
        this.ncesNcrCaja = ncesNcrCaja;
        this.ncesNcrNumero = ncesNcrNumero;
        this.dtlfctDocumento = dtlfctDocumento;
        this.dtlfctNumero = dtlfctNumero;
        this.dtlfctDetalle = dtlfctDetalle;
        this.dtlfctSeguro = dtlfctSeguro;
    }

    public String getNcesNcrCaja() {
        return ncesNcrCaja;
    }

    public void setNcesNcrCaja(String ncesNcrCaja) {
        this.ncesNcrCaja = ncesNcrCaja;
    }

    public int getNcesNcrNumero() {
        return ncesNcrNumero;
    }

    public void setNcesNcrNumero(int ncesNcrNumero) {
        this.ncesNcrNumero = ncesNcrNumero;
    }

    public Character getDtlfctDocumento() {
        return dtlfctDocumento;
    }

    public void setDtlfctDocumento(Character dtlfctDocumento) {
        this.dtlfctDocumento = dtlfctDocumento;
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

    public Character getDtlfctSeguro() {
        return dtlfctSeguro;
    }

    public void setDtlfctSeguro(Character dtlfctSeguro) {
        this.dtlfctSeguro = dtlfctSeguro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ncesNcrCaja != null ? ncesNcrCaja.hashCode() : 0);
        hash += (int) ncesNcrNumero;
        hash += (dtlfctDocumento != null ? dtlfctDocumento.hashCode() : 0);
        hash += (int) dtlfctNumero;
        hash += (int) dtlfctDetalle;
        hash += (dtlfctSeguro != null ? dtlfctSeguro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaCreditoElectronicaDtlPK)) {
            return false;
        }
        NotaCreditoElectronicaDtlPK other = (NotaCreditoElectronicaDtlPK) object;
        if ((this.ncesNcrCaja == null && other.ncesNcrCaja != null) || (this.ncesNcrCaja != null && !this.ncesNcrCaja.equals(other.ncesNcrCaja))) {
            return false;
        }
        if (this.ncesNcrNumero != other.ncesNcrNumero) {
            return false;
        }
        if ((this.dtlfctDocumento == null && other.dtlfctDocumento != null) || (this.dtlfctDocumento != null && !this.dtlfctDocumento.equals(other.dtlfctDocumento))) {
            return false;
        }
        if (this.dtlfctNumero != other.dtlfctNumero) {
            return false;
        }
        if (this.dtlfctDetalle != other.dtlfctDetalle) {
            return false;
        }
        if ((this.dtlfctSeguro == null && other.dtlfctSeguro != null) || (this.dtlfctSeguro != null && !this.dtlfctSeguro.equals(other.dtlfctSeguro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.NotaCreditoElectronicaDtlPK[ ncesNcrCaja=" + ncesNcrCaja + ", ncesNcrNumero=" + ncesNcrNumero + ", dtlfctDocumento=" + dtlfctDocumento + ", dtlfctNumero=" + dtlfctNumero + ", dtlfctDetalle=" + dtlfctDetalle + ", dtlfctSeguro=" + dtlfctSeguro + " ]";
    }
    
}
