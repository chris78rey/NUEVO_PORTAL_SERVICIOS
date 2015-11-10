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
public class SubdetallesVariableProtocoloPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VRBPRT_CODIGO")
    private short vrbprtCodigo;
    @Basic(optional = false)
    @Column(name = "VRBPRT_P_CODIGO")
    private short vrbprtPCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private short codigo;

    public SubdetallesVariableProtocoloPK() {
    }

    public SubdetallesVariableProtocoloPK(short vrbprtCodigo, short vrbprtPCodigo, short codigo) {
        this.vrbprtCodigo = vrbprtCodigo;
        this.vrbprtPCodigo = vrbprtPCodigo;
        this.codigo = codigo;
    }

    public short getVrbprtCodigo() {
        return vrbprtCodigo;
    }

    public void setVrbprtCodigo(short vrbprtCodigo) {
        this.vrbprtCodigo = vrbprtCodigo;
    }

    public short getVrbprtPCodigo() {
        return vrbprtPCodigo;
    }

    public void setVrbprtPCodigo(short vrbprtPCodigo) {
        this.vrbprtPCodigo = vrbprtPCodigo;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) vrbprtCodigo;
        hash += (int) vrbprtPCodigo;
        hash += (int) codigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubdetallesVariableProtocoloPK)) {
            return false;
        }
        SubdetallesVariableProtocoloPK other = (SubdetallesVariableProtocoloPK) object;
        if (this.vrbprtCodigo != other.vrbprtCodigo) {
            return false;
        }
        if (this.vrbprtPCodigo != other.vrbprtPCodigo) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SubdetallesVariableProtocoloPK[ vrbprtCodigo=" + vrbprtCodigo + ", vrbprtPCodigo=" + vrbprtPCodigo + ", codigo=" + codigo + " ]";
    }
    
}
