/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DIAGNOSTICOS_DE_EXAMENES")
@NamedQueries({
    @NamedQuery(name = "DiagnosticosDeExamenes.findAll", query = "SELECT d FROM DiagnosticosDeExamenes d")})
public class DiagnosticosDeExamenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiagnosticosDeExamenesPK diagnosticosDeExamenesPK;
    @Column(name = "FECHA_DE_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeCreacion;
    @Column(name = "CASO_INTERESANTE")
    private Character casoInteresante;

    public DiagnosticosDeExamenes() {
    }

    public DiagnosticosDeExamenes(DiagnosticosDeExamenesPK diagnosticosDeExamenesPK) {
        this.diagnosticosDeExamenesPK = diagnosticosDeExamenesPK;
    }

    public DiagnosticosDeExamenes(String dgnlbrCodigo, int exmNumero) {
        this.diagnosticosDeExamenesPK = new DiagnosticosDeExamenesPK(dgnlbrCodigo, exmNumero);
    }

    public DiagnosticosDeExamenesPK getDiagnosticosDeExamenesPK() {
        return diagnosticosDeExamenesPK;
    }

    public void setDiagnosticosDeExamenesPK(DiagnosticosDeExamenesPK diagnosticosDeExamenesPK) {
        this.diagnosticosDeExamenesPK = diagnosticosDeExamenesPK;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Character getCasoInteresante() {
        return casoInteresante;
    }

    public void setCasoInteresante(Character casoInteresante) {
        this.casoInteresante = casoInteresante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diagnosticosDeExamenesPK != null ? diagnosticosDeExamenesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosDeExamenes)) {
            return false;
        }
        DiagnosticosDeExamenes other = (DiagnosticosDeExamenes) object;
        if ((this.diagnosticosDeExamenesPK == null && other.diagnosticosDeExamenesPK != null) || (this.diagnosticosDeExamenesPK != null && !this.diagnosticosDeExamenesPK.equals(other.diagnosticosDeExamenesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DiagnosticosDeExamenes[ diagnosticosDeExamenesPK=" + diagnosticosDeExamenesPK + " ]";
    }
    
}
