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
@Table(name = "PLAZA")
@NamedQueries({
    @NamedQuery(name = "Plaza.findAll", query = "SELECT p FROM Plaza p")})
public class Plaza implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PLZ_IDPLAZA")
    private String plzIdplaza;
    @Column(name = "PLZ_PLAZA")
    private String plzPlaza;
    @Column(name = "PLZ_DESCRIPCION")
    private String plzDescripcion;
    @Column(name = "PLZ_USER")
    private String plzUser;
    @OneToMany(mappedBy = "plaza", fetch = FetchType.LAZY)
    private List<PersonalUnidadmilitar> personalUnidadmilitarList;
    @JoinColumn(name = "FRZ_IDFUERZA", referencedColumnName = "FRZ_IDFUERZA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Fuerza fuerza;

    public Plaza() {
    }

    public Plaza(String plzIdplaza) {
        this.plzIdplaza = plzIdplaza;
    }

    public String getPlzIdplaza() {
        return plzIdplaza;
    }

    public void setPlzIdplaza(String plzIdplaza) {
        this.plzIdplaza = plzIdplaza;
    }

    public String getPlzPlaza() {
        return plzPlaza;
    }

    public void setPlzPlaza(String plzPlaza) {
        this.plzPlaza = plzPlaza;
    }

    public String getPlzDescripcion() {
        return plzDescripcion;
    }

    public void setPlzDescripcion(String plzDescripcion) {
        this.plzDescripcion = plzDescripcion;
    }

    public String getPlzUser() {
        return plzUser;
    }

    public void setPlzUser(String plzUser) {
        this.plzUser = plzUser;
    }

    public List<PersonalUnidadmilitar> getPersonalUnidadmilitarList() {
        return personalUnidadmilitarList;
    }

    public void setPersonalUnidadmilitarList(List<PersonalUnidadmilitar> personalUnidadmilitarList) {
        this.personalUnidadmilitarList = personalUnidadmilitarList;
    }

    public Fuerza getFuerza() {
        return fuerza;
    }

    public void setFuerza(Fuerza fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plzIdplaza != null ? plzIdplaza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plaza)) {
            return false;
        }
        Plaza other = (Plaza) object;
        if ((this.plzIdplaza == null && other.plzIdplaza != null) || (this.plzIdplaza != null && !this.plzIdplaza.equals(other.plzIdplaza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Plaza[ plzIdplaza=" + plzIdplaza + " ]";
    }
    
}
