/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
@Table(name = "VARIABLES_PROTOCOLO")
@NamedQueries({
    @NamedQuery(name = "VariablesProtocolo.findAll", query = "SELECT v FROM VariablesProtocolo v")})
public class VariablesProtocolo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VariablesProtocoloPK variablesProtocoloPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private Character estado;
    @Column(name = "OBLIGATORIO")
    private Character obligatorio;
    @Column(name = "VALOR_POR_DEFECTO")
    private String valorPorDefecto;
    @Column(name = "ORDEN")
    private Short orden;
    @OneToMany(mappedBy = "variablesProtocolo", fetch = FetchType.LAZY)
    private List<ListasProtocolo> listasProtocoloList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "variablesProtocolo", fetch = FetchType.LAZY)
    private List<VariablesProtocoloPaciente> variablesProtocoloPacienteList;
    @JoinColumn(name = "PRT_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Protocolos protocolos;
    @JoinColumn(name = "TD_SECUENCIAL", referencedColumnName = "SECUENCIAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiposDeDatos tiposDeDatos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "variablesProtocolo", fetch = FetchType.LAZY)
    private List<SubdetallesVariableProtocolo> subdetallesVariableProtocoloList;

    public VariablesProtocolo() {
    }

    public VariablesProtocolo(VariablesProtocoloPK variablesProtocoloPK) {
        this.variablesProtocoloPK = variablesProtocoloPK;
    }

    public VariablesProtocolo(short codigo, short prtCodigo) {
        this.variablesProtocoloPK = new VariablesProtocoloPK(codigo, prtCodigo);
    }

    public VariablesProtocoloPK getVariablesProtocoloPK() {
        return variablesProtocoloPK;
    }

    public void setVariablesProtocoloPK(VariablesProtocoloPK variablesProtocoloPK) {
        this.variablesProtocoloPK = variablesProtocoloPK;
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

    public Character getObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(Character obligatorio) {
        this.obligatorio = obligatorio;
    }

    public String getValorPorDefecto() {
        return valorPorDefecto;
    }

    public void setValorPorDefecto(String valorPorDefecto) {
        this.valorPorDefecto = valorPorDefecto;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    public List<ListasProtocolo> getListasProtocoloList() {
        return listasProtocoloList;
    }

    public void setListasProtocoloList(List<ListasProtocolo> listasProtocoloList) {
        this.listasProtocoloList = listasProtocoloList;
    }

    public List<VariablesProtocoloPaciente> getVariablesProtocoloPacienteList() {
        return variablesProtocoloPacienteList;
    }

    public void setVariablesProtocoloPacienteList(List<VariablesProtocoloPaciente> variablesProtocoloPacienteList) {
        this.variablesProtocoloPacienteList = variablesProtocoloPacienteList;
    }

    public Protocolos getProtocolos() {
        return protocolos;
    }

    public void setProtocolos(Protocolos protocolos) {
        this.protocolos = protocolos;
    }

    public TiposDeDatos getTiposDeDatos() {
        return tiposDeDatos;
    }

    public void setTiposDeDatos(TiposDeDatos tiposDeDatos) {
        this.tiposDeDatos = tiposDeDatos;
    }

    public List<SubdetallesVariableProtocolo> getSubdetallesVariableProtocoloList() {
        return subdetallesVariableProtocoloList;
    }

    public void setSubdetallesVariableProtocoloList(List<SubdetallesVariableProtocolo> subdetallesVariableProtocoloList) {
        this.subdetallesVariableProtocoloList = subdetallesVariableProtocoloList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variablesProtocoloPK != null ? variablesProtocoloPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariablesProtocolo)) {
            return false;
        }
        VariablesProtocolo other = (VariablesProtocolo) object;
        if ((this.variablesProtocoloPK == null && other.variablesProtocoloPK != null) || (this.variablesProtocoloPK != null && !this.variablesProtocoloPK.equals(other.variablesProtocoloPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.VariablesProtocolo[ variablesProtocoloPK=" + variablesProtocoloPK + " ]";
    }
    
}
