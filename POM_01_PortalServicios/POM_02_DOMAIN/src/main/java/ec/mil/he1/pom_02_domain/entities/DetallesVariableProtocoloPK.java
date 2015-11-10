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
public class DetallesVariableProtocoloPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SDVP_CODIGO")
    private short sdvpCodigo;
    @Basic(optional = false)
    @Column(name = "SDVP_VP_CODIGO")
    private short sdvpVpCodigo;
    @Basic(optional = false)
    @Column(name = "SDVP_VRBP_PRT_CODIGO")
    private short sdvpVrbpPrtCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private short codigo;

    public DetallesVariableProtocoloPK() {
    }

    public DetallesVariableProtocoloPK(short sdvpCodigo, short sdvpVpCodigo, short sdvpVrbpPrtCodigo, short codigo) {
        this.sdvpCodigo = sdvpCodigo;
        this.sdvpVpCodigo = sdvpVpCodigo;
        this.sdvpVrbpPrtCodigo = sdvpVrbpPrtCodigo;
        this.codigo = codigo;
    }

    public short getSdvpCodigo() {
        return sdvpCodigo;
    }

    public void setSdvpCodigo(short sdvpCodigo) {
        this.sdvpCodigo = sdvpCodigo;
    }

    public short getSdvpVpCodigo() {
        return sdvpVpCodigo;
    }

    public void setSdvpVpCodigo(short sdvpVpCodigo) {
        this.sdvpVpCodigo = sdvpVpCodigo;
    }

    public short getSdvpVrbpPrtCodigo() {
        return sdvpVrbpPrtCodigo;
    }

    public void setSdvpVrbpPrtCodigo(short sdvpVrbpPrtCodigo) {
        this.sdvpVrbpPrtCodigo = sdvpVrbpPrtCodigo;
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
        hash += (int) sdvpCodigo;
        hash += (int) sdvpVpCodigo;
        hash += (int) sdvpVrbpPrtCodigo;
        hash += (int) codigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesVariableProtocoloPK)) {
            return false;
        }
        DetallesVariableProtocoloPK other = (DetallesVariableProtocoloPK) object;
        if (this.sdvpCodigo != other.sdvpCodigo) {
            return false;
        }
        if (this.sdvpVpCodigo != other.sdvpVpCodigo) {
            return false;
        }
        if (this.sdvpVrbpPrtCodigo != other.sdvpVrbpPrtCodigo) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesVariableProtocoloPK[ sdvpCodigo=" + sdvpCodigo + ", sdvpVpCodigo=" + sdvpVpCodigo + ", sdvpVrbpPrtCodigo=" + sdvpVrbpPrtCodigo + ", codigo=" + codigo + " ]";
    }
    
}
