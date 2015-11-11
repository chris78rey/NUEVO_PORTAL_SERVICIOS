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
@Table(name = "DATOS_INTERVIENEN")
@NamedQueries({
    @NamedQuery(name = "DatosIntervienen.findAll", query = "SELECT d FROM DatosIntervienen d")})
public class DatosIntervienen implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DatosIntervienenPK datosIntervienenPK;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public DatosIntervienen() {
    }

    public DatosIntervienen(DatosIntervienenPK datosIntervienenPK) {
        this.datosIntervienenPK = datosIntervienenPK;
    }

    public DatosIntervienen(String prmespPrmrolEmpCodigo, String prmespPrmrolCodigo, String prmrolEmpCodigo, String prmrolCodigo) {
        this.datosIntervienenPK = new DatosIntervienenPK(prmespPrmrolEmpCodigo, prmespPrmrolCodigo, prmrolEmpCodigo, prmrolCodigo);
    }

    public DatosIntervienenPK getDatosIntervienenPK() {
        return datosIntervienenPK;
    }

    public void setDatosIntervienenPK(DatosIntervienenPK datosIntervienenPK) {
        this.datosIntervienenPK = datosIntervienenPK;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (datosIntervienenPK != null ? datosIntervienenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatosIntervienen)) {
            return false;
        }
        DatosIntervienen other = (DatosIntervienen) object;
        if ((this.datosIntervienenPK == null && other.datosIntervienenPK != null) || (this.datosIntervienenPK != null && !this.datosIntervienenPK.equals(other.datosIntervienenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DatosIntervienen[ datosIntervienenPK=" + datosIntervienenPK + " ]";
    }
    
}
