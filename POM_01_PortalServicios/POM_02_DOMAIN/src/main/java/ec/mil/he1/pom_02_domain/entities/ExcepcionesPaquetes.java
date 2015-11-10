/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "EXCEPCIONES_PAQUETES")
@NamedQueries({
    @NamedQuery(name = "ExcepcionesPaquetes.findAll", query = "SELECT e FROM ExcepcionesPaquetes e")})
public class ExcepcionesPaquetes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExcepcionesPaquetesPK excepcionesPaquetesPK;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;
    @JoinColumn(name = "GPEX_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GruposPaquetesExcepciones gruposPaquetesExcepciones;
    @JoinColumns({
        @JoinColumn(name = "PQT_CNV_CONVENIO", referencedColumnName = "CNV_CONVENIO", insertable = false, updatable = false),
        @JoinColumn(name = "PQT_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "PQT_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paquetes paquetes;

    public ExcepcionesPaquetes() {
    }

    public ExcepcionesPaquetes(ExcepcionesPaquetesPK excepcionesPaquetesPK) {
        this.excepcionesPaquetesPK = excepcionesPaquetesPK;
    }

    public ExcepcionesPaquetes(String pqtCnvConvenio, String pqtTipo, String pqtCodigo, String gpexCodigo) {
        this.excepcionesPaquetesPK = new ExcepcionesPaquetesPK(pqtCnvConvenio, pqtTipo, pqtCodigo, gpexCodigo);
    }

    public ExcepcionesPaquetesPK getExcepcionesPaquetesPK() {
        return excepcionesPaquetesPK;
    }

    public void setExcepcionesPaquetesPK(ExcepcionesPaquetesPK excepcionesPaquetesPK) {
        this.excepcionesPaquetesPK = excepcionesPaquetesPK;
    }

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public GruposPaquetesExcepciones getGruposPaquetesExcepciones() {
        return gruposPaquetesExcepciones;
    }

    public void setGruposPaquetesExcepciones(GruposPaquetesExcepciones gruposPaquetesExcepciones) {
        this.gruposPaquetesExcepciones = gruposPaquetesExcepciones;
    }

    public Paquetes getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(Paquetes paquetes) {
        this.paquetes = paquetes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (excepcionesPaquetesPK != null ? excepcionesPaquetesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcepcionesPaquetes)) {
            return false;
        }
        ExcepcionesPaquetes other = (ExcepcionesPaquetes) object;
        if ((this.excepcionesPaquetesPK == null && other.excepcionesPaquetesPK != null) || (this.excepcionesPaquetesPK != null && !this.excepcionesPaquetesPK.equals(other.excepcionesPaquetesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ExcepcionesPaquetes[ excepcionesPaquetesPK=" + excepcionesPaquetesPK + " ]";
    }
    
}
