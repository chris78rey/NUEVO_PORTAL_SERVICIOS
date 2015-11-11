/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class AlergiasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TPOALR_ID")
    private int tpoalrId;
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private int pcnNumeroHc;

    public AlergiasPK() {
    }

    public AlergiasPK(int tpoalrId, int pcnNumeroHc) {
        this.tpoalrId = tpoalrId;
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public int getTpoalrId() {
        return tpoalrId;
    }

    public void setTpoalrId(int tpoalrId) {
        this.tpoalrId = tpoalrId;
    }

    public int getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(int pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tpoalrId;
        hash += (int) pcnNumeroHc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlergiasPK)) {
            return false;
        }
        AlergiasPK other = (AlergiasPK) object;
        if (this.tpoalrId != other.tpoalrId) {
            return false;
        }
        if (this.pcnNumeroHc != other.pcnNumeroHc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AlergiasPK[ tpoalrId=" + tpoalrId + ", pcnNumeroHc=" + pcnNumeroHc + " ]";
    }
    
}
