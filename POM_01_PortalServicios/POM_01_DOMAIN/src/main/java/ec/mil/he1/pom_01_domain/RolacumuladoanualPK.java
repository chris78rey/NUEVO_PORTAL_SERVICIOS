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
public class RolacumuladoanualPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RAA_IDROLACUMULADOANUAL")
    private long raaIdrolacumuladoanual;
    @Basic(optional = false)
    @Column(name = "PRN_IDPERSONAL")
    private long prnIdpersonal;
    @Basic(optional = false)
    @Column(name = "RAA_ANIO")
    private String raaAnio;

    public RolacumuladoanualPK() {
    }

    public RolacumuladoanualPK(long raaIdrolacumuladoanual, long prnIdpersonal, String raaAnio) {
        this.raaIdrolacumuladoanual = raaIdrolacumuladoanual;
        this.prnIdpersonal = prnIdpersonal;
        this.raaAnio = raaAnio;
    }

    public long getRaaIdrolacumuladoanual() {
        return raaIdrolacumuladoanual;
    }

    public void setRaaIdrolacumuladoanual(long raaIdrolacumuladoanual) {
        this.raaIdrolacumuladoanual = raaIdrolacumuladoanual;
    }

    public long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public String getRaaAnio() {
        return raaAnio;
    }

    public void setRaaAnio(String raaAnio) {
        this.raaAnio = raaAnio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) raaIdrolacumuladoanual;
        hash += (int) prnIdpersonal;
        hash += (raaAnio != null ? raaAnio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolacumuladoanualPK)) {
            return false;
        }
        RolacumuladoanualPK other = (RolacumuladoanualPK) object;
        if (this.raaIdrolacumuladoanual != other.raaIdrolacumuladoanual) {
            return false;
        }
        if (this.prnIdpersonal != other.prnIdpersonal) {
            return false;
        }
        if ((this.raaAnio == null && other.raaAnio != null) || (this.raaAnio != null && !this.raaAnio.equals(other.raaAnio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RolacumuladoanualPK[ raaIdrolacumuladoanual=" + raaIdrolacumuladoanual + ", prnIdpersonal=" + prnIdpersonal + ", raaAnio=" + raaAnio + " ]";
    }
    
}
