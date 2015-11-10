/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_INGRESOS_ACTIVOS")
@NamedQueries({
    @NamedQuery(name = "DetallesIngresosActivos.findAll", query = "SELECT d FROM DetallesIngresosActivos d")})
public class DetallesIngresosActivos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesIngresosActivosPK detallesIngresosActivosPK;
    @Column(name = "CANTIDAD")
    private Short cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_UNITARIO")
    private BigDecimal valorUnitario;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "VALOR_TOTAL")
    private BigDecimal valorTotal;
    @Column(name = "IVA_CALCULADO")
    private BigDecimal ivaCalculado;
    @Column(name = "OTROS_IMPUESTOS")
    private BigDecimal otrosImpuestos;
    @Column(name = "VIDA_UTIL")
    private Short vidaUtil;
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumns({
        @JoinColumn(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO", referencedColumnName = "SBGACTFJO_GRPACTFJO_EMP_CODIGO"),
        @JoinColumn(name = "ACTFSBGACTFJO_GRPACTFJO_CODIGO", referencedColumnName = "SBGACTFJO_GRPACTFJO_CODIGO"),
        @JoinColumn(name = "ACTFJOGNR_SBGACTFJO_CODIGO", referencedColumnName = "SBGACTFJO_CODIGO"),
        @JoinColumn(name = "ACTFJOGNR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ActivosFijosGenerales activosFijosGenerales;
    @JoinColumns({
        @JoinColumn(name = "INGACTFJO_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "INGACTFJO_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private IngresosActivosFijos ingresosActivosFijos;

    public DetallesIngresosActivos() {
    }

    public DetallesIngresosActivos(DetallesIngresosActivosPK detallesIngresosActivosPK) {
        this.detallesIngresosActivosPK = detallesIngresosActivosPK;
    }

    public DetallesIngresosActivos(String ingactfjoEmpCodigo, int ingactfjoNumero, int numero) {
        this.detallesIngresosActivosPK = new DetallesIngresosActivosPK(ingactfjoEmpCodigo, ingactfjoNumero, numero);
    }

    public DetallesIngresosActivosPK getDetallesIngresosActivosPK() {
        return detallesIngresosActivosPK;
    }

    public void setDetallesIngresosActivosPK(DetallesIngresosActivosPK detallesIngresosActivosPK) {
        this.detallesIngresosActivosPK = detallesIngresosActivosPK;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getIvaCalculado() {
        return ivaCalculado;
    }

    public void setIvaCalculado(BigDecimal ivaCalculado) {
        this.ivaCalculado = ivaCalculado;
    }

    public BigDecimal getOtrosImpuestos() {
        return otrosImpuestos;
    }

    public void setOtrosImpuestos(BigDecimal otrosImpuestos) {
        this.otrosImpuestos = otrosImpuestos;
    }

    public Short getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(Short vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ActivosFijosGenerales getActivosFijosGenerales() {
        return activosFijosGenerales;
    }

    public void setActivosFijosGenerales(ActivosFijosGenerales activosFijosGenerales) {
        this.activosFijosGenerales = activosFijosGenerales;
    }

    public IngresosActivosFijos getIngresosActivosFijos() {
        return ingresosActivosFijos;
    }

    public void setIngresosActivosFijos(IngresosActivosFijos ingresosActivosFijos) {
        this.ingresosActivosFijos = ingresosActivosFijos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesIngresosActivosPK != null ? detallesIngresosActivosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesIngresosActivos)) {
            return false;
        }
        DetallesIngresosActivos other = (DetallesIngresosActivos) object;
        if ((this.detallesIngresosActivosPK == null && other.detallesIngresosActivosPK != null) || (this.detallesIngresosActivosPK != null && !this.detallesIngresosActivosPK.equals(other.detallesIngresosActivosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesIngresosActivos[ detallesIngresosActivosPK=" + detallesIngresosActivosPK + " ]";
    }
    
}
