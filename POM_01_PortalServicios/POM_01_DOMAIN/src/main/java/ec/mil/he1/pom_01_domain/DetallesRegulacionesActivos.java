/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "DETALLES_REGULACIONES_ACTIVOS")
@NamedQueries({
    @NamedQuery(name = "DetallesRegulacionesActivos.findAll", query = "SELECT d FROM DetallesRegulacionesActivos d")})
public class DetallesRegulacionesActivos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesRegulacionesActivosPK detallesRegulacionesActivosPK;
    @Column(name = "SBGACTFJO_GRPACTFJO_EMP_CODIGO")
    private String sbgactfjoGrpactfjoEmpCodigo;
    @Column(name = "ACTFSBGACTFJO_GRPACTFJO_CODIGO")
    private Short actfsbgactfjoGrpactfjoCodigo;
    @Column(name = "ACTFACTFJOGNR_SBGACTFJO_CODIGO")
    private Short actfactfjognrSbgactfjoCodigo;
    @Column(name = "ACTFJOESP_ACTFJOGNR_CODIGO")
    private Short actfjoespActfjognrCodigo;
    @Column(name = "ACTFJOESP_CODIGO")
    private Short actfjoespCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "VALOR_ANTERIOR")
    private BigDecimal valorAnterior;

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

    public String getSbgactfjoGrpactfjoEmpCodigo() {
        return sbgactfjoGrpactfjoEmpCodigo;
    }

    public void setSbgactfjoGrpactfjoEmpCodigo(String sbgactfjoGrpactfjoEmpCodigo) {
        this.sbgactfjoGrpactfjoEmpCodigo = sbgactfjoGrpactfjoEmpCodigo;
    }

    public Short getActfsbgactfjoGrpactfjoCodigo() {
        return actfsbgactfjoGrpactfjoCodigo;
    }

    public void setActfsbgactfjoGrpactfjoCodigo(Short actfsbgactfjoGrpactfjoCodigo) {
        this.actfsbgactfjoGrpactfjoCodigo = actfsbgactfjoGrpactfjoCodigo;
    }

    public Short getActfactfjognrSbgactfjoCodigo() {
        return actfactfjognrSbgactfjoCodigo;
    }

    public void setActfactfjognrSbgactfjoCodigo(Short actfactfjognrSbgactfjoCodigo) {
        this.actfactfjognrSbgactfjoCodigo = actfactfjognrSbgactfjoCodigo;
    }

    public Short getActfjoespActfjognrCodigo() {
        return actfjoespActfjognrCodigo;
    }

    public void setActfjoespActfjognrCodigo(Short actfjoespActfjognrCodigo) {
        this.actfjoespActfjognrCodigo = actfjoespActfjognrCodigo;
    }

    public Short getActfjoespCodigo() {
        return actfjoespCodigo;
    }

    public void setActfjoespCodigo(Short actfjoespCodigo) {
        this.actfjoespCodigo = actfjoespCodigo;
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
        return "ec.mil.he1.pom_01_domain.DetallesRegulacionesActivos[ detallesRegulacionesActivosPK=" + detallesRegulacionesActivosPK + " ]";
    }
    
}
