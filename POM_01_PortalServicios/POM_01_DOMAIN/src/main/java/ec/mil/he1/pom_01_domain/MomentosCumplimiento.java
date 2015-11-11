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
@Table(name = "MOMENTOS_CUMPLIMIENTO")
@NamedQueries({
    @NamedQuery(name = "MomentosCumplimiento.findAll", query = "SELECT m FROM MomentosCumplimiento m")})
public class MomentosCumplimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MMNCMP_ID")
    private Long mmncmpId;
    @Column(name = "ESTADO_CUMPLIMIENTO")
    private String estadoCumplimiento;
    @Column(name = "DTLPRS_PRSMDC_PCN_NUMERO_HC")
    private Integer dtlprsPrsmdcPcnNumeroHc;
    @Column(name = "DTLPRS_PRSMDC_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtlprsPrsmdcFecha;
    @Column(name = "DTLPRS_NUMERO")
    private Short dtlprsNumero;
    @Column(name = "FECHA_PLANIFICADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPlanificada;
    @Column(name = "FECHA_ADMINISTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAdministrada;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public MomentosCumplimiento() {
    }

    public MomentosCumplimiento(Long mmncmpId) {
        this.mmncmpId = mmncmpId;
    }

    public Long getMmncmpId() {
        return mmncmpId;
    }

    public void setMmncmpId(Long mmncmpId) {
        this.mmncmpId = mmncmpId;
    }

    public String getEstadoCumplimiento() {
        return estadoCumplimiento;
    }

    public void setEstadoCumplimiento(String estadoCumplimiento) {
        this.estadoCumplimiento = estadoCumplimiento;
    }

    public Integer getDtlprsPrsmdcPcnNumeroHc() {
        return dtlprsPrsmdcPcnNumeroHc;
    }

    public void setDtlprsPrsmdcPcnNumeroHc(Integer dtlprsPrsmdcPcnNumeroHc) {
        this.dtlprsPrsmdcPcnNumeroHc = dtlprsPrsmdcPcnNumeroHc;
    }

    public Date getDtlprsPrsmdcFecha() {
        return dtlprsPrsmdcFecha;
    }

    public void setDtlprsPrsmdcFecha(Date dtlprsPrsmdcFecha) {
        this.dtlprsPrsmdcFecha = dtlprsPrsmdcFecha;
    }

    public Short getDtlprsNumero() {
        return dtlprsNumero;
    }

    public void setDtlprsNumero(Short dtlprsNumero) {
        this.dtlprsNumero = dtlprsNumero;
    }

    public Date getFechaPlanificada() {
        return fechaPlanificada;
    }

    public void setFechaPlanificada(Date fechaPlanificada) {
        this.fechaPlanificada = fechaPlanificada;
    }

    public Date getFechaAdministrada() {
        return fechaAdministrada;
    }

    public void setFechaAdministrada(Date fechaAdministrada) {
        this.fechaAdministrada = fechaAdministrada;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mmncmpId != null ? mmncmpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MomentosCumplimiento)) {
            return false;
        }
        MomentosCumplimiento other = (MomentosCumplimiento) object;
        if ((this.mmncmpId == null && other.mmncmpId != null) || (this.mmncmpId != null && !this.mmncmpId.equals(other.mmncmpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MomentosCumplimiento[ mmncmpId=" + mmncmpId + " ]";
    }
    
}
