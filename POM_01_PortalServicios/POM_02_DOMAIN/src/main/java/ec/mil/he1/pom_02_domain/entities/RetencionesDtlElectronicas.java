/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "RETENCIONES_DTL_ELECTRONICAS")
@NamedQueries({
    @NamedQuery(name = "RetencionesDtlElectronicas.findAll", query = "SELECT r FROM RetencionesDtlElectronicas r")})
public class RetencionesDtlElectronicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RetencionesDtlElectronicasPK retencionesDtlElectronicasPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BASE_IMPONIBLE")
    private BigDecimal baseImponible;
    @Column(name = "PORCENTAJE_RETENER")
    private Short porcentajeRetener;
    @Column(name = "VALOR_RETENIDO")
    private BigDecimal valorRetenido;
    @Column(name = "COD_DOC_SUSTENTO")
    private String codDocSustento;
    @Column(name = "NUM_DOC_SUSTENTO")
    private String numDocSustento;
    @Column(name = "FECHA_EMISION_DOC_SUSTENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmisionDocSustento;
//    @JoinColumns({
//        @JoinColumn(name = "REL_CMP_TPOCMPEMP_EMP_CODIGO", referencedColumnName = "TPORTNEMP_EMP_CODIGO"),
//        @JoinColumn(name = "RTN_TPORTNEMP_TPORTN_CODIGO", referencedColumnName = "TPORTNEMP_TPORTN_CODIGO"),
//        @JoinColumn(name = "RTN_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private Retenciones retenciones;
//    @JoinColumns({
//        @JoinColumn(name = "REL_RTN_CAJA", referencedColumnName = "RTN_CAJA"),
//        @JoinColumn(name = "REL_CMP_TPOCMPEMP_EMP_CODIGO", referencedColumnName = "CMP_TPOCMPEMP_EMP_CODIGO"),
//        @JoinColumn(name = "REL_CMP_TPOCMPEMP_TPOCMP_CODIG", referencedColumnName = "CMP_TPOCMPEMP_TPOCMP_CODIGO"),
//        @JoinColumn(name = "REL_CMP_FECHA", referencedColumnName = "CMP_FECHA"),
//        @JoinColumn(name = "REL_CMP_CLAVE", referencedColumnName = "CMP_CLAVE")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private RetencionesElectronicas retencionesElectronicas;

    public RetencionesDtlElectronicas() {
    }

    public RetencionesDtlElectronicas(RetencionesDtlElectronicasPK retencionesDtlElectronicasPK) {
        this.retencionesDtlElectronicasPK = retencionesDtlElectronicasPK;
    }

    public RetencionesDtlElectronicas(long rtnNumero, String codigo, String codigoRetencion) {
        this.retencionesDtlElectronicasPK = new RetencionesDtlElectronicasPK(rtnNumero, codigo, codigoRetencion);
    }

    public RetencionesDtlElectronicasPK getRetencionesDtlElectronicasPK() {
        return retencionesDtlElectronicasPK;
    }

    public void setRetencionesDtlElectronicasPK(RetencionesDtlElectronicasPK retencionesDtlElectronicasPK) {
        this.retencionesDtlElectronicasPK = retencionesDtlElectronicasPK;
    }

    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(BigDecimal baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Short getPorcentajeRetener() {
        return porcentajeRetener;
    }

    public void setPorcentajeRetener(Short porcentajeRetener) {
        this.porcentajeRetener = porcentajeRetener;
    }

    public BigDecimal getValorRetenido() {
        return valorRetenido;
    }

    public void setValorRetenido(BigDecimal valorRetenido) {
        this.valorRetenido = valorRetenido;
    }

    public String getCodDocSustento() {
        return codDocSustento;
    }

    public void setCodDocSustento(String codDocSustento) {
        this.codDocSustento = codDocSustento;
    }

    public String getNumDocSustento() {
        return numDocSustento;
    }

    public void setNumDocSustento(String numDocSustento) {
        this.numDocSustento = numDocSustento;
    }

    public Date getFechaEmisionDocSustento() {
        return fechaEmisionDocSustento;
    }

    public void setFechaEmisionDocSustento(Date fechaEmisionDocSustento) {
        this.fechaEmisionDocSustento = fechaEmisionDocSustento;
    }

//    public Retenciones getRetenciones() {
//        return retenciones;
//    }
//
//    public void setRetenciones(Retenciones retenciones) {
//        this.retenciones = retenciones;
//    }
//
//    public RetencionesElectronicas getRetencionesElectronicas() {
//        return retencionesElectronicas;
//    }
//
//    public void setRetencionesElectronicas(RetencionesElectronicas retencionesElectronicas) {
//        this.retencionesElectronicas = retencionesElectronicas;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retencionesDtlElectronicasPK != null ? retencionesDtlElectronicasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesDtlElectronicas)) {
            return false;
        }
        RetencionesDtlElectronicas other = (RetencionesDtlElectronicas) object;
        if ((this.retencionesDtlElectronicasPK == null && other.retencionesDtlElectronicasPK != null) || (this.retencionesDtlElectronicasPK != null && !this.retencionesDtlElectronicasPK.equals(other.retencionesDtlElectronicasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RetencionesDtlElectronicas[ retencionesDtlElectronicasPK=" + retencionesDtlElectronicasPK + " ]";
    }
    
}
