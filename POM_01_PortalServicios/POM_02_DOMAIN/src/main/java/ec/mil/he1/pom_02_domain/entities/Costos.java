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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "COSTOS")
@NamedQueries({
    @NamedQuery(name = "Costos.findAll", query = "SELECT c FROM Costos c")})
public class Costos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "INTEGRACION")
    private String integracion;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "OBSERVACION")
    private String observacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "costos", fetch = FetchType.LAZY)
    private List<DetallesDeCostos> detallesDeCostosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "costos", fetch = FetchType.LAZY)
    private List<CuentasCostos> cuentasCostosList;

    public Costos() {
    }

    public Costos(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIntegracion() {
        return integracion;
    }

    public void setIntegracion(String integracion) {
        this.integracion = integracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public List<DetallesDeCostos> getDetallesDeCostosList() {
        return detallesDeCostosList;
    }

    public void setDetallesDeCostosList(List<DetallesDeCostos> detallesDeCostosList) {
        this.detallesDeCostosList = detallesDeCostosList;
    }

    public List<CuentasCostos> getCuentasCostosList() {
        return cuentasCostosList;
    }

    public void setCuentasCostosList(List<CuentasCostos> cuentasCostosList) {
        this.cuentasCostosList = cuentasCostosList;
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
        if (!(object instanceof Costos)) {
            return false;
        }
        Costos other = (Costos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Costos[ codigo=" + codigo + " ]";
    }
    
}
