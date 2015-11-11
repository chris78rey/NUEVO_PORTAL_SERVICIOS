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
public class DetallesPerfilPrescripcionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRFPRS_PRS_CODIGO")
    private String prfprsPrsCodigo;
    @Basic(optional = false)
    @Column(name = "PRFPRS_NUMERO")
    private short prfprsNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private short numero;

    public DetallesPerfilPrescripcionPK() {
    }

    public DetallesPerfilPrescripcionPK(String prfprsPrsCodigo, short prfprsNumero, short numero) {
        this.prfprsPrsCodigo = prfprsPrsCodigo;
        this.prfprsNumero = prfprsNumero;
        this.numero = numero;
    }

    public String getPrfprsPrsCodigo() {
        return prfprsPrsCodigo;
    }

    public void setPrfprsPrsCodigo(String prfprsPrsCodigo) {
        this.prfprsPrsCodigo = prfprsPrsCodigo;
    }

    public short getPrfprsNumero() {
        return prfprsNumero;
    }

    public void setPrfprsNumero(short prfprsNumero) {
        this.prfprsNumero = prfprsNumero;
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
        hash += (prfprsPrsCodigo != null ? prfprsPrsCodigo.hashCode() : 0);
        hash += (int) prfprsNumero;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPerfilPrescripcionPK)) {
            return false;
        }
        DetallesPerfilPrescripcionPK other = (DetallesPerfilPrescripcionPK) object;
        if ((this.prfprsPrsCodigo == null && other.prfprsPrsCodigo != null) || (this.prfprsPrsCodigo != null && !this.prfprsPrsCodigo.equals(other.prfprsPrsCodigo))) {
            return false;
        }
        if (this.prfprsNumero != other.prfprsNumero) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesPerfilPrescripcionPK[ prfprsPrsCodigo=" + prfprsPrsCodigo + ", prfprsNumero=" + prfprsNumero + ", numero=" + numero + " ]";
    }
    
}
