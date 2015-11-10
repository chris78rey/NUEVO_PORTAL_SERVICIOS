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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
    @JoinTable(name = "BANDEJAS_ITEMS", joinColumns = {
        @JoinColumn(name = "BND_EST_CODIGO", referencedColumnName = "EST_CODIGO"),
        @JoinColumn(name = "BND_CODIGO", referencedColumnName = "CODIGO")}, inverseJoinColumns = {
        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "SBS_SCC_CODIGO"),
        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "SBS_CODIGO"),
        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Items> itemsList;
    @JoinColumn(name = "EST_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estantes estantes;

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

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public Estantes getEstantes() {
        return estantes;
    }

    public void setEstantes(Estantes estantes) {
        this.estantes = estantes;
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
        return "ec.mil.he1.pom_02_domain.entities.Bandejas[ bandejasPK=" + bandejasPK + " ]";
    }
    
}
