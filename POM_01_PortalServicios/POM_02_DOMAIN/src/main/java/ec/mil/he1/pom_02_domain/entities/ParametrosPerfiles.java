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
@Table(name = "PARAMETROS_PERFILES")
@NamedQueries({
    @NamedQuery(name = "ParametrosPerfiles.findAll", query = "SELECT p FROM ParametrosPerfiles p")})
public class ParametrosPerfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParametrosPerfilesPK parametrosPerfilesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @JoinColumns({
        @JoinColumn(name = "PRMROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "PRMROL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ParametrosRoles parametrosRoles;
    @JoinColumns({
        @JoinColumn(name = "PRFEMP_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "PRFEMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PerfilesEmpleados perfilesEmpleados;

    public ParametrosPerfiles() {
    }

    public ParametrosPerfiles(ParametrosPerfilesPK parametrosPerfilesPK) {
        this.parametrosPerfilesPK = parametrosPerfilesPK;
    }

    public ParametrosPerfiles(String prmrolCodigo, String prfempCodigo, String prmrolEmpCodigo, String prfempEmpCodigo) {
        this.parametrosPerfilesPK = new ParametrosPerfilesPK(prmrolCodigo, prfempCodigo, prmrolEmpCodigo, prfempEmpCodigo);
    }

    public ParametrosPerfilesPK getParametrosPerfilesPK() {
        return parametrosPerfilesPK;
    }

    public void setParametrosPerfilesPK(ParametrosPerfilesPK parametrosPerfilesPK) {
        this.parametrosPerfilesPK = parametrosPerfilesPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public ParametrosRoles getParametrosRoles() {
        return parametrosRoles;
    }

    public void setParametrosRoles(ParametrosRoles parametrosRoles) {
        this.parametrosRoles = parametrosRoles;
    }

    public PerfilesEmpleados getPerfilesEmpleados() {
        return perfilesEmpleados;
    }

    public void setPerfilesEmpleados(PerfilesEmpleados perfilesEmpleados) {
        this.perfilesEmpleados = perfilesEmpleados;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parametrosPerfilesPK != null ? parametrosPerfilesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosPerfiles)) {
            return false;
        }
        ParametrosPerfiles other = (ParametrosPerfiles) object;
        if ((this.parametrosPerfilesPK == null && other.parametrosPerfilesPK != null) || (this.parametrosPerfilesPK != null && !this.parametrosPerfilesPK.equals(other.parametrosPerfilesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosPerfiles[ parametrosPerfilesPK=" + parametrosPerfilesPK + " ]";
    }
    
}
