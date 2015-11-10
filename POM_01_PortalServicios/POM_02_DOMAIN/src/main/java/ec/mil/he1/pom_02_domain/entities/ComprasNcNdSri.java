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
@Table(name = "COMPRAS_NC_ND_SRI")
@NamedQueries({
    @NamedQuery(name = "ComprasNcNdSri.findAll", query = "SELECT c FROM ComprasNcNdSri c")})
public class ComprasNcNdSri implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComprasNcNdSriPK comprasNcNdSriPK;
    @Column(name = "TIPO_TRANSACCION")
    private String tipoTransaccion;
    @Column(name = "IDENTIFICACION_PRV")
    private String identificacionPrv;
    @Column(name = "PROVEEDOR")
    private String proveedor;
    @Column(name = "CODIGO_TIPO_COMPROBANTE")
    private String codigoTipoComprobante;
    @Column(name = "FECHA_EMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "FECHA_CONTABLE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContable;
    @Column(name = "SERIE_COMPROBANTE")
    private String serieComprobante;
    @Column(name = "SECUENCIA_COMPROBANTE")
    private String secuenciaComprobante;
    @Column(name = "AUTORIZACION_SRI")
    private String autorizacionSri;
    @Column(name = "ID_CREDITO_GASTO")
    private String idCreditoGasto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BASE_IMPONIBLE_IVA")
    private BigDecimal baseImponibleIva;
    @Column(name = "CODIGO_TARIFA_IVA")
    private String codigoTarifaIva;
    @Column(name = "BASE_IMPONIBLE_CERO")
    private BigDecimal baseImponibleCero;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "ICE")
    private BigDecimal ice;
    @Column(name = "MONTO_IVA_BIENES")
    private BigDecimal montoIvaBienes;
    @Column(name = "CODIGO_IVA_BIENES")
    private String codigoIvaBienes;
    @Column(name = "IVA_BIENES")
    private BigDecimal ivaBienes;
    @Column(name = "MONTO_IVA_SERVICIOS")
    private BigDecimal montoIvaServicios;
    @Column(name = "CODIGO_IVA_SERVICIOS")
    private String codigoIvaServicios;
    @Column(name = "IVA_SERVICIOS")
    private BigDecimal ivaServicios;
    @Column(name = "DEVOLUCION")
    private String devolucion;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "SISTEMA_GENERA")
    private String sistemaGenera;
    @Column(name = "CODIGO_RF")
    private String codigoRf;
    @Column(name = "VALOR_RETENIDO_RF")
    private BigDecimal valorRetenidoRf;
    @Column(name = "FECHA_CADUCIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCaducidad;
    @Column(name = "SERIE_RF")
    private String serieRf;
    @Column(name = "SECUENCIA_RF")
    private String secuenciaRf;
    @Column(name = "AUTORIZACION_SRI_RF")
    private String autorizacionSriRf;
    @Column(name = "FECHA_RF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRf;
    @Column(name = "BASE_IMPONIBLE_ICE")
    private BigDecimal baseImponibleIce;
    @Column(name = "CODIGO_PORCENTAJE_ICE")
    private String codigoPorcentajeIce;
    @Column(name = "BASE_OTROS")
    private BigDecimal baseOtros;
    @Column(name = "BASE_IMPONIBLE_NO_IVA")
    private BigDecimal baseImponibleNoIva;
    @Column(name = "IVA_RETENIDO_100")
    private BigDecimal ivaRetenido100;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comprasNcNdSri", fetch = FetchType.LAZY)
    private List<RetencionesComprasSri> retencionesComprasSriList;
    @JoinColumns({
        @JoinColumn(name = "IVA_PERIODO", referencedColumnName = "PERIODO", insertable = false, updatable = false),
        @JoinColumn(name = "IVA_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Iva iva1;

    public ComprasNcNdSri() {
    }

    public ComprasNcNdSri(ComprasNcNdSriPK comprasNcNdSriPK) {
        this.comprasNcNdSriPK = comprasNcNdSriPK;
    }

    public ComprasNcNdSri(String ivaEmpCodigo, String ivaPeriodo, int numero) {
        this.comprasNcNdSriPK = new ComprasNcNdSriPK(ivaEmpCodigo, ivaPeriodo, numero);
    }

    public ComprasNcNdSriPK getComprasNcNdSriPK() {
        return comprasNcNdSriPK;
    }

    public void setComprasNcNdSriPK(ComprasNcNdSriPK comprasNcNdSriPK) {
        this.comprasNcNdSriPK = comprasNcNdSriPK;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getIdentificacionPrv() {
        return identificacionPrv;
    }

    public void setIdentificacionPrv(String identificacionPrv) {
        this.identificacionPrv = identificacionPrv;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCodigoTipoComprobante() {
        return codigoTipoComprobante;
    }

    public void setCodigoTipoComprobante(String codigoTipoComprobante) {
        this.codigoTipoComprobante = codigoTipoComprobante;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaContable() {
        return fechaContable;
    }

    public void setFechaContable(Date fechaContable) {
        this.fechaContable = fechaContable;
    }

    public String getSerieComprobante() {
        return serieComprobante;
    }

    public void setSerieComprobante(String serieComprobante) {
        this.serieComprobante = serieComprobante;
    }

    public String getSecuenciaComprobante() {
        return secuenciaComprobante;
    }

    public void setSecuenciaComprobante(String secuenciaComprobante) {
        this.secuenciaComprobante = secuenciaComprobante;
    }

    public String getAutorizacionSri() {
        return autorizacionSri;
    }

    public void setAutorizacionSri(String autorizacionSri) {
        this.autorizacionSri = autorizacionSri;
    }

    public String getIdCreditoGasto() {
        return idCreditoGasto;
    }

    public void setIdCreditoGasto(String idCreditoGasto) {
        this.idCreditoGasto = idCreditoGasto;
    }

    public BigDecimal getBaseImponibleIva() {
        return baseImponibleIva;
    }

    public void setBaseImponibleIva(BigDecimal baseImponibleIva) {
        this.baseImponibleIva = baseImponibleIva;
    }

    public String getCodigoTarifaIva() {
        return codigoTarifaIva;
    }

    public void setCodigoTarifaIva(String codigoTarifaIva) {
        this.codigoTarifaIva = codigoTarifaIva;
    }

    public BigDecimal getBaseImponibleCero() {
        return baseImponibleCero;
    }

    public void setBaseImponibleCero(BigDecimal baseImponibleCero) {
        this.baseImponibleCero = baseImponibleCero;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getIce() {
        return ice;
    }

    public void setIce(BigDecimal ice) {
        this.ice = ice;
    }

    public BigDecimal getMontoIvaBienes() {
        return montoIvaBienes;
    }

    public void setMontoIvaBienes(BigDecimal montoIvaBienes) {
        this.montoIvaBienes = montoIvaBienes;
    }

    public String getCodigoIvaBienes() {
        return codigoIvaBienes;
    }

    public void setCodigoIvaBienes(String codigoIvaBienes) {
        this.codigoIvaBienes = codigoIvaBienes;
    }

    public BigDecimal getIvaBienes() {
        return ivaBienes;
    }

    public void setIvaBienes(BigDecimal ivaBienes) {
        this.ivaBienes = ivaBienes;
    }

    public BigDecimal getMontoIvaServicios() {
        return montoIvaServicios;
    }

    public void setMontoIvaServicios(BigDecimal montoIvaServicios) {
        this.montoIvaServicios = montoIvaServicios;
    }

    public String getCodigoIvaServicios() {
        return codigoIvaServicios;
    }

    public void setCodigoIvaServicios(String codigoIvaServicios) {
        this.codigoIvaServicios = codigoIvaServicios;
    }

    public BigDecimal getIvaServicios() {
        return ivaServicios;
    }

    public void setIvaServicios(BigDecimal ivaServicios) {
        this.ivaServicios = ivaServicios;
    }

    public String getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(String devolucion) {
        this.devolucion = devolucion;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSistemaGenera() {
        return sistemaGenera;
    }

    public void setSistemaGenera(String sistemaGenera) {
        this.sistemaGenera = sistemaGenera;
    }

    public String getCodigoRf() {
        return codigoRf;
    }

    public void setCodigoRf(String codigoRf) {
        this.codigoRf = codigoRf;
    }

    public BigDecimal getValorRetenidoRf() {
        return valorRetenidoRf;
    }

    public void setValorRetenidoRf(BigDecimal valorRetenidoRf) {
        this.valorRetenidoRf = valorRetenidoRf;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getSerieRf() {
        return serieRf;
    }

    public void setSerieRf(String serieRf) {
        this.serieRf = serieRf;
    }

    public String getSecuenciaRf() {
        return secuenciaRf;
    }

    public void setSecuenciaRf(String secuenciaRf) {
        this.secuenciaRf = secuenciaRf;
    }

    public String getAutorizacionSriRf() {
        return autorizacionSriRf;
    }

    public void setAutorizacionSriRf(String autorizacionSriRf) {
        this.autorizacionSriRf = autorizacionSriRf;
    }

    public Date getFechaRf() {
        return fechaRf;
    }

    public void setFechaRf(Date fechaRf) {
        this.fechaRf = fechaRf;
    }

    public BigDecimal getBaseImponibleIce() {
        return baseImponibleIce;
    }

    public void setBaseImponibleIce(BigDecimal baseImponibleIce) {
        this.baseImponibleIce = baseImponibleIce;
    }

    public String getCodigoPorcentajeIce() {
        return codigoPorcentajeIce;
    }

    public void setCodigoPorcentajeIce(String codigoPorcentajeIce) {
        this.codigoPorcentajeIce = codigoPorcentajeIce;
    }

    public BigDecimal getBaseOtros() {
        return baseOtros;
    }

    public void setBaseOtros(BigDecimal baseOtros) {
        this.baseOtros = baseOtros;
    }

    public BigDecimal getBaseImponibleNoIva() {
        return baseImponibleNoIva;
    }

    public void setBaseImponibleNoIva(BigDecimal baseImponibleNoIva) {
        this.baseImponibleNoIva = baseImponibleNoIva;
    }

    public BigDecimal getIvaRetenido100() {
        return ivaRetenido100;
    }

    public void setIvaRetenido100(BigDecimal ivaRetenido100) {
        this.ivaRetenido100 = ivaRetenido100;
    }

    public List<RetencionesComprasSri> getRetencionesComprasSriList() {
        return retencionesComprasSriList;
    }

    public void setRetencionesComprasSriList(List<RetencionesComprasSri> retencionesComprasSriList) {
        this.retencionesComprasSriList = retencionesComprasSriList;
    }

    public Iva getIva1() {
        return iva1;
    }

    public void setIva1(Iva iva1) {
        this.iva1 = iva1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comprasNcNdSriPK != null ? comprasNcNdSriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprasNcNdSri)) {
            return false;
        }
        ComprasNcNdSri other = (ComprasNcNdSri) object;
        if ((this.comprasNcNdSriPK == null && other.comprasNcNdSriPK != null) || (this.comprasNcNdSriPK != null && !this.comprasNcNdSriPK.equals(other.comprasNcNdSriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ComprasNcNdSri[ comprasNcNdSriPK=" + comprasNcNdSriPK + " ]";
    }
    
}
