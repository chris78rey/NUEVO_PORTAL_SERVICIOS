/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "DETALLES_DEPRECIACIONES")
@NamedQueries({
    @NamedQuery(name = "DetallesDepreciaciones.findAll", query = "SELECT d FROM DetallesDepreciaciones d")})
public class DetallesDepreciaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesDepreciacionesPK detallesDepreciacionesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_INICIAL")
    private BigDecimal valorInicial;
    @Column(name = "PORCENTAJE_DEPRECIACION")
    private BigDecimal porcentajeDepreciacion;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "VALOR_ACUMULADO")
    private BigDecimal valorAcumulado;
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumns({
        @JoinColumn(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO", referencedColumnName = "SBGACTFJO_GRPACTFJO_EMP_CODIGO"),
        @JoinColumn(name = "ACTFSBGACTFJO_GRPACTFJO_CODIGO", referencedColumnName = "ACTFSBGACTFJO_GRPACTFJO_CODIGO"),
        @JoinColumn(name = "ACTFACTFJOGNR_SBGACTFJO_CODIGO", referencedColumnName = "ACTFJOGNR_SBGACTFJO_CODIGO"),
        @JoinColumn(name = "ACTFJOESP_ACTFJOGNR_CODIGO", referencedColumnName = "ACTFJOGNR_CODIGO"),
        @JoinColumn(name = "ACTFJOESP_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ActivosFijosEspecificos activosFijosEspecificos;
    @JoinColumns({
        @JoinColumn(name = "DPRACF_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "DPRACF_ANIO", referencedColumnName = "ANIO", insertable = false, updatable = false),
        @JoinColumn(name = "DPRACF_MES", referencedColumnName = "MES", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Depreciaciones depreciaciones;

    public DetallesDepreciaciones() {
    }

    public DetallesDepreciaciones(DetallesDepreciacionesPK detallesDepreciacionesPK) {
        this.detallesDepreciacionesPK = detallesDepreciacionesPK;
    }

    public DetallesDepreciaciones(String dpracfEmpCodigo, short dpracfAnio, short dpracfMes, int numero) {
        this.detallesDepreciacionesPK = new DetallesDepreciacionesPK(dpracfEmpCodigo, dpracfAnio, dpracfMes, numero);
    }

    public DetallesDepreciacionesPK getDetallesDepreciacionesPK() {
        return detallesDepreciacionesPK;
    }

    public void setDetallesDepreciacionesPK(DetallesDepreciacionesPK detallesDepreciacionesPK) {
        this.detallesDepreciacionesPK = detallesDepreciacionesPK;
    }

    public BigDecimal getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(BigDecimal valorInicial) {
        this.valorInicial = valorInicial;
    }

    public BigDecimal getPorcentajeDepreciacion() {
        return porcentajeDepreciacion;
    }

    public void setPorcentajeDepreciacion(BigDecimal porcentajeDepreciacion) {
        this.porcentajeDepreciacion = porcentajeDepreciacion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorAcumulado() {
        return valorAcumulado;
    }

    public void setValorAcumulado(BigDecimal valorAcumulado) {
        this.valorAcumulado = valorAcumulado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ActivosFijosEspecificos getActivosFijosEspecificos() {
        return activosFijosEspecificos;
    }

    public void setActivosFijosEspecificos(ActivosFijosEspecificos activosFijosEspecificos) {
        this.activosFijosEspecificos = activosFijosEspecificos;
    }

    public Depreciaciones getDepreciaciones() {
        return depreciaciones;
    }

    public void setDepreciaciones(Depreciaciones depreciaciones) {
        this.depreciaciones = depreciaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesDepreciacionesPK != null ? detallesDepreciacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDepreciaciones)) {
            return false;
        }
        DetallesDepreciaciones other = (DetallesDepreciaciones) object;
        if ((this.detallesDepreciacionesPK == null && other.detallesDepreciacionesPK != null) || (this.detallesDepreciacionesPK != null && !this.detallesDepreciacionesPK.equals(other.detallesDepreciacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesDepreciaciones[ detallesDepreciacionesPK=" + detallesDepreciacionesPK + " ]";
    }
    
}
