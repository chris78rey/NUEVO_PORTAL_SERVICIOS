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
public class ParametrosNovedadesPersonalPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRMROL_EMP_CODIGO")
    private String prmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "PRMROL_CODIGO")
    private String prmrolCodigo;
    @Basic(optional = false)
    @Column(name = "NOVEDAD")
    private String novedad;

    public ParametrosNovedadesPersonalPK() {
    }

    public ParametrosNovedadesPersonalPK(String prmrolEmpCodigo, String prmrolCodigo, String novedad) {
        this.prmrolEmpCodigo = prmrolEmpCodigo;
        this.prmrolCodigo = prmrolCodigo;
        this.novedad = novedad;
    }

    public String getPrmrolEmpCodigo() {
        return prmrolEmpCodigo;
    }

    public void setPrmrolEmpCodigo(String prmrolEmpCodigo) {
        this.prmrolEmpCodigo = prmrolEmpCodigo;
    }

    public String getPrmrolCodigo() {
        return prmrolCodigo;
    }

    public void setPrmrolCodigo(String prmrolCodigo) {
        this.prmrolCodigo = prmrolCodigo;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmrolEmpCodigo != null ? prmrolEmpCodigo.hashCode() : 0);
        hash += (prmrolCodigo != null ? prmrolCodigo.hashCode() : 0);
        hash += (novedad != null ? novedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosNovedadesPersonalPK)) {
            return false;
        }
        ParametrosNovedadesPersonalPK other = (ParametrosNovedadesPersonalPK) object;
        if ((this.prmrolEmpCodigo == null && other.prmrolEmpCodigo != null) || (this.prmrolEmpCodigo != null && !this.prmrolEmpCodigo.equals(other.prmrolEmpCodigo))) {
            return false;
        }
        if ((this.prmrolCodigo == null && other.prmrolCodigo != null) || (this.prmrolCodigo != null && !this.prmrolCodigo.equals(other.prmrolCodigo))) {
            return false;
        }
        if ((this.novedad == null && other.novedad != null) || (this.novedad != null && !this.novedad.equals(other.novedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosNovedadesPersonalPK[ prmrolEmpCodigo=" + prmrolEmpCodigo + ", prmrolCodigo=" + prmrolCodigo + ", novedad=" + novedad + " ]";
    }
    
}
