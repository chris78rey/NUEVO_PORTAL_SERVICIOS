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
@Table(name = "SECCIONES")
@NamedQueries({
    @NamedQuery(name = "Secciones.findAll", query = "SELECT s FROM Secciones s")})
public class Secciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "LOCAL")
    private String local;
    @Column(name = "PLNCTA_CODIGO")
    private String plnctaCodigo;
    @Column(name = "UBICACION_FISICA")
    private String ubicacionFisica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "secciones", fetch = FetchType.LAZY)
    private List<Subsecciones> subseccionesList;

    public Secciones() {
    }

    public Secciones(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPlnctaCodigo() {
        return plnctaCodigo;
    }

    public void setPlnctaCodigo(String plnctaCodigo) {
        this.plnctaCodigo = plnctaCodigo;
    }

    public String getUbicacionFisica() {
        return ubicacionFisica;
    }

    public void setUbicacionFisica(String ubicacionFisica) {
        this.ubicacionFisica = ubicacionFisica;
    }

    public List<Subsecciones> getSubseccionesList() {
        return subseccionesList;
    }

    public void setSubseccionesList(List<Subsecciones> subseccionesList) {
        this.subseccionesList = subseccionesList;
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
        if (!(object instanceof Secciones)) {
            return false;
        }
        Secciones other = (Secciones) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Secciones[ codigo=" + codigo + " ]";
    }
    
}
