/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "TURNOS_PROCEDIMIENTOS")
@NamedQueries({
    @NamedQuery(name = "TurnosProcedimientos.findAll", query = "SELECT t FROM TurnosProcedimientos t")})
public class TurnosProcedimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "COD_JORNADA")
    private Short codJornada;
    @Column(name = "NRO_TURNO")
    private Short nroTurno;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "COD_PROCEDIMIENTO")
    private String codProcedimiento;
    @Column(name = "ANESTESIA")
    private Character anestesia;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Column(name = "HORA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicio;
    @Column(name = "HORA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFin;
    @Column(name = "HORA_AGENDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaAgenda;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @JoinColumn(name = "CNSPRC_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ConsultoriosProcedimientos consultoriosProcedimientos;
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "COD_ESPECIALIDAD", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Especialidades especialidades;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumns({
        @JoinColumn(name = "PRMATN_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumn(name = "PRS_ATENDIDO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;

    public TurnosProcedimientos() {
    }

    public TurnosProcedimientos(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Short getCodJornada() {
        return codJornada;
    }

    public void setCodJornada(Short codJornada) {
        this.codJornada = codJornada;
    }

    public Short getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(Short nroTurno) {
        this.nroTurno = nroTurno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodProcedimiento() {
        return codProcedimiento;
    }

    public void setCodProcedimiento(String codProcedimiento) {
        this.codProcedimiento = codProcedimiento;
    }

    public Character getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(Character anestesia) {
        this.anestesia = anestesia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
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

    public Date getHoraAgenda() {
        return horaAgenda;
    }

    public void setHoraAgenda(Date horaAgenda) {
        this.horaAgenda = horaAgenda;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ConsultoriosProcedimientos getConsultoriosProcedimientos() {
        return consultoriosProcedimientos;
    }

    public void setConsultoriosProcedimientos(ConsultoriosProcedimientos consultoriosProcedimientos) {
        this.consultoriosProcedimientos = consultoriosProcedimientos;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
    }

    public Especialidades getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public PermanenciasYAtenciones getPermanenciasYAtenciones() {
        return permanenciasYAtenciones;
    }

    public void setPermanenciasYAtenciones(PermanenciasYAtenciones permanenciasYAtenciones) {
        this.permanenciasYAtenciones = permanenciasYAtenciones;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurnosProcedimientos)) {
            return false;
        }
        TurnosProcedimientos other = (TurnosProcedimientos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TurnosProcedimientos[ id=" + id + " ]";
    }
    
}
