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
    @Column(name = "FECHA_PLANIFICADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPlanificada;
    @Column(name = "FECHA_ADMINISTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAdministrada;
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumns({
        @JoinColumn(name = "DTLPRS_PRSMDC_PCN_NUMERO_HC", referencedColumnName = "PRSMDC_PCN_NUMERO_HC"),
        @JoinColumn(name = "DTLPRS_PRSMDC_FECHA", referencedColumnName = "PRSMDC_FECHA"),
        @JoinColumn(name = "DTLPRS_NUMERO", referencedColumnName = "NUMERO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private DetallesPrescripcion detallesPrescripcion;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

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

    public DetallesPrescripcion getDetallesPrescripcion() {
        return detallesPrescripcion;
    }

    public void setDetallesPrescripcion(DetallesPrescripcion detallesPrescripcion) {
        this.detallesPrescripcion = detallesPrescripcion;
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
        return "ec.mil.he1.pom_02_domain.entities.MomentosCumplimiento[ mmncmpId=" + mmncmpId + " ]";
    }
    
}
