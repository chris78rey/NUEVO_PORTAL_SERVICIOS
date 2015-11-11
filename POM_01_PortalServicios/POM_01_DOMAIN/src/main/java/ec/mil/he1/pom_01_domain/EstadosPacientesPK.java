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
public class EstadosPacientesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DGNPCN_DGNPCN_ID")
    private long dgnpcnDgnpcnId;
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private int pcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public EstadosPacientesPK() {
    }

    public EstadosPacientesPK(long dgnpcnDgnpcnId, int pcnNumeroHc, Date fecha) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
        this.pcnNumeroHc = pcnNumeroHc;
        this.fecha = fecha;
    }

    public long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public int getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(int pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
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
        hash += (int) dgnpcnDgnpcnId;
        hash += (int) pcnNumeroHc;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadosPacientesPK)) {
            return false;
        }
        EstadosPacientesPK other = (EstadosPacientesPK) object;
        if (this.dgnpcnDgnpcnId != other.dgnpcnDgnpcnId) {
            return false;
        }
        if (this.pcnNumeroHc != other.pcnNumeroHc) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EstadosPacientesPK[ dgnpcnDgnpcnId=" + dgnpcnDgnpcnId + ", pcnNumeroHc=" + pcnNumeroHc + ", fecha=" + fecha + " ]";
    }
    
}
