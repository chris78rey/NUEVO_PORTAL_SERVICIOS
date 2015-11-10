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
public class RolAcumuladoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RAC_IDROLACUMULADO")
    private long racIdrolacumulado;
    @Basic(optional = false)
    @Column(name = "PRN_IDPERSONAL")
    private long prnIdpersonal;

    public RolAcumuladoPK() {
    }

    public RolAcumuladoPK(long racIdrolacumulado, long prnIdpersonal) {
        this.racIdrolacumulado = racIdrolacumulado;
        this.prnIdpersonal = prnIdpersonal;
    }

    public long getRacIdrolacumulado() {
        return racIdrolacumulado;
    }

    public void setRacIdrolacumulado(long racIdrolacumulado) {
        this.racIdrolacumulado = racIdrolacumulado;
    }

    public long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) racIdrolacumulado;
        hash += (int) prnIdpersonal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolAcumuladoPK)) {
            return false;
        }
        RolAcumuladoPK other = (RolAcumuladoPK) object;
        if (this.racIdrolacumulado != other.racIdrolacumulado) {
            return false;
        }
        if (this.prnIdpersonal != other.prnIdpersonal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RolAcumuladoPK[ racIdrolacumulado=" + racIdrolacumulado + ", prnIdpersonal=" + prnIdpersonal + " ]";
    }
    
}
