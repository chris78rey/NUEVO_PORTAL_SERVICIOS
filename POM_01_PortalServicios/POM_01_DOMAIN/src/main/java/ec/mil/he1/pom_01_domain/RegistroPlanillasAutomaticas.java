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
@Table(name = "REGISTRO_PLANILLAS_AUTOMATICAS")
@NamedQueries({
    @NamedQuery(name = "RegistroPlanillasAutomaticas.findAll", query = "SELECT r FROM RegistroPlanillasAutomaticas r")})
public class RegistroPlanillasAutomaticas implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_GENERACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaGeneracion;
    @Column(name = "FECHA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicial;
    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinal;
    @Column(name = "PLANILLAS")
    private Long planillas;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "CAJA")
    private String caja;
    @Column(name = "PLANILLA_INICIAL")
    private Integer planillaInicial;
    @Column(name = "PLANILLA_FINAL")
    private Integer planillaFinal;
    @Column(name = "TIPO_GENERACION")
    private String tipoGeneracion;
    @Column(name = "SERVICIO")
    private String servicio;

    public RegistroPlanillasAutomaticas() {
    }

    public RegistroPlanillasAutomaticas(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
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

    public Long getPlanillas() {
        return planillas;
    }

    public void setPlanillas(Long planillas) {
        this.planillas = planillas;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public Integer getPlanillaInicial() {
        return planillaInicial;
    }

    public void setPlanillaInicial(Integer planillaInicial) {
        this.planillaInicial = planillaInicial;
    }

    public Integer getPlanillaFinal() {
        return planillaFinal;
    }

    public void setPlanillaFinal(Integer planillaFinal) {
        this.planillaFinal = planillaFinal;
    }

    public String getTipoGeneracion() {
        return tipoGeneracion;
    }

    public void setTipoGeneracion(String tipoGeneracion) {
        this.tipoGeneracion = tipoGeneracion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
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
        if (!(object instanceof RegistroPlanillasAutomaticas)) {
            return false;
        }
        RegistroPlanillasAutomaticas other = (RegistroPlanillasAutomaticas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RegistroPlanillasAutomaticas[ id=" + id + " ]";
    }
    
}
