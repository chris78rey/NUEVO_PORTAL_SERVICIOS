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
@Table(name = "GRUPOS_PAQUETES")
@NamedQueries({
    @NamedQuery(name = "GruposPaquetes.findAll", query = "SELECT g FROM GruposPaquetes g")})
public class GruposPaquetes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gruposPaquetes", fetch = FetchType.LAZY)
    private List<DetallesGruposPaquetes> detallesGruposPaquetesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gruposPaquetes", fetch = FetchType.LAZY)
    private List<DetallesPaquetes> detallesPaquetesList;
    @JoinColumn(name = "CNV_CONVENIO", referencedColumnName = "CONVENIO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Convenios convenios;

    public GruposPaquetes() {
    }

    public GruposPaquetes(String codigo) {
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

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public List<DetallesGruposPaquetes> getDetallesGruposPaquetesList() {
        return detallesGruposPaquetesList;
    }

    public void setDetallesGruposPaquetesList(List<DetallesGruposPaquetes> detallesGruposPaquetesList) {
        this.detallesGruposPaquetesList = detallesGruposPaquetesList;
    }

    public List<DetallesPaquetes> getDetallesPaquetesList() {
        return detallesPaquetesList;
    }

    public void setDetallesPaquetesList(List<DetallesPaquetes> detallesPaquetesList) {
        this.detallesPaquetesList = detallesPaquetesList;
    }

    public Convenios getConvenios() {
        return convenios;
    }

    public void setConvenios(Convenios convenios) {
        this.convenios = convenios;
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
        if (!(object instanceof GruposPaquetes)) {
            return false;
        }
        GruposPaquetes other = (GruposPaquetes) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.GruposPaquetes[ codigo=" + codigo + " ]";
    }
    
}
