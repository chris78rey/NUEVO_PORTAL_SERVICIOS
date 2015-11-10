/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "GERMENES")
@NamedQueries({
    @NamedQuery(name = "Germenes.findAll", query = "SELECT g FROM Germenes g")})
public class Germenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GermenesPK germenesPK;
    @Column(name = "NOMBRE")
    private String nombre;

    public Germenes() {
    }

    public Germenes(GermenesPK germenesPK) {
        this.germenesPK = germenesPK;
    }

    public Germenes(String codigo, String areaDeUso) {
        this.germenesPK = new GermenesPK(codigo, areaDeUso);
    }

    public GermenesPK getGermenesPK() {
        return germenesPK;
    }

    public void setGermenesPK(GermenesPK germenesPK) {
        this.germenesPK = germenesPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (germenesPK != null ? germenesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Germenes)) {
            return false;
        }
        Germenes other = (Germenes) object;
        if ((this.germenesPK == null && other.germenesPK != null) || (this.germenesPK != null && !this.germenesPK.equals(other.germenesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Germenes[ germenesPK=" + germenesPK + " ]";
    }
    
}
