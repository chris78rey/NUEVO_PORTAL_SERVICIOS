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
public class RetencionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;
    @Basic(optional = false)
    @Column(name = "TPORTNEMP_EMP_CODIGO")
    private String tportnempEmpCodigo;
    @Basic(optional = false)
    @Column(name = "TPORTNEMP_TPORTN_CODIGO")
    private short tportnempTportnCodigo;

    public RetencionesPK() {
    }

    public RetencionesPK(int numero, String tportnempEmpCodigo, short tportnempTportnCodigo) {
        this.numero = numero;
        this.tportnempEmpCodigo = tportnempEmpCodigo;
        this.tportnempTportnCodigo = tportnempTportnCodigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTportnempEmpCodigo() {
        return tportnempEmpCodigo;
    }

    public void setTportnempEmpCodigo(String tportnempEmpCodigo) {
        this.tportnempEmpCodigo = tportnempEmpCodigo;
    }

    public short getTportnempTportnCodigo() {
        return tportnempTportnCodigo;
    }

    public void setTportnempTportnCodigo(short tportnempTportnCodigo) {
        this.tportnempTportnCodigo = tportnempTportnCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numero;
        hash += (tportnempEmpCodigo != null ? tportnempEmpCodigo.hashCode() : 0);
        hash += (int) tportnempTportnCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesPK)) {
            return false;
        }
        RetencionesPK other = (RetencionesPK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.tportnempEmpCodigo == null && other.tportnempEmpCodigo != null) || (this.tportnempEmpCodigo != null && !this.tportnempEmpCodigo.equals(other.tportnempEmpCodigo))) {
            return false;
        }
        if (this.tportnempTportnCodigo != other.tportnempTportnCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RetencionesPK[ numero=" + numero + ", tportnempEmpCodigo=" + tportnempEmpCodigo + ", tportnempTportnCodigo=" + tportnempTportnCodigo + " ]";
    }
    
}
