/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PARAMETROS_ROLES_EMPLEADO")
@NamedQueries({
    @NamedQuery(name = "ParametrosRolesEmpleado.findAll", query = "SELECT p FROM ParametrosRolesEmpleado p")})
public class ParametrosRolesEmpleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ParametrosRolesEmpleadoPK parametrosRolesEmpleadoPK;
    @Column(name = "SECUENCIA_DESPLIEGUE")
    private Short secuenciaDespliegue;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public ParametrosRolesEmpleado() {
    }

    public ParametrosRolesEmpleado(ParametrosRolesEmpleadoPK parametrosRolesEmpleadoPK) {
        this.parametrosRolesEmpleadoPK = parametrosRolesEmpleadoPK;
    }

    public ParametrosRolesEmpleado(String emprolEmpCodigo, int emprolCodigo, String prmrolEmpCodigo, String prmrolCodigo) {
        this.parametrosRolesEmpleadoPK = new ParametrosRolesEmpleadoPK(emprolEmpCodigo, emprolCodigo, prmrolEmpCodigo, prmrolCodigo);
    }

    public ParametrosRolesEmpleadoPK getParametrosRolesEmpleadoPK() {
        return parametrosRolesEmpleadoPK;
    }

    public void setParametrosRolesEmpleadoPK(ParametrosRolesEmpleadoPK parametrosRolesEmpleadoPK) {
        this.parametrosRolesEmpleadoPK = parametrosRolesEmpleadoPK;
    }

    public Short getSecuenciaDespliegue() {
        return secuenciaDespliegue;
    }

    public void setSecuenciaDespliegue(Short secuenciaDespliegue) {
        this.secuenciaDespliegue = secuenciaDespliegue;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parametrosRolesEmpleadoPK != null ? parametrosRolesEmpleadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosRolesEmpleado)) {
            return false;
        }
        ParametrosRolesEmpleado other = (ParametrosRolesEmpleado) object;
        if ((this.parametrosRolesEmpleadoPK == null && other.parametrosRolesEmpleadoPK != null) || (this.parametrosRolesEmpleadoPK != null && !this.parametrosRolesEmpleadoPK.equals(other.parametrosRolesEmpleadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ParametrosRolesEmpleado[ parametrosRolesEmpleadoPK=" + parametrosRolesEmpleadoPK + " ]";
    }
    
}
