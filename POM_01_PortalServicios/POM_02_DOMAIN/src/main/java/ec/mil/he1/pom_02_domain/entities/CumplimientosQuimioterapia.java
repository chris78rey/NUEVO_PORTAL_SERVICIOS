/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "CUMPLIMIENTOS_QUIMIOTERAPIA")
@NamedQueries({
    @NamedQuery(name = "CumplimientosQuimioterapia.findAll", query = "SELECT c FROM CumplimientosQuimioterapia c")})
public class CumplimientosQuimioterapia implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DOSIS")
    private BigDecimal dosis;
    @Column(name = "HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    @Id
    @Basic(optional = false)
    @Column(name = "CMPQMT_ID")
    private Long cmpqmtId;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumns({
        @JoinColumn(name = "DSSQMT_PRSMDCQMT_FECHA", referencedColumnName = "PRSMDCQMT_FECHA"),
        @JoinColumn(name = "DSSQMT_TRTQMT_QMT_NUMERO", referencedColumnName = "PRSMDCQMT_QMT_NUMERO"),
        @JoinColumn(name = "DSSQMT_NUMERO", referencedColumnName = "NUMERO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private DosisQuimioterapia dosisQuimioterapia;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public CumplimientosQuimioterapia() {
    }

    public CumplimientosQuimioterapia(Long cmpqmtId) {
        this.cmpqmtId = cmpqmtId;
    }

    public BigDecimal getDosis() {
        return dosis;
    }

    public void setDosis(BigDecimal dosis) {
        this.dosis = dosis;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Long getCmpqmtId() {
        return cmpqmtId;
    }

    public void setCmpqmtId(Long cmpqmtId) {
        this.cmpqmtId = cmpqmtId;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public DosisQuimioterapia getDosisQuimioterapia() {
        return dosisQuimioterapia;
    }

    public void setDosisQuimioterapia(DosisQuimioterapia dosisQuimioterapia) {
        this.dosisQuimioterapia = dosisQuimioterapia;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmpqmtId != null ? cmpqmtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CumplimientosQuimioterapia)) {
            return false;
        }
        CumplimientosQuimioterapia other = (CumplimientosQuimioterapia) object;
        if ((this.cmpqmtId == null && other.cmpqmtId != null) || (this.cmpqmtId != null && !this.cmpqmtId.equals(other.cmpqmtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CumplimientosQuimioterapia[ cmpqmtId=" + cmpqmtId + " ]";
    }
    
}
