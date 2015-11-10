/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "TABLA1")
@NamedQueries({
    @NamedQuery(name = "Tabla1.findAll", query = "SELECT t FROM Tabla1 t")})
public class Tabla1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Tabla1PK tabla1PK;
    @Column(name = "ANIO")
    private Short anio;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Tabla1() {
    }

    public Tabla1(Tabla1PK tabla1PK) {
        this.tabla1PK = tabla1PK;
    }

    public Tabla1(String codigoDesde, String codigoHasta) {
        this.tabla1PK = new Tabla1PK(codigoDesde, codigoHasta);
    }

    public Tabla1PK getTabla1PK() {
        return tabla1PK;
    }

    public void setTabla1PK(Tabla1PK tabla1PK) {
        this.tabla1PK = tabla1PK;
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabla1PK != null ? tabla1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabla1)) {
            return false;
        }
        Tabla1 other = (Tabla1) object;
        if ((this.tabla1PK == null && other.tabla1PK != null) || (this.tabla1PK != null && !this.tabla1PK.equals(other.tabla1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Tabla1[ tabla1PK=" + tabla1PK + " ]";
    }
    
}
