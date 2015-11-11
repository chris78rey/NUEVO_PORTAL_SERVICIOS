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
@Table(name = "PERSONAL_JORNADA")
@NamedQueries({
    @NamedQuery(name = "PersonalJornada.findAll", query = "SELECT p FROM PersonalJornada p")})
public class PersonalJornada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRJ_IDPRNJRN")
    private Long prjIdprnjrn;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "JRN_IDJORNADA")
    private Long jrnIdjornada;
    @Column(name = "PRJ_ESTADO")
    private Character prjEstado;
    @Column(name = "PRJ_OBSERVACION")
    private String prjObservacion;
    @Column(name = "PRJ_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prjFechacreacion;
    @Column(name = "PRJ_USER")
    private String prjUser;

    public PersonalJornada() {
    }

    public PersonalJornada(Long prjIdprnjrn) {
        this.prjIdprnjrn = prjIdprnjrn;
    }

    public Long getPrjIdprnjrn() {
        return prjIdprnjrn;
    }

    public void setPrjIdprnjrn(Long prjIdprnjrn) {
        this.prjIdprnjrn = prjIdprnjrn;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Long getJrnIdjornada() {
        return jrnIdjornada;
    }

    public void setJrnIdjornada(Long jrnIdjornada) {
        this.jrnIdjornada = jrnIdjornada;
    }

    public Character getPrjEstado() {
        return prjEstado;
    }

    public void setPrjEstado(Character prjEstado) {
        this.prjEstado = prjEstado;
    }

    public String getPrjObservacion() {
        return prjObservacion;
    }

    public void setPrjObservacion(String prjObservacion) {
        this.prjObservacion = prjObservacion;
    }

    public Date getPrjFechacreacion() {
        return prjFechacreacion;
    }

    public void setPrjFechacreacion(Date prjFechacreacion) {
        this.prjFechacreacion = prjFechacreacion;
    }

    public String getPrjUser() {
        return prjUser;
    }

    public void setPrjUser(String prjUser) {
        this.prjUser = prjUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prjIdprnjrn != null ? prjIdprnjrn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonalJornada)) {
            return false;
        }
        PersonalJornada other = (PersonalJornada) object;
        if ((this.prjIdprnjrn == null && other.prjIdprnjrn != null) || (this.prjIdprnjrn != null && !this.prjIdprnjrn.equals(other.prjIdprnjrn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PersonalJornada[ prjIdprnjrn=" + prjIdprnjrn + " ]";
    }
    
}
