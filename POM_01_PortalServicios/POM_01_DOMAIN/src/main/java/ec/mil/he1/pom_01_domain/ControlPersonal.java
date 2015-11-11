/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "CONTROL_PERSONAL")
@NamedQueries({
    @NamedQuery(name = "ControlPersonal.findAll", query = "SELECT c FROM ControlPersonal c")})
public class ControlPersonal implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ControlPersonalPK controlPersonalPK;
    @Column(name = "CTP_MES")
    private String ctpMes;
    @Column(name = "CTP_ANIO")
    private BigInteger ctpAnio;
    @Column(name = "CTP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctpFecha;
    @Column(name = "CTP_DIASPERMISO")
    private BigInteger ctpDiaspermiso;
    @Column(name = "CTP_DIASFALTAS")
    private BigInteger ctpDiasfaltas;
    @Column(name = "CTP_TOTALATRASOS")
    private BigInteger ctpTotalatrasos;
    @Column(name = "CTP_TOTALDIAS")
    private BigInteger ctpTotaldias;
    @Column(name = "CTP_ESTADO")
    private Character ctpEstado;
    @Column(name = "CTP_OBSERVACION")
    private String ctpObservacion;
    @Column(name = "CTP_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctpFechacreacion;
    @Column(name = "CTP_USER")
    private String ctpUser;
    @Column(name = "CTP_NUMHORAS")
    private BigInteger ctpNumhoras;
    @Column(name = "CTP_EJECUTADO")
    private Character ctpEjecutado;
    @Column(name = "CTP_NUMHORASTOTAL")
    private BigInteger ctpNumhorastotal;

    public ControlPersonal() {
    }

    public ControlPersonal(ControlPersonalPK controlPersonalPK) {
        this.controlPersonalPK = controlPersonalPK;
    }

    public ControlPersonal(long ctpIdcontrol, long prnIdpersonal) {
        this.controlPersonalPK = new ControlPersonalPK(ctpIdcontrol, prnIdpersonal);
    }

    public ControlPersonalPK getControlPersonalPK() {
        return controlPersonalPK;
    }

    public void setControlPersonalPK(ControlPersonalPK controlPersonalPK) {
        this.controlPersonalPK = controlPersonalPK;
    }

    public String getCtpMes() {
        return ctpMes;
    }

    public void setCtpMes(String ctpMes) {
        this.ctpMes = ctpMes;
    }

    public BigInteger getCtpAnio() {
        return ctpAnio;
    }

    public void setCtpAnio(BigInteger ctpAnio) {
        this.ctpAnio = ctpAnio;
    }

    public Date getCtpFecha() {
        return ctpFecha;
    }

    public void setCtpFecha(Date ctpFecha) {
        this.ctpFecha = ctpFecha;
    }

    public BigInteger getCtpDiaspermiso() {
        return ctpDiaspermiso;
    }

    public void setCtpDiaspermiso(BigInteger ctpDiaspermiso) {
        this.ctpDiaspermiso = ctpDiaspermiso;
    }

    public BigInteger getCtpDiasfaltas() {
        return ctpDiasfaltas;
    }

    public void setCtpDiasfaltas(BigInteger ctpDiasfaltas) {
        this.ctpDiasfaltas = ctpDiasfaltas;
    }

    public BigInteger getCtpTotalatrasos() {
        return ctpTotalatrasos;
    }

    public void setCtpTotalatrasos(BigInteger ctpTotalatrasos) {
        this.ctpTotalatrasos = ctpTotalatrasos;
    }

    public BigInteger getCtpTotaldias() {
        return ctpTotaldias;
    }

    public void setCtpTotaldias(BigInteger ctpTotaldias) {
        this.ctpTotaldias = ctpTotaldias;
    }

    public Character getCtpEstado() {
        return ctpEstado;
    }

    public void setCtpEstado(Character ctpEstado) {
        this.ctpEstado = ctpEstado;
    }

    public String getCtpObservacion() {
        return ctpObservacion;
    }

    public void setCtpObservacion(String ctpObservacion) {
        this.ctpObservacion = ctpObservacion;
    }

    public Date getCtpFechacreacion() {
        return ctpFechacreacion;
    }

    public void setCtpFechacreacion(Date ctpFechacreacion) {
        this.ctpFechacreacion = ctpFechacreacion;
    }

    public String getCtpUser() {
        return ctpUser;
    }

    public void setCtpUser(String ctpUser) {
        this.ctpUser = ctpUser;
    }

    public BigInteger getCtpNumhoras() {
        return ctpNumhoras;
    }

    public void setCtpNumhoras(BigInteger ctpNumhoras) {
        this.ctpNumhoras = ctpNumhoras;
    }

    public Character getCtpEjecutado() {
        return ctpEjecutado;
    }

    public void setCtpEjecutado(Character ctpEjecutado) {
        this.ctpEjecutado = ctpEjecutado;
    }

    public BigInteger getCtpNumhorastotal() {
        return ctpNumhorastotal;
    }

    public void setCtpNumhorastotal(BigInteger ctpNumhorastotal) {
        this.ctpNumhorastotal = ctpNumhorastotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (controlPersonalPK != null ? controlPersonalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlPersonal)) {
            return false;
        }
        ControlPersonal other = (ControlPersonal) object;
        if ((this.controlPersonalPK == null && other.controlPersonalPK != null) || (this.controlPersonalPK != null && !this.controlPersonalPK.equals(other.controlPersonalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ControlPersonal[ controlPersonalPK=" + controlPersonalPK + " ]";
    }
    
}
