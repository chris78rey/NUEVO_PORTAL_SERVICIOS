/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
    @Column(name = "DSSQMT_NUMERO")
    private Short dssqmtNumero;
    @Column(name = "DSSQMT_PRSMDCQMT_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dssqmtPrsmdcqmtFecha;
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
    @Column(name = "DSSQMT_TRTQMT_QMT_NUMERO")
    private Integer dssqmtTrtqmtQmtNumero;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public CumplimientosQuimioterapia() {
    }

    public CumplimientosQuimioterapia(Long cmpqmtId) {
        this.cmpqmtId = cmpqmtId;
    }

    public Short getDssqmtNumero() {
        return dssqmtNumero;
    }

    public void setDssqmtNumero(Short dssqmtNumero) {
        this.dssqmtNumero = dssqmtNumero;
    }

    public Date getDssqmtPrsmdcqmtFecha() {
        return dssqmtPrsmdcqmtFecha;
    }

    public void setDssqmtPrsmdcqmtFecha(Date dssqmtPrsmdcqmtFecha) {
        this.dssqmtPrsmdcqmtFecha = dssqmtPrsmdcqmtFecha;
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

    public Integer getDssqmtTrtqmtQmtNumero() {
        return dssqmtTrtqmtQmtNumero;
    }

    public void setDssqmtTrtqmtQmtNumero(Integer dssqmtTrtqmtQmtNumero) {
        this.dssqmtTrtqmtQmtNumero = dssqmtTrtqmtQmtNumero;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        return "ec.mil.he1.pom_01_domain.CumplimientosQuimioterapia[ cmpqmtId=" + cmpqmtId + " ]";
    }
    
}
