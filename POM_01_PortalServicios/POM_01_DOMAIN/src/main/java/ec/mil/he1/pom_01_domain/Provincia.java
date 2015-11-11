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
@Table(name = "PROVINCIA")
@NamedQueries({
    @NamedQuery(name = "Provincia.findAll", query = "SELECT p FROM Provincia p")})
public class Provincia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRV_IDPROVINCIA")
    private String prvIdprovincia;
    @Column(name = "PRV_NOMBRE")
    private String prvNombre;
    @Column(name = "PRV_USER")
    private String prvUser;

    public Provincia() {
    }

    public Provincia(String prvIdprovincia) {
        this.prvIdprovincia = prvIdprovincia;
    }

    public String getPrvIdprovincia() {
        return prvIdprovincia;
    }

    public void setPrvIdprovincia(String prvIdprovincia) {
        this.prvIdprovincia = prvIdprovincia;
    }

    public String getPrvNombre() {
        return prvNombre;
    }

    public void setPrvNombre(String prvNombre) {
        this.prvNombre = prvNombre;
    }

    public String getPrvUser() {
        return prvUser;
    }

    public void setPrvUser(String prvUser) {
        this.prvUser = prvUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prvIdprovincia != null ? prvIdprovincia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provincia)) {
            return false;
        }
        Provincia other = (Provincia) object;
        if ((this.prvIdprovincia == null && other.prvIdprovincia != null) || (this.prvIdprovincia != null && !this.prvIdprovincia.equals(other.prvIdprovincia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Provincia[ prvIdprovincia=" + prvIdprovincia + " ]";
    }
    
}
