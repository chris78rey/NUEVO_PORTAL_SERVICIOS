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
@Table(name = "EMG_DIAGNOSTICOS_ALTA")
@NamedQueries({
    @NamedQuery(name = "EmgDiagnosticosAlta.findAll", query = "SELECT e FROM EmgDiagnosticosAlta e")})
public class EmgDiagnosticosAlta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmgDiagnosticosAltaPK emgDiagnosticosAltaPK;

    public EmgDiagnosticosAlta() {
    }

    public EmgDiagnosticosAlta(EmgDiagnosticosAltaPK emgDiagnosticosAltaPK) {
        this.emgDiagnosticosAltaPK = emgDiagnosticosAltaPK;
    }

    public EmgDiagnosticosAlta(String emgId, long dgnpcnDgnpcnId) {
        this.emgDiagnosticosAltaPK = new EmgDiagnosticosAltaPK(emgId, dgnpcnDgnpcnId);
    }

    public EmgDiagnosticosAltaPK getEmgDiagnosticosAltaPK() {
        return emgDiagnosticosAltaPK;
    }

    public void setEmgDiagnosticosAltaPK(EmgDiagnosticosAltaPK emgDiagnosticosAltaPK) {
        this.emgDiagnosticosAltaPK = emgDiagnosticosAltaPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emgDiagnosticosAltaPK != null ? emgDiagnosticosAltaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmgDiagnosticosAlta)) {
            return false;
        }
        EmgDiagnosticosAlta other = (EmgDiagnosticosAlta) object;
        if ((this.emgDiagnosticosAltaPK == null && other.emgDiagnosticosAltaPK != null) || (this.emgDiagnosticosAltaPK != null && !this.emgDiagnosticosAltaPK.equals(other.emgDiagnosticosAltaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EmgDiagnosticosAlta[ emgDiagnosticosAltaPK=" + emgDiagnosticosAltaPK + " ]";
    }
    
}
