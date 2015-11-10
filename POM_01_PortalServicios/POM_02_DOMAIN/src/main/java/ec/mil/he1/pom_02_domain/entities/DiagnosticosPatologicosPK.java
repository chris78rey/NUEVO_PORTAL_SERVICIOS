/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class DiagnosticosPatologicosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SESION_ID")
    private String sesionId;
    @Basic(optional = false)
    @Column(name = "DGNLBR_CODIGO")
    private String dgnlbrCodigo;

    public DiagnosticosPatologicosPK() {
    }

    public DiagnosticosPatologicosPK(String sesionId, String dgnlbrCodigo) {
        this.sesionId = sesionId;
        this.dgnlbrCodigo = dgnlbrCodigo;
    }

    public String getSesionId() {
        return sesionId;
    }

    public void setSesionId(String sesionId) {
        this.sesionId = sesionId;
    }

    public String getDgnlbrCodigo() {
        return dgnlbrCodigo;
    }

    public void setDgnlbrCodigo(String dgnlbrCodigo) {
        this.dgnlbrCodigo = dgnlbrCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sesionId != null ? sesionId.hashCode() : 0);
        hash += (dgnlbrCodigo != null ? dgnlbrCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosPatologicosPK)) {
            return false;
        }
        DiagnosticosPatologicosPK other = (DiagnosticosPatologicosPK) object;
        if ((this.sesionId == null && other.sesionId != null) || (this.sesionId != null && !this.sesionId.equals(other.sesionId))) {
            return false;
        }
        if ((this.dgnlbrCodigo == null && other.dgnlbrCodigo != null) || (this.dgnlbrCodigo != null && !this.dgnlbrCodigo.equals(other.dgnlbrCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DiagnosticosPatologicosPK[ sesionId=" + sesionId + ", dgnlbrCodigo=" + dgnlbrCodigo + " ]";
    }
    
}
