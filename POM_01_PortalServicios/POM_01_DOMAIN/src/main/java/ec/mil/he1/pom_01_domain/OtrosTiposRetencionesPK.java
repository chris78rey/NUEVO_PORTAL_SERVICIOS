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
public class OtrosTiposRetencionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RTNFNTSRI_EMP_CODIGO")
    private String rtnfntsriEmpCodigo;
    @Basic(optional = false)
    @Column(name = "RTNFNTSRI_ANIO")
    private short rtnfntsriAnio;
    @Basic(optional = false)
    @Column(name = "RTNFNTSRI_TIPO")
    private String rtnfntsriTipo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public OtrosTiposRetencionesPK() {
    }

    public OtrosTiposRetencionesPK(String rtnfntsriEmpCodigo, short rtnfntsriAnio, String rtnfntsriTipo, int numero) {
        this.rtnfntsriEmpCodigo = rtnfntsriEmpCodigo;
        this.rtnfntsriAnio = rtnfntsriAnio;
        this.rtnfntsriTipo = rtnfntsriTipo;
        this.numero = numero;
    }

    public String getRtnfntsriEmpCodigo() {
        return rtnfntsriEmpCodigo;
    }

    public void setRtnfntsriEmpCodigo(String rtnfntsriEmpCodigo) {
        this.rtnfntsriEmpCodigo = rtnfntsriEmpCodigo;
    }

    public short getRtnfntsriAnio() {
        return rtnfntsriAnio;
    }

    public void setRtnfntsriAnio(short rtnfntsriAnio) {
        this.rtnfntsriAnio = rtnfntsriAnio;
    }

    public String getRtnfntsriTipo() {
        return rtnfntsriTipo;
    }

    public void setRtnfntsriTipo(String rtnfntsriTipo) {
        this.rtnfntsriTipo = rtnfntsriTipo;
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
        hash += (rtnfntsriEmpCodigo != null ? rtnfntsriEmpCodigo.hashCode() : 0);
        hash += (int) rtnfntsriAnio;
        hash += (rtnfntsriTipo != null ? rtnfntsriTipo.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OtrosTiposRetencionesPK)) {
            return false;
        }
        OtrosTiposRetencionesPK other = (OtrosTiposRetencionesPK) object;
        if ((this.rtnfntsriEmpCodigo == null && other.rtnfntsriEmpCodigo != null) || (this.rtnfntsriEmpCodigo != null && !this.rtnfntsriEmpCodigo.equals(other.rtnfntsriEmpCodigo))) {
            return false;
        }
        if (this.rtnfntsriAnio != other.rtnfntsriAnio) {
            return false;
        }
        if ((this.rtnfntsriTipo == null && other.rtnfntsriTipo != null) || (this.rtnfntsriTipo != null && !this.rtnfntsriTipo.equals(other.rtnfntsriTipo))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.OtrosTiposRetencionesPK[ rtnfntsriEmpCodigo=" + rtnfntsriEmpCodigo + ", rtnfntsriAnio=" + rtnfntsriAnio + ", rtnfntsriTipo=" + rtnfntsriTipo + ", numero=" + numero + " ]";
    }
    
}
