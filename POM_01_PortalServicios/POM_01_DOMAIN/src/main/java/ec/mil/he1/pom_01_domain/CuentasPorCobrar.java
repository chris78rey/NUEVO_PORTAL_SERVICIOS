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
@Table(name = "CUENTAS_POR_COBRAR")
@NamedQueries({
    @NamedQuery(name = "CuentasPorCobrar.findAll", query = "SELECT c FROM CuentasPorCobrar c")})
public class CuentasPorCobrar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "MONEDA_DE_TRABAJO")
    private String monedaDeTrabajo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "SALDO")
    private BigDecimal saldo;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "SALDO_IVA")
    private BigDecimal saldoIva;
    @Column(name = "INTERES")
    private BigDecimal interes;
    @Column(name = "NUMERO_PAGOS")
    private Short numeroPagos;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "TOTALE")
    private BigDecimal totale;
    @Column(name = "SALDOE")
    private BigDecimal saldoe;
    @Column(name = "IVAE")
    private BigDecimal ivae;
    @Column(name = "SALDO_IVA_E")
    private BigDecimal saldoIvaE;
    @Column(name = "NUMERO_CLAVE")
    private Long numeroClave;
    @Column(name = "CJA_CODIGO")
    private String cjaCodigo;
    @Column(name = "MDOPGO_NUMERO")
    private Short mdopgoNumero;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "CLNPGA_TIPO_CODIGO_CONYUGE")
    private String clnpgaTipoCodigoConyuge;
    @Column(name = "CLNPGA_CODIGO_CONYUGE")
    private String clnpgaCodigoConyuge;
    @Column(name = "CLNPGA_TIPO_CODIGO_GARANTE")
    private String clnpgaTipoCodigoGarante;
    @Column(name = "CLNPGA_CODIGO_GARANTE")
    private String clnpgaCodigoGarante;
    @Column(name = "CLNPGA_TIPO_CODIGO_GARANTE_CON")
    private String clnpgaTipoCodigoGaranteCon;
    @Column(name = "CLNPGA_CODIGO_GARANTE_CON")
    private String clnpgaCodigoGaranteCon;
    @Column(name = "FACTOR_PERIODO")
    private Short factorPeriodo;

    public CuentasPorCobrar() {
    }

    public CuentasPorCobrar(Long numero) {
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getMonedaDeTrabajo() {
        return monedaDeTrabajo;
    }

    public void setMonedaDeTrabajo(String monedaDeTrabajo) {
        this.monedaDeTrabajo = monedaDeTrabajo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getSaldoIva() {
        return saldoIva;
    }

    public void setSaldoIva(BigDecimal saldoIva) {
        this.saldoIva = saldoIva;
    }

    public BigDecimal getInteres() {
        return interes;
    }

    public void setInteres(BigDecimal interes) {
        this.interes = interes;
    }

    public Short getNumeroPagos() {
        return numeroPagos;
    }

    public void setNumeroPagos(Short numeroPagos) {
        this.numeroPagos = numeroPagos;
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

    public BigDecimal getTotale() {
        return totale;
    }

    public void setTotale(BigDecimal totale) {
        this.totale = totale;
    }

    public BigDecimal getSaldoe() {
        return saldoe;
    }

    public void setSaldoe(BigDecimal saldoe) {
        this.saldoe = saldoe;
    }

    public BigDecimal getIvae() {
        return ivae;
    }

    public void setIvae(BigDecimal ivae) {
        this.ivae = ivae;
    }

    public BigDecimal getSaldoIvaE() {
        return saldoIvaE;
    }

    public void setSaldoIvaE(BigDecimal saldoIvaE) {
        this.saldoIvaE = saldoIvaE;
    }

    public Long getNumeroClave() {
        return numeroClave;
    }

    public void setNumeroClave(Long numeroClave) {
        this.numeroClave = numeroClave;
    }

    public String getCjaCodigo() {
        return cjaCodigo;
    }

    public void setCjaCodigo(String cjaCodigo) {
        this.cjaCodigo = cjaCodigo;
    }

    public Short getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(Short mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getClnpgaTipoCodigoConyuge() {
        return clnpgaTipoCodigoConyuge;
    }

    public void setClnpgaTipoCodigoConyuge(String clnpgaTipoCodigoConyuge) {
        this.clnpgaTipoCodigoConyuge = clnpgaTipoCodigoConyuge;
    }

    public String getClnpgaCodigoConyuge() {
        return clnpgaCodigoConyuge;
    }

    public void setClnpgaCodigoConyuge(String clnpgaCodigoConyuge) {
        this.clnpgaCodigoConyuge = clnpgaCodigoConyuge;
    }

    public String getClnpgaTipoCodigoGarante() {
        return clnpgaTipoCodigoGarante;
    }

    public void setClnpgaTipoCodigoGarante(String clnpgaTipoCodigoGarante) {
        this.clnpgaTipoCodigoGarante = clnpgaTipoCodigoGarante;
    }

    public String getClnpgaCodigoGarante() {
        return clnpgaCodigoGarante;
    }

    public void setClnpgaCodigoGarante(String clnpgaCodigoGarante) {
        this.clnpgaCodigoGarante = clnpgaCodigoGarante;
    }

    public String getClnpgaTipoCodigoGaranteCon() {
        return clnpgaTipoCodigoGaranteCon;
    }

    public void setClnpgaTipoCodigoGaranteCon(String clnpgaTipoCodigoGaranteCon) {
        this.clnpgaTipoCodigoGaranteCon = clnpgaTipoCodigoGaranteCon;
    }

    public String getClnpgaCodigoGaranteCon() {
        return clnpgaCodigoGaranteCon;
    }

    public void setClnpgaCodigoGaranteCon(String clnpgaCodigoGaranteCon) {
        this.clnpgaCodigoGaranteCon = clnpgaCodigoGaranteCon;
    }

    public Short getFactorPeriodo() {
        return factorPeriodo;
    }

    public void setFactorPeriodo(Short factorPeriodo) {
        this.factorPeriodo = factorPeriodo;
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
        if (!(object instanceof CuentasPorCobrar)) {
            return false;
        }
        CuentasPorCobrar other = (CuentasPorCobrar) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CuentasPorCobrar[ numero=" + numero + " ]";
    }
    
}
