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
public class PreAnesMedicamentosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PREANS_RGSOPR_PRTOPRSLC_PCN_NU")
    private int preansRgsoprPrtoprslcPcnNu;
    @Basic(optional = false)
    @Column(name = "PREANS_RGSOPR_PRTOPRSLC_NUMERO")
    private int preansRgsoprPrtoprslcNumero;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public PreAnesMedicamentosPK() {
    }

    public PreAnesMedicamentosPK(int preansRgsoprPrtoprslcPcnNu, int preansRgsoprPrtoprslcNumero, Date fecha) {
        this.preansRgsoprPrtoprslcPcnNu = preansRgsoprPrtoprslcPcnNu;
        this.preansRgsoprPrtoprslcNumero = preansRgsoprPrtoprslcNumero;
        this.fecha = fecha;
    }

    public int getPreansRgsoprPrtoprslcPcnNu() {
        return preansRgsoprPrtoprslcPcnNu;
    }

    public void setPreansRgsoprPrtoprslcPcnNu(int preansRgsoprPrtoprslcPcnNu) {
        this.preansRgsoprPrtoprslcPcnNu = preansRgsoprPrtoprslcPcnNu;
    }

    public int getPreansRgsoprPrtoprslcNumero() {
        return preansRgsoprPrtoprslcNumero;
    }

    public void setPreansRgsoprPrtoprslcNumero(int preansRgsoprPrtoprslcNumero) {
        this.preansRgsoprPrtoprslcNumero = preansRgsoprPrtoprslcNumero;
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
        hash += (int) preansRgsoprPrtoprslcPcnNu;
        hash += (int) preansRgsoprPrtoprslcNumero;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreAnesMedicamentosPK)) {
            return false;
        }
        PreAnesMedicamentosPK other = (PreAnesMedicamentosPK) object;
        if (this.preansRgsoprPrtoprslcPcnNu != other.preansRgsoprPrtoprslcPcnNu) {
            return false;
        }
        if (this.preansRgsoprPrtoprslcNumero != other.preansRgsoprPrtoprslcNumero) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PreAnesMedicamentosPK[ preansRgsoprPrtoprslcPcnNu=" + preansRgsoprPrtoprslcPcnNu + ", preansRgsoprPrtoprslcNumero=" + preansRgsoprPrtoprslcNumero + ", fecha=" + fecha + " ]";
    }
    
}
