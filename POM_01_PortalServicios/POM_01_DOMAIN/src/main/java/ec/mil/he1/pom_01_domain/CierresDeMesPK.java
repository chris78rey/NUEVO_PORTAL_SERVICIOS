/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class CierresDeMesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Basic(optional = false)
    @Column(name = "MES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mes;

    public CierresDeMesPK() {
    }

    public CierresDeMesPK(String empCodigo, Date mes) {
        this.empCodigo = empCodigo;
        this.mes = mes;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public Date getMes() {
        return mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empCodigo != null ? empCodigo.hashCode() : 0);
        hash += (mes != null ? mes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CierresDeMesPK)) {
            return false;
        }
        CierresDeMesPK other = (CierresDeMesPK) object;
        if ((this.empCodigo == null && other.empCodigo != null) || (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
            return false;
        }
        if ((this.mes == null && other.mes != null) || (this.mes != null && !this.mes.equals(other.mes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CierresDeMesPK[ empCodigo=" + empCodigo + ", mes=" + mes + " ]";
    }
    
}
