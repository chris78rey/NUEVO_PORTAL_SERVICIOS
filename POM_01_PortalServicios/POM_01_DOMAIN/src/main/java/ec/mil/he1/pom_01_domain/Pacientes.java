/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "PACIENTES")
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p")})
public class Pacientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO_HC")
    private Integer numeroHc;
    @Column(name = "PRQ_CNT_CODIGO")
    private String prqCntCodigo;
    @Column(name = "PRQ_CNT_PRV_CODIGO")
    private String prqCntPrvCodigo;
    @Column(name = "PRQ_CODIGO")
    private String prqCodigo;
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
    @Column(name = "OCP_CODIGO")
    private String ocpCodigo;
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
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
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
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
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
    @Column(name = "PRQ_CNT_PRV_CODIGO_NCM")
    private String prqCntPrvCodigoNcm;
    @Column(name = "PRQ_CNT_CODIGO_NCM")
    private String prqCntCodigoNcm;
    @Column(name = "PRQ_CODIGO_NCM")
    private String prqCodigoNcm;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
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

    public String getPrqCntCodigo() {
        return prqCntCodigo;
    }

    public void setPrqCntCodigo(String prqCntCodigo) {
        this.prqCntCodigo = prqCntCodigo;
    }

    public String getPrqCntPrvCodigo() {
        return prqCntPrvCodigo;
    }

    public void setPrqCntPrvCodigo(String prqCntPrvCodigo) {
        this.prqCntPrvCodigo = prqCntPrvCodigo;
    }

    public String getPrqCodigo() {
        return prqCodigo;
    }

    public void setPrqCodigo(String prqCodigo) {
        this.prqCodigo = prqCodigo;
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

    public String getOcpCodigo() {
        return ocpCodigo;
    }

    public void setOcpCodigo(String ocpCodigo) {
        this.ocpCodigo = ocpCodigo;
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

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
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

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
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

    public String getPrqCntPrvCodigoNcm() {
        return prqCntPrvCodigoNcm;
    }

    public void setPrqCntPrvCodigoNcm(String prqCntPrvCodigoNcm) {
        this.prqCntPrvCodigoNcm = prqCntPrvCodigoNcm;
    }

    public String getPrqCntCodigoNcm() {
        return prqCntCodigoNcm;
    }

    public void setPrqCntCodigoNcm(String prqCntCodigoNcm) {
        this.prqCntCodigoNcm = prqCntCodigoNcm;
    }

    public String getPrqCodigoNcm() {
        return prqCodigoNcm;
    }

    public void setPrqCodigoNcm(String prqCodigoNcm) {
        this.prqCodigoNcm = prqCodigoNcm;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
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
        return "ec.mil.he1.pom_01_domain.Pacientes[ numeroHc=" + numeroHc + " ]";
    }
    
}
