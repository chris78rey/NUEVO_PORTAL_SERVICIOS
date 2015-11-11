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
@Table(name = "PROCEDIMIENTOS_TARIFARIOS")
@NamedQueries({
    @NamedQuery(name = "ProcedimientosTarifarios.findAll", query = "SELECT p FROM ProcedimientosTarifarios p")})
public class ProcedimientosTarifarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProcedimientosTarifariosPK procedimientosTarifariosPK;

    public ProcedimientosTarifarios() {
    }

    public ProcedimientosTarifarios(ProcedimientosTarifariosPK procedimientosTarifariosPK) {
        this.procedimientosTarifariosPK = procedimientosTarifariosPK;
    }

    public ProcedimientosTarifarios(String trfTipo, String trfCodigoItem, String trfConvenio, String prchspCodigo) {
        this.procedimientosTarifariosPK = new ProcedimientosTarifariosPK(trfTipo, trfCodigoItem, trfConvenio, prchspCodigo);
    }

    public ProcedimientosTarifariosPK getProcedimientosTarifariosPK() {
        return procedimientosTarifariosPK;
    }

    public void setProcedimientosTarifariosPK(ProcedimientosTarifariosPK procedimientosTarifariosPK) {
        this.procedimientosTarifariosPK = procedimientosTarifariosPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procedimientosTarifariosPK != null ? procedimientosTarifariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosTarifarios)) {
            return false;
        }
        ProcedimientosTarifarios other = (ProcedimientosTarifarios) object;
        if ((this.procedimientosTarifariosPK == null && other.procedimientosTarifariosPK != null) || (this.procedimientosTarifariosPK != null && !this.procedimientosTarifariosPK.equals(other.procedimientosTarifariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ProcedimientosTarifarios[ procedimientosTarifariosPK=" + procedimientosTarifariosPK + " ]";
    }
    
}
