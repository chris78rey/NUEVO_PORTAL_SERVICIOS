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
@Table(name = "DETALLES_REGULACIONES_ACTIVOS")
@NamedQueries({
    @NamedQuery(name = "DetallesRegulacionesActivos.findAll", query = "SELECT d FROM DetallesRegulacionesActivos d")})
public class DetallesRegulacionesActivos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesRegulacionesActivosPK detallesRegulacionesActivosPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "VALOR_ANTERIOR")
    private BigDecimal valorAnterior;
    @JoinColumns({
        @JoinColumn(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO", referencedColumnName = "SBGACTFJO_GRPACTFJO_EMP_CODIGO"),
        @JoinColumn(name = "ACTFSBGACTFJO_GRPACTFJO_CODIGO", referencedColumnName = "ACTFSBGACTFJO_GRPACTFJO_CODIGO"),
        @JoinColumn(name = "ACTFACTFJOGNR_SBGACTFJO_CODIGO", referencedColumnName = "ACTFJOGNR_SBGACTFJO_CODIGO"),
        @JoinColumn(name = "ACTFJOESP_ACTFJOGNR_CODIGO", referencedColumnName = "ACTFJOGNR_CODIGO"),
        @JoinColumn(name = "ACTFJOESP_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ActivosFijosEspecificos activosFijosEspecificos;
    @JoinColumns({
        @JoinColumn(name = "RGLACTFJO_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "RGLACTFJO_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RegulacionesActivosFijos regulacionesActivosFijos;

    public DetallesRegulacionesActivos() {
    }

    public DetallesRegulacionesActivos(DetallesRegulacionesActivosPK detallesRegulacionesActivosPK) {
        this.detallesRegulacionesActivosPK = detallesRegulacionesActivosPK;
    }

    public DetallesRegulacionesActivos(String rglactfjoEmpCodigo, int rglactfjoNumero, int numero) {
        this.detallesRegulacionesActivosPK = new DetallesRegulacionesActivosPK(rglactfjoEmpCodigo, rglactfjoNumero, numero);
    }

    public DetallesRegulacionesActivosPK getDetallesRegulacionesActivosPK() {
        return detallesRegulacionesActivosPK;
    }

    public void setDetallesRegulacionesActivosPK(DetallesRegulacionesActivosPK detallesRegulacionesActivosPK) {
        this.detallesRegulacionesActivosPK = detallesRegulacionesActivosPK;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(BigDecimal valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public ActivosFijosEspecificos getActivosFijosEspecificos() {
        return activosFijosEspecificos;
    }

    public void setActivosFijosEspecificos(ActivosFijosEspecificos activosFijosEspecificos) {
        this.activosFijosEspecificos = activosFijosEspecificos;
    }

    public RegulacionesActivosFijos getRegulacionesActivosFijos() {
        return regulacionesActivosFijos;
    }

    public void setRegulacionesActivosFijos(RegulacionesActivosFijos regulacionesActivosFijos) {
        this.regulacionesActivosFijos = regulacionesActivosFijos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesRegulacionesActivosPK != null ? detallesRegulacionesActivosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesRegulacionesActivos)) {
            return false;
        }
        DetallesRegulacionesActivos other = (DetallesRegulacionesActivos) object;
        if ((this.detallesRegulacionesActivosPK == null && other.detallesRegulacionesActivosPK != null) || (this.detallesRegulacionesActivosPK != null && !this.detallesRegulacionesActivosPK.equals(other.detallesRegulacionesActivosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesRegulacionesActivos[ detallesRegulacionesActivosPK=" + detallesRegulacionesActivosPK + " ]";
    }
    
}
