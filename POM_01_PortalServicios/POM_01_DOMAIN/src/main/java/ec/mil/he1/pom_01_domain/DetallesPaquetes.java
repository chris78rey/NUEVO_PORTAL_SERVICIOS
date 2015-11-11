/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "DETALLES_PAQUETES")
@NamedQueries({
    @NamedQuery(name = "DetallesPaquetes.findAll", query = "SELECT d FROM DetallesPaquetes d")})
public class DetallesPaquetes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesPaquetesPK detallesPaquetesPK;
    @Column(name = "ESTADO_DISPONIBILIDAD")
    private Character estadoDisponibilidad;
    @Column(name = "CANTIDAD")
    private BigInteger cantidad;

    public DetallesPaquetes() {
    }

    public DetallesPaquetes(DetallesPaquetesPK detallesPaquetesPK) {
        this.detallesPaquetesPK = detallesPaquetesPK;
    }

    public DetallesPaquetes(String pqtCnvConvenio, String pqtTipo, String pqtCodigo, String gpqCodigo) {
        this.detallesPaquetesPK = new DetallesPaquetesPK(pqtCnvConvenio, pqtTipo, pqtCodigo, gpqCodigo);
    }

    public DetallesPaquetesPK getDetallesPaquetesPK() {
        return detallesPaquetesPK;
    }

    public void setDetallesPaquetesPK(DetallesPaquetesPK detallesPaquetesPK) {
        this.detallesPaquetesPK = detallesPaquetesPK;
    }

    public Character getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(Character estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesPaquetesPK != null ? detallesPaquetesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesPaquetes)) {
            return false;
        }
        DetallesPaquetes other = (DetallesPaquetes) object;
        if ((this.detallesPaquetesPK == null && other.detallesPaquetesPK != null) || (this.detallesPaquetesPK != null && !this.detallesPaquetesPK.equals(other.detallesPaquetesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesPaquetes[ detallesPaquetesPK=" + detallesPaquetesPK + " ]";
    }
    
}
