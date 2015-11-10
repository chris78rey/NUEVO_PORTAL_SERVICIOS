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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CONVENIOS")
@NamedQueries({
    @NamedQuery(name = "Convenios.findAll", query = "SELECT c FROM Convenios c")})
public class Convenios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "convenios", fetch = FetchType.LAZY)
    private List<AnexosTarifariosItems> anexosTarifariosItemsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "convenios", fetch = FetchType.LAZY)
    private List<Paquetes> paquetesList;
    @OneToMany(mappedBy = "convenios", fetch = FetchType.LAZY)
    private List<GruposPaquetesExcepciones> gruposPaquetesExcepcionesList;
    @OneToMany(mappedBy = "convenios", fetch = FetchType.LAZY)
    private List<Clasificadores> clasificadoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "convenios", fetch = FetchType.LAZY)
    private List<Tarifarios> tarifariosList;
    @OneToMany(mappedBy = "convenios", fetch = FetchType.LAZY)
    private List<GruposPaquetes> gruposPaquetesList;

    public Convenios() {
    }

    public Convenios(String convenio) {
        this.convenio = convenio;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<AnexosTarifariosItems> getAnexosTarifariosItemsList() {
        return anexosTarifariosItemsList;
    }

    public void setAnexosTarifariosItemsList(List<AnexosTarifariosItems> anexosTarifariosItemsList) {
        this.anexosTarifariosItemsList = anexosTarifariosItemsList;
    }

    public List<Paquetes> getPaquetesList() {
        return paquetesList;
    }

    public void setPaquetesList(List<Paquetes> paquetesList) {
        this.paquetesList = paquetesList;
    }

    public List<GruposPaquetesExcepciones> getGruposPaquetesExcepcionesList() {
        return gruposPaquetesExcepcionesList;
    }

    public void setGruposPaquetesExcepcionesList(List<GruposPaquetesExcepciones> gruposPaquetesExcepcionesList) {
        this.gruposPaquetesExcepcionesList = gruposPaquetesExcepcionesList;
    }

    public List<Clasificadores> getClasificadoresList() {
        return clasificadoresList;
    }

    public void setClasificadoresList(List<Clasificadores> clasificadoresList) {
        this.clasificadoresList = clasificadoresList;
    }

    public List<Tarifarios> getTarifariosList() {
        return tarifariosList;
    }

    public void setTarifariosList(List<Tarifarios> tarifariosList) {
        this.tarifariosList = tarifariosList;
    }

    public List<GruposPaquetes> getGruposPaquetesList() {
        return gruposPaquetesList;
    }

    public void setGruposPaquetesList(List<GruposPaquetes> gruposPaquetesList) {
        this.gruposPaquetesList = gruposPaquetesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (convenio != null ? convenio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Convenios)) {
            return false;
        }
        Convenios other = (Convenios) object;
        if ((this.convenio == null && other.convenio != null) || (this.convenio != null && !this.convenio.equals(other.convenio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Convenios[ convenio=" + convenio + " ]";
    }
    
}
