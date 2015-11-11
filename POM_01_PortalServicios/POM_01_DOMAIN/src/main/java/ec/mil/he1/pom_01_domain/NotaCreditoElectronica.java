/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "NOTA_CREDITO_ELECTRONICA")
@NamedQueries({
    @NamedQuery(name = "NotaCreditoElectronica.findAll", query = "SELECT n FROM NotaCreditoElectronica n")})
public class NotaCreditoElectronica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NotaCreditoElectronicaPK notaCreditoElectronicaPK;
    @Column(name = "FCT_CAJA")
    private String fctCaja;
    @Column(name = "FCT_NUMERO")
    private Integer fctNumero;
    @Column(name = "AMBIENTE")
    private Short ambiente;
    @Column(name = "TIPO_EMISION")
    private Short tipoEmision;
    @Column(name = "COD_EMPRESA")
    private String codEmpresa;
    @Column(name = "CLAVE_ACCESO")
    private String claveAcceso;
    @Column(name = "COD_DOC")
    private String codDoc;
    @Column(name = "ESTAB")
    private String estab;
    @Column(name = "PTO_EMI")
    private String ptoEmi;
    @Column(name = "SECUENCIAL")
    private String secuencial;
    @Column(name = "FECHA_EMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "TIPO_CODIGO_CLIENTE")
    private String tipoCodigoCliente;
    @Column(name = "CODIGO_CLIENTE")
    private String codigoCliente;
    @Column(name = "TIPOID_COMPRADOR")
    private String tipoidComprador;
    @Column(name = "OBLIGADO_CONTABILIDAD")
    private String obligadoContabilidad;
    @Column(name = "RISE")
    private String rise;
    @Column(name = "COD_DOC_MODIFICADO")
    private String codDocModificado;
    @Column(name = "NUM_DOC_MODIFICADO")
    private String numDocModificado;
    @Column(name = "FECHA_EMISION_DOC_SUSTENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmisionDocSustento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_SIN_IMPUESTOS")
    private BigDecimal totalSinImpuestos;
    @Column(name = "VALOR_MODIFICACION")
    private BigDecimal valorModificacion;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "CONTINGENCIA")
    private Character contingencia;
    @Column(name = "AUTORIZADO")
    private Character autorizado;
    @Column(name = "NUMERO_AUTORIZACION")
    private String numeroAutorizacion;
    @Column(name = "SERIE")
    private String serie;
    @Column(name = "CODIGO_NUMERICO")
    private String codigoNumerico;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "REVISADO")
    private Character revisado;
    @Column(name = "FECHA_AUTORIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAutorizacion;
    @Column(name = "NUMERO_XMLSRI")
    private BigInteger numeroXmlsri;
    @Column(name = "CAMPO_ADICIONAL_NOMBRE1")
    private String campoAdicionalNombre1;
    @Column(name = "CAMPO_ADICIONAL_VALOR1")
    private String campoAdicionalValor1;
    @Column(name = "CAMPO_ADICIONAL_NOMBRE2")
    private String campoAdicionalNombre2;
    @Column(name = "CAMPO_ADICIONAL_VALOR2")
    private String campoAdicionalValor2;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "ENVIADO_EMAIL")
    private Character enviadoEmail;

    public NotaCreditoElectronica() {
    }

    public NotaCreditoElectronica(NotaCreditoElectronicaPK notaCreditoElectronicaPK) {
        this.notaCreditoElectronicaPK = notaCreditoElectronicaPK;
    }

    public NotaCreditoElectronica(String ncrCaja, int ncrNumero) {
        this.notaCreditoElectronicaPK = new NotaCreditoElectronicaPK(ncrCaja, ncrNumero);
    }

    public NotaCreditoElectronicaPK getNotaCreditoElectronicaPK() {
        return notaCreditoElectronicaPK;
    }

    public void setNotaCreditoElectronicaPK(NotaCreditoElectronicaPK notaCreditoElectronicaPK) {
        this.notaCreditoElectronicaPK = notaCreditoElectronicaPK;
    }

    public String getFctCaja() {
        return fctCaja;
    }

    public void setFctCaja(String fctCaja) {
        this.fctCaja = fctCaja;
    }

    public Integer getFctNumero() {
        return fctNumero;
    }

    public void setFctNumero(Integer fctNumero) {
        this.fctNumero = fctNumero;
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

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
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

    public String getPtoEmi() {
        return ptoEmi;
    }

    public void setPtoEmi(String ptoEmi) {
        this.ptoEmi = ptoEmi;
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

    public String getTipoCodigoCliente() {
        return tipoCodigoCliente;
    }

    public void setTipoCodigoCliente(String tipoCodigoCliente) {
        this.tipoCodigoCliente = tipoCodigoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTipoidComprador() {
        return tipoidComprador;
    }

    public void setTipoidComprador(String tipoidComprador) {
        this.tipoidComprador = tipoidComprador;
    }

    public String getObligadoContabilidad() {
        return obligadoContabilidad;
    }

    public void setObligadoContabilidad(String obligadoContabilidad) {
        this.obligadoContabilidad = obligadoContabilidad;
    }

    public String getRise() {
        return rise;
    }

    public void setRise(String rise) {
        this.rise = rise;
    }

    public String getCodDocModificado() {
        return codDocModificado;
    }

    public void setCodDocModificado(String codDocModificado) {
        this.codDocModificado = codDocModificado;
    }

    public String getNumDocModificado() {
        return numDocModificado;
    }

    public void setNumDocModificado(String numDocModificado) {
        this.numDocModificado = numDocModificado;
    }

    public Date getFechaEmisionDocSustento() {
        return fechaEmisionDocSustento;
    }

    public void setFechaEmisionDocSustento(Date fechaEmisionDocSustento) {
        this.fechaEmisionDocSustento = fechaEmisionDocSustento;
    }

    public BigDecimal getTotalSinImpuestos() {
        return totalSinImpuestos;
    }

    public void setTotalSinImpuestos(BigDecimal totalSinImpuestos) {
        this.totalSinImpuestos = totalSinImpuestos;
    }

    public BigDecimal getValorModificacion() {
        return valorModificacion;
    }

    public void setValorModificacion(BigDecimal valorModificacion) {
        this.valorModificacion = valorModificacion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
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

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getRevisado() {
        return revisado;
    }

    public void setRevisado(Character revisado) {
        this.revisado = revisado;
    }

    public Date getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(Date fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public BigInteger getNumeroXmlsri() {
        return numeroXmlsri;
    }

    public void setNumeroXmlsri(BigInteger numeroXmlsri) {
        this.numeroXmlsri = numeroXmlsri;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Character getEnviadoEmail() {
        return enviadoEmail;
    }

    public void setEnviadoEmail(Character enviadoEmail) {
        this.enviadoEmail = enviadoEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notaCreditoElectronicaPK != null ? notaCreditoElectronicaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaCreditoElectronica)) {
            return false;
        }
        NotaCreditoElectronica other = (NotaCreditoElectronica) object;
        if ((this.notaCreditoElectronicaPK == null && other.notaCreditoElectronicaPK != null) || (this.notaCreditoElectronicaPK != null && !this.notaCreditoElectronicaPK.equals(other.notaCreditoElectronicaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.NotaCreditoElectronica[ notaCreditoElectronicaPK=" + notaCreditoElectronicaPK + " ]";
    }
    
}
