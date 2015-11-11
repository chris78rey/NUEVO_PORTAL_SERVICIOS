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
@Table(name = "AGENTES")
@NamedQueries({
    @NamedQuery(name = "Agentes.findAll", query = "SELECT a FROM Agentes a")})
public class Agentes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgentesPK agentesPK;
    @Column(name = "AGENTE")
    private String agente;

    public Agentes() {
    }

    public Agentes(AgentesPK agentesPK) {
        this.agentesPK = agentesPK;
    }

    public Agentes(int prtoprslcPcnNumeroHc, int prtoprslcNumero, short fila) {
        this.agentesPK = new AgentesPK(prtoprslcPcnNumeroHc, prtoprslcNumero, fila);
    }

    public AgentesPK getAgentesPK() {
        return agentesPK;
    }

    public void setAgentesPK(AgentesPK agentesPK) {
        this.agentesPK = agentesPK;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agentesPK != null ? agentesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agentes)) {
            return false;
        }
        Agentes other = (Agentes) object;
        if ((this.agentesPK == null && other.agentesPK != null) || (this.agentesPK != null && !this.agentesPK.equals(other.agentesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Agentes[ agentesPK=" + agentesPK + " ]";
    }
    
}
