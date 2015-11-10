/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class DetallesPlanillaPrefactPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CNTS_DOCUMENTO")
    private String cntsDocumento;
    @Basic(optional = false)
    @Column(name = "CNTS_DETALLE")
    private int cntsDetalle;
    @Basic(optional = false)
    @Column(name = "CNTS_NUMERO")
    private long cntsNumero;
    @Basic(optional = false)
    @Column(name = "PLA_NUMERO_PLANILLA")
    private int plaNumeroPlanilla;

    public DetallesPlanillaPrefactPK() {
    }

    public DetallesPlanillaPrefactPK(String cntsDocumento, int cntsDetalle, long cntsNumero, int plaNumeroPlanilla) {
        this.cntsDocumento = cntsDocumento;
        this.cntsDetalle = cntsDetalle;
        this.cntsNumero = cntsNumero;
        this.plaNumeroPlanilla = plaNumeroPlanilla;
    }

    public String getCntsDocumento() {
        return cntsDocumento;
    }

    public void setCntsDocumento(String cntsDocumento) {
        this.cntsDocumento = cntsDocumento;
    }

    public int getCntsDetalle() {
        return cntsDetalle;
    }

    public void setCntsDetalle(int cntsDetalle) {
        this.cntsDetalle = cntsDetalle;
    }

    public long getCntsNumero() {
        return cntsNumero;
    }

    public void setCntsNumero(long cntsNumero) {
        this.cntsNumero = cntsNumero;
    }

    public int getPlaNumeroPlanilla() {
        return plaNumeroPlanilla;
    }

    public void setPlaNumeroPlanilla(int plaNumeroPlanilla) {
        this.plaNumeroPlanilla = plaNumeroPlanilla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntsDocumento != null ? cntsDocumento.hashCode() : 0);
        hash += (int) cntsDetalle;
        hash += (int) cntsNumero;
        hash += (int) plaNumeroPlanilla;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPlanillaPrefactPK)) {
            return false;
        }
        DetallesPlanillaPrefactPK other = (DetallesPlanillaPrefactPK) object;
        if ((this.cntsDocumento == null && other.cntsDocumento != null) || (this.cntsDocumento != null && !this.cntsDocumento.equals(other.cntsDocumento))) {
            return false;
        }
        if (this.cntsDetalle != other.cntsDetalle) {
            return false;
        }
        if (this.cntsNumero != other.cntsNumero) {
            return false;
        }
        if (this.plaNumeroPlanilla != other.plaNumeroPlanilla) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesPlanillaPrefactPK[ cntsDocumento=" + cntsDocumento + ", cntsDetalle=" + cntsDetalle + ", cntsNumero=" + cntsNumero + ", plaNumeroPlanilla=" + plaNumeroPlanilla + " ]";
    }
    
}
