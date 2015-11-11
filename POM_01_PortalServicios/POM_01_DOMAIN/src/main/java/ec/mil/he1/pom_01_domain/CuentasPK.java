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
public class CuentasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DOCUMENTO")
    private String documento;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private long numero;
    @Basic(optional = false)
    @Column(name = "DETALLE")
    private int detalle;
    @Basic(optional = false)
    @Column(name = "SEGURO")
    private Character seguro;

    public CuentasPK() {
    }

    public CuentasPK(String documento, long numero, int detalle, Character seguro) {
        this.documento = documento;
        this.numero = numero;
        this.detalle = detalle;
        this.seguro = seguro;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
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

    public Character getSeguro() {
        return seguro;
    }

    public void setSeguro(Character seguro) {
        this.seguro = seguro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documento != null ? documento.hashCode() : 0);
        hash += (int) numero;
        hash += (int) detalle;
        hash += (seguro != null ? seguro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasPK)) {
            return false;
        }
        CuentasPK other = (CuentasPK) object;
        if ((this.documento == null && other.documento != null) || (this.documento != null && !this.documento.equals(other.documento))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.detalle != other.detalle) {
            return false;
        }
        if ((this.seguro == null && other.seguro != null) || (this.seguro != null && !this.seguro.equals(other.seguro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CuentasPK[ documento=" + documento + ", numero=" + numero + ", detalle=" + detalle + ", seguro=" + seguro + " ]";
    }
    
}
