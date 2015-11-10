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
public class PaquetesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CNV_CONVENIO")
    private String cnvConvenio;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public PaquetesPK() {
    }

    public PaquetesPK(String cnvConvenio, String tipo, String codigo) {
        this.cnvConvenio = cnvConvenio;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public String getCnvConvenio() {
        return cnvConvenio;
    }

    public void setCnvConvenio(String cnvConvenio) {
        this.cnvConvenio = cnvConvenio;
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
        hash += (cnvConvenio != null ? cnvConvenio.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaquetesPK)) {
            return false;
        }
        PaquetesPK other = (PaquetesPK) object;
        if ((this.cnvConvenio == null && other.cnvConvenio != null) || (this.cnvConvenio != null && !this.cnvConvenio.equals(other.cnvConvenio))) {
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
        return "ec.mil.he1.pom_02_domain.entities.PaquetesPK[ cnvConvenio=" + cnvConvenio + ", tipo=" + tipo + ", codigo=" + codigo + " ]";
    }
    
}
