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
public class CentrosDeGastosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "AGRUPADOR")
    private String agrupador;

    public CentrosDeGastosPK() {
    }

    public CentrosDeGastosPK(String empCodigo, String tipo, String agrupador) {
        this.empCodigo = empCodigo;
        this.tipo = tipo;
        this.agrupador = agrupador;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAgrupador() {
        return agrupador;
    }

    public void setAgrupador(String agrupador) {
        this.agrupador = agrupador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empCodigo != null ? empCodigo.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (agrupador != null ? agrupador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentrosDeGastosPK)) {
            return false;
        }
        CentrosDeGastosPK other = (CentrosDeGastosPK) object;
        if ((this.empCodigo == null && other.empCodigo != null) || (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.agrupador == null && other.agrupador != null) || (this.agrupador != null && !this.agrupador.equals(other.agrupador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CentrosDeGastosPK[ empCodigo=" + empCodigo + ", tipo=" + tipo + ", agrupador=" + agrupador + " ]";
    }
    
}
