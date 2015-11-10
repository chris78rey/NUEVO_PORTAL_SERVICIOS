/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

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
public class DetallesProtocoloPacientePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DVP_CODIGO")
    private short dvpCodigo;
    @Basic(optional = false)
    @Column(name = "DVP_SDVP_CODIGO")
    private short dvpSdvpCodigo;
    @Basic(optional = false)
    @Column(name = "DVP_SDVP_VP_CODIGO")
    private short dvpSdvpVpCodigo;
    @Basic(optional = false)
    @Column(name = "DVP_SDVP_VP_P_CODIGO")
    private short dvpSdvpVpPCodigo;
    @Basic(optional = false)
    @Column(name = "SDPP_SDVP_CODIGO")
    private short sdppSdvpCodigo;
    @Basic(optional = false)
    @Column(name = "SDPP_SDVP_VP_CODIGO")
    private short sdppSdvpVpCodigo;
    @Basic(optional = false)
    @Column(name = "SDPP_SDVP_VP_P_CODIGO")
    private short sdppSdvpVpPCodigo;
    @Basic(optional = false)
    @Column(name = "SDPP_VPP_PP_PCN_HC")
    private int sdppVppPpPcnHc;
    @Basic(optional = false)
    @Column(name = "SDVP_VPP_PP_P_CODIGO")
    private short sdvpVppPpPCodigo;
    @Basic(optional = false)
    @Column(name = "SDVP_VPP_VP_CODIGO")
    private short sdvpVppVpCodigo;
    @Basic(optional = false)
    @Column(name = "SDPP_VPP_VP_P_CODIGO")
    private short sdppVppVpPCodigo;
    @Basic(optional = false)
    @Column(name = "SDPP_VPP_VP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdppVppVpFecha;

    public DetallesProtocoloPacientePK() {
    }

    public DetallesProtocoloPacientePK(short dvpCodigo, short dvpSdvpCodigo, short dvpSdvpVpCodigo, short dvpSdvpVpPCodigo, short sdppSdvpCodigo, short sdppSdvpVpCodigo, short sdppSdvpVpPCodigo, int sdppVppPpPcnHc, short sdvpVppPpPCodigo, short sdvpVppVpCodigo, short sdppVppVpPCodigo, Date sdppVppVpFecha) {
        this.dvpCodigo = dvpCodigo;
        this.dvpSdvpCodigo = dvpSdvpCodigo;
        this.dvpSdvpVpCodigo = dvpSdvpVpCodigo;
        this.dvpSdvpVpPCodigo = dvpSdvpVpPCodigo;
        this.sdppSdvpCodigo = sdppSdvpCodigo;
        this.sdppSdvpVpCodigo = sdppSdvpVpCodigo;
        this.sdppSdvpVpPCodigo = sdppSdvpVpPCodigo;
        this.sdppVppPpPcnHc = sdppVppPpPcnHc;
        this.sdvpVppPpPCodigo = sdvpVppPpPCodigo;
        this.sdvpVppVpCodigo = sdvpVppVpCodigo;
        this.sdppVppVpPCodigo = sdppVppVpPCodigo;
        this.sdppVppVpFecha = sdppVppVpFecha;
    }

    public short getDvpCodigo() {
        return dvpCodigo;
    }

    public void setDvpCodigo(short dvpCodigo) {
        this.dvpCodigo = dvpCodigo;
    }

    public short getDvpSdvpCodigo() {
        return dvpSdvpCodigo;
    }

    public void setDvpSdvpCodigo(short dvpSdvpCodigo) {
        this.dvpSdvpCodigo = dvpSdvpCodigo;
    }

    public short getDvpSdvpVpCodigo() {
        return dvpSdvpVpCodigo;
    }

    public void setDvpSdvpVpCodigo(short dvpSdvpVpCodigo) {
        this.dvpSdvpVpCodigo = dvpSdvpVpCodigo;
    }

    public short getDvpSdvpVpPCodigo() {
        return dvpSdvpVpPCodigo;
    }

    public void setDvpSdvpVpPCodigo(short dvpSdvpVpPCodigo) {
        this.dvpSdvpVpPCodigo = dvpSdvpVpPCodigo;
    }

    public short getSdppSdvpCodigo() {
        return sdppSdvpCodigo;
    }

    public void setSdppSdvpCodigo(short sdppSdvpCodigo) {
        this.sdppSdvpCodigo = sdppSdvpCodigo;
    }

    public short getSdppSdvpVpCodigo() {
        return sdppSdvpVpCodigo;
    }

    public void setSdppSdvpVpCodigo(short sdppSdvpVpCodigo) {
        this.sdppSdvpVpCodigo = sdppSdvpVpCodigo;
    }

    public short getSdppSdvpVpPCodigo() {
        return sdppSdvpVpPCodigo;
    }

    public void setSdppSdvpVpPCodigo(short sdppSdvpVpPCodigo) {
        this.sdppSdvpVpPCodigo = sdppSdvpVpPCodigo;
    }

    public int getSdppVppPpPcnHc() {
        return sdppVppPpPcnHc;
    }

    public void setSdppVppPpPcnHc(int sdppVppPpPcnHc) {
        this.sdppVppPpPcnHc = sdppVppPpPcnHc;
    }

    public short getSdvpVppPpPCodigo() {
        return sdvpVppPpPCodigo;
    }

    public void setSdvpVppPpPCodigo(short sdvpVppPpPCodigo) {
        this.sdvpVppPpPCodigo = sdvpVppPpPCodigo;
    }

    public short getSdvpVppVpCodigo() {
        return sdvpVppVpCodigo;
    }

    public void setSdvpVppVpCodigo(short sdvpVppVpCodigo) {
        this.sdvpVppVpCodigo = sdvpVppVpCodigo;
    }

    public short getSdppVppVpPCodigo() {
        return sdppVppVpPCodigo;
    }

    public void setSdppVppVpPCodigo(short sdppVppVpPCodigo) {
        this.sdppVppVpPCodigo = sdppVppVpPCodigo;
    }

    public Date getSdppVppVpFecha() {
        return sdppVppVpFecha;
    }

    public void setSdppVppVpFecha(Date sdppVppVpFecha) {
        this.sdppVppVpFecha = sdppVppVpFecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dvpCodigo;
        hash += (int) dvpSdvpCodigo;
        hash += (int) dvpSdvpVpCodigo;
        hash += (int) dvpSdvpVpPCodigo;
        hash += (int) sdppSdvpCodigo;
        hash += (int) sdppSdvpVpCodigo;
        hash += (int) sdppSdvpVpPCodigo;
        hash += (int) sdppVppPpPcnHc;
        hash += (int) sdvpVppPpPCodigo;
        hash += (int) sdvpVppVpCodigo;
        hash += (int) sdppVppVpPCodigo;
        hash += (sdppVppVpFecha != null ? sdppVppVpFecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesProtocoloPacientePK)) {
            return false;
        }
        DetallesProtocoloPacientePK other = (DetallesProtocoloPacientePK) object;
        if (this.dvpCodigo != other.dvpCodigo) {
            return false;
        }
        if (this.dvpSdvpCodigo != other.dvpSdvpCodigo) {
            return false;
        }
        if (this.dvpSdvpVpCodigo != other.dvpSdvpVpCodigo) {
            return false;
        }
        if (this.dvpSdvpVpPCodigo != other.dvpSdvpVpPCodigo) {
            return false;
        }
        if (this.sdppSdvpCodigo != other.sdppSdvpCodigo) {
            return false;
        }
        if (this.sdppSdvpVpCodigo != other.sdppSdvpVpCodigo) {
            return false;
        }
        if (this.sdppSdvpVpPCodigo != other.sdppSdvpVpPCodigo) {
            return false;
        }
        if (this.sdppVppPpPcnHc != other.sdppVppPpPcnHc) {
            return false;
        }
        if (this.sdvpVppPpPCodigo != other.sdvpVppPpPCodigo) {
            return false;
        }
        if (this.sdvpVppVpCodigo != other.sdvpVppVpCodigo) {
            return false;
        }
        if (this.sdppVppVpPCodigo != other.sdppVppVpPCodigo) {
            return false;
        }
        if ((this.sdppVppVpFecha == null && other.sdppVppVpFecha != null) || (this.sdppVppVpFecha != null && !this.sdppVppVpFecha.equals(other.sdppVppVpFecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesProtocoloPacientePK[ dvpCodigo=" + dvpCodigo + ", dvpSdvpCodigo=" + dvpSdvpCodigo + ", dvpSdvpVpCodigo=" + dvpSdvpVpCodigo + ", dvpSdvpVpPCodigo=" + dvpSdvpVpPCodigo + ", sdppSdvpCodigo=" + sdppSdvpCodigo + ", sdppSdvpVpCodigo=" + sdppSdvpVpCodigo + ", sdppSdvpVpPCodigo=" + sdppSdvpVpPCodigo + ", sdppVppPpPcnHc=" + sdppVppPpPcnHc + ", sdvpVppPpPCodigo=" + sdvpVppPpPCodigo + ", sdvpVppVpCodigo=" + sdvpVppVpCodigo + ", sdppVppVpPCodigo=" + sdppVppVpPCodigo + ", sdppVppVpFecha=" + sdppVppVpFecha + " ]";
    }
    
}
