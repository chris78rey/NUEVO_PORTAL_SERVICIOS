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
@Table(name = "DETALLES_TEMPORALES")
@NamedQueries({
    @NamedQuery(name = "DetallesTemporales.findAll", query = "SELECT d FROM DetallesTemporales d")})
public class DetallesTemporales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesTemporalesPK detallesTemporalesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COSTO_TOTAL")
    private BigDecimal costoTotal;
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "PRECIO_DE_VENTA")
    private BigDecimal precioDeVenta;
    @JoinColumns({
        @JoinColumn(name = "EGRBTC_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "EGRBTC_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EgresosDeBotica egresosDeBotica;
    @JoinColumns({
        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "SBS_SCC_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "SBS_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Items items;

    public DetallesTemporales() {
    }

    public DetallesTemporales(DetallesTemporalesPK detallesTemporalesPK) {
        this.detallesTemporalesPK = detallesTemporalesPK;
    }

    public DetallesTemporales(int egrbtcNumero, String egrbtcTipo, short itmCodigo, String itmSbsCodigo, String itmSbsSccCodigo, Character itmTipo) {
        this.detallesTemporalesPK = new DetallesTemporalesPK(egrbtcNumero, egrbtcTipo, itmCodigo, itmSbsCodigo, itmSbsSccCodigo, itmTipo);
    }

    public DetallesTemporalesPK getDetallesTemporalesPK() {
        return detallesTemporalesPK;
    }

    public void setDetallesTemporalesPK(DetallesTemporalesPK detallesTemporalesPK) {
        this.detallesTemporalesPK = detallesTemporalesPK;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(BigDecimal precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public EgresosDeBotica getEgresosDeBotica() {
        return egresosDeBotica;
    }

    public void setEgresosDeBotica(EgresosDeBotica egresosDeBotica) {
        this.egresosDeBotica = egresosDeBotica;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesTemporalesPK != null ? detallesTemporalesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesTemporales)) {
            return false;
        }
        DetallesTemporales other = (DetallesTemporales) object;
        if ((this.detallesTemporalesPK == null && other.detallesTemporalesPK != null) || (this.detallesTemporalesPK != null && !this.detallesTemporalesPK.equals(other.detallesTemporalesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesTemporales[ detallesTemporalesPK=" + detallesTemporalesPK + " ]";
    }
    
}
