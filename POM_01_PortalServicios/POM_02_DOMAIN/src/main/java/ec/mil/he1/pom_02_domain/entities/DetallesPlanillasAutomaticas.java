/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_PLANILLAS_AUTOMATICAS")
@NamedQueries({
    @NamedQuery(name = "DetallesPlanillasAutomaticas.findAll", query = "SELECT d FROM DetallesPlanillasAutomaticas d")})
public class DetallesPlanillasAutomaticas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesPlanillasAutomaticasPK detallesPlanillasAutomaticasPK;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RegistroPlanillasAutomaticas registroPlanillasAutomaticas;

    public DetallesPlanillasAutomaticas() {
    }

    public DetallesPlanillasAutomaticas(DetallesPlanillasAutomaticasPK detallesPlanillasAutomaticasPK) {
        this.detallesPlanillasAutomaticasPK = detallesPlanillasAutomaticasPK;
    }

    public DetallesPlanillasAutomaticas(BigInteger id, int planilla) {
        this.detallesPlanillasAutomaticasPK = new DetallesPlanillasAutomaticasPK(id, planilla);
    }

    public DetallesPlanillasAutomaticasPK getDetallesPlanillasAutomaticasPK() {
        return detallesPlanillasAutomaticasPK;
    }

    public void setDetallesPlanillasAutomaticasPK(DetallesPlanillasAutomaticasPK detallesPlanillasAutomaticasPK) {
        this.detallesPlanillasAutomaticasPK = detallesPlanillasAutomaticasPK;
    }

    public RegistroPlanillasAutomaticas getRegistroPlanillasAutomaticas() {
        return registroPlanillasAutomaticas;
    }

    public void setRegistroPlanillasAutomaticas(RegistroPlanillasAutomaticas registroPlanillasAutomaticas) {
        this.registroPlanillasAutomaticas = registroPlanillasAutomaticas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesPlanillasAutomaticasPK != null ? detallesPlanillasAutomaticasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPlanillasAutomaticas)) {
            return false;
        }
        DetallesPlanillasAutomaticas other = (DetallesPlanillasAutomaticas) object;
        if ((this.detallesPlanillasAutomaticasPK == null && other.detallesPlanillasAutomaticasPK != null) || (this.detallesPlanillasAutomaticasPK != null && !this.detallesPlanillasAutomaticasPK.equals(other.detallesPlanillasAutomaticasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesPlanillasAutomaticas[ detallesPlanillasAutomaticasPK=" + detallesPlanillasAutomaticasPK + " ]";
    }
    
}
