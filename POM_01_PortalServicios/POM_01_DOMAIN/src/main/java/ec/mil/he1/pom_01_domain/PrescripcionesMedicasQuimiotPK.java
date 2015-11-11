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
public class PrescripcionesMedicasQuimiotPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "QMT_NUMERO")
    private int qmtNumero;

    public PrescripcionesMedicasQuimiotPK() {
    }

    public PrescripcionesMedicasQuimiotPK(Date fecha, int qmtNumero) {
        this.fecha = fecha;
        this.qmtNumero = qmtNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getQmtNumero() {
        return qmtNumero;
    }

    public void setQmtNumero(int qmtNumero) {
        this.qmtNumero = qmtNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fecha != null ? fecha.hashCode() : 0);
        hash += (int) qmtNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrescripcionesMedicasQuimiotPK)) {
            return false;
        }
        PrescripcionesMedicasQuimiotPK other = (PrescripcionesMedicasQuimiotPK) object;
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        if (this.qmtNumero != other.qmtNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PrescripcionesMedicasQuimiotPK[ fecha=" + fecha + ", qmtNumero=" + qmtNumero + " ]";
    }
    
}
