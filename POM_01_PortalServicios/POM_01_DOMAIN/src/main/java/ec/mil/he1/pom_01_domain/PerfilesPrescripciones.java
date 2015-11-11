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
@Table(name = "PERFILES_PRESCRIPCIONES")
@NamedQueries({
    @NamedQuery(name = "PerfilesPrescripciones.findAll", query = "SELECT p FROM PerfilesPrescripciones p")})
public class PerfilesPrescripciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PerfilesPrescripcionesPK perfilesPrescripcionesPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public PerfilesPrescripciones() {
    }

    public PerfilesPrescripciones(PerfilesPrescripcionesPK perfilesPrescripcionesPK) {
        this.perfilesPrescripcionesPK = perfilesPrescripcionesPK;
    }

    public PerfilesPrescripciones(String prsCodigo, short numero) {
        this.perfilesPrescripcionesPK = new PerfilesPrescripcionesPK(prsCodigo, numero);
    }

    public PerfilesPrescripcionesPK getPerfilesPrescripcionesPK() {
        return perfilesPrescripcionesPK;
    }

    public void setPerfilesPrescripcionesPK(PerfilesPrescripcionesPK perfilesPrescripcionesPK) {
        this.perfilesPrescripcionesPK = perfilesPrescripcionesPK;
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
        hash += (perfilesPrescripcionesPK != null ? perfilesPrescripcionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilesPrescripciones)) {
            return false;
        }
        PerfilesPrescripciones other = (PerfilesPrescripciones) object;
        if ((this.perfilesPrescripcionesPK == null && other.perfilesPrescripcionesPK != null) || (this.perfilesPrescripcionesPK != null && !this.perfilesPrescripcionesPK.equals(other.perfilesPrescripcionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PerfilesPrescripciones[ perfilesPrescripcionesPK=" + perfilesPrescripcionesPK + " ]";
    }
    
}
