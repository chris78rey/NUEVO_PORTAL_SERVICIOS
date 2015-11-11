/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

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
public class DosisQuimioterapiaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRSMDCQMT_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prsmdcqmtFecha;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private short numero;
    @Basic(optional = false)
    @Column(name = "PRSMDCQMT_QMT_NUMERO")
    private int prsmdcqmtQmtNumero;

    public DosisQuimioterapiaPK() {
    }

    public DosisQuimioterapiaPK(Date prsmdcqmtFecha, short numero, int prsmdcqmtQmtNumero) {
        this.prsmdcqmtFecha = prsmdcqmtFecha;
        this.numero = numero;
        this.prsmdcqmtQmtNumero = prsmdcqmtQmtNumero;
    }

    public Date getPrsmdcqmtFecha() {
        return prsmdcqmtFecha;
    }

    public void setPrsmdcqmtFecha(Date prsmdcqmtFecha) {
        this.prsmdcqmtFecha = prsmdcqmtFecha;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    public int getPrsmdcqmtQmtNumero() {
        return prsmdcqmtQmtNumero;
    }

    public void setPrsmdcqmtQmtNumero(int prsmdcqmtQmtNumero) {
        this.prsmdcqmtQmtNumero = prsmdcqmtQmtNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prsmdcqmtFecha != null ? prsmdcqmtFecha.hashCode() : 0);
        hash += (int) numero;
        hash += (int) prsmdcqmtQmtNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DosisQuimioterapiaPK)) {
            return false;
        }
        DosisQuimioterapiaPK other = (DosisQuimioterapiaPK) object;
        if ((this.prsmdcqmtFecha == null && other.prsmdcqmtFecha != null) || (this.prsmdcqmtFecha != null && !this.prsmdcqmtFecha.equals(other.prsmdcqmtFecha))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if (this.prsmdcqmtQmtNumero != other.prsmdcqmtQmtNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DosisQuimioterapiaPK[ prsmdcqmtFecha=" + prsmdcqmtFecha + ", numero=" + numero + ", prsmdcqmtQmtNumero=" + prsmdcqmtQmtNumero + " ]";
    }
    
}
