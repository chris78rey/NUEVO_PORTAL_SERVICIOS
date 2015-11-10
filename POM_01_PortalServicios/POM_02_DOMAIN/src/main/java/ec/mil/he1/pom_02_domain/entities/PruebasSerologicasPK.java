/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class PruebasSerologicasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "UND_NUMERO")
    private String undNumero;
    @Basic(optional = false)
    @Column(name = "PRBSNG_CODIGO")
    private String prbsngCodigo;

    public PruebasSerologicasPK() {
    }

    public PruebasSerologicasPK(String undNumero, String prbsngCodigo) {
        this.undNumero = undNumero;
        this.prbsngCodigo = prbsngCodigo;
    }

    public String getUndNumero() {
        return undNumero;
    }

    public void setUndNumero(String undNumero) {
        this.undNumero = undNumero;
    }

    public String getPrbsngCodigo() {
        return prbsngCodigo;
    }

    public void setPrbsngCodigo(String prbsngCodigo) {
        this.prbsngCodigo = prbsngCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (undNumero != null ? undNumero.hashCode() : 0);
        hash += (prbsngCodigo != null ? prbsngCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PruebasSerologicasPK)) {
            return false;
        }
        PruebasSerologicasPK other = (PruebasSerologicasPK) object;
        if ((this.undNumero == null && other.undNumero != null) || (this.undNumero != null && !this.undNumero.equals(other.undNumero))) {
            return false;
        }
        if ((this.prbsngCodigo == null && other.prbsngCodigo != null) || (this.prbsngCodigo != null && !this.prbsngCodigo.equals(other.prbsngCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PruebasSerologicasPK[ undNumero=" + undNumero + ", prbsngCodigo=" + prbsngCodigo + " ]";
    }
    
}
