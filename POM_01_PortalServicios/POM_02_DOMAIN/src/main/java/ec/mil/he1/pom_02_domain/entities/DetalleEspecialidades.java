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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLE_ESPECIALIDADES")
@NamedQueries({
    @NamedQuery(name = "DetalleEspecialidades.findAll", query = "SELECT d FROM DetalleEspecialidades d")})
public class DetalleEspecialidades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTE_IDESPECIALIDAD")
    private String dteIdespecialidad;
    @Column(name = "DTE_ESPECIALIDAD")
    private String dteEspecialidad;
    @Column(name = "DTE_DESCRIPCION")
    private String dteDescripcion;
    @Column(name = "DTE_USER")
    private String dteUser;
    @OneToMany(mappedBy = "detalleEspecialidades", fetch = FetchType.LAZY)
    private List<PersonalUnidadmilitar> personalUnidadmilitarList;
    @JoinColumn(name = "ESP_IDESPECIALIDAD", referencedColumnName = "ESP_IDESPECIALIDAD")
    @ManyToOne(fetch = FetchType.LAZY)
    private Especialidad especialidad;

    public DetalleEspecialidades() {
    }

    public DetalleEspecialidades(String dteIdespecialidad) {
        this.dteIdespecialidad = dteIdespecialidad;
    }

    public String getDteIdespecialidad() {
        return dteIdespecialidad;
    }

    public void setDteIdespecialidad(String dteIdespecialidad) {
        this.dteIdespecialidad = dteIdespecialidad;
    }

    public String getDteEspecialidad() {
        return dteEspecialidad;
    }

    public void setDteEspecialidad(String dteEspecialidad) {
        this.dteEspecialidad = dteEspecialidad;
    }

    public String getDteDescripcion() {
        return dteDescripcion;
    }

    public void setDteDescripcion(String dteDescripcion) {
        this.dteDescripcion = dteDescripcion;
    }

    public String getDteUser() {
        return dteUser;
    }

    public void setDteUser(String dteUser) {
        this.dteUser = dteUser;
    }

    public List<PersonalUnidadmilitar> getPersonalUnidadmilitarList() {
        return personalUnidadmilitarList;
    }

    public void setPersonalUnidadmilitarList(List<PersonalUnidadmilitar> personalUnidadmilitarList) {
        this.personalUnidadmilitarList = personalUnidadmilitarList;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dteIdespecialidad != null ? dteIdespecialidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleEspecialidades)) {
            return false;
        }
        DetalleEspecialidades other = (DetalleEspecialidades) object;
        if ((this.dteIdespecialidad == null && other.dteIdespecialidad != null) || (this.dteIdespecialidad != null && !this.dteIdespecialidad.equals(other.dteIdespecialidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetalleEspecialidades[ dteIdespecialidad=" + dteIdespecialidad + " ]";
    }
    
}
