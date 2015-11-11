/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

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
@Table(name = "DEPARTAMENTOS_SOLICITANTES")
@NamedQueries({
    @NamedQuery(name = "DepartamentosSolicitantes.findAll", query = "SELECT d FROM DepartamentosSolicitantes d")})
public class DepartamentosSolicitantes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DepartamentosSolicitantesPK departamentosSolicitantesPK;

    public DepartamentosSolicitantes() {
    }

    public DepartamentosSolicitantes(DepartamentosSolicitantesPK departamentosSolicitantesPK) {
        this.departamentosSolicitantesPK = departamentosSolicitantesPK;
    }

    public DepartamentosSolicitantes(String dprAraCodigo, String dprCodigo, String tpoexmId) {
        this.departamentosSolicitantesPK = new DepartamentosSolicitantesPK(dprAraCodigo, dprCodigo, tpoexmId);
    }

    public DepartamentosSolicitantesPK getDepartamentosSolicitantesPK() {
        return departamentosSolicitantesPK;
    }

    public void setDepartamentosSolicitantesPK(DepartamentosSolicitantesPK departamentosSolicitantesPK) {
        this.departamentosSolicitantesPK = departamentosSolicitantesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departamentosSolicitantesPK != null ? departamentosSolicitantesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentosSolicitantes)) {
            return false;
        }
        DepartamentosSolicitantes other = (DepartamentosSolicitantes) object;
        if ((this.departamentosSolicitantesPK == null && other.departamentosSolicitantesPK != null) || (this.departamentosSolicitantesPK != null && !this.departamentosSolicitantesPK.equals(other.departamentosSolicitantesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DepartamentosSolicitantes[ departamentosSolicitantesPK=" + departamentosSolicitantesPK + " ]";
    }
    
}
