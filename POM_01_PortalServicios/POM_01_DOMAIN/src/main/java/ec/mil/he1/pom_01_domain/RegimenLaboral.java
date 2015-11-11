/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "REGIMEN_LABORAL")
@NamedQueries({
    @NamedQuery(name = "RegimenLaboral.findAll", query = "SELECT r FROM RegimenLaboral r")})
public class RegimenLaboral implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "RGL_IDREGIMEN")
    private BigDecimal rglIdregimen;
    @Column(name = "RGL_REGIMENLABORAL")
    private String rglRegimenlaboral;
    @Column(name = "RGL_OBSERVACION")
    private String rglObservacion;
    @Column(name = "RGL_USER")
    private String rglUser;

    public RegimenLaboral() {
    }

    public RegimenLaboral(BigDecimal rglIdregimen) {
        this.rglIdregimen = rglIdregimen;
    }

    public BigDecimal getRglIdregimen() {
        return rglIdregimen;
    }

    public void setRglIdregimen(BigDecimal rglIdregimen) {
        this.rglIdregimen = rglIdregimen;
    }

    public String getRglRegimenlaboral() {
        return rglRegimenlaboral;
    }

    public void setRglRegimenlaboral(String rglRegimenlaboral) {
        this.rglRegimenlaboral = rglRegimenlaboral;
    }

    public String getRglObservacion() {
        return rglObservacion;
    }

    public void setRglObservacion(String rglObservacion) {
        this.rglObservacion = rglObservacion;
    }

    public String getRglUser() {
        return rglUser;
    }

    public void setRglUser(String rglUser) {
        this.rglUser = rglUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rglIdregimen != null ? rglIdregimen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegimenLaboral)) {
            return false;
        }
        RegimenLaboral other = (RegimenLaboral) object;
        if ((this.rglIdregimen == null && other.rglIdregimen != null) || (this.rglIdregimen != null && !this.rglIdregimen.equals(other.rglIdregimen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RegimenLaboral[ rglIdregimen=" + rglIdregimen + " ]";
    }
    
}
