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
@Table(name = "PROCEDIMIENTOS_VARIABLES")
@NamedQueries({
    @NamedQuery(name = "ProcedimientosVariables.findAll", query = "SELECT p FROM ProcedimientosVariables p")})
public class ProcedimientosVariables implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProcedimientosVariablesPK procedimientosVariablesPK;

    public ProcedimientosVariables() {
    }

    public ProcedimientosVariables(ProcedimientosVariablesPK procedimientosVariablesPK) {
        this.procedimientosVariablesPK = procedimientosVariablesPK;
    }

    public ProcedimientosVariables(String prchspCodigo, int vrbexmCodigo) {
        this.procedimientosVariablesPK = new ProcedimientosVariablesPK(prchspCodigo, vrbexmCodigo);
    }

    public ProcedimientosVariablesPK getProcedimientosVariablesPK() {
        return procedimientosVariablesPK;
    }

    public void setProcedimientosVariablesPK(ProcedimientosVariablesPK procedimientosVariablesPK) {
        this.procedimientosVariablesPK = procedimientosVariablesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procedimientosVariablesPK != null ? procedimientosVariablesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosVariables)) {
            return false;
        }
        ProcedimientosVariables other = (ProcedimientosVariables) object;
        if ((this.procedimientosVariablesPK == null && other.procedimientosVariablesPK != null) || (this.procedimientosVariablesPK != null && !this.procedimientosVariablesPK.equals(other.procedimientosVariablesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ProcedimientosVariables[ procedimientosVariablesPK=" + procedimientosVariablesPK + " ]";
    }
    
}
