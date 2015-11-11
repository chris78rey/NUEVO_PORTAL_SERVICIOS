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
@Table(name = "GRUPOS_ACTIVOS_FIJOS")
@NamedQueries({
    @NamedQuery(name = "GruposActivosFijos.findAll", query = "SELECT g FROM GruposActivosFijos g")})
public class GruposActivosFijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GruposActivosFijosPK gruposActivosFijosPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public GruposActivosFijos() {
    }

    public GruposActivosFijos(GruposActivosFijosPK gruposActivosFijosPK) {
        this.gruposActivosFijosPK = gruposActivosFijosPK;
    }

    public GruposActivosFijos(String empCodigo, short codigo) {
        this.gruposActivosFijosPK = new GruposActivosFijosPK(empCodigo, codigo);
    }

    public GruposActivosFijosPK getGruposActivosFijosPK() {
        return gruposActivosFijosPK;
    }

    public void setGruposActivosFijosPK(GruposActivosFijosPK gruposActivosFijosPK) {
        this.gruposActivosFijosPK = gruposActivosFijosPK;
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
        hash += (gruposActivosFijosPK != null ? gruposActivosFijosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GruposActivosFijos)) {
            return false;
        }
        GruposActivosFijos other = (GruposActivosFijos) object;
        if ((this.gruposActivosFijosPK == null && other.gruposActivosFijosPK != null) || (this.gruposActivosFijosPK != null && !this.gruposActivosFijosPK.equals(other.gruposActivosFijosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.GruposActivosFijos[ gruposActivosFijosPK=" + gruposActivosFijosPK + " ]";
    }
    
}
