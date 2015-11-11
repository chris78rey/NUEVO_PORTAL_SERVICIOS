/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "POSOLOGIA")
@NamedQueries({
    @NamedQuery(name = "Posologia.findAll", query = "SELECT p FROM Posologia p")})
public class Posologia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PosologiaPK posologiaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "CANTIDAD_MAXIMA")
    private BigDecimal cantidadMaxima;
    @Column(name = "UND_ADMINISTRACION")
    private String undAdministracion;
    @Column(name = "VIA")
    private String via;
    @Column(name = "FRECUENCIA_DIARIA")
    private Short frecuenciaDiaria;
    @Column(name = "FRECUENCIA_MAXIMA")
    private Short frecuenciaMaxima;
    @Column(name = "UND_FRECUENCIA")
    private String undFrecuencia;
    @Column(name = "DOSIS_FARMACOLOGICA")
    private BigInteger dosisFarmacologica;
    @Column(name = "DURACION")
    private Integer duracion;
    @Column(name = "DURACION_MAXIMA")
    private Integer duracionMaxima;
    @Column(name = "UND_DURACION")
    private String undDuracion;
    @Column(name = "INSTRUCCIONES")
    private String instrucciones;
    @Column(name = "EDAD_MINIMA")
    private Short edadMinima;
    @Column(name = "EDAD_MAXIMA")
    private Short edadMaxima;
    @Column(name = "PESO")
    private Short peso;
    @Column(name = "PESO_MAXIMO")
    private Short pesoMaximo;
    @Column(name = "UNIDAD_CONT_ADMI")
    private String unidadContAdmi;
    @Column(name = "CONTRAINDICACIONES")
    private String contraindicaciones;

    public Posologia() {
    }

    public Posologia(PosologiaPK posologiaPK) {
        this.posologiaPK = posologiaPK;
    }

    public Posologia(int posologia, int pgaPreCodigo, String pgaGenCodigoP) {
        this.posologiaPK = new PosologiaPK(posologia, pgaPreCodigo, pgaGenCodigoP);
    }

    public PosologiaPK getPosologiaPK() {
        return posologiaPK;
    }

    public void setPosologiaPK(PosologiaPK posologiaPK) {
        this.posologiaPK = posologiaPK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(BigDecimal cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public String getUndAdministracion() {
        return undAdministracion;
    }

    public void setUndAdministracion(String undAdministracion) {
        this.undAdministracion = undAdministracion;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public Short getFrecuenciaDiaria() {
        return frecuenciaDiaria;
    }

    public void setFrecuenciaDiaria(Short frecuenciaDiaria) {
        this.frecuenciaDiaria = frecuenciaDiaria;
    }

    public Short getFrecuenciaMaxima() {
        return frecuenciaMaxima;
    }

    public void setFrecuenciaMaxima(Short frecuenciaMaxima) {
        this.frecuenciaMaxima = frecuenciaMaxima;
    }

    public String getUndFrecuencia() {
        return undFrecuencia;
    }

    public void setUndFrecuencia(String undFrecuencia) {
        this.undFrecuencia = undFrecuencia;
    }

    public BigInteger getDosisFarmacologica() {
        return dosisFarmacologica;
    }

    public void setDosisFarmacologica(BigInteger dosisFarmacologica) {
        this.dosisFarmacologica = dosisFarmacologica;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getDuracionMaxima() {
        return duracionMaxima;
    }

    public void setDuracionMaxima(Integer duracionMaxima) {
        this.duracionMaxima = duracionMaxima;
    }

    public String getUndDuracion() {
        return undDuracion;
    }

    public void setUndDuracion(String undDuracion) {
        this.undDuracion = undDuracion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Short getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Short edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Short getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Short edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public Short getPeso() {
        return peso;
    }

    public void setPeso(Short peso) {
        this.peso = peso;
    }

    public Short getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Short pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public String getUnidadContAdmi() {
        return unidadContAdmi;
    }

    public void setUnidadContAdmi(String unidadContAdmi) {
        this.unidadContAdmi = unidadContAdmi;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (posologiaPK != null ? posologiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Posologia)) {
            return false;
        }
        Posologia other = (Posologia) object;
        if ((this.posologiaPK == null && other.posologiaPK != null) || (this.posologiaPK != null && !this.posologiaPK.equals(other.posologiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Posologia[ posologiaPK=" + posologiaPK + " ]";
    }
    
}
