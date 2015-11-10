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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "CUENTAS")
@NamedQueries({
    @NamedQuery(name = "Cuentas.findAll", query = "SELECT c FROM Cuentas c")})
public class Cuentas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CuentasPK cuentasPK;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "MONEDA_DE_TRABAJO")
    private String monedaDeTrabajo;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "PORCENTAJE_PROMOCION")
    private BigDecimal porcentajePromocion;
    @Column(name = "DESCUENTO_OTORGADO")
    private BigDecimal descuentoOtorgado;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "CREADO_POR")
    private String creadoPor;
    @Column(name = "PRM_CODIGO")
    private String prmCodigo;
    @Column(name = "VALORE")
    private BigDecimal valore;
    @Column(name = "IVAE")
    private BigDecimal ivae;
    @Column(name = "ACTUALIZADO_POR")
    private String actualizadoPor;
    @Column(name = "FECHA_ACTUALIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "IVA_EXCENTO")
    private Character ivaExcento;
    @Column(name = "PLA_NUMERO_PLANILLA")
    private Integer plaNumeroPlanilla;
    @Column(name = "ID_CARGO_IESS")
    private Integer idCargoIess;
    @Column(name = "UVR")
    private BigInteger uvr;
    @Column(name = "PRC")
    private BigInteger prc;
    @Column(name = "PLA_PLANILLA_ANTERIOR")
    private Integer plaPlanillaAnterior;
    @Column(name = "RECATEGORIZADA")
    private Character recategorizada;
    @Column(name = "TIPO_RUBRO")
    private String tipoRubro;
    @Column(name = "ACELERADOR")
    private Character acelerador;
    @Column(name = "NUMERO_PERMANENCIA")
    private Long numeroPermanencia;
    @Column(name = "FECHA_EJECUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEjecucion;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "CONFIRMADO")
    private Character confirmado;
    @Column(name = "AUDITADO")
    private Character auditado;
    @Column(name = "AUDITADO_POR")
    private String auditadoPor;
    @Column(name = "ENVIADO_PLANO")
    private String enviadoPlano;
    @Column(name = "OBS_ANULACION")
    private String obsAnulacion;
    @JoinColumn(name = "CBCINS_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CabeceraInsumos cabeceraInsumos;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO_PERTENECIENTE_A", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO_PERTENECIENTE_A", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos1;
    @JoinColumn(name = "PCN_NUMERO_HC_MIGRADO", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuentas", fetch = FetchType.LAZY)
    private List<CuentasPaquetes> cuentasPaquetesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuentas", fetch = FetchType.LAZY)
    private List<CuentasExtras> cuentasExtrasList;

    public Cuentas() {
    }

    public Cuentas(CuentasPK cuentasPK) {
        this.cuentasPK = cuentasPK;
    }

    public Cuentas(String documento, long numero, int detalle, Character seguro) {
        this.cuentasPK = new CuentasPK(documento, numero, detalle, seguro);
    }

    public CuentasPK getCuentasPK() {
        return cuentasPK;
    }

    public void setCuentasPK(CuentasPK cuentasPK) {
        this.cuentasPK = cuentasPK;
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

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getMonedaDeTrabajo() {
        return monedaDeTrabajo;
    }

    public void setMonedaDeTrabajo(String monedaDeTrabajo) {
        this.monedaDeTrabajo = monedaDeTrabajo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public BigDecimal getPorcentajePromocion() {
        return porcentajePromocion;
    }

    public void setPorcentajePromocion(BigDecimal porcentajePromocion) {
        this.porcentajePromocion = porcentajePromocion;
    }

    public BigDecimal getDescuentoOtorgado() {
        return descuentoOtorgado;
    }

    public void setDescuentoOtorgado(BigDecimal descuentoOtorgado) {
        this.descuentoOtorgado = descuentoOtorgado;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public String getPrmCodigo() {
        return prmCodigo;
    }

    public void setPrmCodigo(String prmCodigo) {
        this.prmCodigo = prmCodigo;
    }

    public BigDecimal getValore() {
        return valore;
    }

    public void setValore(BigDecimal valore) {
        this.valore = valore;
    }

    public BigDecimal getIvae() {
        return ivae;
    }

    public void setIvae(BigDecimal ivae) {
        this.ivae = ivae;
    }

    public String getActualizadoPor() {
        return actualizadoPor;
    }

    public void setActualizadoPor(String actualizadoPor) {
        this.actualizadoPor = actualizadoPor;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Character getIvaExcento() {
        return ivaExcento;
    }

    public void setIvaExcento(Character ivaExcento) {
        this.ivaExcento = ivaExcento;
    }

    public Integer getPlaNumeroPlanilla() {
        return plaNumeroPlanilla;
    }

    public void setPlaNumeroPlanilla(Integer plaNumeroPlanilla) {
        this.plaNumeroPlanilla = plaNumeroPlanilla;
    }

    public Integer getIdCargoIess() {
        return idCargoIess;
    }

    public void setIdCargoIess(Integer idCargoIess) {
        this.idCargoIess = idCargoIess;
    }

    public BigInteger getUvr() {
        return uvr;
    }

    public void setUvr(BigInteger uvr) {
        this.uvr = uvr;
    }

    public BigInteger getPrc() {
        return prc;
    }

    public void setPrc(BigInteger prc) {
        this.prc = prc;
    }

    public Integer getPlaPlanillaAnterior() {
        return plaPlanillaAnterior;
    }

    public void setPlaPlanillaAnterior(Integer plaPlanillaAnterior) {
        this.plaPlanillaAnterior = plaPlanillaAnterior;
    }

    public Character getRecategorizada() {
        return recategorizada;
    }

    public void setRecategorizada(Character recategorizada) {
        this.recategorizada = recategorizada;
    }

    public String getTipoRubro() {
        return tipoRubro;
    }

    public void setTipoRubro(String tipoRubro) {
        this.tipoRubro = tipoRubro;
    }

    public Character getAcelerador() {
        return acelerador;
    }

    public void setAcelerador(Character acelerador) {
        this.acelerador = acelerador;
    }

    public Long getNumeroPermanencia() {
        return numeroPermanencia;
    }

    public void setNumeroPermanencia(Long numeroPermanencia) {
        this.numeroPermanencia = numeroPermanencia;
    }

    public Date getFechaEjecucion() {
        return fechaEjecucion;
    }

    public void setFechaEjecucion(Date fechaEjecucion) {
        this.fechaEjecucion = fechaEjecucion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Character getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Character confirmado) {
        this.confirmado = confirmado;
    }

    public Character getAuditado() {
        return auditado;
    }

    public void setAuditado(Character auditado) {
        this.auditado = auditado;
    }

    public String getAuditadoPor() {
        return auditadoPor;
    }

    public void setAuditadoPor(String auditadoPor) {
        this.auditadoPor = auditadoPor;
    }

    public String getEnviadoPlano() {
        return enviadoPlano;
    }

    public void setEnviadoPlano(String enviadoPlano) {
        this.enviadoPlano = enviadoPlano;
    }

    public String getObsAnulacion() {
        return obsAnulacion;
    }

    public void setObsAnulacion(String obsAnulacion) {
        this.obsAnulacion = obsAnulacion;
    }

    public CabeceraInsumos getCabeceraInsumos() {
        return cabeceraInsumos;
    }

    public void setCabeceraInsumos(CabeceraInsumos cabeceraInsumos) {
        this.cabeceraInsumos = cabeceraInsumos;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Departamentos getDepartamentos1() {
        return departamentos1;
    }

    public void setDepartamentos1(Departamentos departamentos1) {
        this.departamentos1 = departamentos1;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Pacientes getPacientes1() {
        return pacientes1;
    }

    public void setPacientes1(Pacientes pacientes1) {
        this.pacientes1 = pacientes1;
    }

    public List<CuentasPaquetes> getCuentasPaquetesList() {
        return cuentasPaquetesList;
    }

    public void setCuentasPaquetesList(List<CuentasPaquetes> cuentasPaquetesList) {
        this.cuentasPaquetesList = cuentasPaquetesList;
    }

    public List<CuentasExtras> getCuentasExtrasList() {
        return cuentasExtrasList;
    }

    public void setCuentasExtrasList(List<CuentasExtras> cuentasExtrasList) {
        this.cuentasExtrasList = cuentasExtrasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuentasPK != null ? cuentasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentas)) {
            return false;
        }
        Cuentas other = (Cuentas) object;
        if ((this.cuentasPK == null && other.cuentasPK != null) || (this.cuentasPK != null && !this.cuentasPK.equals(other.cuentasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Cuentas[ cuentasPK=" + cuentasPK + " ]";
    }
    
}
