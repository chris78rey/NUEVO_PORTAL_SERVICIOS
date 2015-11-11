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
public class SubdetallesProtocoloPacientePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SDVP_CODIGO")
    private short sdvpCodigo;
    @Basic(optional = false)
    @Column(name = "SDVP_VPRT_CODIGO")
    private short sdvpVprtCodigo;
    @Basic(optional = false)
    @Column(name = "SDVP_VPRT_P_CODIGO")
    private short sdvpVprtPCodigo;
    @Basic(optional = false)
    @Column(name = "VPP_PP_PCN_HC")
    private int vppPpPcnHc;
    @Basic(optional = false)
    @Column(name = "VPP_PP_P_CODIGO")
    private short vppPpPCodigo;
    @Basic(optional = false)
    @Column(name = "VPP_VP_CODIGO")
    private short vppVpCodigo;
    @Basic(optional = false)
    @Column(name = "VPP_VP_P_CODIGO")
    private short vppVpPCodigo;
    @Basic(optional = false)
    @Column(name = "VPP_VP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vppVpFecha;

    public SubdetallesProtocoloPacientePK() {
    }

    public SubdetallesProtocoloPacientePK(short sdvpCodigo, short sdvpVprtCodigo, short sdvpVprtPCodigo, int vppPpPcnHc, short vppPpPCodigo, short vppVpCodigo, short vppVpPCodigo, Date vppVpFecha) {
        this.sdvpCodigo = sdvpCodigo;
        this.sdvpVprtCodigo = sdvpVprtCodigo;
        this.sdvpVprtPCodigo = sdvpVprtPCodigo;
        this.vppPpPcnHc = vppPpPcnHc;
        this.vppPpPCodigo = vppPpPCodigo;
        this.vppVpCodigo = vppVpCodigo;
        this.vppVpPCodigo = vppVpPCodigo;
        this.vppVpFecha = vppVpFecha;
    }

    public short getSdvpCodigo() {
        return sdvpCodigo;
    }

    public void setSdvpCodigo(short sdvpCodigo) {
        this.sdvpCodigo = sdvpCodigo;
    }

    public short getSdvpVprtCodigo() {
        return sdvpVprtCodigo;
    }

    public void setSdvpVprtCodigo(short sdvpVprtCodigo) {
        this.sdvpVprtCodigo = sdvpVprtCodigo;
    }

    public short getSdvpVprtPCodigo() {
        return sdvpVprtPCodigo;
    }

    public void setSdvpVprtPCodigo(short sdvpVprtPCodigo) {
        this.sdvpVprtPCodigo = sdvpVprtPCodigo;
    }

    public int getVppPpPcnHc() {
        return vppPpPcnHc;
    }

    public void setVppPpPcnHc(int vppPpPcnHc) {
        this.vppPpPcnHc = vppPpPcnHc;
    }

    public short getVppPpPCodigo() {
        return vppPpPCodigo;
    }

    public void setVppPpPCodigo(short vppPpPCodigo) {
        this.vppPpPCodigo = vppPpPCodigo;
    }

    public short getVppVpCodigo() {
        return vppVpCodigo;
    }

    public void setVppVpCodigo(short vppVpCodigo) {
        this.vppVpCodigo = vppVpCodigo;
    }

    public short getVppVpPCodigo() {
        return vppVpPCodigo;
    }

    public void setVppVpPCodigo(short vppVpPCodigo) {
        this.vppVpPCodigo = vppVpPCodigo;
    }

    public Date getVppVpFecha() {
        return vppVpFecha;
    }

    public void setVppVpFecha(Date vppVpFecha) {
        this.vppVpFecha = vppVpFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) sdvpCodigo;
        hash += (int) sdvpVprtCodigo;
        hash += (int) sdvpVprtPCodigo;
        hash += (int) vppPpPcnHc;
        hash += (int) vppPpPCodigo;
        hash += (int) vppVpCodigo;
        hash += (int) vppVpPCodigo;
        hash += (vppVpFecha != null ? vppVpFecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubdetallesProtocoloPacientePK)) {
            return false;
        }
        SubdetallesProtocoloPacientePK other = (SubdetallesProtocoloPacientePK) object;
        if (this.sdvpCodigo != other.sdvpCodigo) {
            return false;
        }
        if (this.sdvpVprtCodigo != other.sdvpVprtCodigo) {
            return false;
        }
        if (this.sdvpVprtPCodigo != other.sdvpVprtPCodigo) {
            return false;
        }
        if (this.vppPpPcnHc != other.vppPpPcnHc) {
            return false;
        }
        if (this.vppPpPCodigo != other.vppPpPCodigo) {
            return false;
        }
        if (this.vppVpCodigo != other.vppVpCodigo) {
            return false;
        }
        if (this.vppVpPCodigo != other.vppVpPCodigo) {
            return false;
        }
        if ((this.vppVpFecha == null && other.vppVpFecha != null) || (this.vppVpFecha != null && !this.vppVpFecha.equals(other.vppVpFecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SubdetallesProtocoloPacientePK[ sdvpCodigo=" + sdvpCodigo + ", sdvpVprtCodigo=" + sdvpVprtCodigo + ", sdvpVprtPCodigo=" + sdvpVprtPCodigo + ", vppPpPcnHc=" + vppPpPcnHc + ", vppPpPCodigo=" + vppPpPCodigo + ", vppVpCodigo=" + vppVpCodigo + ", vppVpPCodigo=" + vppVpPCodigo + ", vppVpFecha=" + vppVpFecha + " ]";
    }
    
}
