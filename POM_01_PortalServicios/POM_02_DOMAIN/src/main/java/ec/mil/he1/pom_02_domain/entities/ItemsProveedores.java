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
@Table(name = "ITEMS_PROVEEDORES")
@NamedQueries({
    @NamedQuery(name = "ItemsProveedores.findAll", query = "SELECT i FROM ItemsProveedores i")})
public class ItemsProveedores implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemsProveedoresPK itemsProveedoresPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @JoinColumns({
        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "SBS_SCC_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "SBS_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Items items;
    @JoinColumn(name = "PRD_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Proveedores proveedores;

    public ItemsProveedores() {
    }

    public ItemsProveedores(ItemsProveedoresPK itemsProveedoresPK) {
        this.itemsProveedoresPK = itemsProveedoresPK;
    }

    public ItemsProveedores(Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo, short prdCodigo) {
        this.itemsProveedoresPK = new ItemsProveedoresPK(itmTipo, itmSbsSccCodigo, itmSbsCodigo, itmCodigo, prdCodigo);
    }

    public ItemsProveedoresPK getItemsProveedoresPK() {
        return itemsProveedoresPK;
    }

    public void setItemsProveedoresPK(ItemsProveedoresPK itemsProveedoresPK) {
        this.itemsProveedoresPK = itemsProveedoresPK;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
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
        hash += (itemsProveedoresPK != null ? itemsProveedoresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemsProveedores)) {
            return false;
        }
        ItemsProveedores other = (ItemsProveedores) object;
        if ((this.itemsProveedoresPK == null && other.itemsProveedoresPK != null) || (this.itemsProveedoresPK != null && !this.itemsProveedoresPK.equals(other.itemsProveedoresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ItemsProveedores[ itemsProveedoresPK=" + itemsProveedoresPK + " ]";
    }
    
}
