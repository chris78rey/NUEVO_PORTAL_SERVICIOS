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
public class DetallesImpuestoRentaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TBLIMPRNT_ANO_RIGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tblimprntAnoRige;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public DetallesImpuestoRentaPK() {
    }

    public DetallesImpuestoRentaPK(Date tblimprntAnoRige, int numero) {
        this.tblimprntAnoRige = tblimprntAnoRige;
        this.numero = numero;
    }

    public Date getTblimprntAnoRige() {
        return tblimprntAnoRige;
    }

    public void setTblimprntAnoRige(Date tblimprntAnoRige) {
        this.tblimprntAnoRige = tblimprntAnoRige;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tblimprntAnoRige != null ? tblimprntAnoRige.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesImpuestoRentaPK)) {
            return false;
        }
        DetallesImpuestoRentaPK other = (DetallesImpuestoRentaPK) object;
        if ((this.tblimprntAnoRige == null && other.tblimprntAnoRige != null) || (this.tblimprntAnoRige != null && !this.tblimprntAnoRige.equals(other.tblimprntAnoRige))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesImpuestoRentaPK[ tblimprntAnoRige=" + tblimprntAnoRige + ", numero=" + numero + " ]";
    }
    
}
