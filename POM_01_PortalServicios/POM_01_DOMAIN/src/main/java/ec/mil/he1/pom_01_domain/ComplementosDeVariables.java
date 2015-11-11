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
@Table(name = "COMPLEMENTOS_DE_VARIABLES")
@NamedQueries({
    @NamedQuery(name = "ComplementosDeVariables.findAll", query = "SELECT c FROM ComplementosDeVariables c")})
public class ComplementosDeVariables implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComplementosDeVariablesPK complementosDeVariablesPK;

    public ComplementosDeVariables() {
    }

    public ComplementosDeVariables(ComplementosDeVariablesPK complementosDeVariablesPK) {
        this.complementosDeVariablesPK = complementosDeVariablesPK;
    }

    public ComplementosDeVariables(int cmplmtCodigo, int vrbexmCodigo) {
        this.complementosDeVariablesPK = new ComplementosDeVariablesPK(cmplmtCodigo, vrbexmCodigo);
    }

    public ComplementosDeVariablesPK getComplementosDeVariablesPK() {
        return complementosDeVariablesPK;
    }

    public void setComplementosDeVariablesPK(ComplementosDeVariablesPK complementosDeVariablesPK) {
        this.complementosDeVariablesPK = complementosDeVariablesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complementosDeVariablesPK != null ? complementosDeVariablesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplementosDeVariables)) {
            return false;
        }
        ComplementosDeVariables other = (ComplementosDeVariables) object;
        if ((this.complementosDeVariablesPK == null && other.complementosDeVariablesPK != null) || (this.complementosDeVariablesPK != null && !this.complementosDeVariablesPK.equals(other.complementosDeVariablesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComplementosDeVariables[ complementosDeVariablesPK=" + complementosDeVariablesPK + " ]";
    }
    
}
