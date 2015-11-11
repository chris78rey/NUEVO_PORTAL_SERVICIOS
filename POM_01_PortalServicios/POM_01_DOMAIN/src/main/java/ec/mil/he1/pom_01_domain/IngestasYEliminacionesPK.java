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
public class IngestasYEliminacionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRMATN_NUMERO")
    private int prmatnNumero;
    @Basic(optional = false)
    @Column(name = "PRMATN_PCN_NUMERO_HC")
    private int prmatnPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public IngestasYEliminacionesPK() {
    }

    public IngestasYEliminacionesPK(int prmatnNumero, int prmatnPcnNumeroHc, int numero) {
        this.prmatnNumero = prmatnNumero;
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
        this.numero = numero;
    }

    public int getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(int prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public int getPrmatnPcnNumeroHc() {
        return prmatnPcnNumeroHc;
    }

    public void setPrmatnPcnNumeroHc(int prmatnPcnNumeroHc) {
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
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
        hash += (int) prmatnNumero;
        hash += (int) prmatnPcnNumeroHc;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngestasYEliminacionesPK)) {
            return false;
        }
        IngestasYEliminacionesPK other = (IngestasYEliminacionesPK) object;
        if (this.prmatnNumero != other.prmatnNumero) {
            return false;
        }
        if (this.prmatnPcnNumeroHc != other.prmatnPcnNumeroHc) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.IngestasYEliminacionesPK[ prmatnNumero=" + prmatnNumero + ", prmatnPcnNumeroHc=" + prmatnPcnNumeroHc + ", numero=" + numero + " ]";
    }
    
}
