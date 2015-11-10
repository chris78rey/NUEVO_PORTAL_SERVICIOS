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
@Table(name = "VARIABLES_PROTOCOLO_PACIENTE")
@NamedQueries({
    @NamedQuery(name = "VariablesProtocoloPaciente.findAll", query = "SELECT v FROM VariablesProtocoloPaciente v")})
public class VariablesProtocoloPaciente implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VariablesProtocoloPacientePK variablesProtocoloPacientePK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DESCRIPTIVO")
    private String descriptivo;
    @Column(name = "ORDEN")
    private Short orden;
    @JoinColumn(name = "LSTPRT_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ListasProtocolo listasProtocolo;
    @JoinColumns({
        @JoinColumn(name = "PP_PCN_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false),
        @JoinColumn(name = "PP_P_CODIGO", referencedColumnName = "PRT_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "PP_FECHA", referencedColumnName = "FECHA", insertable = false, updatable = false),
        @JoinColumn(name = "PP_EXM_NUMERO", referencedColumnName = "EXM_NUMERO")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ProtocolosPaciente protocolosPaciente;
    @JoinColumns({
        @JoinColumn(name = "VP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "VP_P_CODIGO", referencedColumnName = "PRT_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private VariablesProtocolo variablesProtocolo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "variablesProtocoloPaciente", fetch = FetchType.LAZY)
    private List<SubdetallesProtocoloPaciente> subdetallesProtocoloPacienteList;

    public VariablesProtocoloPaciente() {
    }

    public VariablesProtocoloPaciente(VariablesProtocoloPacientePK variablesProtocoloPacientePK) {
        this.variablesProtocoloPacientePK = variablesProtocoloPacientePK;
    }

    public VariablesProtocoloPaciente(int ppPcnHc, short ppPCodigo, Date ppFecha, short vpCodigo, short vpPCodigo) {
        this.variablesProtocoloPacientePK = new VariablesProtocoloPacientePK(ppPcnHc, ppPCodigo, ppFecha, vpCodigo, vpPCodigo);
    }

    public VariablesProtocoloPacientePK getVariablesProtocoloPacientePK() {
        return variablesProtocoloPacientePK;
    }

    public void setVariablesProtocoloPacientePK(VariablesProtocoloPacientePK variablesProtocoloPacientePK) {
        this.variablesProtocoloPacientePK = variablesProtocoloPacientePK;
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

    public ListasProtocolo getListasProtocolo() {
        return listasProtocolo;
    }

    public void setListasProtocolo(ListasProtocolo listasProtocolo) {
        this.listasProtocolo = listasProtocolo;
    }

    public ProtocolosPaciente getProtocolosPaciente() {
        return protocolosPaciente;
    }

    public void setProtocolosPaciente(ProtocolosPaciente protocolosPaciente) {
        this.protocolosPaciente = protocolosPaciente;
    }

    public VariablesProtocolo getVariablesProtocolo() {
        return variablesProtocolo;
    }

    public void setVariablesProtocolo(VariablesProtocolo variablesProtocolo) {
        this.variablesProtocolo = variablesProtocolo;
    }

    public List<SubdetallesProtocoloPaciente> getSubdetallesProtocoloPacienteList() {
        return subdetallesProtocoloPacienteList;
    }

    public void setSubdetallesProtocoloPacienteList(List<SubdetallesProtocoloPaciente> subdetallesProtocoloPacienteList) {
        this.subdetallesProtocoloPacienteList = subdetallesProtocoloPacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variablesProtocoloPacientePK != null ? variablesProtocoloPacientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariablesProtocoloPaciente)) {
            return false;
        }
        VariablesProtocoloPaciente other = (VariablesProtocoloPaciente) object;
        if ((this.variablesProtocoloPacientePK == null && other.variablesProtocoloPacientePK != null) || (this.variablesProtocoloPacientePK != null && !this.variablesProtocoloPacientePK.equals(other.variablesProtocoloPacientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.VariablesProtocoloPaciente[ variablesProtocoloPacientePK=" + variablesProtocoloPacientePK + " ]";
    }
    
}
