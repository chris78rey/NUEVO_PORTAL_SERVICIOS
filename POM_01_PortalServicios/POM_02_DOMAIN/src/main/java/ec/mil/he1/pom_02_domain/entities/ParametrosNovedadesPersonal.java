/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PARAMETROS_NOVEDADES_PERSONAL")
@NamedQueries({
    @NamedQuery(name = "ParametrosNovedadesPersonal.findAll", query = "SELECT p FROM ParametrosNovedadesPersonal p")})
public class ParametrosNovedadesPersonal implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParametrosNovedadesPersonalPK parametrosNovedadesPersonalPK;
    @JoinColumns({
        @JoinColumn(name = "PRMROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "PRMROL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ParametrosRoles parametrosRoles;

    public ParametrosNovedadesPersonal() {
    }

    public ParametrosNovedadesPersonal(ParametrosNovedadesPersonalPK parametrosNovedadesPersonalPK) {
        this.parametrosNovedadesPersonalPK = parametrosNovedadesPersonalPK;
    }

    public ParametrosNovedadesPersonal(String prmrolEmpCodigo, String prmrolCodigo, String novedad) {
        this.parametrosNovedadesPersonalPK = new ParametrosNovedadesPersonalPK(prmrolEmpCodigo, prmrolCodigo, novedad);
    }

    public ParametrosNovedadesPersonalPK getParametrosNovedadesPersonalPK() {
        return parametrosNovedadesPersonalPK;
    }

    public void setParametrosNovedadesPersonalPK(ParametrosNovedadesPersonalPK parametrosNovedadesPersonalPK) {
        this.parametrosNovedadesPersonalPK = parametrosNovedadesPersonalPK;
    }

    public ParametrosRoles getParametrosRoles() {
        return parametrosRoles;
    }

    public void setParametrosRoles(ParametrosRoles parametrosRoles) {
        this.parametrosRoles = parametrosRoles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parametrosNovedadesPersonalPK != null ? parametrosNovedadesPersonalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosNovedadesPersonal)) {
            return false;
        }
        ParametrosNovedadesPersonal other = (ParametrosNovedadesPersonal) object;
        if ((this.parametrosNovedadesPersonalPK == null && other.parametrosNovedadesPersonalPK != null) || (this.parametrosNovedadesPersonalPK != null && !this.parametrosNovedadesPersonalPK.equals(other.parametrosNovedadesPersonalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosNovedadesPersonal[ parametrosNovedadesPersonalPK=" + parametrosNovedadesPersonalPK + " ]";
    }
    
}
