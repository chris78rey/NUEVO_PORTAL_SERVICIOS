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
public class DetallesIngresosActivosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "INGACTFJO_EMP_CODIGO")
    private String ingactfjoEmpCodigo;
    @Basic(optional = false)
    @Column(name = "INGACTFJO_NUMERO")
    private int ingactfjoNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public DetallesIngresosActivosPK() {
    }

    public DetallesIngresosActivosPK(String ingactfjoEmpCodigo, int ingactfjoNumero, int numero) {
        this.ingactfjoEmpCodigo = ingactfjoEmpCodigo;
        this.ingactfjoNumero = ingactfjoNumero;
        this.numero = numero;
    }

    public String getIngactfjoEmpCodigo() {
        return ingactfjoEmpCodigo;
    }

    public void setIngactfjoEmpCodigo(String ingactfjoEmpCodigo) {
        this.ingactfjoEmpCodigo = ingactfjoEmpCodigo;
    }

    public int getIngactfjoNumero() {
        return ingactfjoNumero;
    }

    public void setIngactfjoNumero(int ingactfjoNumero) {
        this.ingactfjoNumero = ingactfjoNumero;
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
        hash += (ingactfjoEmpCodigo != null ? ingactfjoEmpCodigo.hashCode() : 0);
        hash += (int) ingactfjoNumero;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesIngresosActivosPK)) {
            return false;
        }
        DetallesIngresosActivosPK other = (DetallesIngresosActivosPK) object;
        if ((this.ingactfjoEmpCodigo == null && other.ingactfjoEmpCodigo != null) || (this.ingactfjoEmpCodigo != null && !this.ingactfjoEmpCodigo.equals(other.ingactfjoEmpCodigo))) {
            return false;
        }
        if (this.ingactfjoNumero != other.ingactfjoNumero) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesIngresosActivosPK[ ingactfjoEmpCodigo=" + ingactfjoEmpCodigo + ", ingactfjoNumero=" + ingactfjoNumero + ", numero=" + numero + " ]";
    }
    
}
