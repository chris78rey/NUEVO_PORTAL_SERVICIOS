/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EXCEPCIONES_PROMOCIONES")
@NamedQueries({
    @NamedQuery(name = "ExcepcionesPromociones.findAll", query = "SELECT e FROM ExcepcionesPromociones e")})
public class ExcepcionesPromociones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXCPRM_ID")
    private Long excprmId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE_PROMOCION")
    private BigDecimal porcentajePromocion;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "VALOR_FIJADO")
    private BigDecimal valorFijado;
    @Column(name = "UVRS")
    private BigDecimal uvrs;
    @JoinColumns({
        @JoinColumn(name = "CRG_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "CRG_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Cargos cargos;
    @JoinColumns({
        @JoinColumn(name = "DTLPRM_PRM_CODIGO", referencedColumnName = "PRM_CODIGO"),
        @JoinColumn(name = "DTLPRM_DPR_CODIGO", referencedColumnName = "DPR_CODIGO"),
        @JoinColumn(name = "DTLPRM_DPR_ARA_CODIGO", referencedColumnName = "DPR_ARA_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private DetallesPromociones detallesPromociones;
    @JoinColumns({
        @JoinColumn(name = "ITM_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "ITM_SBS_SCC_CODIGO", referencedColumnName = "SBS_SCC_CODIGO"),
        @JoinColumn(name = "ITM_SBS_CODIGO", referencedColumnName = "SBS_CODIGO"),
        @JoinColumn(name = "ITM_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Items items;

    public ExcepcionesPromociones() {
    }

    public ExcepcionesPromociones(Long excprmId) {
        this.excprmId = excprmId;
    }

    public Long getExcprmId() {
        return excprmId;
    }

    public void setExcprmId(Long excprmId) {
        this.excprmId = excprmId;
    }

    public BigDecimal getPorcentajePromocion() {
        return porcentajePromocion;
    }

    public void setPorcentajePromocion(BigDecimal porcentajePromocion) {
        this.porcentajePromocion = porcentajePromocion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getValorFijado() {
        return valorFijado;
    }

    public void setValorFijado(BigDecimal valorFijado) {
        this.valorFijado = valorFijado;
    }

    public BigDecimal getUvrs() {
        return uvrs;
    }

    public void setUvrs(BigDecimal uvrs) {
        this.uvrs = uvrs;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public DetallesPromociones getDetallesPromociones() {
        return detallesPromociones;
    }

    public void setDetallesPromociones(DetallesPromociones detallesPromociones) {
        this.detallesPromociones = detallesPromociones;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (excprmId != null ? excprmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcepcionesPromociones)) {
            return false;
        }
        ExcepcionesPromociones other = (ExcepcionesPromociones) object;
        if ((this.excprmId == null && other.excprmId != null) || (this.excprmId != null && !this.excprmId.equals(other.excprmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ExcepcionesPromociones[ excprmId=" + excprmId + " ]";
    }
    
}
