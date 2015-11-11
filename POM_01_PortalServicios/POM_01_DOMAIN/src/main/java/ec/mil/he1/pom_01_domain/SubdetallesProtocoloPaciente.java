/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "SUBDETALLES_PROTOCOLO_PACIENTE")
@NamedQueries({
    @NamedQuery(name = "SubdetallesProtocoloPaciente.findAll", query = "SELECT s FROM SubdetallesProtocoloPaciente s")})
public class SubdetallesProtocoloPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubdetallesProtocoloPacientePK subdetallesProtocoloPacientePK;
    @Column(name = "VPP_VP_EXM_NUMERO")
    private Integer vppVpExmNumero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DESCRIPTIVO")
    private String descriptivo;
    @Column(name = "LSTPRT_CODIGO")
    private Short lstprtCodigo;
    @Column(name = "ORDEN")
    private Short orden;

    public SubdetallesProtocoloPaciente() {
    }

    public SubdetallesProtocoloPaciente(SubdetallesProtocoloPacientePK subdetallesProtocoloPacientePK) {
        this.subdetallesProtocoloPacientePK = subdetallesProtocoloPacientePK;
    }

    public SubdetallesProtocoloPaciente(short sdvpCodigo, short sdvpVprtCodigo, short sdvpVprtPCodigo, int vppPpPcnHc, short vppPpPCodigo, short vppVpCodigo, short vppVpPCodigo, Date vppVpFecha) {
        this.subdetallesProtocoloPacientePK = new SubdetallesProtocoloPacientePK(sdvpCodigo, sdvpVprtCodigo, sdvpVprtPCodigo, vppPpPcnHc, vppPpPCodigo, vppVpCodigo, vppVpPCodigo, vppVpFecha);
    }

    public SubdetallesProtocoloPacientePK getSubdetallesProtocoloPacientePK() {
        return subdetallesProtocoloPacientePK;
    }

    public void setSubdetallesProtocoloPacientePK(SubdetallesProtocoloPacientePK subdetallesProtocoloPacientePK) {
        this.subdetallesProtocoloPacientePK = subdetallesProtocoloPacientePK;
    }

    public Integer getVppVpExmNumero() {
        return vppVpExmNumero;
    }

    public void setVppVpExmNumero(Integer vppVpExmNumero) {
        this.vppVpExmNumero = vppVpExmNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescriptivo() {
        return descriptivo;
    }

    public void setDescriptivo(String descriptivo) {
        this.descriptivo = descriptivo;
    }

    public Short getLstprtCodigo() {
        return lstprtCodigo;
    }

    public void setLstprtCodigo(Short lstprtCodigo) {
        this.lstprtCodigo = lstprtCodigo;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subdetallesProtocoloPacientePK != null ? subdetallesProtocoloPacientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubdetallesProtocoloPaciente)) {
            return false;
        }
        SubdetallesProtocoloPaciente other = (SubdetallesProtocoloPaciente) object;
        if ((this.subdetallesProtocoloPacientePK == null && other.subdetallesProtocoloPacientePK != null) || (this.subdetallesProtocoloPacientePK != null && !this.subdetallesProtocoloPacientePK.equals(other.subdetallesProtocoloPacientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SubdetallesProtocoloPaciente[ subdetallesProtocoloPacientePK=" + subdetallesProtocoloPacientePK + " ]";
    }
    
}
