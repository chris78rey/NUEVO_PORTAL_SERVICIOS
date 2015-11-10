/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
    @Column(name = "PREALTA")
    private Character prealta;
    @JoinColumns({
        @JoinColumn(name = "CMAHSP_SALA", referencedColumnName = "SALA", insertable = false, updatable = false),
        @JoinColumn(name = "CMAHSP_CAMA", referencedColumnName = "CAMA", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CamasHospitalizacion camasHospitalizacion;
    @JoinColumn(name = "ESPECIALIDAD", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Especialidades especialidades;
    @JoinColumns({
        @JoinColumn(name = "PRM_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "PRM_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;

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

    public Character getPrealta() {
        return prealta;
    }

    public void setPrealta(Character prealta) {
        this.prealta = prealta;
    }

    public CamasHospitalizacion getCamasHospitalizacion() {
        return camasHospitalizacion;
    }

    public void setCamasHospitalizacion(CamasHospitalizacion camasHospitalizacion) {
        this.camasHospitalizacion = camasHospitalizacion;
    }

    public Especialidades getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }

    public PermanenciasYAtenciones getPermanenciasYAtenciones() {
        return permanenciasYAtenciones;
    }

    public void setPermanenciasYAtenciones(PermanenciasYAtenciones permanenciasYAtenciones) {
        this.permanenciasYAtenciones = permanenciasYAtenciones;
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
        return "ec.mil.he1.pom_02_domain.entities.TurnosCamas[ turnosCamasPK=" + turnosCamasPK + " ]";
    }
    
}
