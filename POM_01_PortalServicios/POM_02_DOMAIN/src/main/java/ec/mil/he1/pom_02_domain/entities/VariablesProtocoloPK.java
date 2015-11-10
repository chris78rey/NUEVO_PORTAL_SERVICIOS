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
public class VariablesProtocoloPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private short codigo;
    @Basic(optional = false)
    @Column(name = "PRT_CODIGO")
    private short prtCodigo;

    public VariablesProtocoloPK() {
    }

    public VariablesProtocoloPK(short codigo, short prtCodigo) {
        this.codigo = codigo;
        this.prtCodigo = prtCodigo;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public short getPrtCodigo() {
        return prtCodigo;
    }

    public void setPrtCodigo(short prtCodigo) {
        this.prtCodigo = prtCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigo;
        hash += (int) prtCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariablesProtocoloPK)) {
            return false;
        }
        VariablesProtocoloPK other = (VariablesProtocoloPK) object;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.prtCodigo != other.prtCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.VariablesProtocoloPK[ codigo=" + codigo + ", prtCodigo=" + prtCodigo + " ]";
    }
    
}
