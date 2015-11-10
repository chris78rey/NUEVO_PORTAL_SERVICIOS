/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "ACTIVOS_FIJOS_ESPECIFICOS")
@NamedQueries({
    @NamedQuery(name = "ActivosFijosEspecificos.findAll", query = "SELECT a FROM ActivosFijosEspecificos a")})
public class ActivosFijosEspecificos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ActivosFijosEspecificosPK activosFijosEspecificosPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "INGACTFJO_EMP_CODIGO")
    private String ingactfjoEmpCodigo;
    @Column(name = "INGACTFJO_NUMERO")
    private Integer ingactfjoNumero;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "FECHA_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;
    @Column(name = "TIPO")
    private String tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_INICIAL")
    private BigDecimal valorInicial;
    @Column(name = "VALOR_ACTUAL")
    private BigDecimal valorActual;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "NUMERO_SERIE")
    private String numeroSerie;
    @Column(name = "VIDA_UTIL")
    private Short vidaUtil;
    @Column(name = "PORCENTAJE_DEPRECIACION")
    private BigDecimal porcentajeDepreciacion;
    @Column(name = "PORCENTAJE_REVALORIZACION")
    private BigDecimal porcentajeRevalorizacion;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "ESTADO_DE_ASIGNACION")
    private Character estadoDeAsignacion;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "CODIGO_PROPIO")
    private String codigoPropio;
    @Column(name = "NUMERO_ASIGNACION")
    private Integer numeroAsignacion;
    @Column(name = "VALOR_REVALORIZADO")
    private BigDecimal valorRevalorizado;
    @JoinColumns({
        @JoinColumn(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO", referencedColumnName = "SBGACTFJO_GRPACTFJO_EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ACTFSBGACTFJO_GRPACTFJO_CODIGO", referencedColumnName = "SBGACTFJO_GRPACTFJO_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ACTFJOGNR_SBGACTFJO_CODIGO", referencedColumnName = "SBGACTFJO_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ACTFJOGNR_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ActivosFijosGenerales activosFijosGenerales;
    @JoinColumns({
        @JoinColumn(name = "PRVACTFJO_EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
        @JoinColumn(name = "PRVACTFJO_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ProveedoresActivosFijos proveedoresActivosFijos;
    @OneToMany(mappedBy = "activosFijosEspecificos", fetch = FetchType.LAZY)
    private List<DetallesEgresosActivos> detallesEgresosActivosList;
    @OneToMany(mappedBy = "activosFijosEspecificos", fetch = FetchType.LAZY)
    private List<DetallesAsignacionesReingres> detallesAsignacionesReingresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activosFijosEspecificos", fetch = FetchType.LAZY)
    private List<PartesActivo> partesActivoList;
    @OneToMany(mappedBy = "activosFijosEspecificos", fetch = FetchType.LAZY)
    private List<DetallesRegulacionesActivos> detallesRegulacionesActivosList;
    @OneToMany(mappedBy = "activosFijosEspecificos", fetch = FetchType.LAZY)
    private List<DetallesDepreciaciones> detallesDepreciacionesList;

    public ActivosFijosEspecificos() {
    }

    public ActivosFijosEspecificos(ActivosFijosEspecificosPK activosFijosEspecificosPK) {
        this.activosFijosEspecificosPK = activosFijosEspecificosPK;
    }

    public ActivosFijosEspecificos(String sbgactfjoGrpactfjoEmpCodigo, short actfsbgactfjoGrpactfjoCodigo, short actfjognrSbgactfjoCodigo, short actfjognrCodigo, short codigo) {
        this.activosFijosEspecificosPK = new ActivosFijosEspecificosPK(sbgactfjoGrpactfjoEmpCodigo, actfsbgactfjoGrpactfjoCodigo, actfjognrSbgactfjoCodigo, actfjognrCodigo, codigo);
    }

    public ActivosFijosEspecificosPK getActivosFijosEspecificosPK() {
        return activosFijosEspecificosPK;
    }

    public void setActivosFijosEspecificosPK(ActivosFijosEspecificosPK activosFijosEspecificosPK) {
        this.activosFijosEspecificosPK = activosFijosEspecificosPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIngactfjoEmpCodigo() {
        return ingactfjoEmpCodigo;
    }

    public void setIngactfjoEmpCodigo(String ingactfjoEmpCodigo) {
        this.ingactfjoEmpCodigo = ingactfjoEmpCodigo;
    }

    public Integer getIngactfjoNumero() {
        return ingactfjoNumero;
    }

    public void setIngactfjoNumero(Integer ingactfjoNumero) {
        this.ingactfjoNumero = ingactfjoNumero;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(BigDecimal valorInicial) {
        this.valorInicial = valorInicial;
    }

    public BigDecimal getValorActual() {
        return valorActual;
    }

    public void setValorActual(BigDecimal valorActual) {
        this.valorActual = valorActual;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Short getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(Short vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public BigDecimal getPorcentajeDepreciacion() {
        return porcentajeDepreciacion;
    }

    public void setPorcentajeDepreciacion(BigDecimal porcentajeDepreciacion) {
        this.porcentajeDepreciacion = porcentajeDepreciacion;
    }

    public BigDecimal getPorcentajeRevalorizacion() {
        return porcentajeRevalorizacion;
    }

    public void setPorcentajeRevalorizacion(BigDecimal porcentajeRevalorizacion) {
        this.porcentajeRevalorizacion = porcentajeRevalorizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Character getEstadoDeAsignacion() {
        return estadoDeAsignacion;
    }

    public void setEstadoDeAsignacion(Character estadoDeAsignacion) {
        this.estadoDeAsignacion = estadoDeAsignacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
    }

    public String getCodigoPropio() {
        return codigoPropio;
    }

    public void setCodigoPropio(String codigoPropio) {
        this.codigoPropio = codigoPropio;
    }

    public Integer getNumeroAsignacion() {
        return numeroAsignacion;
    }

    public void setNumeroAsignacion(Integer numeroAsignacion) {
        this.numeroAsignacion = numeroAsignacion;
    }

    public BigDecimal getValorRevalorizado() {
        return valorRevalorizado;
    }

    public void setValorRevalorizado(BigDecimal valorRevalorizado) {
        this.valorRevalorizado = valorRevalorizado;
    }

    public ActivosFijosGenerales getActivosFijosGenerales() {
        return activosFijosGenerales;
    }

    public void setActivosFijosGenerales(ActivosFijosGenerales activosFijosGenerales) {
        this.activosFijosGenerales = activosFijosGenerales;
    }

    public ProveedoresActivosFijos getProveedoresActivosFijos() {
        return proveedoresActivosFijos;
    }

    public void setProveedoresActivosFijos(ProveedoresActivosFijos proveedoresActivosFijos) {
        this.proveedoresActivosFijos = proveedoresActivosFijos;
    }

    public List<DetallesEgresosActivos> getDetallesEgresosActivosList() {
        return detallesEgresosActivosList;
    }

    public void setDetallesEgresosActivosList(List<DetallesEgresosActivos> detallesEgresosActivosList) {
        this.detallesEgresosActivosList = detallesEgresosActivosList;
    }

    public List<DetallesAsignacionesReingres> getDetallesAsignacionesReingresList() {
        return detallesAsignacionesReingresList;
    }

    public void setDetallesAsignacionesReingresList(List<DetallesAsignacionesReingres> detallesAsignacionesReingresList) {
        this.detallesAsignacionesReingresList = detallesAsignacionesReingresList;
    }

    public List<PartesActivo> getPartesActivoList() {
        return partesActivoList;
    }

    public void setPartesActivoList(List<PartesActivo> partesActivoList) {
        this.partesActivoList = partesActivoList;
    }

    public List<DetallesRegulacionesActivos> getDetallesRegulacionesActivosList() {
        return detallesRegulacionesActivosList;
    }

    public void setDetallesRegulacionesActivosList(List<DetallesRegulacionesActivos> detallesRegulacionesActivosList) {
        this.detallesRegulacionesActivosList = detallesRegulacionesActivosList;
    }

    public List<DetallesDepreciaciones> getDetallesDepreciacionesList() {
        return detallesDepreciacionesList;
    }

    public void setDetallesDepreciacionesList(List<DetallesDepreciaciones> detallesDepreciacionesList) {
        this.detallesDepreciacionesList = detallesDepreciacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activosFijosEspecificosPK != null ? activosFijosEspecificosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivosFijosEspecificos)) {
            return false;
        }
        ActivosFijosEspecificos other = (ActivosFijosEspecificos) object;
        if ((this.activosFijosEspecificosPK == null && other.activosFijosEspecificosPK != null) || (this.activosFijosEspecificosPK != null && !this.activosFijosEspecificosPK.equals(other.activosFijosEspecificosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ActivosFijosEspecificos[ activosFijosEspecificosPK=" + activosFijosEspecificosPK + " ]";
    }
    
}
