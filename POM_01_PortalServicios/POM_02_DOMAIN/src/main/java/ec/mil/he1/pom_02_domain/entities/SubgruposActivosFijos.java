/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "SUBGRUPOS_ACTIVOS_FIJOS")
@NamedQueries({
    @NamedQuery(name = "SubgruposActivosFijos.findAll", query = "SELECT s FROM SubgruposActivosFijos s")})
public class SubgruposActivosFijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SubgruposActivosFijosPK subgruposActivosFijosPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE_DEPRECIACION")
    private BigDecimal porcentajeDepreciacion;
    @Column(name = "PORCENTAJE_REVALORIZACION")
    private BigDecimal porcentajeRevalorizacion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subgruposActivosFijos", fetch = FetchType.LAZY)
    private List<ActivosFijosGenerales> activosFijosGeneralesList;
    @JoinColumns({
        @JoinColumn(name = "GRPACTFJO_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "GRPACTFJO_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private GruposActivosFijos gruposActivosFijos;

    public SubgruposActivosFijos() {
    }

    public SubgruposActivosFijos(SubgruposActivosFijosPK subgruposActivosFijosPK) {
        this.subgruposActivosFijosPK = subgruposActivosFijosPK;
    }

    public SubgruposActivosFijos(String grpactfjoEmpCodigo, short grpactfjoCodigo, short codigo) {
        this.subgruposActivosFijosPK = new SubgruposActivosFijosPK(grpactfjoEmpCodigo, grpactfjoCodigo, codigo);
    }

    public SubgruposActivosFijosPK getSubgruposActivosFijosPK() {
        return subgruposActivosFijosPK;
    }

    public void setSubgruposActivosFijosPK(SubgruposActivosFijosPK subgruposActivosFijosPK) {
        this.subgruposActivosFijosPK = subgruposActivosFijosPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPorcentajeDepreciacion() {
        return porcentajeDepreciacion;
    }

    public void setPorcentajeDepreciacion(BigDecimal porcentajeDepreciacion) {
        this.porcentajeDepreciacion = porcentajeDepreciacion;
    }

    public BigDecimal getPorcentajeRevalorizacion() {
        return porcentajeRevalorizacion;
    }

    public void setPorcentajeRevalorizacion(BigDecimal porcentajeRevalorizacion) {
        this.porcentajeRevalorizacion = porcentajeRevalorizacion;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public List<ActivosFijosGenerales> getActivosFijosGeneralesList() {
        return activosFijosGeneralesList;
    }

    public void setActivosFijosGeneralesList(List<ActivosFijosGenerales> activosFijosGeneralesList) {
        this.activosFijosGeneralesList = activosFijosGeneralesList;
    }

    public GruposActivosFijos getGruposActivosFijos() {
        return gruposActivosFijos;
    }

    public void setGruposActivosFijos(GruposActivosFijos gruposActivosFijos) {
        this.gruposActivosFijos = gruposActivosFijos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subgruposActivosFijosPK != null ? subgruposActivosFijosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubgruposActivosFijos)) {
            return false;
        }
        SubgruposActivosFijos other = (SubgruposActivosFijos) object;
        if ((this.subgruposActivosFijosPK == null && other.subgruposActivosFijosPK != null) || (this.subgruposActivosFijosPK != null && !this.subgruposActivosFijosPK.equals(other.subgruposActivosFijosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SubgruposActivosFijos[ subgruposActivosFijosPK=" + subgruposActivosFijosPK + " ]";
    }
    
}
