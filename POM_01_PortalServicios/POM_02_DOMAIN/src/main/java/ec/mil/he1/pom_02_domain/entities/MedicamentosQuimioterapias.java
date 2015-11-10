/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "MEDICAMENTOS_QUIMIOTERAPIAS")
@NamedQueries({
    @NamedQuery(name = "MedicamentosQuimioterapias.findAll", query = "SELECT m FROM MedicamentosQuimioterapias m")})
public class MedicamentosQuimioterapias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "UNIDAD")
    private String unidad;
    @JoinTable(name = "TRATAMIENTOS_PROTOCOLO", joinColumns = {
        @JoinColumn(name = "MDCQMT_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "PRTQMT_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<ProtocolosQuimioterapia> protocolosQuimioterapiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicamentosQuimioterapias", fetch = FetchType.LAZY)
    private List<TratamientosQuimioterapia> tratamientosQuimioterapiaList;

    public MedicamentosQuimioterapias() {
    }

    public MedicamentosQuimioterapias(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public List<ProtocolosQuimioterapia> getProtocolosQuimioterapiaList() {
        return protocolosQuimioterapiaList;
    }

    public void setProtocolosQuimioterapiaList(List<ProtocolosQuimioterapia> protocolosQuimioterapiaList) {
        this.protocolosQuimioterapiaList = protocolosQuimioterapiaList;
    }

    public List<TratamientosQuimioterapia> getTratamientosQuimioterapiaList() {
        return tratamientosQuimioterapiaList;
    }

    public void setTratamientosQuimioterapiaList(List<TratamientosQuimioterapia> tratamientosQuimioterapiaList) {
        this.tratamientosQuimioterapiaList = tratamientosQuimioterapiaList;
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
        if (!(object instanceof MedicamentosQuimioterapias)) {
            return false;
        }
        MedicamentosQuimioterapias other = (MedicamentosQuimioterapias) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.MedicamentosQuimioterapias[ codigo=" + codigo + " ]";
    }
    
}
