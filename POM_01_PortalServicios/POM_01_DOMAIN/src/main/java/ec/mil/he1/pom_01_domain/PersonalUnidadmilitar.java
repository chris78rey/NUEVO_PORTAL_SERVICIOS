/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PERSONAL_UNIDADMILITAR")
@NamedQueries({
    @NamedQuery(name = "PersonalUnidadmilitar.findAll", query = "SELECT p FROM PersonalUnidadmilitar p")})
public class PersonalUnidadmilitar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PUM_ID")
    private Long pumId;
    @Column(name = "ESP_IDESPECIALIDAD")
    private String espIdespecialidad;
    @Column(name = "FRZ_IDFUERZA")
    private Long frzIdfuerza;
    @Column(name = "PLZ_IDPLAZA")
    private String plzIdplaza;
    @Column(name = "GRD_IDGRADO")
    private String grdIdgrado;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "UNM_IDUNIDAD")
    private String unmIdunidad;
    @Column(name = "DTE_IDESPECIALIDAD")
    private String dteIdespecialidad;
    @Column(name = "PUM_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pumFechacreacion;
    @Column(name = "PUM_USER")
    private String pumUser;

    public PersonalUnidadmilitar() {
    }

    public PersonalUnidadmilitar(Long pumId) {
        this.pumId = pumId;
    }

    public Long getPumId() {
        return pumId;
    }

    public void setPumId(Long pumId) {
        this.pumId = pumId;
    }

    public String getEspIdespecialidad() {
        return espIdespecialidad;
    }

    public void setEspIdespecialidad(String espIdespecialidad) {
        this.espIdespecialidad = espIdespecialidad;
    }

    public Long getFrzIdfuerza() {
        return frzIdfuerza;
    }

    public void setFrzIdfuerza(Long frzIdfuerza) {
        this.frzIdfuerza = frzIdfuerza;
    }

    public String getPlzIdplaza() {
        return plzIdplaza;
    }

    public void setPlzIdplaza(String plzIdplaza) {
        this.plzIdplaza = plzIdplaza;
    }

    public String getGrdIdgrado() {
        return grdIdgrado;
    }

    public void setGrdIdgrado(String grdIdgrado) {
        this.grdIdgrado = grdIdgrado;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public String getUnmIdunidad() {
        return unmIdunidad;
    }

    public void setUnmIdunidad(String unmIdunidad) {
        this.unmIdunidad = unmIdunidad;
    }

    public String getDteIdespecialidad() {
        return dteIdespecialidad;
    }

    public void setDteIdespecialidad(String dteIdespecialidad) {
        this.dteIdespecialidad = dteIdespecialidad;
    }

    public Date getPumFechacreacion() {
        return pumFechacreacion;
    }

    public void setPumFechacreacion(Date pumFechacreacion) {
        this.pumFechacreacion = pumFechacreacion;
    }

    public String getPumUser() {
        return pumUser;
    }

    public void setPumUser(String pumUser) {
        this.pumUser = pumUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pumId != null ? pumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonalUnidadmilitar)) {
            return false;
        }
        PersonalUnidadmilitar other = (PersonalUnidadmilitar) object;
        if ((this.pumId == null && other.pumId != null) || (this.pumId != null && !this.pumId.equals(other.pumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PersonalUnidadmilitar[ pumId=" + pumId + " ]";
    }
    
}
