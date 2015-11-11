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
@Table(name = "CONCILIACIONES_BANCARIAS")
@NamedQueries({
    @NamedQuery(name = "ConciliacionesBancarias.findAll", query = "SELECT c FROM ConciliacionesBancarias c")})
public class ConciliacionesBancarias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNTBNC_EMP_CODIGO")
    private String cntbncEmpCodigo;
    @Column(name = "CNTBNC_TIPO")
    private String cntbncTipo;
    @Column(name = "CNTBNC_NUMERO")
    private String cntbncNumero;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "FECHA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALDO_INICIAL")
    private BigDecimal saldoInicial;
    @Column(name = "SALDO_FINANCIERA")
    private BigDecimal saldoFinanciera;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public ConciliacionesBancarias() {
    }

    public ConciliacionesBancarias(Integer numero) {
        this.numero = numero;
    }

    public String getCntbncEmpCodigo() {
        return cntbncEmpCodigo;
    }

    public void setCntbncEmpCodigo(String cntbncEmpCodigo) {
        this.cntbncEmpCodigo = cntbncEmpCodigo;
    }

    public String getCntbncTipo() {
        return cntbncTipo;
    }

    public void setCntbncTipo(String cntbncTipo) {
        this.cntbncTipo = cntbncTipo;
    }

    public String getCntbncNumero() {
        return cntbncNumero;
    }

    public void setCntbncNumero(String cntbncNumero) {
        this.cntbncNumero = cntbncNumero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public BigDecimal getSaldoFinanciera() {
        return saldoFinanciera;
    }

    public void setSaldoFinanciera(BigDecimal saldoFinanciera) {
        this.saldoFinanciera = saldoFinanciera;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        if (!(object instanceof ConciliacionesBancarias)) {
            return false;
        }
        ConciliacionesBancarias other = (ConciliacionesBancarias) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ConciliacionesBancarias[ numero=" + numero + " ]";
    }
    
}
