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
public class DiagnosticosDeExamenesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DGNLBR_CODIGO")
    private String dgnlbrCodigo;
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private int exmNumero;

    public DiagnosticosDeExamenesPK() {
    }

    public DiagnosticosDeExamenesPK(String dgnlbrCodigo, int exmNumero) {
        this.dgnlbrCodigo = dgnlbrCodigo;
        this.exmNumero = exmNumero;
    }

    public String getDgnlbrCodigo() {
        return dgnlbrCodigo;
    }

    public void setDgnlbrCodigo(String dgnlbrCodigo) {
        this.dgnlbrCodigo = dgnlbrCodigo;
    }

    public int getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(int exmNumero) {
        this.exmNumero = exmNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dgnlbrCodigo != null ? dgnlbrCodigo.hashCode() : 0);
        hash += (int) exmNumero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticosDeExamenesPK)) {
            return false;
        }
        DiagnosticosDeExamenesPK other = (DiagnosticosDeExamenesPK) object;
        if ((this.dgnlbrCodigo == null && other.dgnlbrCodigo != null) || (this.dgnlbrCodigo != null && !this.dgnlbrCodigo.equals(other.dgnlbrCodigo))) {
            return false;
        }
        if (this.exmNumero != other.exmNumero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DiagnosticosDeExamenesPK[ dgnlbrCodigo=" + dgnlbrCodigo + ", exmNumero=" + exmNumero + " ]";
    }
    
}
