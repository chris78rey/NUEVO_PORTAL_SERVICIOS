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
public class DetallesDepreciacionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DPRACF_EMP_CODIGO")
    private String dpracfEmpCodigo;
    @Basic(optional = false)
    @Column(name = "DPRACF_ANIO")
    private short dpracfAnio;
    @Basic(optional = false)
    @Column(name = "DPRACF_MES")
    private short dpracfMes;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public DetallesDepreciacionesPK() {
    }

    public DetallesDepreciacionesPK(String dpracfEmpCodigo, short dpracfAnio, short dpracfMes, int numero) {
        this.dpracfEmpCodigo = dpracfEmpCodigo;
        this.dpracfAnio = dpracfAnio;
        this.dpracfMes = dpracfMes;
        this.numero = numero;
    }

    public String getDpracfEmpCodigo() {
        return dpracfEmpCodigo;
    }

    public void setDpracfEmpCodigo(String dpracfEmpCodigo) {
        this.dpracfEmpCodigo = dpracfEmpCodigo;
    }

    public short getDpracfAnio() {
        return dpracfAnio;
    }

    public void setDpracfAnio(short dpracfAnio) {
        this.dpracfAnio = dpracfAnio;
    }

    public short getDpracfMes() {
        return dpracfMes;
    }

    public void setDpracfMes(short dpracfMes) {
        this.dpracfMes = dpracfMes;
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
        hash += (dpracfEmpCodigo != null ? dpracfEmpCodigo.hashCode() : 0);
        hash += (int) dpracfAnio;
        hash += (int) dpracfMes;
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDepreciacionesPK)) {
            return false;
        }
        DetallesDepreciacionesPK other = (DetallesDepreciacionesPK) object;
        if ((this.dpracfEmpCodigo == null && other.dpracfEmpCodigo != null) || (this.dpracfEmpCodigo != null && !this.dpracfEmpCodigo.equals(other.dpracfEmpCodigo))) {
            return false;
        }
        if (this.dpracfAnio != other.dpracfAnio) {
            return false;
        }
        if (this.dpracfMes != other.dpracfMes) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesDepreciacionesPK[ dpracfEmpCodigo=" + dpracfEmpCodigo + ", dpracfAnio=" + dpracfAnio + ", dpracfMes=" + dpracfMes + ", numero=" + numero + " ]";
    }
    
}
