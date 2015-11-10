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
public class ParametrosIntegracionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARAMETRO")
    private String parametro;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "EMP_CODIGO")
    private String empCodigo;

    public ParametrosIntegracionPK() {
    }

    public ParametrosIntegracionPK(String parametro, String tipo, String empCodigo) {
        this.parametro = parametro;
        this.tipo = tipo;
        this.empCodigo = empCodigo;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        hash += (parametro != null ? parametro.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (empCodigo != null ? empCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosIntegracionPK)) {
            return false;
        }
        ParametrosIntegracionPK other = (ParametrosIntegracionPK) object;
        if ((this.parametro == null && other.parametro != null) || (this.parametro != null && !this.parametro.equals(other.parametro))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.empCodigo == null && other.empCodigo != null) || (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosIntegracionPK[ parametro=" + parametro + ", tipo=" + tipo + ", empCodigo=" + empCodigo + " ]";
    }
    
}
