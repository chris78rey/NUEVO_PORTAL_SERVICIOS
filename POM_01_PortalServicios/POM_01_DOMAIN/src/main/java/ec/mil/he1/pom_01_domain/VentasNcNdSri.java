/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "VENTAS_NC_ND_SRI")
@NamedQueries({
    @NamedQuery(name = "VentasNcNdSri.findAll", query = "SELECT v FROM VentasNcNdSri v")})
public class VentasNcNdSri implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VentasNcNdSriPK ventasNcNdSriPK;
    @Column(name = "TIPO_TRANSACCION")
    private String tipoTransaccion;
    @Column(name = "IDENTIFICACION_CLN")
    private String identificacionCln;
    @Column(name = "CODIGO_TIPO_COMPROBANTE")
    private String codigoTipoComprobante;
    @Column(name = "FECHA_EMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "SECUENCIA_COMPROBANTE")
    private String secuenciaComprobante;
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
    @Column(name = "CANTIDAD")
    private Long cantidad;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "SISTEMA_GENERA")
    private String sistemaGenera;
    @Column(name = "IVA_PRESUNTIVO")
    private String ivaPresuntivo;
    @Column(name = "BASE_IMPONIBLE_ICE")
    private BigDecimal baseImponibleIce;
    @Column(name = "CODIGO_TARIFA_ICE")
    private String codigoTarifaIce;
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
    @Column(name = "RET_PRESUNTIVA")
    private String retPresuntiva;
    @Column(name = "BASE_OTROS")
    private BigDecimal baseOtros;
    @Column(name = "BASE_IMPONIBLE_NO_IVA")
    private BigDecimal baseImponibleNoIva;

    public VentasNcNdSri() {
    }

    public VentasNcNdSri(VentasNcNdSriPK ventasNcNdSriPK) {
        this.ventasNcNdSriPK = ventasNcNdSriPK;
    }

    public VentasNcNdSri(String ivaEmpCodigo, String ivaPeriodo, int numero) {
        this.ventasNcNdSriPK = new VentasNcNdSriPK(ivaEmpCodigo, ivaPeriodo, numero);
    }

    public VentasNcNdSriPK getVentasNcNdSriPK() {
        return ventasNcNdSriPK;
    }

    public void setVentasNcNdSriPK(VentasNcNdSriPK ventasNcNdSriPK) {
        this.ventasNcNdSriPK = ventasNcNdSriPK;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getIdentificacionCln() {
        return identificacionCln;
    }

    public void setIdentificacionCln(String identificacionCln) {
        this.identificacionCln = identificacionCln;
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

    public String getSecuenciaComprobante() {
        return secuenciaComprobante;
    }

    public void setSecuenciaComprobante(String secuenciaComprobante) {
        this.secuenciaComprobante = secuenciaComprobante;
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

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
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

    public String getIvaPresuntivo() {
        return ivaPresuntivo;
    }

    public void setIvaPresuntivo(String ivaPresuntivo) {
        this.ivaPresuntivo = ivaPresuntivo;
    }

    public BigDecimal getBaseImponibleIce() {
        return baseImponibleIce;
    }

    public void setBaseImponibleIce(BigDecimal baseImponibleIce) {
        this.baseImponibleIce = baseImponibleIce;
    }

    public String getCodigoTarifaIce() {
        return codigoTarifaIce;
    }

    public void setCodigoTarifaIce(String codigoTarifaIce) {
        this.codigoTarifaIce = codigoTarifaIce;
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

    public String getRetPresuntiva() {
        return retPresuntiva;
    }

    public void setRetPresuntiva(String retPresuntiva) {
        this.retPresuntiva = retPresuntiva;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ventasNcNdSriPK != null ? ventasNcNdSriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentasNcNdSri)) {
            return false;
        }
        VentasNcNdSri other = (VentasNcNdSri) object;
        if ((this.ventasNcNdSriPK == null && other.ventasNcNdSriPK != null) || (this.ventasNcNdSriPK != null && !this.ventasNcNdSriPK.equals(other.ventasNcNdSriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.VentasNcNdSri[ ventasNcNdSriPK=" + ventasNcNdSriPK + " ]";
    }
    
}
