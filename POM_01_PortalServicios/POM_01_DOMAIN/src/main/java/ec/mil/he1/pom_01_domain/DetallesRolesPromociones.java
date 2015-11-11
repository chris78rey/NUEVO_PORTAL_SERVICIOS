/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "DETALLES_ROLES_PROMOCIONES")
@NamedQueries({
    @NamedQuery(name = "DetallesRolesPromociones.findAll", query = "SELECT d FROM DetallesRolesPromociones d")})
public class DetallesRolesPromociones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesRolesPromocionesPK detallesRolesPromocionesPK;
    @Column(name = "ACTUALIZAR")
    private Character actualizar;

    public DetallesRolesPromociones() {
    }

    public DetallesRolesPromociones(DetallesRolesPromocionesPK detallesRolesPromocionesPK) {
        this.detallesRolesPromocionesPK = detallesRolesPromocionesPK;
    }

    public DetallesRolesPromociones(String prmCodigo, String rolprmRol) {
        this.detallesRolesPromocionesPK = new DetallesRolesPromocionesPK(prmCodigo, rolprmRol);
    }

    public DetallesRolesPromocionesPK getDetallesRolesPromocionesPK() {
        return detallesRolesPromocionesPK;
    }

    public void setDetallesRolesPromocionesPK(DetallesRolesPromocionesPK detallesRolesPromocionesPK) {
        this.detallesRolesPromocionesPK = detallesRolesPromocionesPK;
    }

    public Character getActualizar() {
        return actualizar;
    }

    public void setActualizar(Character actualizar) {
        this.actualizar = actualizar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesRolesPromocionesPK != null ? detallesRolesPromocionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesRolesPromociones)) {
            return false;
        }
        DetallesRolesPromociones other = (DetallesRolesPromociones) object;
        if ((this.detallesRolesPromocionesPK == null && other.detallesRolesPromocionesPK != null) || (this.detallesRolesPromocionesPK != null && !this.detallesRolesPromocionesPK.equals(other.detallesRolesPromocionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesRolesPromociones[ detallesRolesPromocionesPK=" + detallesRolesPromocionesPK + " ]";
    }
    
}
