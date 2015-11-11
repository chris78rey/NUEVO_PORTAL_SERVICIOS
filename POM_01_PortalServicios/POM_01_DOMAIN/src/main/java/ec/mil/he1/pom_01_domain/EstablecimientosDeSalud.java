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
@Table(name = "ESTABLECIMIENTOS_DE_SALUD")
@NamedQueries({
    @NamedQuery(name = "EstablecimientosDeSalud.findAll", query = "SELECT e FROM EstablecimientosDeSalud e")})
public class EstablecimientosDeSalud implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ABREVIACION")
    private String abreviacion;
    @Column(name = "CODIGO_ENTIDAD_SISTEMA")
    private String codigoEntidadSistema;
    @Column(name = "CODIGO_TIPO_ESTABLECIMIENTO")
    private String codigoTipoEstablecimiento;
    @Column(name = "DISTRITO_AREA")
    private String distritoArea;

    public EstablecimientosDeSalud() {
    }

    public EstablecimientosDeSalud(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public String getCodigoEntidadSistema() {
        return codigoEntidadSistema;
    }

    public void setCodigoEntidadSistema(String codigoEntidadSistema) {
        this.codigoEntidadSistema = codigoEntidadSistema;
    }

    public String getCodigoTipoEstablecimiento() {
        return codigoTipoEstablecimiento;
    }

    public void setCodigoTipoEstablecimiento(String codigoTipoEstablecimiento) {
        this.codigoTipoEstablecimiento = codigoTipoEstablecimiento;
    }

    public String getDistritoArea() {
        return distritoArea;
    }

    public void setDistritoArea(String distritoArea) {
        this.distritoArea = distritoArea;
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
        if (!(object instanceof EstablecimientosDeSalud)) {
            return false;
        }
        EstablecimientosDeSalud other = (EstablecimientosDeSalud) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EstablecimientosDeSalud[ codigo=" + codigo + " ]";
    }
    
}
