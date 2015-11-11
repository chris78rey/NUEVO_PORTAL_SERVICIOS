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
public class DetallesFacturaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FCT_CAJA")
    private String fctCaja;
    @Basic(optional = false)
    @Column(name = "DOCUMENTO")
    private Character documento;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private long numero;
    @Basic(optional = false)
    @Column(name = "DETALLE")
    private int detalle;
    @Basic(optional = false)
    @Column(name = "FCT_NUMERO")
    private int fctNumero;

    public DetallesFacturaPK() {
    }

    public DetallesFacturaPK(String fctCaja, Character documento, long numero, int detalle, int fctNumero) {
        this.fctCaja = fctCaja;
        this.documento = documento;
        this.numero = numero;
        this.detalle = detalle;
        this.fctNumero = fctNumero;
    }

    public String getFctCaja() {
        return fctCaja;
    }

    public void setFctCaja(String fctCaja) {
        this.fctCaja = fctCaja;
    }

    public Character getDocumento() {
        return documento;
    }

    public void setDocumento(Character documento) {
        this.documento = documento;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getDetalle() {
        return detalle;
    }

    public void setDetalle(int detalle) {
        this.detalle = detalle;
    }

    public int getFctNumero() {
        return fctNumero;
    }

    public void setFctNumero(int fctNumero) {
        this.fctNumero = fctNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fctCaja != null ? fctCaja.hashCode() : 0);
        hash += (documento != null ? documento.hashCode() : 0);
        hash += (int) numero;
        hash += (int) detalle;
        hash += (int) fctNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesFacturaPK)) {
            return false;
        }
        DetallesFacturaPK other = (DetallesFacturaPK) object;
        if ((this.fctCaja == null && other.fctCaja != null) || (this.fctCaja != null && !this.fctCaja.equals(other.fctCaja))) {
            return false;
        }
        if ((this.documento == null && other.documento != null) || (this.documento != null && !this.documento.equals(other.documento))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.detalle != other.detalle) {
            return false;
        }
        if (this.fctNumero != other.fctNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesFacturaPK[ fctCaja=" + fctCaja + ", documento=" + documento + ", numero=" + numero + ", detalle=" + detalle + ", fctNumero=" + fctNumero + " ]";
    }
    
}
