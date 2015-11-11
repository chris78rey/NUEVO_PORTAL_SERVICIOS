/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class EgresosEconomicosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FCHSCL_NUMERO")
    private int fchsclNumero;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public EgresosEconomicosPK() {
    }

    public EgresosEconomicosPK(int fchsclNumero, String descripcion) {
        this.fchsclNumero = fchsclNumero;
        this.descripcion = descripcion;
    }

    public int getFchsclNumero() {
        return fchsclNumero;
    }

    public void setFchsclNumero(int fchsclNumero) {
        this.fchsclNumero = fchsclNumero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fchsclNumero;
        hash += (descripcion != null ? descripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresosEconomicosPK)) {
            return false;
        }
        EgresosEconomicosPK other = (EgresosEconomicosPK) object;
        if (this.fchsclNumero != other.fchsclNumero) {
            return false;
        }
        if ((this.descripcion == null && other.descripcion != null) || (this.descripcion != null && !this.descripcion.equals(other.descripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EgresosEconomicosPK[ fchsclNumero=" + fchsclNumero + ", descripcion=" + descripcion + " ]";
    }
    
}
