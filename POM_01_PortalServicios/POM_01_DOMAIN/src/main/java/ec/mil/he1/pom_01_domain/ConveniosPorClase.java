/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CONVENIOS_POR_CLASE")
@NamedQueries({
    @NamedQuery(name = "ConveniosPorClase.findAll", query = "SELECT c FROM ConveniosPorClase c")})
public class ConveniosPorClase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLASIFICACION")
    private String clasificacion;
    @Column(name = "MDOPGO_NUMERO")
    private Short mdopgoNumero;
    @Column(name = "DOMINIO_MODO_DE_PAGO")
    private String dominioModoDePago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE_DESCUENTO")
    private BigDecimal porcentajeDescuento;
    @Column(name = "COMISION_PAGO_EFECTIVO")
    private BigDecimal comisionPagoEfectivo;
    @Column(name = "COMISION_PAGO_CREDITO")
    private BigDecimal comisionPagoCredito;
    @Column(name = "MAXIMO_CUPO")
    private BigDecimal maximoCupo;
    @Column(name = "DIAS_MAXIMO_PAGO")
    private Short diasMaximoPago;

    public ConveniosPorClase() {
    }

    public ConveniosPorClase(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Short getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(Short mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
    }

    public String getDominioModoDePago() {
        return dominioModoDePago;
    }

    public void setDominioModoDePago(String dominioModoDePago) {
        this.dominioModoDePago = dominioModoDePago;
    }

    public BigDecimal getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public BigDecimal getComisionPagoEfectivo() {
        return comisionPagoEfectivo;
    }

    public void setComisionPagoEfectivo(BigDecimal comisionPagoEfectivo) {
        this.comisionPagoEfectivo = comisionPagoEfectivo;
    }

    public BigDecimal getComisionPagoCredito() {
        return comisionPagoCredito;
    }

    public void setComisionPagoCredito(BigDecimal comisionPagoCredito) {
        this.comisionPagoCredito = comisionPagoCredito;
    }

    public BigDecimal getMaximoCupo() {
        return maximoCupo;
    }

    public void setMaximoCupo(BigDecimal maximoCupo) {
        this.maximoCupo = maximoCupo;
    }

    public Short getDiasMaximoPago() {
        return diasMaximoPago;
    }

    public void setDiasMaximoPago(Short diasMaximoPago) {
        this.diasMaximoPago = diasMaximoPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clasificacion != null ? clasificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConveniosPorClase)) {
            return false;
        }
        ConveniosPorClase other = (ConveniosPorClase) object;
        if ((this.clasificacion == null && other.clasificacion != null) || (this.clasificacion != null && !this.clasificacion.equals(other.clasificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ConveniosPorClase[ clasificacion=" + clasificacion + " ]";
    }
    
}
