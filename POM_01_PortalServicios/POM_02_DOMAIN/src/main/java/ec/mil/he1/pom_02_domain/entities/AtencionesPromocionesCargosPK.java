/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class AtencionesPromocionesCargosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TIPO_ATENCION")
    private String tipoAtencion;
    @Basic(optional = false)
    @Column(name = "CLASIFICACION_PACIENTE")
    private String clasificacionPaciente;
    @Basic(optional = false)
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public AtencionesPromocionesCargosPK() {
    }

    public AtencionesPromocionesCargosPK(String tipoAtencion, String clasificacionPaciente, Character estadoDeDisponibilidad) {
        this.tipoAtencion = tipoAtencion;
        this.clasificacionPaciente = clasificacionPaciente;
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public String getClasificacionPaciente() {
        return clasificacionPaciente;
    }

    public void setClasificacionPaciente(String clasificacionPaciente) {
        this.clasificacionPaciente = clasificacionPaciente;
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
        hash += (tipoAtencion != null ? tipoAtencion.hashCode() : 0);
        hash += (clasificacionPaciente != null ? clasificacionPaciente.hashCode() : 0);
        hash += (estadoDeDisponibilidad != null ? estadoDeDisponibilidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtencionesPromocionesCargosPK)) {
            return false;
        }
        AtencionesPromocionesCargosPK other = (AtencionesPromocionesCargosPK) object;
        if ((this.tipoAtencion == null && other.tipoAtencion != null) || (this.tipoAtencion != null && !this.tipoAtencion.equals(other.tipoAtencion))) {
            return false;
        }
        if ((this.clasificacionPaciente == null && other.clasificacionPaciente != null) || (this.clasificacionPaciente != null && !this.clasificacionPaciente.equals(other.clasificacionPaciente))) {
            return false;
        }
        if ((this.estadoDeDisponibilidad == null && other.estadoDeDisponibilidad != null) || (this.estadoDeDisponibilidad != null && !this.estadoDeDisponibilidad.equals(other.estadoDeDisponibilidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AtencionesPromocionesCargosPK[ tipoAtencion=" + tipoAtencion + ", clasificacionPaciente=" + clasificacionPaciente + ", estadoDeDisponibilidad=" + estadoDeDisponibilidad + " ]";
    }
    
}
