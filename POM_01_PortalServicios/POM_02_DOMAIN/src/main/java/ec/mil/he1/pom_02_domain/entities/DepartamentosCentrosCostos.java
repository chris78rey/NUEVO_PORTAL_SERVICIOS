/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DEPARTAMENTOS_CENTROS_COSTOS")
@NamedQueries({
    @NamedQuery(name = "DepartamentosCentrosCostos.findAll", query = "SELECT d FROM DepartamentosCentrosCostos d")})
public class DepartamentosCentrosCostos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepartamentosCentrosCostosPK departamentosCentrosCostosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @JoinColumns({
        @JoinColumn(name = "CNTCST_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "CNTCST_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "CNTCST_AGRUPADOR", referencedColumnName = "AGRUPADOR", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CentrosDeCostos centrosDeCostos;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Departamentos departamentos;

    public DepartamentosCentrosCostos() {
    }

    public DepartamentosCentrosCostos(DepartamentosCentrosCostosPK departamentosCentrosCostosPK) {
        this.departamentosCentrosCostosPK = departamentosCentrosCostosPK;
    }

    public DepartamentosCentrosCostos(String dprAraCodigo, String dprCodigo, String cntcstEmpCodigo, String cntcstTipo, String cntcstAgrupador) {
        this.departamentosCentrosCostosPK = new DepartamentosCentrosCostosPK(dprAraCodigo, dprCodigo, cntcstEmpCodigo, cntcstTipo, cntcstAgrupador);
    }

    public DepartamentosCentrosCostosPK getDepartamentosCentrosCostosPK() {
        return departamentosCentrosCostosPK;
    }

    public void setDepartamentosCentrosCostosPK(DepartamentosCentrosCostosPK departamentosCentrosCostosPK) {
        this.departamentosCentrosCostosPK = departamentosCentrosCostosPK;
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

    public CentrosDeCostos getCentrosDeCostos() {
        return centrosDeCostos;
    }

    public void setCentrosDeCostos(CentrosDeCostos centrosDeCostos) {
        this.centrosDeCostos = centrosDeCostos;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departamentosCentrosCostosPK != null ? departamentosCentrosCostosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentosCentrosCostos)) {
            return false;
        }
        DepartamentosCentrosCostos other = (DepartamentosCentrosCostos) object;
        if ((this.departamentosCentrosCostosPK == null && other.departamentosCentrosCostosPK != null) || (this.departamentosCentrosCostosPK != null && !this.departamentosCentrosCostosPK.equals(other.departamentosCentrosCostosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DepartamentosCentrosCostos[ departamentosCentrosCostosPK=" + departamentosCentrosCostosPK + " ]";
    }
    
}
