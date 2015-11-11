/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EXCEPCIONES_PROMOCIONES")
@NamedQueries({
    @NamedQuery(name = "ExcepcionesPromociones.findAll", query = "SELECT e FROM ExcepcionesPromociones e")})
public class ExcepcionesPromociones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXCPRM_ID")
    private Long excprmId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE_PROMOCION")
    private BigDecimal porcentajePromocion;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "DTLPRM_PRM_CODIGO")
    private String dtlprmPrmCodigo;
    @Column(name = "DTLPRM_DPR_CODIGO")
    private String dtlprmDprCodigo;
    @Column(name = "DTLPRM_DPR_ARA_CODIGO")
    private String dtlprmDprAraCodigo;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "ITM_CODIGO")
    private Short itmCodigo;
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Column(name = "VALOR_FIJADO")
    private BigDecimal valorFijado;
    @Column(name = "UVRS")
    private BigDecimal uvrs;

    public ExcepcionesPromociones() {
    }

    public ExcepcionesPromociones(Long excprmId) {
        this.excprmId = excprmId;
    }

    public Long getExcprmId() {
        return excprmId;
    }

    public void setExcprmId(Long excprmId) {
        this.excprmId = excprmId;
    }

    public BigDecimal getPorcentajePromocion() {
        return porcentajePromocion;
    }

    public void setPorcentajePromocion(BigDecimal porcentajePromocion) {
        this.porcentajePromocion = porcentajePromocion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDtlprmPrmCodigo() {
        return dtlprmPrmCodigo;
    }

    public void setDtlprmPrmCodigo(String dtlprmPrmCodigo) {
        this.dtlprmPrmCodigo = dtlprmPrmCodigo;
    }

    public String getDtlprmDprCodigo() {
        return dtlprmDprCodigo;
    }

    public void setDtlprmDprCodigo(String dtlprmDprCodigo) {
        this.dtlprmDprCodigo = dtlprmDprCodigo;
    }

    public String getDtlprmDprAraCodigo() {
        return dtlprmDprAraCodigo;
    }

    public void setDtlprmDprAraCodigo(String dtlprmDprAraCodigo) {
        this.dtlprmDprAraCodigo = dtlprmDprAraCodigo;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(Short itmCodigo) {
        this.itmCodigo = itmCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    public BigDecimal getValorFijado() {
        return valorFijado;
    }

    public void setValorFijado(BigDecimal valorFijado) {
        this.valorFijado = valorFijado;
    }

    public BigDecimal getUvrs() {
        return uvrs;
    }

    public void setUvrs(BigDecimal uvrs) {
        this.uvrs = uvrs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (excprmId != null ? excprmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcepcionesPromociones)) {
            return false;
        }
        ExcepcionesPromociones other = (ExcepcionesPromociones) object;
        if ((this.excprmId == null && other.excprmId != null) || (this.excprmId != null && !this.excprmId.equals(other.excprmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ExcepcionesPromociones[ excprmId=" + excprmId + " ]";
    }
    
}
