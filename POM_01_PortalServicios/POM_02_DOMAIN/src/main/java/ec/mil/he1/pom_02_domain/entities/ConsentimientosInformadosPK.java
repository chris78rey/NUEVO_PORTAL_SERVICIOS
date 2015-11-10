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
public class ConsentimientosInformadosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRMATN_PCN_NUMERO_HC")
    private int prmatnPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;

    public ConsentimientosInformadosPK() {
    }

    public ConsentimientosInformadosPK(int prmatnPcnNumeroHc, BigInteger hjaevlNumero, String tipo) {
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
        this.hjaevlNumero = hjaevlNumero;
        this.tipo = tipo;
    }

    public int getPrmatnPcnNumeroHc() {
        return prmatnPcnNumeroHc;
    }

    public void setPrmatnPcnNumeroHc(int prmatnPcnNumeroHc) {
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prmatnPcnNumeroHc;
        hash += (hjaevlNumero != null ? hjaevlNumero.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsentimientosInformadosPK)) {
            return false;
        }
        ConsentimientosInformadosPK other = (ConsentimientosInformadosPK) object;
        if (this.prmatnPcnNumeroHc != other.prmatnPcnNumeroHc) {
            return false;
        }
        if ((this.hjaevlNumero == null && other.hjaevlNumero != null) || (this.hjaevlNumero != null && !this.hjaevlNumero.equals(other.hjaevlNumero))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ConsentimientosInformadosPK[ prmatnPcnNumeroHc=" + prmatnPcnNumeroHc + ", hjaevlNumero=" + hjaevlNumero + ", tipo=" + tipo + " ]";
    }
    
}
