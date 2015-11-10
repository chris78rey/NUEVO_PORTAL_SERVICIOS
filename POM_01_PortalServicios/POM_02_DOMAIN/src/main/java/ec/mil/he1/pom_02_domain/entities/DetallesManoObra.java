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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_MANO_OBRA")
@NamedQueries({
    @NamedQuery(name = "DetallesManoObra.findAll", query = "SELECT d FROM DetallesManoObra d")})
public class DetallesManoObra implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesManoObraPK detallesManoObraPK;
    @Column(name = "CANTIDAD")
    private Short cantidad;
    @Column(name = "VECES")
    private Short veces;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TIEMPO_MINUTOS")
    private BigDecimal tiempoMinutos;
    @Column(name = "TIEMPO_HORAS")
    private BigDecimal tiempoHoras;
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "COSTO")
    private BigDecimal costo;

    public DetallesManoObra() {
    }

    public DetallesManoObra(DetallesManoObraPK detallesManoObraPK) {
        this.detallesManoObraPK = detallesManoObraPK;
    }

    public DetallesManoObra(int mnoobrdprPrdCodigo, String mnoobrdprClasificacion, String mnoobrdprDprAraCodigo, String mnoobrdprDprCodigo, int traCodigo) {
        this.detallesManoObraPK = new DetallesManoObraPK(mnoobrdprPrdCodigo, mnoobrdprClasificacion, mnoobrdprDprAraCodigo, mnoobrdprDprCodigo, traCodigo);
    }

    public DetallesManoObraPK getDetallesManoObraPK() {
        return detallesManoObraPK;
    }

    public void setDetallesManoObraPK(DetallesManoObraPK detallesManoObraPK) {
        this.detallesManoObraPK = detallesManoObraPK;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }

    public Short getVeces() {
        return veces;
    }

    public void setVeces(Short veces) {
        this.veces = veces;
    }

    public BigDecimal getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(BigDecimal tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }

    public BigDecimal getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(BigDecimal tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesManoObraPK != null ? detallesManoObraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesManoObra)) {
            return false;
        }
        DetallesManoObra other = (DetallesManoObra) object;
        if ((this.detallesManoObraPK == null && other.detallesManoObraPK != null) || (this.detallesManoObraPK != null && !this.detallesManoObraPK.equals(other.detallesManoObraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesManoObra[ detallesManoObraPK=" + detallesManoObraPK + " ]";
    }
    
}
