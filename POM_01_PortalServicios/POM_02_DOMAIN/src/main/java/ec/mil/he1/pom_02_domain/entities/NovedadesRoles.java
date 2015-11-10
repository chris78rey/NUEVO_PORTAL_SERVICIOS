/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "NOVEDADES_ROLES")
@NamedQueries({
    @NamedQuery(name = "NovedadesRoles.findAll", query = "SELECT n FROM NovedadesRoles n")})
public class NovedadesRoles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NovedadesRolesPK novedadesRolesPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumns({
        @JoinColumn(name = "EMPROL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "EMPROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EmpleadosRoles empleadosRoles;
    @JoinColumns({
        @JoinColumn(name = "PRMROL_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "PRMROL_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ParametrosRoles parametrosRoles;
    @JoinColumns({
        @JoinColumn(name = "ROLPGS_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "ROLPGS_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RolesDePagos rolesDePagos;

    public NovedadesRoles() {
    }

    public NovedadesRoles(NovedadesRolesPK novedadesRolesPK) {
        this.novedadesRolesPK = novedadesRolesPK;
    }

    public NovedadesRoles(String rolpgsEmpCodigo, int rolpgsNumero, String prmrolEmpCodigo, String prmrolCodigo, String emprolEmpCodigo, int emprolCodigo) {
        this.novedadesRolesPK = new NovedadesRolesPK(rolpgsEmpCodigo, rolpgsNumero, prmrolEmpCodigo, prmrolCodigo, emprolEmpCodigo, emprolCodigo);
    }

    public NovedadesRolesPK getNovedadesRolesPK() {
        return novedadesRolesPK;
    }

    public void setNovedadesRolesPK(NovedadesRolesPK novedadesRolesPK) {
        this.novedadesRolesPK = novedadesRolesPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public RolesDePagos getRolesDePagos() {
        return rolesDePagos;
    }

    public void setRolesDePagos(RolesDePagos rolesDePagos) {
        this.rolesDePagos = rolesDePagos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (novedadesRolesPK != null ? novedadesRolesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NovedadesRoles)) {
            return false;
        }
        NovedadesRoles other = (NovedadesRoles) object;
        if ((this.novedadesRolesPK == null && other.novedadesRolesPK != null) || (this.novedadesRolesPK != null && !this.novedadesRolesPK.equals(other.novedadesRolesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.NovedadesRoles[ novedadesRolesPK=" + novedadesRolesPK + " ]";
    }
    
}
