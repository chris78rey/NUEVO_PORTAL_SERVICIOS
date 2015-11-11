/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "FICHAS_SOCIALES")
@NamedQueries({
    @NamedQuery(name = "FichasSociales.findAll", query = "SELECT f FROM FichasSociales f")})
public class FichasSociales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ORGANIZACION_DEL_HOGAR")
    private Character organizacionDelHogar;
    @Column(name = "ESTADO_HOGAR")
    private Character estadoHogar;
    @Column(name = "ABASTECIMIENTO_AGUA")
    private String abastecimientoAgua;
    @Column(name = "TENENCIA")
    private Character tenencia;
    @Column(name = "PAREDES")
    private Character paredes;
    @Column(name = "CARACTERISTICAS")
    private Character caracteristicas;
    @Column(name = "PISOS")
    private Character pisos;
    @Column(name = "TOTAL_CUARTOS")
    private Short totalCuartos;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "SERVICIO_ELECTRICO")
    private String servicioElectrico;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MAXIMO_MENSUAL")
    private BigDecimal maximoMensual;
    @Column(name = "TOTAL_INGRESOS")
    private Integer totalIngresos;
    @Column(name = "TOTAL_EGRESOS")
    private Integer totalEgresos;
    @Column(name = "DATOS_FAMILIARES")
    private String datosFamiliares;
    @Column(name = "FECHA_PREFACTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPrefactura;
    @Column(name = "DESCUENTO_PREFACTURA")
    private BigDecimal descuentoPrefactura;
    @Column(name = "EVALUACION")
    private String evaluacion;
    @Column(name = "TIPO")
    private Character tipo;

    public FichasSociales() {
    }

    public FichasSociales(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getOrganizacionDelHogar() {
        return organizacionDelHogar;
    }

    public void setOrganizacionDelHogar(Character organizacionDelHogar) {
        this.organizacionDelHogar = organizacionDelHogar;
    }

    public Character getEstadoHogar() {
        return estadoHogar;
    }

    public void setEstadoHogar(Character estadoHogar) {
        this.estadoHogar = estadoHogar;
    }

    public String getAbastecimientoAgua() {
        return abastecimientoAgua;
    }

    public void setAbastecimientoAgua(String abastecimientoAgua) {
        this.abastecimientoAgua = abastecimientoAgua;
    }

    public Character getTenencia() {
        return tenencia;
    }

    public void setTenencia(Character tenencia) {
        this.tenencia = tenencia;
    }

    public Character getParedes() {
        return paredes;
    }

    public void setParedes(Character paredes) {
        this.paredes = paredes;
    }

    public Character getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Character caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Character getPisos() {
        return pisos;
    }

    public void setPisos(Character pisos) {
        this.pisos = pisos;
    }

    public Short getTotalCuartos() {
        return totalCuartos;
    }

    public void setTotalCuartos(Short totalCuartos) {
        this.totalCuartos = totalCuartos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getServicioElectrico() {
        return servicioElectrico;
    }

    public void setServicioElectrico(String servicioElectrico) {
        this.servicioElectrico = servicioElectrico;
    }

    public BigDecimal getMaximoMensual() {
        return maximoMensual;
    }

    public void setMaximoMensual(BigDecimal maximoMensual) {
        this.maximoMensual = maximoMensual;
    }

    public Integer getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(Integer totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public Integer getTotalEgresos() {
        return totalEgresos;
    }

    public void setTotalEgresos(Integer totalEgresos) {
        this.totalEgresos = totalEgresos;
    }

    public String getDatosFamiliares() {
        return datosFamiliares;
    }

    public void setDatosFamiliares(String datosFamiliares) {
        this.datosFamiliares = datosFamiliares;
    }

    public Date getFechaPrefactura() {
        return fechaPrefactura;
    }

    public void setFechaPrefactura(Date fechaPrefactura) {
        this.fechaPrefactura = fechaPrefactura;
    }

    public BigDecimal getDescuentoPrefactura() {
        return descuentoPrefactura;
    }

    public void setDescuentoPrefactura(BigDecimal descuentoPrefactura) {
        this.descuentoPrefactura = descuentoPrefactura;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FichasSociales)) {
            return false;
        }
        FichasSociales other = (FichasSociales) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FichasSociales[ numero=" + numero + " ]";
    }
    
}
