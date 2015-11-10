/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PRESENTACIONES")
@NamedQueries({
    @NamedQuery(name = "Presentaciones.findAll", query = "SELECT p FROM Presentaciones p")})
public class Presentaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "FORMA")
    private String forma;
    @Column(name = "CANTIDAD_CONCENTRACION")
    private BigInteger cantidadConcentracion;
    @Column(name = "UNIDAD_CONCENTRACION")
    private String unidadConcentracion;
    @Column(name = "VALOR_SOLUCION_P")
    private BigInteger valorSolucionP;
    @Column(name = "UNIDAD_SOLUCION")
    private String unidadSolucion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RELACION")
    private BigDecimal relacion;
    @Column(name = "VOLUMEN_TOTAL")
    private BigDecimal volumenTotal;
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "UNIDAD_PESO")
    private String unidadPeso;
    @Column(name = "CANTIDAD_CONCENTRACION_S")
    private BigInteger cantidadConcentracionS;
    @Column(name = "UNIDAD_CONCENTRACION_S")
    private String unidadConcentracionS;
    @Column(name = "VALOR_SOLUCION_S")
    private BigInteger valorSolucionS;
    @Column(name = "UNIDAD_SOLUCION_S")
    private String unidadSolucionS;
    @Column(name = "PESO_SECUNDARIO")
    private BigDecimal pesoSecundario;
    @Column(name = "UNDPESOS")
    private String undpesos;
    @Column(name = "PRESENTACION")
    private String presentacion;
    @Column(name = "CANTIDAD_PRESENTACION")
    private BigInteger cantidadPresentacion;
    @Column(name = "UNIDAD_PRESENTACION")
    private String unidadPresentacion;
    @Column(name = "UNIDAD_PESO_S")
    private String unidadPesoS;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "presentaciones", fetch = FetchType.LAZY)
    private List<PresentacionGenerica> presentacionGenericaList;

    public Presentaciones() {
    }

    public Presentaciones(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public BigInteger getCantidadConcentracion() {
        return cantidadConcentracion;
    }

    public void setCantidadConcentracion(BigInteger cantidadConcentracion) {
        this.cantidadConcentracion = cantidadConcentracion;
    }

    public String getUnidadConcentracion() {
        return unidadConcentracion;
    }

    public void setUnidadConcentracion(String unidadConcentracion) {
        this.unidadConcentracion = unidadConcentracion;
    }

    public BigInteger getValorSolucionP() {
        return valorSolucionP;
    }

    public void setValorSolucionP(BigInteger valorSolucionP) {
        this.valorSolucionP = valorSolucionP;
    }

    public String getUnidadSolucion() {
        return unidadSolucion;
    }

    public void setUnidadSolucion(String unidadSolucion) {
        this.unidadSolucion = unidadSolucion;
    }

    public BigDecimal getRelacion() {
        return relacion;
    }

    public void setRelacion(BigDecimal relacion) {
        this.relacion = relacion;
    }

    public BigDecimal getVolumenTotal() {
        return volumenTotal;
    }

    public void setVolumenTotal(BigDecimal volumenTotal) {
        this.volumenTotal = volumenTotal;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getUnidadPeso() {
        return unidadPeso;
    }

    public void setUnidadPeso(String unidadPeso) {
        this.unidadPeso = unidadPeso;
    }

    public BigInteger getCantidadConcentracionS() {
        return cantidadConcentracionS;
    }

    public void setCantidadConcentracionS(BigInteger cantidadConcentracionS) {
        this.cantidadConcentracionS = cantidadConcentracionS;
    }

    public String getUnidadConcentracionS() {
        return unidadConcentracionS;
    }

    public void setUnidadConcentracionS(String unidadConcentracionS) {
        this.unidadConcentracionS = unidadConcentracionS;
    }

    public BigInteger getValorSolucionS() {
        return valorSolucionS;
    }

    public void setValorSolucionS(BigInteger valorSolucionS) {
        this.valorSolucionS = valorSolucionS;
    }

    public String getUnidadSolucionS() {
        return unidadSolucionS;
    }

    public void setUnidadSolucionS(String unidadSolucionS) {
        this.unidadSolucionS = unidadSolucionS;
    }

    public BigDecimal getPesoSecundario() {
        return pesoSecundario;
    }

    public void setPesoSecundario(BigDecimal pesoSecundario) {
        this.pesoSecundario = pesoSecundario;
    }

    public String getUndpesos() {
        return undpesos;
    }

    public void setUndpesos(String undpesos) {
        this.undpesos = undpesos;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public BigInteger getCantidadPresentacion() {
        return cantidadPresentacion;
    }

    public void setCantidadPresentacion(BigInteger cantidadPresentacion) {
        this.cantidadPresentacion = cantidadPresentacion;
    }

    public String getUnidadPresentacion() {
        return unidadPresentacion;
    }

    public void setUnidadPresentacion(String unidadPresentacion) {
        this.unidadPresentacion = unidadPresentacion;
    }

    public String getUnidadPesoS() {
        return unidadPesoS;
    }

    public void setUnidadPesoS(String unidadPesoS) {
        this.unidadPesoS = unidadPesoS;
    }

    public List<PresentacionGenerica> getPresentacionGenericaList() {
        return presentacionGenericaList;
    }

    public void setPresentacionGenericaList(List<PresentacionGenerica> presentacionGenericaList) {
        this.presentacionGenericaList = presentacionGenericaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presentaciones)) {
            return false;
        }
        Presentaciones other = (Presentaciones) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Presentaciones[ codigo=" + codigo + " ]";
    }
    
}
