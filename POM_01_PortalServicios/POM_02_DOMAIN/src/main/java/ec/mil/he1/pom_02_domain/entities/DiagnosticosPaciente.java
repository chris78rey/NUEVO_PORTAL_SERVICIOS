/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DIAGNOSTICOS_PACIENTE")
@NamedQueries({
    @NamedQuery(name = "DiagnosticosPaciente.findAll", query = "SELECT d FROM DiagnosticosPaciente d")})
public class DiagnosticosPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DGNPCN_ID")
    private Long dgnpcnId;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "DX_GENERICO")
    private String dxGenerico;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "ESTADO_VALIDEZ")
    private Character estadoValidez;
    @Column(name = "OBSERVACION")
    private String observacion;
//    @JoinTable(name = "CONTRA_REFERENCIAS_DIAG", joinColumns = {
//        @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")}, inverseJoinColumns = {
//        @JoinColumn(name = "CNTRFR_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToMany(fetch = FetchType.LAZY)
//    private List<ContraReferencias> contraReferenciasList;
//    @JoinTable(name = "EMG_DIAGNOSTICOS_ALTA", joinColumns = {
//        @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")}, inverseJoinColumns = {
//        @JoinColumn(name = "EMG_ID", referencedColumnName = "ID")})
//    @ManyToMany(fetch = FetchType.LAZY)
//    private List<Emergencias> emergenciasList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<Consultas> consultasList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<PartesOperatoriosSolicitud> partesOperatoriosSolicitudList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<JustificacionHemoderivados> justificacionHemoderivadosList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<TurnosProcedimientos> turnosProcedimientosList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<SolicitudesDeInternacion> solicitudesDeInternacionList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<Tnms> tnmsList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<Examenes> examenesList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<ProcedimientosMenores> procedimientosMenoresList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<Epicrisis> epicrisisList;
//    @JoinColumn(name = "ENF_CODIGO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Enfermedades enfermedades;
//    @JoinColumn(name = "MRF_CODIGO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Morfologicos morfologicos;
//    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Pacientes pacientes;
//    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Personal personal;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<DiagnosticosSecundarios> diagnosticosSecundariosList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<PromocionesConvenios> promocionesConveniosList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<Emergencias> emergenciasList1;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<EstadosPacientes> estadosPacientesList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<Interconsultas> interconsultasList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<PartesOperatorios> partesOperatoriosList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<PermanenciasYAtenciones> permanenciasYAtencionesList;
//    @OneToMany(mappedBy = "diagnosticosPaciente", fetch = FetchType.LAZY)
//    private List<Quimioterapias> quimioterapiasList;

    public DiagnosticosPaciente() {
    }

    public DiagnosticosPaciente(Long dgnpcnId) {
        this.dgnpcnId = dgnpcnId;
    }

    public Long getDgnpcnId() {
        return dgnpcnId;
    }

    public void setDgnpcnId(Long dgnpcnId) {
        this.dgnpcnId = dgnpcnId;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDxGenerico() {
        return dxGenerico;
    }

    public void setDxGenerico(String dxGenerico) {
        this.dxGenerico = dxGenerico;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Character getEstadoValidez() {
        return estadoValidez;
    }

    public void setEstadoValidez(Character estadoValidez) {
        this.estadoValidez = estadoValidez;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

//    public List<ContraReferencias> getContraReferenciasList() {
//        return contraReferenciasList;
//    }
//
//    public void setContraReferenciasList(List<ContraReferencias> contraReferenciasList) {
//        this.contraReferenciasList = contraReferenciasList;
//    }
//
//    public List<Emergencias> getEmergenciasList() {
//        return emergenciasList;
//    }
//
//    public void setEmergenciasList(List<Emergencias> emergenciasList) {
//        this.emergenciasList = emergenciasList;
//    }
//
//    public List<Consultas> getConsultasList() {
//        return consultasList;
//    }
//
//    public void setConsultasList(List<Consultas> consultasList) {
//        this.consultasList = consultasList;
//    }
//
//    public List<PartesOperatoriosSolicitud> getPartesOperatoriosSolicitudList() {
//        return partesOperatoriosSolicitudList;
//    }
//
//    public void setPartesOperatoriosSolicitudList(List<PartesOperatoriosSolicitud> partesOperatoriosSolicitudList) {
//        this.partesOperatoriosSolicitudList = partesOperatoriosSolicitudList;
//    }
//
//    public List<JustificacionHemoderivados> getJustificacionHemoderivadosList() {
//        return justificacionHemoderivadosList;
//    }
//
//    public void setJustificacionHemoderivadosList(List<JustificacionHemoderivados> justificacionHemoderivadosList) {
//        this.justificacionHemoderivadosList = justificacionHemoderivadosList;
//    }
//
//    public List<TurnosProcedimientos> getTurnosProcedimientosList() {
//        return turnosProcedimientosList;
//    }
//
//    public void setTurnosProcedimientosList(List<TurnosProcedimientos> turnosProcedimientosList) {
//        this.turnosProcedimientosList = turnosProcedimientosList;
//    }
//
//    public List<SolicitudesDeInternacion> getSolicitudesDeInternacionList() {
//        return solicitudesDeInternacionList;
//    }
//
//    public void setSolicitudesDeInternacionList(List<SolicitudesDeInternacion> solicitudesDeInternacionList) {
//        this.solicitudesDeInternacionList = solicitudesDeInternacionList;
//    }
//
//    public List<Tnms> getTnmsList() {
//        return tnmsList;
//    }
//
//    public void setTnmsList(List<Tnms> tnmsList) {
//        this.tnmsList = tnmsList;
//    }
//
//    public List<Examenes> getExamenesList() {
//        return examenesList;
//    }
//
//    public void setExamenesList(List<Examenes> examenesList) {
//        this.examenesList = examenesList;
//    }
//
//    public List<ProcedimientosMenores> getProcedimientosMenoresList() {
//        return procedimientosMenoresList;
//    }
//
//    public void setProcedimientosMenoresList(List<ProcedimientosMenores> procedimientosMenoresList) {
//        this.procedimientosMenoresList = procedimientosMenoresList;
//    }
//
//    public List<Epicrisis> getEpicrisisList() {
//        return epicrisisList;
//    }
//
//    public void setEpicrisisList(List<Epicrisis> epicrisisList) {
//        this.epicrisisList = epicrisisList;
//    }
//
//    public Enfermedades getEnfermedades() {
//        return enfermedades;
//    }
//
//    public void setEnfermedades(Enfermedades enfermedades) {
//        this.enfermedades = enfermedades;
//    }
//
//    public Morfologicos getMorfologicos() {
//        return morfologicos;
//    }
//
//    public void setMorfologicos(Morfologicos morfologicos) {
//        this.morfologicos = morfologicos;
//    }
//
//    public Pacientes getPacientes() {
//        return pacientes;
//    }
//
//    public void setPacientes(Pacientes pacientes) {
//        this.pacientes = pacientes;
//    }
//
//    public Personal getPersonal() {
//        return personal;
//    }
//
//    public void setPersonal(Personal personal) {
//        this.personal = personal;
//    }
//
//    public List<DiagnosticosSecundarios> getDiagnosticosSecundariosList() {
//        return diagnosticosSecundariosList;
//    }
//
//    public void setDiagnosticosSecundariosList(List<DiagnosticosSecundarios> diagnosticosSecundariosList) {
//        this.diagnosticosSecundariosList = diagnosticosSecundariosList;
//    }
//
//    public List<PromocionesConvenios> getPromocionesConveniosList() {
//        return promocionesConveniosList;
//    }
//
//    public void setPromocionesConveniosList(List<PromocionesConvenios> promocionesConveniosList) {
//        this.promocionesConveniosList = promocionesConveniosList;
//    }
//
//    public List<Emergencias> getEmergenciasList1() {
//        return emergenciasList1;
//    }
//
//    public void setEmergenciasList1(List<Emergencias> emergenciasList1) {
//        this.emergenciasList1 = emergenciasList1;
//    }
//
//    public List<EstadosPacientes> getEstadosPacientesList() {
//        return estadosPacientesList;
//    }
//
//    public void setEstadosPacientesList(List<EstadosPacientes> estadosPacientesList) {
//        this.estadosPacientesList = estadosPacientesList;
//    }
//
//    public List<Interconsultas> getInterconsultasList() {
//        return interconsultasList;
//    }
//
//    public void setInterconsultasList(List<Interconsultas> interconsultasList) {
//        this.interconsultasList = interconsultasList;
//    }
//
//    public List<PartesOperatorios> getPartesOperatoriosList() {
//        return partesOperatoriosList;
//    }
//
//    public void setPartesOperatoriosList(List<PartesOperatorios> partesOperatoriosList) {
//        this.partesOperatoriosList = partesOperatoriosList;
//    }
//
//    public List<PermanenciasYAtenciones> getPermanenciasYAtencionesList() {
//        return permanenciasYAtencionesList;
//    }
//
//    public void setPermanenciasYAtencionesList(List<PermanenciasYAtenciones> permanenciasYAtencionesList) {
//        this.permanenciasYAtencionesList = permanenciasYAtencionesList;
//    }
//
//    public List<Quimioterapias> getQuimioterapiasList() {
//        return quimioterapiasList;
//    }
//
//    public void setQuimioterapiasList(List<Quimioterapias> quimioterapiasList) {
//        this.quimioterapiasList = quimioterapiasList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dgnpcnId != null ? dgnpcnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosPaciente)) {
            return false;
        }
        DiagnosticosPaciente other = (DiagnosticosPaciente) object;
        if ((this.dgnpcnId == null && other.dgnpcnId != null) || (this.dgnpcnId != null && !this.dgnpcnId.equals(other.dgnpcnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DiagnosticosPaciente[ dgnpcnId=" + dgnpcnId + " ]";
    }
    
}
