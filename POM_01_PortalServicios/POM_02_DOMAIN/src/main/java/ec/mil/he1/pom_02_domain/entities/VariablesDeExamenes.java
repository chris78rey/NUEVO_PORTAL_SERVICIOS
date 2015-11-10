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
@Table(name = "VARIABLES_DE_EXAMENES")
@NamedQueries({
    @NamedQuery(name = "VariablesDeExamenes.findAll", query = "SELECT v FROM VariablesDeExamenes v")})
public class VariablesDeExamenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "CARGAR_A_FACTURA")
    private Character cargarAFactura;
    @Column(name = "ESTADO_DE_ACTIVIDAD")
    private String estadoDeActividad;
    @Column(name = "FECHA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "RESULTADO")
    private Character resultado;
    @Column(name = "DEN_ID")
    private BigInteger denId;
    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "FORMA_INVOCADA")
    private String formaInvocada;
    @Column(name = "NECESIDAD_DE_VALORACION")
    private String necesidadDeValoracion;
    @Column(name = "NOMBRE_ABREVIADO")
    private String nombreAbreviado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "OPERACION")
    private String operacion;
    @Column(name = "ORDEN_DE_IMPRESION")
    private Short ordenDeImpresion;
    @Column(name = "ORDEN_DE_PRESENTACION")
    private Short ordenDePresentacion;
    @Column(name = "PRIORIDAD")
    private Short prioridad;
    @Column(name = "TIEMPO_ESTIMADO")
    private String tiempoEstimado;
    @Column(name = "TUBO_REQUERIDO")
    private String tuboRequerido;
    @Column(name = "UNIDAD")
    private String unidad;
    @Column(name = "GRAFICAR")
    private Character graficar;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_MAXIMO")
    private BigDecimal valorMaximo;
    @Column(name = "VALOR_MINIMO")
    private BigDecimal valorMinimo;
    @Column(name = "TOXICIDAD")
    private String toxicidad;
    @Column(name = "HOJA_TRABAJO")
    private Short hojaTrabajo;
    @Column(name = "RANGO_TEXTUAL")
    private String rangoTextual;
    @ManyToMany(mappedBy = "variablesDeExamenesList", fetch = FetchType.LAZY)
    private List<ProcedimientosHospitalarios> procedimientosHospitalariosList;
    @ManyToMany(mappedBy = "variablesDeExamenesList", fetch = FetchType.LAZY)
    private List<Perfiles> perfilesList;
    @ManyToMany(mappedBy = "variablesDeExamenesList", fetch = FetchType.LAZY)
    private List<Plantillas> plantillasList;
    @ManyToMany(mappedBy = "variablesDeExamenesList", fetch = FetchType.LAZY)
    private List<Complementos> complementosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "variablesDeExamenes", fetch = FetchType.LAZY)
    private List<DetallesDeExamenes> detallesDeExamenesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "variablesDeExamenes", fetch = FetchType.LAZY)
    private List<RangosDeNormalidad> rangosDeNormalidadList;
    @JoinColumns({
        @JoinColumn(name = "CRG_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "CRG_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Cargos cargos;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "GRPEST_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private GruposEstadisticos gruposEstadisticos;
    @JoinColumn(name = "TPODTO_SECUENCIAL", referencedColumnName = "SECUENCIAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiposDeDatos tiposDeDatos;
    @JoinColumn(name = "TPOEXM_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiposDeExamenes tiposDeExamenes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "variablesDeExamenes", fetch = FetchType.LAZY)
    private List<BiopsiasDetalles> biopsiasDetallesList;

    public VariablesDeExamenes() {
    }

    public VariablesDeExamenes(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Character getCargarAFactura() {
        return cargarAFactura;
    }

    public void setCargarAFactura(Character cargarAFactura) {
        this.cargarAFactura = cargarAFactura;
    }

    public String getEstadoDeActividad() {
        return estadoDeActividad;
    }

    public void setEstadoDeActividad(String estadoDeActividad) {
        this.estadoDeActividad = estadoDeActividad;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getResultado() {
        return resultado;
    }

    public void setResultado(Character resultado) {
        this.resultado = resultado;
    }

    public BigInteger getDenId() {
        return denId;
    }

    public void setDenId(BigInteger denId) {
        this.denId = denId;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getFormaInvocada() {
        return formaInvocada;
    }

    public void setFormaInvocada(String formaInvocada) {
        this.formaInvocada = formaInvocada;
    }

    public String getNecesidadDeValoracion() {
        return necesidadDeValoracion;
    }

    public void setNecesidadDeValoracion(String necesidadDeValoracion) {
        this.necesidadDeValoracion = necesidadDeValoracion;
    }

    public String getNombreAbreviado() {
        return nombreAbreviado;
    }

    public void setNombreAbreviado(String nombreAbreviado) {
        this.nombreAbreviado = nombreAbreviado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Short getOrdenDeImpresion() {
        return ordenDeImpresion;
    }

    public void setOrdenDeImpresion(Short ordenDeImpresion) {
        this.ordenDeImpresion = ordenDeImpresion;
    }

    public Short getOrdenDePresentacion() {
        return ordenDePresentacion;
    }

    public void setOrdenDePresentacion(Short ordenDePresentacion) {
        this.ordenDePresentacion = ordenDePresentacion;
    }

    public Short getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Short prioridad) {
        this.prioridad = prioridad;
    }

    public String getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getTuboRequerido() {
        return tuboRequerido;
    }

    public void setTuboRequerido(String tuboRequerido) {
        this.tuboRequerido = tuboRequerido;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Character getGraficar() {
        return graficar;
    }

    public void setGraficar(Character graficar) {
        this.graficar = graficar;
    }

    public BigDecimal getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(BigDecimal valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public BigDecimal getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(BigDecimal valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public String getToxicidad() {
        return toxicidad;
    }

    public void setToxicidad(String toxicidad) {
        this.toxicidad = toxicidad;
    }

    public Short getHojaTrabajo() {
        return hojaTrabajo;
    }

    public void setHojaTrabajo(Short hojaTrabajo) {
        this.hojaTrabajo = hojaTrabajo;
    }

    public String getRangoTextual() {
        return rangoTextual;
    }

    public void setRangoTextual(String rangoTextual) {
        this.rangoTextual = rangoTextual;
    }

    public List<ProcedimientosHospitalarios> getProcedimientosHospitalariosList() {
        return procedimientosHospitalariosList;
    }

    public void setProcedimientosHospitalariosList(List<ProcedimientosHospitalarios> procedimientosHospitalariosList) {
        this.procedimientosHospitalariosList = procedimientosHospitalariosList;
    }

    public List<Perfiles> getPerfilesList() {
        return perfilesList;
    }

    public void setPerfilesList(List<Perfiles> perfilesList) {
        this.perfilesList = perfilesList;
    }

    public List<Plantillas> getPlantillasList() {
        return plantillasList;
    }

    public void setPlantillasList(List<Plantillas> plantillasList) {
        this.plantillasList = plantillasList;
    }

    public List<Complementos> getComplementosList() {
        return complementosList;
    }

    public void setComplementosList(List<Complementos> complementosList) {
        this.complementosList = complementosList;
    }

    public List<DetallesDeExamenes> getDetallesDeExamenesList() {
        return detallesDeExamenesList;
    }

    public void setDetallesDeExamenesList(List<DetallesDeExamenes> detallesDeExamenesList) {
        this.detallesDeExamenesList = detallesDeExamenesList;
    }

    public List<RangosDeNormalidad> getRangosDeNormalidadList() {
        return rangosDeNormalidadList;
    }

    public void setRangosDeNormalidadList(List<RangosDeNormalidad> rangosDeNormalidadList) {
        this.rangosDeNormalidadList = rangosDeNormalidadList;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public GruposEstadisticos getGruposEstadisticos() {
        return gruposEstadisticos;
    }

    public void setGruposEstadisticos(GruposEstadisticos gruposEstadisticos) {
        this.gruposEstadisticos = gruposEstadisticos;
    }

    public TiposDeDatos getTiposDeDatos() {
        return tiposDeDatos;
    }

    public void setTiposDeDatos(TiposDeDatos tiposDeDatos) {
        this.tiposDeDatos = tiposDeDatos;
    }

    public TiposDeExamenes getTiposDeExamenes() {
        return tiposDeExamenes;
    }

    public void setTiposDeExamenes(TiposDeExamenes tiposDeExamenes) {
        this.tiposDeExamenes = tiposDeExamenes;
    }

    public List<BiopsiasDetalles> getBiopsiasDetallesList() {
        return biopsiasDetallesList;
    }

    public void setBiopsiasDetallesList(List<BiopsiasDetalles> biopsiasDetallesList) {
        this.biopsiasDetallesList = biopsiasDetallesList;
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
        if (!(object instanceof VariablesDeExamenes)) {
            return false;
        }
        VariablesDeExamenes other = (VariablesDeExamenes) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.VariablesDeExamenes[ codigo=" + codigo + " ]";
    }
    
}
