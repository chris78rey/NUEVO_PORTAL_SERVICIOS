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
@Table(name = "CENTROS_ATENCION")
@NamedQueries({
    @NamedQuery(name = "CentrosAtencion.findAll", query = "SELECT c FROM CentrosAtencion c")})
public class CentrosAtencion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAT_IDCENTRO")
    private Long catIdcentro;
    @Column(name = "CAT_CENTROATENCION")
    private String catCentroatencion;
    @Column(name = "CAT_USER")
    private String catUser;

    public CentrosAtencion() {
    }

    public CentrosAtencion(Long catIdcentro) {
        this.catIdcentro = catIdcentro;
    }

    public Long getCatIdcentro() {
        return catIdcentro;
    }

    public void setCatIdcentro(Long catIdcentro) {
        this.catIdcentro = catIdcentro;
    }

    public String getCatCentroatencion() {
        return catCentroatencion;
    }

    public void setCatCentroatencion(String catCentroatencion) {
        this.catCentroatencion = catCentroatencion;
    }

    public String getCatUser() {
        return catUser;
    }

    public void setCatUser(String catUser) {
        this.catUser = catUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catIdcentro != null ? catIdcentro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentrosAtencion)) {
            return false;
        }
        CentrosAtencion other = (CentrosAtencion) object;
        if ((this.catIdcentro == null && other.catIdcentro != null) || (this.catIdcentro != null && !this.catIdcentro.equals(other.catIdcentro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CentrosAtencion[ catIdcentro=" + catIdcentro + " ]";
    }
    
}
