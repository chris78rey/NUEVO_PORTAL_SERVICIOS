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
public class DetallesEgresosActivosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EGRACTFJO_EMP_CODIGO")
    private String egractfjoEmpCodigo;
    @Basic(optional = false)
    @Column(name = "EGRACTFJO_NUMERO")
    private int egractfjoNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public DetallesEgresosActivosPK() {
    }

    public DetallesEgresosActivosPK(String egractfjoEmpCodigo, int egractfjoNumero, int numero) {
        this.egractfjoEmpCodigo = egractfjoEmpCodigo;
        this.egractfjoNumero = egractfjoNumero;
        this.numero = numero;
    }

    public String getEgractfjoEmpCodigo() {
        return egractfjoEmpCodigo;
    }

    public void setEgractfjoEmpCodigo(String egractfjoEmpCodigo) {
        this.egractfjoEmpCodigo = egractfjoEmpCodigo;
    }

    public int getEgractfjoNumero() {
        return egractfjoNumero;
    }

    public void setEgractfjoNumero(int egractfjoNumero) {
        this.egractfjoNumero = egractfjoNumero;
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
        hash += (egractfjoEmpCodigo != null ? egractfjoEmpCodigo.hashCode() : 0);
        hash += (int) egractfjoNumero;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesEgresosActivosPK)) {
            return false;
        }
        DetallesEgresosActivosPK other = (DetallesEgresosActivosPK) object;
        if ((this.egractfjoEmpCodigo == null && other.egractfjoEmpCodigo != null) || (this.egractfjoEmpCodigo != null && !this.egractfjoEmpCodigo.equals(other.egractfjoEmpCodigo))) {
            return false;
        }
        if (this.egractfjoNumero != other.egractfjoNumero) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesEgresosActivosPK[ egractfjoEmpCodigo=" + egractfjoEmpCodigo + ", egractfjoNumero=" + egractfjoNumero + ", numero=" + numero + " ]";
    }
    
}
