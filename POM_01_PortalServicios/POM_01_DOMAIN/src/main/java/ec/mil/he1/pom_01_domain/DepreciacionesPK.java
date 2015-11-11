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
public class DepreciacionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Basic(optional = false)
    @Column(name = "ANIO")
    private short anio;
    @Basic(optional = false)
    @Column(name = "MES")
    private short mes;

    public DepreciacionesPK() {
    }

    public DepreciacionesPK(String empCodigo, short anio, short mes) {
        this.empCodigo = empCodigo;
        this.anio = anio;
        this.mes = mes;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public short getMes() {
        return mes;
    }

    public void setMes(short mes) {
        this.mes = mes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empCodigo != null ? empCodigo.hashCode() : 0);
        hash += (int) anio;
        hash += (int) mes;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepreciacionesPK)) {
            return false;
        }
        DepreciacionesPK other = (DepreciacionesPK) object;
        if ((this.empCodigo == null && other.empCodigo != null) || (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DepreciacionesPK[ empCodigo=" + empCodigo + ", anio=" + anio + ", mes=" + mes + " ]";
    }
    
}
