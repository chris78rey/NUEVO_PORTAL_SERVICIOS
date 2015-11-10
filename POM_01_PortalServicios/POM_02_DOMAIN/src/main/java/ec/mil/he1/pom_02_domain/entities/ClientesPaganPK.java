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
public class ClientesPaganPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TIPO_CODIGO")
    private String tipoCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public ClientesPaganPK() {
    }

    public ClientesPaganPK(String tipoCodigo, String codigo) {
        this.tipoCodigo = tipoCodigo;
        this.codigo = codigo;
    }

    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
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
        hash += (tipoCodigo != null ? tipoCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientesPaganPK)) {
            return false;
        }
        ClientesPaganPK other = (ClientesPaganPK) object;
        if ((this.tipoCodigo == null && other.tipoCodigo != null) || (this.tipoCodigo != null && !this.tipoCodigo.equals(other.tipoCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ClientesPaganPK[ tipoCodigo=" + tipoCodigo + ", codigo=" + codigo + " ]";
    }
    
}
