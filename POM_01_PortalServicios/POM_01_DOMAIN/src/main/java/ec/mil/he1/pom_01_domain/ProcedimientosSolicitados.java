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
@Table(name = "PROCEDIMIENTOS_SOLICITADOS")
@NamedQueries({
    @NamedQuery(name = "ProcedimientosSolicitados.findAll", query = "SELECT p FROM ProcedimientosSolicitados p")})
public class ProcedimientosSolicitados implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProcedimientosSolicitadosPK procedimientosSolicitadosPK;
    @Column(name = "DESCRIPCION_ADICIONAL")
    private String descripcionAdicional;

    public ProcedimientosSolicitados() {
    }

    public ProcedimientosSolicitados(ProcedimientosSolicitadosPK procedimientosSolicitadosPK) {
        this.procedimientosSolicitadosPK = procedimientosSolicitadosPK;
    }

    public ProcedimientosSolicitados(int prtoprslcPcnNumeroHc, int prtoprslcNumero, String prchspCodigo) {
        this.procedimientosSolicitadosPK = new ProcedimientosSolicitadosPK(prtoprslcPcnNumeroHc, prtoprslcNumero, prchspCodigo);
    }

    public ProcedimientosSolicitadosPK getProcedimientosSolicitadosPK() {
        return procedimientosSolicitadosPK;
    }

    public void setProcedimientosSolicitadosPK(ProcedimientosSolicitadosPK procedimientosSolicitadosPK) {
        this.procedimientosSolicitadosPK = procedimientosSolicitadosPK;
    }

    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procedimientosSolicitadosPK != null ? procedimientosSolicitadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosSolicitados)) {
            return false;
        }
        ProcedimientosSolicitados other = (ProcedimientosSolicitados) object;
        if ((this.procedimientosSolicitadosPK == null && other.procedimientosSolicitadosPK != null) || (this.procedimientosSolicitadosPK != null && !this.procedimientosSolicitadosPK.equals(other.procedimientosSolicitadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ProcedimientosSolicitados[ procedimientosSolicitadosPK=" + procedimientosSolicitadosPK + " ]";
    }
    
}
