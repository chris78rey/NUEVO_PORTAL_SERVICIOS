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
@Table(name = "TRANSACCIONES")
@NamedQueries({
    @NamedQuery(name = "Transacciones.findAll", query = "SELECT t FROM Transacciones t")})
public class Transacciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRN_ID")
    private Integer trnId;
    @Column(name = "INGBDG_TIPO")
    private String ingbdgTipo;
    @Column(name = "INGBTC_TIPO")
    private String ingbtcTipo;
    @Column(name = "EGRBDG_TIPO")
    private String egrbdgTipo;
    @Column(name = "EGRBTC_TIPO")
    private String egrbtcTipo;
    @Column(name = "RGL_TIPO")
    private String rglTipo;
    @Column(name = "EGRSBB_TIPO")
    private String egrsbbTipo;
    @Column(name = "TRNSFR_TIPO")
    private String trnsfrTipo;
    @Column(name = "INGBDG_NUMERO")
    private Integer ingbdgNumero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Column(name = "ITM_CODIGO")
    private Short itmCodigo;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "STOCK_ANTERIOR")
    private Integer stockAnterior;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COSTO_ANTERIOR")
    private BigDecimal costoAnterior;
    @Column(name = "COSTO_TOTAL")
    private BigDecimal costoTotal;
    @Column(name = "PRECIO_VENTA")
    private BigDecimal precioVenta;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "SENTIDO")
    private String sentido;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "STOCK_GLOBAL_ANTERIOR")
    private BigDecimal stockGlobalAnterior;
    @Column(name = "PROMOCION")
    private BigDecimal promocion;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;

    public Transacciones() {
    }

    public Transacciones(Integer trnId) {
        this.trnId = trnId;
    }

    public Integer getTrnId() {
        return trnId;
    }

    public void setTrnId(Integer trnId) {
        this.trnId = trnId;
    }

    public String getIngbdgTipo() {
        return ingbdgTipo;
    }

    public void setIngbdgTipo(String ingbdgTipo) {
        this.ingbdgTipo = ingbdgTipo;
    }

    public String getIngbtcTipo() {
        return ingbtcTipo;
    }

    public void setIngbtcTipo(String ingbtcTipo) {
        this.ingbtcTipo = ingbtcTipo;
    }

    public String getEgrbdgTipo() {
        return egrbdgTipo;
    }

    public void setEgrbdgTipo(String egrbdgTipo) {
        this.egrbdgTipo = egrbdgTipo;
    }

    public String getEgrbtcTipo() {
        return egrbtcTipo;
    }

    public void setEgrbtcTipo(String egrbtcTipo) {
        this.egrbtcTipo = egrbtcTipo;
    }

    public String getRglTipo() {
        return rglTipo;
    }

    public void setRglTipo(String rglTipo) {
        this.rglTipo = rglTipo;
    }

    public String getEgrsbbTipo() {
        return egrsbbTipo;
    }

    public void setEgrsbbTipo(String egrsbbTipo) {
        this.egrsbbTipo = egrsbbTipo;
    }

    public String getTrnsfrTipo() {
        return trnsfrTipo;
    }

    public void setTrnsfrTipo(String trnsfrTipo) {
        this.trnsfrTipo = trnsfrTipo;
    }

    public Integer getIngbdgNumero() {
        return ingbdgNumero;
    }

    public void setIngbdgNumero(Integer ingbdgNumero) {
        this.ingbdgNumero = ingbdgNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public Short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(Short itmCodigo) {
        this.itmCodigo = itmCodigo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getStockAnterior() {
        return stockAnterior;
    }

    public void setStockAnterior(Integer stockAnterior) {
        this.stockAnterior = stockAnterior;
    }

    public BigDecimal getCostoAnterior() {
        return costoAnterior;
    }

    public void setCostoAnterior(BigDecimal costoAnterior) {
        this.costoAnterior = costoAnterior;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getStockGlobalAnterior() {
        return stockGlobalAnterior;
    }

    public void setStockGlobalAnterior(BigDecimal stockGlobalAnterior) {
        this.stockGlobalAnterior = stockGlobalAnterior;
    }

    public BigDecimal getPromocion() {
        return promocion;
    }

    public void setPromocion(BigDecimal promocion) {
        this.promocion = promocion;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnId != null ? trnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transacciones)) {
            return false;
        }
        Transacciones other = (Transacciones) object;
        if ((this.trnId == null && other.trnId != null) || (this.trnId != null && !this.trnId.equals(other.trnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Transacciones[ trnId=" + trnId + " ]";
    }
    
}
