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
@Table(name = "DETALLES_TRANSFUSION_FINALES")
@NamedQueries({
    @NamedQuery(name = "DetallesTransfusionFinales.findAll", query = "SELECT d FROM DetallesTransfusionFinales d")})
public class DetallesTransfusionFinales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesTransfusionFinalesPK detallesTransfusionFinalesPK;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "GARANTIA")
    private String garantia;

    public DetallesTransfusionFinales() {
    }

    public DetallesTransfusionFinales(DetallesTransfusionFinalesPK detallesTransfusionFinalesPK) {
        this.detallesTransfusionFinalesPK = detallesTransfusionFinalesPK;
    }

    public DetallesTransfusionFinales(String frcUndNumero, String frcNumeroFraccion, int trsNumero) {
        this.detallesTransfusionFinalesPK = new DetallesTransfusionFinalesPK(frcUndNumero, frcNumeroFraccion, trsNumero);
    }

    public DetallesTransfusionFinalesPK getDetallesTransfusionFinalesPK() {
        return detallesTransfusionFinalesPK;
    }

    public void setDetallesTransfusionFinalesPK(DetallesTransfusionFinalesPK detallesTransfusionFinalesPK) {
        this.detallesTransfusionFinalesPK = detallesTransfusionFinalesPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesTransfusionFinalesPK != null ? detallesTransfusionFinalesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesTransfusionFinales)) {
            return false;
        }
        DetallesTransfusionFinales other = (DetallesTransfusionFinales) object;
        if ((this.detallesTransfusionFinalesPK == null && other.detallesTransfusionFinalesPK != null) || (this.detallesTransfusionFinalesPK != null && !this.detallesTransfusionFinalesPK.equals(other.detallesTransfusionFinalesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesTransfusionFinales[ detallesTransfusionFinalesPK=" + detallesTransfusionFinalesPK + " ]";
    }
    
}
