/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DIAGNOSTICOS_SECUNDARIOS")
@NamedQueries({
    @NamedQuery(name = "DiagnosticosSecundarios.findAll", query = "SELECT d FROM DiagnosticosSecundarios d")})
public class DiagnosticosSecundarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiagnosticosSecundariosPK diagnosticosSecundariosPK;
    @Column(name = "OBSERVACION")
    private String observacion;

    public DiagnosticosSecundarios() {
    }

    public DiagnosticosSecundarios(DiagnosticosSecundariosPK diagnosticosSecundariosPK) {
        this.diagnosticosSecundariosPK = diagnosticosSecundariosPK;
    }

    public DiagnosticosSecundarios(int epcPrmatnNumero, int epcPrmatnPcnNumeroHc, long dgnpcnDgnpcnId) {
        this.diagnosticosSecundariosPK = new DiagnosticosSecundariosPK(epcPrmatnNumero, epcPrmatnPcnNumeroHc, dgnpcnDgnpcnId);
    }

    public DiagnosticosSecundariosPK getDiagnosticosSecundariosPK() {
        return diagnosticosSecundariosPK;
    }

    public void setDiagnosticosSecundariosPK(DiagnosticosSecundariosPK diagnosticosSecundariosPK) {
        this.diagnosticosSecundariosPK = diagnosticosSecundariosPK;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diagnosticosSecundariosPK != null ? diagnosticosSecundariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosSecundarios)) {
            return false;
        }
        DiagnosticosSecundarios other = (DiagnosticosSecundarios) object;
        if ((this.diagnosticosSecundariosPK == null && other.diagnosticosSecundariosPK != null) || (this.diagnosticosSecundariosPK != null && !this.diagnosticosSecundariosPK.equals(other.diagnosticosSecundariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DiagnosticosSecundarios[ diagnosticosSecundariosPK=" + diagnosticosSecundariosPK + " ]";
    }
    
}
