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
@Table(name = "PAQUETES")
@NamedQueries({
    @NamedQuery(name = "Paquetes.findAll", query = "SELECT p FROM Paquetes p")})
public class Paquetes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaquetesPK paquetesPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;

    public Paquetes() {
    }

    public Paquetes(PaquetesPK paquetesPK) {
        this.paquetesPK = paquetesPK;
    }

    public Paquetes(String cnvConvenio, String tipo, String codigo) {
        this.paquetesPK = new PaquetesPK(cnvConvenio, tipo, codigo);
    }

    public PaquetesPK getPaquetesPK() {
        return paquetesPK;
    }

    public void setPaquetesPK(PaquetesPK paquetesPK) {
        this.paquetesPK = paquetesPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paquetesPK != null ? paquetesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paquetes)) {
            return false;
        }
        Paquetes other = (Paquetes) object;
        if ((this.paquetesPK == null && other.paquetesPK != null) || (this.paquetesPK != null && !this.paquetesPK.equals(other.paquetesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Paquetes[ paquetesPK=" + paquetesPK + " ]";
    }
    
}
