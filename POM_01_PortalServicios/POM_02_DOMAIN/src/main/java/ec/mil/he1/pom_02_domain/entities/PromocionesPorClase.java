/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PROMOCIONES_POR_CLASE")
@NamedQueries({
    @NamedQuery(name = "PromocionesPorClase.findAll", query = "SELECT p FROM PromocionesPorClase p")})
public class PromocionesPorClase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRMCLS_ID")
    private Long prmclsId;
    @Column(name = "CLASIFICACION")
    private String clasificacion;
    @Column(name = "ESTADO")
    private Character estado;
    @JoinColumn(name = "PRM_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Promociones promociones;

    public PromocionesPorClase() {
    }

    public PromocionesPorClase(Long prmclsId) {
        this.prmclsId = prmclsId;
    }

    public Long getPrmclsId() {
        return prmclsId;
    }

    public void setPrmclsId(Long prmclsId) {
        this.prmclsId = prmclsId;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Promociones getPromociones() {
        return promociones;
    }

    public void setPromociones(Promociones promociones) {
        this.promociones = promociones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prmclsId != null ? prmclsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PromocionesPorClase)) {
            return false;
        }
        PromocionesPorClase other = (PromocionesPorClase) object;
        if ((this.prmclsId == null && other.prmclsId != null) || (this.prmclsId != null && !this.prmclsId.equals(other.prmclsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PromocionesPorClase[ prmclsId=" + prmclsId + " ]";
    }
    
}
