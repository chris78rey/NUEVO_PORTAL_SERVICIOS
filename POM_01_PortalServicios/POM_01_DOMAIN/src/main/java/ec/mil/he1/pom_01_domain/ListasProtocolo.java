/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @Column(name = "VRBPRT_CODIGO")
    private Short vrbprtCodigo;
    @Column(name = "VRBPRT_P_CODIGO")
    private Short vrbprtPCodigo;
    @Column(name = "SDVP_CODIGO")
    private Short sdvpCodigo;
    @Column(name = "SDVP_VP_CODIGO")
    private Short sdvpVpCodigo;
    @Column(name = "SDVP_VP_P_CODIGO")
    private Short sdvpVpPCodigo;
    @Column(name = "DVP_CODIGO")
    private Short dvpCodigo;
    @Column(name = "DVP_SDVP_CODIGO")
    private Short dvpSdvpCodigo;
    @Column(name = "DVP_SDVP_VP_CODIGO")
    private Short dvpSdvpVpCodigo;
    @Column(name = "DVP_SDVP_VP_P_CODIGO")
    private Short dvpSdvpVpPCodigo;

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

    public Short getVrbprtCodigo() {
        return vrbprtCodigo;
    }

    public void setVrbprtCodigo(Short vrbprtCodigo) {
        this.vrbprtCodigo = vrbprtCodigo;
    }

    public Short getVrbprtPCodigo() {
        return vrbprtPCodigo;
    }

    public void setVrbprtPCodigo(Short vrbprtPCodigo) {
        this.vrbprtPCodigo = vrbprtPCodigo;
    }

    public Short getSdvpCodigo() {
        return sdvpCodigo;
    }

    public void setSdvpCodigo(Short sdvpCodigo) {
        this.sdvpCodigo = sdvpCodigo;
    }

    public Short getSdvpVpCodigo() {
        return sdvpVpCodigo;
    }

    public void setSdvpVpCodigo(Short sdvpVpCodigo) {
        this.sdvpVpCodigo = sdvpVpCodigo;
    }

    public Short getSdvpVpPCodigo() {
        return sdvpVpPCodigo;
    }

    public void setSdvpVpPCodigo(Short sdvpVpPCodigo) {
        this.sdvpVpPCodigo = sdvpVpPCodigo;
    }

    public Short getDvpCodigo() {
        return dvpCodigo;
    }

    public void setDvpCodigo(Short dvpCodigo) {
        this.dvpCodigo = dvpCodigo;
    }

    public Short getDvpSdvpCodigo() {
        return dvpSdvpCodigo;
    }

    public void setDvpSdvpCodigo(Short dvpSdvpCodigo) {
        this.dvpSdvpCodigo = dvpSdvpCodigo;
    }

    public Short getDvpSdvpVpCodigo() {
        return dvpSdvpVpCodigo;
    }

    public void setDvpSdvpVpCodigo(Short dvpSdvpVpCodigo) {
        this.dvpSdvpVpCodigo = dvpSdvpVpCodigo;
    }

    public Short getDvpSdvpVpPCodigo() {
        return dvpSdvpVpPCodigo;
    }

    public void setDvpSdvpVpPCodigo(Short dvpSdvpVpPCodigo) {
        this.dvpSdvpVpPCodigo = dvpSdvpVpPCodigo;
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
        return "ec.mil.he1.pom_01_domain.ListasProtocolo[ codigo=" + codigo + " ]";
    }
    
}
