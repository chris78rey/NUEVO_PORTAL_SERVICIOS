/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "DETALLE_SANCIONES")
@NamedQueries({
    @NamedQuery(name = "DetalleSanciones.findAll", query = "SELECT d FROM DetalleSanciones d")})
public class DetalleSanciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTS_IDSANCIONES")
    private Long dtsIdsanciones;
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
    @JoinColumns({
        @JoinColumn(name = "CTP_IDCONTROL", referencedColumnName = "CTP_IDCONTROL"),
        @JoinColumn(name = "PRN_IDPERSONAL", referencedColumnName = "PRN_IDPERSONAL")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ControlPersonal controlPersonal;
    @JoinColumn(name = "SNC_IDSANCION", referencedColumnName = "SNC_IDSANCION")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sanciones sanciones;

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

    public ControlPersonal getControlPersonal() {
        return controlPersonal;
    }

    public void setControlPersonal(ControlPersonal controlPersonal) {
        this.controlPersonal = controlPersonal;
    }

    public Sanciones getSanciones() {
        return sanciones;
    }

    public void setSanciones(Sanciones sanciones) {
        this.sanciones = sanciones;
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
        return "ec.mil.he1.pom_02_domain.entities.DetalleSanciones[ dtsIdsanciones=" + dtsIdsanciones + " ]";
    }
    
}
