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
@Table(name = "VARIABLES_DE_EXAMENES")
@NamedQueries({
    @NamedQuery(name = "VariablesDeExamenes.findAll", query = "SELECT v FROM VariablesDeExamenes v")})
public class VariablesDeExamenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "TPODTO_SECUENCIAL")
    private Short tpodtoSecuencial;
    @Column(name = "TPOEXM_ID")
    private String tpoexmId;
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
    @Column(name = "GRPEST_CODIGO")
    private String grpestCodigo;
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

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
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

    public Short getTpodtoSecuencial() {
        return tpodtoSecuencial;
    }

    public void setTpodtoSecuencial(Short tpodtoSecuencial) {
        this.tpodtoSecuencial = tpodtoSecuencial;
    }

    public String getTpoexmId() {
        return tpoexmId;
    }

    public void setTpoexmId(String tpoexmId) {
        this.tpoexmId = tpoexmId;
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

    public String getGrpestCodigo() {
        return grpestCodigo;
    }

    public void setGrpestCodigo(String grpestCodigo) {
        this.grpestCodigo = grpestCodigo;
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
        return "ec.mil.he1.pom_01_domain.VariablesDeExamenes[ codigo=" + codigo + " ]";
    }
    
}
