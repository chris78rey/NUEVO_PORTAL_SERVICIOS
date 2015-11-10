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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PARROQUIA")
@NamedQueries({
    @NamedQuery(name = "Parroquia.findAll", query = "SELECT p FROM Parroquia p")})
public class Parroquia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRQ_IDPARROQUIA")
    private String prqIdparroquia;
    @Column(name = "PRQ_PARROQUIA")
    private String prqParroquia;
    @Column(name = "PRQ_USER")
    private String prqUser;
    @JoinColumn(name = "CAN_IDCANTON", referencedColumnName = "CAN_IDCANTON")
    @ManyToOne(fetch = FetchType.LAZY)
    private Canton canton;

    public Parroquia() {
    }

    public Parroquia(String prqIdparroquia) {
        this.prqIdparroquia = prqIdparroquia;
    }

    public String getPrqIdparroquia() {
        return prqIdparroquia;
    }

    public void setPrqIdparroquia(String prqIdparroquia) {
        this.prqIdparroquia = prqIdparroquia;
    }

    public String getPrqParroquia() {
        return prqParroquia;
    }

    public void setPrqParroquia(String prqParroquia) {
        this.prqParroquia = prqParroquia;
    }

    public String getPrqUser() {
        return prqUser;
    }

    public void setPrqUser(String prqUser) {
        this.prqUser = prqUser;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prqIdparroquia != null ? prqIdparroquia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parroquia)) {
            return false;
        }
        Parroquia other = (Parroquia) object;
        if ((this.prqIdparroquia == null && other.prqIdparroquia != null) || (this.prqIdparroquia != null && !this.prqIdparroquia.equals(other.prqIdparroquia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Parroquia[ prqIdparroquia=" + prqIdparroquia + " ]";
    }
    
}
