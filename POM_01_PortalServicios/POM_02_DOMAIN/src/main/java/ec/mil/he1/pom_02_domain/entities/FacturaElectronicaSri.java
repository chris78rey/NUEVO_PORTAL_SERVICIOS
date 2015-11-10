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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "FACTURA_ELECTRONICA_SRI")
@NamedQueries({
    @NamedQuery(name = "FacturaElectronicaSri.findAll", query = "SELECT f FROM FacturaElectronicaSri f")})
public class FacturaElectronicaSri implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacturaElectronicaSriPK facturaElectronicaSriPK;
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    @Column(name = "NOMBRE_COMERCIAL")
    private String nombreComercial;
    @Column(name = "RUC")
    private String ruc;
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
    @Column(name = "DIR_MATRIZ")
    private String dirMatriz;
    @Column(name = "FECHA_EMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "DIR_ESTABLECIMIENTO")
    private String dirEstablecimiento;
    @Column(name = "CONTRIBUYENTE_ESPECIAL")
    private Integer contribuyenteEspecial;
    @Column(name = "OBLIGADO_CONTABILIDAD")
    private String obligadoContabilidad;
    @Column(name = "TIPOID_COMPRADOR")
    private String tipoidComprador;
    @Column(name = "GUIA_REMISION")
    private String guiaRemision;
    @Column(name = "RAZON_SOCIAL_COMPRADOR")
    private String razonSocialComprador;
    @Column(name = "IDENTIFICACION_COMPRADOR")
    private String identificacionComprador;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_SIN_IMPUESTO")
    private BigDecimal totalSinImpuesto;
    @Column(name = "TOTAL_DESCUENTO")
    private BigDecimal totalDescuento;
    @Column(name = "PROPINA")
    private BigDecimal propina;
    @Column(name = "IMPORTE_TOTAL")
    private BigDecimal importeTotal;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "AMBIENTE")
    private Short ambiente;
    @Column(name = "TIPO_EMISION")
    private Short tipoEmision;
    @Column(name = "CAMPO_ADICIONAL1_NOMBRE")
    private String campoAdicional1Nombre;
    @Column(name = "CAMPO_ADICIONAL1_VALOR")
    private String campoAdicional1Valor;
    @Column(name = "CAMPO_ADICIONAL2_NOMBRE")
    private String campoAdicional2Nombre;
    @Column(name = "CAMPO_ADICIONAL2_VALOR")
    private String campoAdicional2Valor;
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
    @Column(name = "ENVIADO_EMAIL")
    private Character enviadoEmail;
    @JoinColumns({
        @JoinColumn(name = "FCT_CAJA", referencedColumnName = "CAJA", insertable = false, updatable = false),
        @JoinColumn(name = "FCT_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Facturas facturas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaElectronicaSri", fetch = FetchType.LAZY)
    private List<FacturaElectronicaDtlSri> facturaElectronicaDtlSriList;

    public FacturaElectronicaSri() {
    }

    public FacturaElectronicaSri(FacturaElectronicaSriPK facturaElectronicaSriPK) {
        this.facturaElectronicaSriPK = facturaElectronicaSriPK;
    }

    public FacturaElectronicaSri(String fctCaja, int fctNumero) {
        this.facturaElectronicaSriPK = new FacturaElectronicaSriPK(fctCaja, fctNumero);
    }

    public FacturaElectronicaSriPK getFacturaElectronicaSriPK() {
        return facturaElectronicaSriPK;
    }

    public void setFacturaElectronicaSriPK(FacturaElectronicaSriPK facturaElectronicaSriPK) {
        this.facturaElectronicaSriPK = facturaElectronicaSriPK;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
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

    public String getDirMatriz() {
        return dirMatriz;
    }

    public void setDirMatriz(String dirMatriz) {
        this.dirMatriz = dirMatriz;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getDirEstablecimiento() {
        return dirEstablecimiento;
    }

    public void setDirEstablecimiento(String dirEstablecimiento) {
        this.dirEstablecimiento = dirEstablecimiento;
    }

    public Integer getContribuyenteEspecial() {
        return contribuyenteEspecial;
    }

    public void setContribuyenteEspecial(Integer contribuyenteEspecial) {
        this.contribuyenteEspecial = contribuyenteEspecial;
    }

    public String getObligadoContabilidad() {
        return obligadoContabilidad;
    }

    public void setObligadoContabilidad(String obligadoContabilidad) {
        this.obligadoContabilidad = obligadoContabilidad;
    }

    public String getTipoidComprador() {
        return tipoidComprador;
    }

    public void setTipoidComprador(String tipoidComprador) {
        this.tipoidComprador = tipoidComprador;
    }

    public String getGuiaRemision() {
        return guiaRemision;
    }

    public void setGuiaRemision(String guiaRemision) {
        this.guiaRemision = guiaRemision;
    }

    public String getRazonSocialComprador() {
        return razonSocialComprador;
    }

    public void setRazonSocialComprador(String razonSocialComprador) {
        this.razonSocialComprador = razonSocialComprador;
    }

    public String getIdentificacionComprador() {
        return identificacionComprador;
    }

    public void setIdentificacionComprador(String identificacionComprador) {
        this.identificacionComprador = identificacionComprador;
    }

    public BigDecimal getTotalSinImpuesto() {
        return totalSinImpuesto;
    }

    public void setTotalSinImpuesto(BigDecimal totalSinImpuesto) {
        this.totalSinImpuesto = totalSinImpuesto;
    }

    public BigDecimal getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(BigDecimal totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public BigDecimal getPropina() {
        return propina;
    }

    public void setPropina(BigDecimal propina) {
        this.propina = propina;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
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

    public String getCampoAdicional1Nombre() {
        return campoAdicional1Nombre;
    }

    public void setCampoAdicional1Nombre(String campoAdicional1Nombre) {
        this.campoAdicional1Nombre = campoAdicional1Nombre;
    }

    public String getCampoAdicional1Valor() {
        return campoAdicional1Valor;
    }

    public void setCampoAdicional1Valor(String campoAdicional1Valor) {
        this.campoAdicional1Valor = campoAdicional1Valor;
    }

    public String getCampoAdicional2Nombre() {
        return campoAdicional2Nombre;
    }

    public void setCampoAdicional2Nombre(String campoAdicional2Nombre) {
        this.campoAdicional2Nombre = campoAdicional2Nombre;
    }

    public String getCampoAdicional2Valor() {
        return campoAdicional2Valor;
    }

    public void setCampoAdicional2Valor(String campoAdicional2Valor) {
        this.campoAdicional2Valor = campoAdicional2Valor;
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

    public Character getEnviadoEmail() {
        return enviadoEmail;
    }

    public void setEnviadoEmail(Character enviadoEmail) {
        this.enviadoEmail = enviadoEmail;
    }

    public Facturas getFacturas() {
        return facturas;
    }

    public void setFacturas(Facturas facturas) {
        this.facturas = facturas;
    }

    public List<FacturaElectronicaDtlSri> getFacturaElectronicaDtlSriList() {
        return facturaElectronicaDtlSriList;
    }

    public void setFacturaElectronicaDtlSriList(List<FacturaElectronicaDtlSri> facturaElectronicaDtlSriList) {
        this.facturaElectronicaDtlSriList = facturaElectronicaDtlSriList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturaElectronicaSriPK != null ? facturaElectronicaSriPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaElectronicaSri)) {
            return false;
        }
        FacturaElectronicaSri other = (FacturaElectronicaSri) object;
        if ((this.facturaElectronicaSriPK == null && other.facturaElectronicaSriPK != null) || (this.facturaElectronicaSriPK != null && !this.facturaElectronicaSriPK.equals(other.facturaElectronicaSriPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.FacturaElectronicaSri[ facturaElectronicaSriPK=" + facturaElectronicaSriPK + " ]";
    }
    
}
