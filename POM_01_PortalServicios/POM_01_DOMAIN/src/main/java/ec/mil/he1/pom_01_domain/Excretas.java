/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EXCRETAS")
@NamedQueries({
    @NamedQuery(name = "Excretas.findAll", query = "SELECT e FROM Excretas e")})
public class Excretas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExcretasPK excretasPK;

    public Excretas() {
    }

    public Excretas(ExcretasPK excretasPK) {
        this.excretasPK = excretasPK;
    }

    public Excretas(int fchsclNumero, String tipo) {
        this.excretasPK = new ExcretasPK(fchsclNumero, tipo);
    }

    public ExcretasPK getExcretasPK() {
        return excretasPK;
    }

    public void setExcretasPK(ExcretasPK excretasPK) {
        this.excretasPK = excretasPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (excretasPK != null ? excretasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Excretas)) {
            return false;
        }
        Excretas other = (Excretas) object;
        if ((this.excretasPK == null && other.excretasPK != null) || (this.excretasPK != null && !this.excretasPK.equals(other.excretasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Excretas[ excretasPK=" + excretasPK + " ]";
    }
    
}
