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
@Table(name = "PAGOS_CM")
@NamedQueries({
    @NamedQuery(name = "PagosCm.findAll", query = "SELECT p FROM PagosCm p")})
public class PagosCm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "MDOPGO_NUMERO")
    private Short mdopgoNumero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    @Column(name = "PLNHNRMDC_NUMERO")
    private Integer plnhnrmdcNumero;
    @Column(name = "FECHA_CONTABILIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContabilizacion;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "RETENCION")
    private BigDecimal retencion;
    @Column(name = "SUBRETENCION")
    private BigDecimal subretencion;
    @Column(name = "CJA_CODIGO")
    private String cjaCodigo;
    @Column(name = "ANT_NUMERO")
    private Integer antNumero;
    @Column(name = "FORMULA_RETENCION")
    private String formulaRetencion;
    @Column(name = "FECHA_RF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRf;
    @Column(name = "ESTADO_RF")
    private String estadoRf;
    @Column(name = "CODIGO_RF")
    private String codigoRf;

    public PagosCm() {
    }

    public PagosCm(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Short getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(Short mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getPlnhnrmdcNumero() {
        return plnhnrmdcNumero;
    }

    public void setPlnhnrmdcNumero(Integer plnhnrmdcNumero) {
        this.plnhnrmdcNumero = plnhnrmdcNumero;
    }

    public Date getFechaContabilizacion() {
        return fechaContabilizacion;
    }

    public void setFechaContabilizacion(Date fechaContabilizacion) {
        this.fechaContabilizacion = fechaContabilizacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
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

    public String getCjaCodigo() {
        return cjaCodigo;
    }

    public void setCjaCodigo(String cjaCodigo) {
        this.cjaCodigo = cjaCodigo;
    }

    public Integer getAntNumero() {
        return antNumero;
    }

    public void setAntNumero(Integer antNumero) {
        this.antNumero = antNumero;
    }

    public String getFormulaRetencion() {
        return formulaRetencion;
    }

    public void setFormulaRetencion(String formulaRetencion) {
        this.formulaRetencion = formulaRetencion;
    }

    public Date getFechaRf() {
        return fechaRf;
    }

    public void setFechaRf(Date fechaRf) {
        this.fechaRf = fechaRf;
    }

    public String getEstadoRf() {
        return estadoRf;
    }

    public void setEstadoRf(String estadoRf) {
        this.estadoRf = estadoRf;
    }

    public String getCodigoRf() {
        return codigoRf;
    }

    public void setCodigoRf(String codigoRf) {
        this.codigoRf = codigoRf;
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
        if (!(object instanceof PagosCm)) {
            return false;
        }
        PagosCm other = (PagosCm) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PagosCm[ numero=" + numero + " ]";
    }
    
}
