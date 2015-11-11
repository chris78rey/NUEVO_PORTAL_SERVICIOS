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
public class ControlesPrenatalesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMB_NUMERO")
    private int embNumero;
    @Basic(optional = false)
    @Column(name = "EMB_PCN_NUMERO_HC")
    private int embPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public ControlesPrenatalesPK() {
    }

    public ControlesPrenatalesPK(int embNumero, int embPcnNumeroHc, Date fecha) {
        this.embNumero = embNumero;
        this.embPcnNumeroHc = embPcnNumeroHc;
        this.fecha = fecha;
    }

    public int getEmbNumero() {
        return embNumero;
    }

    public void setEmbNumero(int embNumero) {
        this.embNumero = embNumero;
    }

    public int getEmbPcnNumeroHc() {
        return embPcnNumeroHc;
    }

    public void setEmbPcnNumeroHc(int embPcnNumeroHc) {
        this.embPcnNumeroHc = embPcnNumeroHc;
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
        hash += (int) embNumero;
        hash += (int) embPcnNumeroHc;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlesPrenatalesPK)) {
            return false;
        }
        ControlesPrenatalesPK other = (ControlesPrenatalesPK) object;
        if (this.embNumero != other.embNumero) {
            return false;
        }
        if (this.embPcnNumeroHc != other.embPcnNumeroHc) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ControlesPrenatalesPK[ embNumero=" + embNumero + ", embPcnNumeroHc=" + embPcnNumeroHc + ", fecha=" + fecha + " ]";
    }
    
}
