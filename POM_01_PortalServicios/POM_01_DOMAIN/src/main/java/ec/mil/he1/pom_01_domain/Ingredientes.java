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
@Table(name = "INGREDIENTES")
@NamedQueries({
    @NamedQuery(name = "Ingredientes.findAll", query = "SELECT i FROM Ingredientes i")})
public class Ingredientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IngredientesPK ingredientesPK;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COSTO")
    private BigDecimal costo;
    @Column(name = "COSTO_TOTAL")
    private BigDecimal costoTotal;
    @Column(name = "ULTIMO_PRECIO")
    private BigDecimal ultimoPrecio;
    @Column(name = "PRECIO_TOTAL")
    private BigDecimal precioTotal;
    @Column(name = "MNU_ID_ADICIONAL")
    private Integer mnuIdAdicional;

    public Ingredientes() {
    }

    public Ingredientes(IngredientesPK ingredientesPK) {
        this.ingredientesPK = ingredientesPK;
    }

    public Ingredientes(int mnuId, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo, Character itmTipo) {
        this.ingredientesPK = new IngredientesPK(mnuId, itmSbsSccCodigo, itmSbsCodigo, itmCodigo, itmTipo);
    }

    public IngredientesPK getIngredientesPK() {
        return ingredientesPK;
    }

    public void setIngredientesPK(IngredientesPK ingredientesPK) {
        this.ingredientesPK = ingredientesPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    public BigDecimal getUltimoPrecio() {
        return ultimoPrecio;
    }

    public void setUltimoPrecio(BigDecimal ultimoPrecio) {
        this.ultimoPrecio = ultimoPrecio;
    }

    public BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Integer getMnuIdAdicional() {
        return mnuIdAdicional;
    }

    public void setMnuIdAdicional(Integer mnuIdAdicional) {
        this.mnuIdAdicional = mnuIdAdicional;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ingredientesPK != null ? ingredientesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingredientes)) {
            return false;
        }
        Ingredientes other = (Ingredientes) object;
        if ((this.ingredientesPK == null && other.ingredientesPK != null) || (this.ingredientesPK != null && !this.ingredientesPK.equals(other.ingredientesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Ingredientes[ ingredientesPK=" + ingredientesPK + " ]";
    }
    
}
