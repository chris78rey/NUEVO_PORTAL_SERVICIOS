/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "TRATAMIENTOS_QUIMIOTERAPIA")
@NamedQueries({
    @NamedQuery(name = "TratamientosQuimioterapia.findAll", query = "SELECT t FROM TratamientosQuimioterapia t")})
public class TratamientosQuimioterapia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TratamientosQuimioterapiaPK tratamientosQuimioterapiaPK;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "INTERVALO")
    private Short intervalo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DOSIS_PROPUESTA")
    private BigDecimal dosisPropuesta;
    @Column(name = "DOSIS_ACUMULADA")
    private BigDecimal dosisAcumulada;
    @Column(name = "CICLOS")
    private Short ciclos;
    @Column(name = "ADMINISTRACION")
    private Character administracion;

    public TratamientosQuimioterapia() {
    }

    public TratamientosQuimioterapia(TratamientosQuimioterapiaPK tratamientosQuimioterapiaPK) {
        this.tratamientosQuimioterapiaPK = tratamientosQuimioterapiaPK;
    }

    public TratamientosQuimioterapia(String mdcqmtCodigo, int qmtNumero, Date fechaInicio) {
        this.tratamientosQuimioterapiaPK = new TratamientosQuimioterapiaPK(mdcqmtCodigo, qmtNumero, fechaInicio);
    }

    public TratamientosQuimioterapiaPK getTratamientosQuimioterapiaPK() {
        return tratamientosQuimioterapiaPK;
    }

    public void setTratamientosQuimioterapiaPK(TratamientosQuimioterapiaPK tratamientosQuimioterapiaPK) {
        this.tratamientosQuimioterapiaPK = tratamientosQuimioterapiaPK;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Short getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(Short intervalo) {
        this.intervalo = intervalo;
    }

    public BigDecimal getDosisPropuesta() {
        return dosisPropuesta;
    }

    public void setDosisPropuesta(BigDecimal dosisPropuesta) {
        this.dosisPropuesta = dosisPropuesta;
    }

    public BigDecimal getDosisAcumulada() {
        return dosisAcumulada;
    }

    public void setDosisAcumulada(BigDecimal dosisAcumulada) {
        this.dosisAcumulada = dosisAcumulada;
    }

    public Short getCiclos() {
        return ciclos;
    }

    public void setCiclos(Short ciclos) {
        this.ciclos = ciclos;
    }

    public Character getAdministracion() {
        return administracion;
    }

    public void setAdministracion(Character administracion) {
        this.administracion = administracion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tratamientosQuimioterapiaPK != null ? tratamientosQuimioterapiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TratamientosQuimioterapia)) {
            return false;
        }
        TratamientosQuimioterapia other = (TratamientosQuimioterapia) object;
        if ((this.tratamientosQuimioterapiaPK == null && other.tratamientosQuimioterapiaPK != null) || (this.tratamientosQuimioterapiaPK != null && !this.tratamientosQuimioterapiaPK.equals(other.tratamientosQuimioterapiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TratamientosQuimioterapia[ tratamientosQuimioterapiaPK=" + tratamientosQuimioterapiaPK + " ]";
    }
    
}
