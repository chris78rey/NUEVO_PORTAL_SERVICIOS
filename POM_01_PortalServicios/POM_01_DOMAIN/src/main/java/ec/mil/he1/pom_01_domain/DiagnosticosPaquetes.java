/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DIAGNOSTICOS_PAQUETES")
@NamedQueries({
    @NamedQuery(name = "DiagnosticosPaquetes.findAll", query = "SELECT d FROM DiagnosticosPaquetes d")})
public class DiagnosticosPaquetes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiagnosticosPaquetesPK diagnosticosPaquetesPK;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;

    public DiagnosticosPaquetes() {
    }

    public DiagnosticosPaquetes(DiagnosticosPaquetesPK diagnosticosPaquetesPK) {
        this.diagnosticosPaquetesPK = diagnosticosPaquetesPK;
    }

    public DiagnosticosPaquetes(String pqtCnvConvenio, String pqtTipo, String pqtCodigo, String enfCodigo) {
        this.diagnosticosPaquetesPK = new DiagnosticosPaquetesPK(pqtCnvConvenio, pqtTipo, pqtCodigo, enfCodigo);
    }

    public DiagnosticosPaquetesPK getDiagnosticosPaquetesPK() {
        return diagnosticosPaquetesPK;
    }

    public void setDiagnosticosPaquetesPK(DiagnosticosPaquetesPK diagnosticosPaquetesPK) {
        this.diagnosticosPaquetesPK = diagnosticosPaquetesPK;
    }

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diagnosticosPaquetesPK != null ? diagnosticosPaquetesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosPaquetes)) {
            return false;
        }
        DiagnosticosPaquetes other = (DiagnosticosPaquetes) object;
        if ((this.diagnosticosPaquetesPK == null && other.diagnosticosPaquetesPK != null) || (this.diagnosticosPaquetesPK != null && !this.diagnosticosPaquetesPK.equals(other.diagnosticosPaquetesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DiagnosticosPaquetes[ diagnosticosPaquetesPK=" + diagnosticosPaquetesPK + " ]";
    }
    
}
