/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "LIQUIDACIONES")
@NamedQueries({
    @NamedQuery(name = "Liquidaciones.findAll", query = "SELECT l FROM Liquidaciones l")})
public class Liquidaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "FECHA_SALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "liquidaciones", fetch = FetchType.LAZY)
    private List<DetallesLiquidaciones> detallesLiquidacionesList;
    @JoinColumns({
        @JoinColumn(name = "EMPROL_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "EMPROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private EmpleadosRoles empleadosRoles;
    @JoinColumns({
        @JoinColumn(name = "PRMESP_PRMROL_EMP_CODIGO", referencedColumnName = "PRMROL_EMP_CODIGO"),
        @JoinColumn(name = "PRMESP_PRMROL_CODIGO", referencedColumnName = "PRMROL_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ParametrosEspeciales parametrosEspeciales;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public Liquidaciones() {
    }

    public Liquidaciones(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<DetallesLiquidaciones> getDetallesLiquidacionesList() {
        return detallesLiquidacionesList;
    }

    public void setDetallesLiquidacionesList(List<DetallesLiquidaciones> detallesLiquidacionesList) {
        this.detallesLiquidacionesList = detallesLiquidacionesList;
    }

    public EmpleadosRoles getEmpleadosRoles() {
        return empleadosRoles;
    }

    public void setEmpleadosRoles(EmpleadosRoles empleadosRoles) {
        this.empleadosRoles = empleadosRoles;
    }

    public ParametrosEspeciales getParametrosEspeciales() {
        return parametrosEspeciales;
    }

    public void setParametrosEspeciales(ParametrosEspeciales parametrosEspeciales) {
        this.parametrosEspeciales = parametrosEspeciales;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Liquidaciones)) {
            return false;
        }
        Liquidaciones other = (Liquidaciones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Liquidaciones[ numero=" + numero + " ]";
    }
    
}
