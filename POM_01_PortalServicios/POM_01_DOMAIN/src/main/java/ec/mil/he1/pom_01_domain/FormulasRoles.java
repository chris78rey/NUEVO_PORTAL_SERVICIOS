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
@Table(name = "FORMULAS_ROLES")
@NamedQueries({
    @NamedQuery(name = "FormulasRoles.findAll", query = "SELECT f FROM FormulasRoles f")})
public class FormulasRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FormulasRolesPK formulasRolesPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ALIAS")
    private String alias;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "PROCESO")
    private String proceso;
    @Column(name = "DETALLE")
    private String detalle;

    public FormulasRoles() {
    }

    public FormulasRoles(FormulasRolesPK formulasRolesPK) {
        this.formulasRolesPK = formulasRolesPK;
    }

    public FormulasRoles(String empCodigo, String codigo) {
        this.formulasRolesPK = new FormulasRolesPK(empCodigo, codigo);
    }

    public FormulasRolesPK getFormulasRolesPK() {
        return formulasRolesPK;
    }

    public void setFormulasRolesPK(FormulasRolesPK formulasRolesPK) {
        this.formulasRolesPK = formulasRolesPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formulasRolesPK != null ? formulasRolesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormulasRoles)) {
            return false;
        }
        FormulasRoles other = (FormulasRoles) object;
        if ((this.formulasRolesPK == null && other.formulasRolesPK != null) || (this.formulasRolesPK != null && !this.formulasRolesPK.equals(other.formulasRolesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.FormulasRoles[ formulasRolesPK=" + formulasRolesPK + " ]";
    }
    
}
