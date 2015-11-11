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
@Table(name = "FACTURAS_AUTOMATICAS")
@NamedQueries({
    @NamedQuery(name = "FacturasAutomaticas.findAll", query = "SELECT f FROM FacturasAutomaticas f")})
public class FacturasAutomaticas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacturasAutomaticasPK facturasAutomaticasPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTO")
    private BigDecimal monto;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "FECHA_FACTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactura;
    @Column(name = "ID_ARCHIVO")
    private BigInteger idArchivo;
    @Column(name = "MDOPGO_NUMERO")
    private Short mdopgoNumero;
    @Column(name = "CPGPCN_ID")
    private Long cpgpcnId;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "PLA_NUMERO_PLANILLA")
    private Integer plaNumeroPlanilla;
    @Column(name = "PLANO_ID")
    private String planoId;

    public FacturasAutomaticas() {
    }

    public FacturasAutomaticas(FacturasAutomaticasPK facturasAutomaticasPK) {
        this.facturasAutomaticasPK = facturasAutomaticasPK;
    }

    public FacturasAutomaticas(int pcnNumeroHc, String cjaCodigo, String desdehasta) {
        this.facturasAutomaticasPK = new FacturasAutomaticasPK(pcnNumeroHc, cjaCodigo, desdehasta);
    }

    public FacturasAutomaticasPK getFacturasAutomaticasPK() {
        return facturasAutomaticasPK;
    }

    public void setFacturasAutomaticasPK(FacturasAutomaticasPK facturasAutomaticasPK) {
        this.facturasAutomaticasPK = facturasAutomaticasPK;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public BigInteger getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(BigInteger idArchivo) {
        this.idArchivo = idArchivo;
    }

    public Short getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(Short mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
    }

    public Long getCpgpcnId() {
        return cpgpcnId;
    }

    public void setCpgpcnId(Long cpgpcnId) {
        this.cpgpcnId = cpgpcnId;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Integer getPlaNumeroPlanilla() {
        return plaNumeroPlanilla;
    }

    public void setPlaNumeroPlanilla(Integer plaNumeroPlanilla) {
        this.plaNumeroPlanilla = plaNumeroPlanilla;
    }

    public String getPlanoId() {
        return planoId;
    }

    public void setPlanoId(String planoId) {
        this.planoId = planoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturasAutomaticasPK != null ? facturasAutomaticasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturasAutomaticas)) {
            return false;
        }
        FacturasAutomaticas other = (FacturasAutomaticas) object;
        if ((this.facturasAutomaticasPK == null && other.facturasAutomaticasPK != null) || (this.facturasAutomaticasPK != null && !this.facturasAutomaticasPK.equals(other.facturasAutomaticasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FacturasAutomaticas[ facturasAutomaticasPK=" + facturasAutomaticasPK + " ]";
    }
    
}
