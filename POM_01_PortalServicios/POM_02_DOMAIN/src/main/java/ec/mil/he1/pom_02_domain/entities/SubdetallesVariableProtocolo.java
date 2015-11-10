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
@Table(name = "SUBDETALLES_VARIABLE_PROTOCOLO")
@NamedQueries({
    @NamedQuery(name = "SubdetallesVariableProtocolo.findAll", query = "SELECT s FROM SubdetallesVariableProtocolo s")})
public class SubdetallesVariableProtocolo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubdetallesVariableProtocoloPK subdetallesVariableProtocoloPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO")
    private Character estado;
    @Column(name = "OBLIGATORIO")
    private Character obligatorio;
    @Column(name = "ORDEN")
    private Short orden;
    @Column(name = "VALOR_POR_DEFECTO")
    private String valorPorDefecto;
    @OneToMany(mappedBy = "subdetallesVariableProtocolo", fetch = FetchType.LAZY)
    private List<ListasProtocolo> listasProtocoloList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subdetallesVariableProtocolo", fetch = FetchType.LAZY)
    private List<DetallesVariableProtocolo> detallesVariableProtocoloList;
    @JoinColumn(name = "TD_SECUENCIAL", referencedColumnName = "SECUENCIAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiposDeDatos tiposDeDatos;
    @JoinColumns({
        @JoinColumn(name = "VRBPRT_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "VRBPRT_P_CODIGO", referencedColumnName = "PRT_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private VariablesProtocolo variablesProtocolo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subdetallesVariableProtocolo", fetch = FetchType.LAZY)
    private List<SubdetallesProtocoloPaciente> subdetallesProtocoloPacienteList;

    public SubdetallesVariableProtocolo() {
    }

    public SubdetallesVariableProtocolo(SubdetallesVariableProtocoloPK subdetallesVariableProtocoloPK) {
        this.subdetallesVariableProtocoloPK = subdetallesVariableProtocoloPK;
    }

    public SubdetallesVariableProtocolo(short vrbprtCodigo, short vrbprtPCodigo, short codigo) {
        this.subdetallesVariableProtocoloPK = new SubdetallesVariableProtocoloPK(vrbprtCodigo, vrbprtPCodigo, codigo);
    }

    public SubdetallesVariableProtocoloPK getSubdetallesVariableProtocoloPK() {
        return subdetallesVariableProtocoloPK;
    }

    public void setSubdetallesVariableProtocoloPK(SubdetallesVariableProtocoloPK subdetallesVariableProtocoloPK) {
        this.subdetallesVariableProtocoloPK = subdetallesVariableProtocoloPK;
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

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    public String getValorPorDefecto() {
        return valorPorDefecto;
    }

    public void setValorPorDefecto(String valorPorDefecto) {
        this.valorPorDefecto = valorPorDefecto;
    }

    public List<ListasProtocolo> getListasProtocoloList() {
        return listasProtocoloList;
    }

    public void setListasProtocoloList(List<ListasProtocolo> listasProtocoloList) {
        this.listasProtocoloList = listasProtocoloList;
    }

    public List<DetallesVariableProtocolo> getDetallesVariableProtocoloList() {
        return detallesVariableProtocoloList;
    }

    public void setDetallesVariableProtocoloList(List<DetallesVariableProtocolo> detallesVariableProtocoloList) {
        this.detallesVariableProtocoloList = detallesVariableProtocoloList;
    }

    public TiposDeDatos getTiposDeDatos() {
        return tiposDeDatos;
    }

    public void setTiposDeDatos(TiposDeDatos tiposDeDatos) {
        this.tiposDeDatos = tiposDeDatos;
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
        hash += (subdetallesVariableProtocoloPK != null ? subdetallesVariableProtocoloPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubdetallesVariableProtocolo)) {
            return false;
        }
        SubdetallesVariableProtocolo other = (SubdetallesVariableProtocolo) object;
        if ((this.subdetallesVariableProtocoloPK == null && other.subdetallesVariableProtocoloPK != null) || (this.subdetallesVariableProtocoloPK != null && !this.subdetallesVariableProtocoloPK.equals(other.subdetallesVariableProtocoloPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SubdetallesVariableProtocolo[ subdetallesVariableProtocoloPK=" + subdetallesVariableProtocoloPK + " ]";
    }
    
}
