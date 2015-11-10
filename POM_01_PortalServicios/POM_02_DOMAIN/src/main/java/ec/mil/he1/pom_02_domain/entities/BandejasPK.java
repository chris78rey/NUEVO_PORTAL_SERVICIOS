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
public class BandejasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EST_CODIGO")
    private String estCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public BandejasPK() {
    }

    public BandejasPK(String estCodigo, String codigo) {
        this.estCodigo = estCodigo;
        this.codigo = codigo;
    }

    public String getEstCodigo() {
        return estCodigo;
    }

    public void setEstCodigo(String estCodigo) {
        this.estCodigo = estCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estCodigo != null ? estCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BandejasPK)) {
            return false;
        }
        BandejasPK other = (BandejasPK) object;
        if ((this.estCodigo == null && other.estCodigo != null) || (this.estCodigo != null && !this.estCodigo.equals(other.estCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.BandejasPK[ estCodigo=" + estCodigo + ", codigo=" + codigo + " ]";
    }
    
}
