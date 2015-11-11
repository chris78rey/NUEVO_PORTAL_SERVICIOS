/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "BANDEJAS")
@NamedQueries({
    @NamedQuery(name = "Bandejas.findAll", query = "SELECT b FROM Bandejas b")})
public class Bandejas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BandejasPK bandejasPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public Bandejas() {
    }

    public Bandejas(BandejasPK bandejasPK) {
        this.bandejasPK = bandejasPK;
    }

    public Bandejas(String estCodigo, String codigo) {
        this.bandejasPK = new BandejasPK(estCodigo, codigo);
    }

    public BandejasPK getBandejasPK() {
        return bandejasPK;
    }

    public void setBandejasPK(BandejasPK bandejasPK) {
        this.bandejasPK = bandejasPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bandejasPK != null ? bandejasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bandejas)) {
            return false;
        }
        Bandejas other = (Bandejas) object;
        if ((this.bandejasPK == null && other.bandejasPK != null) || (this.bandejasPK != null && !this.bandejasPK.equals(other.bandejasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Bandejas[ bandejasPK=" + bandejasPK + " ]";
    }
    
}
