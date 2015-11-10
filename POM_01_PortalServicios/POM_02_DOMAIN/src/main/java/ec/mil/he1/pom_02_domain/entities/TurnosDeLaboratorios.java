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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TURNOS_DE_LABORATORIOS")
@NamedQueries({
    @NamedQuery(name = "TurnosDeLaboratorios.findAll", query = "SELECT t FROM TurnosDeLaboratorios t")})
public class TurnosDeLaboratorios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TurnosDeLaboratoriosPK turnosDeLaboratoriosPK;
    @Column(name = "ESTADO_DE_ATENCION")
    private Short estadoDeAtencion;
    @Column(name = "MOTIVO")
    private String motivo;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "EXM_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Examenes examenes;

    public TurnosDeLaboratorios() {
    }

    public TurnosDeLaboratorios(TurnosDeLaboratoriosPK turnosDeLaboratoriosPK) {
        this.turnosDeLaboratoriosPK = turnosDeLaboratoriosPK;
    }

    public TurnosDeLaboratorios(String dprAraCodigo, String dprCodigo, Date fecha, short numero) {
        this.turnosDeLaboratoriosPK = new TurnosDeLaboratoriosPK(dprAraCodigo, dprCodigo, fecha, numero);
    }

    public TurnosDeLaboratoriosPK getTurnosDeLaboratoriosPK() {
        return turnosDeLaboratoriosPK;
    }

    public void setTurnosDeLaboratoriosPK(TurnosDeLaboratoriosPK turnosDeLaboratoriosPK) {
        this.turnosDeLaboratoriosPK = turnosDeLaboratoriosPK;
    }

    public Short getEstadoDeAtencion() {
        return estadoDeAtencion;
    }

    public void setEstadoDeAtencion(Short estadoDeAtencion) {
        this.estadoDeAtencion = estadoDeAtencion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Examenes getExamenes() {
        return examenes;
    }

    public void setExamenes(Examenes examenes) {
        this.examenes = examenes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turnosDeLaboratoriosPK != null ? turnosDeLaboratoriosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurnosDeLaboratorios)) {
            return false;
        }
        TurnosDeLaboratorios other = (TurnosDeLaboratorios) object;
        if ((this.turnosDeLaboratoriosPK == null && other.turnosDeLaboratoriosPK != null) || (this.turnosDeLaboratoriosPK != null && !this.turnosDeLaboratoriosPK.equals(other.turnosDeLaboratoriosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TurnosDeLaboratorios[ turnosDeLaboratoriosPK=" + turnosDeLaboratoriosPK + " ]";
    }
    
}
