/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class NcrsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CJA_CODIGO")
    private String cjaCodigo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private BigInteger numero;

    public NcrsPK() {
    }

    public NcrsPK(String cjaCodigo, BigInteger numero) {
        this.cjaCodigo = cjaCodigo;
        this.numero = numero;
    }

    public String getCjaCodigo() {
        return cjaCodigo;
    }

    public void setCjaCodigo(String cjaCodigo) {
        this.cjaCodigo = cjaCodigo;
    }

    public BigInteger getNumero() {
        return numero;
    }

    public void setNumero(BigInteger numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cjaCodigo != null ? cjaCodigo.hashCode() : 0);
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NcrsPK)) {
            return false;
        }
        NcrsPK other = (NcrsPK) object;
        if ((this.cjaCodigo == null && other.cjaCodigo != null) || (this.cjaCodigo != null && !this.cjaCodigo.equals(other.cjaCodigo))) {
            return false;
        }
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.NcrsPK[ cjaCodigo=" + cjaCodigo + ", numero=" + numero + " ]";
    }
    
}
