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
@Table(name = "EQUIVALENCIAS_CLASIFICADORES")
@NamedQueries({
    @NamedQuery(name = "EquivalenciasClasificadores.findAll", query = "SELECT e FROM EquivalenciasClasificadores e")})
public class EquivalenciasClasificadores implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EquivalenciasClasificadoresPK equivalenciasClasificadoresPK;
    @Column(name = "COMPLEJIDAD")
    private String complejidad;

    public EquivalenciasClasificadores() {
    }

    public EquivalenciasClasificadores(EquivalenciasClasificadoresPK equivalenciasClasificadoresPK) {
        this.equivalenciasClasificadoresPK = equivalenciasClasificadoresPK;
    }

    public EquivalenciasClasificadores(String clsfCodigo, String cnvtrfConvenio, String cnvtrfCodigo, String tipo) {
        this.equivalenciasClasificadoresPK = new EquivalenciasClasificadoresPK(clsfCodigo, cnvtrfConvenio, cnvtrfCodigo, tipo);
    }

    public EquivalenciasClasificadoresPK getEquivalenciasClasificadoresPK() {
        return equivalenciasClasificadoresPK;
    }

    public void setEquivalenciasClasificadoresPK(EquivalenciasClasificadoresPK equivalenciasClasificadoresPK) {
        this.equivalenciasClasificadoresPK = equivalenciasClasificadoresPK;
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equivalenciasClasificadoresPK != null ? equivalenciasClasificadoresPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquivalenciasClasificadores)) {
            return false;
        }
        EquivalenciasClasificadores other = (EquivalenciasClasificadores) object;
        if ((this.equivalenciasClasificadoresPK == null && other.equivalenciasClasificadoresPK != null) || (this.equivalenciasClasificadoresPK != null && !this.equivalenciasClasificadoresPK.equals(other.equivalenciasClasificadoresPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EquivalenciasClasificadores[ equivalenciasClasificadoresPK=" + equivalenciasClasificadoresPK + " ]";
    }
    
}
