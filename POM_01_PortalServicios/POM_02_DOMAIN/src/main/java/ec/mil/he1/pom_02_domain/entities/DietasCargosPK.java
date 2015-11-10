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
public class DietasCargosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TIPO_PEDIDO")
    private String tipoPedido;
    @Basic(optional = false)
    @Column(name = "TIPO_DIETA")
    private String tipoDieta;

    public DietasCargosPK() {
    }

    public DietasCargosPK(String tipoPedido, String tipoDieta) {
        this.tipoPedido = tipoPedido;
        this.tipoDieta = tipoDieta;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getTipoDieta() {
        return tipoDieta;
    }

    public void setTipoDieta(String tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoPedido != null ? tipoPedido.hashCode() : 0);
        hash += (tipoDieta != null ? tipoDieta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DietasCargosPK)) {
            return false;
        }
        DietasCargosPK other = (DietasCargosPK) object;
        if ((this.tipoPedido == null && other.tipoPedido != null) || (this.tipoPedido != null && !this.tipoPedido.equals(other.tipoPedido))) {
            return false;
        }
        if ((this.tipoDieta == null && other.tipoDieta != null) || (this.tipoDieta != null && !this.tipoDieta.equals(other.tipoDieta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DietasCargosPK[ tipoPedido=" + tipoPedido + ", tipoDieta=" + tipoDieta + " ]";
    }
    
}
