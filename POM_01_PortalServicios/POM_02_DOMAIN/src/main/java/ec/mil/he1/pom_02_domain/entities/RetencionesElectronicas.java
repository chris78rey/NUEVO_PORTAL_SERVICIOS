/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
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
@Table(name = "RETENCIONES_ELECTRONICAS")
@NamedQueries({
    @NamedQuery(name = "RetencionesElectronicas.findAll", query = "SELECT r FROM RetencionesElectronicas r")})
public class RetencionesElectronicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RetencionesElectronicasPK retencionesElectronicasPK;
    @Column(name = "AMBIENTE")
    private Short ambiente;
    @Column(name = "TIPO_EMISION")
    private Short tipoEmision;
    @Column(name = "CLAVE_ACCESO")
    private String claveAcceso;
    @Column(name = "COD_DOC")
    private String codDoc;
    @Column(name = "ESTAB")
    private String estab;
    @Column(name = "PTO_EMISION")
    private String ptoEmision;
    @Column(name = "SECUENCIAL")
    private String secuencial;
    @Column(name = "FECHA_EMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "TIPO_ID_SUJETO_RETENIDO")
    private String tipoIdSujetoRetenido;
    @Column(name = "RAZON_SOCIAL_SUJETO_RETENIDO")
    private String razonSocialSujetoRetenido;
    @Column(name = "IDENTIFICACION_SUJETO_RETENIDO")
    private String identificacionSujetoRetenido;
    @Column(name = "PERIODO_FISCAL")
    private String periodoFiscal;
    @Column(name = "CAMPO_ADICIONAL_NOMBRE1")
    private String campoAdicionalNombre1;
    @Column(name = "CAMPO_ADICIONAL_VALOR1")
    private String campoAdicionalValor1;
    @Column(name = "CAMPO_ADICIONAL_NOMBRE2")
    private String campoAdicionalNombre2;
    @Column(name = "CAMPO_ADICIONAL_VALOR2")
    private String campoAdicionalValor2;
    @Column(name = "CAMPO_ADICIONAL_NOMBRE3")
    private String campoAdicionalNombre3;
    @Column(name = "CAMPO_ADICIONAL_VALOR3")
    private String campoAdicionalValor3;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "CODIGO_NUMERICO")
    private String codigoNumerico;
    @Column(name = "REVISADO")
    private Character revisado;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CONTINGENCIA")
    private Character contingencia;
    @Column(name = "AUTORIZADO")
    private Character autorizado;
    @Column(name = "FECHA_AUTORIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAutorizacion;
    @Column(name = "NUMERO_AUTORIZACION")
    private String numeroAutorizacion;
    @Column(name = "NUMERO_XMLSRI")
    private BigInteger numeroXmlsri;
    @Column(name = "ENVIADO_EMAIL")
    private Character enviadoEmail;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BASE_TARIFA_CERO")
    private BigDecimal baseTarifaCero;
    @Column(name = "BASE_TARIFA_IVA")
    private BigDecimal baseTarifaIva;
    @Column(name = "BASE_IMPONIBLE_IVA")
    private BigDecimal baseImponibleIva;
    @Column(name = "NUMERO_ANULACION")
    private BigInteger numeroAnulacion;
    @Column(name = "ID_RTNELE")
    private BigInteger idRtnele;
    @Column(name = "ESTADO_RETENCION")
    private String estadoRetencion;
    @JoinColumns({
        @JoinColumn(name = "CMP_TPOCMPEMP_EMP_CODIGO", referencedColumnName = "TPOCMPEMP_EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "CMP_TPOCMPEMP_TPOCMP_CODIGO", referencedColumnName = "TPOCMPEMP_TPOCMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "CMP_FECHA", referencedColumnName = "FECHA", insertable = false, updatable = false),
        @JoinColumn(name = "CMP_CLAVE", referencedColumnName = "CLAVE", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Comprobantes comprobantes;
    @OneToMany(mappedBy = "retencionesElectronicas", fetch = FetchType.LAZY)
    private List<RetencionesDtlElectronicas> retencionesDtlElectronicasList;

    public RetencionesElectronicas() {
    }

    public RetencionesElectronicas(RetencionesElectronicasPK retencionesElectronicasPK) {
        this.retencionesElectronicasPK = retencionesElectronicasPK;
    }

    public RetencionesElectronicas(String cmpTpocmpempEmpCodigo, String cmpTpocmpempTpocmpCodigo, Date cmpFecha, long cmpClave, String rtnCaja) {
        this.retencionesElectronicasPK = new RetencionesElectronicasPK(cmpTpocmpempEmpCodigo, cmpTpocmpempTpocmpCodigo, cmpFecha, cmpClave, rtnCaja);
    }

    public RetencionesElectronicasPK getRetencionesElectronicasPK() {
        return retencionesElectronicasPK;
    }

    public void setRetencionesElectronicasPK(RetencionesElectronicasPK retencionesElectronicasPK) {
        this.retencionesElectronicasPK = retencionesElectronicasPK;
    }

    public Short getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Short ambiente) {
        this.ambiente = ambiente;
    }

    public Short getTipoEmision() {
        return tipoEmision;
    }

    public void setTipoEmision(Short tipoEmision) {
        this.tipoEmision = tipoEmision;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(String codDoc) {
        this.codDoc = codDoc;
    }

    public String getEstab() {
        return estab;
    }

    public void setEstab(String estab) {
        this.estab = estab;
    }

    public String getPtoEmision() {
        return ptoEmision;
    }

    public void setPtoEmision(String ptoEmision) {
        this.ptoEmision = ptoEmision;
    }

    public String getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(String secuencial) {
        this.secuencial = secuencial;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTipoIdSujetoRetenido() {
        return tipoIdSujetoRetenido;
    }

    public void setTipoIdSujetoRetenido(String tipoIdSujetoRetenido) {
        this.tipoIdSujetoRetenido = tipoIdSujetoRetenido;
    }

    public String getRazonSocialSujetoRetenido() {
        return razonSocialSujetoRetenido;
    }

    public void setRazonSocialSujetoRetenido(String razonSocialSujetoRetenido) {
        this.razonSocialSujetoRetenido = razonSocialSujetoRetenido;
    }

    public String getIdentificacionSujetoRetenido() {
        return identificacionSujetoRetenido;
    }

    public void setIdentificacionSujetoRetenido(String identificacionSujetoRetenido) {
        this.identificacionSujetoRetenido = identificacionSujetoRetenido;
    }

    public String getPeriodoFiscal() {
        return periodoFiscal;
    }

    public void setPeriodoFiscal(String periodoFiscal) {
        this.periodoFiscal = periodoFiscal;
    }

    public String getCampoAdicionalNombre1() {
        return campoAdicionalNombre1;
    }

    public void setCampoAdicionalNombre1(String campoAdicionalNombre1) {
        this.campoAdicionalNombre1 = campoAdicionalNombre1;
    }

    public String getCampoAdicionalValor1() {
        return campoAdicionalValor1;
    }

    public void setCampoAdicionalValor1(String campoAdicionalValor1) {
        this.campoAdicionalValor1 = campoAdicionalValor1;
    }

    public String getCampoAdicionalNombre2() {
        return campoAdicionalNombre2;
    }

    public void setCampoAdicionalNombre2(String campoAdicionalNombre2) {
        this.campoAdicionalNombre2 = campoAdicionalNombre2;
    }

    public String getCampoAdicionalValor2() {
        return campoAdicionalValor2;
    }

    public void setCampoAdicionalValor2(String campoAdicionalValor2) {
        this.campoAdicionalValor2 = campoAdicionalValor2;
    }

    public String getCampoAdicionalNombre3() {
        return campoAdicionalNombre3;
    }

    public void setCampoAdicionalNombre3(String campoAdicionalNombre3) {
        this.campoAdicionalNombre3 = campoAdicionalNombre3;
    }

    public String getCampoAdicionalValor3() {
        return campoAdicionalValor3;
    }

    public void setCampoAdicionalValor3(String campoAdicionalValor3) {
        this.campoAdicionalValor3 = campoAdicionalValor3;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(String codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public Character getRevisado() {
        return revisado;
    }

    public void setRevisado(Character revisado) {
        this.revisado = revisado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getContingencia() {
        return contingencia;
    }

    public void setContingencia(Character contingencia) {
        this.contingencia = contingencia;
    }

    public Character getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Character autorizado) {
        this.autorizado = autorizado;
    }

    public Date getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(Date fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    public BigInteger getNumeroXmlsri() {
        return numeroXmlsri;
    }

    public void setNumeroXmlsri(BigInteger numeroXmlsri) {
        this.numeroXmlsri = numeroXmlsri;
    }

    public Character getEnviadoEmail() {
        return enviadoEmail;
    }

    public void setEnviadoEmail(Character enviadoEmail) {
        this.enviadoEmail = enviadoEmail;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public BigDecimal getBaseTarifaCero() {
        return baseTarifaCero;
    }

    public void setBaseTarifaCero(BigDecimal baseTarifaCero) {
        this.baseTarifaCero = baseTarifaCero;
    }

    public BigDecimal getBaseTarifaIva() {
        return baseTarifaIva;
    }

    public void setBaseTarifaIva(BigDecimal baseTarifaIva) {
        this.baseTarifaIva = baseTarifaIva;
    }

    public BigDecimal getBaseImponibleIva() {
        return baseImponibleIva;
    }

    public void setBaseImponibleIva(BigDecimal baseImponibleIva) {
        this.baseImponibleIva = baseImponibleIva;
    }

    public BigInteger getNumeroAnulacion() {
        return numeroAnulacion;
    }

    public void setNumeroAnulacion(BigInteger numeroAnulacion) {
        this.numeroAnulacion = numeroAnulacion;
    }

    public BigInteger getIdRtnele() {
        return idRtnele;
    }

    public void setIdRtnele(BigInteger idRtnele) {
        this.idRtnele = idRtnele;
    }

    public String getEstadoRetencion() {
        return estadoRetencion;
    }

    public void setEstadoRetencion(String estadoRetencion) {
        this.estadoRetencion = estadoRetencion;
    }

    public Comprobantes getComprobantes() {
        return comprobantes;
    }

    public void setComprobantes(Comprobantes comprobantes) {
        this.comprobantes = comprobantes;
    }

    public List<RetencionesDtlElectronicas> getRetencionesDtlElectronicasList() {
        return retencionesDtlElectronicasList;
    }

    public void setRetencionesDtlElectronicasList(List<RetencionesDtlElectronicas> retencionesDtlElectronicasList) {
        this.retencionesDtlElectronicasList = retencionesDtlElectronicasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retencionesElectronicasPK != null ? retencionesElectronicasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesElectronicas)) {
            return false;
        }
        RetencionesElectronicas other = (RetencionesElectronicas) object;
        if ((this.retencionesElectronicasPK == null && other.retencionesElectronicasPK != null) || (this.retencionesElectronicasPK != null && !this.retencionesElectronicasPK.equals(other.retencionesElectronicasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RetencionesElectronicas[ retencionesElectronicasPK=" + retencionesElectronicasPK + " ]";
    }
    
}
