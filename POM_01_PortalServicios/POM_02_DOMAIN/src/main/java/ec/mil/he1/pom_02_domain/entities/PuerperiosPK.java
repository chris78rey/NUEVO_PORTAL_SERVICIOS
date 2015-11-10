/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

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
public class PuerperiosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RGSOBS_PCN_NUMERO_HC")
    private int rgsobsPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "RGSOBS_NUMERO")
    private int rgsobsNumero;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public PuerperiosPK() {
    }

    public PuerperiosPK(int rgsobsPcnNumeroHc, int rgsobsNumero, Date fecha) {
        this.rgsobsPcnNumeroHc = rgsobsPcnNumeroHc;
        this.rgsobsNumero = rgsobsNumero;
        this.fecha = fecha;
    }

    public int getRgsobsPcnNumeroHc() {
        return rgsobsPcnNumeroHc;
    }

    public void setRgsobsPcnNumeroHc(int rgsobsPcnNumeroHc) {
        this.rgsobsPcnNumeroHc = rgsobsPcnNumeroHc;
    }

    public int getRgsobsNumero() {
        return rgsobsNumero;
    }

    public void setRgsobsNumero(int rgsobsNumero) {
        this.rgsobsNumero = rgsobsNumero;
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
        hash += (int) rgsobsPcnNumeroHc;
        hash += (int) rgsobsNumero;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuerperiosPK)) {
            return false;
        }
        PuerperiosPK other = (PuerperiosPK) object;
        if (this.rgsobsPcnNumeroHc != other.rgsobsPcnNumeroHc) {
            return false;
        }
        if (this.rgsobsNumero != other.rgsobsNumero) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PuerperiosPK[ rgsobsPcnNumeroHc=" + rgsobsPcnNumeroHc + ", rgsobsNumero=" + rgsobsNumero + ", fecha=" + fecha + " ]";
    }
    
}
