/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "VACACIONES")
@NamedQueries({
    @NamedQuery(name = "Vacaciones.findAll", query = "SELECT v FROM Vacaciones v")})
public class Vacaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VCN_IDVACACIONES")
    private Long vcnIdvacaciones;
    @Column(name = "VCN_TIPOVACACIONES")
    private String vcnTipovacaciones;
    @Column(name = "VCN_DESCRIPCION")
    private String vcnDescripcion;
    @Column(name = "VCN_USER")
    private String vcnUser;
    @OneToMany(mappedBy = "vacaciones", fetch = FetchType.LAZY)
    private List<DetalleVacaciones> detalleVacacionesList;

    public Vacaciones() {
    }

    public Vacaciones(Long vcnIdvacaciones) {
        this.vcnIdvacaciones = vcnIdvacaciones;
    }

    public Long getVcnIdvacaciones() {
        return vcnIdvacaciones;
    }

    public void setVcnIdvacaciones(Long vcnIdvacaciones) {
        this.vcnIdvacaciones = vcnIdvacaciones;
    }

    public String getVcnTipovacaciones() {
        return vcnTipovacaciones;
    }

    public void setVcnTipovacaciones(String vcnTipovacaciones) {
        this.vcnTipovacaciones = vcnTipovacaciones;
    }

    public String getVcnDescripcion() {
        return vcnDescripcion;
    }

    public void setVcnDescripcion(String vcnDescripcion) {
        this.vcnDescripcion = vcnDescripcion;
    }

    public String getVcnUser() {
        return vcnUser;
    }

    public void setVcnUser(String vcnUser) {
        this.vcnUser = vcnUser;
    }

    public List<DetalleVacaciones> getDetalleVacacionesList() {
        return detalleVacacionesList;
    }

    public void setDetalleVacacionesList(List<DetalleVacaciones> detalleVacacionesList) {
        this.detalleVacacionesList = detalleVacacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vcnIdvacaciones != null ? vcnIdvacaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacaciones)) {
            return false;
        }
        Vacaciones other = (Vacaciones) object;
        if ((this.vcnIdvacaciones == null && other.vcnIdvacaciones != null) || (this.vcnIdvacaciones != null && !this.vcnIdvacaciones.equals(other.vcnIdvacaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Vacaciones[ vcnIdvacaciones=" + vcnIdvacaciones + " ]";
    }
    
}
