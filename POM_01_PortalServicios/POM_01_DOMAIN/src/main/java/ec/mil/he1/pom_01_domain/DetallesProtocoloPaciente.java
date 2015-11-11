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
@Table(name = "DETALLES_PROTOCOLO_PACIENTE")
@NamedQueries({
    @NamedQuery(name = "DetallesProtocoloPaciente.findAll", query = "SELECT d FROM DetallesProtocoloPaciente d")})
public class DetallesProtocoloPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesProtocoloPacientePK detallesProtocoloPacientePK;
    @Column(name = "SDPP_VPP_VP_EXM_NUMERO")
    private Integer sdppVppVpExmNumero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DESCRIPTIVO")
    private String descriptivo;
    @Column(name = "LSTPRT_CODIGO")
    private Short lstprtCodigo;
    @Column(name = "ORDEN")
    private Short orden;

    public DetallesProtocoloPaciente() {
    }

    public DetallesProtocoloPaciente(DetallesProtocoloPacientePK detallesProtocoloPacientePK) {
        this.detallesProtocoloPacientePK = detallesProtocoloPacientePK;
    }

    public DetallesProtocoloPaciente(short dvpCodigo, short dvpSdvpCodigo, short dvpSdvpVpCodigo, short dvpSdvpVpPCodigo, short sdppSdvpCodigo, short sdppSdvpVpCodigo, short sdppSdvpVpPCodigo, int sdppVppPpPcnHc, short sdvpVppPpPCodigo, short sdvpVppVpCodigo, short sdppVppVpPCodigo, Date sdppVppVpFecha) {
        this.detallesProtocoloPacientePK = new DetallesProtocoloPacientePK(dvpCodigo, dvpSdvpCodigo, dvpSdvpVpCodigo, dvpSdvpVpPCodigo, sdppSdvpCodigo, sdppSdvpVpCodigo, sdppSdvpVpPCodigo, sdppVppPpPcnHc, sdvpVppPpPCodigo, sdvpVppVpCodigo, sdppVppVpPCodigo, sdppVppVpFecha);
    }

    public DetallesProtocoloPacientePK getDetallesProtocoloPacientePK() {
        return detallesProtocoloPacientePK;
    }

    public void setDetallesProtocoloPacientePK(DetallesProtocoloPacientePK detallesProtocoloPacientePK) {
        this.detallesProtocoloPacientePK = detallesProtocoloPacientePK;
    }

    public Integer getSdppVppVpExmNumero() {
        return sdppVppVpExmNumero;
    }

    public void setSdppVppVpExmNumero(Integer sdppVppVpExmNumero) {
        this.sdppVppVpExmNumero = sdppVppVpExmNumero;
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
        hash += (detallesProtocoloPacientePK != null ? detallesProtocoloPacientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesProtocoloPaciente)) {
            return false;
        }
        DetallesProtocoloPaciente other = (DetallesProtocoloPaciente) object;
        if ((this.detallesProtocoloPacientePK == null && other.detallesProtocoloPacientePK != null) || (this.detallesProtocoloPacientePK != null && !this.detallesProtocoloPacientePK.equals(other.detallesProtocoloPacientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesProtocoloPaciente[ detallesProtocoloPacientePK=" + detallesProtocoloPacientePK + " ]";
    }
    
}
