/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DESCUENTOS_CM")
@NamedQueries({
    @NamedQuery(name = "DescuentosCm.findAll", query = "SELECT d FROM DescuentosCm d")})
public class DescuentosCm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "DTLHNRMDC_NUMERO")
    private Integer dtlhnrmdcNumero;
    @Column(name = "PLNHNRMDC_NUMERO")
    private Integer plnhnrmdcNumero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "ABIERTA")
    private Character abierta;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;

    public DescuentosCm() {
    }

    public DescuentosCm(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getDtlhnrmdcNumero() {
        return dtlhnrmdcNumero;
    }

    public void setDtlhnrmdcNumero(Integer dtlhnrmdcNumero) {
        this.dtlhnrmdcNumero = dtlhnrmdcNumero;
    }

    public Integer getPlnhnrmdcNumero() {
        return plnhnrmdcNumero;
    }

    public void setPlnhnrmdcNumero(Integer plnhnrmdcNumero) {
        this.plnhnrmdcNumero = plnhnrmdcNumero;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Character getAbierta() {
        return abierta;
    }

    public void setAbierta(Character abierta) {
        this.abierta = abierta;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DescuentosCm)) {
            return false;
        }
        DescuentosCm other = (DescuentosCm) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DescuentosCm[ numero=" + numero + " ]";
    }
    
}
