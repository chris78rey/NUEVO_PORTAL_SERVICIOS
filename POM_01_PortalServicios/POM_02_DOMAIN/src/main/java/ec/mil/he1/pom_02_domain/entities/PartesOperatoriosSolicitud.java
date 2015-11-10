/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PARTES_OPERATORIOS_SOLICITUD")
@NamedQueries({
    @NamedQuery(name = "PartesOperatoriosSolicitud.findAll", query = "SELECT p FROM PartesOperatoriosSolicitud p")})
public class PartesOperatoriosSolicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartesOperatoriosSolicitudPK partesOperatoriosSolicitudPK;
    @Column(name = "MODALIDAD")
    private String modalidad;
    @Column(name = "FECHA_PROPUESTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPropuesta;
    @Column(name = "ANULADA")
    private Character anulada;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "MOTIVO_ANULACION")
    private String motivoAnulacion;
    @Column(name = "HORA_PROGRAMADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaProgramada;
    @Column(name = "QUIROFANO")
    private String quirofano;
    @Column(name = "PENSIONADO")
    private Character pensionado;
    @Column(name = "AREA_SOLICITANTE")
    private String areaSolicitante;
    @Column(name = "TIPO_ANESTESIA_SOLICITADA")
    private String tipoAnestesiaSolicitada;
    @JoinColumn(name = "DGNPCN_ID_PREQUIRURGICO", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "HJAEVL_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private HojasDeEvolucion hojasDeEvolucion;
    @JoinColumn(name = "HJAINT_FECHA", referencedColumnName = "FECHA")
    @ManyToOne(fetch = FetchType.LAZY)
    private HojasDeIntervenciones hojasDeIntervenciones;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partesOperatoriosSolicitud", fetch = FetchType.LAZY)
    private List<RegistrosOperatorios> registrosOperatoriosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partesOperatoriosSolicitud", fetch = FetchType.LAZY)
    private List<EquiposOperatorios> equiposOperatoriosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partesOperatoriosSolicitud", fetch = FetchType.LAZY)
    private List<Agentes> agentesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partesOperatoriosSolicitud", fetch = FetchType.LAZY)
    private List<ProcedimientosSolicitados> procedimientosSolicitadosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "partesOperatoriosSolicitud", fetch = FetchType.LAZY)
    private InformacionesAnestesicas informacionesAnestesicas;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "partesOperatoriosSolicitud", fetch = FetchType.LAZY)
    private PartesOperatorios partesOperatorios;

    public PartesOperatoriosSolicitud() {
    }

    public PartesOperatoriosSolicitud(PartesOperatoriosSolicitudPK partesOperatoriosSolicitudPK) {
        this.partesOperatoriosSolicitudPK = partesOperatoriosSolicitudPK;
    }

    public PartesOperatoriosSolicitud(int pcnNumeroHc, int numero) {
        this.partesOperatoriosSolicitudPK = new PartesOperatoriosSolicitudPK(pcnNumeroHc, numero);
    }

    public PartesOperatoriosSolicitudPK getPartesOperatoriosSolicitudPK() {
        return partesOperatoriosSolicitudPK;
    }

    public void setPartesOperatoriosSolicitudPK(PartesOperatoriosSolicitudPK partesOperatoriosSolicitudPK) {
        this.partesOperatoriosSolicitudPK = partesOperatoriosSolicitudPK;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Date getFechaPropuesta() {
        return fechaPropuesta;
    }

    public void setFechaPropuesta(Date fechaPropuesta) {
        this.fechaPropuesta = fechaPropuesta;
    }

    public Character getAnulada() {
        return anulada;
    }

    public void setAnulada(Character anulada) {
        this.anulada = anulada;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    public Date getHoraProgramada() {
        return horaProgramada;
    }

    public void setHoraProgramada(Date horaProgramada) {
        this.horaProgramada = horaProgramada;
    }

    public String getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(String quirofano) {
        this.quirofano = quirofano;
    }

    public Character getPensionado() {
        return pensionado;
    }

    public void setPensionado(Character pensionado) {
        this.pensionado = pensionado;
    }

    public String getAreaSolicitante() {
        return areaSolicitante;
    }

    public void setAreaSolicitante(String areaSolicitante) {
        this.areaSolicitante = areaSolicitante;
    }

    public String getTipoAnestesiaSolicitada() {
        return tipoAnestesiaSolicitada;
    }

    public void setTipoAnestesiaSolicitada(String tipoAnestesiaSolicitada) {
        this.tipoAnestesiaSolicitada = tipoAnestesiaSolicitada;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
    }

    public HojasDeEvolucion getHojasDeEvolucion() {
        return hojasDeEvolucion;
    }

    public void setHojasDeEvolucion(HojasDeEvolucion hojasDeEvolucion) {
        this.hojasDeEvolucion = hojasDeEvolucion;
    }

    public HojasDeIntervenciones getHojasDeIntervenciones() {
        return hojasDeIntervenciones;
    }

    public void setHojasDeIntervenciones(HojasDeIntervenciones hojasDeIntervenciones) {
        this.hojasDeIntervenciones = hojasDeIntervenciones;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<RegistrosOperatorios> getRegistrosOperatoriosList() {
        return registrosOperatoriosList;
    }

    public void setRegistrosOperatoriosList(List<RegistrosOperatorios> registrosOperatoriosList) {
        this.registrosOperatoriosList = registrosOperatoriosList;
    }

    public List<EquiposOperatorios> getEquiposOperatoriosList() {
        return equiposOperatoriosList;
    }

    public void setEquiposOperatoriosList(List<EquiposOperatorios> equiposOperatoriosList) {
        this.equiposOperatoriosList = equiposOperatoriosList;
    }

    public List<Agentes> getAgentesList() {
        return agentesList;
    }

    public void setAgentesList(List<Agentes> agentesList) {
        this.agentesList = agentesList;
    }

    public List<ProcedimientosSolicitados> getProcedimientosSolicitadosList() {
        return procedimientosSolicitadosList;
    }

    public void setProcedimientosSolicitadosList(List<ProcedimientosSolicitados> procedimientosSolicitadosList) {
        this.procedimientosSolicitadosList = procedimientosSolicitadosList;
    }

    public InformacionesAnestesicas getInformacionesAnestesicas() {
        return informacionesAnestesicas;
    }

    public void setInformacionesAnestesicas(InformacionesAnestesicas informacionesAnestesicas) {
        this.informacionesAnestesicas = informacionesAnestesicas;
    }

    public PartesOperatorios getPartesOperatorios() {
        return partesOperatorios;
    }

    public void setPartesOperatorios(PartesOperatorios partesOperatorios) {
        this.partesOperatorios = partesOperatorios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partesOperatoriosSolicitudPK != null ? partesOperatoriosSolicitudPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartesOperatoriosSolicitud)) {
            return false;
        }
        PartesOperatoriosSolicitud other = (PartesOperatoriosSolicitud) object;
        if ((this.partesOperatoriosSolicitudPK == null && other.partesOperatoriosSolicitudPK != null) || (this.partesOperatoriosSolicitudPK != null && !this.partesOperatoriosSolicitudPK.equals(other.partesOperatoriosSolicitudPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PartesOperatoriosSolicitud[ partesOperatoriosSolicitudPK=" + partesOperatoriosSolicitudPK + " ]";
    }
    
}
