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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ITEMS")
@NamedQueries({
    @NamedQuery(name = "Items.findAll", query = "SELECT i FROM Items i")})
public class Items implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemsPK itemsPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "UNIDAD")
    private String unidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "STOCK1")
    private BigDecimal stock1;
    @Column(name = "STOCK2")
    private BigDecimal stock2;
    @Column(name = "STOCK_COMPROMETIDO")
    private BigDecimal stockComprometido;
    @Column(name = "STOCK_MINIMO")
    private BigDecimal stockMinimo;
    @Column(name = "COSTO_PROMEDIO")
    private BigDecimal costoPromedio;
    @Column(name = "PRECIO_REPOSICION")
    private BigDecimal precioReposicion;
    @Column(name = "PRECIO_DE_VENTA")
    private BigDecimal precioDeVenta;
    @Column(name = "LOCAL")
    private String local;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CLASIFICA")
    private String clasifica;
    @Column(name = "AUTORIZACION")
    private String autorizacion;
    @Column(name = "USO")
    private String uso;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "PORCENTAJE_ADMINISTRACION")
    private BigDecimal porcentajeAdministracion;
    @Column(name = "RECETA")
    private String receta;
    @Column(name = "PRC_MAX_DESCUENTO")
    private BigDecimal prcMaxDescuento;
    @Column(name = "DIAS_STOCK")
    private Short diasStock;
    @Column(name = "FACTOR_DIVISION")
    private Short factorDivision;
    @Column(name = "VENTA_EXTERNA")
    private String ventaExterna;
    @Column(name = "CODIGO_BARRAS")
    private String codigoBarras;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "PRC_RECARGO_COMPRA")
    private BigDecimal prcRecargoCompra;
    @Column(name = "STOCK_MAXIMO")
    private BigDecimal stockMaximo;
    @Column(name = "DIAS_STOCK_MAXIMO")
    private Short diasStockMaximo;
    @Column(name = "PRESENTACION")
    private Integer presentacion;
    @Column(name = "CALCULADO")
    private String calculado;
    @Column(name = "CONSUMO_PROMEDIO")
    private BigDecimal consumoPromedio;
    @Column(name = "NUTRICION")
    private String nutricion;
    @Column(name = "CONSIGNACION")
    private String consignacion;
    @Column(name = "FRANCA")
    private String franca;
    @Column(name = "APLICA_DESCARGO")
    private String aplicaDescargo;
    @Column(name = "APLICA_ADMINISTRACION")
    private String aplicaAdministracion;
    @Column(name = "IMPRIMIR_CODIGO")
    private String imprimirCodigo;
    @Column(name = "CUADRO_BASICA")
    private String cuadroBasica;
    @Column(name = "ANTIBIOTICO_RESTRINGIDO")
    private String antibioticoRestringido;
    @Column(name = "SUSTANCIA_CONTROLADA")
    private String sustanciaControlada;
    @Column(name = "AGRUPADOR_BODEGA")
    private String agrupadorBodega;
    @Column(name = "COD_SIS_ANT")
    private String codSisAnt;
    @ManyToMany(mappedBy = "itemsList", fetch = FetchType.LAZY)
    private List<Bandejas> bandejasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<DetallesDeCierre> detallesDeCierreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<FechasDeExpiracion> fechasDeExpiracionList;
    @OneToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<ExcepcionesPromociones> excepcionesPromocionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<DetallesAjustes> detallesAjustesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<ItemsProveedores> itemsProveedoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<DetallesDeOrden> detallesDeOrdenList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<DetallesDescargo> detallesDescargoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<SubBodegas> subBodegasList;
    @OneToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<ItemsCodigoBarras> itemsCodigoBarrasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<DetalleCotizacion> detalleCotizacionList;
    @OneToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<Transacciones> transaccionesList;
    @OneToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<DetallesPerfilPrescripcion> detallesPerfilPrescripcionList;
    @OneToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<DetallesPrescripcion> detallesPrescripcionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<DetallesInsumos> detallesInsumosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private MovimientosDeInventario movimientosDeInventario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
    private List<DetallesTemporales> detallesTemporalesList;
    @OneToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<ItemsCargosCopago> itemsCargosCopagoList;
    @JoinColumns({
        @JoinColumn(name = "PGA_GEN_CODIGO", referencedColumnName = "GEN_CODIGO_P"),
        @JoinColumn(name = "PGA_PRE_CODIGO", referencedColumnName = "PRE_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PresentacionGenerica presentacionGenerica;
    @JoinColumn(name = "PRD_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedores proveedores;
    @JoinColumns({
        @JoinColumn(name = "SBS_SCC_CODIGO", referencedColumnName = "SCC_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SBS_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Subsecciones subsecciones;

    public Items() {
    }

    public Items(ItemsPK itemsPK) {
        this.itemsPK = itemsPK;
    }

    public Items(Character tipo, String sbsSccCodigo, String sbsCodigo, short codigo) {
        this.itemsPK = new ItemsPK(tipo, sbsSccCodigo, sbsCodigo, codigo);
    }

    public ItemsPK getItemsPK() {
        return itemsPK;
    }

    public void setItemsPK(ItemsPK itemsPK) {
        this.itemsPK = itemsPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public BigDecimal getStock1() {
        return stock1;
    }

    public void setStock1(BigDecimal stock1) {
        this.stock1 = stock1;
    }

    public BigDecimal getStock2() {
        return stock2;
    }

    public void setStock2(BigDecimal stock2) {
        this.stock2 = stock2;
    }

    public BigDecimal getStockComprometido() {
        return stockComprometido;
    }

    public void setStockComprometido(BigDecimal stockComprometido) {
        this.stockComprometido = stockComprometido;
    }

    public BigDecimal getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(BigDecimal stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public BigDecimal getCostoPromedio() {
        return costoPromedio;
    }

    public void setCostoPromedio(BigDecimal costoPromedio) {
        this.costoPromedio = costoPromedio;
    }

    public BigDecimal getPrecioReposicion() {
        return precioReposicion;
    }

    public void setPrecioReposicion(BigDecimal precioReposicion) {
        this.precioReposicion = precioReposicion;
    }

    public BigDecimal getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(BigDecimal precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClasifica() {
        return clasifica;
    }

    public void setClasifica(String clasifica) {
        this.clasifica = clasifica;
    }

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getPorcentajeAdministracion() {
        return porcentajeAdministracion;
    }

    public void setPorcentajeAdministracion(BigDecimal porcentajeAdministracion) {
        this.porcentajeAdministracion = porcentajeAdministracion;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public BigDecimal getPrcMaxDescuento() {
        return prcMaxDescuento;
    }

    public void setPrcMaxDescuento(BigDecimal prcMaxDescuento) {
        this.prcMaxDescuento = prcMaxDescuento;
    }

    public Short getDiasStock() {
        return diasStock;
    }

    public void setDiasStock(Short diasStock) {
        this.diasStock = diasStock;
    }

    public Short getFactorDivision() {
        return factorDivision;
    }

    public void setFactorDivision(Short factorDivision) {
        this.factorDivision = factorDivision;
    }

    public String getVentaExterna() {
        return ventaExterna;
    }

    public void setVentaExterna(String ventaExterna) {
        this.ventaExterna = ventaExterna;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public BigDecimal getPrcRecargoCompra() {
        return prcRecargoCompra;
    }

    public void setPrcRecargoCompra(BigDecimal prcRecargoCompra) {
        this.prcRecargoCompra = prcRecargoCompra;
    }

    public BigDecimal getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(BigDecimal stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Short getDiasStockMaximo() {
        return diasStockMaximo;
    }

    public void setDiasStockMaximo(Short diasStockMaximo) {
        this.diasStockMaximo = diasStockMaximo;
    }

    public Integer getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Integer presentacion) {
        this.presentacion = presentacion;
    }

    public String getCalculado() {
        return calculado;
    }

    public void setCalculado(String calculado) {
        this.calculado = calculado;
    }

    public BigDecimal getConsumoPromedio() {
        return consumoPromedio;
    }

    public void setConsumoPromedio(BigDecimal consumoPromedio) {
        this.consumoPromedio = consumoPromedio;
    }

    public String getNutricion() {
        return nutricion;
    }

    public void setNutricion(String nutricion) {
        this.nutricion = nutricion;
    }

    public String getConsignacion() {
        return consignacion;
    }

    public void setConsignacion(String consignacion) {
        this.consignacion = consignacion;
    }

    public String getFranca() {
        return franca;
    }

    public void setFranca(String franca) {
        this.franca = franca;
    }

    public String getAplicaDescargo() {
        return aplicaDescargo;
    }

    public void setAplicaDescargo(String aplicaDescargo) {
        this.aplicaDescargo = aplicaDescargo;
    }

    public String getAplicaAdministracion() {
        return aplicaAdministracion;
    }

    public void setAplicaAdministracion(String aplicaAdministracion) {
        this.aplicaAdministracion = aplicaAdministracion;
    }

    public String getImprimirCodigo() {
        return imprimirCodigo;
    }

    public void setImprimirCodigo(String imprimirCodigo) {
        this.imprimirCodigo = imprimirCodigo;
    }

    public String getCuadroBasica() {
        return cuadroBasica;
    }

    public void setCuadroBasica(String cuadroBasica) {
        this.cuadroBasica = cuadroBasica;
    }

    public String getAntibioticoRestringido() {
        return antibioticoRestringido;
    }

    public void setAntibioticoRestringido(String antibioticoRestringido) {
        this.antibioticoRestringido = antibioticoRestringido;
    }

    public String getSustanciaControlada() {
        return sustanciaControlada;
    }

    public void setSustanciaControlada(String sustanciaControlada) {
        this.sustanciaControlada = sustanciaControlada;
    }

    public String getAgrupadorBodega() {
        return agrupadorBodega;
    }

    public void setAgrupadorBodega(String agrupadorBodega) {
        this.agrupadorBodega = agrupadorBodega;
    }

    public String getCodSisAnt() {
        return codSisAnt;
    }

    public void setCodSisAnt(String codSisAnt) {
        this.codSisAnt = codSisAnt;
    }

    public List<Bandejas> getBandejasList() {
        return bandejasList;
    }

    public void setBandejasList(List<Bandejas> bandejasList) {
        this.bandejasList = bandejasList;
    }

    public List<DetallesDeCierre> getDetallesDeCierreList() {
        return detallesDeCierreList;
    }

    public void setDetallesDeCierreList(List<DetallesDeCierre> detallesDeCierreList) {
        this.detallesDeCierreList = detallesDeCierreList;
    }

    public List<FechasDeExpiracion> getFechasDeExpiracionList() {
        return fechasDeExpiracionList;
    }

    public void setFechasDeExpiracionList(List<FechasDeExpiracion> fechasDeExpiracionList) {
        this.fechasDeExpiracionList = fechasDeExpiracionList;
    }

    public List<ExcepcionesPromociones> getExcepcionesPromocionesList() {
        return excepcionesPromocionesList;
    }

    public void setExcepcionesPromocionesList(List<ExcepcionesPromociones> excepcionesPromocionesList) {
        this.excepcionesPromocionesList = excepcionesPromocionesList;
    }

    public List<DetallesAjustes> getDetallesAjustesList() {
        return detallesAjustesList;
    }

    public void setDetallesAjustesList(List<DetallesAjustes> detallesAjustesList) {
        this.detallesAjustesList = detallesAjustesList;
    }

    public List<ItemsProveedores> getItemsProveedoresList() {
        return itemsProveedoresList;
    }

    public void setItemsProveedoresList(List<ItemsProveedores> itemsProveedoresList) {
        this.itemsProveedoresList = itemsProveedoresList;
    }

    public List<DetallesDeOrden> getDetallesDeOrdenList() {
        return detallesDeOrdenList;
    }

    public void setDetallesDeOrdenList(List<DetallesDeOrden> detallesDeOrdenList) {
        this.detallesDeOrdenList = detallesDeOrdenList;
    }

    public List<DetallesDescargo> getDetallesDescargoList() {
        return detallesDescargoList;
    }

    public void setDetallesDescargoList(List<DetallesDescargo> detallesDescargoList) {
        this.detallesDescargoList = detallesDescargoList;
    }

    public List<SubBodegas> getSubBodegasList() {
        return subBodegasList;
    }

    public void setSubBodegasList(List<SubBodegas> subBodegasList) {
        this.subBodegasList = subBodegasList;
    }

    public List<ItemsCodigoBarras> getItemsCodigoBarrasList() {
        return itemsCodigoBarrasList;
    }

    public void setItemsCodigoBarrasList(List<ItemsCodigoBarras> itemsCodigoBarrasList) {
        this.itemsCodigoBarrasList = itemsCodigoBarrasList;
    }

    public List<DetalleCotizacion> getDetalleCotizacionList() {
        return detalleCotizacionList;
    }

    public void setDetalleCotizacionList(List<DetalleCotizacion> detalleCotizacionList) {
        this.detalleCotizacionList = detalleCotizacionList;
    }

    public List<Transacciones> getTransaccionesList() {
        return transaccionesList;
    }

    public void setTransaccionesList(List<Transacciones> transaccionesList) {
        this.transaccionesList = transaccionesList;
    }

    public List<DetallesPerfilPrescripcion> getDetallesPerfilPrescripcionList() {
        return detallesPerfilPrescripcionList;
    }

    public void setDetallesPerfilPrescripcionList(List<DetallesPerfilPrescripcion> detallesPerfilPrescripcionList) {
        this.detallesPerfilPrescripcionList = detallesPerfilPrescripcionList;
    }

    public List<DetallesPrescripcion> getDetallesPrescripcionList() {
        return detallesPrescripcionList;
    }

    public void setDetallesPrescripcionList(List<DetallesPrescripcion> detallesPrescripcionList) {
        this.detallesPrescripcionList = detallesPrescripcionList;
    }

    public List<DetallesInsumos> getDetallesInsumosList() {
        return detallesInsumosList;
    }

    public void setDetallesInsumosList(List<DetallesInsumos> detallesInsumosList) {
        this.detallesInsumosList = detallesInsumosList;
    }

    public MovimientosDeInventario getMovimientosDeInventario() {
        return movimientosDeInventario;
    }

    public void setMovimientosDeInventario(MovimientosDeInventario movimientosDeInventario) {
        this.movimientosDeInventario = movimientosDeInventario;
    }

    public List<DetallesTemporales> getDetallesTemporalesList() {
        return detallesTemporalesList;
    }

    public void setDetallesTemporalesList(List<DetallesTemporales> detallesTemporalesList) {
        this.detallesTemporalesList = detallesTemporalesList;
    }

    public List<ItemsCargosCopago> getItemsCargosCopagoList() {
        return itemsCargosCopagoList;
    }

    public void setItemsCargosCopagoList(List<ItemsCargosCopago> itemsCargosCopagoList) {
        this.itemsCargosCopagoList = itemsCargosCopagoList;
    }

    public PresentacionGenerica getPresentacionGenerica() {
        return presentacionGenerica;
    }

    public void setPresentacionGenerica(PresentacionGenerica presentacionGenerica) {
        this.presentacionGenerica = presentacionGenerica;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public Subsecciones getSubsecciones() {
        return subsecciones;
    }

    public void setSubsecciones(Subsecciones subsecciones) {
        this.subsecciones = subsecciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemsPK != null ? itemsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.itemsPK == null && other.itemsPK != null) || (this.itemsPK != null && !this.itemsPK.equals(other.itemsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Items[ itemsPK=" + itemsPK + " ]";
    }
    
}
