/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "TIPOS_DE_COMPROBANTES")
@NamedQueries({
    @NamedQuery(name = "TiposDeComprobantes.findAll", query = "SELECT t FROM TiposDeComprobantes t")})
public class TiposDeComprobantes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "FORMULA_CLAVE")
    private String formulaClave;
    @Column(name = "RETENCIONES")
    private Character retenciones;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "OBLIGACIONES")
    private String obligaciones;

    public TiposDeComprobantes() {
    }

    public TiposDeComprobantes(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormulaClave() {
        return formulaClave;
    }

    public void setFormulaClave(String formulaClave) {
        this.formulaClave = formulaClave;
    }

    public Character getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(Character retenciones) {
        this.retenciones = retenciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObligaciones() {
        return obligaciones;
    }

    public void setObligaciones(String obligaciones) {
        this.obligaciones = obligaciones;
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
        if (!(object instanceof TiposDeComprobantes)) {
            return false;
        }
        TiposDeComprobantes other = (TiposDeComprobantes) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TiposDeComprobantes[ codigo=" + codigo + " ]";
    }
    
}
