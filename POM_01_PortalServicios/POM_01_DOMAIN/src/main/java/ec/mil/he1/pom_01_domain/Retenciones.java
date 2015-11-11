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
@Table(name = "RETENCIONES")
@NamedQueries({
    @NamedQuery(name = "Retenciones.findAll", query = "SELECT r FROM Retenciones r")})
public class Retenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RetencionesPK retencionesPK;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "TPOCMPEMP_TPOCMP_CODIGO")
    private String tpocmpempTpocmpCodigo;
    @Column(name = "CONCEPTO")
    private String concepto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_FACTURADO")
    private BigDecimal totalFacturado;
    @Column(name = "TOTAL_IVA")
    private BigDecimal totalIva;
    @Column(name = "TOTAL_RETENIDO")
    private BigDecimal totalRetenido;
    @Column(name = "TIPO_RETENIDO")
    private String tipoRetenido;
    @Column(name = "MONEDA_DE_TRABAJO")
    private String monedaDeTrabajo;
    @Column(name = "PRD_CODIGO")
    private Short prdCodigo;
    @Column(name = "RETENIDO_A")
    private String retenidoA;
    @Column(name = "RUC")
    private String ruc;
    @Column(name = "ESTADO")
    private Character estado;
    @Column(name = "TIPO_DE_CAMBIO")
    private BigDecimal tipoDeCambio;
    @Column(name = "MONEDA_LOCAL")
    private String monedaLocal;
    @Column(name = "AUTORIZACION_SRI")
    private String autorizacionSri;
    @Column(name = "SERIE_SRI")
    private String serieSri;
    @Column(name = "SECUENCIA_SRI")
    private Integer secuenciaSri;

    public Retenciones() {
    }

    public Retenciones(RetencionesPK retencionesPK) {
        this.retencionesPK = retencionesPK;
    }

    public Retenciones(int numero, String tportnempEmpCodigo, short tportnempTportnCodigo) {
        this.retencionesPK = new RetencionesPK(numero, tportnempEmpCodigo, tportnempTportnCodigo);
    }

    public RetencionesPK getRetencionesPK() {
        return retencionesPK;
    }

    public void setRetencionesPK(RetencionesPK retencionesPK) {
        this.retencionesPK = retencionesPK;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public String getTpocmpempTpocmpCodigo() {
        return tpocmpempTpocmpCodigo;
    }

    public void setTpocmpempTpocmpCodigo(String tpocmpempTpocmpCodigo) {
        this.tpocmpempTpocmpCodigo = tpocmpempTpocmpCodigo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public BigDecimal getTotalFacturado() {
        return totalFacturado;
    }

    public void setTotalFacturado(BigDecimal totalFacturado) {
        this.totalFacturado = totalFacturado;
    }

    public BigDecimal getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(BigDecimal totalIva) {
        this.totalIva = totalIva;
    }

    public BigDecimal getTotalRetenido() {
        return totalRetenido;
    }

    public void setTotalRetenido(BigDecimal totalRetenido) {
        this.totalRetenido = totalRetenido;
    }

    public String getTipoRetenido() {
        return tipoRetenido;
    }

    public void setTipoRetenido(String tipoRetenido) {
        this.tipoRetenido = tipoRetenido;
    }

    public String getMonedaDeTrabajo() {
        return monedaDeTrabajo;
    }

    public void setMonedaDeTrabajo(String monedaDeTrabajo) {
        this.monedaDeTrabajo = monedaDeTrabajo;
    }

    public Short getPrdCodigo() {
        return prdCodigo;
    }

    public void setPrdCodigo(Short prdCodigo) {
        this.prdCodigo = prdCodigo;
    }

    public String getRetenidoA() {
        return retenidoA;
    }

    public void setRetenidoA(String retenidoA) {
        this.retenidoA = retenidoA;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public BigDecimal getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(BigDecimal tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public String getMonedaLocal() {
        return monedaLocal;
    }

    public void setMonedaLocal(String monedaLocal) {
        this.monedaLocal = monedaLocal;
    }

    public String getAutorizacionSri() {
        return autorizacionSri;
    }

    public void setAutorizacionSri(String autorizacionSri) {
        this.autorizacionSri = autorizacionSri;
    }

    public String getSerieSri() {
        return serieSri;
    }

    public void setSerieSri(String serieSri) {
        this.serieSri = serieSri;
    }

    public Integer getSecuenciaSri() {
        return secuenciaSri;
    }

    public void setSecuenciaSri(Integer secuenciaSri) {
        this.secuenciaSri = secuenciaSri;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retencionesPK != null ? retencionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retenciones)) {
            return false;
        }
        Retenciones other = (Retenciones) object;
        if ((this.retencionesPK == null && other.retencionesPK != null) || (this.retencionesPK != null && !this.retencionesPK.equals(other.retencionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Retenciones[ retencionesPK=" + retencionesPK + " ]";
    }
    
}
