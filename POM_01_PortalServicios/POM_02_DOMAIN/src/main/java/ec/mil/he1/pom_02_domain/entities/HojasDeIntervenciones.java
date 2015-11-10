/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "HOJAS_DE_INTERVENCIONES")
@NamedQueries({
    @NamedQuery(name = "HojasDeIntervenciones.findAll", query = "SELECT h FROM HojasDeIntervenciones h")})
public class HojasDeIntervenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO_TRABAJO")
    private String estadoTrabajo;
    @OneToMany(mappedBy = "hojasDeIntervenciones", fetch = FetchType.LAZY)
    private List<PartesOperatoriosSolicitud> partesOperatoriosSolicitudList;

    public HojasDeIntervenciones() {
    }

    public HojasDeIntervenciones(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstadoTrabajo() {
        return estadoTrabajo;
    }

    public void setEstadoTrabajo(String estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }

    public List<PartesOperatoriosSolicitud> getPartesOperatoriosSolicitudList() {
        return partesOperatoriosSolicitudList;
    }

    public void setPartesOperatoriosSolicitudList(List<PartesOperatoriosSolicitud> partesOperatoriosSolicitudList) {
        this.partesOperatoriosSolicitudList = partesOperatoriosSolicitudList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HojasDeIntervenciones)) {
            return false;
        }
        HojasDeIntervenciones other = (HojasDeIntervenciones) object;
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.HojasDeIntervenciones[ fecha=" + fecha + " ]";
    }
    
}
