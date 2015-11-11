/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Column(name = "ITM_CODIGO")
    private Short itmCodigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_BARRAS")
    private String codigoBarras;

    public ItemsCodigoBarras() {
    }

    public ItemsCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public Short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(Short itmCodigo) {
        this.itmCodigo = itmCodigo;
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
        return "ec.mil.he1.pom_01_domain.ItemsCodigoBarras[ codigoBarras=" + codigoBarras + " ]";
    }
    
}
