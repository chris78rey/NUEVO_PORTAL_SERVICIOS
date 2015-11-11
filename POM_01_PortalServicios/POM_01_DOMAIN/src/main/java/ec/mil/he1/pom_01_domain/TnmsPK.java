/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class TnmsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DGN_DGN_ID")
    private long dgnDgnId;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public TnmsPK() {
    }

    public TnmsPK(long dgnDgnId, Date fecha) {
        this.dgnDgnId = dgnDgnId;
        this.fecha = fecha;
    }

    public long getDgnDgnId() {
        return dgnDgnId;
    }

    public void setDgnDgnId(long dgnDgnId) {
        this.dgnDgnId = dgnDgnId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dgnDgnId;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TnmsPK)) {
            return false;
        }
        TnmsPK other = (TnmsPK) object;
        if (this.dgnDgnId != other.dgnDgnId) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TnmsPK[ dgnDgnId=" + dgnDgnId + ", fecha=" + fecha + " ]";
    }
    
}
