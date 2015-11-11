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
@Table(name = "PROCEDIMIENTOS_ESPECIALIDAD")
@NamedQueries({
    @NamedQuery(name = "ProcedimientosEspecialidad.findAll", query = "SELECT p FROM ProcedimientosEspecialidad p")})
public class ProcedimientosEspecialidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProcedimientosEspecialidadPK procedimientosEspecialidadPK;

    public ProcedimientosEspecialidad() {
    }

    public ProcedimientosEspecialidad(ProcedimientosEspecialidadPK procedimientosEspecialidadPK) {
        this.procedimientosEspecialidadPK = procedimientosEspecialidadPK;
    }

    public ProcedimientosEspecialidad(String espCodigo, String prchspCodigo, String cnsprcCodigo) {
        this.procedimientosEspecialidadPK = new ProcedimientosEspecialidadPK(espCodigo, prchspCodigo, cnsprcCodigo);
    }

    public ProcedimientosEspecialidadPK getProcedimientosEspecialidadPK() {
        return procedimientosEspecialidadPK;
    }

    public void setProcedimientosEspecialidadPK(ProcedimientosEspecialidadPK procedimientosEspecialidadPK) {
        this.procedimientosEspecialidadPK = procedimientosEspecialidadPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procedimientosEspecialidadPK != null ? procedimientosEspecialidadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosEspecialidad)) {
            return false;
        }
        ProcedimientosEspecialidad other = (ProcedimientosEspecialidad) object;
        if ((this.procedimientosEspecialidadPK == null && other.procedimientosEspecialidadPK != null) || (this.procedimientosEspecialidadPK != null && !this.procedimientosEspecialidadPK.equals(other.procedimientosEspecialidadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ProcedimientosEspecialidad[ procedimientosEspecialidadPK=" + procedimientosEspecialidadPK + " ]";
    }
    
}
