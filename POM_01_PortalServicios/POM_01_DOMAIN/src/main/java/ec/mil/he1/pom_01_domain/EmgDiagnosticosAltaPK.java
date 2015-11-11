/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class EmgDiagnosticosAltaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMG_ID")
    private String emgId;
    @Basic(optional = false)
    @Column(name = "DGNPCN_DGNPCN_ID")
    private long dgnpcnDgnpcnId;

    public EmgDiagnosticosAltaPK() {
    }

    public EmgDiagnosticosAltaPK(String emgId, long dgnpcnDgnpcnId) {
        this.emgId = emgId;
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public String getEmgId() {
        return emgId;
    }

    public void setEmgId(String emgId) {
        this.emgId = emgId;
    }

    public long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emgId != null ? emgId.hashCode() : 0);
        hash += (int) dgnpcnDgnpcnId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmgDiagnosticosAltaPK)) {
            return false;
        }
        EmgDiagnosticosAltaPK other = (EmgDiagnosticosAltaPK) object;
        if ((this.emgId == null && other.emgId != null) || (this.emgId != null && !this.emgId.equals(other.emgId))) {
            return false;
        }
        if (this.dgnpcnDgnpcnId != other.dgnpcnDgnpcnId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EmgDiagnosticosAltaPK[ emgId=" + emgId + ", dgnpcnDgnpcnId=" + dgnpcnDgnpcnId + " ]";
    }
    
}
