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
public class CargasFamiliaresPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMPROL_CODIGO")
    private int emprolCodigo;
    @Basic(optional = false)
    @Column(name = "EMPROL_EMP_CODIGO")
    private String emprolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private short numero;

    public CargasFamiliaresPK() {
    }

    public CargasFamiliaresPK(int emprolCodigo, String emprolEmpCodigo, short numero) {
        this.emprolCodigo = emprolCodigo;
        this.emprolEmpCodigo = emprolEmpCodigo;
        this.numero = numero;
    }

    public int getEmprolCodigo() {
        return emprolCodigo;
    }

    public void setEmprolCodigo(int emprolCodigo) {
        this.emprolCodigo = emprolCodigo;
    }

    public String getEmprolEmpCodigo() {
        return emprolEmpCodigo;
    }

    public void setEmprolEmpCodigo(String emprolEmpCodigo) {
        this.emprolEmpCodigo = emprolEmpCodigo;
    }

    public short getNumero() {
        return numero;
    }

    public void setNumero(short numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) emprolCodigo;
        hash += (emprolEmpCodigo != null ? emprolEmpCodigo.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargasFamiliaresPK)) {
            return false;
        }
        CargasFamiliaresPK other = (CargasFamiliaresPK) object;
        if (this.emprolCodigo != other.emprolCodigo) {
            return false;
        }
        if ((this.emprolEmpCodigo == null && other.emprolEmpCodigo != null) || (this.emprolEmpCodigo != null && !this.emprolEmpCodigo.equals(other.emprolEmpCodigo))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CargasFamiliaresPK[ emprolCodigo=" + emprolCodigo + ", emprolEmpCodigo=" + emprolEmpCodigo + ", numero=" + numero + " ]";
    }
    
}
