/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
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
    @OneToOne(mappedBy = "transacciones", fetch = FetchType.LAZY)
    private TransaccionesJn transaccionesJn;
//    @JoinColumns({
//        @JoinColumn(name = "EGRBDG_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "INGBDG_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private EgresosDeBodega egresosDeBodega;
//    @JoinColumns({
//        @JoinColumn(name = "EGRBTC_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "INGBDG_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private EgresosDeBotica egresosDeBotica;
//    @JoinColumns({
//        @JoinColumn(name = "EGRSBB_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "INGBDG_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private EgresosSubbodegas egresosSubbodegas;
//    @JoinColumns({
//        @JoinColumn(name = "INGBDG_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "INGBDG_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private IngresosDeBodega ingresosDeBodega;
//    @JoinColumns({
//        @JoinColumn(name = "INGBTC_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "INGBDG_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private IngresosDeBotica ingresosDeBotica;
//    @JoinColumns({
//        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "SBS_SCC_CODIGO"),
//        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "SBS_CODIGO"),
//        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "CODIGO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Items items;
//    @JoinColumns({
//        @JoinColumn(name = "RGL_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "INGBDG_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Regulaciones regulaciones;
//    @JoinColumns({
//        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "ITM_TIPO"),
//        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "ITM_SBS_SCC_CODIGO"),
//        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "ITM_SBS_CODIGO"),
//        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "ITM_CODIGO"),
//        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "DPR_CODIGO"),
//        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "DPR_ARA_CODIGO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private SubBodegas subBodegas;
//    @JoinColumns({
//        @JoinColumn(name = "TRNSFR_TIPO", referencedColumnName = "TIPO"),
//        @JoinColumn(name = "INGBDG_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Transferencias transferencias;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public TransaccionesJn getTransaccionesJn() {
        return transaccionesJn;
    }

    public void setTransaccionesJn(TransaccionesJn transaccionesJn) {
        this.transaccionesJn = transaccionesJn;
    }

//    public EgresosDeBodega getEgresosDeBodega() {
//        return egresosDeBodega;
//    }
//
//    public void setEgresosDeBodega(EgresosDeBodega egresosDeBodega) {
//        this.egresosDeBodega = egresosDeBodega;
//    }
//
//    public EgresosDeBotica getEgresosDeBotica() {
//        return egresosDeBotica;
//    }
//
//    public void setEgresosDeBotica(EgresosDeBotica egresosDeBotica) {
//        this.egresosDeBotica = egresosDeBotica;
//    }
//
//    public EgresosSubbodegas getEgresosSubbodegas() {
//        return egresosSubbodegas;
//    }
//
//    public void setEgresosSubbodegas(EgresosSubbodegas egresosSubbodegas) {
//        this.egresosSubbodegas = egresosSubbodegas;
//    }
//
//    public IngresosDeBodega getIngresosDeBodega() {
//        return ingresosDeBodega;
//    }
//
//    public void setIngresosDeBodega(IngresosDeBodega ingresosDeBodega) {
//        this.ingresosDeBodega = ingresosDeBodega;
//    }
//
//    public IngresosDeBotica getIngresosDeBotica() {
//        return ingresosDeBotica;
//    }
//
//    public void setIngresosDeBotica(IngresosDeBotica ingresosDeBotica) {
//        this.ingresosDeBotica = ingresosDeBotica;
//    }
//
//    public Items getItems() {
//        return items;
//    }
//
//    public void setItems(Items items) {
//        this.items = items;
//    }
//
//    public Regulaciones getRegulaciones() {
//        return regulaciones;
//    }
//
//    public void setRegulaciones(Regulaciones regulaciones) {
//        this.regulaciones = regulaciones;
//    }
//
//    public SubBodegas getSubBodegas() {
//        return subBodegas;
//    }
//
//    public void setSubBodegas(SubBodegas subBodegas) {
//        this.subBodegas = subBodegas;
//    }
//
//    public Transferencias getTransferencias() {
//        return transferencias;
//    }
//
//    public void setTransferencias(Transferencias transferencias) {
//        this.transferencias = transferencias;
//    }

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
        return "ec.mil.he1.pom_02_domain.entities.Transacciones[ trnId=" + trnId + " ]";
    }
    
}
