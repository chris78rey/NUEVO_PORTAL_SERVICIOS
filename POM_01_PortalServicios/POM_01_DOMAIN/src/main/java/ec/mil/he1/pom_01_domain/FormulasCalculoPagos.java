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
@Table(name = "FORMULAS_CALCULO_PAGOS")
@NamedQueries({
    @NamedQuery(name = "FormulasCalculoPagos.findAll", query = "SELECT f FROM FormulasCalculoPagos f")})
public class FormulasCalculoPagos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IMPUESTO")
    private BigDecimal impuesto;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "RANGO_MINIMO")
    private BigDecimal rangoMinimo;
    @Column(name = "RANGO_MAXIMO")
    private BigDecimal rangoMaximo;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "MSTBNF_CODIGO")
    private String mstbnfCodigo;

    public FormulasCalculoPagos() {
    }

    public FormulasCalculoPagos(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(BigDecimal impuesto) {
        this.impuesto = impuesto;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public BigDecimal getRangoMinimo() {
        return rangoMinimo;
    }

    public void setRangoMinimo(BigDecimal rangoMinimo) {
        this.rangoMinimo = rangoMinimo;
    }

    public BigDecimal getRangoMaximo() {
        return rangoMaximo;
    }

    public void setRangoMaximo(BigDecimal rangoMaximo) {
        this.rangoMaximo = rangoMaximo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getMstbnfCodigo() {
        return mstbnfCodigo;
    }

    public void setMstbnfCodigo(String mstbnfCodigo) {
        this.mstbnfCodigo = mstbnfCodigo;
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
        if (!(object instanceof FormulasCalculoPagos)) {
            return false;
        }
        FormulasCalculoPagos other = (FormulasCalculoPagos) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FormulasCalculoPagos[ numero=" + numero + " ]";
    }
    
}
