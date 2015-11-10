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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CARGAS_FAMILIARES")
@NamedQueries({
    @NamedQuery(name = "CargasFamiliares.findAll", query = "SELECT c FROM CargasFamiliares c")})
public class CargasFamiliares implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CargasFamiliaresPK cargasFamiliaresPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @JoinColumns({
        @JoinColumn(name = "EMPROL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "EMPROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EmpleadosRoles empleadosRoles;

    public CargasFamiliares() {
    }

    public CargasFamiliares(CargasFamiliaresPK cargasFamiliaresPK) {
        this.cargasFamiliaresPK = cargasFamiliaresPK;
    }

    public CargasFamiliares(int emprolCodigo, String emprolEmpCodigo, short numero) {
        this.cargasFamiliaresPK = new CargasFamiliaresPK(emprolCodigo, emprolEmpCodigo, numero);
    }

    public CargasFamiliaresPK getCargasFamiliaresPK() {
        return cargasFamiliaresPK;
    }

    public void setCargasFamiliaresPK(CargasFamiliaresPK cargasFamiliaresPK) {
        this.cargasFamiliaresPK = cargasFamiliaresPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public EmpleadosRoles getEmpleadosRoles() {
        return empleadosRoles;
    }

    public void setEmpleadosRoles(EmpleadosRoles empleadosRoles) {
        this.empleadosRoles = empleadosRoles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cargasFamiliaresPK != null ? cargasFamiliaresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargasFamiliares)) {
            return false;
        }
        CargasFamiliares other = (CargasFamiliares) object;
        if ((this.cargasFamiliaresPK == null && other.cargasFamiliaresPK != null) || (this.cargasFamiliaresPK != null && !this.cargasFamiliaresPK.equals(other.cargasFamiliaresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CargasFamiliares[ cargasFamiliaresPK=" + cargasFamiliaresPK + " ]";
    }
    
}
