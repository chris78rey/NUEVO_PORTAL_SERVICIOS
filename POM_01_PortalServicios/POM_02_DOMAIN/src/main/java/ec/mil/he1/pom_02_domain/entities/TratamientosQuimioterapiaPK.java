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
public class TratamientosQuimioterapiaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MDCQMT_CODIGO")
    private String mdcqmtCodigo;
    @Basic(optional = false)
    @Column(name = "QMT_NUMERO")
    private int qmtNumero;
    @Basic(optional = false)
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;

    public TratamientosQuimioterapiaPK() {
    }

    public TratamientosQuimioterapiaPK(String mdcqmtCodigo, int qmtNumero, Date fechaInicio) {
        this.mdcqmtCodigo = mdcqmtCodigo;
        this.qmtNumero = qmtNumero;
        this.fechaInicio = fechaInicio;
    }

    public String getMdcqmtCodigo() {
        return mdcqmtCodigo;
    }

    public void setMdcqmtCodigo(String mdcqmtCodigo) {
        this.mdcqmtCodigo = mdcqmtCodigo;
    }

    public int getQmtNumero() {
        return qmtNumero;
    }

    public void setQmtNumero(int qmtNumero) {
        this.qmtNumero = qmtNumero;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdcqmtCodigo != null ? mdcqmtCodigo.hashCode() : 0);
        hash += (int) qmtNumero;
        hash += (fechaInicio != null ? fechaInicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TratamientosQuimioterapiaPK)) {
            return false;
        }
        TratamientosQuimioterapiaPK other = (TratamientosQuimioterapiaPK) object;
        if ((this.mdcqmtCodigo == null && other.mdcqmtCodigo != null) || (this.mdcqmtCodigo != null && !this.mdcqmtCodigo.equals(other.mdcqmtCodigo))) {
            return false;
        }
        if (this.qmtNumero != other.qmtNumero) {
            return false;
        }
        if ((this.fechaInicio == null && other.fechaInicio != null) || (this.fechaInicio != null && !this.fechaInicio.equals(other.fechaInicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TratamientosQuimioterapiaPK[ mdcqmtCodigo=" + mdcqmtCodigo + ", qmtNumero=" + qmtNumero + ", fechaInicio=" + fechaInicio + " ]";
    }
    
}
