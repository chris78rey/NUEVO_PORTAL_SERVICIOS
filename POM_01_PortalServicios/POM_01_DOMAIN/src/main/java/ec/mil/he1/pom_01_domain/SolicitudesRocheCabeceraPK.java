/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class SolicitudesRocheCabeceraPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @Column(name = "SOLICITUD")
    private int solicitud;

    public SolicitudesRocheCabeceraPK() {
    }

    public SolicitudesRocheCabeceraPK(int id, int solicitud) {
        this.id = id;
        this.solicitud = solicitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(int solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) solicitud;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudesRocheCabeceraPK)) {
            return false;
        }
        SolicitudesRocheCabeceraPK other = (SolicitudesRocheCabeceraPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.solicitud != other.solicitud) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SolicitudesRocheCabeceraPK[ id=" + id + ", solicitud=" + solicitud + " ]";
    }
    
}
