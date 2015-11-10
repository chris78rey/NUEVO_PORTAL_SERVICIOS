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
@Table(name = "ACTIVOS_FIJOS_GENERALES")
@NamedQueries({
    @NamedQuery(name = "ActivosFijosGenerales.findAll", query = "SELECT a FROM ActivosFijosGenerales a")})
public class ActivosFijosGenerales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ActivosFijosGeneralesPK activosFijosGeneralesPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "CANTIDAD_INICIAL")
    private Short cantidadInicial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_INICIAL")
    private BigDecimal valorInicial;
    @Column(name = "VALOR_ACTUAL")
    private BigDecimal valorActual;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "VIDA_UTIL")
    private Short vidaUtil;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "PORCENTAJE_DEPRECIACION")
    private BigDecimal porcentajeDepreciacion;
    @Column(name = "PORCENTAJE_REVALORIZACION")
    private BigDecimal porcentajeRevalorizacion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "CODIGO_PROPIO")
    private String codigoPropio;
    @Column(name = "VALOR_REVALORIZADO")
    private BigDecimal valorRevalorizado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activosFijosGenerales", fetch = FetchType.LAZY)
    private List<ActivosFijosEspecificos> activosFijosEspecificosList;
    @JoinColumns({
        @JoinColumn(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO", referencedColumnName = "GRPACTFJO_EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SBGACTFJO_GRPACTFJO_CODIGO", referencedColumnName = "GRPACTFJO_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SBGACTFJO_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SubgruposActivosFijos subgruposActivosFijos;
    @OneToMany(mappedBy = "activosFijosGenerales", fetch = FetchType.LAZY)
    private List<DetallesIngresosActivos> detallesIngresosActivosList;

    public ActivosFijosGenerales() {
    }

    public ActivosFijosGenerales(ActivosFijosGeneralesPK activosFijosGeneralesPK) {
        this.activosFijosGeneralesPK = activosFijosGeneralesPK;
    }

    public ActivosFijosGenerales(String sbgactfjoGrpactfjoEmpCodigo, short sbgactfjoGrpactfjoCodigo, short sbgactfjoCodigo, short codigo) {
        this.activosFijosGeneralesPK = new ActivosFijosGeneralesPK(sbgactfjoGrpactfjoEmpCodigo, sbgactfjoGrpactfjoCodigo, sbgactfjoCodigo, codigo);
    }

    public ActivosFijosGeneralesPK getActivosFijosGeneralesPK() {
        return activosFijosGeneralesPK;
    }

    public void setActivosFijosGeneralesPK(ActivosFijosGeneralesPK activosFijosGeneralesPK) {
        this.activosFijosGeneralesPK = activosFijosGeneralesPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Short getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(Short cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Short getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(Short vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
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

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCodigoPropio() {
        return codigoPropio;
    }

    public void setCodigoPropio(String codigoPropio) {
        this.codigoPropio = codigoPropio;
    }

    public BigDecimal getValorRevalorizado() {
        return valorRevalorizado;
    }

    public void setValorRevalorizado(BigDecimal valorRevalorizado) {
        this.valorRevalorizado = valorRevalorizado;
    }

    public List<ActivosFijosEspecificos> getActivosFijosEspecificosList() {
        return activosFijosEspecificosList;
    }

    public void setActivosFijosEspecificosList(List<ActivosFijosEspecificos> activosFijosEspecificosList) {
        this.activosFijosEspecificosList = activosFijosEspecificosList;
    }

    public SubgruposActivosFijos getSubgruposActivosFijos() {
        return subgruposActivosFijos;
    }

    public void setSubgruposActivosFijos(SubgruposActivosFijos subgruposActivosFijos) {
        this.subgruposActivosFijos = subgruposActivosFijos;
    }

    public List<DetallesIngresosActivos> getDetallesIngresosActivosList() {
        return detallesIngresosActivosList;
    }

    public void setDetallesIngresosActivosList(List<DetallesIngresosActivos> detallesIngresosActivosList) {
        this.detallesIngresosActivosList = detallesIngresosActivosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activosFijosGeneralesPK != null ? activosFijosGeneralesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActivosFijosGenerales)) {
            return false;
        }
        ActivosFijosGenerales other = (ActivosFijosGenerales) object;
        if ((this.activosFijosGeneralesPK == null && other.activosFijosGeneralesPK != null) || (this.activosFijosGeneralesPK != null && !this.activosFijosGeneralesPK.equals(other.activosFijosGeneralesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ActivosFijosGenerales[ activosFijosGeneralesPK=" + activosFijosGeneralesPK + " ]";
    }
    
}
