/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

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
@Table(name = "ESPECIALIDADES_PROCEDIMIENTOS")
@NamedQueries({
    @NamedQuery(name = "EspecialidadesProcedimientos.findAll", query = "SELECT e FROM EspecialidadesProcedimientos e")})
public class EspecialidadesProcedimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EspecialidadesProcedimientosPK especialidadesProcedimientosPK;
    @Column(name = "SERVICIO")
    private String servicio;

    public EspecialidadesProcedimientos() {
    }

    public EspecialidadesProcedimientos(EspecialidadesProcedimientosPK especialidadesProcedimientosPK) {
        this.especialidadesProcedimientosPK = especialidadesProcedimientosPK;
    }

    public EspecialidadesProcedimientos(String espCodigo, String prcCodigo) {
        this.especialidadesProcedimientosPK = new EspecialidadesProcedimientosPK(espCodigo, prcCodigo);
    }

    public EspecialidadesProcedimientosPK getEspecialidadesProcedimientosPK() {
        return especialidadesProcedimientosPK;
    }

    public void setEspecialidadesProcedimientosPK(EspecialidadesProcedimientosPK especialidadesProcedimientosPK) {
        this.especialidadesProcedimientosPK = especialidadesProcedimientosPK;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (especialidadesProcedimientosPK != null ? especialidadesProcedimientosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecialidadesProcedimientos)) {
            return false;
        }
        EspecialidadesProcedimientos other = (EspecialidadesProcedimientos) object;
        if ((this.especialidadesProcedimientosPK == null && other.especialidadesProcedimientosPK != null) || (this.especialidadesProcedimientosPK != null && !this.especialidadesProcedimientosPK.equals(other.especialidadesProcedimientosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EspecialidadesProcedimientos[ especialidadesProcedimientosPK=" + especialidadesProcedimientosPK + " ]";
    }
    
}
