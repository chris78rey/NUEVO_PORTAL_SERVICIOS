/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ESTADOS_PACIENTES")
@NamedQueries({
    @NamedQuery(name = "EstadosPacientes.findAll", query = "SELECT e FROM EstadosPacientes e")})
public class EstadosPacientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstadosPacientesPK estadosPacientesPK;
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;

    public EstadosPacientes() {
    }

    public EstadosPacientes(EstadosPacientesPK estadosPacientesPK) {
        this.estadosPacientesPK = estadosPacientesPK;
    }

    public EstadosPacientes(long dgnpcnDgnpcnId, int pcnNumeroHc, Date fecha) {
        this.estadosPacientesPK = new EstadosPacientesPK(dgnpcnDgnpcnId, pcnNumeroHc, fecha);
    }

    public EstadosPacientesPK getEstadosPacientesPK() {
        return estadosPacientesPK;
    }

    public void setEstadosPacientesPK(EstadosPacientesPK estadosPacientesPK) {
        this.estadosPacientesPK = estadosPacientesPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadosPacientesPK != null ? estadosPacientesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadosPacientes)) {
            return false;
        }
        EstadosPacientes other = (EstadosPacientes) object;
        if ((this.estadosPacientesPK == null && other.estadosPacientesPK != null) || (this.estadosPacientesPK != null && !this.estadosPacientesPK.equals(other.estadosPacientesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EstadosPacientes[ estadosPacientesPK=" + estadosPacientesPK + " ]";
    }
    
}
