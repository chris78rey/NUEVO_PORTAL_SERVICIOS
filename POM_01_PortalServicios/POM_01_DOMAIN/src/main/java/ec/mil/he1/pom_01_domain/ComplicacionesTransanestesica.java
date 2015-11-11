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
@Table(name = "COMPLICACIONES_TRANSANESTESICA")
@NamedQueries({
    @NamedQuery(name = "ComplicacionesTransanestesica.findAll", query = "SELECT c FROM ComplicacionesTransanestesica c")})
public class ComplicacionesTransanestesica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComplicacionesTransanestesicaPK complicacionesTransanestesicaPK;

    public ComplicacionesTransanestesica() {
    }

    public ComplicacionesTransanestesica(ComplicacionesTransanestesicaPK complicacionesTransanestesicaPK) {
        this.complicacionesTransanestesicaPK = complicacionesTransanestesicaPK;
    }

    public ComplicacionesTransanestesica(int prtoprslcPcnNumeroHc, int prtoprslcNumero, String complicacion) {
        this.complicacionesTransanestesicaPK = new ComplicacionesTransanestesicaPK(prtoprslcPcnNumeroHc, prtoprslcNumero, complicacion);
    }

    public ComplicacionesTransanestesicaPK getComplicacionesTransanestesicaPK() {
        return complicacionesTransanestesicaPK;
    }

    public void setComplicacionesTransanestesicaPK(ComplicacionesTransanestesicaPK complicacionesTransanestesicaPK) {
        this.complicacionesTransanestesicaPK = complicacionesTransanestesicaPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complicacionesTransanestesicaPK != null ? complicacionesTransanestesicaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplicacionesTransanestesica)) {
            return false;
        }
        ComplicacionesTransanestesica other = (ComplicacionesTransanestesica) object;
        if ((this.complicacionesTransanestesicaPK == null && other.complicacionesTransanestesicaPK != null) || (this.complicacionesTransanestesicaPK != null && !this.complicacionesTransanestesicaPK.equals(other.complicacionesTransanestesicaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComplicacionesTransanestesica[ complicacionesTransanestesicaPK=" + complicacionesTransanestesicaPK + " ]";
    }
    
}
