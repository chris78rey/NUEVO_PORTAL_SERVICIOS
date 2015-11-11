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
public class LineasEntrevistasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DNN_NUMERO")
    private int dnnNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO_ENTREVISTA")
    private BigInteger numeroEntrevista;

    public LineasEntrevistasPK() {
    }

    public LineasEntrevistasPK(int dnnNumero, BigInteger numeroEntrevista) {
        this.dnnNumero = dnnNumero;
        this.numeroEntrevista = numeroEntrevista;
    }

    public int getDnnNumero() {
        return dnnNumero;
    }

    public void setDnnNumero(int dnnNumero) {
        this.dnnNumero = dnnNumero;
    }

    public BigInteger getNumeroEntrevista() {
        return numeroEntrevista;
    }

    public void setNumeroEntrevista(BigInteger numeroEntrevista) {
        this.numeroEntrevista = numeroEntrevista;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dnnNumero;
        hash += (numeroEntrevista != null ? numeroEntrevista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineasEntrevistasPK)) {
            return false;
        }
        LineasEntrevistasPK other = (LineasEntrevistasPK) object;
        if (this.dnnNumero != other.dnnNumero) {
            return false;
        }
        if ((this.numeroEntrevista == null && other.numeroEntrevista != null) || (this.numeroEntrevista != null && !this.numeroEntrevista.equals(other.numeroEntrevista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.LineasEntrevistasPK[ dnnNumero=" + dnnNumero + ", numeroEntrevista=" + numeroEntrevista + " ]";
    }
    
}
