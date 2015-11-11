/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "DETALLES_CONTABILIZACIONES_CMP")
@NamedQueries({
    @NamedQuery(name = "DetallesContabilizacionesCmp.findAll", query = "SELECT d FROM DetallesContabilizacionesCmp d")})
public class DetallesContabilizacionesCmp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNTCMP_EMP_CODIGO")
    private String cntcmpEmpCodigo;
    @Column(name = "CNTCMP_CNTCMP_ID")
    private Long cntcmpCntcmpId;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLCNTCMP_ID")
    private Long dtlcntcmpId;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_NUMERO")
    private Integer cmpNumero;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "CMP_PRV_CODIGO")
    private Short cmpPrvCodigo;
    @Column(name = "CMP_FECHA_FACTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFechaFactura;
    @Column(name = "CMP_SERIE_FACTURA")
    private String cmpSerieFactura;
    @Column(name = "CMP_NUMERO_FACTURA")
    private Long cmpNumeroFactura;
    @Column(name = "CMP_AUTORIZACION_SRI")
    private BigInteger cmpAutorizacionSri;
    @Column(name = "CMP_FECHA_CADUCIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFechaCaducidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CMP_SUBTOTAL")
    private BigDecimal cmpSubtotal;
    @Column(name = "CMP_IVA")
    private BigDecimal cmpIva;
    @Column(name = "CONTABILIZADO")
    private String contabilizado;

    public DetallesContabilizacionesCmp() {
    }

    public DetallesContabilizacionesCmp(Long dtlcntcmpId) {
        this.dtlcntcmpId = dtlcntcmpId;
    }

    public String getCntcmpEmpCodigo() {
        return cntcmpEmpCodigo;
    }

    public void setCntcmpEmpCodigo(String cntcmpEmpCodigo) {
        this.cntcmpEmpCodigo = cntcmpEmpCodigo;
    }

    public Long getCntcmpCntcmpId() {
        return cntcmpCntcmpId;
    }

    public void setCntcmpCntcmpId(Long cntcmpCntcmpId) {
        this.cntcmpCntcmpId = cntcmpCntcmpId;
    }

    public Long getDtlcntcmpId() {
        return dtlcntcmpId;
    }

    public void setDtlcntcmpId(Long dtlcntcmpId) {
        this.dtlcntcmpId = dtlcntcmpId;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
    }

    public Integer getCmpNumero() {
        return cmpNumero;
    }

    public void setCmpNumero(Integer cmpNumero) {
        this.cmpNumero = cmpNumero;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public Short getCmpPrvCodigo() {
        return cmpPrvCodigo;
    }

    public void setCmpPrvCodigo(Short cmpPrvCodigo) {
        this.cmpPrvCodigo = cmpPrvCodigo;
    }

    public Date getCmpFechaFactura() {
        return cmpFechaFactura;
    }

    public void setCmpFechaFactura(Date cmpFechaFactura) {
        this.cmpFechaFactura = cmpFechaFactura;
    }

    public String getCmpSerieFactura() {
        return cmpSerieFactura;
    }

    public void setCmpSerieFactura(String cmpSerieFactura) {
        this.cmpSerieFactura = cmpSerieFactura;
    }

    public Long getCmpNumeroFactura() {
        return cmpNumeroFactura;
    }

    public void setCmpNumeroFactura(Long cmpNumeroFactura) {
        this.cmpNumeroFactura = cmpNumeroFactura;
    }

    public BigInteger getCmpAutorizacionSri() {
        return cmpAutorizacionSri;
    }

    public void setCmpAutorizacionSri(BigInteger cmpAutorizacionSri) {
        this.cmpAutorizacionSri = cmpAutorizacionSri;
    }

    public Date getCmpFechaCaducidad() {
        return cmpFechaCaducidad;
    }

    public void setCmpFechaCaducidad(Date cmpFechaCaducidad) {
        this.cmpFechaCaducidad = cmpFechaCaducidad;
    }

    public BigDecimal getCmpSubtotal() {
        return cmpSubtotal;
    }

    public void setCmpSubtotal(BigDecimal cmpSubtotal) {
        this.cmpSubtotal = cmpSubtotal;
    }

    public BigDecimal getCmpIva() {
        return cmpIva;
    }

    public void setCmpIva(BigDecimal cmpIva) {
        this.cmpIva = cmpIva;
    }

    public String getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(String contabilizado) {
        this.contabilizado = contabilizado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlcntcmpId != null ? dtlcntcmpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesContabilizacionesCmp)) {
            return false;
        }
        DetallesContabilizacionesCmp other = (DetallesContabilizacionesCmp) object;
        if ((this.dtlcntcmpId == null && other.dtlcntcmpId != null) || (this.dtlcntcmpId != null && !this.dtlcntcmpId.equals(other.dtlcntcmpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesContabilizacionesCmp[ dtlcntcmpId=" + dtlcntcmpId + " ]";
    }
    
}
