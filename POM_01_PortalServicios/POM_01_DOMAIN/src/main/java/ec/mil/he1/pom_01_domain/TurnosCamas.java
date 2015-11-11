/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "TURNOS_CAMAS")
@NamedQueries({
    @NamedQuery(name = "TurnosCamas.findAll", query = "SELECT t FROM TurnosCamas t")})
public class TurnosCamas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TurnosCamasPK turnosCamasPK;
    @Column(name = "ENCARGADO")
    private String encargado;
    @Column(name = "CONDICION")
    private String condicion;
    @Column(name = "ESPECIALIDAD")
    private String especialidad;
    @Column(name = "PREALTA")
    private Character prealta;

    public TurnosCamas() {
    }

    public TurnosCamas(TurnosCamasPK turnosCamasPK) {
        this.turnosCamasPK = turnosCamasPK;
    }

    public TurnosCamas(Date fecha, Character ocupada, short cmahspSala, String cmahspCama, int prmNumero, int prmPcnNumeroHc, short numeroAlta) {
        this.turnosCamasPK = new TurnosCamasPK(fecha, ocupada, cmahspSala, cmahspCama, prmNumero, prmPcnNumeroHc, numeroAlta);
    }

    public TurnosCamasPK getTurnosCamasPK() {
        return turnosCamasPK;
    }

    public void setTurnosCamasPK(TurnosCamasPK turnosCamasPK) {
        this.turnosCamasPK = turnosCamasPK;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Character getPrealta() {
        return prealta;
    }

    public void setPrealta(Character prealta) {
        this.prealta = prealta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turnosCamasPK != null ? turnosCamasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurnosCamas)) {
            return false;
        }
        TurnosCamas other = (TurnosCamas) object;
        if ((this.turnosCamasPK == null && other.turnosCamasPK != null) || (this.turnosCamasPK != null && !this.turnosCamasPK.equals(other.turnosCamasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TurnosCamas[ turnosCamasPK=" + turnosCamasPK + " ]";
    }
    
}
