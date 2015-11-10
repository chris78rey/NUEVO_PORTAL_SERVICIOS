/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
@Table(name = "ENFERMEDADES_BLOQUEADAS")
@NamedQueries({
    @NamedQuery(name = "EnfermedadesBloqueadas.findAll", query = "SELECT e FROM EnfermedadesBloqueadas e")})
public class EnfermedadesBloqueadas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EnfermedadesBloqueadasPK enfermedadesBloqueadasPK;

    public EnfermedadesBloqueadas() {
    }

    public EnfermedadesBloqueadas(EnfermedadesBloqueadasPK enfermedadesBloqueadasPK) {
        this.enfermedadesBloqueadasPK = enfermedadesBloqueadasPK;
    }

    public EnfermedadesBloqueadas(String codigo, String enfermedad) {
        this.enfermedadesBloqueadasPK = new EnfermedadesBloqueadasPK(codigo, enfermedad);
    }

    public EnfermedadesBloqueadasPK getEnfermedadesBloqueadasPK() {
        return enfermedadesBloqueadasPK;
    }

    public void setEnfermedadesBloqueadasPK(EnfermedadesBloqueadasPK enfermedadesBloqueadasPK) {
        this.enfermedadesBloqueadasPK = enfermedadesBloqueadasPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enfermedadesBloqueadasPK != null ? enfermedadesBloqueadasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnfermedadesBloqueadas)) {
            return false;
        }
        EnfermedadesBloqueadas other = (EnfermedadesBloqueadas) object;
        if ((this.enfermedadesBloqueadasPK == null && other.enfermedadesBloqueadasPK != null) || (this.enfermedadesBloqueadasPK != null && !this.enfermedadesBloqueadasPK.equals(other.enfermedadesBloqueadasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EnfermedadesBloqueadas[ enfermedadesBloqueadasPK=" + enfermedadesBloqueadasPK + " ]";
    }
    
}
