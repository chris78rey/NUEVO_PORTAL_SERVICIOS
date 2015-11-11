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
@Table(name = "SUB_BODEGAS")
@NamedQueries({
    @NamedQuery(name = "SubBodegas.findAll", query = "SELECT s FROM SubBodegas s")})
public class SubBodegas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubBodegasPK subBodegasPK;
    @Column(name = "ESTADO_ITEM")
    private String estadoItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "STOCK")
    private BigDecimal stock;
    @Column(name = "STOCK_NOMINAL")
    private BigDecimal stockNominal;
    @Column(name = "PUNTO_REPOSICION")
    private BigDecimal puntoReposicion;
    @Column(name = "CALCULADO")
    private String calculado;

    public SubBodegas() {
    }

    public SubBodegas(SubBodegasPK subBodegasPK) {
        this.subBodegasPK = subBodegasPK;
    }

    public SubBodegas(Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo, String dprCodigo, String dprAraCodigo) {
        this.subBodegasPK = new SubBodegasPK(itmTipo, itmSbsSccCodigo, itmSbsCodigo, itmCodigo, dprCodigo, dprAraCodigo);
    }

    public SubBodegasPK getSubBodegasPK() {
        return subBodegasPK;
    }

    public void setSubBodegasPK(SubBodegasPK subBodegasPK) {
        this.subBodegasPK = subBodegasPK;
    }

    public String getEstadoItem() {
        return estadoItem;
    }

    public void setEstadoItem(String estadoItem) {
        this.estadoItem = estadoItem;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getStockNominal() {
        return stockNominal;
    }

    public void setStockNominal(BigDecimal stockNominal) {
        this.stockNominal = stockNominal;
    }

    public BigDecimal getPuntoReposicion() {
        return puntoReposicion;
    }

    public void setPuntoReposicion(BigDecimal puntoReposicion) {
        this.puntoReposicion = puntoReposicion;
    }

    public String getCalculado() {
        return calculado;
    }

    public void setCalculado(String calculado) {
        this.calculado = calculado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subBodegasPK != null ? subBodegasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubBodegas)) {
            return false;
        }
        SubBodegas other = (SubBodegas) object;
        if ((this.subBodegasPK == null && other.subBodegasPK != null) || (this.subBodegasPK != null && !this.subBodegasPK.equals(other.subBodegasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SubBodegas[ subBodegasPK=" + subBodegasPK + " ]";
    }
    
}
