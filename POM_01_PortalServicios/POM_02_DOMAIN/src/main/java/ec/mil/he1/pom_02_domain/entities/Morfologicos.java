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
@Table(name = "MORFOLOGICOS")
@NamedQueries({
    @NamedQuery(name = "Morfologicos.findAll", query = "SELECT m FROM Morfologicos m")})
public class Morfologicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @OneToMany(mappedBy = "morfologicos", fetch = FetchType.LAZY)
    private List<IndicesMorfologicos> indicesMorfologicosList;
    @OneToMany(mappedBy = "morfologicos1", fetch = FetchType.LAZY)
    private List<IndicesMorfologicos> indicesMorfologicosList1;
    @OneToMany(mappedBy = "morfologicos", fetch = FetchType.LAZY)
    private List<DiagnosticosPaciente> diagnosticosPacienteList;

    public Morfologicos() {
    }

    public Morfologicos(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<IndicesMorfologicos> getIndicesMorfologicosList() {
        return indicesMorfologicosList;
    }

    public void setIndicesMorfologicosList(List<IndicesMorfologicos> indicesMorfologicosList) {
        this.indicesMorfologicosList = indicesMorfologicosList;
    }

    public List<IndicesMorfologicos> getIndicesMorfologicosList1() {
        return indicesMorfologicosList1;
    }

    public void setIndicesMorfologicosList1(List<IndicesMorfologicos> indicesMorfologicosList1) {
        this.indicesMorfologicosList1 = indicesMorfologicosList1;
    }

    public List<DiagnosticosPaciente> getDiagnosticosPacienteList() {
        return diagnosticosPacienteList;
    }

    public void setDiagnosticosPacienteList(List<DiagnosticosPaciente> diagnosticosPacienteList) {
        this.diagnosticosPacienteList = diagnosticosPacienteList;
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
        if (!(object instanceof Morfologicos)) {
            return false;
        }
        Morfologicos other = (Morfologicos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Morfologicos[ codigo=" + codigo + " ]";
    }
    
}
