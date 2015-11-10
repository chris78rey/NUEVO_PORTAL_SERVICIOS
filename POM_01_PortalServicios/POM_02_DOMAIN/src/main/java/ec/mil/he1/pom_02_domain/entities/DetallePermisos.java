/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "DETALLE_PERMISOS")
@NamedQueries({
    @NamedQuery(name = "DetallePermisos.findAll", query = "SELECT d FROM DetallePermisos d")})
public class DetallePermisos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTP_IDDETPERMISO")
    private Long dtpIddetpermiso;
    @Column(name = "PRM_IDPERMISO")
    private Long prmIdpermiso;
    @Column(name = "DTP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtpFecha;
    @Column(name = "DTP_FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtpFechainicio;
    @Column(name = "DTP_FECHAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtpFechafin;
    @Column(name = "DTP_HORAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtpHorainicio;
    @Column(name = "DTP_HORAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtpHorafin;
    @Column(name = "DTP_DIAS")
    private BigInteger dtpDias;
    @Column(name = "DTP_HORAS")
    private BigInteger dtpHoras;
    @Column(name = "DTP_DESCRIPCION")
    private String dtpDescripcion;
    @Column(name = "DTP_AUTORIZA")
    private String dtpAutoriza;
    @Column(name = "DTP_ESTADO")
    private Character dtpEstado;
    @Column(name = "DTP_USER")
    private String dtpUser;
    @Column(name = "DTP_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtpFechacreacion;
    @Column(name = "DTP_PERIODO")
    private BigInteger dtpPeriodo;
    @JoinColumns({
        @JoinColumn(name = "CTP_IDCONTROL", referencedColumnName = "CTP_IDCONTROL"),
        @JoinColumn(name = "PRN_IDPERSONAL", referencedColumnName = "PRN_IDPERSONAL")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ControlPersonal controlPersonal;

    public DetallePermisos() {
    }

    public DetallePermisos(Long dtpIddetpermiso) {
        this.dtpIddetpermiso = dtpIddetpermiso;
    }

    public Long getDtpIddetpermiso() {
        return dtpIddetpermiso;
    }

    public void setDtpIddetpermiso(Long dtpIddetpermiso) {
        this.dtpIddetpermiso = dtpIddetpermiso;
    }

    public Long getPrmIdpermiso() {
        return prmIdpermiso;
    }

    public void setPrmIdpermiso(Long prmIdpermiso) {
        this.prmIdpermiso = prmIdpermiso;
    }

    public Date getDtpFecha() {
        return dtpFecha;
    }

    public void setDtpFecha(Date dtpFecha) {
        this.dtpFecha = dtpFecha;
    }

    public Date getDtpFechainicio() {
        return dtpFechainicio;
    }

    public void setDtpFechainicio(Date dtpFechainicio) {
        this.dtpFechainicio = dtpFechainicio;
    }

    public Date getDtpFechafin() {
        return dtpFechafin;
    }

    public void setDtpFechafin(Date dtpFechafin) {
        this.dtpFechafin = dtpFechafin;
    }

    public Date getDtpHorainicio() {
        return dtpHorainicio;
    }

    public void setDtpHorainicio(Date dtpHorainicio) {
        this.dtpHorainicio = dtpHorainicio;
    }

    public Date getDtpHorafin() {
        return dtpHorafin;
    }

    public void setDtpHorafin(Date dtpHorafin) {
        this.dtpHorafin = dtpHorafin;
    }

    public BigInteger getDtpDias() {
        return dtpDias;
    }

    public void setDtpDias(BigInteger dtpDias) {
        this.dtpDias = dtpDias;
    }

    public BigInteger getDtpHoras() {
        return dtpHoras;
    }

    public void setDtpHoras(BigInteger dtpHoras) {
        this.dtpHoras = dtpHoras;
    }

    public String getDtpDescripcion() {
        return dtpDescripcion;
    }

    public void setDtpDescripcion(String dtpDescripcion) {
        this.dtpDescripcion = dtpDescripcion;
    }

    public String getDtpAutoriza() {
        return dtpAutoriza;
    }

    public void setDtpAutoriza(String dtpAutoriza) {
        this.dtpAutoriza = dtpAutoriza;
    }

    public Character getDtpEstado() {
        return dtpEstado;
    }

    public void setDtpEstado(Character dtpEstado) {
        this.dtpEstado = dtpEstado;
    }

    public String getDtpUser() {
        return dtpUser;
    }

    public void setDtpUser(String dtpUser) {
        this.dtpUser = dtpUser;
    }

    public Date getDtpFechacreacion() {
        return dtpFechacreacion;
    }

    public void setDtpFechacreacion(Date dtpFechacreacion) {
        this.dtpFechacreacion = dtpFechacreacion;
    }

    public BigInteger getDtpPeriodo() {
        return dtpPeriodo;
    }

    public void setDtpPeriodo(BigInteger dtpPeriodo) {
        this.dtpPeriodo = dtpPeriodo;
    }

    public ControlPersonal getControlPersonal() {
        return controlPersonal;
    }

    public void setControlPersonal(ControlPersonal controlPersonal) {
        this.controlPersonal = controlPersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtpIddetpermiso != null ? dtpIddetpermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePermisos)) {
            return false;
        }
        DetallePermisos other = (DetallePermisos) object;
        if ((this.dtpIddetpermiso == null && other.dtpIddetpermiso != null) || (this.dtpIddetpermiso != null && !this.dtpIddetpermiso.equals(other.dtpIddetpermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallePermisos[ dtpIddetpermiso=" + dtpIddetpermiso + " ]";
    }
    
}
