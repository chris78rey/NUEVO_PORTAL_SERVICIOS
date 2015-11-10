/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
@Table(name = "CALENDARIOS_PROCEDIMIENTOS")
@NamedQueries({
    @NamedQuery(name = "CalendariosProcedimientos.findAll", query = "SELECT c FROM CalendariosProcedimientos c")})
public class CalendariosProcedimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CalendariosProcedimientosPK calendariosProcedimientosPK;
    @Column(name = "NRO_PROCEDIMIENTOS")
    private Short nroProcedimientos;
    @Column(name = "HORA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicio;
    @Column(name = "HORA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFin;
    @Column(name = "CONSULTORIO_FISICO")
    private String consultorioFisico;
    @Column(name = "ESTADO")
    private Character estado;
    @JoinColumn(name = "CNSPRC_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ConsultoriosProcedimientos consultoriosProcedimientos;
    @JoinColumn(name = "ESP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Especialidades especialidades;

    public CalendariosProcedimientos() {
    }

    public CalendariosProcedimientos(CalendariosProcedimientosPK calendariosProcedimientosPK) {
        this.calendariosProcedimientosPK = calendariosProcedimientosPK;
    }

    public CalendariosProcedimientos(String cnsprcCodigo, String espCodigo, short codJornada, String dia) {
        this.calendariosProcedimientosPK = new CalendariosProcedimientosPK(cnsprcCodigo, espCodigo, codJornada, dia);
    }

    public CalendariosProcedimientosPK getCalendariosProcedimientosPK() {
        return calendariosProcedimientosPK;
    }

    public void setCalendariosProcedimientosPK(CalendariosProcedimientosPK calendariosProcedimientosPK) {
        this.calendariosProcedimientosPK = calendariosProcedimientosPK;
    }

    public Short getNroProcedimientos() {
        return nroProcedimientos;
    }

    public void setNroProcedimientos(Short nroProcedimientos) {
        this.nroProcedimientos = nroProcedimientos;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getConsultorioFisico() {
        return consultorioFisico;
    }

    public void setConsultorioFisico(String consultorioFisico) {
        this.consultorioFisico = consultorioFisico;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public ConsultoriosProcedimientos getConsultoriosProcedimientos() {
        return consultoriosProcedimientos;
    }

    public void setConsultoriosProcedimientos(ConsultoriosProcedimientos consultoriosProcedimientos) {
        this.consultoriosProcedimientos = consultoriosProcedimientos;
    }

    public Especialidades getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (calendariosProcedimientosPK != null ? calendariosProcedimientosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalendariosProcedimientos)) {
            return false;
        }
        CalendariosProcedimientos other = (CalendariosProcedimientos) object;
        if ((this.calendariosProcedimientosPK == null && other.calendariosProcedimientosPK != null) || (this.calendariosProcedimientosPK != null && !this.calendariosProcedimientosPK.equals(other.calendariosProcedimientosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CalendariosProcedimientos[ calendariosProcedimientosPK=" + calendariosProcedimientosPK + " ]";
    }
    
}
