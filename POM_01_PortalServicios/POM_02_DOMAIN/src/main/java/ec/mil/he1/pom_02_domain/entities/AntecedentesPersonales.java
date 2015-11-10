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
@Table(name = "ANTECEDENTES_PERSONALES")
@NamedQueries({
    @NamedQuery(name = "AntecedentesPersonales.findAll", query = "SELECT a FROM AntecedentesPersonales a")})
public class AntecedentesPersonales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AntecedentesPersonalesPK antecedentesPersonalesPK;
    @Column(name = "CONDICION")
    private String condicion;
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
    @JoinColumn(name = "TPOANTPRS_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposAntecedentesPersonales tiposAntecedentesPersonales;

    public AntecedentesPersonales() {
    }

    public AntecedentesPersonales(AntecedentesPersonalesPK antecedentesPersonalesPK) {
        this.antecedentesPersonalesPK = antecedentesPersonalesPK;
    }

    public AntecedentesPersonales(int pcnNumeroHc, int tpoantprsId, Date fecha) {
        this.antecedentesPersonalesPK = new AntecedentesPersonalesPK(pcnNumeroHc, tpoantprsId, fecha);
    }

    public AntecedentesPersonalesPK getAntecedentesPersonalesPK() {
        return antecedentesPersonalesPK;
    }

    public void setAntecedentesPersonalesPK(AntecedentesPersonalesPK antecedentesPersonalesPK) {
        this.antecedentesPersonalesPK = antecedentesPersonalesPK;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
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

    public TiposAntecedentesPersonales getTiposAntecedentesPersonales() {
        return tiposAntecedentesPersonales;
    }

    public void setTiposAntecedentesPersonales(TiposAntecedentesPersonales tiposAntecedentesPersonales) {
        this.tiposAntecedentesPersonales = tiposAntecedentesPersonales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (antecedentesPersonalesPK != null ? antecedentesPersonalesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntecedentesPersonales)) {
            return false;
        }
        AntecedentesPersonales other = (AntecedentesPersonales) object;
        if ((this.antecedentesPersonalesPK == null && other.antecedentesPersonalesPK != null) || (this.antecedentesPersonalesPK != null && !this.antecedentesPersonalesPK.equals(other.antecedentesPersonalesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AntecedentesPersonales[ antecedentesPersonalesPK=" + antecedentesPersonalesPK + " ]";
    }
    
}
