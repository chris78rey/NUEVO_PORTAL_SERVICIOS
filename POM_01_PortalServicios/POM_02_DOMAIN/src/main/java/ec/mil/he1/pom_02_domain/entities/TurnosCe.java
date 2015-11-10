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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TURNOS_CE")
@NamedQueries({
    @NamedQuery(name = "TurnosCe.findAll", query = "SELECT t FROM TurnosCe t")})
public class TurnosCe implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO_ID")
    private BigDecimal numeroId;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "NUMERO")
    private Short numero;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "ORDEN")
    private Short orden;
    @Column(name = "FCT_CAJA")
    private String fctCaja;
    @Column(name = "FCT_NUMERO")
    private Integer fctNumero;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "MOTIVO_DESCUENTO")
    private String motivoDescuento;
    @Column(name = "CREADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creado;
    @Column(name = "FECHA_ATENCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAtencion;
    @Column(name = "FECHA_PAGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "COSTO")
    private BigDecimal costo;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "MORBILIDAD")
    private String morbilidad;
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Column(name = "HORA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicio;
    @Column(name = "HORA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFin;
    @Column(name = "PRM_ID")
    private Long prmId;
    @Column(name = "PCN_FUERZA")
    private String pcnFuerza;
    @Column(name = "PCN_GRADO")
    private String pcnGrado;
    @Column(name = "PCN_SITUACION")
    private String pcnSituacion;
    @Column(name = "CREADO_POR")
    private String creadoPor;
    @Column(name = "NOTA_ATENCION")
    private String notaAtencion;
    @Column(name = "CPGPCN_ID")
    private Long cpgpcnId;
    @Column(name = "SOBRECARGA")
    private Character sobrecarga;
    @Column(name = "TIPO_TURNO")
    private Character tipoTurno;
    @OneToMany(mappedBy = "turnosCe", fetch = FetchType.LAZY)
    private List<Consultas> consultasList;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PCNTMP_ID", referencedColumnName = "PCNTMP_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PacientesTemporales pacientesTemporales;
    @JoinColumn(name = "PRS_ATENDIDO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;

    public TurnosCe() {
    }

    public TurnosCe(BigDecimal numeroId) {
        this.numeroId = numeroId;
    }

    public BigDecimal getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(BigDecimal numeroId) {
        this.numeroId = numeroId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Short getNumero() {
        return numero;
    }

    public void setNumero(Short numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    public String getFctCaja() {
        return fctCaja;
    }

    public void setFctCaja(String fctCaja) {
        this.fctCaja = fctCaja;
    }

    public Integer getFctNumero() {
        return fctNumero;
    }

    public void setFctNumero(Integer fctNumero) {
        this.fctNumero = fctNumero;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public String getMorbilidad() {
        return morbilidad;
    }

    public void setMorbilidad(String morbilidad) {
        this.morbilidad = morbilidad;
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

    public Long getPrmId() {
        return prmId;
    }

    public void setPrmId(Long prmId) {
        this.prmId = prmId;
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

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public String getNotaAtencion() {
        return notaAtencion;
    }

    public void setNotaAtencion(String notaAtencion) {
        this.notaAtencion = notaAtencion;
    }

    public Long getCpgpcnId() {
        return cpgpcnId;
    }

    public void setCpgpcnId(Long cpgpcnId) {
        this.cpgpcnId = cpgpcnId;
    }

    public Character getSobrecarga() {
        return sobrecarga;
    }

    public void setSobrecarga(Character sobrecarga) {
        this.sobrecarga = sobrecarga;
    }

    public Character getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(Character tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public List<Consultas> getConsultasList() {
        return consultasList;
    }

    public void setConsultasList(List<Consultas> consultasList) {
        this.consultasList = consultasList;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroId != null ? numeroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurnosCe)) {
            return false;
        }
        TurnosCe other = (TurnosCe) object;
        if ((this.numeroId == null && other.numeroId != null) || (this.numeroId != null && !this.numeroId.equals(other.numeroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TurnosCe[ numeroId=" + numeroId + " ]";
    }
    
}
