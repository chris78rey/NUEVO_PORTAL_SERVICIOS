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
@Table(name = "GERMENES_EN_PAPS")
@NamedQueries({
    @NamedQuery(name = "GermenesEnPaps.findAll", query = "SELECT g FROM GermenesEnPaps g")})
public class GermenesEnPaps implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GermenesEnPapsPK germenesEnPapsPK;

    public GermenesEnPaps() {
    }

    public GermenesEnPaps(GermenesEnPapsPK germenesEnPapsPK) {
        this.germenesEnPapsPK = germenesEnPapsPK;
    }

    public GermenesEnPaps(String grmCodigo, int ppnExmNumero, String ppnPrsCodigo) {
        this.germenesEnPapsPK = new GermenesEnPapsPK(grmCodigo, ppnExmNumero, ppnPrsCodigo);
    }

    public GermenesEnPapsPK getGermenesEnPapsPK() {
        return germenesEnPapsPK;
    }

    public void setGermenesEnPapsPK(GermenesEnPapsPK germenesEnPapsPK) {
        this.germenesEnPapsPK = germenesEnPapsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (germenesEnPapsPK != null ? germenesEnPapsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GermenesEnPaps)) {
            return false;
        }
        GermenesEnPaps other = (GermenesEnPaps) object;
        if ((this.germenesEnPapsPK == null && other.germenesEnPapsPK != null) || (this.germenesEnPapsPK != null && !this.germenesEnPapsPK.equals(other.germenesEnPapsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.GermenesEnPaps[ germenesEnPapsPK=" + germenesEnPapsPK + " ]";
    }
    
}
