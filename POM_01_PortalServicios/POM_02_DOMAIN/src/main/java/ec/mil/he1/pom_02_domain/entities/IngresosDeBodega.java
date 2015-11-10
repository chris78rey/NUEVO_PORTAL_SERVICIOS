/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "INGRESOS_DE_BODEGA")
@NamedQueries({
    @NamedQuery(name = "IngresosDeBodega.findAll", query = "SELECT i FROM IngresosDeBodega i")})
public class IngresosDeBodega implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IngresosDeBodegaPK ingresosDeBodegaPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "NUMERO_FACTURA")
    private String numeroFactura;
    @Column(name = "FECHA_EMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ESTADO")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "CONTROL")
    private String control;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "TOTAL_COSTO_INGRESO")
    private BigDecimal totalCostoIngreso;
    @Column(name = "SERIE_FACTURA")
    private String serieFactura;
    @Column(name = "AUTORIZACION_SRI")
    private BigInteger autorizacionSri;
    @Column(name = "DIAS_PLAZO")
    private Short diasPlazo;
    @Column(name = "ESTADO_CONTABILIZA")
    private String estadoContabiliza;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "FECHA_CADUCIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCaducidad;
    @Column(name = "NOTA_DE_ENTREGA")
    private Integer notaDeEntrega;
    @Column(name = "MOTIVO")
    private String motivo;
    @OneToMany(mappedBy = "ingresosDeBodega", fetch = FetchType.LAZY)
    private List<Transacciones> transaccionesList;
    @JoinColumn(name = "ORDCMP_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrdenesDeCompra ordenesDeCompra;
    @JoinColumn(name = "PRS_CODIGO_INSPECCIONADO_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @JoinColumn(name = "PRD_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proveedores proveedores;

    public IngresosDeBodega() {
    }

    public IngresosDeBodega(IngresosDeBodegaPK ingresosDeBodegaPK) {
        this.ingresosDeBodegaPK = ingresosDeBodegaPK;
    }

    public IngresosDeBodega(String tipo, int numero) {
        this.ingresosDeBodegaPK = new IngresosDeBodegaPK(tipo, numero);
    }

    public IngresosDeBodegaPK getIngresosDeBodegaPK() {
        return ingresosDeBodegaPK;
    }

    public void setIngresosDeBodegaPK(IngresosDeBodegaPK ingresosDeBodegaPK) {
        this.ingresosDeBodegaPK = ingresosDeBodegaPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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

    public BigDecimal getTotalCostoIngreso() {
        return totalCostoIngreso;
    }

    public void setTotalCostoIngreso(BigDecimal totalCostoIngreso) {
        this.totalCostoIngreso = totalCostoIngreso;
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

    public Short getDiasPlazo() {
        return diasPlazo;
    }

    public void setDiasPlazo(Short diasPlazo) {
        this.diasPlazo = diasPlazo;
    }

    public String getEstadoContabiliza() {
        return estadoContabiliza;
    }

    public void setEstadoContabiliza(String estadoContabiliza) {
        this.estadoContabiliza = estadoContabiliza;
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

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Integer getNotaDeEntrega() {
        return notaDeEntrega;
    }

    public void setNotaDeEntrega(Integer notaDeEntrega) {
        this.notaDeEntrega = notaDeEntrega;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public List<Transacciones> getTransaccionesList() {
        return transaccionesList;
    }

    public void setTransaccionesList(List<Transacciones> transaccionesList) {
        this.transaccionesList = transaccionesList;
    }

    public OrdenesDeCompra getOrdenesDeCompra() {
        return ordenesDeCompra;
    }

    public void setOrdenesDeCompra(OrdenesDeCompra ordenesDeCompra) {
        this.ordenesDeCompra = ordenesDeCompra;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ingresosDeBodegaPK != null ? ingresosDeBodegaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngresosDeBodega)) {
            return false;
        }
        IngresosDeBodega other = (IngresosDeBodega) object;
        if ((this.ingresosDeBodegaPK == null && other.ingresosDeBodegaPK != null) || (this.ingresosDeBodegaPK != null && !this.ingresosDeBodegaPK.equals(other.ingresosDeBodegaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.IngresosDeBodega[ ingresosDeBodegaPK=" + ingresosDeBodegaPK + " ]";
    }
    
}
