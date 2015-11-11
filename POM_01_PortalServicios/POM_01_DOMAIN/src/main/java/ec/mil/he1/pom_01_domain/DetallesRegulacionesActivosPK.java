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
public class DetallesRegulacionesActivosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RGLACTFJO_EMP_CODIGO")
    private String rglactfjoEmpCodigo;
    @Basic(optional = false)
    @Column(name = "RGLACTFJO_NUMERO")
    private int rglactfjoNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public DetallesRegulacionesActivosPK() {
    }

    public DetallesRegulacionesActivosPK(String rglactfjoEmpCodigo, int rglactfjoNumero, int numero) {
        this.rglactfjoEmpCodigo = rglactfjoEmpCodigo;
        this.rglactfjoNumero = rglactfjoNumero;
        this.numero = numero;
    }

    public String getRglactfjoEmpCodigo() {
        return rglactfjoEmpCodigo;
    }

    public void setRglactfjoEmpCodigo(String rglactfjoEmpCodigo) {
        this.rglactfjoEmpCodigo = rglactfjoEmpCodigo;
    }

    public int getRglactfjoNumero() {
        return rglactfjoNumero;
    }

    public void setRglactfjoNumero(int rglactfjoNumero) {
        this.rglactfjoNumero = rglactfjoNumero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rglactfjoEmpCodigo != null ? rglactfjoEmpCodigo.hashCode() : 0);
        hash += (int) rglactfjoNumero;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesRegulacionesActivosPK)) {
            return false;
        }
        DetallesRegulacionesActivosPK other = (DetallesRegulacionesActivosPK) object;
        if ((this.rglactfjoEmpCodigo == null && other.rglactfjoEmpCodigo != null) || (this.rglactfjoEmpCodigo != null && !this.rglactfjoEmpCodigo.equals(other.rglactfjoEmpCodigo))) {
            return false;
        }
        if (this.rglactfjoNumero != other.rglactfjoNumero) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesRegulacionesActivosPK[ rglactfjoEmpCodigo=" + rglactfjoEmpCodigo + ", rglactfjoNumero=" + rglactfjoNumero + ", numero=" + numero + " ]";
    }
    
}
