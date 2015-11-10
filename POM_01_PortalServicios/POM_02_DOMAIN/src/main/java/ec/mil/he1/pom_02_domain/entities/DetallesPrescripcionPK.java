/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class DetallesPrescripcionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRSMDC_PCN_NUMERO_HC")
    private int prsmdcPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "PRSMDC_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prsmdcFecha;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private short numero;

    public DetallesPrescripcionPK() {
    }

    public DetallesPrescripcionPK(int prsmdcPcnNumeroHc, Date prsmdcFecha, short numero) {
        this.prsmdcPcnNumeroHc = prsmdcPcnNumeroHc;
        this.prsmdcFecha = prsmdcFecha;
        this.numero = numero;
    }

    public int getPrsmdcPcnNumeroHc() {
        return prsmdcPcnNumeroHc;
    }

    public void setPrsmdcPcnNumeroHc(int prsmdcPcnNumeroHc) {
        this.prsmdcPcnNumeroHc = prsmdcPcnNumeroHc;
    }

    public Date getPrsmdcFecha() {
        return prsmdcFecha;
    }

    public void setPrsmdcFecha(Date prsmdcFecha) {
        this.prsmdcFecha = prsmdcFecha;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prsmdcPcnNumeroHc;
        hash += (prsmdcFecha != null ? prsmdcFecha.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPrescripcionPK)) {
            return false;
        }
        DetallesPrescripcionPK other = (DetallesPrescripcionPK) object;
        if (this.prsmdcPcnNumeroHc != other.prsmdcPcnNumeroHc) {
            return false;
        }
        if ((this.prsmdcFecha == null && other.prsmdcFecha != null) || (this.prsmdcFecha != null && !this.prsmdcFecha.equals(other.prsmdcFecha))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesPrescripcionPK[ prsmdcPcnNumeroHc=" + prsmdcPcnNumeroHc + ", prsmdcFecha=" + prsmdcFecha + ", numero=" + numero + " ]";
    }
    
}
