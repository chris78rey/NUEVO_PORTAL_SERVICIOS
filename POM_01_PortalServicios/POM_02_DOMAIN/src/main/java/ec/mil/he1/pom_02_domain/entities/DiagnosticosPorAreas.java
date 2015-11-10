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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DIAGNOSTICOS_POR_AREAS")
@NamedQueries({
    @NamedQuery(name = "DiagnosticosPorAreas.findAll", query = "SELECT d FROM DiagnosticosPorAreas d")})
public class DiagnosticosPorAreas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiagnosticosPorAreasPK diagnosticosPorAreasPK;
    @Column(name = "FECHA_DE_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeCreacion;
    @JoinColumn(name = "DGNLBR_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DiagnosticosDeLaboratorios diagnosticosDeLaboratorios;

    public DiagnosticosPorAreas() {
    }

    public DiagnosticosPorAreas(DiagnosticosPorAreasPK diagnosticosPorAreasPK) {
        this.diagnosticosPorAreasPK = diagnosticosPorAreasPK;
    }

    public DiagnosticosPorAreas(Character areaDeUso, String dgnlbrCodigo) {
        this.diagnosticosPorAreasPK = new DiagnosticosPorAreasPK(areaDeUso, dgnlbrCodigo);
    }

    public DiagnosticosPorAreasPK getDiagnosticosPorAreasPK() {
        return diagnosticosPorAreasPK;
    }

    public void setDiagnosticosPorAreasPK(DiagnosticosPorAreasPK diagnosticosPorAreasPK) {
        this.diagnosticosPorAreasPK = diagnosticosPorAreasPK;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public DiagnosticosDeLaboratorios getDiagnosticosDeLaboratorios() {
        return diagnosticosDeLaboratorios;
    }

    public void setDiagnosticosDeLaboratorios(DiagnosticosDeLaboratorios diagnosticosDeLaboratorios) {
        this.diagnosticosDeLaboratorios = diagnosticosDeLaboratorios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diagnosticosPorAreasPK != null ? diagnosticosPorAreasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosPorAreas)) {
            return false;
        }
        DiagnosticosPorAreas other = (DiagnosticosPorAreas) object;
        if ((this.diagnosticosPorAreasPK == null && other.diagnosticosPorAreasPK != null) || (this.diagnosticosPorAreasPK != null && !this.diagnosticosPorAreasPK.equals(other.diagnosticosPorAreasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DiagnosticosPorAreas[ diagnosticosPorAreasPK=" + diagnosticosPorAreasPK + " ]";
    }
    
}
