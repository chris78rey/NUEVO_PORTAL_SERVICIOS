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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "EGRESOS_CAJA_MEDICA")
@NamedQueries({
    @NamedQuery(name = "EgresosCajaMedica.findAll", query = "SELECT e FROM EgresosCajaMedica e")})
public class EgresosCajaMedica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "VALOR_MODIFICABLE")
    private Character valorModificable;
    @OneToMany(mappedBy = "egresosCajaMedica", fetch = FetchType.LAZY)
    private List<CreacionEgresosFct> creacionEgresosFctList;
    @OneToMany(mappedBy = "egresosCajaMedica", fetch = FetchType.LAZY)
    private List<DescuentosAgrupados> descuentosAgrupadosList;
    @JoinColumn(name = "AGREGR_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrupadorEgresos agrupadorEgresos;
    @OneToMany(mappedBy = "egresosCajaMedica", fetch = FetchType.LAZY)
    private List<MovimientosDeCuenta> movimientosDeCuentaList;

    public EgresosCajaMedica() {
    }

    public EgresosCajaMedica(Integer numero) {
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Character getValorModificable() {
        return valorModificable;
    }

    public void setValorModificable(Character valorModificable) {
        this.valorModificable = valorModificable;
    }

    public List<CreacionEgresosFct> getCreacionEgresosFctList() {
        return creacionEgresosFctList;
    }

    public void setCreacionEgresosFctList(List<CreacionEgresosFct> creacionEgresosFctList) {
        this.creacionEgresosFctList = creacionEgresosFctList;
    }

    public List<DescuentosAgrupados> getDescuentosAgrupadosList() {
        return descuentosAgrupadosList;
    }

    public void setDescuentosAgrupadosList(List<DescuentosAgrupados> descuentosAgrupadosList) {
        this.descuentosAgrupadosList = descuentosAgrupadosList;
    }

    public AgrupadorEgresos getAgrupadorEgresos() {
        return agrupadorEgresos;
    }

    public void setAgrupadorEgresos(AgrupadorEgresos agrupadorEgresos) {
        this.agrupadorEgresos = agrupadorEgresos;
    }

    public List<MovimientosDeCuenta> getMovimientosDeCuentaList() {
        return movimientosDeCuentaList;
    }

    public void setMovimientosDeCuentaList(List<MovimientosDeCuenta> movimientosDeCuentaList) {
        this.movimientosDeCuentaList = movimientosDeCuentaList;
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
        if (!(object instanceof EgresosCajaMedica)) {
            return false;
        }
        EgresosCajaMedica other = (EgresosCajaMedica) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EgresosCajaMedica[ numero=" + numero + " ]";
    }
    
}
