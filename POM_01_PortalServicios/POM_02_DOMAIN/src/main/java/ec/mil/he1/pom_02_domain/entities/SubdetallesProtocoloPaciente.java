/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @Column(name = "ORDEN")
    private Short orden;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subdetallesProtocoloPaciente", fetch = FetchType.LAZY)
    private List<DetallesProtocoloPaciente> detallesProtocoloPacienteList;
    @JoinColumn(name = "LSTPRT_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ListasProtocolo listasProtocolo;
    @JoinColumns({
        @JoinColumn(name = "SDVP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SDVP_VPRT_CODIGO", referencedColumnName = "VRBPRT_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SDVP_VPRT_P_CODIGO", referencedColumnName = "VRBPRT_P_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SubdetallesVariableProtocolo subdetallesVariableProtocolo;
    @JoinColumns({
        @JoinColumn(name = "VPP_PP_PCN_HC", referencedColumnName = "PP_PCN_HC", insertable = false, updatable = false),
        @JoinColumn(name = "VPP_PP_P_CODIGO", referencedColumnName = "PP_P_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "VPP_VP_FECHA", referencedColumnName = "PP_FECHA", insertable = false, updatable = false),
        @JoinColumn(name = "VPP_VP_CODIGO", referencedColumnName = "VP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "VPP_VP_P_CODIGO", referencedColumnName = "VP_P_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private VariablesProtocoloPaciente variablesProtocoloPaciente;

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

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    public List<DetallesProtocoloPaciente> getDetallesProtocoloPacienteList() {
        return detallesProtocoloPacienteList;
    }

    public void setDetallesProtocoloPacienteList(List<DetallesProtocoloPaciente> detallesProtocoloPacienteList) {
        this.detallesProtocoloPacienteList = detallesProtocoloPacienteList;
    }

    public ListasProtocolo getListasProtocolo() {
        return listasProtocolo;
    }

    public void setListasProtocolo(ListasProtocolo listasProtocolo) {
        this.listasProtocolo = listasProtocolo;
    }

    public SubdetallesVariableProtocolo getSubdetallesVariableProtocolo() {
        return subdetallesVariableProtocolo;
    }

    public void setSubdetallesVariableProtocolo(SubdetallesVariableProtocolo subdetallesVariableProtocolo) {
        this.subdetallesVariableProtocolo = subdetallesVariableProtocolo;
    }

    public VariablesProtocoloPaciente getVariablesProtocoloPaciente() {
        return variablesProtocoloPaciente;
    }

    public void setVariablesProtocoloPaciente(VariablesProtocoloPaciente variablesProtocoloPaciente) {
        this.variablesProtocoloPaciente = variablesProtocoloPaciente;
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
        return "ec.mil.he1.pom_02_domain.entities.SubdetallesProtocoloPaciente[ subdetallesProtocoloPacientePK=" + subdetallesProtocoloPacientePK + " ]";
    }
    
}
