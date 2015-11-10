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
@Table(name = "PARAMETROS_APLICACIONES")
@NamedQueries({
    @NamedQuery(name = "ParametrosAplicaciones.findAll", query = "SELECT p FROM ParametrosAplicaciones p")})
public class ParametrosAplicaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parametrosAplicaciones", fetch = FetchType.LAZY)
    private List<ParametrosEmpresas> parametrosEmpresasList;

    public ParametrosAplicaciones() {
    }

    public ParametrosAplicaciones(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ParametrosEmpresas> getParametrosEmpresasList() {
        return parametrosEmpresasList;
    }

    public void setParametrosEmpresasList(List<ParametrosEmpresas> parametrosEmpresasList) {
        this.parametrosEmpresasList = parametrosEmpresasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosAplicaciones)) {
            return false;
        }
        ParametrosAplicaciones other = (ParametrosAplicaciones) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosAplicaciones[ nombre=" + nombre + " ]";
    }
    
}
