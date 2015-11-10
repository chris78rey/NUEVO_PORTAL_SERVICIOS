/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "SUBGRUPOS_1_TARIFARIO")
@NamedQueries({
    @NamedQuery(name = "Subgrupos1Tarifario.findAll", query = "SELECT s FROM Subgrupos1Tarifario s")})
public class Subgrupos1Tarifario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Subgrupos1TarifarioPK subgrupos1TarifarioPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumns({
        @JoinColumn(name = "CONVENIO", referencedColumnName = "CONVENIO", insertable = false, updatable = false),
        @JoinColumn(name = "TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "SBGTRF_GRPTRF_CODIGO", referencedColumnName = "GRPTRF_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SBGTRF_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SubgruposTarifario subgruposTarifario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subgrupos1Tarifario", fetch = FetchType.LAZY)
    private List<Subgrupos2Tarifario> subgrupos2TarifarioList;

    public Subgrupos1Tarifario() {
    }

    public Subgrupos1Tarifario(Subgrupos1TarifarioPK subgrupos1TarifarioPK) {
        this.subgrupos1TarifarioPK = subgrupos1TarifarioPK;
    }

    public Subgrupos1Tarifario(String convenio, String tipo, String sbgtrfGrptrfCodigo, String sbgtrfCodigo, String codigo) {
        this.subgrupos1TarifarioPK = new Subgrupos1TarifarioPK(convenio, tipo, sbgtrfGrptrfCodigo, sbgtrfCodigo, codigo);
    }

    public Subgrupos1TarifarioPK getSubgrupos1TarifarioPK() {
        return subgrupos1TarifarioPK;
    }

    public void setSubgrupos1TarifarioPK(Subgrupos1TarifarioPK subgrupos1TarifarioPK) {
        this.subgrupos1TarifarioPK = subgrupos1TarifarioPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public SubgruposTarifario getSubgruposTarifario() {
        return subgruposTarifario;
    }

    public void setSubgruposTarifario(SubgruposTarifario subgruposTarifario) {
        this.subgruposTarifario = subgruposTarifario;
    }

    public List<Subgrupos2Tarifario> getSubgrupos2TarifarioList() {
        return subgrupos2TarifarioList;
    }

    public void setSubgrupos2TarifarioList(List<Subgrupos2Tarifario> subgrupos2TarifarioList) {
        this.subgrupos2TarifarioList = subgrupos2TarifarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subgrupos1TarifarioPK != null ? subgrupos1TarifarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subgrupos1Tarifario)) {
            return false;
        }
        Subgrupos1Tarifario other = (Subgrupos1Tarifario) object;
        if ((this.subgrupos1TarifarioPK == null && other.subgrupos1TarifarioPK != null) || (this.subgrupos1TarifarioPK != null && !this.subgrupos1TarifarioPK.equals(other.subgrupos1TarifarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Subgrupos1Tarifario[ subgrupos1TarifarioPK=" + subgrupos1TarifarioPK + " ]";
    }
    
}
