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
public class EntidadesBeneficiariasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MSTBNF_CODIGO")
    private String mstbnfCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private int codigo;

    public EntidadesBeneficiariasPK() {
    }

    public EntidadesBeneficiariasPK(String mstbnfCodigo, int codigo) {
        this.mstbnfCodigo = mstbnfCodigo;
        this.codigo = codigo;
    }

    public String getMstbnfCodigo() {
        return mstbnfCodigo;
    }

    public void setMstbnfCodigo(String mstbnfCodigo) {
        this.mstbnfCodigo = mstbnfCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mstbnfCodigo != null ? mstbnfCodigo.hashCode() : 0);
        hash += (int) codigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntidadesBeneficiariasPK)) {
            return false;
        }
        EntidadesBeneficiariasPK other = (EntidadesBeneficiariasPK) object;
        if ((this.mstbnfCodigo == null && other.mstbnfCodigo != null) || (this.mstbnfCodigo != null && !this.mstbnfCodigo.equals(other.mstbnfCodigo))) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EntidadesBeneficiariasPK[ mstbnfCodigo=" + mstbnfCodigo + ", codigo=" + codigo + " ]";
    }
    
}
