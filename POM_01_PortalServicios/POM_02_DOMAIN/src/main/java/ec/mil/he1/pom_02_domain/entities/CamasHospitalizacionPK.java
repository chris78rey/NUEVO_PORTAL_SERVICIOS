/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class CamasHospitalizacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SALA")
    private short sala;
    @Basic(optional = false)
    @Column(name = "CAMA")
    private String cama;

    public CamasHospitalizacionPK() {
    }

    public CamasHospitalizacionPK(short sala, String cama) {
        this.sala = sala;
        this.cama = cama;
    }

    public short getSala() {
        return sala;
    }

    public void setSala(short sala) {
        this.sala = sala;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) sala;
        hash += (cama != null ? cama.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CamasHospitalizacionPK)) {
            return false;
        }
        CamasHospitalizacionPK other = (CamasHospitalizacionPK) object;
        if (this.sala != other.sala) {
            return false;
        }
        if ((this.cama == null && other.cama != null) || (this.cama != null && !this.cama.equals(other.cama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CamasHospitalizacionPK[ sala=" + sala + ", cama=" + cama + " ]";
    }
    
}
