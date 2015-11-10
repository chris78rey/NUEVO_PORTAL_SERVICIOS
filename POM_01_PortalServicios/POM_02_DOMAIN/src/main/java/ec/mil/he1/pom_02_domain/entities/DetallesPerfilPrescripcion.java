/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "DETALLES_PERFIL_PRESCRIPCION")
@NamedQueries({
    @NamedQuery(name = "DetallesPerfilPrescripcion.findAll", query = "SELECT d FROM DetallesPerfilPrescripcion d")})
public class DetallesPerfilPrescripcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesPerfilPrescripcionPK detallesPerfilPrescripcionPK;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "MEDICAMENTO")
    private String medicamento;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "DOSIS_FARMACOLIGICA")
    private BigInteger dosisFarmacoligica;
    @Column(name = "UNIDAD_DOSIS")
    private String unidadDosis;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "VIA")
    private String via;
    @Column(name = "FRECUENCIA")
    private BigInteger frecuencia;
    @Column(name = "UNIDAD_FRECUENCIA")
    private String unidadFrecuencia;
    @Column(name = "DURACION")
    private Integer duracion;
    @Column(name = "UNIDAD_DURACION")
    private String unidadDuracion;
    @JoinColumns({
        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "SBS_SCC_CODIGO"),
        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "SBS_CODIGO"),
        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Items items;
    @JoinColumns({
        @JoinColumn(name = "PRFPRS_PRS_CODIGO", referencedColumnName = "PRS_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "PRFPRS_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PerfilesPrescripciones perfilesPrescripciones;

    public DetallesPerfilPrescripcion() {
    }

    public DetallesPerfilPrescripcion(DetallesPerfilPrescripcionPK detallesPerfilPrescripcionPK) {
        this.detallesPerfilPrescripcionPK = detallesPerfilPrescripcionPK;
    }

    public DetallesPerfilPrescripcion(String prfprsPrsCodigo, short prfprsNumero, short numero) {
        this.detallesPerfilPrescripcionPK = new DetallesPerfilPrescripcionPK(prfprsPrsCodigo, prfprsNumero, numero);
    }

    public DetallesPerfilPrescripcionPK getDetallesPerfilPrescripcionPK() {
        return detallesPerfilPrescripcionPK;
    }

    public void setDetallesPerfilPrescripcionPK(DetallesPerfilPrescripcionPK detallesPerfilPrescripcionPK) {
        this.detallesPerfilPrescripcionPK = detallesPerfilPrescripcionPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getDosisFarmacoligica() {
        return dosisFarmacoligica;
    }

    public void setDosisFarmacoligica(BigInteger dosisFarmacoligica) {
        this.dosisFarmacoligica = dosisFarmacoligica;
    }

    public String getUnidadDosis() {
        return unidadDosis;
    }

    public void setUnidadDosis(String unidadDosis) {
        this.unidadDosis = unidadDosis;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public BigInteger getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(BigInteger frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getUnidadFrecuencia() {
        return unidadFrecuencia;
    }

    public void setUnidadFrecuencia(String unidadFrecuencia) {
        this.unidadFrecuencia = unidadFrecuencia;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getUnidadDuracion() {
        return unidadDuracion;
    }

    public void setUnidadDuracion(String unidadDuracion) {
        this.unidadDuracion = unidadDuracion;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public PerfilesPrescripciones getPerfilesPrescripciones() {
        return perfilesPrescripciones;
    }

    public void setPerfilesPrescripciones(PerfilesPrescripciones perfilesPrescripciones) {
        this.perfilesPrescripciones = perfilesPrescripciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesPerfilPrescripcionPK != null ? detallesPerfilPrescripcionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPerfilPrescripcion)) {
            return false;
        }
        DetallesPerfilPrescripcion other = (DetallesPerfilPrescripcion) object;
        if ((this.detallesPerfilPrescripcionPK == null && other.detallesPerfilPrescripcionPK != null) || (this.detallesPerfilPrescripcionPK != null && !this.detallesPerfilPrescripcionPK.equals(other.detallesPerfilPrescripcionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesPerfilPrescripcion[ detallesPerfilPrescripcionPK=" + detallesPerfilPrescripcionPK + " ]";
    }
    
}
