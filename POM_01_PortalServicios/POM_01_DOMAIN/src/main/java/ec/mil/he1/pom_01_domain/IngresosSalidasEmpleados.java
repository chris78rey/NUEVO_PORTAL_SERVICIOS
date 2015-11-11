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
@Table(name = "INGRESOS_SALIDAS_EMPLEADOS")
@NamedQueries({
    @NamedQuery(name = "IngresosSalidasEmpleados.findAll", query = "SELECT i FROM IngresosSalidasEmpleados i")})
public class IngresosSalidasEmpleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "EMPROL_EMP_CODIGO")
    private String emprolEmpCodigo;
    @Column(name = "EMPROL_CODIGO")
    private Integer emprolCodigo;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "FECHA_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public IngresosSalidasEmpleados() {
    }

    public IngresosSalidasEmpleados(Integer id) {
        this.id = id;
    }

    public String getEmprolEmpCodigo() {
        return emprolEmpCodigo;
    }

    public void setEmprolEmpCodigo(String emprolEmpCodigo) {
        this.emprolEmpCodigo = emprolEmpCodigo;
    }

    public Integer getEmprolCodigo() {
        return emprolCodigo;
    }

    public void setEmprolCodigo(Integer emprolCodigo) {
        this.emprolCodigo = emprolCodigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngresosSalidasEmpleados)) {
            return false;
        }
        IngresosSalidasEmpleados other = (IngresosSalidasEmpleados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.IngresosSalidasEmpleados[ id=" + id + " ]";
    }
    
}
