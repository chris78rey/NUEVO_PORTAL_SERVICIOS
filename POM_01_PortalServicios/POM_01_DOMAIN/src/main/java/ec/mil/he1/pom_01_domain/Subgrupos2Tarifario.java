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
@Table(name = "SUBGRUPOS_2_TARIFARIO")
@NamedQueries({
    @NamedQuery(name = "Subgrupos2Tarifario.findAll", query = "SELECT s FROM Subgrupos2Tarifario s")})
public class Subgrupos2Tarifario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Subgrupos2TarifarioPK subgrupos2TarifarioPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Subgrupos2Tarifario() {
    }

    public Subgrupos2Tarifario(Subgrupos2TarifarioPK subgrupos2TarifarioPK) {
        this.subgrupos2TarifarioPK = subgrupos2TarifarioPK;
    }

    public Subgrupos2Tarifario(String convenio, String tipo, String sbg1trfGrptrfCodigo, String sbg1trfSbgtrfCodigo, String sbg1trfCodigo, String codigo) {
        this.subgrupos2TarifarioPK = new Subgrupos2TarifarioPK(convenio, tipo, sbg1trfGrptrfCodigo, sbg1trfSbgtrfCodigo, sbg1trfCodigo, codigo);
    }

    public Subgrupos2TarifarioPK getSubgrupos2TarifarioPK() {
        return subgrupos2TarifarioPK;
    }

    public void setSubgrupos2TarifarioPK(Subgrupos2TarifarioPK subgrupos2TarifarioPK) {
        this.subgrupos2TarifarioPK = subgrupos2TarifarioPK;
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
        hash += (subgrupos2TarifarioPK != null ? subgrupos2TarifarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subgrupos2Tarifario)) {
            return false;
        }
        Subgrupos2Tarifario other = (Subgrupos2Tarifario) object;
        if ((this.subgrupos2TarifarioPK == null && other.subgrupos2TarifarioPK != null) || (this.subgrupos2TarifarioPK != null && !this.subgrupos2TarifarioPK.equals(other.subgrupos2TarifarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Subgrupos2Tarifario[ subgrupos2TarifarioPK=" + subgrupos2TarifarioPK + " ]";
    }
    
}
