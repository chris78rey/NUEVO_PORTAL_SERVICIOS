/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PAQUETES")
@NamedQueries({
    @NamedQuery(name = "Paquetes.findAll", query = "SELECT p FROM Paquetes p")})
public class Paquetes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaquetesPK paquetesPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paquetes", fetch = FetchType.LAZY)
    private List<DetallesPaquetes> detallesPaquetesList;
    @JoinColumn(name = "CNV_CONVENIO", referencedColumnName = "CONVENIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Convenios convenios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paquetes", fetch = FetchType.LAZY)
    private List<ExcepcionesPaquetes> excepcionesPaquetesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paquetes", fetch = FetchType.LAZY)
    private List<DiagnosticosPaquetes> diagnosticosPaquetesList;

    public Paquetes() {
    }

    public Paquetes(PaquetesPK paquetesPK) {
        this.paquetesPK = paquetesPK;
    }

    public Paquetes(String cnvConvenio, String tipo, String codigo) {
        this.paquetesPK = new PaquetesPK(cnvConvenio, tipo, codigo);
    }

    public PaquetesPK getPaquetesPK() {
        return paquetesPK;
    }

    public void setPaquetesPK(PaquetesPK paquetesPK) {
        this.paquetesPK = paquetesPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public List<DetallesPaquetes> getDetallesPaquetesList() {
        return detallesPaquetesList;
    }

    public void setDetallesPaquetesList(List<DetallesPaquetes> detallesPaquetesList) {
        this.detallesPaquetesList = detallesPaquetesList;
    }

    public Convenios getConvenios() {
        return convenios;
    }

    public void setConvenios(Convenios convenios) {
        this.convenios = convenios;
    }

    public List<ExcepcionesPaquetes> getExcepcionesPaquetesList() {
        return excepcionesPaquetesList;
    }

    public void setExcepcionesPaquetesList(List<ExcepcionesPaquetes> excepcionesPaquetesList) {
        this.excepcionesPaquetesList = excepcionesPaquetesList;
    }

    public List<DiagnosticosPaquetes> getDiagnosticosPaquetesList() {
        return diagnosticosPaquetesList;
    }

    public void setDiagnosticosPaquetesList(List<DiagnosticosPaquetes> diagnosticosPaquetesList) {
        this.diagnosticosPaquetesList = diagnosticosPaquetesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paquetesPK != null ? paquetesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paquetes)) {
            return false;
        }
        Paquetes other = (Paquetes) object;
        if ((this.paquetesPK == null && other.paquetesPK != null) || (this.paquetesPK != null && !this.paquetesPK.equals(other.paquetesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Paquetes[ paquetesPK=" + paquetesPK + " ]";
    }
    
}
