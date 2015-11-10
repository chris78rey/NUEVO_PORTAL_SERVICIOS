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
@Table(name = "DTL_GRPPQT_EXC_SBB")
@NamedQueries({
    @NamedQuery(name = "DtlGrppqtExcSbb.findAll", query = "SELECT d FROM DtlGrppqtExcSbb d")})
public class DtlGrppqtExcSbb implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DtlGrppqtExcSbbPK dtlGrppqtExcSbbPK;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;

    public DtlGrppqtExcSbb() {
    }

    public DtlGrppqtExcSbb(DtlGrppqtExcSbbPK dtlGrppqtExcSbbPK) {
        this.dtlGrppqtExcSbbPK = dtlGrppqtExcSbbPK;
    }

    public DtlGrppqtExcSbb(String gpexCnvConvenio, String gpexCodigo, String sbsCodigo, String sbsSccCodigo) {
        this.dtlGrppqtExcSbbPK = new DtlGrppqtExcSbbPK(gpexCnvConvenio, gpexCodigo, sbsCodigo, sbsSccCodigo);
    }

    public DtlGrppqtExcSbbPK getDtlGrppqtExcSbbPK() {
        return dtlGrppqtExcSbbPK;
    }

    public void setDtlGrppqtExcSbbPK(DtlGrppqtExcSbbPK dtlGrppqtExcSbbPK) {
        this.dtlGrppqtExcSbbPK = dtlGrppqtExcSbbPK;
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
        hash += (dtlGrppqtExcSbbPK != null ? dtlGrppqtExcSbbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DtlGrppqtExcSbb)) {
            return false;
        }
        DtlGrppqtExcSbb other = (DtlGrppqtExcSbb) object;
        if ((this.dtlGrppqtExcSbbPK == null && other.dtlGrppqtExcSbbPK != null) || (this.dtlGrppqtExcSbbPK != null && !this.dtlGrppqtExcSbbPK.equals(other.dtlGrppqtExcSbbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DtlGrppqtExcSbb[ dtlGrppqtExcSbbPK=" + dtlGrppqtExcSbbPK + " ]";
    }
    
}
