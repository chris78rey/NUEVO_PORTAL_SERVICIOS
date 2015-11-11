/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "DETALLE_NOVEDADES")
@NamedQueries({
    @NamedQuery(name = "DetalleNovedades.findAll", query = "SELECT d FROM DetalleNovedades d")})
public class DetalleNovedades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTN_IDDETALLENOVEDAD")
    private Long dtnIddetallenovedad;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "CTP_IDCONTROL")
    private Long ctpIdcontrol;
    @Column(name = "TPN_IDTIPONOVEDAD")
    private Long tpnIdtiponovedad;
    @Column(name = "DTN_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnFecha;
    @Column(name = "DTN_DESCRIPCION")
    private String dtnDescripcion;
    @Column(name = "DTN_USER")
    private String dtnUser;
    @Column(name = "DTN_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnFechacreacion;

    public DetalleNovedades() {
    }

    public DetalleNovedades(Long dtnIddetallenovedad) {
        this.dtnIddetallenovedad = dtnIddetallenovedad;
    }

    public Long getDtnIddetallenovedad() {
        return dtnIddetallenovedad;
    }

    public void setDtnIddetallenovedad(Long dtnIddetallenovedad) {
        this.dtnIddetallenovedad = dtnIddetallenovedad;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Long getCtpIdcontrol() {
        return ctpIdcontrol;
    }

    public void setCtpIdcontrol(Long ctpIdcontrol) {
        this.ctpIdcontrol = ctpIdcontrol;
    }

    public Long getTpnIdtiponovedad() {
        return tpnIdtiponovedad;
    }

    public void setTpnIdtiponovedad(Long tpnIdtiponovedad) {
        this.tpnIdtiponovedad = tpnIdtiponovedad;
    }

    public Date getDtnFecha() {
        return dtnFecha;
    }

    public void setDtnFecha(Date dtnFecha) {
        this.dtnFecha = dtnFecha;
    }

    public String getDtnDescripcion() {
        return dtnDescripcion;
    }

    public void setDtnDescripcion(String dtnDescripcion) {
        this.dtnDescripcion = dtnDescripcion;
    }

    public String getDtnUser() {
        return dtnUser;
    }

    public void setDtnUser(String dtnUser) {
        this.dtnUser = dtnUser;
    }

    public Date getDtnFechacreacion() {
        return dtnFechacreacion;
    }

    public void setDtnFechacreacion(Date dtnFechacreacion) {
        this.dtnFechacreacion = dtnFechacreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtnIddetallenovedad != null ? dtnIddetallenovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleNovedades)) {
            return false;
        }
        DetalleNovedades other = (DetalleNovedades) object;
        if ((this.dtnIddetallenovedad == null && other.dtnIddetallenovedad != null) || (this.dtnIddetallenovedad != null && !this.dtnIddetallenovedad.equals(other.dtnIddetallenovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetalleNovedades[ dtnIddetallenovedad=" + dtnIddetallenovedad + " ]";
    }
    
}
