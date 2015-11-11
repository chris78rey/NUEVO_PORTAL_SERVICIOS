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
@Table(name = "COTRATANTES")
@NamedQueries({
    @NamedQuery(name = "Cotratantes.findAll", query = "SELECT c FROM Cotratantes c")})
public class Cotratantes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CotratantesPK cotratantesPK;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public Cotratantes() {
    }

    public Cotratantes(CotratantesPK cotratantesPK) {
        this.cotratantesPK = cotratantesPK;
    }

    public Cotratantes(int prmatnNumero, int prmatnPcnNumeroHc, String prsCodigo) {
        this.cotratantesPK = new CotratantesPK(prmatnNumero, prmatnPcnNumeroHc, prsCodigo);
    }

    public CotratantesPK getCotratantesPK() {
        return cotratantesPK;
    }

    public void setCotratantesPK(CotratantesPK cotratantesPK) {
        this.cotratantesPK = cotratantesPK;
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
        hash += (cotratantesPK != null ? cotratantesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotratantes)) {
            return false;
        }
        Cotratantes other = (Cotratantes) object;
        if ((this.cotratantesPK == null && other.cotratantesPK != null) || (this.cotratantesPK != null && !this.cotratantesPK.equals(other.cotratantesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Cotratantes[ cotratantesPK=" + cotratantesPK + " ]";
    }
    
}
