/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "ATENCION_SECRETARIAS")
@NamedQueries({
    @NamedQuery(name = "AtencionSecretarias.findAll", query = "SELECT a FROM AtencionSecretarias a")})
public class AtencionSecretarias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AtencionSecretariasPK atencionSecretariasPK;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;
    @Column(name = "CONSULTORIO")
    private String consultorio;
    @JoinColumn(name = "PRS_COD_SEC", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_COD_MED", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personal personal1;

    public AtencionSecretarias() {
    }

    public AtencionSecretarias(AtencionSecretariasPK atencionSecretariasPK) {
        this.atencionSecretariasPK = atencionSecretariasPK;
    }

    public AtencionSecretarias(String prsCodMed, String prsCodSec) {
        this.atencionSecretariasPK = new AtencionSecretariasPK(prsCodMed, prsCodSec);
    }

    public AtencionSecretariasPK getAtencionSecretariasPK() {
        return atencionSecretariasPK;
    }

    public void setAtencionSecretariasPK(AtencionSecretariasPK atencionSecretariasPK) {
        this.atencionSecretariasPK = atencionSecretariasPK;
    }

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atencionSecretariasPK != null ? atencionSecretariasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtencionSecretarias)) {
            return false;
        }
        AtencionSecretarias other = (AtencionSecretarias) object;
        if ((this.atencionSecretariasPK == null && other.atencionSecretariasPK != null) || (this.atencionSecretariasPK != null && !this.atencionSecretariasPK.equals(other.atencionSecretariasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AtencionSecretarias[ atencionSecretariasPK=" + atencionSecretariasPK + " ]";
    }
    
}
