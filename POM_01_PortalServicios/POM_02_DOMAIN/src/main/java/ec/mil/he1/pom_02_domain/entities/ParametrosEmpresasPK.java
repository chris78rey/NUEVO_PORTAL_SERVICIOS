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
public class ParametrosEmpresasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRMAPL_NOMBRE")
    private String prmaplNombre;
    @Basic(optional = false)
    @Column(name = "EMP_CODIGO")
    private String empCodigo;

    public ParametrosEmpresasPK() {
    }

    public ParametrosEmpresasPK(String prmaplNombre, String empCodigo) {
        this.prmaplNombre = prmaplNombre;
        this.empCodigo = empCodigo;
    }

    public String getPrmaplNombre() {
        return prmaplNombre;
    }

    public void setPrmaplNombre(String prmaplNombre) {
        this.prmaplNombre = prmaplNombre;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmaplNombre != null ? prmaplNombre.hashCode() : 0);
        hash += (empCodigo != null ? empCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosEmpresasPK)) {
            return false;
        }
        ParametrosEmpresasPK other = (ParametrosEmpresasPK) object;
        if ((this.prmaplNombre == null && other.prmaplNombre != null) || (this.prmaplNombre != null && !this.prmaplNombre.equals(other.prmaplNombre))) {
            return false;
        }
        if ((this.empCodigo == null && other.empCodigo != null) || (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosEmpresasPK[ prmaplNombre=" + prmaplNombre + ", empCodigo=" + empCodigo + " ]";
    }
    
}
