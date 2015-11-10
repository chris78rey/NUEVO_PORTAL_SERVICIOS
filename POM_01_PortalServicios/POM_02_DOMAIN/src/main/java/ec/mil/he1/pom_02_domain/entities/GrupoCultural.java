/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

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
@Table(name = "GRUPO_CULTURAL")
@NamedQueries({
    @NamedQuery(name = "GrupoCultural.findAll", query = "SELECT g FROM GrupoCultural g")})
public class GrupoCultural implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GCT_IDGRUPOCULTURAL")
    private Long gctIdgrupocultural;
    @Column(name = "GCT_GRUPOCULTURAL")
    private String gctGrupocultural;
    @Column(name = "GCT_USER")
    private String gctUser;

    public GrupoCultural() {
    }

    public GrupoCultural(Long gctIdgrupocultural) {
        this.gctIdgrupocultural = gctIdgrupocultural;
    }

    public Long getGctIdgrupocultural() {
        return gctIdgrupocultural;
    }

    public void setGctIdgrupocultural(Long gctIdgrupocultural) {
        this.gctIdgrupocultural = gctIdgrupocultural;
    }

    public String getGctGrupocultural() {
        return gctGrupocultural;
    }

    public void setGctGrupocultural(String gctGrupocultural) {
        this.gctGrupocultural = gctGrupocultural;
    }

    public String getGctUser() {
        return gctUser;
    }

    public void setGctUser(String gctUser) {
        this.gctUser = gctUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gctIdgrupocultural != null ? gctIdgrupocultural.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoCultural)) {
            return false;
        }
        GrupoCultural other = (GrupoCultural) object;
        if ((this.gctIdgrupocultural == null && other.gctIdgrupocultural != null) || (this.gctIdgrupocultural != null && !this.gctIdgrupocultural.equals(other.gctIdgrupocultural))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.GrupoCultural[ gctIdgrupocultural=" + gctIdgrupocultural + " ]";
    }
    
}
