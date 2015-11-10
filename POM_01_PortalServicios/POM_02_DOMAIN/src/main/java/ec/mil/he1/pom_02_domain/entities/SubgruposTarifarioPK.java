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
public class SubgruposTarifarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONVENIO")
    private String convenio;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "GRPTRF_CODIGO")
    private String grptrfCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public SubgruposTarifarioPK() {
    }

    public SubgruposTarifarioPK(String convenio, String tipo, String grptrfCodigo, String codigo) {
        this.convenio = convenio;
        this.tipo = tipo;
        this.grptrfCodigo = grptrfCodigo;
        this.codigo = codigo;
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

    public String getGrptrfCodigo() {
        return grptrfCodigo;
    }

    public void setGrptrfCodigo(String grptrfCodigo) {
        this.grptrfCodigo = grptrfCodigo;
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
        hash += (convenio != null ? convenio.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (grptrfCodigo != null ? grptrfCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubgruposTarifarioPK)) {
            return false;
        }
        SubgruposTarifarioPK other = (SubgruposTarifarioPK) object;
        if ((this.convenio == null && other.convenio != null) || (this.convenio != null && !this.convenio.equals(other.convenio))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.grptrfCodigo == null && other.grptrfCodigo != null) || (this.grptrfCodigo != null && !this.grptrfCodigo.equals(other.grptrfCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SubgruposTarifarioPK[ convenio=" + convenio + ", tipo=" + tipo + ", grptrfCodigo=" + grptrfCodigo + ", codigo=" + codigo + " ]";
    }
    
}
