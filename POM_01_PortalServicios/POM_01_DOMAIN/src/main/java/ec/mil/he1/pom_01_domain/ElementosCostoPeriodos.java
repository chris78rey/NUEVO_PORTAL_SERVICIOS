/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
        return "ec.mil.he1.pom_01_domain.ElementosCostoPeriodos[ elementosCostoPeriodosPK=" + elementosCostoPeriodosPK + " ]";
    }
    
}
