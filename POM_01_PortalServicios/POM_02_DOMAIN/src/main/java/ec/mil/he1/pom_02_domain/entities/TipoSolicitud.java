/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TIPO_SOLICITUD")
@NamedQueries({
    @NamedQuery(name = "TipoSolicitud.findAll", query = "SELECT t FROM TipoSolicitud t")})
public class TipoSolicitud implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "TSO_DESCRIPCION")
    private String tsoDescripcion;
    @OneToMany(mappedBy = "tipoSolicitud", fetch = FetchType.LAZY)
    private List<SolicitudCertificado> solicitudCertificadoList;

    public TipoSolicitud() {
    }

    public TipoSolicitud(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTsoDescripcion() {
        return tsoDescripcion;
    }

    public void setTsoDescripcion(String tsoDescripcion) {
        this.tsoDescripcion = tsoDescripcion;
    }

    public List<SolicitudCertificado> getSolicitudCertificadoList() {
        return solicitudCertificadoList;
    }

    public void setSolicitudCertificadoList(List<SolicitudCertificado> solicitudCertificadoList) {
        this.solicitudCertificadoList = solicitudCertificadoList;
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
        if (!(object instanceof TipoSolicitud)) {
            return false;
        }
        TipoSolicitud other = (TipoSolicitud) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TipoSolicitud[ id=" + id + " ]";
    }
    
}
