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
@Table(name = "DETALLES_GRP_PQT_EXC")
@NamedQueries({
    @NamedQuery(name = "DetallesGrpPqtExc.findAll", query = "SELECT d FROM DetallesGrpPqtExc d")})
public class DetallesGrpPqtExc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesGrpPqtExcPK detallesGrpPqtExcPK;
    @Column(name = "ANEXO")
    private String anexo;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;

    public DetallesGrpPqtExc() {
    }

    public DetallesGrpPqtExc(DetallesGrpPqtExcPK detallesGrpPqtExcPK) {
        this.detallesGrpPqtExcPK = detallesGrpPqtExcPK;
    }

    public DetallesGrpPqtExc(String gpexCnvConvenio, String gpexCodigo, String tipoItem, String tipo, String codigo) {
        this.detallesGrpPqtExcPK = new DetallesGrpPqtExcPK(gpexCnvConvenio, gpexCodigo, tipoItem, tipo, codigo);
    }

    public DetallesGrpPqtExcPK getDetallesGrpPqtExcPK() {
        return detallesGrpPqtExcPK;
    }

    public void setDetallesGrpPqtExcPK(DetallesGrpPqtExcPK detallesGrpPqtExcPK) {
        this.detallesGrpPqtExcPK = detallesGrpPqtExcPK;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesGrpPqtExcPK != null ? detallesGrpPqtExcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesGrpPqtExc)) {
            return false;
        }
        DetallesGrpPqtExc other = (DetallesGrpPqtExc) object;
        if ((this.detallesGrpPqtExcPK == null && other.detallesGrpPqtExcPK != null) || (this.detallesGrpPqtExcPK != null && !this.detallesGrpPqtExcPK.equals(other.detallesGrpPqtExcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesGrpPqtExc[ detallesGrpPqtExcPK=" + detallesGrpPqtExcPK + " ]";
    }
    
}
