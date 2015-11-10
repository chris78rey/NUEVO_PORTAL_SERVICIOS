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
public class ConveniosEquivalenciasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Basic(optional = false)
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Basic(optional = false)
    @Column(name = "CNVTRF_CONVENIO")
    private String cnvtrfConvenio;
    @Basic(optional = false)
    @Column(name = "CNVTRF_CODIGO")
    private String cnvtrfCodigo;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;

    public ConveniosEquivalenciasPK() {
    }

    public ConveniosEquivalenciasPK(String crgCodigo, Character crgTipo, String cnvtrfConvenio, String cnvtrfCodigo, String tipo) {
        this.crgCodigo = crgCodigo;
        this.crgTipo = crgTipo;
        this.cnvtrfConvenio = cnvtrfConvenio;
        this.cnvtrfCodigo = cnvtrfCodigo;
        this.tipo = tipo;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
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
        hash += (crgCodigo != null ? crgCodigo.hashCode() : 0);
        hash += (crgTipo != null ? crgTipo.hashCode() : 0);
        hash += (cnvtrfConvenio != null ? cnvtrfConvenio.hashCode() : 0);
        hash += (cnvtrfCodigo != null ? cnvtrfCodigo.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConveniosEquivalenciasPK)) {
            return false;
        }
        ConveniosEquivalenciasPK other = (ConveniosEquivalenciasPK) object;
        if ((this.crgCodigo == null && other.crgCodigo != null) || (this.crgCodigo != null && !this.crgCodigo.equals(other.crgCodigo))) {
            return false;
        }
        if ((this.crgTipo == null && other.crgTipo != null) || (this.crgTipo != null && !this.crgTipo.equals(other.crgTipo))) {
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
        return "ec.mil.he1.pom_02_domain.entities.ConveniosEquivalenciasPK[ crgCodigo=" + crgCodigo + ", crgTipo=" + crgTipo + ", cnvtrfConvenio=" + cnvtrfConvenio + ", cnvtrfCodigo=" + cnvtrfCodigo + ", tipo=" + tipo + " ]";
    }
    
}
