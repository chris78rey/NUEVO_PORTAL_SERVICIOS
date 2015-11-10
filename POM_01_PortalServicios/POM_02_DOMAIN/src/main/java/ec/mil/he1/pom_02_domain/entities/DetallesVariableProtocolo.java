/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "DETALLES_VARIABLE_PROTOCOLO")
@NamedQueries({
    @NamedQuery(name = "DetallesVariableProtocolo.findAll", query = "SELECT d FROM DetallesVariableProtocolo d")})
public class DetallesVariableProtocolo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesVariableProtocoloPK detallesVariableProtocoloPK;
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
    @OneToMany(mappedBy = "detallesVariableProtocolo", fetch = FetchType.LAZY)
    private List<ListasProtocolo> listasProtocoloList;
    @JoinColumns({
        @JoinColumn(name = "SDVP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SDVP_VP_CODIGO", referencedColumnName = "VRBPRT_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "SDVP_VRBP_PRT_CODIGO", referencedColumnName = "VRBPRT_P_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SubdetallesVariableProtocolo subdetallesVariableProtocolo;
    @JoinColumn(name = "TD_SECUENCIAL", referencedColumnName = "SECUENCIAL")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiposDeDatos tiposDeDatos;

    public DetallesVariableProtocolo() {
    }

    public DetallesVariableProtocolo(DetallesVariableProtocoloPK detallesVariableProtocoloPK) {
        this.detallesVariableProtocoloPK = detallesVariableProtocoloPK;
    }

    public DetallesVariableProtocolo(short sdvpCodigo, short sdvpVpCodigo, short sdvpVrbpPrtCodigo, short codigo) {
        this.detallesVariableProtocoloPK = new DetallesVariableProtocoloPK(sdvpCodigo, sdvpVpCodigo, sdvpVrbpPrtCodigo, codigo);
    }

    public DetallesVariableProtocoloPK getDetallesVariableProtocoloPK() {
        return detallesVariableProtocoloPK;
    }

    public void setDetallesVariableProtocoloPK(DetallesVariableProtocoloPK detallesVariableProtocoloPK) {
        this.detallesVariableProtocoloPK = detallesVariableProtocoloPK;
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

    public SubdetallesVariableProtocolo getSubdetallesVariableProtocolo() {
        return subdetallesVariableProtocolo;
    }

    public void setSubdetallesVariableProtocolo(SubdetallesVariableProtocolo subdetallesVariableProtocolo) {
        this.subdetallesVariableProtocolo = subdetallesVariableProtocolo;
    }

    public TiposDeDatos getTiposDeDatos() {
        return tiposDeDatos;
    }

    public void setTiposDeDatos(TiposDeDatos tiposDeDatos) {
        this.tiposDeDatos = tiposDeDatos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesVariableProtocoloPK != null ? detallesVariableProtocoloPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesVariableProtocolo)) {
            return false;
        }
        DetallesVariableProtocolo other = (DetallesVariableProtocolo) object;
        if ((this.detallesVariableProtocoloPK == null && other.detallesVariableProtocoloPK != null) || (this.detallesVariableProtocoloPK != null && !this.detallesVariableProtocoloPK.equals(other.detallesVariableProtocoloPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesVariableProtocolo[ detallesVariableProtocoloPK=" + detallesVariableProtocoloPK + " ]";
    }
    
}
