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
@Table(name = "INGRESOS_DE_BOTICA")
@NamedQueries({
    @NamedQuery(name = "IngresosDeBotica.findAll", query = "SELECT i FROM IngresosDeBotica i")})
public class IngresosDeBotica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IngresosDeBoticaPK ingresosDeBoticaPK;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_COSTO_INGRESO")
    private BigDecimal totalCostoIngreso;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONCEPTO")
    private String concepto;
    @Column(name = "ORDCMP_NUMERO")
    private Integer ordcmpNumero;
    @Column(name = "NUMERO_FACTURA")
    private Long numeroFactura;
    @Column(name = "FECHA_EMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "PRD_CODIGO")
    private Short prdCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PRS_CODIGO1")
    private String prsCodigo1;
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CONTROL")
    private String control;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "ESTADO_CONTABILIZA")
    private String estadoContabiliza;
    @Column(name = "SERIE_FACTURA")
    private String serieFactura;
    @Column(name = "AUTORIZACION_SRI")
    private BigInteger autorizacionSri;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "DIAS_PLAZO")
    private Short diasPlazo;
    @Column(name = "FECHA_CADUCIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCaducidad;
    @Column(name = "NUM_REG_INGRESO")
    private Integer numRegIngreso;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "NUM_REG_PROMOCION")
    private Integer numRegPromocion;
    @Column(name = "NOTA_DE_ENTREGA")
    private Integer notaDeEntrega;

    public IngresosDeBotica() {
    }

    public IngresosDeBotica(IngresosDeBoticaPK ingresosDeBoticaPK) {
        this.ingresosDeBoticaPK = ingresosDeBoticaPK;
    }

    public IngresosDeBotica(String tipo, int numero) {
        this.ingresosDeBoticaPK = new IngresosDeBoticaPK(tipo, numero);
    }

    public IngresosDeBoticaPK getIngresosDeBoticaPK() {
        return ingresosDeBoticaPK;
    }

    public void setIngresosDeBoticaPK(IngresosDeBoticaPK ingresosDeBoticaPK) {
        this.ingresosDeBoticaPK = ingresosDeBoticaPK;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BigDecimal getTotalCostoIngreso() {
        return totalCostoIngreso;
    }

    public void setTotalCostoIngreso(BigDecimal totalCostoIngreso) {
        this.totalCostoIngreso = totalCostoIngreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getOrdcmpNumero() {
        return ordcmpNumero;
    }

    public void setOrdcmpNumero(Integer ordcmpNumero) {
        this.ordcmpNumero = ordcmpNumero;
    }

    public Long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Short getPrdCodigo() {
        return prdCodigo;
    }

    public void setPrdCodigo(Short prdCodigo) {
        this.prdCodigo = prdCodigo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getPrsCodigo1() {
        return prsCodigo1;
    }

    public void setPrsCodigo1(String prsCodigo1) {
        this.prsCodigo1 = prsCodigo1;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getEstadoContabiliza() {
        return estadoContabiliza;
    }

    public void setEstadoContabiliza(String estadoContabiliza) {
        this.estadoContabiliza = estadoContabiliza;
    }

    public String getSerieFactura() {
        return serieFactura;
    }

    public void setSerieFactura(String serieFactura) {
        this.serieFactura = serieFactura;
    }

    public BigInteger getAutorizacionSri() {
        return autorizacionSri;
    }

    public void setAutorizacionSri(BigInteger autorizacionSri) {
        this.autorizacionSri = autorizacionSri;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public Short getDiasPlazo() {
        return diasPlazo;
    }

    public void setDiasPlazo(Short diasPlazo) {
        this.diasPlazo = diasPlazo;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Integer getNumRegIngreso() {
        return numRegIngreso;
    }

    public void setNumRegIngreso(Integer numRegIngreso) {
        this.numRegIngreso = numRegIngreso;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public Integer getNumRegPromocion() {
        return numRegPromocion;
    }

    public void setNumRegPromocion(Integer numRegPromocion) {
        this.numRegPromocion = numRegPromocion;
    }

    public Integer getNotaDeEntrega() {
        return notaDeEntrega;
    }

    public void setNotaDeEntrega(Integer notaDeEntrega) {
        this.notaDeEntrega = notaDeEntrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ingresosDeBoticaPK != null ? ingresosDeBoticaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngresosDeBotica)) {
            return false;
        }
        IngresosDeBotica other = (IngresosDeBotica) object;
        if ((this.ingresosDeBoticaPK == null && other.ingresosDeBoticaPK != null) || (this.ingresosDeBoticaPK != null && !this.ingresosDeBoticaPK.equals(other.ingresosDeBoticaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.IngresosDeBotica[ ingresosDeBoticaPK=" + ingresosDeBoticaPK + " ]";
    }
    
}
