/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @Column(name = "FRMROL_EMP_CODIGO")
    private String frmrolEmpCodigo;
    @Column(name = "FRMROL_CODIGO")
    private String frmrolCodigo;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

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

    public String getFrmrolEmpCodigo() {
        return frmrolEmpCodigo;
    }

    public void setFrmrolEmpCodigo(String frmrolEmpCodigo) {
        this.frmrolEmpCodigo = frmrolEmpCodigo;
    }

    public String getFrmrolCodigo() {
        return frmrolCodigo;
    }

    public void setFrmrolCodigo(String frmrolCodigo) {
        this.frmrolCodigo = frmrolCodigo;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
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
        return "ec.mil.he1.pom_01_domain.ParametrosFormulas[ parametrosFormulasPK=" + parametrosFormulasPK + " ]";
    }
    
}
