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
@Table(name = "DETALLES_CREACION_EGRESOS")
@NamedQueries({
    @NamedQuery(name = "DetallesCreacionEgresos.findAll", query = "SELECT d FROM DetallesCreacionEgresos d")})
public class DetallesCreacionEgresos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CRCEGRFCT_CRCEGRFCT_ID")
    private Integer crcegrfctCrcegrfctId;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLCRCEGR_ID")
    private Integer dtlcrcegrId;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "ENTBNF_MSTBNF_CODIGO")
    private String entbnfMstbnfCodigo;
    @Column(name = "ENTBNF_CODIGO")
    private Integer entbnfCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CAJA")
    private String caja;
    @Column(name = "CTACBR_NUMERO")
    private Integer ctacbrNumero;
    @Column(name = "CUOTA_NUMERO")
    private Integer cuotaNumero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "EGRCJAMDC_NUMERO")
    private Integer egrcjamdcNumero;
    @Column(name = "ESTADO")
    private Character estado;

    public DetallesCreacionEgresos() {
    }

    public DetallesCreacionEgresos(Integer dtlcrcegrId) {
        this.dtlcrcegrId = dtlcrcegrId;
    }

    public Integer getCrcegrfctCrcegrfctId() {
        return crcegrfctCrcegrfctId;
    }

    public void setCrcegrfctCrcegrfctId(Integer crcegrfctCrcegrfctId) {
        this.crcegrfctCrcegrfctId = crcegrfctCrcegrfctId;
    }

    public Integer getDtlcrcegrId() {
        return dtlcrcegrId;
    }

    public void setDtlcrcegrId(Integer dtlcrcegrId) {
        this.dtlcrcegrId = dtlcrcegrId;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public Integer getCtacbrNumero() {
        return ctacbrNumero;
    }

    public void setCtacbrNumero(Integer ctacbrNumero) {
        this.ctacbrNumero = ctacbrNumero;
    }

    public Integer getCuotaNumero() {
        return cuotaNumero;
    }

    public void setCuotaNumero(Integer cuotaNumero) {
        this.cuotaNumero = cuotaNumero;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getEgrcjamdcNumero() {
        return egrcjamdcNumero;
    }

    public void setEgrcjamdcNumero(Integer egrcjamdcNumero) {
        this.egrcjamdcNumero = egrcjamdcNumero;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlcrcegrId != null ? dtlcrcegrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesCreacionEgresos)) {
            return false;
        }
        DetallesCreacionEgresos other = (DetallesCreacionEgresos) object;
        if ((this.dtlcrcegrId == null && other.dtlcrcegrId != null) || (this.dtlcrcegrId != null && !this.dtlcrcegrId.equals(other.dtlcrcegrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesCreacionEgresos[ dtlcrcegrId=" + dtlcrcegrId + " ]";
    }
    
}
