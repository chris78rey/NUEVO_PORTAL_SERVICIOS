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
@Table(name = "IMPORTACIONES_NC_ND_SRI")
@NamedQueries({
    @NamedQuery(name = "ImportacionesNcNdSri.findAll", query = "SELECT i FROM ImportacionesNcNdSri i")})
public class ImportacionesNcNdSri implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImportacionesNcNdSriPK importacionesNcNdSriPK;
    @Column(name = "TIPO_TRANSACCION")
    private String tipoTransaccion;
    @Column(name = "FECHA_COMPROBANTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaComprobante;
    @Column(name = "CODIGO_TIPO_COMPROBANTE")
    private String codigoTipoComprobante;
    @Column(name = "NUMERO_COMPROBANTE")
    private String numeroComprobante;
    @Column(name = "NUMERO_REFRENDO")
    private String numeroRefrendo;
    @Column(name = "ID_CREDITO_GASTO")
    private String idCreditoGasto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTO_CIF")
    private BigDecimal montoCif;
    @Column(name = "MONTO_IVA")
    private BigDecimal montoIva;
    @Column(name = "MONTO_ICE")
    private BigDecimal montoIce;
    @Column(name = "CODIGO_TARIFA_ICE")
    private String codigoTarifaIce;
    @Column(name = "CODIGO_BANCO")
    private String codigoBanco;
    @Column(name = "CONVENIO_INTERNACIONAL")
    private String convenioInternacional;
    @Column(name = "DERECHO_DEVOLUCION")
    private String derechoDevolucion;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "SISTEMA_GENERA")
    private String sistemaGenera;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "NUMERO_REFRENDO_DA")
    private String numeroRefrendoDa;
    @Column(name = "NUMERO_REFRENDO_A")
    private String numeroRefrendoA;
    @Column(name = "NUMERO_REFRENDO_R")
    private String numeroRefrendoR;
    @Column(name = "NUMERO_REFRENDO_C")
    private String numeroRefrendoC;
    @Column(name = "NUMERO_REFRENDO_V")
    private String numeroRefrendoV;
    @Column(name = "IDENTIFICACION_PRV")
    private String identificacionPrv;
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    @Column(name = "TIPO_PROVEEDOR")
    private String tipoProveedor;
    @Column(name = "BASE_IMPONIBLE_CERO")
    private BigDecimal baseImponibleCero;
    @Column(name = "BASE_IMPONIBLE_IVA")
    private BigDecimal baseImponibleIva;
    @Column(name = "CODIGO_TARIFA_IVA")
    private String codigoTarifaIva;
    @Column(name = "BASE_IMPONIBLE_ICE")
    private BigDecimal baseImponibleIce;

    public ImportacionesNcNdSri() {
    }

    public ImportacionesNcNdSri(ImportacionesNcNdSriPK importacionesNcNdSriPK) {
        this.importacionesNcNdSriPK = importacionesNcNdSriPK;
    }

    public ImportacionesNcNdSri(String impsriEmpCodigo, String impsriPeriodo, int numero) {
        this.importacionesNcNdSriPK = new ImportacionesNcNdSriPK(impsriEmpCodigo, impsriPeriodo, numero);
    }

    public ImportacionesNcNdSriPK getImportacionesNcNdSriPK() {
        return importacionesNcNdSriPK;
    }

    public void setImportacionesNcNdSriPK(ImportacionesNcNdSriPK importacionesNcNdSriPK) {
        this.importacionesNcNdSriPK = importacionesNcNdSriPK;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Date getFechaComprobante() {
        return fechaComprobante;
    }

    public void setFechaComprobante(Date fechaComprobante) {
        this.fechaComprobante = fechaComprobante;
    }

    public String getCodigoTipoComprobante() {
        return codigoTipoComprobante;
    }

    public void setCodigoTipoComprobante(String codigoTipoComprobante) {
        this.codigoTipoComprobante = codigoTipoComprobante;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getNumeroRefrendo() {
        return numeroRefrendo;
    }

    public void setNumeroRefrendo(String numeroRefrendo) {
        this.numeroRefrendo = numeroRefrendo;
    }

    public String getIdCreditoGasto() {
        return idCreditoGasto;
    }

    public void setIdCreditoGasto(String idCreditoGasto) {
        this.idCreditoGasto = idCreditoGasto;
    }

    public BigDecimal getMontoCif() {
        return montoCif;
    }

    public void setMontoCif(BigDecimal montoCif) {
        this.montoCif = montoCif;
    }

    public BigDecimal getMontoIva() {
        return montoIva;
    }

    public void setMontoIva(BigDecimal montoIva) {
        this.montoIva = montoIva;
    }

    public BigDecimal getMontoIce() {
        return montoIce;
    }

    public void setMontoIce(BigDecimal montoIce) {
        this.montoIce = montoIce;
    }

    public String getCodigoTarifaIce() {
        return codigoTarifaIce;
    }

    public void setCodigoTarifaIce(String codigoTarifaIce) {
        this.codigoTarifaIce = codigoTarifaIce;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getConvenioInternacional() {
        return convenioInternacional;
    }

    public void setConvenioInternacional(String convenioInternacional) {
        this.convenioInternacional = convenioInternacional;
    }

    public String getDerechoDevolucion() {
        return derechoDevolucion;
    }

    public void setDerechoDevolucion(String derechoDevolucion) {
        this.derechoDevolucion = derechoDevolucion;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroRefrendoDa() {
        return numeroRefrendoDa;
    }

    public void setNumeroRefrendoDa(String numeroRefrendoDa) {
        this.numeroRefrendoDa = numeroRefrendoDa;
    }

    public String getNumeroRefrendoA() {
        return numeroRefrendoA;
    }

    public void setNumeroRefrendoA(String numeroRefrendoA) {
        this.numeroRefrendoA = numeroRefrendoA;
    }

    public String getNumeroRefrendoR() {
        return numeroRefrendoR;
    }

    public void setNumeroRefrendoR(String numeroRefrendoR) {
        this.numeroRefrendoR = numeroRefrendoR;
    }

    public String getNumeroRefrendoC() {
        return numeroRefrendoC;
    }

    public void setNumeroRefrendoC(String numeroRefrendoC) {
        this.numeroRefrendoC = numeroRefrendoC;
    }

    public String getNumeroRefrendoV() {
        return numeroRefrendoV;
    }

    public void setNumeroRefrendoV(String numeroRefrendoV) {
        this.numeroRefrendoV = numeroRefrendoV;
    }

    public String getIdentificacionPrv() {
        return identificacionPrv;
    }

    public void setIdentificacionPrv(String identificacionPrv) {
        this.identificacionPrv = identificacionPrv;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(String tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    public BigDecimal getBaseImponibleCero() {
        return baseImponibleCero;
    }

    public void setBaseImponibleCero(BigDecimal baseImponibleCero) {
        this.baseImponibleCero = baseImponibleCero;
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

    public BigDecimal getBaseImponibleIce() {
        return baseImponibleIce;
    }

    public void setBaseImponibleIce(BigDecimal baseImponibleIce) {
        this.baseImponibleIce = baseImponibleIce;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (importacionesNcNdSriPK != null ? importacionesNcNdSriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImportacionesNcNdSri)) {
            return false;
        }
        ImportacionesNcNdSri other = (ImportacionesNcNdSri) object;
        if ((this.importacionesNcNdSriPK == null && other.importacionesNcNdSriPK != null) || (this.importacionesNcNdSriPK != null && !this.importacionesNcNdSriPK.equals(other.importacionesNcNdSriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ImportacionesNcNdSri[ importacionesNcNdSriPK=" + importacionesNcNdSriPK + " ]";
    }
    
}
