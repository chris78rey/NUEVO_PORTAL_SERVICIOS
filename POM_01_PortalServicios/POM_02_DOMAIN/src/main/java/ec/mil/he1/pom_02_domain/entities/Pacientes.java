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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "PACIENTES")
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p")})
public class Pacientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO_HC")
    private Integer numeroHc;
    @Column(name = "APELLIDO_PATERNO")
    private String apellidoPaterno;
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "ESTADO_CIVIL")
    private String estadoCivil;
    @Column(name = "CLASIFICACION")
    private String clasificacion;
    @Column(name = "APELLIDO_MATERNO")
    private String apellidoMaterno;
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "GRUPO_SANGUINEO")
    private String grupoSanguineo;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "NUMERO_AFILIACION_IESS")
    private Long numeroAfiliacionIess;
    @Column(name = "DIRECCION_DOMICILIO")
    private String direccionDomicilio;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "FECHA_AFILIACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAfiliacion;
    @Column(name = "INSTRUCCION")
    private String instruccion;
    @Column(name = "BLOQUEADO")
    private Character bloqueado;
    @Column(name = "FECHA_TERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTermino;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MAXIMO_CUPO")
    private BigDecimal maximoCupo;
    @Column(name = "DIAS_MAXIMO_PAGO")
    private Short diasMaximoPago;
    @Column(name = "TIPO_PACIENTE")
    private String tipoPaciente;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ASEGURADO")
    private Character asegurado;
    @Column(name = "INFORMACION_A_RECIBIR")
    private String informacionARecibir;
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;
    @Column(name = "SALDO_ACTUAL")
    private BigInteger saldoActual;
    @Column(name = "SUB_CLASIFICACION")
    private String subClasificacion;
    @Column(name = "ALERTA")
    private String alerta;
    @Column(name = "BARRIO")
    private String barrio;
    @Column(name = "ZONA")
    private String zona;
    @Column(name = "LUGAR_NACIMIENTO")
    private String lugarNacimiento;
    @Column(name = "NACIONALIDAD")
    private String nacionalidad;
    @Column(name = "GRUPO_CULTURAL")
    private String grupoCultural;
    @Column(name = "EMPRESA_TRABAJO")
    private String empresaTrabajo;
    @Column(name = "TIPO_SEGURO")
    private String tipoSeguro;
    @Column(name = "DATOS_VERIFICADOS")
    private Character datosVerificados;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "DIRECCION_TRABAJO")
    private String direccionTrabajo;
    @Column(name = "TELEFONO_TRABAJO")
    private String telefonoTrabajo;
    @Column(name = "DIR_CORRESPONDENCIA")
    private String dirCorrespondencia;
    @Column(name = "INST_CODIGO")
    private String instCodigo;
    @Column(name = "CLASIFICACION_ONC")
    private String clasificacionOnc;
    @Column(name = "NUMERO_HC_ANTERIOR")
    private Long numeroHcAnterior;
    @Column(name = "TIPO_PACIENTE_ANTERIOR")
    private Short tipoPacienteAnterior;
    @Column(name = "INSTITUCION_REP")
    private Integer institucionRep;
    @Column(name = "TRATAMIENTO_ACTIVO")
    private Character tratamientoActivo;
    @Column(name = "FUERZA")
    private String fuerza;
    @Column(name = "GRADO")
    private String grado;
    @Column(name = "SITUACION")
    private String situacion;
    @Column(name = "RELIGION")
    private String religion;
    @Column(name = "ULTIMO_ANIO_INSTRUCCION")
    private String ultimoAnioInstruccion;
    @Column(name = "UNDMLT_CODIGO")
    private String undmltCodigo;
    @Column(name = "UNDSLDFFAA_CODIGO")
    private BigInteger undsldffaaCodigo;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "ID_ISSFA")
    private String idIssfa;
    @Column(name = "DISCRIMINADOR")
    private String discriminador;
    @Column(name = "ID_CONADIS")
    private String idConadis;
    @Column(name = "ID_ISSFA_TITULAR")
    private String idIssfaTitular;
    @Column(name = "TIPO_DISCAPACIDAD")
    private String tipoDiscapacidad;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "EPIDEMIOLOGICO")
    private Character epidemiologico;
    @Column(name = "ES_VALIDA")
    private Short esValida;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Consultas> consultasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<PartesOperatoriosSolicitud> partesOperatoriosSolicitudList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Cuentas> cuentasList;
    @OneToMany(mappedBy = "pacientes1", fetch = FetchType.LAZY)
    private List<Cuentas> cuentasList1;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<DescargosGenerales> descargosGeneralesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Alergias> alergiasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<DescargosDeBotica> descargosDeBoticaList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<JustificacionHemoderivados> justificacionHemoderivadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<MotivosDeConsultas> motivosDeConsultasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<CuentasCopago> cuentasCopagoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<ConsentimientosInformados> consentimientosInformadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<AntecedentesPersonales> antecedentesPersonalesList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<DetallesPlanillaPrefact> detallesPlanillaPrefactList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private ArchivosImagenes archivosImagenes;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<EntidadesBeneficiarias> entidadesBeneficiariasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<PagosAgrupados> pagosAgrupadosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Embarazos> embarazosList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<PromocionesPacientes> promocionesPacientesList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<FichasCobaltoterapia> fichasCobaltoterapiaList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<EgresosSubbodegas> egresosSubbodegasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Donaciones> donacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<InformacionDeCuidado> informacionDeCuidadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Referentes> referentesList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<RegistrosPaciente> registrosPacienteList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<TurnosProcedimientos> turnosProcedimientosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private Habitos habitos;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<PrescripcionesMedicas> prescripcionesMedicasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<SolicitudesDeInternacion> solicitudesDeInternacionList;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "OCP_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ocupaciones ocupaciones;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Pacientes> pacientesList;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumns({
        @JoinColumn(name = "PRQ_CNT_PRV_CODIGO", referencedColumnName = "CNT_PRV_CODIGO"),
        @JoinColumn(name = "PRQ_CNT_CODIGO", referencedColumnName = "CNT_CODIGO"),
        @JoinColumn(name = "PRQ_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Parroquias parroquias;
    @JoinColumns({
        @JoinColumn(name = "PRQ_CNT_PRV_CODIGO_NCM", referencedColumnName = "CNT_PRV_CODIGO"),
        @JoinColumn(name = "PRQ_CNT_CODIGO_NCM", referencedColumnName = "CNT_CODIGO"),
        @JoinColumn(name = "PRQ_CODIGO_NCM", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Parroquias parroquias1;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<SolicitudesTransfusiones> solicitudesTransfusionesList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private AntecedentesInfantiles antecedentesInfantiles;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<SegUsuario> segUsuarioList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Promociones> promocionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Problemas> problemasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Examenes> examenesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<AntecedentesFamiliares> antecedentesFamiliaresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<DetallesDieta> detallesDietaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<ProcedimientosMenores> procedimientosMenoresList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<TurnosCe> turnosCeList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<SignosVitales> signosVitalesList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Anticipos> anticiposList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<FacturasAutomaticas> facturasAutomaticasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Proformas> proformasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<DiagnosticosPaciente> diagnosticosPacienteList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<CuentasPaquetes> cuentasPaquetesList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Planilla> planillaList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<CuentasEnPaquetes> cuentasEnPaquetesList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<HojasDeEvolucion> hojasDeEvolucionList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Inmunizaciones> inmunizacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<RegulacionesFertilidad> regulacionesFertilidadList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<CabeceraInsumos> cabeceraInsumosList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<CuentasExtras> cuentasExtrasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Facturas> facturasList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private AntecedentesGinecoObstetrico antecedentesGinecoObstetrico;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<ContraReferencias> contraReferenciasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<PromocionesConvenios> promocionesConveniosList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Emergencias> emergenciasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Dependientes> dependientesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<EstadosPacientes> estadosPacientesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Interconsultas> interconsultasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<PermanenciasYAtenciones> permanenciasYAtencionesList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Quimioterapias> quimioterapiasList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<EgresosDeBotica> egresosDeBoticaList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Devoluciones> devolucionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<ProtocolosPaciente> protocolosPacienteList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private AnamnesisesFisiologica anamnesisesFisiologica;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<FichasSociales> fichasSocialesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<RegistrosObstetricia> registrosObstetriciaList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<HonorariosMedicos> honorariosMedicosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<Beneficiarios> beneficiariosList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<CopagosPacientes> copagosPacientesList;
    @OneToMany(mappedBy = "pacientes", fetch = FetchType.LAZY)
    private List<SolicitudesDeExamenes> solicitudesDeExamenesList;

    public Pacientes() {
    }

    public Pacientes(Integer numeroHc) {
        this.numeroHc = numeroHc;
    }

    public Integer getNumeroHc() {
        return numeroHc;
    }

    public void setNumeroHc(Integer numeroHc) {
        this.numeroHc = numeroHc;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getNumeroAfiliacionIess() {
        return numeroAfiliacionIess;
    }

    public void setNumeroAfiliacionIess(Long numeroAfiliacionIess) {
        this.numeroAfiliacionIess = numeroAfiliacionIess;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public Character getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Character bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public BigDecimal getMaximoCupo() {
        return maximoCupo;
    }

    public void setMaximoCupo(BigDecimal maximoCupo) {
        this.maximoCupo = maximoCupo;
    }

    public Short getDiasMaximoPago() {
        return diasMaximoPago;
    }

    public void setDiasMaximoPago(Short diasMaximoPago) {
        this.diasMaximoPago = diasMaximoPago;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(Character asegurado) {
        this.asegurado = asegurado;
    }

    public String getInformacionARecibir() {
        return informacionARecibir;
    }

    public void setInformacionARecibir(String informacionARecibir) {
        this.informacionARecibir = informacionARecibir;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public BigInteger getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigInteger saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getSubClasificacion() {
        return subClasificacion;
    }

    public void setSubClasificacion(String subClasificacion) {
        this.subClasificacion = subClasificacion;
    }

    public String getAlerta() {
        return alerta;
    }

    public void setAlerta(String alerta) {
        this.alerta = alerta;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGrupoCultural() {
        return grupoCultural;
    }

    public void setGrupoCultural(String grupoCultural) {
        this.grupoCultural = grupoCultural;
    }

    public String getEmpresaTrabajo() {
        return empresaTrabajo;
    }

    public void setEmpresaTrabajo(String empresaTrabajo) {
        this.empresaTrabajo = empresaTrabajo;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public Character getDatosVerificados() {
        return datosVerificados;
    }

    public void setDatosVerificados(Character datosVerificados) {
        this.datosVerificados = datosVerificados;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public void setDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public String getDirCorrespondencia() {
        return dirCorrespondencia;
    }

    public void setDirCorrespondencia(String dirCorrespondencia) {
        this.dirCorrespondencia = dirCorrespondencia;
    }

    public String getInstCodigo() {
        return instCodigo;
    }

    public void setInstCodigo(String instCodigo) {
        this.instCodigo = instCodigo;
    }

    public String getClasificacionOnc() {
        return clasificacionOnc;
    }

    public void setClasificacionOnc(String clasificacionOnc) {
        this.clasificacionOnc = clasificacionOnc;
    }

    public Long getNumeroHcAnterior() {
        return numeroHcAnterior;
    }

    public void setNumeroHcAnterior(Long numeroHcAnterior) {
        this.numeroHcAnterior = numeroHcAnterior;
    }

    public Short getTipoPacienteAnterior() {
        return tipoPacienteAnterior;
    }

    public void setTipoPacienteAnterior(Short tipoPacienteAnterior) {
        this.tipoPacienteAnterior = tipoPacienteAnterior;
    }

    public Integer getInstitucionRep() {
        return institucionRep;
    }

    public void setInstitucionRep(Integer institucionRep) {
        this.institucionRep = institucionRep;
    }

    public Character getTratamientoActivo() {
        return tratamientoActivo;
    }

    public void setTratamientoActivo(Character tratamientoActivo) {
        this.tratamientoActivo = tratamientoActivo;
    }

    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getUltimoAnioInstruccion() {
        return ultimoAnioInstruccion;
    }

    public void setUltimoAnioInstruccion(String ultimoAnioInstruccion) {
        this.ultimoAnioInstruccion = ultimoAnioInstruccion;
    }

    public String getUndmltCodigo() {
        return undmltCodigo;
    }

    public void setUndmltCodigo(String undmltCodigo) {
        this.undmltCodigo = undmltCodigo;
    }

    public BigInteger getUndsldffaaCodigo() {
        return undsldffaaCodigo;
    }

    public void setUndsldffaaCodigo(BigInteger undsldffaaCodigo) {
        this.undsldffaaCodigo = undsldffaaCodigo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdIssfa() {
        return idIssfa;
    }

    public void setIdIssfa(String idIssfa) {
        this.idIssfa = idIssfa;
    }

    public String getDiscriminador() {
        return discriminador;
    }

    public void setDiscriminador(String discriminador) {
        this.discriminador = discriminador;
    }

    public String getIdConadis() {
        return idConadis;
    }

    public void setIdConadis(String idConadis) {
        this.idConadis = idConadis;
    }

    public String getIdIssfaTitular() {
        return idIssfaTitular;
    }

    public void setIdIssfaTitular(String idIssfaTitular) {
        this.idIssfaTitular = idIssfaTitular;
    }

    public String getTipoDiscapacidad() {
        return tipoDiscapacidad;
    }

    public void setTipoDiscapacidad(String tipoDiscapacidad) {
        this.tipoDiscapacidad = tipoDiscapacidad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Character getEpidemiologico() {
        return epidemiologico;
    }

    public void setEpidemiologico(Character epidemiologico) {
        this.epidemiologico = epidemiologico;
    }

    public Short getEsValida() {
        return esValida;
    }

    public void setEsValida(Short esValida) {
        this.esValida = esValida;
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

    public List<Cuentas> getCuentasList() {
        return cuentasList;
    }

    public void setCuentasList(List<Cuentas> cuentasList) {
        this.cuentasList = cuentasList;
    }

    public List<Cuentas> getCuentasList1() {
        return cuentasList1;
    }

    public void setCuentasList1(List<Cuentas> cuentasList1) {
        this.cuentasList1 = cuentasList1;
    }

    public List<DescargosGenerales> getDescargosGeneralesList() {
        return descargosGeneralesList;
    }

    public void setDescargosGeneralesList(List<DescargosGenerales> descargosGeneralesList) {
        this.descargosGeneralesList = descargosGeneralesList;
    }

    public List<Alergias> getAlergiasList() {
        return alergiasList;
    }

    public void setAlergiasList(List<Alergias> alergiasList) {
        this.alergiasList = alergiasList;
    }

    public List<DescargosDeBotica> getDescargosDeBoticaList() {
        return descargosDeBoticaList;
    }

    public void setDescargosDeBoticaList(List<DescargosDeBotica> descargosDeBoticaList) {
        this.descargosDeBoticaList = descargosDeBoticaList;
    }

    public List<JustificacionHemoderivados> getJustificacionHemoderivadosList() {
        return justificacionHemoderivadosList;
    }

    public void setJustificacionHemoderivadosList(List<JustificacionHemoderivados> justificacionHemoderivadosList) {
        this.justificacionHemoderivadosList = justificacionHemoderivadosList;
    }

    public List<MotivosDeConsultas> getMotivosDeConsultasList() {
        return motivosDeConsultasList;
    }

    public void setMotivosDeConsultasList(List<MotivosDeConsultas> motivosDeConsultasList) {
        this.motivosDeConsultasList = motivosDeConsultasList;
    }

    public List<CuentasCopago> getCuentasCopagoList() {
        return cuentasCopagoList;
    }

    public void setCuentasCopagoList(List<CuentasCopago> cuentasCopagoList) {
        this.cuentasCopagoList = cuentasCopagoList;
    }

    public List<ConsentimientosInformados> getConsentimientosInformadosList() {
        return consentimientosInformadosList;
    }

    public void setConsentimientosInformadosList(List<ConsentimientosInformados> consentimientosInformadosList) {
        this.consentimientosInformadosList = consentimientosInformadosList;
    }

    public List<AntecedentesPersonales> getAntecedentesPersonalesList() {
        return antecedentesPersonalesList;
    }

    public void setAntecedentesPersonalesList(List<AntecedentesPersonales> antecedentesPersonalesList) {
        this.antecedentesPersonalesList = antecedentesPersonalesList;
    }

    public List<DetallesPlanillaPrefact> getDetallesPlanillaPrefactList() {
        return detallesPlanillaPrefactList;
    }

    public void setDetallesPlanillaPrefactList(List<DetallesPlanillaPrefact> detallesPlanillaPrefactList) {
        this.detallesPlanillaPrefactList = detallesPlanillaPrefactList;
    }

    public ArchivosImagenes getArchivosImagenes() {
        return archivosImagenes;
    }

    public void setArchivosImagenes(ArchivosImagenes archivosImagenes) {
        this.archivosImagenes = archivosImagenes;
    }

    public List<EntidadesBeneficiarias> getEntidadesBeneficiariasList() {
        return entidadesBeneficiariasList;
    }

    public void setEntidadesBeneficiariasList(List<EntidadesBeneficiarias> entidadesBeneficiariasList) {
        this.entidadesBeneficiariasList = entidadesBeneficiariasList;
    }

    public List<PagosAgrupados> getPagosAgrupadosList() {
        return pagosAgrupadosList;
    }

    public void setPagosAgrupadosList(List<PagosAgrupados> pagosAgrupadosList) {
        this.pagosAgrupadosList = pagosAgrupadosList;
    }

    public List<Embarazos> getEmbarazosList() {
        return embarazosList;
    }

    public void setEmbarazosList(List<Embarazos> embarazosList) {
        this.embarazosList = embarazosList;
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

    public List<EgresosSubbodegas> getEgresosSubbodegasList() {
        return egresosSubbodegasList;
    }

    public void setEgresosSubbodegasList(List<EgresosSubbodegas> egresosSubbodegasList) {
        this.egresosSubbodegasList = egresosSubbodegasList;
    }

    public List<Donaciones> getDonacionesList() {
        return donacionesList;
    }

    public void setDonacionesList(List<Donaciones> donacionesList) {
        this.donacionesList = donacionesList;
    }

    public List<InformacionDeCuidado> getInformacionDeCuidadoList() {
        return informacionDeCuidadoList;
    }

    public void setInformacionDeCuidadoList(List<InformacionDeCuidado> informacionDeCuidadoList) {
        this.informacionDeCuidadoList = informacionDeCuidadoList;
    }

    public List<Referentes> getReferentesList() {
        return referentesList;
    }

    public void setReferentesList(List<Referentes> referentesList) {
        this.referentesList = referentesList;
    }

    public List<RegistrosPaciente> getRegistrosPacienteList() {
        return registrosPacienteList;
    }

    public void setRegistrosPacienteList(List<RegistrosPaciente> registrosPacienteList) {
        this.registrosPacienteList = registrosPacienteList;
    }

    public List<TurnosProcedimientos> getTurnosProcedimientosList() {
        return turnosProcedimientosList;
    }

    public void setTurnosProcedimientosList(List<TurnosProcedimientos> turnosProcedimientosList) {
        this.turnosProcedimientosList = turnosProcedimientosList;
    }

    public Habitos getHabitos() {
        return habitos;
    }

    public void setHabitos(Habitos habitos) {
        this.habitos = habitos;
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

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Ocupaciones getOcupaciones() {
        return ocupaciones;
    }

    public void setOcupaciones(Ocupaciones ocupaciones) {
        this.ocupaciones = ocupaciones;
    }

    public List<Pacientes> getPacientesList() {
        return pacientesList;
    }

    public void setPacientesList(List<Pacientes> pacientesList) {
        this.pacientesList = pacientesList;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Parroquias getParroquias() {
        return parroquias;
    }

    public void setParroquias(Parroquias parroquias) {
        this.parroquias = parroquias;
    }

    public Parroquias getParroquias1() {
        return parroquias1;
    }

    public void setParroquias1(Parroquias parroquias1) {
        this.parroquias1 = parroquias1;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<SolicitudesTransfusiones> getSolicitudesTransfusionesList() {
        return solicitudesTransfusionesList;
    }

    public void setSolicitudesTransfusionesList(List<SolicitudesTransfusiones> solicitudesTransfusionesList) {
        this.solicitudesTransfusionesList = solicitudesTransfusionesList;
    }

    public AntecedentesInfantiles getAntecedentesInfantiles() {
        return antecedentesInfantiles;
    }

    public void setAntecedentesInfantiles(AntecedentesInfantiles antecedentesInfantiles) {
        this.antecedentesInfantiles = antecedentesInfantiles;
    }

    public List<SegUsuario> getSegUsuarioList() {
        return segUsuarioList;
    }

    public void setSegUsuarioList(List<SegUsuario> segUsuarioList) {
        this.segUsuarioList = segUsuarioList;
    }

    public List<Promociones> getPromocionesList() {
        return promocionesList;
    }

    public void setPromocionesList(List<Promociones> promocionesList) {
        this.promocionesList = promocionesList;
    }

    public List<Problemas> getProblemasList() {
        return problemasList;
    }

    public void setProblemasList(List<Problemas> problemasList) {
        this.problemasList = problemasList;
    }

    public List<Examenes> getExamenesList() {
        return examenesList;
    }

    public void setExamenesList(List<Examenes> examenesList) {
        this.examenesList = examenesList;
    }

    public List<AntecedentesFamiliares> getAntecedentesFamiliaresList() {
        return antecedentesFamiliaresList;
    }

    public void setAntecedentesFamiliaresList(List<AntecedentesFamiliares> antecedentesFamiliaresList) {
        this.antecedentesFamiliaresList = antecedentesFamiliaresList;
    }

    public List<DetallesDieta> getDetallesDietaList() {
        return detallesDietaList;
    }

    public void setDetallesDietaList(List<DetallesDieta> detallesDietaList) {
        this.detallesDietaList = detallesDietaList;
    }

    public List<ProcedimientosMenores> getProcedimientosMenoresList() {
        return procedimientosMenoresList;
    }

    public void setProcedimientosMenoresList(List<ProcedimientosMenores> procedimientosMenoresList) {
        this.procedimientosMenoresList = procedimientosMenoresList;
    }

    public List<TurnosCe> getTurnosCeList() {
        return turnosCeList;
    }

    public void setTurnosCeList(List<TurnosCe> turnosCeList) {
        this.turnosCeList = turnosCeList;
    }

    public List<SignosVitales> getSignosVitalesList() {
        return signosVitalesList;
    }

    public void setSignosVitalesList(List<SignosVitales> signosVitalesList) {
        this.signosVitalesList = signosVitalesList;
    }

    public List<Anticipos> getAnticiposList() {
        return anticiposList;
    }

    public void setAnticiposList(List<Anticipos> anticiposList) {
        this.anticiposList = anticiposList;
    }

    public List<FacturasAutomaticas> getFacturasAutomaticasList() {
        return facturasAutomaticasList;
    }

    public void setFacturasAutomaticasList(List<FacturasAutomaticas> facturasAutomaticasList) {
        this.facturasAutomaticasList = facturasAutomaticasList;
    }

    public List<Proformas> getProformasList() {
        return proformasList;
    }

    public void setProformasList(List<Proformas> proformasList) {
        this.proformasList = proformasList;
    }

    public List<DiagnosticosPaciente> getDiagnosticosPacienteList() {
        return diagnosticosPacienteList;
    }

    public void setDiagnosticosPacienteList(List<DiagnosticosPaciente> diagnosticosPacienteList) {
        this.diagnosticosPacienteList = diagnosticosPacienteList;
    }

    public List<CuentasPaquetes> getCuentasPaquetesList() {
        return cuentasPaquetesList;
    }

    public void setCuentasPaquetesList(List<CuentasPaquetes> cuentasPaquetesList) {
        this.cuentasPaquetesList = cuentasPaquetesList;
    }

    public List<Planilla> getPlanillaList() {
        return planillaList;
    }

    public void setPlanillaList(List<Planilla> planillaList) {
        this.planillaList = planillaList;
    }

    public List<CuentasEnPaquetes> getCuentasEnPaquetesList() {
        return cuentasEnPaquetesList;
    }

    public void setCuentasEnPaquetesList(List<CuentasEnPaquetes> cuentasEnPaquetesList) {
        this.cuentasEnPaquetesList = cuentasEnPaquetesList;
    }

    public List<HojasDeEvolucion> getHojasDeEvolucionList() {
        return hojasDeEvolucionList;
    }

    public void setHojasDeEvolucionList(List<HojasDeEvolucion> hojasDeEvolucionList) {
        this.hojasDeEvolucionList = hojasDeEvolucionList;
    }

    public List<Inmunizaciones> getInmunizacionesList() {
        return inmunizacionesList;
    }

    public void setInmunizacionesList(List<Inmunizaciones> inmunizacionesList) {
        this.inmunizacionesList = inmunizacionesList;
    }

    public List<RegulacionesFertilidad> getRegulacionesFertilidadList() {
        return regulacionesFertilidadList;
    }

    public void setRegulacionesFertilidadList(List<RegulacionesFertilidad> regulacionesFertilidadList) {
        this.regulacionesFertilidadList = regulacionesFertilidadList;
    }

    public List<CabeceraInsumos> getCabeceraInsumosList() {
        return cabeceraInsumosList;
    }

    public void setCabeceraInsumosList(List<CabeceraInsumos> cabeceraInsumosList) {
        this.cabeceraInsumosList = cabeceraInsumosList;
    }

    public List<CuentasExtras> getCuentasExtrasList() {
        return cuentasExtrasList;
    }

    public void setCuentasExtrasList(List<CuentasExtras> cuentasExtrasList) {
        this.cuentasExtrasList = cuentasExtrasList;
    }

    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    public AntecedentesGinecoObstetrico getAntecedentesGinecoObstetrico() {
        return antecedentesGinecoObstetrico;
    }

    public void setAntecedentesGinecoObstetrico(AntecedentesGinecoObstetrico antecedentesGinecoObstetrico) {
        this.antecedentesGinecoObstetrico = antecedentesGinecoObstetrico;
    }

    public List<ContraReferencias> getContraReferenciasList() {
        return contraReferenciasList;
    }

    public void setContraReferenciasList(List<ContraReferencias> contraReferenciasList) {
        this.contraReferenciasList = contraReferenciasList;
    }

    public List<PromocionesConvenios> getPromocionesConveniosList() {
        return promocionesConveniosList;
    }

    public void setPromocionesConveniosList(List<PromocionesConvenios> promocionesConveniosList) {
        this.promocionesConveniosList = promocionesConveniosList;
    }

    public List<Emergencias> getEmergenciasList() {
        return emergenciasList;
    }

    public void setEmergenciasList(List<Emergencias> emergenciasList) {
        this.emergenciasList = emergenciasList;
    }

    public List<Dependientes> getDependientesList() {
        return dependientesList;
    }

    public void setDependientesList(List<Dependientes> dependientesList) {
        this.dependientesList = dependientesList;
    }

    public List<EstadosPacientes> getEstadosPacientesList() {
        return estadosPacientesList;
    }

    public void setEstadosPacientesList(List<EstadosPacientes> estadosPacientesList) {
        this.estadosPacientesList = estadosPacientesList;
    }

    public List<Interconsultas> getInterconsultasList() {
        return interconsultasList;
    }

    public void setInterconsultasList(List<Interconsultas> interconsultasList) {
        this.interconsultasList = interconsultasList;
    }

    public List<PermanenciasYAtenciones> getPermanenciasYAtencionesList() {
        return permanenciasYAtencionesList;
    }

    public void setPermanenciasYAtencionesList(List<PermanenciasYAtenciones> permanenciasYAtencionesList) {
        this.permanenciasYAtencionesList = permanenciasYAtencionesList;
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

    public List<Devoluciones> getDevolucionesList() {
        return devolucionesList;
    }

    public void setDevolucionesList(List<Devoluciones> devolucionesList) {
        this.devolucionesList = devolucionesList;
    }

    public List<ProtocolosPaciente> getProtocolosPacienteList() {
        return protocolosPacienteList;
    }

    public void setProtocolosPacienteList(List<ProtocolosPaciente> protocolosPacienteList) {
        this.protocolosPacienteList = protocolosPacienteList;
    }

    public AnamnesisesFisiologica getAnamnesisesFisiologica() {
        return anamnesisesFisiologica;
    }

    public void setAnamnesisesFisiologica(AnamnesisesFisiologica anamnesisesFisiologica) {
        this.anamnesisesFisiologica = anamnesisesFisiologica;
    }

    public List<FichasSociales> getFichasSocialesList() {
        return fichasSocialesList;
    }

    public void setFichasSocialesList(List<FichasSociales> fichasSocialesList) {
        this.fichasSocialesList = fichasSocialesList;
    }

    public List<RegistrosObstetricia> getRegistrosObstetriciaList() {
        return registrosObstetriciaList;
    }

    public void setRegistrosObstetriciaList(List<RegistrosObstetricia> registrosObstetriciaList) {
        this.registrosObstetriciaList = registrosObstetriciaList;
    }

    public List<HonorariosMedicos> getHonorariosMedicosList() {
        return honorariosMedicosList;
    }

    public void setHonorariosMedicosList(List<HonorariosMedicos> honorariosMedicosList) {
        this.honorariosMedicosList = honorariosMedicosList;
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

    public List<SolicitudesDeExamenes> getSolicitudesDeExamenesList() {
        return solicitudesDeExamenesList;
    }

    public void setSolicitudesDeExamenesList(List<SolicitudesDeExamenes> solicitudesDeExamenesList) {
        this.solicitudesDeExamenesList = solicitudesDeExamenesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroHc != null ? numeroHc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.numeroHc == null && other.numeroHc != null) || (this.numeroHc != null && !this.numeroHc.equals(other.numeroHc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Pacientes[ numeroHc=" + numeroHc + " ]";
    }
    
}
