/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "MOVIMIENTOS_DE_INVENTARIO")
@NamedQueries({
    @NamedQuery(name = "MovimientosDeInventario.findAll", query = "SELECT m FROM MovimientosDeInventario m")})
public class MovimientosDeInventario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MovimientosDeInventarioPK movimientosDeInventarioPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "STOCK_ANTERIOR")
    private BigDecimal stockAnterior;
    @Column(name = "COSTO_ANTERIOR")
    private BigDecimal costoAnterior;
    @Column(name = "CANTIDAD_INGRESADA")
    private BigDecimal cantidadIngresada;
    @Column(name = "COSTO_INGRESO")
    private BigDecimal costoIngreso;
    @Column(name = "CANTIDAD_EGRESADA")
    private BigDecimal cantidadEgresada;
    @Column(name = "COSTO_EGRESO")
    private BigDecimal costoEgreso;
    @Column(name = "CANTIDAD_ACTUAL")
    private BigDecimal cantidadActual;
    @Column(name = "COSTO_ACTUAL")
    private BigDecimal costoActual;
    @JoinColumns({
        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "SBS_SCC_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "SBS_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Items items;

    public MovimientosDeInventario() {
    }

    public MovimientosDeInventario(MovimientosDeInventarioPK movimientosDeInventarioPK) {
        this.movimientosDeInventarioPK = movimientosDeInventarioPK;
    }

    public MovimientosDeInventario(Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo) {
        this.movimientosDeInventarioPK = new MovimientosDeInventarioPK(itmTipo, itmSbsSccCodigo, itmSbsCodigo, itmCodigo);
    }

    public MovimientosDeInventarioPK getMovimientosDeInventarioPK() {
        return movimientosDeInventarioPK;
    }

    public void setMovimientosDeInventarioPK(MovimientosDeInventarioPK movimientosDeInventarioPK) {
        this.movimientosDeInventarioPK = movimientosDeInventarioPK;
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

    public BigDecimal getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(BigDecimal cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public BigDecimal getCostoActual() {
        return costoActual;
    }

    public void setCostoActual(BigDecimal costoActual) {
        this.costoActual = costoActual;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movimientosDeInventarioPK != null ? movimientosDeInventarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosDeInventario)) {
            return false;
        }
        MovimientosDeInventario other = (MovimientosDeInventario) object;
        if ((this.movimientosDeInventarioPK == null && other.movimientosDeInventarioPK != null) || (this.movimientosDeInventarioPK != null && !this.movimientosDeInventarioPK.equals(other.movimientosDeInventarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.MovimientosDeInventario[ movimientosDeInventarioPK=" + movimientosDeInventarioPK + " ]";
    }
    
}
