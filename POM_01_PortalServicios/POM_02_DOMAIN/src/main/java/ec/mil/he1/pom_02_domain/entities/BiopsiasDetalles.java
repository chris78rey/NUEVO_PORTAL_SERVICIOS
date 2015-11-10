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
@Table(name = "BIOPSIAS_DETALLES")
@NamedQueries({
    @NamedQuery(name = "BiopsiasDetalles.findAll", query = "SELECT b FROM BiopsiasDetalles b")})
public class BiopsiasDetalles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BiopsiasDetallesPK biopsiasDetallesPK;
    @Column(name = "DATOS_PIEZA")
    private String datosPieza;
    @Column(name = "NUMERO_DE_MUESTRAS")
    private Short numeroDeMuestras;
    @Column(name = "MALIGNIDAD")
    private String malignidad;
    @Column(name = "MACROSCOPICO")
    private String macroscopico;
    @Column(name = "DIAGNOSTICO_PATOLOGICO")
    private String diagnosticoPatologico;
    @Column(name = "MICROSCOPICO")
    private String microscopico;
    @JoinColumn(name = "EXM_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Examenes examenes;
    @JoinColumn(name = "VRBEXM_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private VariablesDeExamenes variablesDeExamenes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "biopsiasDetalles", fetch = FetchType.LAZY)
    private List<DiagnosticosBiopsias> diagnosticosBiopsiasList;

    public BiopsiasDetalles() {
    }

    public BiopsiasDetalles(BiopsiasDetallesPK biopsiasDetallesPK) {
        this.biopsiasDetallesPK = biopsiasDetallesPK;
    }

    public BiopsiasDetalles(int exmNumero, int vrbexmCodigo) {
        this.biopsiasDetallesPK = new BiopsiasDetallesPK(exmNumero, vrbexmCodigo);
    }

    public BiopsiasDetallesPK getBiopsiasDetallesPK() {
        return biopsiasDetallesPK;
    }

    public void setBiopsiasDetallesPK(BiopsiasDetallesPK biopsiasDetallesPK) {
        this.biopsiasDetallesPK = biopsiasDetallesPK;
    }

    public String getDatosPieza() {
        return datosPieza;
    }

    public void setDatosPieza(String datosPieza) {
        this.datosPieza = datosPieza;
    }

    public Short getNumeroDeMuestras() {
        return numeroDeMuestras;
    }

    public void setNumeroDeMuestras(Short numeroDeMuestras) {
        this.numeroDeMuestras = numeroDeMuestras;
    }

    public String getMalignidad() {
        return malignidad;
    }

    public void setMalignidad(String malignidad) {
        this.malignidad = malignidad;
    }

    public String getMacroscopico() {
        return macroscopico;
    }

    public void setMacroscopico(String macroscopico) {
        this.macroscopico = macroscopico;
    }

    public String getDiagnosticoPatologico() {
        return diagnosticoPatologico;
    }

    public void setDiagnosticoPatologico(String diagnosticoPatologico) {
        this.diagnosticoPatologico = diagnosticoPatologico;
    }

    public String getMicroscopico() {
        return microscopico;
    }

    public void setMicroscopico(String microscopico) {
        this.microscopico = microscopico;
    }

    public Examenes getExamenes() {
        return examenes;
    }

    public void setExamenes(Examenes examenes) {
        this.examenes = examenes;
    }

    public VariablesDeExamenes getVariablesDeExamenes() {
        return variablesDeExamenes;
    }

    public void setVariablesDeExamenes(VariablesDeExamenes variablesDeExamenes) {
        this.variablesDeExamenes = variablesDeExamenes;
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
        hash += (biopsiasDetallesPK != null ? biopsiasDetallesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BiopsiasDetalles)) {
            return false;
        }
        BiopsiasDetalles other = (BiopsiasDetalles) object;
        if ((this.biopsiasDetallesPK == null && other.biopsiasDetallesPK != null) || (this.biopsiasDetallesPK != null && !this.biopsiasDetallesPK.equals(other.biopsiasDetallesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.BiopsiasDetalles[ biopsiasDetallesPK=" + biopsiasDetallesPK + " ]";
    }
    
}
