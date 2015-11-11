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
@Table(name = "NIVEL_EDUCACION")
@NamedQueries({
    @NamedQuery(name = "NivelEducacion.findAll", query = "SELECT n FROM NivelEducacion n")})
public class NivelEducacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NED_IDNIVELEDUCACION")
    private Long nedIdniveleducacion;
    @Column(name = "NED_DESCRIPCION")
    private String nedDescripcion;
    @Column(name = "NED_USER")
    private String nedUser;

    public NivelEducacion() {
    }

    public NivelEducacion(Long nedIdniveleducacion) {
        this.nedIdniveleducacion = nedIdniveleducacion;
    }

    public Long getNedIdniveleducacion() {
        return nedIdniveleducacion;
    }

    public void setNedIdniveleducacion(Long nedIdniveleducacion) {
        this.nedIdniveleducacion = nedIdniveleducacion;
    }

    public String getNedDescripcion() {
        return nedDescripcion;
    }

    public void setNedDescripcion(String nedDescripcion) {
        this.nedDescripcion = nedDescripcion;
    }

    public String getNedUser() {
        return nedUser;
    }

    public void setNedUser(String nedUser) {
        this.nedUser = nedUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nedIdniveleducacion != null ? nedIdniveleducacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelEducacion)) {
            return false;
        }
        NivelEducacion other = (NivelEducacion) object;
        if ((this.nedIdniveleducacion == null && other.nedIdniveleducacion != null) || (this.nedIdniveleducacion != null && !this.nedIdniveleducacion.equals(other.nedIdniveleducacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.NivelEducacion[ nedIdniveleducacion=" + nedIdniveleducacion + " ]";
    }
    
}
