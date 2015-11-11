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
@Table(name = "BANDEJAS_ITEMS")
@NamedQueries({
    @NamedQuery(name = "BandejasItems.findAll", query = "SELECT b FROM BandejasItems b")})
public class BandejasItems implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BandejasItemsPK bandejasItemsPK;

    public BandejasItems() {
    }

    public BandejasItems(BandejasItemsPK bandejasItemsPK) {
        this.bandejasItemsPK = bandejasItemsPK;
    }

    public BandejasItems(String bndEstCodigo, String bndCodigo, Character itmTipo, String itmSbsSccCodigo, String itmSbsCodigo, short itmCodigo) {
        this.bandejasItemsPK = new BandejasItemsPK(bndEstCodigo, bndCodigo, itmTipo, itmSbsSccCodigo, itmSbsCodigo, itmCodigo);
    }

    public BandejasItemsPK getBandejasItemsPK() {
        return bandejasItemsPK;
    }

    public void setBandejasItemsPK(BandejasItemsPK bandejasItemsPK) {
        this.bandejasItemsPK = bandejasItemsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bandejasItemsPK != null ? bandejasItemsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BandejasItems)) {
            return false;
        }
        BandejasItems other = (BandejasItems) object;
        if ((this.bandejasItemsPK == null && other.bandejasItemsPK != null) || (this.bandejasItemsPK != null && !this.bandejasItemsPK.equals(other.bandejasItemsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.BandejasItems[ bandejasItemsPK=" + bandejasItemsPK + " ]";
    }
    
}
