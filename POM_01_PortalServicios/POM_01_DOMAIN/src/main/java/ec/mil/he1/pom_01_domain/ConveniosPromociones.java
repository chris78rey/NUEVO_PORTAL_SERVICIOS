/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "CONVENIOS_PROMOCIONES")
@NamedQueries({
    @NamedQuery(name = "ConveniosPromociones.findAll", query = "SELECT c FROM ConveniosPromociones c")})
public class ConveniosPromociones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConveniosPromocionesPK conveniosPromocionesPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public ConveniosPromociones() {
    }

    public ConveniosPromociones(ConveniosPromocionesPK conveniosPromocionesPK) {
        this.conveniosPromocionesPK = conveniosPromocionesPK;
    }

    public ConveniosPromociones(String cnvConvenio, String prmCodigo) {
        this.conveniosPromocionesPK = new ConveniosPromocionesPK(cnvConvenio, prmCodigo);
    }

    public ConveniosPromocionesPK getConveniosPromocionesPK() {
        return conveniosPromocionesPK;
    }

    public void setConveniosPromocionesPK(ConveniosPromocionesPK conveniosPromocionesPK) {
        this.conveniosPromocionesPK = conveniosPromocionesPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conveniosPromocionesPK != null ? conveniosPromocionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConveniosPromociones)) {
            return false;
        }
        ConveniosPromociones other = (ConveniosPromociones) object;
        if ((this.conveniosPromocionesPK == null && other.conveniosPromocionesPK != null) || (this.conveniosPromocionesPK != null && !this.conveniosPromocionesPK.equals(other.conveniosPromocionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ConveniosPromociones[ conveniosPromocionesPK=" + conveniosPromocionesPK + " ]";
    }
    
}
