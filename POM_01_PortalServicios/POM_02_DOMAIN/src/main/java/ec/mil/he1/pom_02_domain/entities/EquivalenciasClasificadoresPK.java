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
public class EquivalenciasClasificadoresPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CLSF_CODIGO")
    private String clsfCodigo;
    @Basic(optional = false)
    @Column(name = "CNVTRF_CONVENIO")
    private String cnvtrfConvenio;
    @Basic(optional = false)
    @Column(name = "CNVTRF_CODIGO")
    private String cnvtrfCodigo;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;

    public EquivalenciasClasificadoresPK() {
    }

    public EquivalenciasClasificadoresPK(String clsfCodigo, String cnvtrfConvenio, String cnvtrfCodigo, String tipo) {
        this.clsfCodigo = clsfCodigo;
        this.cnvtrfConvenio = cnvtrfConvenio;
        this.cnvtrfCodigo = cnvtrfCodigo;
        this.tipo = tipo;
    }

    public String getClsfCodigo() {
        return clsfCodigo;
    }

    public void setClsfCodigo(String clsfCodigo) {
        this.clsfCodigo = clsfCodigo;
    }

    public String getCnvtrfConvenio() {
        return cnvtrfConvenio;
    }

    public void setCnvtrfConvenio(String cnvtrfConvenio) {
        this.cnvtrfConvenio = cnvtrfConvenio;
    }

    public String getCnvtrfCodigo() {
        return cnvtrfCodigo;
    }

    public void setCnvtrfCodigo(String cnvtrfCodigo) {
        this.cnvtrfCodigo = cnvtrfCodigo;
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
        hash += (clsfCodigo != null ? clsfCodigo.hashCode() : 0);
        hash += (cnvtrfConvenio != null ? cnvtrfConvenio.hashCode() : 0);
        hash += (cnvtrfCodigo != null ? cnvtrfCodigo.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquivalenciasClasificadoresPK)) {
            return false;
        }
        EquivalenciasClasificadoresPK other = (EquivalenciasClasificadoresPK) object;
        if ((this.clsfCodigo == null && other.clsfCodigo != null) || (this.clsfCodigo != null && !this.clsfCodigo.equals(other.clsfCodigo))) {
            return false;
        }
        if ((this.cnvtrfConvenio == null && other.cnvtrfConvenio != null) || (this.cnvtrfConvenio != null && !this.cnvtrfConvenio.equals(other.cnvtrfConvenio))) {
            return false;
        }
        if ((this.cnvtrfCodigo == null && other.cnvtrfCodigo != null) || (this.cnvtrfCodigo != null && !this.cnvtrfCodigo.equals(other.cnvtrfCodigo))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EquivalenciasClasificadoresPK[ clsfCodigo=" + clsfCodigo + ", cnvtrfConvenio=" + cnvtrfConvenio + ", cnvtrfCodigo=" + cnvtrfCodigo + ", tipo=" + tipo + " ]";
    }
    
}
