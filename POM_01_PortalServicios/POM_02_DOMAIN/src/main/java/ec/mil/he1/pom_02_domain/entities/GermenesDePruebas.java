/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
    @JoinColumns({
        @JoinColumn(name = "DTLEXM_EXM_NUMERO", referencedColumnName = "EXM_NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "DTLEXM_VRBEXM_CODIGO", referencedColumnName = "VRBEXM_CODIGO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DetallesDeExamenes detallesDeExamenes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "germenesDePruebas", fetch = FetchType.LAZY)
    private List<ComportamientosGermen> comportamientosGermenList;

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

    public DetallesDeExamenes getDetallesDeExamenes() {
        return detallesDeExamenes;
    }

    public void setDetallesDeExamenes(DetallesDeExamenes detallesDeExamenes) {
        this.detallesDeExamenes = detallesDeExamenes;
    }

    public List<ComportamientosGermen> getComportamientosGermenList() {
        return comportamientosGermenList;
    }

    public void setComportamientosGermenList(List<ComportamientosGermen> comportamientosGermenList) {
        this.comportamientosGermenList = comportamientosGermenList;
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
        return "ec.mil.he1.pom_02_domain.entities.GermenesDePruebas[ germenesDePruebasPK=" + germenesDePruebasPK + " ]";
    }
    
}
