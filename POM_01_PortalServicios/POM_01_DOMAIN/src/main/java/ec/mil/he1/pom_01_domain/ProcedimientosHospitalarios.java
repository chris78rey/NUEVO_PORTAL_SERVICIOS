/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PROCEDIMIENTOS_HOSPITALARIOS")
@NamedQueries({
    @NamedQuery(name = "ProcedimientosHospitalarios.findAll", query = "SELECT p FROM ProcedimientosHospitalarios p")})
public class ProcedimientosHospitalarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "AGRUPADOR")
    private String agrupador;
    @Column(name = "TIPO")
    private String tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PUNTOS")
    private BigDecimal puntos;
    @Column(name = "TIEMPO_ESTIMADO")
    private Short tiempoEstimado;
    @Column(name = "AGRCRG_CODIGO")
    private String agrcrgCodigo;
    @Column(name = "UVR")
    private BigDecimal uvr;
    @Column(name = "NIVEL")
    private BigInteger nivel;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "ALTA_COMPLEJIDAD")
    private Character altaComplejidad;
    @Column(name = "SEPARADO")
    private Character separado;
    @Column(name = "BILATERAL")
    private Character bilateral;

    public ProcedimientosHospitalarios() {
    }

    public ProcedimientosHospitalarios(String codigo) {
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

    public String getAgrupador() {
        return agrupador;
    }

    public void setAgrupador(String agrupador) {
        this.agrupador = agrupador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getPuntos() {
        return puntos;
    }

    public void setPuntos(BigDecimal puntos) {
        this.puntos = puntos;
    }

    public Short getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Short tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getAgrcrgCodigo() {
        return agrcrgCodigo;
    }

    public void setAgrcrgCodigo(String agrcrgCodigo) {
        this.agrcrgCodigo = agrcrgCodigo;
    }

    public BigDecimal getUvr() {
        return uvr;
    }

    public void setUvr(BigDecimal uvr) {
        this.uvr = uvr;
    }

    public BigInteger getNivel() {
        return nivel;
    }

    public void setNivel(BigInteger nivel) {
        this.nivel = nivel;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Character getAltaComplejidad() {
        return altaComplejidad;
    }

    public void setAltaComplejidad(Character altaComplejidad) {
        this.altaComplejidad = altaComplejidad;
    }

    public Character getSeparado() {
        return separado;
    }

    public void setSeparado(Character separado) {
        this.separado = separado;
    }

    public Character getBilateral() {
        return bilateral;
    }

    public void setBilateral(Character bilateral) {
        this.bilateral = bilateral;
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
        if (!(object instanceof ProcedimientosHospitalarios)) {
            return false;
        }
        ProcedimientosHospitalarios other = (ProcedimientosHospitalarios) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ProcedimientosHospitalarios[ codigo=" + codigo + " ]";
    }
    
}
