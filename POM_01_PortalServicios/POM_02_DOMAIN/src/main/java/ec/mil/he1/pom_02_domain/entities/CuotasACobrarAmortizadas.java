/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CUOTAS_A_COBRAR_AMORTIZADAS")
@NamedQueries({
    @NamedQuery(name = "CuotasACobrarAmortizadas.findAll", query = "SELECT c FROM CuotasACobrarAmortizadas c")})
public class CuotasACobrarAmortizadas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "NUMERO_CUOTA")
    private Short numeroCuota;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "FECHA_PLAZO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPlazo;
    @Column(name = "INTERES")
    private BigDecimal interes;
    @Column(name = "INTERES_PORCENTAJE")
    private BigDecimal interesPorcentaje;
    @Column(name = "MORA")
    private BigDecimal mora;
    @Column(name = "MORA_PORCENTAJE")
    private BigDecimal moraPorcentaje;
    @Column(name = "SALDO")
    private BigDecimal saldo;
    @Column(name = "SALDO_CUOTA")
    private BigDecimal saldoCuota;
    @Column(name = "OBSERVACION")
    private String observacion;
    @JoinColumn(name = "CJA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cajas cajas;
    @JoinColumn(name = "CTACBR_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CuentasPorCobrar cuentasPorCobrar;
    @JoinColumn(name = "MDOPGO_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModoDePago modoDePago;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public CuotasACobrarAmortizadas() {
    }

    public CuotasACobrarAmortizadas(Long numero) {
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Short getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Short numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFechaPlazo() {
        return fechaPlazo;
    }

    public void setFechaPlazo(Date fechaPlazo) {
        this.fechaPlazo = fechaPlazo;
    }

    public BigDecimal getInteres() {
        return interes;
    }

    public void setInteres(BigDecimal interes) {
        this.interes = interes;
    }

    public BigDecimal getInteresPorcentaje() {
        return interesPorcentaje;
    }

    public void setInteresPorcentaje(BigDecimal interesPorcentaje) {
        this.interesPorcentaje = interesPorcentaje;
    }

    public BigDecimal getMora() {
        return mora;
    }

    public void setMora(BigDecimal mora) {
        this.mora = mora;
    }

    public BigDecimal getMoraPorcentaje() {
        return moraPorcentaje;
    }

    public void setMoraPorcentaje(BigDecimal moraPorcentaje) {
        this.moraPorcentaje = moraPorcentaje;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldoCuota() {
        return saldoCuota;
    }

    public void setSaldoCuota(BigDecimal saldoCuota) {
        this.saldoCuota = saldoCuota;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Cajas getCajas() {
        return cajas;
    }

    public void setCajas(Cajas cajas) {
        this.cajas = cajas;
    }

    public CuentasPorCobrar getCuentasPorCobrar() {
        return cuentasPorCobrar;
    }

    public void setCuentasPorCobrar(CuentasPorCobrar cuentasPorCobrar) {
        this.cuentasPorCobrar = cuentasPorCobrar;
    }

    public ModoDePago getModoDePago() {
        return modoDePago;
    }

    public void setModoDePago(ModoDePago modoDePago) {
        this.modoDePago = modoDePago;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
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
        if (!(object instanceof CuotasACobrarAmortizadas)) {
            return false;
        }
        CuotasACobrarAmortizadas other = (CuotasACobrarAmortizadas) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CuotasACobrarAmortizadas[ numero=" + numero + " ]";
    }
    
}
