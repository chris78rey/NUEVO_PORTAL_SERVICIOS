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
public class DetallesGruposPaquetesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GPQ_CODIGO")
    private String gpqCodigo;
    @Basic(optional = false)
    @Column(name = "TIPO_ITEM")
    private String tipoItem;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public DetallesGruposPaquetesPK() {
    }

    public DetallesGruposPaquetesPK(String gpqCodigo, String tipoItem, String tipo, String codigo) {
        this.gpqCodigo = gpqCodigo;
        this.tipoItem = tipoItem;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public String getGpqCodigo() {
        return gpqCodigo;
    }

    public void setGpqCodigo(String gpqCodigo) {
        this.gpqCodigo = gpqCodigo;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        hash += (gpqCodigo != null ? gpqCodigo.hashCode() : 0);
        hash += (tipoItem != null ? tipoItem.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesGruposPaquetesPK)) {
            return false;
        }
        DetallesGruposPaquetesPK other = (DetallesGruposPaquetesPK) object;
        if ((this.gpqCodigo == null && other.gpqCodigo != null) || (this.gpqCodigo != null && !this.gpqCodigo.equals(other.gpqCodigo))) {
            return false;
        }
        if ((this.tipoItem == null && other.tipoItem != null) || (this.tipoItem != null && !this.tipoItem.equals(other.tipoItem))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesGruposPaquetesPK[ gpqCodigo=" + gpqCodigo + ", tipoItem=" + tipoItem + ", tipo=" + tipo + ", codigo=" + codigo + " ]";
    }
    
}
