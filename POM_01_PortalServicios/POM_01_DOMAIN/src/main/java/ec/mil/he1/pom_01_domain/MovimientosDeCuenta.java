/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "MOVIMIENTOS_DE_CUENTA")
@NamedQueries({
    @NamedQuery(name = "MovimientosDeCuenta.findAll", query = "SELECT m FROM MovimientosDeCuenta m")})
public class MovimientosDeCuenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "MVMCTA_TYPE")
    private String mvmctaType;
    @Column(name = "ENTBNF_MSTBNF_CODIGO")
    private String entbnfMstbnfCodigo;
    @Column(name = "ENTBNF_CODIGO")
    private Integer entbnfCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "IMPUESTO")
    private BigDecimal impuesto;
    @Column(name = "USO_DE_INSTALACIONES")
    private BigDecimal usoDeInstalaciones;
    @Column(name = "DTLRGL_CM_NUMERO")
    private Integer dtlrglCmNumero;
    @Column(name = "PGS_CM_NUMERO")
    private Integer pgsCmNumero;
    @Column(name = "DTLRGL_CM_RGL_CM_NUMERO")
    private Integer dtlrglCmRglCmNumero;
    @Column(name = "EGRCJAMDC_NUMERO")
    private Integer egrcjamdcNumero;
    @Column(name = "CNCPGOHNR_NUMERO")
    private Integer cncpgohnrNumero;
    @Column(name = "DSCAGR_NUMERO")
    private Integer dscagrNumero;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FACTURAS")
    private String facturas;
    @Column(name = "REMUNERACION_POR")
    private String remuneracionPor;
    @Column(name = "CHEQUE_SEGUROS")
    private Character chequeSeguros;
    @Column(name = "SEGURO_RETIENE_5")
    private Character seguroRetiene5;
    @Column(name = "DISCRIMINADOR_AJUSTE")
    private String discriminadorAjuste;
    @Column(name = "MVMCTA_NUMERO")
    private Integer mvmctaNumero;
    @Column(name = "RETENCION")
    private BigDecimal retencion;
    @Column(name = "SUBRETENCION")
    private BigDecimal subretencion;
    @Column(name = "ICC")
    private BigDecimal icc;
    @Column(name = "TIPO_AJUSTE")
    private String tipoAjuste;
    @Column(name = "EXTERNO")
    private Character externo;
    @Column(name = "FECHA_ENTREGA_CHEQUE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntregaCheque;

    public MovimientosDeCuenta() {
    }

    public MovimientosDeCuenta(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getMvmctaType() {
        return mvmctaType;
    }

    public void setMvmctaType(String mvmctaType) {
        this.mvmctaType = mvmctaType;
    }

    public String getEntbnfMstbnfCodigo() {
        return entbnfMstbnfCodigo;
    }

    public void setEntbnfMstbnfCodigo(String entbnfMstbnfCodigo) {
        this.entbnfMstbnfCodigo = entbnfMstbnfCodigo;
    }

    public Integer getEntbnfCodigo() {
        return entbnfCodigo;
    }

    public void setEntbnfCodigo(Integer entbnfCodigo) {
        this.entbnfCodigo = entbnfCodigo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(BigDecimal impuesto) {
        this.impuesto = impuesto;
    }

    public BigDecimal getUsoDeInstalaciones() {
        return usoDeInstalaciones;
    }

    public void setUsoDeInstalaciones(BigDecimal usoDeInstalaciones) {
        this.usoDeInstalaciones = usoDeInstalaciones;
    }

    public Integer getDtlrglCmNumero() {
        return dtlrglCmNumero;
    }

    public void setDtlrglCmNumero(Integer dtlrglCmNumero) {
        this.dtlrglCmNumero = dtlrglCmNumero;
    }

    public Integer getPgsCmNumero() {
        return pgsCmNumero;
    }

    public void setPgsCmNumero(Integer pgsCmNumero) {
        this.pgsCmNumero = pgsCmNumero;
    }

    public Integer getDtlrglCmRglCmNumero() {
        return dtlrglCmRglCmNumero;
    }

    public void setDtlrglCmRglCmNumero(Integer dtlrglCmRglCmNumero) {
        this.dtlrglCmRglCmNumero = dtlrglCmRglCmNumero;
    }

    public Integer getEgrcjamdcNumero() {
        return egrcjamdcNumero;
    }

    public void setEgrcjamdcNumero(Integer egrcjamdcNumero) {
        this.egrcjamdcNumero = egrcjamdcNumero;
    }

    public Integer getCncpgohnrNumero() {
        return cncpgohnrNumero;
    }

    public void setCncpgohnrNumero(Integer cncpgohnrNumero) {
        this.cncpgohnrNumero = cncpgohnrNumero;
    }

    public Integer getDscagrNumero() {
        return dscagrNumero;
    }

    public void setDscagrNumero(Integer dscagrNumero) {
        this.dscagrNumero = dscagrNumero;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFacturas() {
        return facturas;
    }

    public void setFacturas(String facturas) {
        this.facturas = facturas;
    }

    public String getRemuneracionPor() {
        return remuneracionPor;
    }

    public void setRemuneracionPor(String remuneracionPor) {
        this.remuneracionPor = remuneracionPor;
    }

    public Character getChequeSeguros() {
        return chequeSeguros;
    }

    public void setChequeSeguros(Character chequeSeguros) {
        this.chequeSeguros = chequeSeguros;
    }

    public Character getSeguroRetiene5() {
        return seguroRetiene5;
    }

    public void setSeguroRetiene5(Character seguroRetiene5) {
        this.seguroRetiene5 = seguroRetiene5;
    }

    public String getDiscriminadorAjuste() {
        return discriminadorAjuste;
    }

    public void setDiscriminadorAjuste(String discriminadorAjuste) {
        this.discriminadorAjuste = discriminadorAjuste;
    }

    public Integer getMvmctaNumero() {
        return mvmctaNumero;
    }

    public void setMvmctaNumero(Integer mvmctaNumero) {
        this.mvmctaNumero = mvmctaNumero;
    }

    public BigDecimal getRetencion() {
        return retencion;
    }

    public void setRetencion(BigDecimal retencion) {
        this.retencion = retencion;
    }

    public BigDecimal getSubretencion() {
        return subretencion;
    }

    public void setSubretencion(BigDecimal subretencion) {
        this.subretencion = subretencion;
    }

    public BigDecimal getIcc() {
        return icc;
    }

    public void setIcc(BigDecimal icc) {
        this.icc = icc;
    }

    public String getTipoAjuste() {
        return tipoAjuste;
    }

    public void setTipoAjuste(String tipoAjuste) {
        this.tipoAjuste = tipoAjuste;
    }

    public Character getExterno() {
        return externo;
    }

    public void setExterno(Character externo) {
        this.externo = externo;
    }

    public Date getFechaEntregaCheque() {
        return fechaEntregaCheque;
    }

    public void setFechaEntregaCheque(Date fechaEntregaCheque) {
        this.fechaEntregaCheque = fechaEntregaCheque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosDeCuenta)) {
            return false;
        }
        MovimientosDeCuenta other = (MovimientosDeCuenta) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MovimientosDeCuenta[ numero=" + numero + " ]";
    }
    
}
