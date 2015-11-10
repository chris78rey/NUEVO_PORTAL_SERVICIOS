/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ESPECIALIDADES")
@NamedQueries({
    @NamedQuery(name = "Especialidades.findAll", query = "SELECT e FROM Especialidades e")})
public class Especialidades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "ESPECIALIDAD")
    private String especialidad;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "AREA")
    private String area;
    @JoinTable(name = "ESPECIALIDADES_MEDICOS", joinColumns = {
        @JoinColumn(name = "ESP_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Personal> personalList;
    @OneToMany(mappedBy = "especialidades", fetch = FetchType.LAZY)
    private List<TurnosCamas> turnosCamasList;
    @OneToMany(mappedBy = "especialidades", fetch = FetchType.LAZY)
    private List<TurnosProcedimientos> turnosProcedimientosList;
    @OneToMany(mappedBy = "especialidades", fetch = FetchType.LAZY)
    private List<SolicitudesDeInternacion> solicitudesDeInternacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "especialidades", fetch = FetchType.LAZY)
    private List<ProcedimientosEspecialidad> procedimientosEspecialidadList;
    @OneToMany(mappedBy = "especialidades", fetch = FetchType.LAZY)
    private List<Interconsultas> interconsultasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "especialidades", fetch = FetchType.LAZY)
    private List<CalendariosProcedimientos> calendariosProcedimientosList;

    public Especialidades() {
    }

    public Especialidades(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void setPersonalList(List<Personal> personalList) {
        this.personalList = personalList;
    }

    public List<TurnosCamas> getTurnosCamasList() {
        return turnosCamasList;
    }

    public void setTurnosCamasList(List<TurnosCamas> turnosCamasList) {
        this.turnosCamasList = turnosCamasList;
    }

    public List<TurnosProcedimientos> getTurnosProcedimientosList() {
        return turnosProcedimientosList;
    }

    public void setTurnosProcedimientosList(List<TurnosProcedimientos> turnosProcedimientosList) {
        this.turnosProcedimientosList = turnosProcedimientosList;
    }

    public List<SolicitudesDeInternacion> getSolicitudesDeInternacionList() {
        return solicitudesDeInternacionList;
    }

    public void setSolicitudesDeInternacionList(List<SolicitudesDeInternacion> solicitudesDeInternacionList) {
        this.solicitudesDeInternacionList = solicitudesDeInternacionList;
    }

    public List<ProcedimientosEspecialidad> getProcedimientosEspecialidadList() {
        return procedimientosEspecialidadList;
    }

    public void setProcedimientosEspecialidadList(List<ProcedimientosEspecialidad> procedimientosEspecialidadList) {
        this.procedimientosEspecialidadList = procedimientosEspecialidadList;
    }

    public List<Interconsultas> getInterconsultasList() {
        return interconsultasList;
    }

    public void setInterconsultasList(List<Interconsultas> interconsultasList) {
        this.interconsultasList = interconsultasList;
    }

    public List<CalendariosProcedimientos> getCalendariosProcedimientosList() {
        return calendariosProcedimientosList;
    }

    public void setCalendariosProcedimientosList(List<CalendariosProcedimientos> calendariosProcedimientosList) {
        this.calendariosProcedimientosList = calendariosProcedimientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialidades)) {
            return false;
        }
        Especialidades other = (Especialidades) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Especialidades[ codigo=" + codigo + " ]";
    }
    
}
