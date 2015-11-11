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
public class EnfermedadesBloqueadasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "ENFERMEDAD")
    private String enfermedad;

    public EnfermedadesBloqueadasPK() {
    }

    public EnfermedadesBloqueadasPK(String codigo, String enfermedad) {
        this.codigo = codigo;
        this.enfermedad = enfermedad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        hash += (enfermedad != null ? enfermedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnfermedadesBloqueadasPK)) {
            return false;
        }
        EnfermedadesBloqueadasPK other = (EnfermedadesBloqueadasPK) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        if ((this.enfermedad == null && other.enfermedad != null) || (this.enfermedad != null && !this.enfermedad.equals(other.enfermedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EnfermedadesBloqueadasPK[ codigo=" + codigo + ", enfermedad=" + enfermedad + " ]";
    }
    
}
