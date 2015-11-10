/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TECNICAS_PATOLOGICAS")
@NamedQueries({
    @NamedQuery(name = "TecnicasPatologicas.findAll", query = "SELECT t FROM TecnicasPatologicas t")})
public class TecnicasPatologicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @ManyToMany(mappedBy = "tecnicasPatologicasList", fetch = FetchType.LAZY)
    private List<Biopsias> biopsiasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tecnicasPatologicas", fetch = FetchType.LAZY)
    private List<TecnicasBiopsias> tecnicasBiopsiasList;

    public TecnicasPatologicas() {
    }

    public TecnicasPatologicas(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Biopsias> getBiopsiasList() {
        return biopsiasList;
    }

    public void setBiopsiasList(List<Biopsias> biopsiasList) {
        this.biopsiasList = biopsiasList;
    }

    public List<TecnicasBiopsias> getTecnicasBiopsiasList() {
        return tecnicasBiopsiasList;
    }

    public void setTecnicasBiopsiasList(List<TecnicasBiopsias> tecnicasBiopsiasList) {
        this.tecnicasBiopsiasList = tecnicasBiopsiasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TecnicasPatologicas)) {
            return false;
        }
        TecnicasPatologicas other = (TecnicasPatologicas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TecnicasPatologicas[ codigo=" + codigo + " ]";
    }
    
}
