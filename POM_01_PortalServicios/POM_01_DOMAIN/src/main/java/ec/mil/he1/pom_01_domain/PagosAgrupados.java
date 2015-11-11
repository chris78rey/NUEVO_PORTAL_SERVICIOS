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
@Table(name = "PAGOS_AGRUPADOS")
@NamedQueries({
    @NamedQuery(name = "PagosAgrupados.findAll", query = "SELECT p FROM PagosAgrupados p")})
public class PagosAgrupados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "CJA_CODIGO")
    private String cjaCodigo;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "FECHA_PAGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    @Column(name = "REALIZADO_POR")
    private String realizadoPor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_TOTAL")
    private BigDecimal valorTotal;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "TASA_SERVICIO")
    private BigDecimal tasaServicio;
    @Column(name = "RETENCION_FUENTE")
    private BigDecimal retencionFuente;
    @Column(name = "FORMULA_RETENCION")
    private String formulaRetencion;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "RETIENE_IVA")
    private String retieneIva;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CODIGO_RF")
    private String codigoRf;
    @Column(name = "AMORTIZADO")
    private Character amortizado;

    public PagosAgrupados() {
    }

    public PagosAgrupados(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCjaCodigo() {
        return cjaCodigo;
    }

    public void setCjaCodigo(String cjaCodigo) {
        this.cjaCodigo = cjaCodigo;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getRealizadoPor() {
        return realizadoPor;
    }

    public void setRealizadoPor(String realizadoPor) {
        this.realizadoPor = realizadoPor;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public BigDecimal getTasaServicio() {
        return tasaServicio;
    }

    public void setTasaServicio(BigDecimal tasaServicio) {
        this.tasaServicio = tasaServicio;
    }

    public BigDecimal getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(BigDecimal retencionFuente) {
        this.retencionFuente = retencionFuente;
    }

    public String getFormulaRetencion() {
        return formulaRetencion;
    }

    public void setFormulaRetencion(String formulaRetencion) {
        this.formulaRetencion = formulaRetencion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getRetieneIva() {
        return retieneIva;
    }

    public void setRetieneIva(String retieneIva) {
        this.retieneIva = retieneIva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoRf() {
        return codigoRf;
    }

    public void setCodigoRf(String codigoRf) {
        this.codigoRf = codigoRf;
    }

    public Character getAmortizado() {
        return amortizado;
    }

    public void setAmortizado(Character amortizado) {
        this.amortizado = amortizado;
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
        if (!(object instanceof PagosAgrupados)) {
            return false;
        }
        PagosAgrupados other = (PagosAgrupados) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PagosAgrupados[ numero=" + numero + " ]";
    }
    
}
