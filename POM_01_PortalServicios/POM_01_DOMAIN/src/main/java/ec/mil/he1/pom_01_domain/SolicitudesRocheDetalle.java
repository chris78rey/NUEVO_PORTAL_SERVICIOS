/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "SOLICITUDES_ROCHE_DETALLE")
@NamedQueries({
    @NamedQuery(name = "SolicitudesRocheDetalle.findAll", query = "SELECT s FROM SolicitudesRocheDetalle s")})
public class SolicitudesRocheDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SolicitudesRocheDetallePK solicitudesRocheDetallePK;

    public SolicitudesRocheDetalle() {
    }

    public SolicitudesRocheDetalle(SolicitudesRocheDetallePK solicitudesRocheDetallePK) {
        this.solicitudesRocheDetallePK = solicitudesRocheDetallePK;
    }

    public SolicitudesRocheDetalle(BigInteger idCab, BigInteger slcNumero, int exmNumero, BigInteger secuencial, int vrbexmCodigo) {
        this.solicitudesRocheDetallePK = new SolicitudesRocheDetallePK(idCab, slcNumero, exmNumero, secuencial, vrbexmCodigo);
    }

    public SolicitudesRocheDetallePK getSolicitudesRocheDetallePK() {
        return solicitudesRocheDetallePK;
    }

    public void setSolicitudesRocheDetallePK(SolicitudesRocheDetallePK solicitudesRocheDetallePK) {
        this.solicitudesRocheDetallePK = solicitudesRocheDetallePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (solicitudesRocheDetallePK != null ? solicitudesRocheDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudesRocheDetalle)) {
            return false;
        }
        SolicitudesRocheDetalle other = (SolicitudesRocheDetalle) object;
        if ((this.solicitudesRocheDetallePK == null && other.solicitudesRocheDetallePK != null) || (this.solicitudesRocheDetallePK != null && !this.solicitudesRocheDetallePK.equals(other.solicitudesRocheDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SolicitudesRocheDetalle[ solicitudesRocheDetallePK=" + solicitudesRocheDetallePK + " ]";
    }
    
}
