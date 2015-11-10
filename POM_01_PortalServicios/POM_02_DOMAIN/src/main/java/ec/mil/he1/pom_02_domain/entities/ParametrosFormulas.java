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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PARAMETROS_FORMULAS")
@NamedQueries({
    @NamedQuery(name = "ParametrosFormulas.findAll", query = "SELECT p FROM ParametrosFormulas p")})
public class ParametrosFormulas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParametrosFormulasPK parametrosFormulasPK;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @JoinColumns({
        @JoinColumn(name = "FRMROL_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "FRMROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private FormulasRoles formulasRoles;
    @JoinColumns({
        @JoinColumn(name = "PRMROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "PRMROL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private ParametrosRoles parametrosRoles;

    public ParametrosFormulas() {
    }

    public ParametrosFormulas(ParametrosFormulasPK parametrosFormulasPK) {
        this.parametrosFormulasPK = parametrosFormulasPK;
    }

    public ParametrosFormulas(String prmrolEmpCodigo, String prmrolCodigo) {
        this.parametrosFormulasPK = new ParametrosFormulasPK(prmrolEmpCodigo, prmrolCodigo);
    }

    public ParametrosFormulasPK getParametrosFormulasPK() {
        return parametrosFormulasPK;
    }

    public void setParametrosFormulasPK(ParametrosFormulasPK parametrosFormulasPK) {
        this.parametrosFormulasPK = parametrosFormulasPK;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public FormulasRoles getFormulasRoles() {
        return formulasRoles;
    }

    public void setFormulasRoles(FormulasRoles formulasRoles) {
        this.formulasRoles = formulasRoles;
    }

    public ParametrosRoles getParametrosRoles() {
        return parametrosRoles;
    }

    public void setParametrosRoles(ParametrosRoles parametrosRoles) {
        this.parametrosRoles = parametrosRoles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parametrosFormulasPK != null ? parametrosFormulasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosFormulas)) {
            return false;
        }
        ParametrosFormulas other = (ParametrosFormulas) object;
        if ((this.parametrosFormulasPK == null && other.parametrosFormulasPK != null) || (this.parametrosFormulasPK != null && !this.parametrosFormulasPK.equals(other.parametrosFormulasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosFormulas[ parametrosFormulasPK=" + parametrosFormulasPK + " ]";
    }
    
}
