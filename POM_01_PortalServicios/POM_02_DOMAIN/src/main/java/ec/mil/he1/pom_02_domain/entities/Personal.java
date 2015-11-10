/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PERSONAL")
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")})
public class Personal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "CARGO")
    private String cargo;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "NUMERO_CMA")
    private String numeroCma;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "PERMITIR_TURNO")
    private String permitirTurno;
    @Column(name = "PERSONAL_CIRUGIA")
    private Character personalCirugia;
    @Column(name = "BENEFICIARIO")
    private Character beneficiario;
    @Column(name = "CODIGO_CM")
    private String codigoCm;
    @Column(name = "LIBRO_MSP")
    private String libroMsp;
    @Column(name = "FOLIO_MSP")
    private String folioMsp;
    @Column(name = "NUMERO_MSP")
    private String numeroMsp;
    @ManyToMany(mappedBy = "personalList", fetch = FetchType.LAZY)
    private List<Especialidades> especialidadesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Consultas> consultasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PartesOperatoriosSolicitud> partesOperatoriosSolicitudList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Diuresis> diuresisList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Regulaciones> regulacionesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<HojasEvolucionesEnfermeria> hojasEvolucionesEnfermeriaList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Transferencias> transferenciasList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<Transferencias> transferenciasList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<HorariosSemanalesMedicos> horariosSemanalesMedicosList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<HorariosSemanalesMedicos> horariosSemanalesMedicosList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<DescargosDeBotica> descargosDeBoticaList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<DescargosDeBotica> descargosDeBoticaList1;
    @OneToMany(mappedBy = "personal2", fetch = FetchType.LAZY)
    private List<DescargosDeBotica> descargosDeBoticaList2;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<JustificacionHemoderivados> justificacionHemoderivadosList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<JustificacionHemoderivados> justificacionHemoderivadosList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Biopsias> biopsiasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<ConsentimientosInformados> consentimientosInformadosList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<ConsentimientosInformados> consentimientosInformadosList1;
    @OneToMany(mappedBy = "personal2", fetch = FetchType.LAZY)
    private List<ConsentimientosInformados> consentimientosInformadosList2;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PostAnestesicos> postAnestesicosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal", fetch = FetchType.LAZY)
    private List<RegistrosOperatorios> registrosOperatoriosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Copagos> copagosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<CumplimientosQuimioterapia> cumplimientosQuimioterapiaList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<CuotasACobrar> cuotasACobrarList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<EntidadesBeneficiarias> entidadesBeneficiariasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<IngestasYEliminaciones> ingestasYEliminacionesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<RegistroArchivosIess> registroArchivosIessList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<IngresosDeBotica> ingresosDeBoticaList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<IngresosDeBotica> ingresosDeBoticaList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PromocionesPacientes> promocionesPacientesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<FichasCobaltoterapia> fichasCobaltoterapiaList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<FichasCobaltoterapia> fichasCobaltoterapiaList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Citologias> citologiasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<EgresosSubbodegas> egresosSubbodegasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<RegulacionesActivosFijos> regulacionesActivosFijosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal", fetch = FetchType.LAZY)
    private List<EquiposOperatorios> equiposOperatoriosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Donaciones> donacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal", fetch = FetchType.LAZY)
    private List<ExcepcionesTurnosCe> excepcionesTurnosCeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal", fetch = FetchType.LAZY)
    private List<HorariosMedico> horariosMedicoList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<SeguimientosSociales> seguimientosSocialesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<TurnosProcedimientos> turnosProcedimientosList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<TurnosProcedimientos> turnosProcedimientosList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PrescripcionesMedicas> prescripcionesMedicasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<SolicitudesDeInternacion> solicitudesDeInternacionList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Pacientes> pacientesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<SolicitudesTransfusiones> solicitudesTransfusionesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<CuotasACobrarAmortizadas> cuotasACobrarAmortizadasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<SegUsuario> segUsuarioList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<CamasHospitalizacion> camasHospitalizacionList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<RolesDePagos> rolesDePagosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PreAnestesicos> preAnestesicosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PagosEspeciales> pagosEspecialesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Promociones> promocionesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<SolicitudesDeInsumos> solicitudesDeInsumosList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<SolicitudesDeInsumos> solicitudesDeInsumosList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PostAnesMedicamentos> postAnesMedicamentosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Cotratantes> cotratantesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Examenes> examenesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PlanillasHonorariosMdc> planillasHonorariosMdcList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<DescuentosGenerados> descuentosGeneradosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<ProcedimientosMenores> procedimientosMenoresList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<ProcedimientosMenores> procedimientosMenoresList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<TurnosCe> turnosCeList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<TurnosCe> turnosCeList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<FacturasAutomaticas> facturasAutomaticasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<MomentosCumplimiento> momentosCumplimientoList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Epicrisis> epicrisisList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<Epicrisis> epicrisisList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Proformas> proformasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Notas> notasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PerfilesPrescripciones> perfilesPrescripcionesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PrescripcionesMedicasQuimiot> prescripcionesMedicasQuimiotList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<PrescripcionesMedicasQuimiot> prescripcionesMedicasQuimiotList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<OrdenesDeCompra> ordenesDeCompraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal", fetch = FetchType.LAZY)
    private List<AtencionSecretarias> atencionSecretariasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<AtencionSecretarias> atencionSecretariasList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<DetallesPrescripcion> detallesPrescripcionList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<AsignacionesReingresosActivo> asignacionesReingresosActivoList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<AsignacionesReingresosActivo> asignacionesReingresosActivoList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<IngresosActivosFijos> ingresosActivosFijosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<DiagnosticosPaciente> diagnosticosPacienteList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<RegistroPlanillasAutomaticas> registroPlanillasAutomaticasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<AjustesInventario> ajustesInventarioList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<HojasDeEvolucion> hojasDeEvolucionList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<HojasDeEvolucion> hojasDeEvolucionList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Depreciaciones> depreciacionesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<SolicitudesDeCompra> solicitudesDeCompraList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<CabeceraInsumos> cabeceraInsumosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Facturas> facturasList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<Facturas> facturasList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<ContraReferencias> contraReferenciasList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<ContraReferencias> contraReferenciasList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<DefinicionesTurnos> definicionesTurnosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<SegUsuarioPerfil> segUsuarioPerfilList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PromocionesConvenios> promocionesConveniosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<MovimientosDeCuenta> movimientosDeCuentaList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<EgresosDeBodega> egresosDeBodegaList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<EgresosDeBodega> egresosDeBodegaList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Dependientes> dependientesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal", fetch = FetchType.LAZY)
    private List<DepartamentosTrabajan> departamentosTrabajanList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<RecuperacionPostAnestesica> recuperacionPostAnestesicaList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<RecuperacionPostAnestesica> recuperacionPostAnestesicaList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<EgresosActivosFijos> egresosActivosFijosList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<EgresosActivosFijos> egresosActivosFijosList1;
    @OneToMany(mappedBy = "personal2", fetch = FetchType.LAZY)
    private List<EgresosActivosFijos> egresosActivosFijosList2;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<ControlesDePersonal> controlesDePersonalList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<InformacionesAnestesicas> informacionesAnestesicasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<ResponsablesDepartamentos> responsablesDepartamentosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<RegistroArchivosIssf> registroArchivosIssfList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<AutorizacionesPacientes> autorizacionesPacientesList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<AutorizacionesPacientes> autorizacionesPacientesList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Certificados> certificadosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<ControlesPrenatales> controlesPrenatalesList;
    @JoinColumn(name = "ESPPRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private EspecialidadPersonal especialidadPersonal;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Interconsultas> interconsultasList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<Interconsultas> interconsultasList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PartesOperatorios> partesOperatoriosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Liquidaciones> liquidacionesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PermanenciasYAtenciones> permanenciasYAtencionesList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<PermanenciasYAtenciones> permanenciasYAtencionesList1;
    @OneToMany(mappedBy = "personal2", fetch = FetchType.LAZY)
    private List<PermanenciasYAtenciones> permanenciasYAtencionesList2;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Quimioterapias> quimioterapiasList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<EgresosDeBotica> egresosDeBoticaList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<EgresosDeBotica> egresosDeBoticaList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Devoluciones> devolucionesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<CuentasPorCobrar> cuentasPorCobrarList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<RegistroArchivosIessWs> registroArchivosIessWsList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<FichasSociales> fichasSocialesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Asociados> asociadosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<IngresosDeBodega> ingresosDeBodegaList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<IngresosDeBodega> ingresosDeBodegaList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<RegistroDeEnfermeria> registroDeEnfermeriaList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Papanicolaous> papanicolaousList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<Beneficiarios> beneficiariosList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<CopagosPacientes> copagosPacientesList;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<PedidosDeDieta> pedidosDeDietaList;
    @OneToMany(mappedBy = "personal1", fetch = FetchType.LAZY)
    private List<PedidosDeDieta> pedidosDeDietaList1;
    @OneToMany(mappedBy = "personal", fetch = FetchType.LAZY)
    private List<SolicitudesDeExamenes> solicitudesDeExamenesList;

    public Personal() {
    }

    public Personal(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroCma() {
        return numeroCma;
    }

    public void setNumeroCma(String numeroCma) {
        this.numeroCma = numeroCma;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPermitirTurno() {
        return permitirTurno;
    }

    public void setPermitirTurno(String permitirTurno) {
        this.permitirTurno = permitirTurno;
    }

    public Character getPersonalCirugia() {
        return personalCirugia;
    }

    public void setPersonalCirugia(Character personalCirugia) {
        this.personalCirugia = personalCirugia;
    }

    public Character getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Character beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getCodigoCm() {
        return codigoCm;
    }

    public void setCodigoCm(String codigoCm) {
        this.codigoCm = codigoCm;
    }

    public String getLibroMsp() {
        return libroMsp;
    }

    public void setLibroMsp(String libroMsp) {
        this.libroMsp = libroMsp;
    }

    public String getFolioMsp() {
        return folioMsp;
    }

    public void setFolioMsp(String folioMsp) {
        this.folioMsp = folioMsp;
    }

    public String getNumeroMsp() {
        return numeroMsp;
    }

    public void setNumeroMsp(String numeroMsp) {
        this.numeroMsp = numeroMsp;
    }

    public List<Especialidades> getEspecialidadesList() {
        return especialidadesList;
    }

    public void setEspecialidadesList(List<Especialidades> especialidadesList) {
        this.especialidadesList = especialidadesList;
    }

    public List<Consultas> getConsultasList() {
        return consultasList;
    }

    public void setConsultasList(List<Consultas> consultasList) {
        this.consultasList = consultasList;
    }

    public List<PartesOperatoriosSolicitud> getPartesOperatoriosSolicitudList() {
        return partesOperatoriosSolicitudList;
    }

    public void setPartesOperatoriosSolicitudList(List<PartesOperatoriosSolicitud> partesOperatoriosSolicitudList) {
        this.partesOperatoriosSolicitudList = partesOperatoriosSolicitudList;
    }

    public List<Diuresis> getDiuresisList() {
        return diuresisList;
    }

    public void setDiuresisList(List<Diuresis> diuresisList) {
        this.diuresisList = diuresisList;
    }

    public List<Regulaciones> getRegulacionesList() {
        return regulacionesList;
    }

    public void setRegulacionesList(List<Regulaciones> regulacionesList) {
        this.regulacionesList = regulacionesList;
    }

    public List<HojasEvolucionesEnfermeria> getHojasEvolucionesEnfermeriaList() {
        return hojasEvolucionesEnfermeriaList;
    }

    public void setHojasEvolucionesEnfermeriaList(List<HojasEvolucionesEnfermeria> hojasEvolucionesEnfermeriaList) {
        this.hojasEvolucionesEnfermeriaList = hojasEvolucionesEnfermeriaList;
    }

    public List<Transferencias> getTransferenciasList() {
        return transferenciasList;
    }

    public void setTransferenciasList(List<Transferencias> transferenciasList) {
        this.transferenciasList = transferenciasList;
    }

    public List<Transferencias> getTransferenciasList1() {
        return transferenciasList1;
    }

    public void setTransferenciasList1(List<Transferencias> transferenciasList1) {
        this.transferenciasList1 = transferenciasList1;
    }

    public List<HorariosSemanalesMedicos> getHorariosSemanalesMedicosList() {
        return horariosSemanalesMedicosList;
    }

    public void setHorariosSemanalesMedicosList(List<HorariosSemanalesMedicos> horariosSemanalesMedicosList) {
        this.horariosSemanalesMedicosList = horariosSemanalesMedicosList;
    }

    public List<HorariosSemanalesMedicos> getHorariosSemanalesMedicosList1() {
        return horariosSemanalesMedicosList1;
    }

    public void setHorariosSemanalesMedicosList1(List<HorariosSemanalesMedicos> horariosSemanalesMedicosList1) {
        this.horariosSemanalesMedicosList1 = horariosSemanalesMedicosList1;
    }

    public List<DescargosDeBotica> getDescargosDeBoticaList() {
        return descargosDeBoticaList;
    }

    public void setDescargosDeBoticaList(List<DescargosDeBotica> descargosDeBoticaList) {
        this.descargosDeBoticaList = descargosDeBoticaList;
    }

    public List<DescargosDeBotica> getDescargosDeBoticaList1() {
        return descargosDeBoticaList1;
    }

    public void setDescargosDeBoticaList1(List<DescargosDeBotica> descargosDeBoticaList1) {
        this.descargosDeBoticaList1 = descargosDeBoticaList1;
    }

    public List<DescargosDeBotica> getDescargosDeBoticaList2() {
        return descargosDeBoticaList2;
    }

    public void setDescargosDeBoticaList2(List<DescargosDeBotica> descargosDeBoticaList2) {
        this.descargosDeBoticaList2 = descargosDeBoticaList2;
    }

    public List<JustificacionHemoderivados> getJustificacionHemoderivadosList() {
        return justificacionHemoderivadosList;
    }

    public void setJustificacionHemoderivadosList(List<JustificacionHemoderivados> justificacionHemoderivadosList) {
        this.justificacionHemoderivadosList = justificacionHemoderivadosList;
    }

    public List<JustificacionHemoderivados> getJustificacionHemoderivadosList1() {
        return justificacionHemoderivadosList1;
    }

    public void setJustificacionHemoderivadosList1(List<JustificacionHemoderivados> justificacionHemoderivadosList1) {
        this.justificacionHemoderivadosList1 = justificacionHemoderivadosList1;
    }

    public List<Biopsias> getBiopsiasList() {
        return biopsiasList;
    }

    public void setBiopsiasList(List<Biopsias> biopsiasList) {
        this.biopsiasList = biopsiasList;
    }

    public List<ConsentimientosInformados> getConsentimientosInformadosList() {
        return consentimientosInformadosList;
    }

    public void setConsentimientosInformadosList(List<ConsentimientosInformados> consentimientosInformadosList) {
        this.consentimientosInformadosList = consentimientosInformadosList;
    }

    public List<ConsentimientosInformados> getConsentimientosInformadosList1() {
        return consentimientosInformadosList1;
    }

    public void setConsentimientosInformadosList1(List<ConsentimientosInformados> consentimientosInformadosList1) {
        this.consentimientosInformadosList1 = consentimientosInformadosList1;
    }

    public List<ConsentimientosInformados> getConsentimientosInformadosList2() {
        return consentimientosInformadosList2;
    }

    public void setConsentimientosInformadosList2(List<ConsentimientosInformados> consentimientosInformadosList2) {
        this.consentimientosInformadosList2 = consentimientosInformadosList2;
    }

    public List<PostAnestesicos> getPostAnestesicosList() {
        return postAnestesicosList;
    }

    public void setPostAnestesicosList(List<PostAnestesicos> postAnestesicosList) {
        this.postAnestesicosList = postAnestesicosList;
    }

    public List<RegistrosOperatorios> getRegistrosOperatoriosList() {
        return registrosOperatoriosList;
    }

    public void setRegistrosOperatoriosList(List<RegistrosOperatorios> registrosOperatoriosList) {
        this.registrosOperatoriosList = registrosOperatoriosList;
    }

    public List<Copagos> getCopagosList() {
        return copagosList;
    }

    public void setCopagosList(List<Copagos> copagosList) {
        this.copagosList = copagosList;
    }

    public List<CumplimientosQuimioterapia> getCumplimientosQuimioterapiaList() {
        return cumplimientosQuimioterapiaList;
    }

    public void setCumplimientosQuimioterapiaList(List<CumplimientosQuimioterapia> cumplimientosQuimioterapiaList) {
        this.cumplimientosQuimioterapiaList = cumplimientosQuimioterapiaList;
    }

    public List<CuotasACobrar> getCuotasACobrarList() {
        return cuotasACobrarList;
    }

    public void setCuotasACobrarList(List<CuotasACobrar> cuotasACobrarList) {
        this.cuotasACobrarList = cuotasACobrarList;
    }

    public List<EntidadesBeneficiarias> getEntidadesBeneficiariasList() {
        return entidadesBeneficiariasList;
    }

    public void setEntidadesBeneficiariasList(List<EntidadesBeneficiarias> entidadesBeneficiariasList) {
        this.entidadesBeneficiariasList = entidadesBeneficiariasList;
    }

    public List<IngestasYEliminaciones> getIngestasYEliminacionesList() {
        return ingestasYEliminacionesList;
    }

    public void setIngestasYEliminacionesList(List<IngestasYEliminaciones> ingestasYEliminacionesList) {
        this.ingestasYEliminacionesList = ingestasYEliminacionesList;
    }

    public List<RegistroArchivosIess> getRegistroArchivosIessList() {
        return registroArchivosIessList;
    }

    public void setRegistroArchivosIessList(List<RegistroArchivosIess> registroArchivosIessList) {
        this.registroArchivosIessList = registroArchivosIessList;
    }

    public List<IngresosDeBotica> getIngresosDeBoticaList() {
        return ingresosDeBoticaList;
    }

    public void setIngresosDeBoticaList(List<IngresosDeBotica> ingresosDeBoticaList) {
        this.ingresosDeBoticaList = ingresosDeBoticaList;
    }

    public List<IngresosDeBotica> getIngresosDeBoticaList1() {
        return ingresosDeBoticaList1;
    }

    public void setIngresosDeBoticaList1(List<IngresosDeBotica> ingresosDeBoticaList1) {
        this.ingresosDeBoticaList1 = ingresosDeBoticaList1;
    }

    public List<PromocionesPacientes> getPromocionesPacientesList() {
        return promocionesPacientesList;
    }

    public void setPromocionesPacientesList(List<PromocionesPacientes> promocionesPacientesList) {
        this.promocionesPacientesList = promocionesPacientesList;
    }

    public List<FichasCobaltoterapia> getFichasCobaltoterapiaList() {
        return fichasCobaltoterapiaList;
    }

    public void setFichasCobaltoterapiaList(List<FichasCobaltoterapia> fichasCobaltoterapiaList) {
        this.fichasCobaltoterapiaList = fichasCobaltoterapiaList;
    }

    public List<FichasCobaltoterapia> getFichasCobaltoterapiaList1() {
        return fichasCobaltoterapiaList1;
    }

    public void setFichasCobaltoterapiaList1(List<FichasCobaltoterapia> fichasCobaltoterapiaList1) {
        this.fichasCobaltoterapiaList1 = fichasCobaltoterapiaList1;
    }

    public List<Citologias> getCitologiasList() {
        return citologiasList;
    }

    public void setCitologiasList(List<Citologias> citologiasList) {
        this.citologiasList = citologiasList;
    }

    public List<EgresosSubbodegas> getEgresosSubbodegasList() {
        return egresosSubbodegasList;
    }

    public void setEgresosSubbodegasList(List<EgresosSubbodegas> egresosSubbodegasList) {
        this.egresosSubbodegasList = egresosSubbodegasList;
    }

    public List<RegulacionesActivosFijos> getRegulacionesActivosFijosList() {
        return regulacionesActivosFijosList;
    }

    public void setRegulacionesActivosFijosList(List<RegulacionesActivosFijos> regulacionesActivosFijosList) {
        this.regulacionesActivosFijosList = regulacionesActivosFijosList;
    }

    public List<EquiposOperatorios> getEquiposOperatoriosList() {
        return equiposOperatoriosList;
    }

    public void setEquiposOperatoriosList(List<EquiposOperatorios> equiposOperatoriosList) {
        this.equiposOperatoriosList = equiposOperatoriosList;
    }

    public List<Donaciones> getDonacionesList() {
        return donacionesList;
    }

    public void setDonacionesList(List<Donaciones> donacionesList) {
        this.donacionesList = donacionesList;
    }

    public List<ExcepcionesTurnosCe> getExcepcionesTurnosCeList() {
        return excepcionesTurnosCeList;
    }

    public void setExcepcionesTurnosCeList(List<ExcepcionesTurnosCe> excepcionesTurnosCeList) {
        this.excepcionesTurnosCeList = excepcionesTurnosCeList;
    }

    public List<HorariosMedico> getHorariosMedicoList() {
        return horariosMedicoList;
    }

    public void setHorariosMedicoList(List<HorariosMedico> horariosMedicoList) {
        this.horariosMedicoList = horariosMedicoList;
    }

    public List<SeguimientosSociales> getSeguimientosSocialesList() {
        return seguimientosSocialesList;
    }

    public void setSeguimientosSocialesList(List<SeguimientosSociales> seguimientosSocialesList) {
        this.seguimientosSocialesList = seguimientosSocialesList;
    }

    public List<TurnosProcedimientos> getTurnosProcedimientosList() {
        return turnosProcedimientosList;
    }

    public void setTurnosProcedimientosList(List<TurnosProcedimientos> turnosProcedimientosList) {
        this.turnosProcedimientosList = turnosProcedimientosList;
    }

    public List<TurnosProcedimientos> getTurnosProcedimientosList1() {
        return turnosProcedimientosList1;
    }

    public void setTurnosProcedimientosList1(List<TurnosProcedimientos> turnosProcedimientosList1) {
        this.turnosProcedimientosList1 = turnosProcedimientosList1;
    }

    public List<PrescripcionesMedicas> getPrescripcionesMedicasList() {
        return prescripcionesMedicasList;
    }

    public void setPrescripcionesMedicasList(List<PrescripcionesMedicas> prescripcionesMedicasList) {
        this.prescripcionesMedicasList = prescripcionesMedicasList;
    }

    public List<SolicitudesDeInternacion> getSolicitudesDeInternacionList() {
        return solicitudesDeInternacionList;
    }

    public void setSolicitudesDeInternacionList(List<SolicitudesDeInternacion> solicitudesDeInternacionList) {
        this.solicitudesDeInternacionList = solicitudesDeInternacionList;
    }

    public List<Pacientes> getPacientesList() {
        return pacientesList;
    }

    public void setPacientesList(List<Pacientes> pacientesList) {
        this.pacientesList = pacientesList;
    }

    public List<SolicitudesTransfusiones> getSolicitudesTransfusionesList() {
        return solicitudesTransfusionesList;
    }

    public void setSolicitudesTransfusionesList(List<SolicitudesTransfusiones> solicitudesTransfusionesList) {
        this.solicitudesTransfusionesList = solicitudesTransfusionesList;
    }

    public List<CuotasACobrarAmortizadas> getCuotasACobrarAmortizadasList() {
        return cuotasACobrarAmortizadasList;
    }

    public void setCuotasACobrarAmortizadasList(List<CuotasACobrarAmortizadas> cuotasACobrarAmortizadasList) {
        this.cuotasACobrarAmortizadasList = cuotasACobrarAmortizadasList;
    }

    public List<SegUsuario> getSegUsuarioList() {
        return segUsuarioList;
    }

    public void setSegUsuarioList(List<SegUsuario> segUsuarioList) {
        this.segUsuarioList = segUsuarioList;
    }

    public List<CamasHospitalizacion> getCamasHospitalizacionList() {
        return camasHospitalizacionList;
    }

    public void setCamasHospitalizacionList(List<CamasHospitalizacion> camasHospitalizacionList) {
        this.camasHospitalizacionList = camasHospitalizacionList;
    }

    public List<RolesDePagos> getRolesDePagosList() {
        return rolesDePagosList;
    }

    public void setRolesDePagosList(List<RolesDePagos> rolesDePagosList) {
        this.rolesDePagosList = rolesDePagosList;
    }

    public List<PreAnestesicos> getPreAnestesicosList() {
        return preAnestesicosList;
    }

    public void setPreAnestesicosList(List<PreAnestesicos> preAnestesicosList) {
        this.preAnestesicosList = preAnestesicosList;
    }

    public List<PagosEspeciales> getPagosEspecialesList() {
        return pagosEspecialesList;
    }

    public void setPagosEspecialesList(List<PagosEspeciales> pagosEspecialesList) {
        this.pagosEspecialesList = pagosEspecialesList;
    }

    public List<Promociones> getPromocionesList() {
        return promocionesList;
    }

    public void setPromocionesList(List<Promociones> promocionesList) {
        this.promocionesList = promocionesList;
    }

    public List<SolicitudesDeInsumos> getSolicitudesDeInsumosList() {
        return solicitudesDeInsumosList;
    }

    public void setSolicitudesDeInsumosList(List<SolicitudesDeInsumos> solicitudesDeInsumosList) {
        this.solicitudesDeInsumosList = solicitudesDeInsumosList;
    }

    public List<SolicitudesDeInsumos> getSolicitudesDeInsumosList1() {
        return solicitudesDeInsumosList1;
    }

    public void setSolicitudesDeInsumosList1(List<SolicitudesDeInsumos> solicitudesDeInsumosList1) {
        this.solicitudesDeInsumosList1 = solicitudesDeInsumosList1;
    }

    public List<PostAnesMedicamentos> getPostAnesMedicamentosList() {
        return postAnesMedicamentosList;
    }

    public void setPostAnesMedicamentosList(List<PostAnesMedicamentos> postAnesMedicamentosList) {
        this.postAnesMedicamentosList = postAnesMedicamentosList;
    }

    public List<Cotratantes> getCotratantesList() {
        return cotratantesList;
    }

    public void setCotratantesList(List<Cotratantes> cotratantesList) {
        this.cotratantesList = cotratantesList;
    }

    public List<Examenes> getExamenesList() {
        return examenesList;
    }

    public void setExamenesList(List<Examenes> examenesList) {
        this.examenesList = examenesList;
    }

    public List<PlanillasHonorariosMdc> getPlanillasHonorariosMdcList() {
        return planillasHonorariosMdcList;
    }

    public void setPlanillasHonorariosMdcList(List<PlanillasHonorariosMdc> planillasHonorariosMdcList) {
        this.planillasHonorariosMdcList = planillasHonorariosMdcList;
    }

    public List<DescuentosGenerados> getDescuentosGeneradosList() {
        return descuentosGeneradosList;
    }

    public void setDescuentosGeneradosList(List<DescuentosGenerados> descuentosGeneradosList) {
        this.descuentosGeneradosList = descuentosGeneradosList;
    }

    public List<ProcedimientosMenores> getProcedimientosMenoresList() {
        return procedimientosMenoresList;
    }

    public void setProcedimientosMenoresList(List<ProcedimientosMenores> procedimientosMenoresList) {
        this.procedimientosMenoresList = procedimientosMenoresList;
    }

    public List<ProcedimientosMenores> getProcedimientosMenoresList1() {
        return procedimientosMenoresList1;
    }

    public void setProcedimientosMenoresList1(List<ProcedimientosMenores> procedimientosMenoresList1) {
        this.procedimientosMenoresList1 = procedimientosMenoresList1;
    }

    public List<TurnosCe> getTurnosCeList() {
        return turnosCeList;
    }

    public void setTurnosCeList(List<TurnosCe> turnosCeList) {
        this.turnosCeList = turnosCeList;
    }

    public List<TurnosCe> getTurnosCeList1() {
        return turnosCeList1;
    }

    public void setTurnosCeList1(List<TurnosCe> turnosCeList1) {
        this.turnosCeList1 = turnosCeList1;
    }

    public List<FacturasAutomaticas> getFacturasAutomaticasList() {
        return facturasAutomaticasList;
    }

    public void setFacturasAutomaticasList(List<FacturasAutomaticas> facturasAutomaticasList) {
        this.facturasAutomaticasList = facturasAutomaticasList;
    }

    public List<MomentosCumplimiento> getMomentosCumplimientoList() {
        return momentosCumplimientoList;
    }

    public void setMomentosCumplimientoList(List<MomentosCumplimiento> momentosCumplimientoList) {
        this.momentosCumplimientoList = momentosCumplimientoList;
    }

    public List<Epicrisis> getEpicrisisList() {
        return epicrisisList;
    }

    public void setEpicrisisList(List<Epicrisis> epicrisisList) {
        this.epicrisisList = epicrisisList;
    }

    public List<Epicrisis> getEpicrisisList1() {
        return epicrisisList1;
    }

    public void setEpicrisisList1(List<Epicrisis> epicrisisList1) {
        this.epicrisisList1 = epicrisisList1;
    }

    public List<Proformas> getProformasList() {
        return proformasList;
    }

    public void setProformasList(List<Proformas> proformasList) {
        this.proformasList = proformasList;
    }

    public List<Notas> getNotasList() {
        return notasList;
    }

    public void setNotasList(List<Notas> notasList) {
        this.notasList = notasList;
    }

    public List<PerfilesPrescripciones> getPerfilesPrescripcionesList() {
        return perfilesPrescripcionesList;
    }

    public void setPerfilesPrescripcionesList(List<PerfilesPrescripciones> perfilesPrescripcionesList) {
        this.perfilesPrescripcionesList = perfilesPrescripcionesList;
    }

    public List<PrescripcionesMedicasQuimiot> getPrescripcionesMedicasQuimiotList() {
        return prescripcionesMedicasQuimiotList;
    }

    public void setPrescripcionesMedicasQuimiotList(List<PrescripcionesMedicasQuimiot> prescripcionesMedicasQuimiotList) {
        this.prescripcionesMedicasQuimiotList = prescripcionesMedicasQuimiotList;
    }

    public List<PrescripcionesMedicasQuimiot> getPrescripcionesMedicasQuimiotList1() {
        return prescripcionesMedicasQuimiotList1;
    }

    public void setPrescripcionesMedicasQuimiotList1(List<PrescripcionesMedicasQuimiot> prescripcionesMedicasQuimiotList1) {
        this.prescripcionesMedicasQuimiotList1 = prescripcionesMedicasQuimiotList1;
    }

    public List<OrdenesDeCompra> getOrdenesDeCompraList() {
        return ordenesDeCompraList;
    }

    public void setOrdenesDeCompraList(List<OrdenesDeCompra> ordenesDeCompraList) {
        this.ordenesDeCompraList = ordenesDeCompraList;
    }

    public List<AtencionSecretarias> getAtencionSecretariasList() {
        return atencionSecretariasList;
    }

    public void setAtencionSecretariasList(List<AtencionSecretarias> atencionSecretariasList) {
        this.atencionSecretariasList = atencionSecretariasList;
    }

    public List<AtencionSecretarias> getAtencionSecretariasList1() {
        return atencionSecretariasList1;
    }

    public void setAtencionSecretariasList1(List<AtencionSecretarias> atencionSecretariasList1) {
        this.atencionSecretariasList1 = atencionSecretariasList1;
    }

    public List<DetallesPrescripcion> getDetallesPrescripcionList() {
        return detallesPrescripcionList;
    }

    public void setDetallesPrescripcionList(List<DetallesPrescripcion> detallesPrescripcionList) {
        this.detallesPrescripcionList = detallesPrescripcionList;
    }

    public List<AsignacionesReingresosActivo> getAsignacionesReingresosActivoList() {
        return asignacionesReingresosActivoList;
    }

    public void setAsignacionesReingresosActivoList(List<AsignacionesReingresosActivo> asignacionesReingresosActivoList) {
        this.asignacionesReingresosActivoList = asignacionesReingresosActivoList;
    }

    public List<AsignacionesReingresosActivo> getAsignacionesReingresosActivoList1() {
        return asignacionesReingresosActivoList1;
    }

    public void setAsignacionesReingresosActivoList1(List<AsignacionesReingresosActivo> asignacionesReingresosActivoList1) {
        this.asignacionesReingresosActivoList1 = asignacionesReingresosActivoList1;
    }

    public List<IngresosActivosFijos> getIngresosActivosFijosList() {
        return ingresosActivosFijosList;
    }

    public void setIngresosActivosFijosList(List<IngresosActivosFijos> ingresosActivosFijosList) {
        this.ingresosActivosFijosList = ingresosActivosFijosList;
    }

    public List<DiagnosticosPaciente> getDiagnosticosPacienteList() {
        return diagnosticosPacienteList;
    }

    public void setDiagnosticosPacienteList(List<DiagnosticosPaciente> diagnosticosPacienteList) {
        this.diagnosticosPacienteList = diagnosticosPacienteList;
    }

    public List<RegistroPlanillasAutomaticas> getRegistroPlanillasAutomaticasList() {
        return registroPlanillasAutomaticasList;
    }

    public void setRegistroPlanillasAutomaticasList(List<RegistroPlanillasAutomaticas> registroPlanillasAutomaticasList) {
        this.registroPlanillasAutomaticasList = registroPlanillasAutomaticasList;
    }

    public List<AjustesInventario> getAjustesInventarioList() {
        return ajustesInventarioList;
    }

    public void setAjustesInventarioList(List<AjustesInventario> ajustesInventarioList) {
        this.ajustesInventarioList = ajustesInventarioList;
    }

    public List<HojasDeEvolucion> getHojasDeEvolucionList() {
        return hojasDeEvolucionList;
    }

    public void setHojasDeEvolucionList(List<HojasDeEvolucion> hojasDeEvolucionList) {
        this.hojasDeEvolucionList = hojasDeEvolucionList;
    }

    public List<HojasDeEvolucion> getHojasDeEvolucionList1() {
        return hojasDeEvolucionList1;
    }

    public void setHojasDeEvolucionList1(List<HojasDeEvolucion> hojasDeEvolucionList1) {
        this.hojasDeEvolucionList1 = hojasDeEvolucionList1;
    }

    public List<Depreciaciones> getDepreciacionesList() {
        return depreciacionesList;
    }

    public void setDepreciacionesList(List<Depreciaciones> depreciacionesList) {
        this.depreciacionesList = depreciacionesList;
    }

    public List<SolicitudesDeCompra> getSolicitudesDeCompraList() {
        return solicitudesDeCompraList;
    }

    public void setSolicitudesDeCompraList(List<SolicitudesDeCompra> solicitudesDeCompraList) {
        this.solicitudesDeCompraList = solicitudesDeCompraList;
    }

    public List<CabeceraInsumos> getCabeceraInsumosList() {
        return cabeceraInsumosList;
    }

    public void setCabeceraInsumosList(List<CabeceraInsumos> cabeceraInsumosList) {
        this.cabeceraInsumosList = cabeceraInsumosList;
    }

    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    public List<Facturas> getFacturasList1() {
        return facturasList1;
    }

    public void setFacturasList1(List<Facturas> facturasList1) {
        this.facturasList1 = facturasList1;
    }

    public List<ContraReferencias> getContraReferenciasList() {
        return contraReferenciasList;
    }

    public void setContraReferenciasList(List<ContraReferencias> contraReferenciasList) {
        this.contraReferenciasList = contraReferenciasList;
    }

    public List<ContraReferencias> getContraReferenciasList1() {
        return contraReferenciasList1;
    }

    public void setContraReferenciasList1(List<ContraReferencias> contraReferenciasList1) {
        this.contraReferenciasList1 = contraReferenciasList1;
    }

    public List<DefinicionesTurnos> getDefinicionesTurnosList() {
        return definicionesTurnosList;
    }

    public void setDefinicionesTurnosList(List<DefinicionesTurnos> definicionesTurnosList) {
        this.definicionesTurnosList = definicionesTurnosList;
    }

    public List<SegUsuarioPerfil> getSegUsuarioPerfilList() {
        return segUsuarioPerfilList;
    }

    public void setSegUsuarioPerfilList(List<SegUsuarioPerfil> segUsuarioPerfilList) {
        this.segUsuarioPerfilList = segUsuarioPerfilList;
    }

    public List<PromocionesConvenios> getPromocionesConveniosList() {
        return promocionesConveniosList;
    }

    public void setPromocionesConveniosList(List<PromocionesConvenios> promocionesConveniosList) {
        this.promocionesConveniosList = promocionesConveniosList;
    }

    public List<MovimientosDeCuenta> getMovimientosDeCuentaList() {
        return movimientosDeCuentaList;
    }

    public void setMovimientosDeCuentaList(List<MovimientosDeCuenta> movimientosDeCuentaList) {
        this.movimientosDeCuentaList = movimientosDeCuentaList;
    }

    public List<EgresosDeBodega> getEgresosDeBodegaList() {
        return egresosDeBodegaList;
    }

    public void setEgresosDeBodegaList(List<EgresosDeBodega> egresosDeBodegaList) {
        this.egresosDeBodegaList = egresosDeBodegaList;
    }

    public List<EgresosDeBodega> getEgresosDeBodegaList1() {
        return egresosDeBodegaList1;
    }

    public void setEgresosDeBodegaList1(List<EgresosDeBodega> egresosDeBodegaList1) {
        this.egresosDeBodegaList1 = egresosDeBodegaList1;
    }

    public List<Dependientes> getDependientesList() {
        return dependientesList;
    }

    public void setDependientesList(List<Dependientes> dependientesList) {
        this.dependientesList = dependientesList;
    }

    public List<DepartamentosTrabajan> getDepartamentosTrabajanList() {
        return departamentosTrabajanList;
    }

    public void setDepartamentosTrabajanList(List<DepartamentosTrabajan> departamentosTrabajanList) {
        this.departamentosTrabajanList = departamentosTrabajanList;
    }

    public List<RecuperacionPostAnestesica> getRecuperacionPostAnestesicaList() {
        return recuperacionPostAnestesicaList;
    }

    public void setRecuperacionPostAnestesicaList(List<RecuperacionPostAnestesica> recuperacionPostAnestesicaList) {
        this.recuperacionPostAnestesicaList = recuperacionPostAnestesicaList;
    }

    public List<RecuperacionPostAnestesica> getRecuperacionPostAnestesicaList1() {
        return recuperacionPostAnestesicaList1;
    }

    public void setRecuperacionPostAnestesicaList1(List<RecuperacionPostAnestesica> recuperacionPostAnestesicaList1) {
        this.recuperacionPostAnestesicaList1 = recuperacionPostAnestesicaList1;
    }

    public List<EgresosActivosFijos> getEgresosActivosFijosList() {
        return egresosActivosFijosList;
    }

    public void setEgresosActivosFijosList(List<EgresosActivosFijos> egresosActivosFijosList) {
        this.egresosActivosFijosList = egresosActivosFijosList;
    }

    public List<EgresosActivosFijos> getEgresosActivosFijosList1() {
        return egresosActivosFijosList1;
    }

    public void setEgresosActivosFijosList1(List<EgresosActivosFijos> egresosActivosFijosList1) {
        this.egresosActivosFijosList1 = egresosActivosFijosList1;
    }

    public List<EgresosActivosFijos> getEgresosActivosFijosList2() {
        return egresosActivosFijosList2;
    }

    public void setEgresosActivosFijosList2(List<EgresosActivosFijos> egresosActivosFijosList2) {
        this.egresosActivosFijosList2 = egresosActivosFijosList2;
    }

    public List<ControlesDePersonal> getControlesDePersonalList() {
        return controlesDePersonalList;
    }

    public void setControlesDePersonalList(List<ControlesDePersonal> controlesDePersonalList) {
        this.controlesDePersonalList = controlesDePersonalList;
    }

    public List<InformacionesAnestesicas> getInformacionesAnestesicasList() {
        return informacionesAnestesicasList;
    }

    public void setInformacionesAnestesicasList(List<InformacionesAnestesicas> informacionesAnestesicasList) {
        this.informacionesAnestesicasList = informacionesAnestesicasList;
    }

    public List<ResponsablesDepartamentos> getResponsablesDepartamentosList() {
        return responsablesDepartamentosList;
    }

    public void setResponsablesDepartamentosList(List<ResponsablesDepartamentos> responsablesDepartamentosList) {
        this.responsablesDepartamentosList = responsablesDepartamentosList;
    }

    public List<RegistroArchivosIssf> getRegistroArchivosIssfList() {
        return registroArchivosIssfList;
    }

    public void setRegistroArchivosIssfList(List<RegistroArchivosIssf> registroArchivosIssfList) {
        this.registroArchivosIssfList = registroArchivosIssfList;
    }

    public List<AutorizacionesPacientes> getAutorizacionesPacientesList() {
        return autorizacionesPacientesList;
    }

    public void setAutorizacionesPacientesList(List<AutorizacionesPacientes> autorizacionesPacientesList) {
        this.autorizacionesPacientesList = autorizacionesPacientesList;
    }

    public List<AutorizacionesPacientes> getAutorizacionesPacientesList1() {
        return autorizacionesPacientesList1;
    }

    public void setAutorizacionesPacientesList1(List<AutorizacionesPacientes> autorizacionesPacientesList1) {
        this.autorizacionesPacientesList1 = autorizacionesPacientesList1;
    }

    public List<Certificados> getCertificadosList() {
        return certificadosList;
    }

    public void setCertificadosList(List<Certificados> certificadosList) {
        this.certificadosList = certificadosList;
    }

    public List<ControlesPrenatales> getControlesPrenatalesList() {
        return controlesPrenatalesList;
    }

    public void setControlesPrenatalesList(List<ControlesPrenatales> controlesPrenatalesList) {
        this.controlesPrenatalesList = controlesPrenatalesList;
    }

    public EspecialidadPersonal getEspecialidadPersonal() {
        return especialidadPersonal;
    }

    public void setEspecialidadPersonal(EspecialidadPersonal especialidadPersonal) {
        this.especialidadPersonal = especialidadPersonal;
    }

    public List<Interconsultas> getInterconsultasList() {
        return interconsultasList;
    }

    public void setInterconsultasList(List<Interconsultas> interconsultasList) {
        this.interconsultasList = interconsultasList;
    }

    public List<Interconsultas> getInterconsultasList1() {
        return interconsultasList1;
    }

    public void setInterconsultasList1(List<Interconsultas> interconsultasList1) {
        this.interconsultasList1 = interconsultasList1;
    }

    public List<PartesOperatorios> getPartesOperatoriosList() {
        return partesOperatoriosList;
    }

    public void setPartesOperatoriosList(List<PartesOperatorios> partesOperatoriosList) {
        this.partesOperatoriosList = partesOperatoriosList;
    }

    public List<Liquidaciones> getLiquidacionesList() {
        return liquidacionesList;
    }

    public void setLiquidacionesList(List<Liquidaciones> liquidacionesList) {
        this.liquidacionesList = liquidacionesList;
    }

    public List<PermanenciasYAtenciones> getPermanenciasYAtencionesList() {
        return permanenciasYAtencionesList;
    }

    public void setPermanenciasYAtencionesList(List<PermanenciasYAtenciones> permanenciasYAtencionesList) {
        this.permanenciasYAtencionesList = permanenciasYAtencionesList;
    }

    public List<PermanenciasYAtenciones> getPermanenciasYAtencionesList1() {
        return permanenciasYAtencionesList1;
    }

    public void setPermanenciasYAtencionesList1(List<PermanenciasYAtenciones> permanenciasYAtencionesList1) {
        this.permanenciasYAtencionesList1 = permanenciasYAtencionesList1;
    }

    public List<PermanenciasYAtenciones> getPermanenciasYAtencionesList2() {
        return permanenciasYAtencionesList2;
    }

    public void setPermanenciasYAtencionesList2(List<PermanenciasYAtenciones> permanenciasYAtencionesList2) {
        this.permanenciasYAtencionesList2 = permanenciasYAtencionesList2;
    }

    public List<Quimioterapias> getQuimioterapiasList() {
        return quimioterapiasList;
    }

    public void setQuimioterapiasList(List<Quimioterapias> quimioterapiasList) {
        this.quimioterapiasList = quimioterapiasList;
    }

    public List<EgresosDeBotica> getEgresosDeBoticaList() {
        return egresosDeBoticaList;
    }

    public void setEgresosDeBoticaList(List<EgresosDeBotica> egresosDeBoticaList) {
        this.egresosDeBoticaList = egresosDeBoticaList;
    }

    public List<EgresosDeBotica> getEgresosDeBoticaList1() {
        return egresosDeBoticaList1;
    }

    public void setEgresosDeBoticaList1(List<EgresosDeBotica> egresosDeBoticaList1) {
        this.egresosDeBoticaList1 = egresosDeBoticaList1;
    }

    public List<Devoluciones> getDevolucionesList() {
        return devolucionesList;
    }

    public void setDevolucionesList(List<Devoluciones> devolucionesList) {
        this.devolucionesList = devolucionesList;
    }

    public List<CuentasPorCobrar> getCuentasPorCobrarList() {
        return cuentasPorCobrarList;
    }

    public void setCuentasPorCobrarList(List<CuentasPorCobrar> cuentasPorCobrarList) {
        this.cuentasPorCobrarList = cuentasPorCobrarList;
    }

    public List<RegistroArchivosIessWs> getRegistroArchivosIessWsList() {
        return registroArchivosIessWsList;
    }

    public void setRegistroArchivosIessWsList(List<RegistroArchivosIessWs> registroArchivosIessWsList) {
        this.registroArchivosIessWsList = registroArchivosIessWsList;
    }

    public List<FichasSociales> getFichasSocialesList() {
        return fichasSocialesList;
    }

    public void setFichasSocialesList(List<FichasSociales> fichasSocialesList) {
        this.fichasSocialesList = fichasSocialesList;
    }

    public List<Asociados> getAsociadosList() {
        return asociadosList;
    }

    public void setAsociadosList(List<Asociados> asociadosList) {
        this.asociadosList = asociadosList;
    }

    public List<IngresosDeBodega> getIngresosDeBodegaList() {
        return ingresosDeBodegaList;
    }

    public void setIngresosDeBodegaList(List<IngresosDeBodega> ingresosDeBodegaList) {
        this.ingresosDeBodegaList = ingresosDeBodegaList;
    }

    public List<IngresosDeBodega> getIngresosDeBodegaList1() {
        return ingresosDeBodegaList1;
    }

    public void setIngresosDeBodegaList1(List<IngresosDeBodega> ingresosDeBodegaList1) {
        this.ingresosDeBodegaList1 = ingresosDeBodegaList1;
    }

    public List<RegistroDeEnfermeria> getRegistroDeEnfermeriaList() {
        return registroDeEnfermeriaList;
    }

    public void setRegistroDeEnfermeriaList(List<RegistroDeEnfermeria> registroDeEnfermeriaList) {
        this.registroDeEnfermeriaList = registroDeEnfermeriaList;
    }

    public List<Papanicolaous> getPapanicolaousList() {
        return papanicolaousList;
    }

    public void setPapanicolaousList(List<Papanicolaous> papanicolaousList) {
        this.papanicolaousList = papanicolaousList;
    }

    public List<Beneficiarios> getBeneficiariosList() {
        return beneficiariosList;
    }

    public void setBeneficiariosList(List<Beneficiarios> beneficiariosList) {
        this.beneficiariosList = beneficiariosList;
    }

    public List<CopagosPacientes> getCopagosPacientesList() {
        return copagosPacientesList;
    }

    public void setCopagosPacientesList(List<CopagosPacientes> copagosPacientesList) {
        this.copagosPacientesList = copagosPacientesList;
    }

    public List<PedidosDeDieta> getPedidosDeDietaList() {
        return pedidosDeDietaList;
    }

    public void setPedidosDeDietaList(List<PedidosDeDieta> pedidosDeDietaList) {
        this.pedidosDeDietaList = pedidosDeDietaList;
    }

    public List<PedidosDeDieta> getPedidosDeDietaList1() {
        return pedidosDeDietaList1;
    }

    public void setPedidosDeDietaList1(List<PedidosDeDieta> pedidosDeDietaList1) {
        this.pedidosDeDietaList1 = pedidosDeDietaList1;
    }

    public List<SolicitudesDeExamenes> getSolicitudesDeExamenesList() {
        return solicitudesDeExamenesList;
    }

    public void setSolicitudesDeExamenesList(List<SolicitudesDeExamenes> solicitudesDeExamenesList) {
        this.solicitudesDeExamenesList = solicitudesDeExamenesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Personal[ codigo=" + codigo + " ]";
    }
    
}
