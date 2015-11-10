/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "OCUPACIONES")
@NamedQueries({
    @NamedQuery(name = "Ocupaciones.findAll", query = "SELECT o FROM Ocupaciones o")})
public class Ocupaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "OCUPACION")
    private String ocupacion;
    @OneToMany(mappedBy = "ocupaciones", fetch = FetchType.LAZY)
    private List<Pacientes> pacientesList;
    @OneToMany(mappedBy = "ocupaciones", fetch = FetchType.LAZY)
    private List<Familiares> familiaresList;
    @OneToMany(mappedBy = "ocupaciones", fetch = FetchType.LAZY)
    private List<UnidadesFamiliares> unidadesFamiliaresList;
    @OneToMany(mappedBy = "ocupaciones1", fetch = FetchType.LAZY)
    private List<UnidadesFamiliares> unidadesFamiliaresList1;

    public Ocupaciones() {
    }

    public Ocupaciones(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public List<Pacientes> getPacientesList() {
        return pacientesList;
    }

    public void setPacientesList(List<Pacientes> pacientesList) {
        this.pacientesList = pacientesList;
    }

    public List<Familiares> getFamiliaresList() {
        return familiaresList;
    }

    public void setFamiliaresList(List<Familiares> familiaresList) {
        this.familiaresList = familiaresList;
    }

    public List<UnidadesFamiliares> getUnidadesFamiliaresList() {
        return unidadesFamiliaresList;
    }

    public void setUnidadesFamiliaresList(List<UnidadesFamiliares> unidadesFamiliaresList) {
        this.unidadesFamiliaresList = unidadesFamiliaresList;
    }

    public List<UnidadesFamiliares> getUnidadesFamiliaresList1() {
        return unidadesFamiliaresList1;
    }

    public void setUnidadesFamiliaresList1(List<UnidadesFamiliares> unidadesFamiliaresList1) {
        this.unidadesFamiliaresList1 = unidadesFamiliaresList1;
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
        if (!(object instanceof Ocupaciones)) {
            return false;
        }
        Ocupaciones other = (Ocupaciones) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Ocupaciones[ codigo=" + codigo + " ]";
    }
    
}
