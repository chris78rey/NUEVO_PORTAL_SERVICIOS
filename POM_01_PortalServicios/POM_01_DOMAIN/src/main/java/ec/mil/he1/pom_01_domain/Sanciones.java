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
@Table(name = "SANCIONES")
@NamedQueries({
    @NamedQuery(name = "Sanciones.findAll", query = "SELECT s FROM Sanciones s")})
public class Sanciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SNC_IDSANCION")
    private Long sncIdsancion;
    @Column(name = "SNC_TIPO")
    private String sncTipo;
    @Column(name = "SNC_USER")
    private String sncUser;

    public Sanciones() {
    }

    public Sanciones(Long sncIdsancion) {
        this.sncIdsancion = sncIdsancion;
    }

    public Long getSncIdsancion() {
        return sncIdsancion;
    }

    public void setSncIdsancion(Long sncIdsancion) {
        this.sncIdsancion = sncIdsancion;
    }

    public String getSncTipo() {
        return sncTipo;
    }

    public void setSncTipo(String sncTipo) {
        this.sncTipo = sncTipo;
    }

    public String getSncUser() {
        return sncUser;
    }

    public void setSncUser(String sncUser) {
        this.sncUser = sncUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sncIdsancion != null ? sncIdsancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sanciones)) {
            return false;
        }
        Sanciones other = (Sanciones) object;
        if ((this.sncIdsancion == null && other.sncIdsancion != null) || (this.sncIdsancion != null && !this.sncIdsancion.equals(other.sncIdsancion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Sanciones[ sncIdsancion=" + sncIdsancion + " ]";
    }
    
}
