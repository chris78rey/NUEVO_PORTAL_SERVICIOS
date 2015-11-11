/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    @Column(name = "REL_CMP_TPOCMPEMP_EMP_CODIGO")
    private String relCmpTpocmpempEmpCodigo;
    @Column(name = "REL_CMP_TPOCMPEMP_TPOCMP_CODIG")
    private String relCmpTpocmpempTpocmpCodig;
    @Column(name = "REL_CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date relCmpFecha;
    @Column(name = "REL_CMP_CLAVE")
    private Long relCmpClave;
    @Column(name = "RTN_TPORTNEMP_TPORTN_CODIGO")
    private Short rtnTportnempTportnCodigo;
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
    @Column(name = "REL_RTN_CAJA")
    private String relRtnCaja;

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

    public String getRelCmpTpocmpempEmpCodigo() {
        return relCmpTpocmpempEmpCodigo;
    }

    public void setRelCmpTpocmpempEmpCodigo(String relCmpTpocmpempEmpCodigo) {
        this.relCmpTpocmpempEmpCodigo = relCmpTpocmpempEmpCodigo;
    }

    public String getRelCmpTpocmpempTpocmpCodig() {
        return relCmpTpocmpempTpocmpCodig;
    }

    public void setRelCmpTpocmpempTpocmpCodig(String relCmpTpocmpempTpocmpCodig) {
        this.relCmpTpocmpempTpocmpCodig = relCmpTpocmpempTpocmpCodig;
    }

    public Date getRelCmpFecha() {
        return relCmpFecha;
    }

    public void setRelCmpFecha(Date relCmpFecha) {
        this.relCmpFecha = relCmpFecha;
    }

    public Long getRelCmpClave() {
        return relCmpClave;
    }

    public void setRelCmpClave(Long relCmpClave) {
        this.relCmpClave = relCmpClave;
    }

    public Short getRtnTportnempTportnCodigo() {
        return rtnTportnempTportnCodigo;
    }

    public void setRtnTportnempTportnCodigo(Short rtnTportnempTportnCodigo) {
        this.rtnTportnempTportnCodigo = rtnTportnempTportnCodigo;
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

    public String getRelRtnCaja() {
        return relRtnCaja;
    }

    public void setRelRtnCaja(String relRtnCaja) {
        this.relRtnCaja = relRtnCaja;
    }

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
        return "ec.mil.he1.pom_01_domain.RetencionesDtlElectronicas[ retencionesDtlElectronicasPK=" + retencionesDtlElectronicasPK + " ]";
    }
    
}
