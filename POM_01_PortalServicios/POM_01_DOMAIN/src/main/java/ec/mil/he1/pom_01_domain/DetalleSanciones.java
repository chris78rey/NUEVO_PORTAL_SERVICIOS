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
@Table(name = "DETALLE_SANCIONES")
@NamedQueries({
    @NamedQuery(name = "DetalleSanciones.findAll", query = "SELECT d FROM DetalleSanciones d")})
public class DetalleSanciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTS_IDSANCIONES")
    private Long dtsIdsanciones;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "CTP_IDCONTROL")
    private Long ctpIdcontrol;
    @Column(name = "SNC_IDSANCION")
    private Long sncIdsancion;
    @Column(name = "DTS_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtsFecha;
    @Column(name = "DTS_DESCRIPCION")
    private String dtsDescripcion;
    @Column(name = "DTS_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtsFechacreacion;
    @Column(name = "DTS_USER")
    private String dtsUser;

    public DetalleSanciones() {
    }

    public DetalleSanciones(Long dtsIdsanciones) {
        this.dtsIdsanciones = dtsIdsanciones;
    }

    public Long getDtsIdsanciones() {
        return dtsIdsanciones;
    }

    public void setDtsIdsanciones(Long dtsIdsanciones) {
        this.dtsIdsanciones = dtsIdsanciones;
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

    public Long getSncIdsancion() {
        return sncIdsancion;
    }

    public void setSncIdsancion(Long sncIdsancion) {
        this.sncIdsancion = sncIdsancion;
    }

    public Date getDtsFecha() {
        return dtsFecha;
    }

    public void setDtsFecha(Date dtsFecha) {
        this.dtsFecha = dtsFecha;
    }

    public String getDtsDescripcion() {
        return dtsDescripcion;
    }

    public void setDtsDescripcion(String dtsDescripcion) {
        this.dtsDescripcion = dtsDescripcion;
    }

    public Date getDtsFechacreacion() {
        return dtsFechacreacion;
    }

    public void setDtsFechacreacion(Date dtsFechacreacion) {
        this.dtsFechacreacion = dtsFechacreacion;
    }

    public String getDtsUser() {
        return dtsUser;
    }

    public void setDtsUser(String dtsUser) {
        this.dtsUser = dtsUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtsIdsanciones != null ? dtsIdsanciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleSanciones)) {
            return false;
        }
        DetalleSanciones other = (DetalleSanciones) object;
        if ((this.dtsIdsanciones == null && other.dtsIdsanciones != null) || (this.dtsIdsanciones != null && !this.dtsIdsanciones.equals(other.dtsIdsanciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetalleSanciones[ dtsIdsanciones=" + dtsIdsanciones + " ]";
    }
    
}
