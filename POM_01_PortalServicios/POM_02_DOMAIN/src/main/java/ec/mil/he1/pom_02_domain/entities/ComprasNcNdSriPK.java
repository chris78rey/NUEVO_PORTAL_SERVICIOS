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
public class ComprasNcNdSriPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IVA_EMP_CODIGO")
    private String ivaEmpCodigo;
    @Basic(optional = false)
    @Column(name = "IVA_PERIODO")
    private String ivaPeriodo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public ComprasNcNdSriPK() {
    }

    public ComprasNcNdSriPK(String ivaEmpCodigo, String ivaPeriodo, int numero) {
        this.ivaEmpCodigo = ivaEmpCodigo;
        this.ivaPeriodo = ivaPeriodo;
        this.numero = numero;
    }

    public String getIvaEmpCodigo() {
        return ivaEmpCodigo;
    }

    public void setIvaEmpCodigo(String ivaEmpCodigo) {
        this.ivaEmpCodigo = ivaEmpCodigo;
    }

    public String getIvaPeriodo() {
        return ivaPeriodo;
    }

    public void setIvaPeriodo(String ivaPeriodo) {
        this.ivaPeriodo = ivaPeriodo;
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
        hash += (ivaEmpCodigo != null ? ivaEmpCodigo.hashCode() : 0);
        hash += (ivaPeriodo != null ? ivaPeriodo.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprasNcNdSriPK)) {
            return false;
        }
        ComprasNcNdSriPK other = (ComprasNcNdSriPK) object;
        if ((this.ivaEmpCodigo == null && other.ivaEmpCodigo != null) || (this.ivaEmpCodigo != null && !this.ivaEmpCodigo.equals(other.ivaEmpCodigo))) {
            return false;
        }
        if ((this.ivaPeriodo == null && other.ivaPeriodo != null) || (this.ivaPeriodo != null && !this.ivaPeriodo.equals(other.ivaPeriodo))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ComprasNcNdSriPK[ ivaEmpCodigo=" + ivaEmpCodigo + ", ivaPeriodo=" + ivaPeriodo + ", numero=" + numero + " ]";
    }
    
}
