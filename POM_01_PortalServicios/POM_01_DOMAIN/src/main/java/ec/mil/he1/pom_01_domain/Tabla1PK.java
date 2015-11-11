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
public class Tabla1PK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CODIGO_DESDE")
    private String codigoDesde;
    @Basic(optional = false)
    @Column(name = "CODIGO_HASTA")
    private String codigoHasta;

    public Tabla1PK() {
    }

    public Tabla1PK(String codigoDesde, String codigoHasta) {
        this.codigoDesde = codigoDesde;
        this.codigoHasta = codigoHasta;
    }

    public String getCodigoDesde() {
        return codigoDesde;
    }

    public void setCodigoDesde(String codigoDesde) {
        this.codigoDesde = codigoDesde;
    }

    public String getCodigoHasta() {
        return codigoHasta;
    }

    public void setCodigoHasta(String codigoHasta) {
        this.codigoHasta = codigoHasta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoDesde != null ? codigoDesde.hashCode() : 0);
        hash += (codigoHasta != null ? codigoHasta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabla1PK)) {
            return false;
        }
        Tabla1PK other = (Tabla1PK) object;
        if ((this.codigoDesde == null && other.codigoDesde != null) || (this.codigoDesde != null && !this.codigoDesde.equals(other.codigoDesde))) {
            return false;
        }
        if ((this.codigoHasta == null && other.codigoHasta != null) || (this.codigoHasta != null && !this.codigoHasta.equals(other.codigoHasta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Tabla1PK[ codigoDesde=" + codigoDesde + ", codigoHasta=" + codigoHasta + " ]";
    }
    
}
