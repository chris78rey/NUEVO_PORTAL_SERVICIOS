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
@Table(name = "DETALLES_DE_CIERRE")
@NamedQueries({
    @NamedQuery(name = "DetallesDeCierre.findAll", query = "SELECT d FROM DetallesDeCierre d")})
public class DetallesDeCierre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesDeCierrePK detallesDeCierrePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "STOCK_ANTERIOR")
    private BigDecimal stockAnterior;
    @Column(name = "COSTO_ANTERIOR")
    private BigDecimal costoAnterior;
    @Column(name = "COSTO_PROMEDIO_ANTERIOR")
    private BigDecimal costoPromedioAnterior;
    @Column(name = "CANTIDAD_INGRESADA")
    private BigDecimal cantidadIngresada;
    @Column(name = "COSTO_INGRESO")
    private BigDecimal costoIngreso;
    @Column(name = "CANTIDAD_EGRESADA")
    private BigDecimal cantidadEgresada;
    @Column(name = "COSTO_EGRESO")
    private BigDecimal costoEgreso;
    @Column(name = "STOCK_ACTUAL")
    private BigDecimal stockActual;
    @Column(name = "COSTO_ACTUAL")
    private BigDecimal costoActual;
    @Column(name = "COSTO_PROMEDIO_ACTUAL")
    private BigDecimal costoPromedioActual;
    @Column(name = "REGULADO")
    private String regulado;

    public DetallesDeCierre() {
    }

    public DetallesDeCierre(DetallesDeCierrePK detallesDeCierrePK) {
        this.detallesDeCierrePK = detallesDeCierrePK;
    }

    public DetallesDeCierre(short rgtcrrAnio, short rgtcrrMes, String rgtcrrLocal, Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo) {
        this.detallesDeCierrePK = new DetallesDeCierrePK(rgtcrrAnio, rgtcrrMes, rgtcrrLocal, itmTipo, itmSbsSccCodigo, itmSbsCodigo, itmCodigo);
    }

    public DetallesDeCierrePK getDetallesDeCierrePK() {
        return detallesDeCierrePK;
    }

    public void setDetallesDeCierrePK(DetallesDeCierrePK detallesDeCierrePK) {
        this.detallesDeCierrePK = detallesDeCierrePK;
    }

    public BigDecimal getStockAnterior() {
        return stockAnterior;
    }

    public void setStockAnterior(BigDecimal stockAnterior) {
        this.stockAnterior = stockAnterior;
    }

    public BigDecimal getCostoAnterior() {
        return costoAnterior;
    }

    public void setCostoAnterior(BigDecimal costoAnterior) {
        this.costoAnterior = costoAnterior;
    }

    public BigDecimal getCostoPromedioAnterior() {
        return costoPromedioAnterior;
    }

    public void setCostoPromedioAnterior(BigDecimal costoPromedioAnterior) {
        this.costoPromedioAnterior = costoPromedioAnterior;
    }

    public BigDecimal getCantidadIngresada() {
        return cantidadIngresada;
    }

    public void setCantidadIngresada(BigDecimal cantidadIngresada) {
        this.cantidadIngresada = cantidadIngresada;
    }

    public BigDecimal getCostoIngreso() {
        return costoIngreso;
    }

    public void setCostoIngreso(BigDecimal costoIngreso) {
        this.costoIngreso = costoIngreso;
    }

    public BigDecimal getCantidadEgresada() {
        return cantidadEgresada;
    }

    public void setCantidadEgresada(BigDecimal cantidadEgresada) {
        this.cantidadEgresada = cantidadEgresada;
    }

    public BigDecimal getCostoEgreso() {
        return costoEgreso;
    }

    public void setCostoEgreso(BigDecimal costoEgreso) {
        this.costoEgreso = costoEgreso;
    }

    public BigDecimal getStockActual() {
        return stockActual;
    }

    public void setStockActual(BigDecimal stockActual) {
        this.stockActual = stockActual;
    }

    public BigDecimal getCostoActual() {
        return costoActual;
    }

    public void setCostoActual(BigDecimal costoActual) {
        this.costoActual = costoActual;
    }

    public BigDecimal getCostoPromedioActual() {
        return costoPromedioActual;
    }

    public void setCostoPromedioActual(BigDecimal costoPromedioActual) {
        this.costoPromedioActual = costoPromedioActual;
    }

    public String getRegulado() {
        return regulado;
    }

    public void setRegulado(String regulado) {
        this.regulado = regulado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesDeCierrePK != null ? detallesDeCierrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDeCierre)) {
            return false;
        }
        DetallesDeCierre other = (DetallesDeCierre) object;
        if ((this.detallesDeCierrePK == null && other.detallesDeCierrePK != null) || (this.detallesDeCierrePK != null && !this.detallesDeCierrePK.equals(other.detallesDeCierrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDeCierre[ detallesDeCierrePK=" + detallesDeCierrePK + " ]";
    }
    
}
