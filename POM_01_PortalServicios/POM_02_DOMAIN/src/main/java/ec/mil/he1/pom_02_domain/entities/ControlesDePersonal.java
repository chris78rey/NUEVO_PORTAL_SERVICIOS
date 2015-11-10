/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "CONTROLES_DE_PERSONAL")
@NamedQueries({
    @NamedQuery(name = "ControlesDePersonal.findAll", query = "SELECT c FROM ControlesDePersonal c")})
public class ControlesDePersonal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "PERIODO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date periodo;
    @Column(name = "DIAS_PERMITIDOS")
    private Short diasPermitidos;
    @Column(name = "FECHA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "FECHA_REANUDACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReanudacion;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumns({
        @JoinColumn(name = "EMPROL_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "EMPROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private EmpleadosRoles empleadosRoles;
    @JoinColumns({
        @JoinColumn(name = "PRMROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
        @JoinColumn(name = "PRMROL_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ParametrosRoles parametrosRoles;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public ControlesDePersonal() {
    }

    public ControlesDePersonal(Integer numero) {
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

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Date periodo) {
        this.periodo = periodo;
    }

    public Short getDiasPermitidos() {
        return diasPermitidos;
    }

    public void setDiasPermitidos(Short diasPermitidos) {
        this.diasPermitidos = diasPermitidos;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Date getFechaReanudacion() {
        return fechaReanudacion;
    }

    public void setFechaReanudacion(Date fechaReanudacion) {
        this.fechaReanudacion = fechaReanudacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public EmpleadosRoles getEmpleadosRoles() {
        return empleadosRoles;
    }

    public void setEmpleadosRoles(EmpleadosRoles empleadosRoles) {
        this.empleadosRoles = empleadosRoles;
    }

    public ParametrosRoles getParametrosRoles() {
        return parametrosRoles;
    }

    public void setParametrosRoles(ParametrosRoles parametrosRoles) {
        this.parametrosRoles = parametrosRoles;
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
        if (!(object instanceof ControlesDePersonal)) {
            return false;
        }
        ControlesDePersonal other = (ControlesDePersonal) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ControlesDePersonal[ numero=" + numero + " ]";
    }
    
}
