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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CONSULTORIOS_PROCEDIMIENTOS")
@NamedQueries({
    @NamedQuery(name = "ConsultoriosProcedimientos.findAll", query = "SELECT c FROM ConsultoriosProcedimientos c")})
public class ConsultoriosProcedimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private Character estado;
    @OneToMany(mappedBy = "consultoriosProcedimientos", fetch = FetchType.LAZY)
    private List<TurnosProcedimientos> turnosProcedimientosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consultoriosProcedimientos", fetch = FetchType.LAZY)
    private List<ProcedimientosEspecialidad> procedimientosEspecialidadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consultoriosProcedimientos", fetch = FetchType.LAZY)
    private List<CalendariosProcedimientos> calendariosProcedimientosList;

    public ConsultoriosProcedimientos() {
    }

    public ConsultoriosProcedimientos(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public List<TurnosProcedimientos> getTurnosProcedimientosList() {
        return turnosProcedimientosList;
    }

    public void setTurnosProcedimientosList(List<TurnosProcedimientos> turnosProcedimientosList) {
        this.turnosProcedimientosList = turnosProcedimientosList;
    }

    public List<ProcedimientosEspecialidad> getProcedimientosEspecialidadList() {
        return procedimientosEspecialidadList;
    }

    public void setProcedimientosEspecialidadList(List<ProcedimientosEspecialidad> procedimientosEspecialidadList) {
        this.procedimientosEspecialidadList = procedimientosEspecialidadList;
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
        if (!(object instanceof ConsultoriosProcedimientos)) {
            return false;
        }
        ConsultoriosProcedimientos other = (ConsultoriosProcedimientos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ConsultoriosProcedimientos[ codigo=" + codigo + " ]";
    }
    
}
