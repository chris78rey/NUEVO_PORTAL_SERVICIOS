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
public class CuentasCostosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CST_CODIGO")
    private String cstCodigo;
    @Basic(optional = false)
    @Column(name = "CUENTA")
    private String cuenta;

    public CuentasCostosPK() {
    }

    public CuentasCostosPK(String cstCodigo, String cuenta) {
        this.cstCodigo = cstCodigo;
        this.cuenta = cuenta;
    }

    public String getCstCodigo() {
        return cstCodigo;
    }

    public void setCstCodigo(String cstCodigo) {
        this.cstCodigo = cstCodigo;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cstCodigo != null ? cstCodigo.hashCode() : 0);
        hash += (cuenta != null ? cuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasCostosPK)) {
            return false;
        }
        CuentasCostosPK other = (CuentasCostosPK) object;
        if ((this.cstCodigo == null && other.cstCodigo != null) || (this.cstCodigo != null && !this.cstCodigo.equals(other.cstCodigo))) {
            return false;
        }
        if ((this.cuenta == null && other.cuenta != null) || (this.cuenta != null && !this.cuenta.equals(other.cuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CuentasCostosPK[ cstCodigo=" + cstCodigo + ", cuenta=" + cuenta + " ]";
    }
    
}
