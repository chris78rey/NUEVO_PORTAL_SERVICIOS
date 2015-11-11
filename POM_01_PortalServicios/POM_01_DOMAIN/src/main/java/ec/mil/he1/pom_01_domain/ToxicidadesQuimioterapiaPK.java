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
public class ToxicidadesQuimioterapiaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "QMT_NUMERO")
    private int qmtNumero;
    @Basic(optional = false)
    @Column(name = "TPOTXC_CODIGO")
    private String tpotxcCodigo;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public ToxicidadesQuimioterapiaPK() {
    }

    public ToxicidadesQuimioterapiaPK(int qmtNumero, String tpotxcCodigo, Date fecha) {
        this.qmtNumero = qmtNumero;
        this.tpotxcCodigo = tpotxcCodigo;
        this.fecha = fecha;
    }

    public int getQmtNumero() {
        return qmtNumero;
    }

    public void setQmtNumero(int qmtNumero) {
        this.qmtNumero = qmtNumero;
    }

    public String getTpotxcCodigo() {
        return tpotxcCodigo;
    }

    public void setTpotxcCodigo(String tpotxcCodigo) {
        this.tpotxcCodigo = tpotxcCodigo;
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
        hash += (int) qmtNumero;
        hash += (tpotxcCodigo != null ? tpotxcCodigo.hashCode() : 0);
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ToxicidadesQuimioterapiaPK)) {
            return false;
        }
        ToxicidadesQuimioterapiaPK other = (ToxicidadesQuimioterapiaPK) object;
        if (this.qmtNumero != other.qmtNumero) {
            return false;
        }
        if ((this.tpotxcCodigo == null && other.tpotxcCodigo != null) || (this.tpotxcCodigo != null && !this.tpotxcCodigo.equals(other.tpotxcCodigo))) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ToxicidadesQuimioterapiaPK[ qmtNumero=" + qmtNumero + ", tpotxcCodigo=" + tpotxcCodigo + ", fecha=" + fecha + " ]";
    }
    
}
