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
@Table(name = "DETALLES_CONTABILIZACION_CRR")
@NamedQueries({
    @NamedQuery(name = "DetallesContabilizacionCrr.findAll", query = "SELECT d FROM DetallesContabilizacionCrr d")})
public class DetallesContabilizacionCrr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLCNTCRR_ID")
    private Long dtlcntcrrId;
    @Column(name = "EGRESO_TIPO")
    private String egresoTipo;
    @Column(name = "EGRESO_NUMERO")
    private Integer egresoNumero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "NUMERO_HC")
    private Integer numeroHc;
    @Column(name = "NOMBRE_PCN")
    private String nombrePcn;
    @Column(name = "PRMATN_NUMERO")
    private Integer prmatnNumero;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "AGRUPADOR_CONTABLE")
    private String agrupadorContable;
    @JoinColumn(name = "CNTCRRMES_CNTCRRMES_ID", referencedColumnName = "CNTCRRMES_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ContabilizacionCierreMes contabilizacionCierreMes;

    public DetallesContabilizacionCrr() {
    }

    public DetallesContabilizacionCrr(Long dtlcntcrrId) {
        this.dtlcntcrrId = dtlcntcrrId;
    }

    public Long getDtlcntcrrId() {
        return dtlcntcrrId;
    }

    public void setDtlcntcrrId(Long dtlcntcrrId) {
        this.dtlcntcrrId = dtlcntcrrId;
    }

    public String getEgresoTipo() {
        return egresoTipo;
    }

    public void setEgresoTipo(String egresoTipo) {
        this.egresoTipo = egresoTipo;
    }

    public Integer getEgresoNumero() {
        return egresoNumero;
    }

    public void setEgresoNumero(Integer egresoNumero) {
        this.egresoNumero = egresoNumero;
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

    public Integer getNumeroHc() {
        return numeroHc;
    }

    public void setNumeroHc(Integer numeroHc) {
        this.numeroHc = numeroHc;
    }

    public String getNombrePcn() {
        return nombrePcn;
    }

    public void setNombrePcn(String nombrePcn) {
        this.nombrePcn = nombrePcn;
    }

    public Integer getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Integer prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getAgrupadorContable() {
        return agrupadorContable;
    }

    public void setAgrupadorContable(String agrupadorContable) {
        this.agrupadorContable = agrupadorContable;
    }

    public ContabilizacionCierreMes getContabilizacionCierreMes() {
        return contabilizacionCierreMes;
    }

    public void setContabilizacionCierreMes(ContabilizacionCierreMes contabilizacionCierreMes) {
        this.contabilizacionCierreMes = contabilizacionCierreMes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlcntcrrId != null ? dtlcntcrrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesContabilizacionCrr)) {
            return false;
        }
        DetallesContabilizacionCrr other = (DetallesContabilizacionCrr) object;
        if ((this.dtlcntcrrId == null && other.dtlcntcrrId != null) || (this.dtlcntcrrId != null && !this.dtlcntcrrId.equals(other.dtlcntcrrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesContabilizacionCrr[ dtlcntcrrId=" + dtlcntcrrId + " ]";
    }
    
}
