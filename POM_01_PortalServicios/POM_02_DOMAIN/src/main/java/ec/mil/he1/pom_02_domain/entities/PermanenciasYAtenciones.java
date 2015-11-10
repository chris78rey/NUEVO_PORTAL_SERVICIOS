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
@Table(name = "PERMANENCIAS_Y_ATENCIONES")
@NamedQueries({
    @NamedQuery(name = "PermanenciasYAtenciones.findAll", query = "SELECT p FROM PermanenciasYAtenciones p")})
public class PermanenciasYAtenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PermanenciasYAtencionesPK permanenciasYAtencionesPK;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "PESO")
    private Short peso;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "TOTAL_DIAS")
    private Integer totalDias;
    @Column(name = "SEGURO")
    private Character seguro;
    @Column(name = "SLCINT_NUMERO")
    private Integer slcintNumero;
    @Column(name = "HISTORIA")
    private String historia;
    @Column(name = "ESPECIALIDAD")
    private String especialidad;
    @Column(name = "FECHA_TRANSFERENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTransferencia;
    @Column(name = "TIPO_TRANSFERENCIA")
    private String tipoTransferencia;
    @Column(name = "PCN_FUERZA")
    private String pcnFuerza;
    @Column(name = "PCN_GRADO")
    private String pcnGrado;
    @Column(name = "PCN_SITUACION")
    private String pcnSituacion;
    @Column(name = "PREALTA")
    private Character prealta;
    @Column(name = "PAQUETE")
    private Character paquete;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<Diuresis> diuresisList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<TurnosCamas> turnosCamasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<HojasEvolucionesEnfermeria> hojasEvolucionesEnfermeriaList;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<DescargosDeBotica> descargosDeBoticaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<ConsentimientosInformados> consentimientosInformadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<IngestasYEliminaciones> ingestasYEliminacionesList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private InformacionDeCuidado informacionDeCuidado;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<TurnosProcedimientos> turnosProcedimientosList;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<PrescripcionesMedicas> prescripcionesMedicasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<Cotratantes> cotratantesList;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<PlanillasHonorariosMdc> planillasHonorariosMdcList;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<ProcedimientosMenores> procedimientosMenoresList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private Epicrisis epicrisis;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<DetallesComplicaciones> detallesComplicacionesList;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<ContraReferencias> contraReferenciasList;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<Emergencias> emergenciasList;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<AutorizacionesPacientes> autorizacionesPacientesList;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<PartesOperatorios> partesOperatoriosList;
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PCNTMP_PCNTMP_ID", referencedColumnName = "PCNTMP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PacientesTemporales pacientesTemporales;
    @JoinColumn(name = "PRS_CODIGO_ADMITIDA_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @JoinColumn(name = "PRS_CODIGO_REALIZADO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal2;
    @JoinColumn(name = "TPOPRM_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiposPromociones tiposPromociones;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<ProcedimientosRealizados> procedimientosRealizadosList;
    @OneToMany(mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<RegistrosObstetricia> registrosObstetriciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permanenciasYAtenciones", fetch = FetchType.LAZY)
    private List<RegistroDeEnfermeria> registroDeEnfermeriaList;

    public PermanenciasYAtenciones() {
    }

    public PermanenciasYAtenciones(PermanenciasYAtencionesPK permanenciasYAtencionesPK) {
        this.permanenciasYAtencionesPK = permanenciasYAtencionesPK;
    }

    public PermanenciasYAtenciones(int pcnNumeroHc, int numero) {
        this.permanenciasYAtencionesPK = new PermanenciasYAtencionesPK(pcnNumeroHc, numero);
    }

    public PermanenciasYAtencionesPK getPermanenciasYAtencionesPK() {
        return permanenciasYAtencionesPK;
    }

    public void setPermanenciasYAtencionesPK(PermanenciasYAtencionesPK permanenciasYAtencionesPK) {
        this.permanenciasYAtencionesPK = permanenciasYAtencionesPK;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Short getPeso() {
        return peso;
    }

    public void setPeso(Short peso) {
        this.peso = peso;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(Integer totalDias) {
        this.totalDias = totalDias;
    }

    public Character getSeguro() {
        return seguro;
    }

    public void setSeguro(Character seguro) {
        this.seguro = seguro;
    }

    public Integer getSlcintNumero() {
        return slcintNumero;
    }

    public void setSlcintNumero(Integer slcintNumero) {
        this.slcintNumero = slcintNumero;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(Date fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getPcnFuerza() {
        return pcnFuerza;
    }

    public void setPcnFuerza(String pcnFuerza) {
        this.pcnFuerza = pcnFuerza;
    }

    public String getPcnGrado() {
        return pcnGrado;
    }

    public void setPcnGrado(String pcnGrado) {
        this.pcnGrado = pcnGrado;
    }

    public String getPcnSituacion() {
        return pcnSituacion;
    }

    public void setPcnSituacion(String pcnSituacion) {
        this.pcnSituacion = pcnSituacion;
    }

    public Character getPrealta() {
        return prealta;
    }

    public void setPrealta(Character prealta) {
        this.prealta = prealta;
    }

    public Character getPaquete() {
        return paquete;
    }

    public void setPaquete(Character paquete) {
        this.paquete = paquete;
    }

    public List<Diuresis> getDiuresisList() {
        return diuresisList;
    }

    public void setDiuresisList(List<Diuresis> diuresisList) {
        this.diuresisList = diuresisList;
    }

    public List<TurnosCamas> getTurnosCamasList() {
        return turnosCamasList;
    }

    public void setTurnosCamasList(List<TurnosCamas> turnosCamasList) {
        this.turnosCamasList = turnosCamasList;
    }

    public List<HojasEvolucionesEnfermeria> getHojasEvolucionesEnfermeriaList() {
        return hojasEvolucionesEnfermeriaList;
    }

    public void setHojasEvolucionesEnfermeriaList(List<HojasEvolucionesEnfermeria> hojasEvolucionesEnfermeriaList) {
        this.hojasEvolucionesEnfermeriaList = hojasEvolucionesEnfermeriaList;
    }

    public List<DescargosDeBotica> getDescargosDeBoticaList() {
        return descargosDeBoticaList;
    }

    public void setDescargosDeBoticaList(List<DescargosDeBotica> descargosDeBoticaList) {
        this.descargosDeBoticaList = descargosDeBoticaList;
    }

    public List<ConsentimientosInformados> getConsentimientosInformadosList() {
        return consentimientosInformadosList;
    }

    public void setConsentimientosInformadosList(List<ConsentimientosInformados> consentimientosInformadosList) {
        this.consentimientosInformadosList = consentimientosInformadosList;
    }

    public List<IngestasYEliminaciones> getIngestasYEliminacionesList() {
        return ingestasYEliminacionesList;
    }

    public void setIngestasYEliminacionesList(List<IngestasYEliminaciones> ingestasYEliminacionesList) {
        this.ingestasYEliminacionesList = ingestasYEliminacionesList;
    }

    public InformacionDeCuidado getInformacionDeCuidado() {
        return informacionDeCuidado;
    }

    public void setInformacionDeCuidado(InformacionDeCuidado informacionDeCuidado) {
        this.informacionDeCuidado = informacionDeCuidado;
    }

    public List<TurnosProcedimientos> getTurnosProcedimientosList() {
        return turnosProcedimientosList;
    }

    public void setTurnosProcedimientosList(List<TurnosProcedimientos> turnosProcedimientosList) {
        this.turnosProcedimientosList = turnosProcedimientosList;
    }

    public List<PrescripcionesMedicas> getPrescripcionesMedicasList() {
        return prescripcionesMedicasList;
    }

    public void setPrescripcionesMedicasList(List<PrescripcionesMedicas> prescripcionesMedicasList) {
        this.prescripcionesMedicasList = prescripcionesMedicasList;
    }

    public List<Cotratantes> getCotratantesList() {
        return cotratantesList;
    }

    public void setCotratantesList(List<Cotratantes> cotratantesList) {
        this.cotratantesList = cotratantesList;
    }

    public List<PlanillasHonorariosMdc> getPlanillasHonorariosMdcList() {
        return planillasHonorariosMdcList;
    }

    public void setPlanillasHonorariosMdcList(List<PlanillasHonorariosMdc> planillasHonorariosMdcList) {
        this.planillasHonorariosMdcList = planillasHonorariosMdcList;
    }

    public List<ProcedimientosMenores> getProcedimientosMenoresList() {
        return procedimientosMenoresList;
    }

    public void setProcedimientosMenoresList(List<ProcedimientosMenores> procedimientosMenoresList) {
        this.procedimientosMenoresList = procedimientosMenoresList;
    }

    public Epicrisis getEpicrisis() {
        return epicrisis;
    }

    public void setEpicrisis(Epicrisis epicrisis) {
        this.epicrisis = epicrisis;
    }

    public List<DetallesComplicaciones> getDetallesComplicacionesList() {
        return detallesComplicacionesList;
    }

    public void setDetallesComplicacionesList(List<DetallesComplicaciones> detallesComplicacionesList) {
        this.detallesComplicacionesList = detallesComplicacionesList;
    }

    public List<ContraReferencias> getContraReferenciasList() {
        return contraReferenciasList;
    }

    public void setContraReferenciasList(List<ContraReferencias> contraReferenciasList) {
        this.contraReferenciasList = contraReferenciasList;
    }

    public List<Emergencias> getEmergenciasList() {
        return emergenciasList;
    }

    public void setEmergenciasList(List<Emergencias> emergenciasList) {
        this.emergenciasList = emergenciasList;
    }

    public List<AutorizacionesPacientes> getAutorizacionesPacientesList() {
        return autorizacionesPacientesList;
    }

    public void setAutorizacionesPacientesList(List<AutorizacionesPacientes> autorizacionesPacientesList) {
        this.autorizacionesPacientesList = autorizacionesPacientesList;
    }

    public List<PartesOperatorios> getPartesOperatoriosList() {
        return partesOperatoriosList;
    }

    public void setPartesOperatoriosList(List<PartesOperatorios> partesOperatoriosList) {
        this.partesOperatoriosList = partesOperatoriosList;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public PacientesTemporales getPacientesTemporales() {
        return pacientesTemporales;
    }

    public void setPacientesTemporales(PacientesTemporales pacientesTemporales) {
        this.pacientesTemporales = pacientesTemporales;
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

    public Personal getPersonal2() {
        return personal2;
    }

    public void setPersonal2(Personal personal2) {
        this.personal2 = personal2;
    }

    public TiposPromociones getTiposPromociones() {
        return tiposPromociones;
    }

    public void setTiposPromociones(TiposPromociones tiposPromociones) {
        this.tiposPromociones = tiposPromociones;
    }

    public List<ProcedimientosRealizados> getProcedimientosRealizadosList() {
        return procedimientosRealizadosList;
    }

    public void setProcedimientosRealizadosList(List<ProcedimientosRealizados> procedimientosRealizadosList) {
        this.procedimientosRealizadosList = procedimientosRealizadosList;
    }

    public List<RegistrosObstetricia> getRegistrosObstetriciaList() {
        return registrosObstetriciaList;
    }

    public void setRegistrosObstetriciaList(List<RegistrosObstetricia> registrosObstetriciaList) {
        this.registrosObstetriciaList = registrosObstetriciaList;
    }

    public List<RegistroDeEnfermeria> getRegistroDeEnfermeriaList() {
        return registroDeEnfermeriaList;
    }

    public void setRegistroDeEnfermeriaList(List<RegistroDeEnfermeria> registroDeEnfermeriaList) {
        this.registroDeEnfermeriaList = registroDeEnfermeriaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permanenciasYAtencionesPK != null ? permanenciasYAtencionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermanenciasYAtenciones)) {
            return false;
        }
        PermanenciasYAtenciones other = (PermanenciasYAtenciones) object;
        if ((this.permanenciasYAtencionesPK == null && other.permanenciasYAtencionesPK != null) || (this.permanenciasYAtencionesPK != null && !this.permanenciasYAtencionesPK.equals(other.permanenciasYAtencionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PermanenciasYAtenciones[ permanenciasYAtencionesPK=" + permanenciasYAtencionesPK + " ]";
    }
    
}
