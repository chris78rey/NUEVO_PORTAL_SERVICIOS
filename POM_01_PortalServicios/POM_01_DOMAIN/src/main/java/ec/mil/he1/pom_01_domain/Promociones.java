/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PROMOCIONES")
@NamedQueries({
    @NamedQuery(name = "Promociones.findAll", query = "SELECT p FROM Promociones p")})
public class Promociones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "OBSERVACION")
    private String observacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INGRESO_MINIMO")
    private BigDecimal ingresoMinimo;
    @Column(name = "INGRESO_MAXIMO")
    private BigDecimal ingresoMaximo;
    @Column(name = "MONTO_MAXIMO")
    private Integer montoMaximo;
    @Column(name = "EDAD_MAXIMA")
    private Short edadMaxima;
    @Column(name = "NUMERO_MAX_BENEFICIARIO")
    private Short numeroMaxBeneficiario;
    @Column(name = "NUMERO_MAX_DEPENDIENTES")
    private Short numeroMaxDependientes;
    @Column(name = "PRM_PCN_NUMERO_HC")
    private Integer prmPcnNumeroHc;
    @Column(name = "UVR")
    private BigDecimal uvr;
    @Column(name = "RESTRICCION")
    private Character restriccion;
    @Column(name = "REQUIERE_AUDITORIA")
    private String requiereAuditoria;
    @Column(name = "COLOR")
    private String color;

    public Promociones() {
    }

    public Promociones(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getIngresoMinimo() {
        return ingresoMinimo;
    }

    public void setIngresoMinimo(BigDecimal ingresoMinimo) {
        this.ingresoMinimo = ingresoMinimo;
    }

    public BigDecimal getIngresoMaximo() {
        return ingresoMaximo;
    }

    public void setIngresoMaximo(BigDecimal ingresoMaximo) {
        this.ingresoMaximo = ingresoMaximo;
    }

    public Integer getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(Integer montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public Short getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Short edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public Short getNumeroMaxBeneficiario() {
        return numeroMaxBeneficiario;
    }

    public void setNumeroMaxBeneficiario(Short numeroMaxBeneficiario) {
        this.numeroMaxBeneficiario = numeroMaxBeneficiario;
    }

    public Short getNumeroMaxDependientes() {
        return numeroMaxDependientes;
    }

    public void setNumeroMaxDependientes(Short numeroMaxDependientes) {
        this.numeroMaxDependientes = numeroMaxDependientes;
    }

    public Integer getPrmPcnNumeroHc() {
        return prmPcnNumeroHc;
    }

    public void setPrmPcnNumeroHc(Integer prmPcnNumeroHc) {
        this.prmPcnNumeroHc = prmPcnNumeroHc;
    }

    public BigDecimal getUvr() {
        return uvr;
    }

    public void setUvr(BigDecimal uvr) {
        this.uvr = uvr;
    }

    public Character getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(Character restriccion) {
        this.restriccion = restriccion;
    }

    public String getRequiereAuditoria() {
        return requiereAuditoria;
    }

    public void setRequiereAuditoria(String requiereAuditoria) {
        this.requiereAuditoria = requiereAuditoria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        if (!(object instanceof Promociones)) {
            return false;
        }
        Promociones other = (Promociones) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Promociones[ codigo=" + codigo + " ]";
    }
    
}
