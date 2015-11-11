/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

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
public class DependientesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private BigInteger numero;
    @Basic(optional = false)
    @Column(name = "BNF_ASC_NUMERO")
    private int bnfAscNumero;
    @Basic(optional = false)
    @Column(name = "BNF_PCN_NUMERO_HC")
    private int bnfPcnNumeroHc;

    public DependientesPK() {
    }

    public DependientesPK(BigInteger numero, int bnfAscNumero, int bnfPcnNumeroHc) {
        this.numero = numero;
        this.bnfAscNumero = bnfAscNumero;
        this.bnfPcnNumeroHc = bnfPcnNumeroHc;
    }

    public BigInteger getNumero() {
        return numero;
    }

    public void setNumero(BigInteger numero) {
        this.numero = numero;
    }

    public int getBnfAscNumero() {
        return bnfAscNumero;
    }

    public void setBnfAscNumero(int bnfAscNumero) {
        this.bnfAscNumero = bnfAscNumero;
    }

    public int getBnfPcnNumeroHc() {
        return bnfPcnNumeroHc;
    }

    public void setBnfPcnNumeroHc(int bnfPcnNumeroHc) {
        this.bnfPcnNumeroHc = bnfPcnNumeroHc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        hash += (int) bnfAscNumero;
        hash += (int) bnfPcnNumeroHc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DependientesPK)) {
            return false;
        }
        DependientesPK other = (DependientesPK) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        if (this.bnfAscNumero != other.bnfAscNumero) {
            return false;
        }
        if (this.bnfPcnNumeroHc != other.bnfPcnNumeroHc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DependientesPK[ numero=" + numero + ", bnfAscNumero=" + bnfAscNumero + ", bnfPcnNumeroHc=" + bnfPcnNumeroHc + " ]";
    }
    
}
