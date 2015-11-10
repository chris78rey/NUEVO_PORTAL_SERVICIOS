/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

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
@Table(name = "GASTOS_PERSONALES")
@NamedQueries({
    @NamedQuery(name = "GastosPersonales.findAll", query = "SELECT g FROM GastosPersonales g")})
public class GastosPersonales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GTP_IDGASTOS")
    private Long gtpIdgastos;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "GTP_OTROINGRESOS")
    private BigDecimal gtpOtroingresos;
    @Column(name = "GTP_GVIVIENDA")
    private BigDecimal gtpGvivienda;
    @Column(name = "GTP_GEDUCACION")
    private BigDecimal gtpGeducacion;
    @Column(name = "GTP_GSALUD")
    private BigDecimal gtpGsalud;
    @Column(name = "GTP_GVESTIMENTA")
    private BigDecimal gtpGvestimenta;
    @Column(name = "GTP_GALIMENTACION")
    private BigDecimal gtpGalimentacion;
    @Column(name = "GTP_TOTALGASTOSPRY")
    private BigDecimal gtpTotalgastospry;
    @Column(name = "GTP_TOTALINGRESOSPRY")
    private BigDecimal gtpTotalingresospry;
    @Column(name = "GTP_VALORAPGAR")
    private BigDecimal gtpValorapgar;
    @Column(name = "GTP_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gtpFechacreacion;
    @Column(name = "GTP_USER")
    private String gtpUser;
    @Column(name = "GTP_TOTALIMPONIBLE")
    private BigDecimal gtpTotalimponible;
    @Column(name = "GTP_A\u00d1O")
    private Long gtpAño;
    @Column(name = "GTP_ESTADO")
    private Character gtpEstado;
    @Column(name = "GTP_CONTROL")
    private Character gtpControl;
    @Column(name = "GTP_IMPCOBRADO")
    private BigDecimal gtpImpcobrado;
    @Column(name = "GTP_INGVARIOS")
    private BigDecimal gtpIngvarios;

    public GastosPersonales() {
    }

    public GastosPersonales(Long gtpIdgastos) {
        this.gtpIdgastos = gtpIdgastos;
    }

    public Long getGtpIdgastos() {
        return gtpIdgastos;
    }

    public void setGtpIdgastos(Long gtpIdgastos) {
        this.gtpIdgastos = gtpIdgastos;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public BigDecimal getGtpOtroingresos() {
        return gtpOtroingresos;
    }

    public void setGtpOtroingresos(BigDecimal gtpOtroingresos) {
        this.gtpOtroingresos = gtpOtroingresos;
    }

    public BigDecimal getGtpGvivienda() {
        return gtpGvivienda;
    }

    public void setGtpGvivienda(BigDecimal gtpGvivienda) {
        this.gtpGvivienda = gtpGvivienda;
    }

    public BigDecimal getGtpGeducacion() {
        return gtpGeducacion;
    }

    public void setGtpGeducacion(BigDecimal gtpGeducacion) {
        this.gtpGeducacion = gtpGeducacion;
    }

    public BigDecimal getGtpGsalud() {
        return gtpGsalud;
    }

    public void setGtpGsalud(BigDecimal gtpGsalud) {
        this.gtpGsalud = gtpGsalud;
    }

    public BigDecimal getGtpGvestimenta() {
        return gtpGvestimenta;
    }

    public void setGtpGvestimenta(BigDecimal gtpGvestimenta) {
        this.gtpGvestimenta = gtpGvestimenta;
    }

    public BigDecimal getGtpGalimentacion() {
        return gtpGalimentacion;
    }

    public void setGtpGalimentacion(BigDecimal gtpGalimentacion) {
        this.gtpGalimentacion = gtpGalimentacion;
    }

    public BigDecimal getGtpTotalgastospry() {
        return gtpTotalgastospry;
    }

    public void setGtpTotalgastospry(BigDecimal gtpTotalgastospry) {
        this.gtpTotalgastospry = gtpTotalgastospry;
    }

    public BigDecimal getGtpTotalingresospry() {
        return gtpTotalingresospry;
    }

    public void setGtpTotalingresospry(BigDecimal gtpTotalingresospry) {
        this.gtpTotalingresospry = gtpTotalingresospry;
    }

    public BigDecimal getGtpValorapgar() {
        return gtpValorapgar;
    }

    public void setGtpValorapgar(BigDecimal gtpValorapgar) {
        this.gtpValorapgar = gtpValorapgar;
    }

    public Date getGtpFechacreacion() {
        return gtpFechacreacion;
    }

    public void setGtpFechacreacion(Date gtpFechacreacion) {
        this.gtpFechacreacion = gtpFechacreacion;
    }

    public String getGtpUser() {
        return gtpUser;
    }

    public void setGtpUser(String gtpUser) {
        this.gtpUser = gtpUser;
    }

    public BigDecimal getGtpTotalimponible() {
        return gtpTotalimponible;
    }

    public void setGtpTotalimponible(BigDecimal gtpTotalimponible) {
        this.gtpTotalimponible = gtpTotalimponible;
    }

    public Long getGtpAño() {
        return gtpAño;
    }

    public void setGtpAño(Long gtpAño) {
        this.gtpAño = gtpAño;
    }

    public Character getGtpEstado() {
        return gtpEstado;
    }

    public void setGtpEstado(Character gtpEstado) {
        this.gtpEstado = gtpEstado;
    }

    public Character getGtpControl() {
        return gtpControl;
    }

    public void setGtpControl(Character gtpControl) {
        this.gtpControl = gtpControl;
    }

    public BigDecimal getGtpImpcobrado() {
        return gtpImpcobrado;
    }

    public void setGtpImpcobrado(BigDecimal gtpImpcobrado) {
        this.gtpImpcobrado = gtpImpcobrado;
    }

    public BigDecimal getGtpIngvarios() {
        return gtpIngvarios;
    }

    public void setGtpIngvarios(BigDecimal gtpIngvarios) {
        this.gtpIngvarios = gtpIngvarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gtpIdgastos != null ? gtpIdgastos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GastosPersonales)) {
            return false;
        }
        GastosPersonales other = (GastosPersonales) object;
        if ((this.gtpIdgastos == null && other.gtpIdgastos != null) || (this.gtpIdgastos != null && !this.gtpIdgastos.equals(other.gtpIdgastos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.GastosPersonales[ gtpIdgastos=" + gtpIdgastos + " ]";
    }
    
}
