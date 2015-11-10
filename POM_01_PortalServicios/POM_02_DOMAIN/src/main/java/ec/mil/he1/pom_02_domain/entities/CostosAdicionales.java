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
@Table(name = "COSTOS_ADICIONALES")
@NamedQueries({
    @NamedQuery(name = "CostosAdicionales.findAll", query = "SELECT c FROM CostosAdicionales c")})
public class CostosAdicionales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CostosAdicionalesPK costosAdicionalesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @JoinColumns({
        @JoinColumn(name = "ELMCSTPRD_ELMCST_NUMERO", referencedColumnName = "ELMCST_NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "ELMCSTPRD_PRD_NUMERO", referencedColumnName = "PRD_NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ElementosCostoPeriodos elementosCostoPeriodos;

    public CostosAdicionales() {
    }

    public CostosAdicionales(CostosAdicionalesPK costosAdicionalesPK) {
        this.costosAdicionalesPK = costosAdicionalesPK;
    }

    public CostosAdicionales(int elmcstprdElmcstNumero, int elmcstprdPrdNumero, String costoAdicional) {
        this.costosAdicionalesPK = new CostosAdicionalesPK(elmcstprdElmcstNumero, elmcstprdPrdNumero, costoAdicional);
    }

    public CostosAdicionalesPK getCostosAdicionalesPK() {
        return costosAdicionalesPK;
    }

    public void setCostosAdicionalesPK(CostosAdicionalesPK costosAdicionalesPK) {
        this.costosAdicionalesPK = costosAdicionalesPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ElementosCostoPeriodos getElementosCostoPeriodos() {
        return elementosCostoPeriodos;
    }

    public void setElementosCostoPeriodos(ElementosCostoPeriodos elementosCostoPeriodos) {
        this.elementosCostoPeriodos = elementosCostoPeriodos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costosAdicionalesPK != null ? costosAdicionalesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostosAdicionales)) {
            return false;
        }
        CostosAdicionales other = (CostosAdicionales) object;
        if ((this.costosAdicionalesPK == null && other.costosAdicionalesPK != null) || (this.costosAdicionalesPK != null && !this.costosAdicionalesPK.equals(other.costosAdicionalesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CostosAdicionales[ costosAdicionalesPK=" + costosAdicionalesPK + " ]";
    }
    
}
