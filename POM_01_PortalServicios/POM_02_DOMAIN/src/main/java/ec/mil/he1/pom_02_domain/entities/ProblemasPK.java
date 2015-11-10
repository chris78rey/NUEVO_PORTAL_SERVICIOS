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
public class ProblemasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private int pcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private short numero;

    public ProblemasPK() {
    }

    public ProblemasPK(int pcnNumeroHc, BigInteger hjaevlNumero, short numero) {
        this.pcnNumeroHc = pcnNumeroHc;
        this.hjaevlNumero = hjaevlNumero;
        this.numero = numero;
    }

    public int getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(int pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
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
        hash += (int) pcnNumeroHc;
        hash += (hjaevlNumero != null ? hjaevlNumero.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProblemasPK)) {
            return false;
        }
        ProblemasPK other = (ProblemasPK) object;
        if (this.pcnNumeroHc != other.pcnNumeroHc) {
            return false;
        }
        if ((this.hjaevlNumero == null && other.hjaevlNumero != null) || (this.hjaevlNumero != null && !this.hjaevlNumero.equals(other.hjaevlNumero))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ProblemasPK[ pcnNumeroHc=" + pcnNumeroHc + ", hjaevlNumero=" + hjaevlNumero + ", numero=" + numero + " ]";
    }
    
}
