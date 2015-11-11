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
public class TratamientosProtocoloPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MDCQMT_CODIGO")
    private String mdcqmtCodigo;
    @Basic(optional = false)
    @Column(name = "PRTQMT_CODIGO")
    private String prtqmtCodigo;

    public TratamientosProtocoloPK() {
    }

    public TratamientosProtocoloPK(String mdcqmtCodigo, String prtqmtCodigo) {
        this.mdcqmtCodigo = mdcqmtCodigo;
        this.prtqmtCodigo = prtqmtCodigo;
    }

    public String getMdcqmtCodigo() {
        return mdcqmtCodigo;
    }

    public void setMdcqmtCodigo(String mdcqmtCodigo) {
        this.mdcqmtCodigo = mdcqmtCodigo;
    }

    public String getPrtqmtCodigo() {
        return prtqmtCodigo;
    }

    public void setPrtqmtCodigo(String prtqmtCodigo) {
        this.prtqmtCodigo = prtqmtCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdcqmtCodigo != null ? mdcqmtCodigo.hashCode() : 0);
        hash += (prtqmtCodigo != null ? prtqmtCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TratamientosProtocoloPK)) {
            return false;
        }
        TratamientosProtocoloPK other = (TratamientosProtocoloPK) object;
        if ((this.mdcqmtCodigo == null && other.mdcqmtCodigo != null) || (this.mdcqmtCodigo != null && !this.mdcqmtCodigo.equals(other.mdcqmtCodigo))) {
            return false;
        }
        if ((this.prtqmtCodigo == null && other.prtqmtCodigo != null) || (this.prtqmtCodigo != null && !this.prtqmtCodigo.equals(other.prtqmtCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TratamientosProtocoloPK[ mdcqmtCodigo=" + mdcqmtCodigo + ", prtqmtCodigo=" + prtqmtCodigo + " ]";
    }
    
}
