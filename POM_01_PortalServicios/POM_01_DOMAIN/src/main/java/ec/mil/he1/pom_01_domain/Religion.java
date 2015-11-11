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
@Table(name = "RELIGION")
@NamedQueries({
    @NamedQuery(name = "Religion.findAll", query = "SELECT r FROM Religion r")})
public class Religion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RLG_IDRELIGION")
    private Long rlgIdreligion;
    @Column(name = "RLG_TIPO")
    private String rlgTipo;
    @Column(name = "RLG_USER")
    private String rlgUser;

    public Religion() {
    }

    public Religion(Long rlgIdreligion) {
        this.rlgIdreligion = rlgIdreligion;
    }

    public Long getRlgIdreligion() {
        return rlgIdreligion;
    }

    public void setRlgIdreligion(Long rlgIdreligion) {
        this.rlgIdreligion = rlgIdreligion;
    }

    public String getRlgTipo() {
        return rlgTipo;
    }

    public void setRlgTipo(String rlgTipo) {
        this.rlgTipo = rlgTipo;
    }

    public String getRlgUser() {
        return rlgUser;
    }

    public void setRlgUser(String rlgUser) {
        this.rlgUser = rlgUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rlgIdreligion != null ? rlgIdreligion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Religion)) {
            return false;
        }
        Religion other = (Religion) object;
        if ((this.rlgIdreligion == null && other.rlgIdreligion != null) || (this.rlgIdreligion != null && !this.rlgIdreligion.equals(other.rlgIdreligion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Religion[ rlgIdreligion=" + rlgIdreligion + " ]";
    }
    
}
