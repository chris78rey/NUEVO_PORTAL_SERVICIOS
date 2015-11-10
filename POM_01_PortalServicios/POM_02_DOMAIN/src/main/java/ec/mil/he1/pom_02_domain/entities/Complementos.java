/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "COMPLEMENTOS")
@NamedQueries({
    @NamedQuery(name = "Complementos.findAll", query = "SELECT c FROM Complementos c")})
public class Complementos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "OPCIONALIDAD")
    private Character opcionalidad;
    @Column(name = "DESCRIPCION_ABREVIADA")
    private String descripcionAbreviada;
    @Column(name = "OPERADOR")
    private String operador;
    @Column(name = "UNIDAD")
    private String unidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_MAXIMO")
    private BigDecimal valorMaximo;
    @Column(name = "VALOR_MINIMO")
    private BigDecimal valorMinimo;
    @JoinTable(name = "COMPLEMENTOS_DE_VARIABLES", joinColumns = {
        @JoinColumn(name = "CMPLMT_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "VRBEXM_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<VariablesDeExamenes> variablesDeExamenesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "complementos", fetch = FetchType.LAZY)
    private List<RangosNormalidadComplementos> rangosNormalidadComplementosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "complementos", fetch = FetchType.LAZY)
    private List<ComplementosAResultados> complementosAResultadosList;
    @JoinColumn(name = "TPODTO_SECUENCIAL", referencedColumnName = "SECUENCIAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiposDeDatos tiposDeDatos;

    public Complementos() {
    }

    public Complementos(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getOpcionalidad() {
        return opcionalidad;
    }

    public void setOpcionalidad(Character opcionalidad) {
        this.opcionalidad = opcionalidad;
    }

    public String getDescripcionAbreviada() {
        return descripcionAbreviada;
    }

    public void setDescripcionAbreviada(String descripcionAbreviada) {
        this.descripcionAbreviada = descripcionAbreviada;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public BigDecimal getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(BigDecimal valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public BigDecimal getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(BigDecimal valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public List<VariablesDeExamenes> getVariablesDeExamenesList() {
        return variablesDeExamenesList;
    }

    public void setVariablesDeExamenesList(List<VariablesDeExamenes> variablesDeExamenesList) {
        this.variablesDeExamenesList = variablesDeExamenesList;
    }

    public List<RangosNormalidadComplementos> getRangosNormalidadComplementosList() {
        return rangosNormalidadComplementosList;
    }

    public void setRangosNormalidadComplementosList(List<RangosNormalidadComplementos> rangosNormalidadComplementosList) {
        this.rangosNormalidadComplementosList = rangosNormalidadComplementosList;
    }

    public List<ComplementosAResultados> getComplementosAResultadosList() {
        return complementosAResultadosList;
    }

    public void setComplementosAResultadosList(List<ComplementosAResultados> complementosAResultadosList) {
        this.complementosAResultadosList = complementosAResultadosList;
    }

    public TiposDeDatos getTiposDeDatos() {
        return tiposDeDatos;
    }

    public void setTiposDeDatos(TiposDeDatos tiposDeDatos) {
        this.tiposDeDatos = tiposDeDatos;
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
        if (!(object instanceof Complementos)) {
            return false;
        }
        Complementos other = (Complementos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Complementos[ codigo=" + codigo + " ]";
    }
    
}
