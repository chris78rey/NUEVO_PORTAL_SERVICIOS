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
public class VariablesProtocoloPacientePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PP_PCN_HC")
    private int ppPcnHc;
    @Basic(optional = false)
    @Column(name = "PP_P_CODIGO")
    private short ppPCodigo;
    @Basic(optional = false)
    @Column(name = "PP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ppFecha;
    @Basic(optional = false)
    @Column(name = "VP_CODIGO")
    private short vpCodigo;
    @Basic(optional = false)
    @Column(name = "VP_P_CODIGO")
    private short vpPCodigo;

    public VariablesProtocoloPacientePK() {
    }

    public VariablesProtocoloPacientePK(int ppPcnHc, short ppPCodigo, Date ppFecha, short vpCodigo, short vpPCodigo) {
        this.ppPcnHc = ppPcnHc;
        this.ppPCodigo = ppPCodigo;
        this.ppFecha = ppFecha;
        this.vpCodigo = vpCodigo;
        this.vpPCodigo = vpPCodigo;
    }

    public int getPpPcnHc() {
        return ppPcnHc;
    }

    public void setPpPcnHc(int ppPcnHc) {
        this.ppPcnHc = ppPcnHc;
    }

    public short getPpPCodigo() {
        return ppPCodigo;
    }

    public void setPpPCodigo(short ppPCodigo) {
        this.ppPCodigo = ppPCodigo;
    }

    public Date getPpFecha() {
        return ppFecha;
    }

    public void setPpFecha(Date ppFecha) {
        this.ppFecha = ppFecha;
    }

    public short getVpCodigo() {
        return vpCodigo;
    }

    public void setVpCodigo(short vpCodigo) {
        this.vpCodigo = vpCodigo;
    }

    public short getVpPCodigo() {
        return vpPCodigo;
    }

    public void setVpPCodigo(short vpPCodigo) {
        this.vpPCodigo = vpPCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ppPcnHc;
        hash += (int) ppPCodigo;
        hash += (ppFecha != null ? ppFecha.hashCode() : 0);
        hash += (int) vpCodigo;
        hash += (int) vpPCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariablesProtocoloPacientePK)) {
            return false;
        }
        VariablesProtocoloPacientePK other = (VariablesProtocoloPacientePK) object;
        if (this.ppPcnHc != other.ppPcnHc) {
            return false;
        }
        if (this.ppPCodigo != other.ppPCodigo) {
            return false;
        }
        if ((this.ppFecha == null && other.ppFecha != null) || (this.ppFecha != null && !this.ppFecha.equals(other.ppFecha))) {
            return false;
        }
        if (this.vpCodigo != other.vpCodigo) {
            return false;
        }
        if (this.vpPCodigo != other.vpPCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.VariablesProtocoloPacientePK[ ppPcnHc=" + ppPcnHc + ", ppPCodigo=" + ppPCodigo + ", ppFecha=" + ppFecha + ", vpCodigo=" + vpCodigo + ", vpPCodigo=" + vpPCodigo + " ]";
    }
    
}
