/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

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
@Table(name = "AGRUPADORES_PLANO_IESS")
@NamedQueries({
    @NamedQuery(name = "AgrupadoresPlanoIess.findAll", query = "SELECT a FROM AgrupadoresPlanoIess a")})
public class AgrupadoresPlanoIess implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgrupadoresPlanoIessPK agrupadoresPlanoIessPK;

    public AgrupadoresPlanoIess() {
    }

    public AgrupadoresPlanoIess(AgrupadoresPlanoIessPK agrupadoresPlanoIessPK) {
        this.agrupadoresPlanoIessPK = agrupadoresPlanoIessPK;
    }

    public AgrupadoresPlanoIess(String agrupador, String tipoBeneficiario) {
        this.agrupadoresPlanoIessPK = new AgrupadoresPlanoIessPK(agrupador, tipoBeneficiario);
    }

    public AgrupadoresPlanoIessPK getAgrupadoresPlanoIessPK() {
        return agrupadoresPlanoIessPK;
    }

    public void setAgrupadoresPlanoIessPK(AgrupadoresPlanoIessPK agrupadoresPlanoIessPK) {
        this.agrupadoresPlanoIessPK = agrupadoresPlanoIessPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agrupadoresPlanoIessPK != null ? agrupadoresPlanoIessPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgrupadoresPlanoIess)) {
            return false;
        }
        AgrupadoresPlanoIess other = (AgrupadoresPlanoIess) object;
        if ((this.agrupadoresPlanoIessPK == null && other.agrupadoresPlanoIessPK != null) || (this.agrupadoresPlanoIessPK != null && !this.agrupadoresPlanoIessPK.equals(other.agrupadoresPlanoIessPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AgrupadoresPlanoIess[ agrupadoresPlanoIessPK=" + agrupadoresPlanoIessPK + " ]";
    }
    
}
