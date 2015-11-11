/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "DEPARTAMENTOS")
@NamedQueries({
    @NamedQuery(name = "Departamentos.findAll", query = "SELECT d FROM Departamentos d")})
public class Departamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepartamentosPK departamentosPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CARGABLE")
    private Character cargable;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "BODEGA")
    private Character bodega;
    @Column(name = "DIAS_CALCULO_STOCK")
    private BigInteger diasCalculoStock;
    @Column(name = "DIAS_STOCK_MINIMO")
    private BigInteger diasStockMinimo;
    @Column(name = "DIAS_STOCK_MAXIMO")
    private BigInteger diasStockMaximo;
    @Column(name = "PRD_CODIGO")
    private BigInteger prdCodigo;
    @Column(name = "ORIGEN")
    private String origen;
    @Column(name = "CALCULAR_STOCK_TOTAL")
    private String calcularStockTotal;
    @Column(name = "MTV_CODIGO")
    private String mtvCodigo;
    @Column(name = "SOBRESTOCK")
    private String sobrestock;
    @Column(name = "LOCALIZACION")
    private String localizacion;
    @Column(name = "PRC_INICIAL")
    private Short prcInicial;
    @Column(name = "PRC_SUBSECUENTE")
    private Short prcSubsecuente;

    public Departamentos() {
    }

    public Departamentos(DepartamentosPK departamentosPK) {
        this.departamentosPK = departamentosPK;
    }

    public Departamentos(String araCodigo, String codigo) {
        this.departamentosPK = new DepartamentosPK(araCodigo, codigo);
    }

    public DepartamentosPK getDepartamentosPK() {
        return departamentosPK;
    }

    public void setDepartamentosPK(DepartamentosPK departamentosPK) {
        this.departamentosPK = departamentosPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getCargable() {
        return cargable;
    }

    public void setCargable(Character cargable) {
        this.cargable = cargable;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Character getBodega() {
        return bodega;
    }

    public void setBodega(Character bodega) {
        this.bodega = bodega;
    }

    public BigInteger getDiasCalculoStock() {
        return diasCalculoStock;
    }

    public void setDiasCalculoStock(BigInteger diasCalculoStock) {
        this.diasCalculoStock = diasCalculoStock;
    }

    public BigInteger getDiasStockMinimo() {
        return diasStockMinimo;
    }

    public void setDiasStockMinimo(BigInteger diasStockMinimo) {
        this.diasStockMinimo = diasStockMinimo;
    }

    public BigInteger getDiasStockMaximo() {
        return diasStockMaximo;
    }

    public void setDiasStockMaximo(BigInteger diasStockMaximo) {
        this.diasStockMaximo = diasStockMaximo;
    }

    public BigInteger getPrdCodigo() {
        return prdCodigo;
    }

    public void setPrdCodigo(BigInteger prdCodigo) {
        this.prdCodigo = prdCodigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCalcularStockTotal() {
        return calcularStockTotal;
    }

    public void setCalcularStockTotal(String calcularStockTotal) {
        this.calcularStockTotal = calcularStockTotal;
    }

    public String getMtvCodigo() {
        return mtvCodigo;
    }

    public void setMtvCodigo(String mtvCodigo) {
        this.mtvCodigo = mtvCodigo;
    }

    public String getSobrestock() {
        return sobrestock;
    }

    public void setSobrestock(String sobrestock) {
        this.sobrestock = sobrestock;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Short getPrcInicial() {
        return prcInicial;
    }

    public void setPrcInicial(Short prcInicial) {
        this.prcInicial = prcInicial;
    }

    public Short getPrcSubsecuente() {
        return prcSubsecuente;
    }

    public void setPrcSubsecuente(Short prcSubsecuente) {
        this.prcSubsecuente = prcSubsecuente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departamentosPK != null ? departamentosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamentos)) {
            return false;
        }
        Departamentos other = (Departamentos) object;
        if ((this.departamentosPK == null && other.departamentosPK != null) || (this.departamentosPK != null && !this.departamentosPK.equals(other.departamentosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Departamentos[ departamentosPK=" + departamentosPK + " ]";
    }
    
}
