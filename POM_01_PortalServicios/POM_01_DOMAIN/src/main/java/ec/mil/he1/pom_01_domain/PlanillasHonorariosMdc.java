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
@Table(name = "PLANILLAS_HONORARIOS_MDC")
@NamedQueries({
    @NamedQuery(name = "PlanillasHonorariosMdc.findAll", query = "SELECT p FROM PlanillasHonorariosMdc p")})
public class PlanillasHonorariosMdc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "CJA_CODIGO")
    private String cjaCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "SALDO")
    private BigDecimal saldo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "EMERGENCIA")
    private Character emergencia;
    @Column(name = "ABIERTA")
    private Character abierta;
    @Column(name = "A_CONTABILIZARSE")
    private Character aContabilizarse;
    @Column(name = "PRMATN_NUMERO")
    private Integer prmatnNumero;
    @Column(name = "PRMATN_PCN_NUMERO_HC")
    private Integer prmatnPcnNumeroHc;
    @Column(name = "CLNPGA_CODIGO")
    private String clnpgaCodigo;
    @Column(name = "CLNPGA_TIPO_CODIGO")
    private String clnpgaTipoCodigo;
    @Column(name = "ESTADO_CIERRE")
    private String estadoCierre;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public PlanillasHonorariosMdc() {
    }

    public PlanillasHonorariosMdc(Integer numero) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(Character emergencia) {
        this.emergencia = emergencia;
    }

    public Character getAbierta() {
        return abierta;
    }

    public void setAbierta(Character abierta) {
        this.abierta = abierta;
    }

    public Character getAContabilizarse() {
        return aContabilizarse;
    }

    public void setAContabilizarse(Character aContabilizarse) {
        this.aContabilizarse = aContabilizarse;
    }

    public Integer getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Integer prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public Integer getPrmatnPcnNumeroHc() {
        return prmatnPcnNumeroHc;
    }

    public void setPrmatnPcnNumeroHc(Integer prmatnPcnNumeroHc) {
        this.prmatnPcnNumeroHc = prmatnPcnNumeroHc;
    }

    public String getClnpgaCodigo() {
        return clnpgaCodigo;
    }

    public void setClnpgaCodigo(String clnpgaCodigo) {
        this.clnpgaCodigo = clnpgaCodigo;
    }

    public String getClnpgaTipoCodigo() {
        return clnpgaTipoCodigo;
    }

    public void setClnpgaTipoCodigo(String clnpgaTipoCodigo) {
        this.clnpgaTipoCodigo = clnpgaTipoCodigo;
    }

    public String getEstadoCierre() {
        return estadoCierre;
    }

    public void setEstadoCierre(String estadoCierre) {
        this.estadoCierre = estadoCierre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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
        if (!(object instanceof PlanillasHonorariosMdc)) {
            return false;
        }
        PlanillasHonorariosMdc other = (PlanillasHonorariosMdc) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PlanillasHonorariosMdc[ numero=" + numero + " ]";
    }
    
}
