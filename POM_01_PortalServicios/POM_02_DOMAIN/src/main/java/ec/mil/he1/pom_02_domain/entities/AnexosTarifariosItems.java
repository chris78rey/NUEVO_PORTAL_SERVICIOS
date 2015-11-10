/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ANEXOS_TARIFARIOS_ITEMS")
@NamedQueries({
    @NamedQuery(name = "AnexosTarifariosItems.findAll", query = "SELECT a FROM AnexosTarifariosItems a")})
public class AnexosTarifariosItems implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AnexosTarifariosItemsPK anexosTarifariosItemsPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @JoinColumn(name = "CNV_CONVENIO", referencedColumnName = "CONVENIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Convenios convenios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anexosTarifariosItems", fetch = FetchType.LAZY)
    private List<ConveniosEquivalenciasItems> conveniosEquivalenciasItemsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anexosTarifariosItems", fetch = FetchType.LAZY)
    private List<TarifariosItems> tarifariosItemsList;

    public AnexosTarifariosItems() {
    }

    public AnexosTarifariosItems(AnexosTarifariosItemsPK anexosTarifariosItemsPK) {
        this.anexosTarifariosItemsPK = anexosTarifariosItemsPK;
    }

    public AnexosTarifariosItems(String cnvConvenio, String anexo) {
        this.anexosTarifariosItemsPK = new AnexosTarifariosItemsPK(cnvConvenio, anexo);
    }

    public AnexosTarifariosItemsPK getAnexosTarifariosItemsPK() {
        return anexosTarifariosItemsPK;
    }

    public void setAnexosTarifariosItemsPK(AnexosTarifariosItemsPK anexosTarifariosItemsPK) {
        this.anexosTarifariosItemsPK = anexosTarifariosItemsPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Convenios getConvenios() {
        return convenios;
    }

    public void setConvenios(Convenios convenios) {
        this.convenios = convenios;
    }

    public List<ConveniosEquivalenciasItems> getConveniosEquivalenciasItemsList() {
        return conveniosEquivalenciasItemsList;
    }

    public void setConveniosEquivalenciasItemsList(List<ConveniosEquivalenciasItems> conveniosEquivalenciasItemsList) {
        this.conveniosEquivalenciasItemsList = conveniosEquivalenciasItemsList;
    }

    public List<TarifariosItems> getTarifariosItemsList() {
        return tarifariosItemsList;
    }

    public void setTarifariosItemsList(List<TarifariosItems> tarifariosItemsList) {
        this.tarifariosItemsList = tarifariosItemsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (anexosTarifariosItemsPK != null ? anexosTarifariosItemsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnexosTarifariosItems)) {
            return false;
        }
        AnexosTarifariosItems other = (AnexosTarifariosItems) object;
        if ((this.anexosTarifariosItemsPK == null && other.anexosTarifariosItemsPK != null) || (this.anexosTarifariosItemsPK != null && !this.anexosTarifariosItemsPK.equals(other.anexosTarifariosItemsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AnexosTarifariosItems[ anexosTarifariosItemsPK=" + anexosTarifariosItemsPK + " ]";
    }
    
}
