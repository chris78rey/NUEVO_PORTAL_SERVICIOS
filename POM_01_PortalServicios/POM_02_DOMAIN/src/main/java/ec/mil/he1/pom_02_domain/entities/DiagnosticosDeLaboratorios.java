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
import javax.persistence.JoinColumn;
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
@Table(name = "DIAGNOSTICOS_DE_LABORATORIOS")
@NamedQueries({
    @NamedQuery(name = "DiagnosticosDeLaboratorios.findAll", query = "SELECT d FROM DiagnosticosDeLaboratorios d")})
public class DiagnosticosDeLaboratorios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "AREA_DX")
    private Character areaDx;
    @OneToMany(mappedBy = "diagnosticosDeLaboratorios", fetch = FetchType.LAZY)
    private List<Inmunohistoquimicas> inmunohistoquimicasList;
    @OneToMany(mappedBy = "diagnosticosDeLaboratorios1", fetch = FetchType.LAZY)
    private List<Inmunohistoquimicas> inmunohistoquimicasList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diagnosticosDeLaboratorios", fetch = FetchType.LAZY)
    private List<DiagnosticosPorAreas> diagnosticosPorAreasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diagnosticosDeLaboratorios", fetch = FetchType.LAZY)
    private List<DiagnosticosPatologicos> diagnosticosPatologicosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diagnosticosDeLaboratorios", fetch = FetchType.LAZY)
    private List<DiagnosticosDeExamenes> diagnosticosDeExamenesList;
    @OneToMany(mappedBy = "diagnosticosDeLaboratorios", fetch = FetchType.LAZY)
    private List<ExamenesPatologiaExternos> examenesPatologiaExternosList;
    @OneToMany(mappedBy = "diagnosticosDeLaboratorios1", fetch = FetchType.LAZY)
    private List<ExamenesPatologiaExternos> examenesPatologiaExternosList1;
    @OneToMany(mappedBy = "diagnosticosDeLaboratorios2", fetch = FetchType.LAZY)
    private List<ExamenesPatologiaExternos> examenesPatologiaExternosList2;
    @OneToMany(mappedBy = "diagnosticosDeLaboratorios", fetch = FetchType.LAZY)
    private List<DiagnosticosDeLaboratorios> diagnosticosDeLaboratoriosList;
    @JoinColumn(name = "DGNLBR_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosDeLaboratorios diagnosticosDeLaboratorios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diagnosticosDeLaboratorios", fetch = FetchType.LAZY)
    private List<DiagnosticosBiopsias> diagnosticosBiopsiasList;

    public DiagnosticosDeLaboratorios() {
    }

    public DiagnosticosDeLaboratorios(String codigo) {
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

    public Character getAreaDx() {
        return areaDx;
    }

    public void setAreaDx(Character areaDx) {
        this.areaDx = areaDx;
    }

    public List<Inmunohistoquimicas> getInmunohistoquimicasList() {
        return inmunohistoquimicasList;
    }

    public void setInmunohistoquimicasList(List<Inmunohistoquimicas> inmunohistoquimicasList) {
        this.inmunohistoquimicasList = inmunohistoquimicasList;
    }

    public List<Inmunohistoquimicas> getInmunohistoquimicasList1() {
        return inmunohistoquimicasList1;
    }

    public void setInmunohistoquimicasList1(List<Inmunohistoquimicas> inmunohistoquimicasList1) {
        this.inmunohistoquimicasList1 = inmunohistoquimicasList1;
    }

    public List<DiagnosticosPorAreas> getDiagnosticosPorAreasList() {
        return diagnosticosPorAreasList;
    }

    public void setDiagnosticosPorAreasList(List<DiagnosticosPorAreas> diagnosticosPorAreasList) {
        this.diagnosticosPorAreasList = diagnosticosPorAreasList;
    }

    public List<DiagnosticosPatologicos> getDiagnosticosPatologicosList() {
        return diagnosticosPatologicosList;
    }

    public void setDiagnosticosPatologicosList(List<DiagnosticosPatologicos> diagnosticosPatologicosList) {
        this.diagnosticosPatologicosList = diagnosticosPatologicosList;
    }

    public List<DiagnosticosDeExamenes> getDiagnosticosDeExamenesList() {
        return diagnosticosDeExamenesList;
    }

    public void setDiagnosticosDeExamenesList(List<DiagnosticosDeExamenes> diagnosticosDeExamenesList) {
        this.diagnosticosDeExamenesList = diagnosticosDeExamenesList;
    }

    public List<ExamenesPatologiaExternos> getExamenesPatologiaExternosList() {
        return examenesPatologiaExternosList;
    }

    public void setExamenesPatologiaExternosList(List<ExamenesPatologiaExternos> examenesPatologiaExternosList) {
        this.examenesPatologiaExternosList = examenesPatologiaExternosList;
    }

    public List<ExamenesPatologiaExternos> getExamenesPatologiaExternosList1() {
        return examenesPatologiaExternosList1;
    }

    public void setExamenesPatologiaExternosList1(List<ExamenesPatologiaExternos> examenesPatologiaExternosList1) {
        this.examenesPatologiaExternosList1 = examenesPatologiaExternosList1;
    }

    public List<ExamenesPatologiaExternos> getExamenesPatologiaExternosList2() {
        return examenesPatologiaExternosList2;
    }

    public void setExamenesPatologiaExternosList2(List<ExamenesPatologiaExternos> examenesPatologiaExternosList2) {
        this.examenesPatologiaExternosList2 = examenesPatologiaExternosList2;
    }

    public List<DiagnosticosDeLaboratorios> getDiagnosticosDeLaboratoriosList() {
        return diagnosticosDeLaboratoriosList;
    }

    public void setDiagnosticosDeLaboratoriosList(List<DiagnosticosDeLaboratorios> diagnosticosDeLaboratoriosList) {
        this.diagnosticosDeLaboratoriosList = diagnosticosDeLaboratoriosList;
    }

    public DiagnosticosDeLaboratorios getDiagnosticosDeLaboratorios() {
        return diagnosticosDeLaboratorios;
    }

    public void setDiagnosticosDeLaboratorios(DiagnosticosDeLaboratorios diagnosticosDeLaboratorios) {
        this.diagnosticosDeLaboratorios = diagnosticosDeLaboratorios;
    }

    public List<DiagnosticosBiopsias> getDiagnosticosBiopsiasList() {
        return diagnosticosBiopsiasList;
    }

    public void setDiagnosticosBiopsiasList(List<DiagnosticosBiopsias> diagnosticosBiopsiasList) {
        this.diagnosticosBiopsiasList = diagnosticosBiopsiasList;
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
        if (!(object instanceof DiagnosticosDeLaboratorios)) {
            return false;
        }
        DiagnosticosDeLaboratorios other = (DiagnosticosDeLaboratorios) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DiagnosticosDeLaboratorios[ codigo=" + codigo + " ]";
    }
    
}
