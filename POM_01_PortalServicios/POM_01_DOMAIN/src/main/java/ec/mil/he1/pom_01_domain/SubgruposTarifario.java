/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "SUBGRUPOS_TARIFARIO")
@NamedQueries({
    @NamedQuery(name = "SubgruposTarifario.findAll", query = "SELECT s FROM SubgruposTarifario s")})
public class SubgruposTarifario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubgruposTarifarioPK subgruposTarifarioPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public SubgruposTarifario() {
    }

    public SubgruposTarifario(SubgruposTarifarioPK subgruposTarifarioPK) {
        this.subgruposTarifarioPK = subgruposTarifarioPK;
    }

    public SubgruposTarifario(String convenio, String tipo, String grptrfCodigo, String codigo) {
        this.subgruposTarifarioPK = new SubgruposTarifarioPK(convenio, tipo, grptrfCodigo, codigo);
    }

    public SubgruposTarifarioPK getSubgruposTarifarioPK() {
        return subgruposTarifarioPK;
    }

    public void setSubgruposTarifarioPK(SubgruposTarifarioPK subgruposTarifarioPK) {
        this.subgruposTarifarioPK = subgruposTarifarioPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subgruposTarifarioPK != null ? subgruposTarifarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubgruposTarifario)) {
            return false;
        }
        SubgruposTarifario other = (SubgruposTarifario) object;
        if ((this.subgruposTarifarioPK == null && other.subgruposTarifarioPK != null) || (this.subgruposTarifarioPK != null && !this.subgruposTarifarioPK.equals(other.subgruposTarifarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SubgruposTarifario[ subgruposTarifarioPK=" + subgruposTarifarioPK + " ]";
    }
    
}
