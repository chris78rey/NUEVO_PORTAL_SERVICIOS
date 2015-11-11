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
public class TiposExamenesIessPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONVENIO")
    private String convenio;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "GRUPO")
    private String grupo;
    @Basic(optional = false)
    @Column(name = "SUBGRUPO")
    private String subgrupo;

    public TiposExamenesIessPK() {
    }

    public TiposExamenesIessPK(String convenio, String tipo, String grupo, String subgrupo) {
        this.convenio = convenio;
        this.tipo = tipo;
        this.grupo = grupo;
        this.subgrupo = subgrupo;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSubgrupo() {
        return subgrupo;
    }

    public void setSubgrupo(String subgrupo) {
        this.subgrupo = subgrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (convenio != null ? convenio.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (grupo != null ? grupo.hashCode() : 0);
        hash += (subgrupo != null ? subgrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposExamenesIessPK)) {
            return false;
        }
        TiposExamenesIessPK other = (TiposExamenesIessPK) object;
        if ((this.convenio == null && other.convenio != null) || (this.convenio != null && !this.convenio.equals(other.convenio))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.grupo == null && other.grupo != null) || (this.grupo != null && !this.grupo.equals(other.grupo))) {
            return false;
        }
        if ((this.subgrupo == null && other.subgrupo != null) || (this.subgrupo != null && !this.subgrupo.equals(other.subgrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TiposExamenesIessPK[ convenio=" + convenio + ", tipo=" + tipo + ", grupo=" + grupo + ", subgrupo=" + subgrupo + " ]";
    }
    
}
