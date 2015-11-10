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
public class ItemsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TIPO")
    private Character tipo;
    @Basic(optional = false)
    @Column(name = "SBS_SCC_CODIGO")
    private String sbsSccCodigo;
    @Basic(optional = false)
    @Column(name = "SBS_CODIGO")
    private String sbsCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private short codigo;

    public ItemsPK() {
    }

    public ItemsPK(Character tipo, String sbsSccCodigo, String sbsCodigo, short codigo) {
        this.tipo = tipo;
        this.sbsSccCodigo = sbsSccCodigo;
        this.sbsCodigo = sbsCodigo;
        this.codigo = codigo;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public String getSbsSccCodigo() {
        return sbsSccCodigo;
    }

    public void setSbsSccCodigo(String sbsSccCodigo) {
        this.sbsSccCodigo = sbsSccCodigo;
    }

    public String getSbsCodigo() {
        return sbsCodigo;
    }

    public void setSbsCodigo(String sbsCodigo) {
        this.sbsCodigo = sbsCodigo;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (sbsSccCodigo != null ? sbsSccCodigo.hashCode() : 0);
        hash += (sbsCodigo != null ? sbsCodigo.hashCode() : 0);
        hash += (int) codigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemsPK)) {
            return false;
        }
        ItemsPK other = (ItemsPK) object;
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.sbsSccCodigo == null && other.sbsSccCodigo != null) || (this.sbsSccCodigo != null && !this.sbsSccCodigo.equals(other.sbsSccCodigo))) {
            return false;
        }
        if ((this.sbsCodigo == null && other.sbsCodigo != null) || (this.sbsCodigo != null && !this.sbsCodigo.equals(other.sbsCodigo))) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ItemsPK[ tipo=" + tipo + ", sbsSccCodigo=" + sbsSccCodigo + ", sbsCodigo=" + sbsCodigo + ", codigo=" + codigo + " ]";
    }
    
}
