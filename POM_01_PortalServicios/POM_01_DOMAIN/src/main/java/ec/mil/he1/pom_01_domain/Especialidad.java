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
@Table(name = "ESPECIALIDAD")
@NamedQueries({
    @NamedQuery(name = "Especialidad.findAll", query = "SELECT e FROM Especialidad e")})
public class Especialidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ESP_IDESPECIALIDAD")
    private String espIdespecialidad;
    @Column(name = "FRZ_IDFUERZA")
    private Long frzIdfuerza;
    @Column(name = "ESP_ESPECIALIDAD")
    private String espEspecialidad;
    @Column(name = "ESP_USER")
    private String espUser;

    public Especialidad() {
    }

    public Especialidad(String espIdespecialidad) {
        this.espIdespecialidad = espIdespecialidad;
    }

    public String getEspIdespecialidad() {
        return espIdespecialidad;
    }

    public void setEspIdespecialidad(String espIdespecialidad) {
        this.espIdespecialidad = espIdespecialidad;
    }

    public Long getFrzIdfuerza() {
        return frzIdfuerza;
    }

    public void setFrzIdfuerza(Long frzIdfuerza) {
        this.frzIdfuerza = frzIdfuerza;
    }

    public String getEspEspecialidad() {
        return espEspecialidad;
    }

    public void setEspEspecialidad(String espEspecialidad) {
        this.espEspecialidad = espEspecialidad;
    }

    public String getEspUser() {
        return espUser;
    }

    public void setEspUser(String espUser) {
        this.espUser = espUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (espIdespecialidad != null ? espIdespecialidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialidad)) {
            return false;
        }
        Especialidad other = (Especialidad) object;
        if ((this.espIdespecialidad == null && other.espIdespecialidad != null) || (this.espIdespecialidad != null && !this.espIdespecialidad.equals(other.espIdespecialidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Especialidad[ espIdespecialidad=" + espIdespecialidad + " ]";
    }
    
}
