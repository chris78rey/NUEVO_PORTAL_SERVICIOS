/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "LISTAS_PROTOCOLO")
@NamedQueries({
    @NamedQuery(name = "ListasProtocolo.findAll", query = "SELECT l FROM ListasProtocolo l")})
public class ListasProtocolo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Short codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private Character estado;
    @JoinColumns({
        @JoinColumn(name = "DVP_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "DVP_SDVP_CODIGO", referencedColumnName = "SDVP_CODIGO"),
        @JoinColumn(name = "DVP_SDVP_VP_CODIGO", referencedColumnName = "SDVP_VP_CODIGO"),
        @JoinColumn(name = "DVP_SDVP_VP_P_CODIGO", referencedColumnName = "SDVP_VRBP_PRT_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private DetallesVariableProtocolo detallesVariableProtocolo;
    @JoinColumns({
        @JoinColumn(name = "SDVP_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "SDVP_VP_CODIGO", referencedColumnName = "VRBPRT_CODIGO"),
        @JoinColumn(name = "SDVP_VP_P_CODIGO", referencedColumnName = "VRBPRT_P_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private SubdetallesVariableProtocolo subdetallesVariableProtocolo;
    @JoinColumns({
        @JoinColumn(name = "VRBPRT_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "VRBPRT_P_CODIGO", referencedColumnName = "PRT_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private VariablesProtocolo variablesProtocolo;
    @OneToMany(mappedBy = "listasProtocolo", fetch = FetchType.LAZY)
    private List<VariablesProtocoloPaciente> variablesProtocoloPacienteList;
    @OneToMany(mappedBy = "listasProtocolo", fetch = FetchType.LAZY)
    private List<DetallesProtocoloPaciente> detallesProtocoloPacienteList;
    @OneToMany(mappedBy = "listasProtocolo", fetch = FetchType.LAZY)
    private List<SubdetallesProtocoloPaciente> subdetallesProtocoloPacienteList;

    public ListasProtocolo() {
    }

    public ListasProtocolo(Short codigo) {
        this.codigo = codigo;
    }

    public Short getCodigo() {
        return codigo;
    }

    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public DetallesVariableProtocolo getDetallesVariableProtocolo() {
        return detallesVariableProtocolo;
    }

    public void setDetallesVariableProtocolo(DetallesVariableProtocolo detallesVariableProtocolo) {
        this.detallesVariableProtocolo = detallesVariableProtocolo;
    }

    public SubdetallesVariableProtocolo getSubdetallesVariableProtocolo() {
        return subdetallesVariableProtocolo;
    }

    public void setSubdetallesVariableProtocolo(SubdetallesVariableProtocolo subdetallesVariableProtocolo) {
        this.subdetallesVariableProtocolo = subdetallesVariableProtocolo;
    }

    public VariablesProtocolo getVariablesProtocolo() {
        return variablesProtocolo;
    }

    public void setVariablesProtocolo(VariablesProtocolo variablesProtocolo) {
        this.variablesProtocolo = variablesProtocolo;
    }

    public List<VariablesProtocoloPaciente> getVariablesProtocoloPacienteList() {
        return variablesProtocoloPacienteList;
    }

    public void setVariablesProtocoloPacienteList(List<VariablesProtocoloPaciente> variablesProtocoloPacienteList) {
        this.variablesProtocoloPacienteList = variablesProtocoloPacienteList;
    }

    public List<DetallesProtocoloPaciente> getDetallesProtocoloPacienteList() {
        return detallesProtocoloPacienteList;
    }

    public void setDetallesProtocoloPacienteList(List<DetallesProtocoloPaciente> detallesProtocoloPacienteList) {
        this.detallesProtocoloPacienteList = detallesProtocoloPacienteList;
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
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListasProtocolo)) {
            return false;
        }
        ListasProtocolo other = (ListasProtocolo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ListasProtocolo[ codigo=" + codigo + " ]";
    }
    
}
