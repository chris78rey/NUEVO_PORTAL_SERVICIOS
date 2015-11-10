/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "UNM_IDUNIDAD")
    private String unmIdunidad;
    @Column(name = "PUM_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pumFechacreacion;
    @Column(name = "PUM_USER")
    private String pumUser;
    @JoinColumn(name = "DTE_IDESPECIALIDAD", referencedColumnName = "DTE_IDESPECIALIDAD")
    @ManyToOne(fetch = FetchType.LAZY)
    private DetalleEspecialidades detalleEspecialidades;
    @JoinColumn(name = "ESP_IDESPECIALIDAD", referencedColumnName = "ESP_IDESPECIALIDAD")
    @ManyToOne(fetch = FetchType.LAZY)
    private Especialidad especialidad;
    @JoinColumn(name = "FRZ_IDFUERZA", referencedColumnName = "FRZ_IDFUERZA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Fuerza fuerza;
    @JoinColumn(name = "GRD_IDGRADO", referencedColumnName = "GRD_IDGRADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grado grado;
    @JoinColumn(name = "PLZ_IDPLAZA", referencedColumnName = "PLZ_IDPLAZA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Plaza plaza;

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

    public DetalleEspecialidades getDetalleEspecialidades() {
        return detalleEspecialidades;
    }

    public void setDetalleEspecialidades(DetalleEspecialidades detalleEspecialidades) {
        this.detalleEspecialidades = detalleEspecialidades;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Fuerza getFuerza() {
        return fuerza;
    }

    public void setFuerza(Fuerza fuerza) {
        this.fuerza = fuerza;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public Plaza getPlaza() {
        return plaza;
    }

    public void setPlaza(Plaza plaza) {
        this.plaza = plaza;
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
        return "ec.mil.he1.pom_02_domain.entities.PersonalUnidadmilitar[ pumId=" + pumId + " ]";
    }
    
}
