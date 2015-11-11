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
public class ImportacionesNcNdSriPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IMPSRI_EMP_CODIGO")
    private String impsriEmpCodigo;
    @Basic(optional = false)
    @Column(name = "IMPSRI_PERIODO")
    private String impsriPeriodo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public ImportacionesNcNdSriPK() {
    }

    public ImportacionesNcNdSriPK(String impsriEmpCodigo, String impsriPeriodo, int numero) {
        this.impsriEmpCodigo = impsriEmpCodigo;
        this.impsriPeriodo = impsriPeriodo;
        this.numero = numero;
    }

    public String getImpsriEmpCodigo() {
        return impsriEmpCodigo;
    }

    public void setImpsriEmpCodigo(String impsriEmpCodigo) {
        this.impsriEmpCodigo = impsriEmpCodigo;
    }

    public String getImpsriPeriodo() {
        return impsriPeriodo;
    }

    public void setImpsriPeriodo(String impsriPeriodo) {
        this.impsriPeriodo = impsriPeriodo;
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
        hash += (impsriEmpCodigo != null ? impsriEmpCodigo.hashCode() : 0);
        hash += (impsriPeriodo != null ? impsriPeriodo.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImportacionesNcNdSriPK)) {
            return false;
        }
        ImportacionesNcNdSriPK other = (ImportacionesNcNdSriPK) object;
        if ((this.impsriEmpCodigo == null && other.impsriEmpCodigo != null) || (this.impsriEmpCodigo != null && !this.impsriEmpCodigo.equals(other.impsriEmpCodigo))) {
            return false;
        }
        if ((this.impsriPeriodo == null && other.impsriPeriodo != null) || (this.impsriPeriodo != null && !this.impsriPeriodo.equals(other.impsriPeriodo))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ImportacionesNcNdSriPK[ impsriEmpCodigo=" + impsriEmpCodigo + ", impsriPeriodo=" + impsriPeriodo + ", numero=" + numero + " ]";
    }
    
}
