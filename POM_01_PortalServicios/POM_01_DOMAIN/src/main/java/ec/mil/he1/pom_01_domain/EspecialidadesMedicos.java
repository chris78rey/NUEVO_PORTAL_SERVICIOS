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
@Table(name = "ESPECIALIDADES_MEDICOS")
@NamedQueries({
    @NamedQuery(name = "EspecialidadesMedicos.findAll", query = "SELECT e FROM EspecialidadesMedicos e")})
public class EspecialidadesMedicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EspecialidadesMedicosPK especialidadesMedicosPK;

    public EspecialidadesMedicos() {
    }

    public EspecialidadesMedicos(EspecialidadesMedicosPK especialidadesMedicosPK) {
        this.especialidadesMedicosPK = especialidadesMedicosPK;
    }

    public EspecialidadesMedicos(String espCodigo, String prsCodigo) {
        this.especialidadesMedicosPK = new EspecialidadesMedicosPK(espCodigo, prsCodigo);
    }

    public EspecialidadesMedicosPK getEspecialidadesMedicosPK() {
        return especialidadesMedicosPK;
    }

    public void setEspecialidadesMedicosPK(EspecialidadesMedicosPK especialidadesMedicosPK) {
        this.especialidadesMedicosPK = especialidadesMedicosPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (especialidadesMedicosPK != null ? especialidadesMedicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecialidadesMedicos)) {
            return false;
        }
        EspecialidadesMedicos other = (EspecialidadesMedicos) object;
        if ((this.especialidadesMedicosPK == null && other.especialidadesMedicosPK != null) || (this.especialidadesMedicosPK != null && !this.especialidadesMedicosPK.equals(other.especialidadesMedicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EspecialidadesMedicos[ especialidadesMedicosPK=" + especialidadesMedicosPK + " ]";
    }
    
}
