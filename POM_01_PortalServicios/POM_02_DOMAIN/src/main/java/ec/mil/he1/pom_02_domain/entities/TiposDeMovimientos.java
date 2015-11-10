/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "TIPOS_DE_MOVIMIENTOS")
@NamedQueries({
    @NamedQuery(name = "TiposDeMovimientos.findAll", query = "SELECT t FROM TiposDeMovimientos t")})
public class TiposDeMovimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "OPERACION")
    private String operacion;
    @Column(name = "APLICABLE")
    private String aplicable;
    @Column(name = "CONTABILIZACION")
    private Character contabilizacion;
    @Column(name = "INGRESA_REFERENCIA")
    private String ingresaReferencia;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private String estadoDeDisponibilidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposDeMovimientos", fetch = FetchType.LAZY)
    private List<Libros> librosList;

    public TiposDeMovimientos() {
    }

    public TiposDeMovimientos(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getAplicable() {
        return aplicable;
    }

    public void setAplicable(String aplicable) {
        this.aplicable = aplicable;
    }

    public Character getContabilizacion() {
        return contabilizacion;
    }

    public void setContabilizacion(Character contabilizacion) {
        this.contabilizacion = contabilizacion;
    }

    public String getIngresaReferencia() {
        return ingresaReferencia;
    }

    public void setIngresaReferencia(String ingresaReferencia) {
        this.ingresaReferencia = ingresaReferencia;
    }

    public String getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(String estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public List<Libros> getLibrosList() {
        return librosList;
    }

    public void setLibrosList(List<Libros> librosList) {
        this.librosList = librosList;
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
        if (!(object instanceof TiposDeMovimientos)) {
            return false;
        }
        TiposDeMovimientos other = (TiposDeMovimientos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TiposDeMovimientos[ codigo=" + codigo + " ]";
    }
    
}
