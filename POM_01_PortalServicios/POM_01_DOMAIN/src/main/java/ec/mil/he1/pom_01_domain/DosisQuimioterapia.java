/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DOSIS_QUIMIOTERAPIA")
@NamedQueries({
    @NamedQuery(name = "DosisQuimioterapia.findAll", query = "SELECT d FROM DosisQuimioterapia d")})
public class DosisQuimioterapia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DosisQuimioterapiaPK dosisQuimioterapiaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "TRTQMT_FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trtqmtFechaInicio;
    @Column(name = "TRTQMT_MDCQMT_CODIGO")
    private String trtqmtMdcqmtCodigo;
    @Column(name = "TRTQMT_QMT_NUMERO")
    private Integer trtqmtQmtNumero;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public DosisQuimioterapia() {
    }

    public DosisQuimioterapia(DosisQuimioterapiaPK dosisQuimioterapiaPK) {
        this.dosisQuimioterapiaPK = dosisQuimioterapiaPK;
    }

    public DosisQuimioterapia(Date prsmdcqmtFecha, short numero, int prsmdcqmtQmtNumero) {
        this.dosisQuimioterapiaPK = new DosisQuimioterapiaPK(prsmdcqmtFecha, numero, prsmdcqmtQmtNumero);
    }

    public DosisQuimioterapiaPK getDosisQuimioterapiaPK() {
        return dosisQuimioterapiaPK;
    }

    public void setDosisQuimioterapiaPK(DosisQuimioterapiaPK dosisQuimioterapiaPK) {
        this.dosisQuimioterapiaPK = dosisQuimioterapiaPK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Date getTrtqmtFechaInicio() {
        return trtqmtFechaInicio;
    }

    public void setTrtqmtFechaInicio(Date trtqmtFechaInicio) {
        this.trtqmtFechaInicio = trtqmtFechaInicio;
    }

    public String getTrtqmtMdcqmtCodigo() {
        return trtqmtMdcqmtCodigo;
    }

    public void setTrtqmtMdcqmtCodigo(String trtqmtMdcqmtCodigo) {
        this.trtqmtMdcqmtCodigo = trtqmtMdcqmtCodigo;
    }

    public Integer getTrtqmtQmtNumero() {
        return trtqmtQmtNumero;
    }

    public void setTrtqmtQmtNumero(Integer trtqmtQmtNumero) {
        this.trtqmtQmtNumero = trtqmtQmtNumero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dosisQuimioterapiaPK != null ? dosisQuimioterapiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DosisQuimioterapia)) {
            return false;
        }
        DosisQuimioterapia other = (DosisQuimioterapia) object;
        if ((this.dosisQuimioterapiaPK == null && other.dosisQuimioterapiaPK != null) || (this.dosisQuimioterapiaPK != null && !this.dosisQuimioterapiaPK.equals(other.dosisQuimioterapiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DosisQuimioterapia[ dosisQuimioterapiaPK=" + dosisQuimioterapiaPK + " ]";
    }
    
}
