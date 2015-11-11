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
@Table(name = "COMPLICACIONES_POSTANESTESICAS")
@NamedQueries({
    @NamedQuery(name = "ComplicacionesPostanestesicas.findAll", query = "SELECT c FROM ComplicacionesPostanestesicas c")})
public class ComplicacionesPostanestesicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComplicacionesPostanestesicasPK complicacionesPostanestesicasPK;

    public ComplicacionesPostanestesicas() {
    }

    public ComplicacionesPostanestesicas(ComplicacionesPostanestesicasPK complicacionesPostanestesicasPK) {
        this.complicacionesPostanestesicasPK = complicacionesPostanestesicasPK;
    }

    public ComplicacionesPostanestesicas(int prtoprslcPcnNumeroHc, int prtoprslcNumero, String complicacion) {
        this.complicacionesPostanestesicasPK = new ComplicacionesPostanestesicasPK(prtoprslcPcnNumeroHc, prtoprslcNumero, complicacion);
    }

    public ComplicacionesPostanestesicasPK getComplicacionesPostanestesicasPK() {
        return complicacionesPostanestesicasPK;
    }

    public void setComplicacionesPostanestesicasPK(ComplicacionesPostanestesicasPK complicacionesPostanestesicasPK) {
        this.complicacionesPostanestesicasPK = complicacionesPostanestesicasPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complicacionesPostanestesicasPK != null ? complicacionesPostanestesicasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplicacionesPostanestesicas)) {
            return false;
        }
        ComplicacionesPostanestesicas other = (ComplicacionesPostanestesicas) object;
        if ((this.complicacionesPostanestesicasPK == null && other.complicacionesPostanestesicasPK != null) || (this.complicacionesPostanestesicasPK != null && !this.complicacionesPostanestesicasPK.equals(other.complicacionesPostanestesicasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComplicacionesPostanestesicas[ complicacionesPostanestesicasPK=" + complicacionesPostanestesicasPK + " ]";
    }
    
}
