/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "MOVIMIENTOS_ACTIVOS_FIJOS")
@NamedQueries({
    @NamedQuery(name = "MovimientosActivosFijos.findAll", query = "SELECT m FROM MovimientosActivosFijos m")})
public class MovimientosActivosFijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
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
    @Column(name = "MVM_NUMERO")
    private Integer mvmNumero;
    @Column(name = "MVM_TIPO")
    private String mvmTipo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBE")
    private BigDecimal debe;
    @Column(name = "HABER")
    private BigDecimal haber;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "REFERENCIA")
    private Integer referencia;

    public MovimientosActivosFijos() {
    }

    public MovimientosActivosFijos(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public Integer getMvmNumero() {
        return mvmNumero;
    }

    public void setMvmNumero(Integer mvmNumero) {
        this.mvmNumero = mvmNumero;
    }

    public String getMvmTipo() {
        return mvmTipo;
    }

    public void setMvmTipo(String mvmTipo) {
        this.mvmTipo = mvmTipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getDebe() {
        return debe;
    }

    public void setDebe(BigDecimal debe) {
        this.debe = debe;
    }

    public BigDecimal getHaber() {
        return haber;
    }

    public void setHaber(BigDecimal haber) {
        this.haber = haber;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getReferencia() {
        return referencia;
    }

    public void setReferencia(Integer referencia) {
        this.referencia = referencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosActivosFijos)) {
            return false;
        }
        MovimientosActivosFijos other = (MovimientosActivosFijos) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MovimientosActivosFijos[ numero=" + numero + " ]";
    }
    
}
