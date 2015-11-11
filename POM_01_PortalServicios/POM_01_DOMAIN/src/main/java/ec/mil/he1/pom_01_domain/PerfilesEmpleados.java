/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

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
@Table(name = "PERFILES_EMPLEADOS")
@NamedQueries({
    @NamedQuery(name = "PerfilesEmpleados.findAll", query = "SELECT p FROM PerfilesEmpleados p")})
public class PerfilesEmpleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PerfilesEmpleadosPK perfilesEmpleadosPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public PerfilesEmpleados() {
    }

    public PerfilesEmpleados(PerfilesEmpleadosPK perfilesEmpleadosPK) {
        this.perfilesEmpleadosPK = perfilesEmpleadosPK;
    }

    public PerfilesEmpleados(String empCodigo, String codigo) {
        this.perfilesEmpleadosPK = new PerfilesEmpleadosPK(empCodigo, codigo);
    }

    public PerfilesEmpleadosPK getPerfilesEmpleadosPK() {
        return perfilesEmpleadosPK;
    }

    public void setPerfilesEmpleadosPK(PerfilesEmpleadosPK perfilesEmpleadosPK) {
        this.perfilesEmpleadosPK = perfilesEmpleadosPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perfilesEmpleadosPK != null ? perfilesEmpleadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilesEmpleados)) {
            return false;
        }
        PerfilesEmpleados other = (PerfilesEmpleados) object;
        if ((this.perfilesEmpleadosPK == null && other.perfilesEmpleadosPK != null) || (this.perfilesEmpleadosPK != null && !this.perfilesEmpleadosPK.equals(other.perfilesEmpleadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PerfilesEmpleados[ perfilesEmpleadosPK=" + perfilesEmpleadosPK + " ]";
    }
    
}
