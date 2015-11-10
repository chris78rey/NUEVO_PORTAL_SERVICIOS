/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "ITEMS_CODIGO_BARRAS")
@NamedQueries({
    @NamedQuery(name = "ItemsCodigoBarras.findAll", query = "SELECT i FROM ItemsCodigoBarras i")})
public class ItemsCodigoBarras implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_BARRAS")
    private String codigoBarras;
    @JoinColumns({
        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "SBS_SCC_CODIGO"),
        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "SBS_CODIGO"),
        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Items items;

    public ItemsCodigoBarras() {
    }

    public ItemsCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
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
        hash += (codigoBarras != null ? codigoBarras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemsCodigoBarras)) {
            return false;
        }
        ItemsCodigoBarras other = (ItemsCodigoBarras) object;
        if ((this.codigoBarras == null && other.codigoBarras != null) || (this.codigoBarras != null && !this.codigoBarras.equals(other.codigoBarras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ItemsCodigoBarras[ codigoBarras=" + codigoBarras + " ]";
    }
    
}
