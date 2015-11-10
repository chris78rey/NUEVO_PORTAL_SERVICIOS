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
public class DetallesAsignacionesReingresPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ASGRINACT_EMP_CODIGO")
    private String asgrinactEmpCodigo;
    @Basic(optional = false)
    @Column(name = "ASGRINACT_TIPO_MOVIMIENTO")
    private String asgrinactTipoMovimiento;
    @Basic(optional = false)
    @Column(name = "ASGRINACT_NUMERO")
    private int asgrinactNumero;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public DetallesAsignacionesReingresPK() {
    }

    public DetallesAsignacionesReingresPK(String asgrinactEmpCodigo, String asgrinactTipoMovimiento, int asgrinactNumero, int numero) {
        this.asgrinactEmpCodigo = asgrinactEmpCodigo;
        this.asgrinactTipoMovimiento = asgrinactTipoMovimiento;
        this.asgrinactNumero = asgrinactNumero;
        this.numero = numero;
    }

    public String getAsgrinactEmpCodigo() {
        return asgrinactEmpCodigo;
    }

    public void setAsgrinactEmpCodigo(String asgrinactEmpCodigo) {
        this.asgrinactEmpCodigo = asgrinactEmpCodigo;
    }

    public String getAsgrinactTipoMovimiento() {
        return asgrinactTipoMovimiento;
    }

    public void setAsgrinactTipoMovimiento(String asgrinactTipoMovimiento) {
        this.asgrinactTipoMovimiento = asgrinactTipoMovimiento;
    }

    public int getAsgrinactNumero() {
        return asgrinactNumero;
    }

    public void setAsgrinactNumero(int asgrinactNumero) {
        this.asgrinactNumero = asgrinactNumero;
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
        hash += (asgrinactEmpCodigo != null ? asgrinactEmpCodigo.hashCode() : 0);
        hash += (asgrinactTipoMovimiento != null ? asgrinactTipoMovimiento.hashCode() : 0);
        hash += (int) asgrinactNumero;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesAsignacionesReingresPK)) {
            return false;
        }
        DetallesAsignacionesReingresPK other = (DetallesAsignacionesReingresPK) object;
        if ((this.asgrinactEmpCodigo == null && other.asgrinactEmpCodigo != null) || (this.asgrinactEmpCodigo != null && !this.asgrinactEmpCodigo.equals(other.asgrinactEmpCodigo))) {
            return false;
        }
        if ((this.asgrinactTipoMovimiento == null && other.asgrinactTipoMovimiento != null) || (this.asgrinactTipoMovimiento != null && !this.asgrinactTipoMovimiento.equals(other.asgrinactTipoMovimiento))) {
            return false;
        }
        if (this.asgrinactNumero != other.asgrinactNumero) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesAsignacionesReingresPK[ asgrinactEmpCodigo=" + asgrinactEmpCodigo + ", asgrinactTipoMovimiento=" + asgrinactTipoMovimiento + ", asgrinactNumero=" + asgrinactNumero + ", numero=" + numero + " ]";
    }
    
}
