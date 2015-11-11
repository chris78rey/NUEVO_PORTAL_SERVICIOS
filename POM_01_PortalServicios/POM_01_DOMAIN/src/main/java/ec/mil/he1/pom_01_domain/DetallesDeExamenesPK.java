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
public class DetallesDeExamenesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private int exmNumero;
    @Basic(optional = false)
    @Column(name = "VRBEXM_CODIGO")
    private int vrbexmCodigo;

    public DetallesDeExamenesPK() {
    }

    public DetallesDeExamenesPK(int exmNumero, int vrbexmCodigo) {
        this.exmNumero = exmNumero;
        this.vrbexmCodigo = vrbexmCodigo;
    }

    public int getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(int exmNumero) {
        this.exmNumero = exmNumero;
    }

    public int getVrbexmCodigo() {
        return vrbexmCodigo;
    }

    public void setVrbexmCodigo(int vrbexmCodigo) {
        this.vrbexmCodigo = vrbexmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) exmNumero;
        hash += (int) vrbexmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDeExamenesPK)) {
            return false;
        }
        DetallesDeExamenesPK other = (DetallesDeExamenesPK) object;
        if (this.exmNumero != other.exmNumero) {
            return false;
        }
        if (this.vrbexmCodigo != other.vrbexmCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesDeExamenesPK[ exmNumero=" + exmNumero + ", vrbexmCodigo=" + vrbexmCodigo + " ]";
    }
    
}
