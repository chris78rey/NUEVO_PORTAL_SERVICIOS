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
@Table(name = "GERMENES_DE_PRUEBAS")
@NamedQueries({
    @NamedQuery(name = "GermenesDePruebas.findAll", query = "SELECT g FROM GermenesDePruebas g")})
public class GermenesDePruebas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GermenesDePruebasPK germenesDePruebasPK;
    @Column(name = "UNIDAD")
    private String unidad;
    @Column(name = "UNIDADES_FORMADORAS")
    private String unidadesFormadoras;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public GermenesDePruebas() {
    }

    public GermenesDePruebas(GermenesDePruebasPK germenesDePruebasPK) {
        this.germenesDePruebasPK = germenesDePruebasPK;
    }

    public GermenesDePruebas(int dtlexmExmNumero, int dtlexmVrbexmCodigo, String grmCodigo) {
        this.germenesDePruebasPK = new GermenesDePruebasPK(dtlexmExmNumero, dtlexmVrbexmCodigo, grmCodigo);
    }

    public GermenesDePruebasPK getGermenesDePruebasPK() {
        return germenesDePruebasPK;
    }

    public void setGermenesDePruebasPK(GermenesDePruebasPK germenesDePruebasPK) {
        this.germenesDePruebasPK = germenesDePruebasPK;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidadesFormadoras() {
        return unidadesFormadoras;
    }

    public void setUnidadesFormadoras(String unidadesFormadoras) {
        this.unidadesFormadoras = unidadesFormadoras;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (germenesDePruebasPK != null ? germenesDePruebasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GermenesDePruebas)) {
            return false;
        }
        GermenesDePruebas other = (GermenesDePruebas) object;
        if ((this.germenesDePruebasPK == null && other.germenesDePruebasPK != null) || (this.germenesDePruebasPK != null && !this.germenesDePruebasPK.equals(other.germenesDePruebasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.GermenesDePruebas[ germenesDePruebasPK=" + germenesDePruebasPK + " ]";
    }
    
}
