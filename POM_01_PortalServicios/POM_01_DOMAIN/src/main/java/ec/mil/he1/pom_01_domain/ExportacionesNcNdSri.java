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
@Table(name = "EXPORTACIONES_NC_ND_SRI")
@NamedQueries({
    @NamedQuery(name = "ExportacionesNcNdSri.findAll", query = "SELECT e FROM ExportacionesNcNdSri e")})
public class ExportacionesNcNdSri implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExportacionesNcNdSriPK exportacionesNcNdSriPK;
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
    @Column(name = "CONVENIO_INTERNACIONAL")
    private String convenioInternacional;
    @Column(name = "DERECHO_DEVOLUCION")
    private String derechoDevolucion;
    @Column(name = "FECHA_EMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "CODIGO_COMPROBANTE_CMP")
    private String codigoComprobanteCmp;
    @Column(name = "SERIE_COMPROBANTE")
    private String serieComprobante;
    @Column(name = "SECUENCIA_COMPROBANTE")
    private String secuenciaComprobante;
    @Column(name = "AUTORIZACION_CMP")
    private String autorizacionCmp;
    @Column(name = "VALOR_FOB")
    private BigDecimal valorFob;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "SISTEMA_GENERA")
    private String sistemaGenera;

    public ExportacionesNcNdSri() {
    }

    public ExportacionesNcNdSri(ExportacionesNcNdSriPK exportacionesNcNdSriPK) {
        this.exportacionesNcNdSriPK = exportacionesNcNdSriPK;
    }

    public ExportacionesNcNdSri(String expsriEmpCodigo, String expsriPeriodo, int numero) {
        this.exportacionesNcNdSriPK = new ExportacionesNcNdSriPK(expsriEmpCodigo, expsriPeriodo, numero);
    }

    public ExportacionesNcNdSriPK getExportacionesNcNdSriPK() {
        return exportacionesNcNdSriPK;
    }

    public void setExportacionesNcNdSriPK(ExportacionesNcNdSriPK exportacionesNcNdSriPK) {
        this.exportacionesNcNdSriPK = exportacionesNcNdSriPK;
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

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getCodigoComprobanteCmp() {
        return codigoComprobanteCmp;
    }

    public void setCodigoComprobanteCmp(String codigoComprobanteCmp) {
        this.codigoComprobanteCmp = codigoComprobanteCmp;
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

    public String getAutorizacionCmp() {
        return autorizacionCmp;
    }

    public void setAutorizacionCmp(String autorizacionCmp) {
        this.autorizacionCmp = autorizacionCmp;
    }

    public BigDecimal getValorFob() {
        return valorFob;
    }

    public void setValorFob(BigDecimal valorFob) {
        this.valorFob = valorFob;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exportacionesNcNdSriPK != null ? exportacionesNcNdSriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExportacionesNcNdSri)) {
            return false;
        }
        ExportacionesNcNdSri other = (ExportacionesNcNdSri) object;
        if ((this.exportacionesNcNdSriPK == null && other.exportacionesNcNdSriPK != null) || (this.exportacionesNcNdSriPK != null && !this.exportacionesNcNdSriPK.equals(other.exportacionesNcNdSriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ExportacionesNcNdSri[ exportacionesNcNdSriPK=" + exportacionesNcNdSriPK + " ]";
    }
    
}
