/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "EMPLEADOS_CENTROS_DE_COSTOS")
@NamedQueries({
    @NamedQuery(name = "EmpleadosCentrosDeCostos.findAll", query = "SELECT e FROM EmpleadosCentrosDeCostos e")})
public class EmpleadosCentrosDeCostos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmpleadosCentrosDeCostosPK empleadosCentrosDeCostosPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "TERCERIZADORA")
    private String tercerizadora;
    @JoinColumns({
        @JoinColumn(name = "CNTCST_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "CNTCST_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "CNTCST_AGRUPADOR", referencedColumnName = "AGRUPADOR", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CentrosDeCostos centrosDeCostos;
    @JoinColumns({
        @JoinColumn(name = "EMPROL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "EMPROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EmpleadosRoles empleadosRoles;

    public EmpleadosCentrosDeCostos() {
    }

    public EmpleadosCentrosDeCostos(EmpleadosCentrosDeCostosPK empleadosCentrosDeCostosPK) {
        this.empleadosCentrosDeCostosPK = empleadosCentrosDeCostosPK;
    }

    public EmpleadosCentrosDeCostos(String emprolEmpCodigo, int emprolCodigo, String cntcstTipo, String cntcstEmpCodigo, String cntcstAgrupador) {
        this.empleadosCentrosDeCostosPK = new EmpleadosCentrosDeCostosPK(emprolEmpCodigo, emprolCodigo, cntcstTipo, cntcstEmpCodigo, cntcstAgrupador);
    }

    public EmpleadosCentrosDeCostosPK getEmpleadosCentrosDeCostosPK() {
        return empleadosCentrosDeCostosPK;
    }

    public void setEmpleadosCentrosDeCostosPK(EmpleadosCentrosDeCostosPK empleadosCentrosDeCostosPK) {
        this.empleadosCentrosDeCostosPK = empleadosCentrosDeCostosPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getTercerizadora() {
        return tercerizadora;
    }

    public void setTercerizadora(String tercerizadora) {
        this.tercerizadora = tercerizadora;
    }

    public CentrosDeCostos getCentrosDeCostos() {
        return centrosDeCostos;
    }

    public void setCentrosDeCostos(CentrosDeCostos centrosDeCostos) {
        this.centrosDeCostos = centrosDeCostos;
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
        hash += (empleadosCentrosDeCostosPK != null ? empleadosCentrosDeCostosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadosCentrosDeCostos)) {
            return false;
        }
        EmpleadosCentrosDeCostos other = (EmpleadosCentrosDeCostos) object;
        if ((this.empleadosCentrosDeCostosPK == null && other.empleadosCentrosDeCostosPK != null) || (this.empleadosCentrosDeCostosPK != null && !this.empleadosCentrosDeCostosPK.equals(other.empleadosCentrosDeCostosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EmpleadosCentrosDeCostos[ empleadosCentrosDeCostosPK=" + empleadosCentrosDeCostosPK + " ]";
    }
    
}
