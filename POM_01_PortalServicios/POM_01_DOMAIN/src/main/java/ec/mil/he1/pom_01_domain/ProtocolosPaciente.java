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

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PROTOCOLOS_PACIENTE")
@NamedQueries({
    @NamedQuery(name = "ProtocolosPaciente.findAll", query = "SELECT p FROM ProtocolosPaciente p")})
public class ProtocolosPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProtocolosPacientePK protocolosPacientePK;
    @Column(name = "RGSOPR_PTOPSL_NRO")
    private Integer rgsoprPtopslNro;
    @Column(name = "RGSOPR_PTOPSL_PCN_NRO_HC")
    private Integer rgsoprPtopslPcnNroHc;
    @Column(name = "ORDEN")
    private Short orden;

    public ProtocolosPaciente() {
    }

    public ProtocolosPaciente(ProtocolosPacientePK protocolosPacientePK) {
        this.protocolosPacientePK = protocolosPacientePK;
    }

    public ProtocolosPaciente(int pcnNumeroHc, short prtCodigo, Date fecha, int exmNumero) {
        this.protocolosPacientePK = new ProtocolosPacientePK(pcnNumeroHc, prtCodigo, fecha, exmNumero);
    }

    public ProtocolosPacientePK getProtocolosPacientePK() {
        return protocolosPacientePK;
    }

    public void setProtocolosPacientePK(ProtocolosPacientePK protocolosPacientePK) {
        this.protocolosPacientePK = protocolosPacientePK;
    }

    public Integer getRgsoprPtopslNro() {
        return rgsoprPtopslNro;
    }

    public void setRgsoprPtopslNro(Integer rgsoprPtopslNro) {
        this.rgsoprPtopslNro = rgsoprPtopslNro;
    }

    public Integer getRgsoprPtopslPcnNroHc() {
        return rgsoprPtopslPcnNroHc;
    }

    public void setRgsoprPtopslPcnNroHc(Integer rgsoprPtopslPcnNroHc) {
        this.rgsoprPtopslPcnNroHc = rgsoprPtopslPcnNroHc;
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
        hash += (protocolosPacientePK != null ? protocolosPacientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProtocolosPaciente)) {
            return false;
        }
        ProtocolosPaciente other = (ProtocolosPaciente) object;
        if ((this.protocolosPacientePK == null && other.protocolosPacientePK != null) || (this.protocolosPacientePK != null && !this.protocolosPacientePK.equals(other.protocolosPacientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ProtocolosPaciente[ protocolosPacientePK=" + protocolosPacientePK + " ]";
    }
    
}
