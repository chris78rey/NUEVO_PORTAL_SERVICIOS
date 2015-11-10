/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ROLES_DE_PAGOS")
@NamedQueries({
    @NamedQuery(name = "RolesDePagos.findAll", query = "SELECT r FROM RolesDePagos r")})
public class RolesDePagos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolesDePagosPK rolesDePagosPK;
    @Column(name = "ANO")
    private Short ano;
    @Column(name = "MES")
    private Short mes;
    @Column(name = "SEMANA")
    private Short semana;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "TIPO")
    private Character tipo;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolesDePagos", fetch = FetchType.LAZY)
    private List<MovimientosRoles> movimientosRolesList;
    @OneToMany(mappedBy = "rolesDePagos", fetch = FetchType.LAZY)
    private List<CreacionNovedadesFct> creacionNovedadesFctList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolesDePagos", fetch = FetchType.LAZY)
    private List<NovedadesRoles> novedadesRolesList;

    public RolesDePagos() {
    }

    public RolesDePagos(RolesDePagosPK rolesDePagosPK) {
        this.rolesDePagosPK = rolesDePagosPK;
    }

    public RolesDePagos(String empCodigo, int numero) {
        this.rolesDePagosPK = new RolesDePagosPK(empCodigo, numero);
    }

    public RolesDePagosPK getRolesDePagosPK() {
        return rolesDePagosPK;
    }

    public void setRolesDePagosPK(RolesDePagosPK rolesDePagosPK) {
        this.rolesDePagosPK = rolesDePagosPK;
    }

    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
        this.ano = ano;
    }

    public Short getMes() {
        return mes;
    }

    public void setMes(Short mes) {
        this.mes = mes;
    }

    public Short getSemana() {
        return semana;
    }

    public void setSemana(Short semana) {
        this.semana = semana;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
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

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<MovimientosRoles> getMovimientosRolesList() {
        return movimientosRolesList;
    }

    public void setMovimientosRolesList(List<MovimientosRoles> movimientosRolesList) {
        this.movimientosRolesList = movimientosRolesList;
    }

    public List<CreacionNovedadesFct> getCreacionNovedadesFctList() {
        return creacionNovedadesFctList;
    }

    public void setCreacionNovedadesFctList(List<CreacionNovedadesFct> creacionNovedadesFctList) {
        this.creacionNovedadesFctList = creacionNovedadesFctList;
    }

    public List<NovedadesRoles> getNovedadesRolesList() {
        return novedadesRolesList;
    }

    public void setNovedadesRolesList(List<NovedadesRoles> novedadesRolesList) {
        this.novedadesRolesList = novedadesRolesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolesDePagosPK != null ? rolesDePagosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolesDePagos)) {
            return false;
        }
        RolesDePagos other = (RolesDePagos) object;
        if ((this.rolesDePagosPK == null && other.rolesDePagosPK != null) || (this.rolesDePagosPK != null && !this.rolesDePagosPK.equals(other.rolesDePagosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RolesDePagos[ rolesDePagosPK=" + rolesDePagosPK + " ]";
    }
    
}
