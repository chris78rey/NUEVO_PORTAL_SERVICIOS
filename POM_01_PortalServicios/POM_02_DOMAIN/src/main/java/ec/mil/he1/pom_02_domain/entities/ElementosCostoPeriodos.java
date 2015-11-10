/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
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

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ELEMENTOS_COSTO_PERIODOS")
@NamedQueries({
    @NamedQuery(name = "ElementosCostoPeriodos.findAll", query = "SELECT e FROM ElementosCostoPeriodos e")})
public class ElementosCostoPeriodos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ElementosCostoPeriodosPK elementosCostoPeriodosPK;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "elementosCostoPeriodos", fetch = FetchType.LAZY)
    private List<DetallesDeCostos> detallesDeCostosList;
    @JoinColumn(name = "ELMCST_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ElementosDeCosto elementosDeCosto;
    @JoinColumn(name = "PRD_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Periodos periodos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "elementosCostoPeriodos", fetch = FetchType.LAZY)
    private List<CostosAdicionales> costosAdicionalesList;

    public ElementosCostoPeriodos() {
    }

    public ElementosCostoPeriodos(ElementosCostoPeriodosPK elementosCostoPeriodosPK) {
        this.elementosCostoPeriodosPK = elementosCostoPeriodosPK;
    }

    public ElementosCostoPeriodos(int elmcstNumero, int prdNumero) {
        this.elementosCostoPeriodosPK = new ElementosCostoPeriodosPK(elmcstNumero, prdNumero);
    }

    public ElementosCostoPeriodosPK getElementosCostoPeriodosPK() {
        return elementosCostoPeriodosPK;
    }

    public void setElementosCostoPeriodosPK(ElementosCostoPeriodosPK elementosCostoPeriodosPK) {
        this.elementosCostoPeriodosPK = elementosCostoPeriodosPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<DetallesDeCostos> getDetallesDeCostosList() {
        return detallesDeCostosList;
    }

    public void setDetallesDeCostosList(List<DetallesDeCostos> detallesDeCostosList) {
        this.detallesDeCostosList = detallesDeCostosList;
    }

    public ElementosDeCosto getElementosDeCosto() {
        return elementosDeCosto;
    }

    public void setElementosDeCosto(ElementosDeCosto elementosDeCosto) {
        this.elementosDeCosto = elementosDeCosto;
    }

    public Periodos getPeriodos() {
        return periodos;
    }

    public void setPeriodos(Periodos periodos) {
        this.periodos = periodos;
    }

    public List<CostosAdicionales> getCostosAdicionalesList() {
        return costosAdicionalesList;
    }

    public void setCostosAdicionalesList(List<CostosAdicionales> costosAdicionalesList) {
        this.costosAdicionalesList = costosAdicionalesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (elementosCostoPeriodosPK != null ? elementosCostoPeriodosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElementosCostoPeriodos)) {
            return false;
        }
        ElementosCostoPeriodos other = (ElementosCostoPeriodos) object;
        if ((this.elementosCostoPeriodosPK == null && other.elementosCostoPeriodosPK != null) || (this.elementosCostoPeriodosPK != null && !this.elementosCostoPeriodosPK.equals(other.elementosCostoPeriodosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ElementosCostoPeriodos[ elementosCostoPeriodosPK=" + elementosCostoPeriodosPK + " ]";
    }
    
}
