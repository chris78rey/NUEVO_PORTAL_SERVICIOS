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
@Table(name = "IVA")
@NamedQueries({
    @NamedQuery(name = "Iva.findAll", query = "SELECT i FROM Iva i")})
public class Iva implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IvaPK ivaPK;
    @Column(name = "MES")
    private Short mes;
    @Column(name = "ANIO")
    private Short anio;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ESTADO_CIERRE")
    private Character estadoCierre;

    public Iva() {
    }

    public Iva(IvaPK ivaPK) {
        this.ivaPK = ivaPK;
    }

    public Iva(String empCodigo, String periodo) {
        this.ivaPK = new IvaPK(empCodigo, periodo);
    }

    public IvaPK getIvaPK() {
        return ivaPK;
    }

    public void setIvaPK(IvaPK ivaPK) {
        this.ivaPK = ivaPK;
    }

    public Short getMes() {
        return mes;
    }

    public void setMes(Short mes) {
        this.mes = mes;
    }

    public Short getAnio() {
        return anio;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Character getEstadoCierre() {
        return estadoCierre;
    }

    public void setEstadoCierre(Character estadoCierre) {
        this.estadoCierre = estadoCierre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ivaPK != null ? ivaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Iva)) {
            return false;
        }
        Iva other = (Iva) object;
        if ((this.ivaPK == null && other.ivaPK != null) || (this.ivaPK != null && !this.ivaPK.equals(other.ivaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Iva[ ivaPK=" + ivaPK + " ]";
    }
    
}
