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
public class ExportacionesNcNdSriPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EXPSRI_EMP_CODIGO")
    private String expsriEmpCodigo;
    @Basic(optional = false)
    @Column(name = "EXPSRI_PERIODO")
    private String expsriPeriodo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public ExportacionesNcNdSriPK() {
    }

    public ExportacionesNcNdSriPK(String expsriEmpCodigo, String expsriPeriodo, int numero) {
        this.expsriEmpCodigo = expsriEmpCodigo;
        this.expsriPeriodo = expsriPeriodo;
        this.numero = numero;
    }

    public String getExpsriEmpCodigo() {
        return expsriEmpCodigo;
    }

    public void setExpsriEmpCodigo(String expsriEmpCodigo) {
        this.expsriEmpCodigo = expsriEmpCodigo;
    }

    public String getExpsriPeriodo() {
        return expsriPeriodo;
    }

    public void setExpsriPeriodo(String expsriPeriodo) {
        this.expsriPeriodo = expsriPeriodo;
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
        hash += (expsriEmpCodigo != null ? expsriEmpCodigo.hashCode() : 0);
        hash += (expsriPeriodo != null ? expsriPeriodo.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExportacionesNcNdSriPK)) {
            return false;
        }
        ExportacionesNcNdSriPK other = (ExportacionesNcNdSriPK) object;
        if ((this.expsriEmpCodigo == null && other.expsriEmpCodigo != null) || (this.expsriEmpCodigo != null && !this.expsriEmpCodigo.equals(other.expsriEmpCodigo))) {
            return false;
        }
        if ((this.expsriPeriodo == null && other.expsriPeriodo != null) || (this.expsriPeriodo != null && !this.expsriPeriodo.equals(other.expsriPeriodo))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ExportacionesNcNdSriPK[ expsriEmpCodigo=" + expsriEmpCodigo + ", expsriPeriodo=" + expsriPeriodo + ", numero=" + numero + " ]";
    }
    
}
