/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "DEPARTAMENTOS_TRABAJAN")
@NamedQueries({
    @NamedQuery(name = "DepartamentosTrabajan.findAll", query = "SELECT d FROM DepartamentosTrabajan d")})
public class DepartamentosTrabajan implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepartamentosTrabajanPK departamentosTrabajanPK;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private String estadoDeDisponibilidad;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personal personal;

    public DepartamentosTrabajan() {
    }

    public DepartamentosTrabajan(DepartamentosTrabajanPK departamentosTrabajanPK) {
        this.departamentosTrabajanPK = departamentosTrabajanPK;
    }

    public DepartamentosTrabajan(String prsCodigo, String dprCodigo, String dprAraCodigo) {
        this.departamentosTrabajanPK = new DepartamentosTrabajanPK(prsCodigo, dprCodigo, dprAraCodigo);
    }

    public DepartamentosTrabajanPK getDepartamentosTrabajanPK() {
        return departamentosTrabajanPK;
    }

    public void setDepartamentosTrabajanPK(DepartamentosTrabajanPK departamentosTrabajanPK) {
        this.departamentosTrabajanPK = departamentosTrabajanPK;
    }

    public String getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(String estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
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
        hash += (departamentosTrabajanPK != null ? departamentosTrabajanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentosTrabajan)) {
            return false;
        }
        DepartamentosTrabajan other = (DepartamentosTrabajan) object;
        if ((this.departamentosTrabajanPK == null && other.departamentosTrabajanPK != null) || (this.departamentosTrabajanPK != null && !this.departamentosTrabajanPK.equals(other.departamentosTrabajanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DepartamentosTrabajan[ departamentosTrabajanPK=" + departamentosTrabajanPK + " ]";
    }
    
}
