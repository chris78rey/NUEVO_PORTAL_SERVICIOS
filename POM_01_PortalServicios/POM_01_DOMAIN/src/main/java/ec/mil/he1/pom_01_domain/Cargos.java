/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CARGOS")
@NamedQueries({
    @NamedQuery(name = "Cargos.findAll", query = "SELECT c FROM Cargos c")})
public class Cargos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CargosPK cargosPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COSTO")
    private BigDecimal costo;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "COSTO_MODIFICABLE")
    private Character costoModificable;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "EQUIPO_ESPECIAL")
    private Character equipoEspecial;
    @Column(name = "AGRUPADOR_CONTABLE")
    private String agrupadorContable;
    @Column(name = "AGRCNT_CODIGO")
    private String agrcntCodigo;
    @Column(name = "AGRCNT_TIPO")
    private String agrcntTipo;
    @Column(name = "TIEMPO")
    private Character tiempo;
    @Column(name = "FACTOR")
    private BigDecimal factor;
    @Column(name = "RANGO_MINIMO")
    private BigDecimal rangoMinimo;
    @Column(name = "RANGO_MAXIMO")
    private BigDecimal rangoMaximo;
    @Column(name = "OPERADOR")
    private String operador;
    @Column(name = "CANTIDAD_MINIMA")
    private BigDecimal cantidadMinima;
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Column(name = "TIPO_HONORARIO")
    private String tipoHonorario;
    @Column(name = "MAXIMO_DESCUENTO")
    private BigDecimal maximoDescuento;
    @Column(name = "NOMBRE_IESS")
    private String nombreIess;
    @Column(name = "CODIGO_IESS")
    private String codigoIess;
    @Column(name = "GOBIERNO")
    private String gobierno;
    @Column(name = "ANESTESIA_IESS")
    private String anestesiaIess;
    @Column(name = "IESS")
    private String iess;

    public Cargos() {
    }

    public Cargos(CargosPK cargosPK) {
        this.cargosPK = cargosPK;
    }

    public Cargos(Character tipo, String codigo) {
        this.cargosPK = new CargosPK(tipo, codigo);
    }

    public CargosPK getCargosPK() {
        return cargosPK;
    }

    public void setCargosPK(CargosPK cargosPK) {
        this.cargosPK = cargosPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Character getCostoModificable() {
        return costoModificable;
    }

    public void setCostoModificable(Character costoModificable) {
        this.costoModificable = costoModificable;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public Character getEquipoEspecial() {
        return equipoEspecial;
    }

    public void setEquipoEspecial(Character equipoEspecial) {
        this.equipoEspecial = equipoEspecial;
    }

    public String getAgrupadorContable() {
        return agrupadorContable;
    }

    public void setAgrupadorContable(String agrupadorContable) {
        this.agrupadorContable = agrupadorContable;
    }

    public String getAgrcntCodigo() {
        return agrcntCodigo;
    }

    public void setAgrcntCodigo(String agrcntCodigo) {
        this.agrcntCodigo = agrcntCodigo;
    }

    public String getAgrcntTipo() {
        return agrcntTipo;
    }

    public void setAgrcntTipo(String agrcntTipo) {
        this.agrcntTipo = agrcntTipo;
    }

    public Character getTiempo() {
        return tiempo;
    }

    public void setTiempo(Character tiempo) {
        this.tiempo = tiempo;
    }

    public BigDecimal getFactor() {
        return factor;
    }

    public void setFactor(BigDecimal factor) {
        this.factor = factor;
    }

    public BigDecimal getRangoMinimo() {
        return rangoMinimo;
    }

    public void setRangoMinimo(BigDecimal rangoMinimo) {
        this.rangoMinimo = rangoMinimo;
    }

    public BigDecimal getRangoMaximo() {
        return rangoMaximo;
    }

    public void setRangoMaximo(BigDecimal rangoMaximo) {
        this.rangoMaximo = rangoMaximo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public BigDecimal getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(BigDecimal cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getTipoHonorario() {
        return tipoHonorario;
    }

    public void setTipoHonorario(String tipoHonorario) {
        this.tipoHonorario = tipoHonorario;
    }

    public BigDecimal getMaximoDescuento() {
        return maximoDescuento;
    }

    public void setMaximoDescuento(BigDecimal maximoDescuento) {
        this.maximoDescuento = maximoDescuento;
    }

    public String getNombreIess() {
        return nombreIess;
    }

    public void setNombreIess(String nombreIess) {
        this.nombreIess = nombreIess;
    }

    public String getCodigoIess() {
        return codigoIess;
    }

    public void setCodigoIess(String codigoIess) {
        this.codigoIess = codigoIess;
    }

    public String getGobierno() {
        return gobierno;
    }

    public void setGobierno(String gobierno) {
        this.gobierno = gobierno;
    }

    public String getAnestesiaIess() {
        return anestesiaIess;
    }

    public void setAnestesiaIess(String anestesiaIess) {
        this.anestesiaIess = anestesiaIess;
    }

    public String getIess() {
        return iess;
    }

    public void setIess(String iess) {
        this.iess = iess;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargosPK != null ? cargosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cargos)) {
            return false;
        }
        Cargos other = (Cargos) object;
        if ((this.cargosPK == null && other.cargosPK != null) || (this.cargosPK != null && !this.cargosPK.equals(other.cargosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Cargos[ cargosPK=" + cargosPK + " ]";
    }
    
}
