/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perfilesEmpleados", fetch = FetchType.LAZY)
    private List<ParametrosPerfiles> parametrosPerfilesList;
    @OneToMany(mappedBy = "perfilesEmpleados", fetch = FetchType.LAZY)
    private List<EmpleadosRoles> empleadosRolesList;

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

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public List<ParametrosPerfiles> getParametrosPerfilesList() {
        return parametrosPerfilesList;
    }

    public void setParametrosPerfilesList(List<ParametrosPerfiles> parametrosPerfilesList) {
        this.parametrosPerfilesList = parametrosPerfilesList;
    }

    public List<EmpleadosRoles> getEmpleadosRolesList() {
        return empleadosRolesList;
    }

    public void setEmpleadosRolesList(List<EmpleadosRoles> empleadosRolesList) {
        this.empleadosRolesList = empleadosRolesList;
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
        return "ec.mil.he1.pom_02_domain.entities.PerfilesEmpleados[ perfilesEmpleadosPK=" + perfilesEmpleadosPK + " ]";
    }
    
}
