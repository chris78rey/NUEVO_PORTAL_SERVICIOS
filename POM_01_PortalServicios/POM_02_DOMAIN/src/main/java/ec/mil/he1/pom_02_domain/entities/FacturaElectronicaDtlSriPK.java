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
public class FacturaElectronicaDtlSriPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DTL_DOCUMENTO")
    private Character dtlDocumento;
    @Basic(optional = false)
    @Column(name = "DTL_NUMERO")
    private long dtlNumero;
    @Basic(optional = false)
    @Column(name = "DTL_DETALLE")
    private int dtlDetalle;
    @Basic(optional = false)
    @Column(name = "FCT_CAJA")
    private String fctCaja;
    @Basic(optional = false)
    @Column(name = "FCT_NUMERO")
    private int fctNumero;
    @Basic(optional = false)
    @Column(name = "DTL_SEGURO")
    private Character dtlSeguro;

    public FacturaElectronicaDtlSriPK() {
    }

    public FacturaElectronicaDtlSriPK(Character dtlDocumento, long dtlNumero, int dtlDetalle, String fctCaja, int fctNumero, Character dtlSeguro) {
        this.dtlDocumento = dtlDocumento;
        this.dtlNumero = dtlNumero;
        this.dtlDetalle = dtlDetalle;
        this.fctCaja = fctCaja;
        this.fctNumero = fctNumero;
        this.dtlSeguro = dtlSeguro;
    }

    public Character getDtlDocumento() {
        return dtlDocumento;
    }

    public void setDtlDocumento(Character dtlDocumento) {
        this.dtlDocumento = dtlDocumento;
    }

    public long getDtlNumero() {
        return dtlNumero;
    }

    public void setDtlNumero(long dtlNumero) {
        this.dtlNumero = dtlNumero;
    }

    public int getDtlDetalle() {
        return dtlDetalle;
    }

    public void setDtlDetalle(int dtlDetalle) {
        this.dtlDetalle = dtlDetalle;
    }

    public String getFctCaja() {
        return fctCaja;
    }

    public void setFctCaja(String fctCaja) {
        this.fctCaja = fctCaja;
    }

    public int getFctNumero() {
        return fctNumero;
    }

    public void setFctNumero(int fctNumero) {
        this.fctNumero = fctNumero;
    }

    public Character getDtlSeguro() {
        return dtlSeguro;
    }

    public void setDtlSeguro(Character dtlSeguro) {
        this.dtlSeguro = dtlSeguro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlDocumento != null ? dtlDocumento.hashCode() : 0);
        hash += (int) dtlNumero;
        hash += (int) dtlDetalle;
        hash += (fctCaja != null ? fctCaja.hashCode() : 0);
        hash += (int) fctNumero;
        hash += (dtlSeguro != null ? dtlSeguro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaElectronicaDtlSriPK)) {
            return false;
        }
        FacturaElectronicaDtlSriPK other = (FacturaElectronicaDtlSriPK) object;
        if ((this.dtlDocumento == null && other.dtlDocumento != null) || (this.dtlDocumento != null && !this.dtlDocumento.equals(other.dtlDocumento))) {
            return false;
        }
        if (this.dtlNumero != other.dtlNumero) {
            return false;
        }
        if (this.dtlDetalle != other.dtlDetalle) {
            return false;
        }
        if ((this.fctCaja == null && other.fctCaja != null) || (this.fctCaja != null && !this.fctCaja.equals(other.fctCaja))) {
            return false;
        }
        if (this.fctNumero != other.fctNumero) {
            return false;
        }
        if ((this.dtlSeguro == null && other.dtlSeguro != null) || (this.dtlSeguro != null && !this.dtlSeguro.equals(other.dtlSeguro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.FacturaElectronicaDtlSriPK[ dtlDocumento=" + dtlDocumento + ", dtlNumero=" + dtlNumero + ", dtlDetalle=" + dtlDetalle + ", fctCaja=" + fctCaja + ", fctNumero=" + fctNumero + ", dtlSeguro=" + dtlSeguro + " ]";
    }
    
}
