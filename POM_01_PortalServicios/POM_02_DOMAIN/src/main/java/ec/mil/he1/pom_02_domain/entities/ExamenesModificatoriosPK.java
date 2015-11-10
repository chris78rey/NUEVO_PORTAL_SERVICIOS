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
public class ExamenesModificatoriosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO")
    private int exmNumero;
    @Basic(optional = false)
    @Column(name = "EXM_NUMERO_PARTE_D")
    private int exmNumeroParteD;

    public ExamenesModificatoriosPK() {
    }

    public ExamenesModificatoriosPK(int exmNumero, int exmNumeroParteD) {
        this.exmNumero = exmNumero;
        this.exmNumeroParteD = exmNumeroParteD;
    }

    public int getExmNumero() {
        return exmNumero;
    }

    public void setExmNumero(int exmNumero) {
        this.exmNumero = exmNumero;
    }

    public int getExmNumeroParteD() {
        return exmNumeroParteD;
    }

    public void setExmNumeroParteD(int exmNumeroParteD) {
        this.exmNumeroParteD = exmNumeroParteD;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) exmNumero;
        hash += (int) exmNumeroParteD;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenesModificatoriosPK)) {
            return false;
        }
        ExamenesModificatoriosPK other = (ExamenesModificatoriosPK) object;
        if (this.exmNumero != other.exmNumero) {
            return false;
        }
        if (this.exmNumeroParteD != other.exmNumeroParteD) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ExamenesModificatoriosPK[ exmNumero=" + exmNumero + ", exmNumeroParteD=" + exmNumeroParteD + " ]";
    }
    
}
