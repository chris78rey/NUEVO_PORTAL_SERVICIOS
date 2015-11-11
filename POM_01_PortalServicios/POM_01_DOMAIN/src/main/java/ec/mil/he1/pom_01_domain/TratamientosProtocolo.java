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
@Table(name = "TRATAMIENTOS_PROTOCOLO")
@NamedQueries({
    @NamedQuery(name = "TratamientosProtocolo.findAll", query = "SELECT t FROM TratamientosProtocolo t")})
public class TratamientosProtocolo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TratamientosProtocoloPK tratamientosProtocoloPK;

    public TratamientosProtocolo() {
    }

    public TratamientosProtocolo(TratamientosProtocoloPK tratamientosProtocoloPK) {
        this.tratamientosProtocoloPK = tratamientosProtocoloPK;
    }

    public TratamientosProtocolo(String mdcqmtCodigo, String prtqmtCodigo) {
        this.tratamientosProtocoloPK = new TratamientosProtocoloPK(mdcqmtCodigo, prtqmtCodigo);
    }

    public TratamientosProtocoloPK getTratamientosProtocoloPK() {
        return tratamientosProtocoloPK;
    }

    public void setTratamientosProtocoloPK(TratamientosProtocoloPK tratamientosProtocoloPK) {
        this.tratamientosProtocoloPK = tratamientosProtocoloPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tratamientosProtocoloPK != null ? tratamientosProtocoloPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TratamientosProtocolo)) {
            return false;
        }
        TratamientosProtocolo other = (TratamientosProtocolo) object;
        if ((this.tratamientosProtocoloPK == null && other.tratamientosProtocoloPK != null) || (this.tratamientosProtocoloPK != null && !this.tratamientosProtocoloPK.equals(other.tratamientosProtocoloPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TratamientosProtocolo[ tratamientosProtocoloPK=" + tratamientosProtocoloPK + " ]";
    }
    
}
