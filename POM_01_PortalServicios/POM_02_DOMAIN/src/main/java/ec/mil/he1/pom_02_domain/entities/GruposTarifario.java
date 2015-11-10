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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "GRUPOS_TARIFARIO")
@NamedQueries({
    @NamedQuery(name = "GruposTarifario.findAll", query = "SELECT g FROM GruposTarifario g")})
public class GruposTarifario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GruposTarifarioPK gruposTarifarioPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gruposTarifario", fetch = FetchType.LAZY)
    private List<TiposExamenesIess> tiposExamenesIessList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gruposTarifario", fetch = FetchType.LAZY)
    private List<SubgruposTarifario> subgruposTarifarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gruposTarifario", fetch = FetchType.LAZY)
    private List<Tarifarios> tarifariosList;

    public GruposTarifario() {
    }

    public GruposTarifario(GruposTarifarioPK gruposTarifarioPK) {
        this.gruposTarifarioPK = gruposTarifarioPK;
    }

    public GruposTarifario(String convenio, String tipo, String codigo) {
        this.gruposTarifarioPK = new GruposTarifarioPK(convenio, tipo, codigo);
    }

    public GruposTarifarioPK getGruposTarifarioPK() {
        return gruposTarifarioPK;
    }

    public void setGruposTarifarioPK(GruposTarifarioPK gruposTarifarioPK) {
        this.gruposTarifarioPK = gruposTarifarioPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<TiposExamenesIess> getTiposExamenesIessList() {
        return tiposExamenesIessList;
    }

    public void setTiposExamenesIessList(List<TiposExamenesIess> tiposExamenesIessList) {
        this.tiposExamenesIessList = tiposExamenesIessList;
    }

    public List<SubgruposTarifario> getSubgruposTarifarioList() {
        return subgruposTarifarioList;
    }

    public void setSubgruposTarifarioList(List<SubgruposTarifario> subgruposTarifarioList) {
        this.subgruposTarifarioList = subgruposTarifarioList;
    }

    public List<Tarifarios> getTarifariosList() {
        return tarifariosList;
    }

    public void setTarifariosList(List<Tarifarios> tarifariosList) {
        this.tarifariosList = tarifariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gruposTarifarioPK != null ? gruposTarifarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GruposTarifario)) {
            return false;
        }
        GruposTarifario other = (GruposTarifario) object;
        if ((this.gruposTarifarioPK == null && other.gruposTarifarioPK != null) || (this.gruposTarifarioPK != null && !this.gruposTarifarioPK.equals(other.gruposTarifarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.GruposTarifario[ gruposTarifarioPK=" + gruposTarifarioPK + " ]";
    }
    
}
