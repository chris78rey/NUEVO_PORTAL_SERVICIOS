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
@Table(name = "DETALLE_VACACIONES")
@NamedQueries({
    @NamedQuery(name = "DetalleVacaciones.findAll", query = "SELECT d FROM DetalleVacaciones d")})
public class DetalleVacaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTV_IDDETALLEVACACIONES")
    private Long dtvIddetallevacaciones;
    @Column(name = "PRD_IDPERIODO")
    private Long prdIdperiodo;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "VCN_IDVACACIONES")
    private Long vcnIdvacaciones;
    @Column(name = "DTV_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtvFecha;
    @Column(name = "DTV_FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtvFechainicio;
    @Column(name = "DTV_FECHAFINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtvFechafinal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DTV_DESCUENTOS")
    private BigDecimal dtvDescuentos;
    @Column(name = "DTV_DIAS")
    private Long dtvDias;
    @Column(name = "DTV_DESCRIPCION")
    private String dtvDescripcion;
    @Column(name = "DTV_ESTADO")
    private Character dtvEstado;
    @Column(name = "DTV_AUTORIZA")
    private String dtvAutoriza;
    @Column(name = "DTV_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtvFechacreacion;
    @Column(name = "DTV_USER")
    private String dtvUser;
    @Column(name = "DTV_USO")
    private String dtvUso;

    public DetalleVacaciones() {
    }

    public DetalleVacaciones(Long dtvIddetallevacaciones) {
        this.dtvIddetallevacaciones = dtvIddetallevacaciones;
    }

    public Long getDtvIddetallevacaciones() {
        return dtvIddetallevacaciones;
    }

    public void setDtvIddetallevacaciones(Long dtvIddetallevacaciones) {
        this.dtvIddetallevacaciones = dtvIddetallevacaciones;
    }

    public Long getPrdIdperiodo() {
        return prdIdperiodo;
    }

    public void setPrdIdperiodo(Long prdIdperiodo) {
        this.prdIdperiodo = prdIdperiodo;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Long getVcnIdvacaciones() {
        return vcnIdvacaciones;
    }

    public void setVcnIdvacaciones(Long vcnIdvacaciones) {
        this.vcnIdvacaciones = vcnIdvacaciones;
    }

    public Date getDtvFecha() {
        return dtvFecha;
    }

    public void setDtvFecha(Date dtvFecha) {
        this.dtvFecha = dtvFecha;
    }

    public Date getDtvFechainicio() {
        return dtvFechainicio;
    }

    public void setDtvFechainicio(Date dtvFechainicio) {
        this.dtvFechainicio = dtvFechainicio;
    }

    public Date getDtvFechafinal() {
        return dtvFechafinal;
    }

    public void setDtvFechafinal(Date dtvFechafinal) {
        this.dtvFechafinal = dtvFechafinal;
    }

    public BigDecimal getDtvDescuentos() {
        return dtvDescuentos;
    }

    public void setDtvDescuentos(BigDecimal dtvDescuentos) {
        this.dtvDescuentos = dtvDescuentos;
    }

    public Long getDtvDias() {
        return dtvDias;
    }

    public void setDtvDias(Long dtvDias) {
        this.dtvDias = dtvDias;
    }

    public String getDtvDescripcion() {
        return dtvDescripcion;
    }

    public void setDtvDescripcion(String dtvDescripcion) {
        this.dtvDescripcion = dtvDescripcion;
    }

    public Character getDtvEstado() {
        return dtvEstado;
    }

    public void setDtvEstado(Character dtvEstado) {
        this.dtvEstado = dtvEstado;
    }

    public String getDtvAutoriza() {
        return dtvAutoriza;
    }

    public void setDtvAutoriza(String dtvAutoriza) {
        this.dtvAutoriza = dtvAutoriza;
    }

    public Date getDtvFechacreacion() {
        return dtvFechacreacion;
    }

    public void setDtvFechacreacion(Date dtvFechacreacion) {
        this.dtvFechacreacion = dtvFechacreacion;
    }

    public String getDtvUser() {
        return dtvUser;
    }

    public void setDtvUser(String dtvUser) {
        this.dtvUser = dtvUser;
    }

    public String getDtvUso() {
        return dtvUso;
    }

    public void setDtvUso(String dtvUso) {
        this.dtvUso = dtvUso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtvIddetallevacaciones != null ? dtvIddetallevacaciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVacaciones)) {
            return false;
        }
        DetalleVacaciones other = (DetalleVacaciones) object;
        if ((this.dtvIddetallevacaciones == null && other.dtvIddetallevacaciones != null) || (this.dtvIddetallevacaciones != null && !this.dtvIddetallevacaciones.equals(other.dtvIddetallevacaciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetalleVacaciones[ dtvIddetallevacaciones=" + dtvIddetallevacaciones + " ]";
    }
    
}
