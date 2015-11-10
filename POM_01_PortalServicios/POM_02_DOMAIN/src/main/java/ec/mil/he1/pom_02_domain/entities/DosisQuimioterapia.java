/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
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
@Table(name = "DOSIS_QUIMIOTERAPIA")
@NamedQueries({
    @NamedQuery(name = "DosisQuimioterapia.findAll", query = "SELECT d FROM DosisQuimioterapia d")})
public class DosisQuimioterapia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DosisQuimioterapiaPK dosisQuimioterapiaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "dosisQuimioterapia", fetch = FetchType.LAZY)
    private List<CumplimientosQuimioterapia> cumplimientosQuimioterapiaList;
    @JoinColumns({
        @JoinColumn(name = "PRSMDCQMT_FECHA", referencedColumnName = "FECHA", insertable = false, updatable = false),
        @JoinColumn(name = "PRSMDCQMT_QMT_NUMERO", referencedColumnName = "QMT_NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PrescripcionesMedicasQuimiot prescripcionesMedicasQuimiot;
    @JoinColumns({
        @JoinColumn(name = "TRTQMT_QMT_NUMERO", referencedColumnName = "QMT_NUMERO"),
        @JoinColumn(name = "TRTQMT_MDCQMT_CODIGO", referencedColumnName = "MDCQMT_CODIGO"),
        @JoinColumn(name = "TRTQMT_FECHA_INICIO", referencedColumnName = "FECHA_INICIO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private TratamientosQuimioterapia tratamientosQuimioterapia;

    public DosisQuimioterapia() {
    }

    public DosisQuimioterapia(DosisQuimioterapiaPK dosisQuimioterapiaPK) {
        this.dosisQuimioterapiaPK = dosisQuimioterapiaPK;
    }

    public DosisQuimioterapia(Date prsmdcqmtFecha, short numero, int prsmdcqmtQmtNumero) {
        this.dosisQuimioterapiaPK = new DosisQuimioterapiaPK(prsmdcqmtFecha, numero, prsmdcqmtQmtNumero);
    }

    public DosisQuimioterapiaPK getDosisQuimioterapiaPK() {
        return dosisQuimioterapiaPK;
    }

    public void setDosisQuimioterapiaPK(DosisQuimioterapiaPK dosisQuimioterapiaPK) {
        this.dosisQuimioterapiaPK = dosisQuimioterapiaPK;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<CumplimientosQuimioterapia> getCumplimientosQuimioterapiaList() {
        return cumplimientosQuimioterapiaList;
    }

    public void setCumplimientosQuimioterapiaList(List<CumplimientosQuimioterapia> cumplimientosQuimioterapiaList) {
        this.cumplimientosQuimioterapiaList = cumplimientosQuimioterapiaList;
    }

    public PrescripcionesMedicasQuimiot getPrescripcionesMedicasQuimiot() {
        return prescripcionesMedicasQuimiot;
    }

    public void setPrescripcionesMedicasQuimiot(PrescripcionesMedicasQuimiot prescripcionesMedicasQuimiot) {
        this.prescripcionesMedicasQuimiot = prescripcionesMedicasQuimiot;
    }

    public TratamientosQuimioterapia getTratamientosQuimioterapia() {
        return tratamientosQuimioterapia;
    }

    public void setTratamientosQuimioterapia(TratamientosQuimioterapia tratamientosQuimioterapia) {
        this.tratamientosQuimioterapia = tratamientosQuimioterapia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dosisQuimioterapiaPK != null ? dosisQuimioterapiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DosisQuimioterapia)) {
            return false;
        }
        DosisQuimioterapia other = (DosisQuimioterapia) object;
        if ((this.dosisQuimioterapiaPK == null && other.dosisQuimioterapiaPK != null) || (this.dosisQuimioterapiaPK != null && !this.dosisQuimioterapiaPK.equals(other.dosisQuimioterapiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DosisQuimioterapia[ dosisQuimioterapiaPK=" + dosisQuimioterapiaPK + " ]";
    }
    
}
