/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "DIAGNOSTICOS_PATOLOGICOS")
@NamedQueries({
    @NamedQuery(name = "DiagnosticosPatologicos.findAll", query = "SELECT d FROM DiagnosticosPatologicos d")})
public class DiagnosticosPatologicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiagnosticosPatologicosPK diagnosticosPatologicosPK;

    public DiagnosticosPatologicos() {
    }

    public DiagnosticosPatologicos(DiagnosticosPatologicosPK diagnosticosPatologicosPK) {
        this.diagnosticosPatologicosPK = diagnosticosPatologicosPK;
    }

    public DiagnosticosPatologicos(String sesionId, String dgnlbrCodigo) {
        this.diagnosticosPatologicosPK = new DiagnosticosPatologicosPK(sesionId, dgnlbrCodigo);
    }

    public DiagnosticosPatologicosPK getDiagnosticosPatologicosPK() {
        return diagnosticosPatologicosPK;
    }

    public void setDiagnosticosPatologicosPK(DiagnosticosPatologicosPK diagnosticosPatologicosPK) {
        this.diagnosticosPatologicosPK = diagnosticosPatologicosPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diagnosticosPatologicosPK != null ? diagnosticosPatologicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosPatologicos)) {
            return false;
        }
        DiagnosticosPatologicos other = (DiagnosticosPatologicos) object;
        if ((this.diagnosticosPatologicosPK == null && other.diagnosticosPatologicosPK != null) || (this.diagnosticosPatologicosPK != null && !this.diagnosticosPatologicosPK.equals(other.diagnosticosPatologicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DiagnosticosPatologicos[ diagnosticosPatologicosPK=" + diagnosticosPatologicosPK + " ]";
    }
    
}
