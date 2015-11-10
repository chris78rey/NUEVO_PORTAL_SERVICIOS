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
@Table(name = "ENFERMEDADES")
@NamedQueries({
    @NamedQuery(name = "Enfermedades.findAll", query = "SELECT e FROM Enfermedades e")})
public class Enfermedades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "ENFERMEDAD")
    private String enfermedad;
    @Column(name = "SINTOMAS")
    private String sintomas;
    @Column(name = "CODIGO_OMS")
    private String codigoOms;
    @OneToMany(mappedBy = "enfermedades", fetch = FetchType.LAZY)
    private List<AntecedentesPersonales> antecedentesPersonalesList;
    @OneToMany(mappedBy = "enfermedades", fetch = FetchType.LAZY)
    private List<IndicesEnfermedades> indicesEnfermedadesList;
    @OneToMany(mappedBy = "enfermedades1", fetch = FetchType.LAZY)
    private List<IndicesEnfermedades> indicesEnfermedadesList1;
    @OneToMany(mappedBy = "enfermedades", fetch = FetchType.LAZY)
    private List<ReferenciasDiagnosticos> referenciasDiagnosticosList;
    @OneToMany(mappedBy = "enfermedades", fetch = FetchType.LAZY)
    private List<AntecedentesFamiliares> antecedentesFamiliaresList;
    @OneToMany(mappedBy = "enfermedades", fetch = FetchType.LAZY)
    private List<DiagnosticosPaciente> diagnosticosPacienteList;
    @OneToMany(mappedBy = "enfermedades", fetch = FetchType.LAZY)
    private List<TiposDeAlergias> tiposDeAlergiasList;
    @OneToMany(mappedBy = "enfermedades", fetch = FetchType.LAZY)
    private List<DetallesComplicaciones> detallesComplicacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "enfermedades", fetch = FetchType.LAZY)
    private List<DiagnosticosPaquetes> diagnosticosPaquetesList;

    public Enfermedades() {
    }

    public Enfermedades(String codigo) {
        this.codigo = codigo;
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

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getCodigoOms() {
        return codigoOms;
    }

    public void setCodigoOms(String codigoOms) {
        this.codigoOms = codigoOms;
    }

    public List<AntecedentesPersonales> getAntecedentesPersonalesList() {
        return antecedentesPersonalesList;
    }

    public void setAntecedentesPersonalesList(List<AntecedentesPersonales> antecedentesPersonalesList) {
        this.antecedentesPersonalesList = antecedentesPersonalesList;
    }

    public List<IndicesEnfermedades> getIndicesEnfermedadesList() {
        return indicesEnfermedadesList;
    }

    public void setIndicesEnfermedadesList(List<IndicesEnfermedades> indicesEnfermedadesList) {
        this.indicesEnfermedadesList = indicesEnfermedadesList;
    }

    public List<IndicesEnfermedades> getIndicesEnfermedadesList1() {
        return indicesEnfermedadesList1;
    }

    public void setIndicesEnfermedadesList1(List<IndicesEnfermedades> indicesEnfermedadesList1) {
        this.indicesEnfermedadesList1 = indicesEnfermedadesList1;
    }

    public List<ReferenciasDiagnosticos> getReferenciasDiagnosticosList() {
        return referenciasDiagnosticosList;
    }

    public void setReferenciasDiagnosticosList(List<ReferenciasDiagnosticos> referenciasDiagnosticosList) {
        this.referenciasDiagnosticosList = referenciasDiagnosticosList;
    }

    public List<AntecedentesFamiliares> getAntecedentesFamiliaresList() {
        return antecedentesFamiliaresList;
    }

    public void setAntecedentesFamiliaresList(List<AntecedentesFamiliares> antecedentesFamiliaresList) {
        this.antecedentesFamiliaresList = antecedentesFamiliaresList;
    }

    public List<DiagnosticosPaciente> getDiagnosticosPacienteList() {
        return diagnosticosPacienteList;
    }

    public void setDiagnosticosPacienteList(List<DiagnosticosPaciente> diagnosticosPacienteList) {
        this.diagnosticosPacienteList = diagnosticosPacienteList;
    }

    public List<TiposDeAlergias> getTiposDeAlergiasList() {
        return tiposDeAlergiasList;
    }

    public void setTiposDeAlergiasList(List<TiposDeAlergias> tiposDeAlergiasList) {
        this.tiposDeAlergiasList = tiposDeAlergiasList;
    }

    public List<DetallesComplicaciones> getDetallesComplicacionesList() {
        return detallesComplicacionesList;
    }

    public void setDetallesComplicacionesList(List<DetallesComplicaciones> detallesComplicacionesList) {
        this.detallesComplicacionesList = detallesComplicacionesList;
    }

    public List<DiagnosticosPaquetes> getDiagnosticosPaquetesList() {
        return diagnosticosPaquetesList;
    }

    public void setDiagnosticosPaquetesList(List<DiagnosticosPaquetes> diagnosticosPaquetesList) {
        this.diagnosticosPaquetesList = diagnosticosPaquetesList;
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
        if (!(object instanceof Enfermedades)) {
            return false;
        }
        Enfermedades other = (Enfermedades) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Enfermedades[ codigo=" + codigo + " ]";
    }
    
}
