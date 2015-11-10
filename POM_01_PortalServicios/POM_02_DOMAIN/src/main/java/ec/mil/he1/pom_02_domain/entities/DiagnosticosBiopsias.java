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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DIAGNOSTICOS_BIOPSIAS")
@NamedQueries({
    @NamedQuery(name = "DiagnosticosBiopsias.findAll", query = "SELECT d FROM DiagnosticosBiopsias d")})
public class DiagnosticosBiopsias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiagnosticosBiopsiasPK diagnosticosBiopsiasPK;
    @Column(name = "FECHA_DE_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeCreacion;
    @JoinColumns({
        @JoinColumn(name = "BPSDTL_EXM_NUMERO", referencedColumnName = "EXM_NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "BPSDTL_VRBEXM_CODIGO", referencedColumnName = "VRBEXM_CODIGO")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private BiopsiasDetalles biopsiasDetalles;
    @JoinColumn(name = "DGNLBR_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DiagnosticosDeLaboratorios diagnosticosDeLaboratorios;

    public DiagnosticosBiopsias() {
    }

    public DiagnosticosBiopsias(DiagnosticosBiopsiasPK diagnosticosBiopsiasPK) {
        this.diagnosticosBiopsiasPK = diagnosticosBiopsiasPK;
    }

    public DiagnosticosBiopsias(int bpsdtlExmNumero, String dgnlbrCodigo) {
        this.diagnosticosBiopsiasPK = new DiagnosticosBiopsiasPK(bpsdtlExmNumero, dgnlbrCodigo);
    }

    public DiagnosticosBiopsiasPK getDiagnosticosBiopsiasPK() {
        return diagnosticosBiopsiasPK;
    }

    public void setDiagnosticosBiopsiasPK(DiagnosticosBiopsiasPK diagnosticosBiopsiasPK) {
        this.diagnosticosBiopsiasPK = diagnosticosBiopsiasPK;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public BiopsiasDetalles getBiopsiasDetalles() {
        return biopsiasDetalles;
    }

    public void setBiopsiasDetalles(BiopsiasDetalles biopsiasDetalles) {
        this.biopsiasDetalles = biopsiasDetalles;
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
        hash += (diagnosticosBiopsiasPK != null ? diagnosticosBiopsiasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosBiopsias)) {
            return false;
        }
        DiagnosticosBiopsias other = (DiagnosticosBiopsias) object;
        if ((this.diagnosticosBiopsiasPK == null && other.diagnosticosBiopsiasPK != null) || (this.diagnosticosBiopsiasPK != null && !this.diagnosticosBiopsiasPK.equals(other.diagnosticosBiopsiasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DiagnosticosBiopsias[ diagnosticosBiopsiasPK=" + diagnosticosBiopsiasPK + " ]";
    }
    
}
