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
@Table(name = "ANTECEDENTES_FAMILIARES")
@NamedQueries({
    @NamedQuery(name = "AntecedentesFamiliares.findAll", query = "SELECT a FROM AntecedentesFamiliares a")})
public class AntecedentesFamiliares implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AntecedentesFamiliaresPK antecedentesFamiliaresPK;
    @Column(name = "PARENTEZCO")
    private String parentezco;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "EDAD")
    private Short edad;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumn(name = "ENF_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Enfermedades enfermedades;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "TPOANTFML_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposAntecedentesFamiliares tiposAntecedentesFamiliares;

    public AntecedentesFamiliares() {
    }

    public AntecedentesFamiliares(AntecedentesFamiliaresPK antecedentesFamiliaresPK) {
        this.antecedentesFamiliaresPK = antecedentesFamiliaresPK;
    }

    public AntecedentesFamiliares(int tpoantfmlId, Date fecha, int pcnNumeroHc) {
        this.antecedentesFamiliaresPK = new AntecedentesFamiliaresPK(tpoantfmlId, fecha, pcnNumeroHc);
    }

    public AntecedentesFamiliaresPK getAntecedentesFamiliaresPK() {
        return antecedentesFamiliaresPK;
    }

    public void setAntecedentesFamiliaresPK(AntecedentesFamiliaresPK antecedentesFamiliaresPK) {
        this.antecedentesFamiliaresPK = antecedentesFamiliaresPK;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Enfermedades getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(Enfermedades enfermedades) {
        this.enfermedades = enfermedades;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public TiposAntecedentesFamiliares getTiposAntecedentesFamiliares() {
        return tiposAntecedentesFamiliares;
    }

    public void setTiposAntecedentesFamiliares(TiposAntecedentesFamiliares tiposAntecedentesFamiliares) {
        this.tiposAntecedentesFamiliares = tiposAntecedentesFamiliares;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (antecedentesFamiliaresPK != null ? antecedentesFamiliaresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntecedentesFamiliares)) {
            return false;
        }
        AntecedentesFamiliares other = (AntecedentesFamiliares) object;
        if ((this.antecedentesFamiliaresPK == null && other.antecedentesFamiliaresPK != null) || (this.antecedentesFamiliaresPK != null && !this.antecedentesFamiliaresPK.equals(other.antecedentesFamiliaresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AntecedentesFamiliares[ antecedentesFamiliaresPK=" + antecedentesFamiliaresPK + " ]";
    }
    
}
