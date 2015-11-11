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
@Table(name = "DETALLES_EGRESOS_ACTIVOS")
@NamedQueries({
    @NamedQuery(name = "DetallesEgresosActivos.findAll", query = "SELECT d FROM DetallesEgresosActivos d")})
public class DetallesEgresosActivos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesEgresosActivosPK detallesEgresosActivosPK;
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
    @Column(name = "MOTIVO_EGRESO")
    private String motivoEgreso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "DEPRECIACION_ACUMULADA")
    private BigDecimal depreciacionAcumulada;
    @Column(name = "VALOR_ACTUAL")
    private BigDecimal valorActual;
    @Column(name = "ESTADO")
    private String estado;

    public DetallesEgresosActivos() {
    }

    public DetallesEgresosActivos(DetallesEgresosActivosPK detallesEgresosActivosPK) {
        this.detallesEgresosActivosPK = detallesEgresosActivosPK;
    }

    public DetallesEgresosActivos(String egractfjoEmpCodigo, int egractfjoNumero, int numero) {
        this.detallesEgresosActivosPK = new DetallesEgresosActivosPK(egractfjoEmpCodigo, egractfjoNumero, numero);
    }

    public DetallesEgresosActivosPK getDetallesEgresosActivosPK() {
        return detallesEgresosActivosPK;
    }

    public void setDetallesEgresosActivosPK(DetallesEgresosActivosPK detallesEgresosActivosPK) {
        this.detallesEgresosActivosPK = detallesEgresosActivosPK;
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

    public String getMotivoEgreso() {
        return motivoEgreso;
    }

    public void setMotivoEgreso(String motivoEgreso) {
        this.motivoEgreso = motivoEgreso;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getDepreciacionAcumulada() {
        return depreciacionAcumulada;
    }

    public void setDepreciacionAcumulada(BigDecimal depreciacionAcumulada) {
        this.depreciacionAcumulada = depreciacionAcumulada;
    }

    public BigDecimal getValorActual() {
        return valorActual;
    }

    public void setValorActual(BigDecimal valorActual) {
        this.valorActual = valorActual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesEgresosActivosPK != null ? detallesEgresosActivosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesEgresosActivos)) {
            return false;
        }
        DetallesEgresosActivos other = (DetallesEgresosActivos) object;
        if ((this.detallesEgresosActivosPK == null && other.detallesEgresosActivosPK != null) || (this.detallesEgresosActivosPK != null && !this.detallesEgresosActivosPK.equals(other.detallesEgresosActivosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesEgresosActivos[ detallesEgresosActivosPK=" + detallesEgresosActivosPK + " ]";
    }
    
}
