/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "SOLICITUD_CERTIFICADO")
@NamedQueries({
    @NamedQuery(name = "SolicitudCertificado.findAll", query = "SELECT s FROM SolicitudCertificado s")})
public class SolicitudCertificado implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "PRN_ID_PERSONAL")
    private BigInteger prnIdPersonal;
    @Column(name = "SLC_FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date slcFechaSolicitud;
    @Column(name = "SLC_OBSERVACION")
    private String slcObservacion;
    @Column(name = "SLC_PENDIENTE")
    private Character slcPendiente;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "FECHA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "NOMBRES")
    private String nombres;
    @JoinColumn(name = "TSO_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoSolicitud tipoSolicitud;

    public SolicitudCertificado() {
    }

    public SolicitudCertificado(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getPrnIdPersonal() {
        return prnIdPersonal;
    }

    public void setPrnIdPersonal(BigInteger prnIdPersonal) {
        this.prnIdPersonal = prnIdPersonal;
    }

    public Date getSlcFechaSolicitud() {
        return slcFechaSolicitud;
    }

    public void setSlcFechaSolicitud(Date slcFechaSolicitud) {
        this.slcFechaSolicitud = slcFechaSolicitud;
    }

    public String getSlcObservacion() {
        return slcObservacion;
    }

    public void setSlcObservacion(String slcObservacion) {
        this.slcObservacion = slcObservacion;
    }

    public Character getSlcPendiente() {
        return slcPendiente;
    }

    public void setSlcPendiente(Character slcPendiente) {
        this.slcPendiente = slcPendiente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public TipoSolicitud getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(TipoSolicitud tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudCertificado)) {
            return false;
        }
        SolicitudCertificado other = (SolicitudCertificado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SolicitudCertificado[ id=" + id + " ]";
    }
    
}
