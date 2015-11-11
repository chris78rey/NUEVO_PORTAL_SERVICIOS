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
@Table(name = "DETALLES_DEVOLUCION")
@NamedQueries({
    @NamedQuery(name = "DetallesDevolucion.findAll", query = "SELECT d FROM DetallesDevolucion d")})
public class DetallesDevolucion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesDevolucionPK detallesDevolucionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "VALORE")
    private BigDecimal valore;
    @Column(name = "DTLFCT_FCT_CAJA")
    private String dtlfctFctCaja;
    @Column(name = "VALOR_IVA_UNITARIO")
    private BigDecimal valorIvaUnitario;
    @Column(name = "DTLFCT_SEGURO")
    private Character dtlfctSeguro;

    public DetallesDevolucion() {
    }

    public DetallesDevolucion(DetallesDevolucionPK detallesDevolucionPK) {
        this.detallesDevolucionPK = detallesDevolucionPK;
    }

    public DetallesDevolucion(int dvlNumero, Character dtlfctDocumento, int dtlfctFctNumero, long dtlfctNumero, int dtlfctDetalle) {
        this.detallesDevolucionPK = new DetallesDevolucionPK(dvlNumero, dtlfctDocumento, dtlfctFctNumero, dtlfctNumero, dtlfctDetalle);
    }

    public DetallesDevolucionPK getDetallesDevolucionPK() {
        return detallesDevolucionPK;
    }

    public void setDetallesDevolucionPK(DetallesDevolucionPK detallesDevolucionPK) {
        this.detallesDevolucionPK = detallesDevolucionPK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValore() {
        return valore;
    }

    public void setValore(BigDecimal valore) {
        this.valore = valore;
    }

    public String getDtlfctFctCaja() {
        return dtlfctFctCaja;
    }

    public void setDtlfctFctCaja(String dtlfctFctCaja) {
        this.dtlfctFctCaja = dtlfctFctCaja;
    }

    public BigDecimal getValorIvaUnitario() {
        return valorIvaUnitario;
    }

    public void setValorIvaUnitario(BigDecimal valorIvaUnitario) {
        this.valorIvaUnitario = valorIvaUnitario;
    }

    public Character getDtlfctSeguro() {
        return dtlfctSeguro;
    }

    public void setDtlfctSeguro(Character dtlfctSeguro) {
        this.dtlfctSeguro = dtlfctSeguro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesDevolucionPK != null ? detallesDevolucionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDevolucion)) {
            return false;
        }
        DetallesDevolucion other = (DetallesDevolucion) object;
        if ((this.detallesDevolucionPK == null && other.detallesDevolucionPK != null) || (this.detallesDevolucionPK != null && !this.detallesDevolucionPK.equals(other.detallesDevolucionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDevolucion[ detallesDevolucionPK=" + detallesDevolucionPK + " ]";
    }
    
}
