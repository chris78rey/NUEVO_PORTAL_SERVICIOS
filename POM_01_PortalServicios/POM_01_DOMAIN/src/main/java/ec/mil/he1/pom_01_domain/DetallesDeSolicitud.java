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
@Table(name = "DETALLES_DE_SOLICITUD")
@NamedQueries({
    @NamedQuery(name = "DetallesDeSolicitud.findAll", query = "SELECT d FROM DetallesDeSolicitud d")})
public class DetallesDeSolicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesDeSolicitudPK detallesDeSolicitudPK;
    @Column(name = "OBSERVACION")
    private String observacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "STOCK")
    private BigDecimal stock;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "ORDEN_NUMERO")
    private Integer ordenNumero;
    @Column(name = "CANTIDAD_SOLICITADA")
    private BigDecimal cantidadSolicitada;
    @Column(name = "CANTIDAD_EN_TRANSITO")
    private BigDecimal cantidadEnTransito;

    public DetallesDeSolicitud() {
    }

    public DetallesDeSolicitud(DetallesDeSolicitudPK detallesDeSolicitudPK) {
        this.detallesDeSolicitudPK = detallesDeSolicitudPK;
    }

    public DetallesDeSolicitud(int slccmpCodigo, Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo) {
        this.detallesDeSolicitudPK = new DetallesDeSolicitudPK(slccmpCodigo, itmTipo, itmSbsSccCodigo, itmSbsCodigo, itmCodigo);
    }

    public DetallesDeSolicitudPK getDetallesDeSolicitudPK() {
        return detallesDeSolicitudPK;
    }

    public void setDetallesDeSolicitudPK(DetallesDeSolicitudPK detallesDeSolicitudPK) {
        this.detallesDeSolicitudPK = detallesDeSolicitudPK;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getOrdenNumero() {
        return ordenNumero;
    }

    public void setOrdenNumero(Integer ordenNumero) {
        this.ordenNumero = ordenNumero;
    }

    public BigDecimal getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(BigDecimal cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public BigDecimal getCantidadEnTransito() {
        return cantidadEnTransito;
    }

    public void setCantidadEnTransito(BigDecimal cantidadEnTransito) {
        this.cantidadEnTransito = cantidadEnTransito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesDeSolicitudPK != null ? detallesDeSolicitudPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDeSolicitud)) {
            return false;
        }
        DetallesDeSolicitud other = (DetallesDeSolicitud) object;
        if ((this.detallesDeSolicitudPK == null && other.detallesDeSolicitudPK != null) || (this.detallesDeSolicitudPK != null && !this.detallesDeSolicitudPK.equals(other.detallesDeSolicitudPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDeSolicitud[ detallesDeSolicitudPK=" + detallesDeSolicitudPK + " ]";
    }
    
}
