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
public class AgentesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_PCN_NUMERO_HC")
    private int prtoprslcPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_NUMERO")
    private int prtoprslcNumero;
    @Basic(optional = false)
    @Column(name = "FILA")
    private short fila;

    public AgentesPK() {
    }

    public AgentesPK(int prtoprslcPcnNumeroHc, int prtoprslcNumero, short fila) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
        this.prtoprslcNumero = prtoprslcNumero;
        this.fila = fila;
    }

    public int getPrtoprslcPcnNumeroHc() {
        return prtoprslcPcnNumeroHc;
    }

    public void setPrtoprslcPcnNumeroHc(int prtoprslcPcnNumeroHc) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
    }

    public int getPrtoprslcNumero() {
        return prtoprslcNumero;
    }

    public void setPrtoprslcNumero(int prtoprslcNumero) {
        this.prtoprslcNumero = prtoprslcNumero;
    }

    public short getFila() {
        return fila;
    }

    public void setFila(short fila) {
        this.fila = fila;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prtoprslcPcnNumeroHc;
        hash += (int) prtoprslcNumero;
        hash += (int) fila;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgentesPK)) {
            return false;
        }
        AgentesPK other = (AgentesPK) object;
        if (this.prtoprslcPcnNumeroHc != other.prtoprslcPcnNumeroHc) {
            return false;
        }
        if (this.prtoprslcNumero != other.prtoprslcNumero) {
            return false;
        }
        if (this.fila != other.fila) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AgentesPK[ prtoprslcPcnNumeroHc=" + prtoprslcPcnNumeroHc + ", prtoprslcNumero=" + prtoprslcNumero + ", fila=" + fila + " ]";
    }
    
}
