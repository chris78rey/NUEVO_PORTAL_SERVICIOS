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
public class AsignacionesReingresosActivoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMP_CODIGO")
    private String empCodigo;
    @Basic(optional = false)
    @Column(name = "TIPO_MOVIMIENTO")
    private String tipoMovimiento;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;

    public AsignacionesReingresosActivoPK() {
    }

    public AsignacionesReingresosActivoPK(String empCodigo, String tipoMovimiento, int numero) {
        this.empCodigo = empCodigo;
        this.tipoMovimiento = tipoMovimiento;
        this.numero = numero;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
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
        hash += (empCodigo != null ? empCodigo.hashCode() : 0);
        hash += (tipoMovimiento != null ? tipoMovimiento.hashCode() : 0);
        hash += (int) numero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsignacionesReingresosActivoPK)) {
            return false;
        }
        AsignacionesReingresosActivoPK other = (AsignacionesReingresosActivoPK) object;
        if ((this.empCodigo == null && other.empCodigo != null) || (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
            return false;
        }
        if ((this.tipoMovimiento == null && other.tipoMovimiento != null) || (this.tipoMovimiento != null && !this.tipoMovimiento.equals(other.tipoMovimiento))) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AsignacionesReingresosActivoPK[ empCodigo=" + empCodigo + ", tipoMovimiento=" + tipoMovimiento + ", numero=" + numero + " ]";
    }
    
}
