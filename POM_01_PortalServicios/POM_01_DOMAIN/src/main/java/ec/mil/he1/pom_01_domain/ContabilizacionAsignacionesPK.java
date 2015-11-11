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
public class ContabilizacionAsignacionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Basic(optional = false)
    @Column(name = "CNTASG_ID")
    private long cntasgId;

    public ContabilizacionAsignacionesPK() {
    }

    public ContabilizacionAsignacionesPK(String empCodigo, long cntasgId) {
        this.empCodigo = empCodigo;
        this.cntasgId = cntasgId;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public long getCntasgId() {
        return cntasgId;
    }

    public void setCntasgId(long cntasgId) {
        this.cntasgId = cntasgId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empCodigo != null ? empCodigo.hashCode() : 0);
        hash += (int) cntasgId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContabilizacionAsignacionesPK)) {
            return false;
        }
        ContabilizacionAsignacionesPK other = (ContabilizacionAsignacionesPK) object;
        if ((this.empCodigo == null && other.empCodigo != null) || (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
            return false;
        }
        if (this.cntasgId != other.cntasgId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ContabilizacionAsignacionesPK[ empCodigo=" + empCodigo + ", cntasgId=" + cntasgId + " ]";
    }
    
}
