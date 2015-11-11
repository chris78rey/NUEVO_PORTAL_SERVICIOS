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
@Table(name = "FUERZA")
@NamedQueries({
    @NamedQuery(name = "Fuerza.findAll", query = "SELECT f FROM Fuerza f")})
public class Fuerza implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FRZ_IDFUERZA")
    private Long frzIdfuerza;
    @Column(name = "FRZ_FUERZA")
    private String frzFuerza;
    @Column(name = "FRZ_DESCRIPCION")
    private String frzDescripcion;
    @Column(name = "FRZ_USER")
    private String frzUser;

    public Fuerza() {
    }

    public Fuerza(Long frzIdfuerza) {
        this.frzIdfuerza = frzIdfuerza;
    }

    public Long getFrzIdfuerza() {
        return frzIdfuerza;
    }

    public void setFrzIdfuerza(Long frzIdfuerza) {
        this.frzIdfuerza = frzIdfuerza;
    }

    public String getFrzFuerza() {
        return frzFuerza;
    }

    public void setFrzFuerza(String frzFuerza) {
        this.frzFuerza = frzFuerza;
    }

    public String getFrzDescripcion() {
        return frzDescripcion;
    }

    public void setFrzDescripcion(String frzDescripcion) {
        this.frzDescripcion = frzDescripcion;
    }

    public String getFrzUser() {
        return frzUser;
    }

    public void setFrzUser(String frzUser) {
        this.frzUser = frzUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (frzIdfuerza != null ? frzIdfuerza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fuerza)) {
            return false;
        }
        Fuerza other = (Fuerza) object;
        if ((this.frzIdfuerza == null && other.frzIdfuerza != null) || (this.frzIdfuerza != null && !this.frzIdfuerza.equals(other.frzIdfuerza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Fuerza[ frzIdfuerza=" + frzIdfuerza + " ]";
    }
    
}
