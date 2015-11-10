/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ROLES_PROMOCIONES")
@NamedQueries({
    @NamedQuery(name = "RolesPromociones.findAll", query = "SELECT r FROM RolesPromociones r")})
public class RolesPromociones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROL")
    private String rol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolesPromociones", fetch = FetchType.LAZY)
    private List<DetallesRolesPromociones> detallesRolesPromocionesList;

    public RolesPromociones() {
    }

    public RolesPromociones(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<DetallesRolesPromociones> getDetallesRolesPromocionesList() {
        return detallesRolesPromocionesList;
    }

    public void setDetallesRolesPromocionesList(List<DetallesRolesPromociones> detallesRolesPromocionesList) {
        this.detallesRolesPromocionesList = detallesRolesPromocionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rol != null ? rol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolesPromociones)) {
            return false;
        }
        RolesPromociones other = (RolesPromociones) object;
        if ((this.rol == null && other.rol != null) || (this.rol != null && !this.rol.equals(other.rol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RolesPromociones[ rol=" + rol + " ]";
    }
    
}
