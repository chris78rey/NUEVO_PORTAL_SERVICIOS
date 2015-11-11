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
@Table(name = "GRADO")
@NamedQueries({
    @NamedQuery(name = "Grado.findAll", query = "SELECT g FROM Grado g")})
public class Grado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GRD_IDGRADO")
    private String grdIdgrado;
    @Column(name = "FRZ_IDFUERZA")
    private Long frzIdfuerza;
    @Column(name = "GRD_GRADO")
    private String grdGrado;
    @Column(name = "GRD_DESCRIPCION")
    private String grdDescripcion;
    @Column(name = "GRD_ABREVIACION")
    private String grdAbreviacion;
    @Column(name = "GRD_USER")
    private String grdUser;

    public Grado() {
    }

    public Grado(String grdIdgrado) {
        this.grdIdgrado = grdIdgrado;
    }

    public String getGrdIdgrado() {
        return grdIdgrado;
    }

    public void setGrdIdgrado(String grdIdgrado) {
        this.grdIdgrado = grdIdgrado;
    }

    public Long getFrzIdfuerza() {
        return frzIdfuerza;
    }

    public void setFrzIdfuerza(Long frzIdfuerza) {
        this.frzIdfuerza = frzIdfuerza;
    }

    public String getGrdGrado() {
        return grdGrado;
    }

    public void setGrdGrado(String grdGrado) {
        this.grdGrado = grdGrado;
    }

    public String getGrdDescripcion() {
        return grdDescripcion;
    }

    public void setGrdDescripcion(String grdDescripcion) {
        this.grdDescripcion = grdDescripcion;
    }

    public String getGrdAbreviacion() {
        return grdAbreviacion;
    }

    public void setGrdAbreviacion(String grdAbreviacion) {
        this.grdAbreviacion = grdAbreviacion;
    }

    public String getGrdUser() {
        return grdUser;
    }

    public void setGrdUser(String grdUser) {
        this.grdUser = grdUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grdIdgrado != null ? grdIdgrado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grado)) {
            return false;
        }
        Grado other = (Grado) object;
        if ((this.grdIdgrado == null && other.grdIdgrado != null) || (this.grdIdgrado != null && !this.grdIdgrado.equals(other.grdIdgrado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Grado[ grdIdgrado=" + grdIdgrado + " ]";
    }
    
}
