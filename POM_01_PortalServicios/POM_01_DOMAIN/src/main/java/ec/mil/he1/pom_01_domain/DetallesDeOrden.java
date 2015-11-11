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
@Table(name = "DETALLES_DE_ORDEN")
@NamedQueries({
    @NamedQuery(name = "DetallesDeOrden.findAll", query = "SELECT d FROM DetallesDeOrden d")})
public class DetallesDeOrden implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesDeOrdenPK detallesDeOrdenPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "PRECIO")
    private BigDecimal precio;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "PROMOCION")
    private BigDecimal promocion;

    public DetallesDeOrden() {
    }

    public DetallesDeOrden(DetallesDeOrdenPK detallesDeOrdenPK) {
        this.detallesDeOrdenPK = detallesDeOrdenPK;
    }

    public DetallesDeOrden(int ordcmpNumero, Character dtlcmpItmTipo, String dtlcmpItmSbsSccCodigo, String dtlcmpItmSbsCodigo, short dtlcmpItmCodigo) {
        this.detallesDeOrdenPK = new DetallesDeOrdenPK(ordcmpNumero, dtlcmpItmTipo, dtlcmpItmSbsSccCodigo, dtlcmpItmSbsCodigo, dtlcmpItmCodigo);
    }

    public DetallesDeOrdenPK getDetallesDeOrdenPK() {
        return detallesDeOrdenPK;
    }

    public void setDetallesDeOrdenPK(DetallesDeOrdenPK detallesDeOrdenPK) {
        this.detallesDeOrdenPK = detallesDeOrdenPK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getPromocion() {
        return promocion;
    }

    public void setPromocion(BigDecimal promocion) {
        this.promocion = promocion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesDeOrdenPK != null ? detallesDeOrdenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDeOrden)) {
            return false;
        }
        DetallesDeOrden other = (DetallesDeOrden) object;
        if ((this.detallesDeOrdenPK == null && other.detallesDeOrdenPK != null) || (this.detallesDeOrdenPK != null && !this.detallesDeOrdenPK.equals(other.detallesDeOrdenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDeOrden[ detallesDeOrdenPK=" + detallesDeOrdenPK + " ]";
    }
    
}
