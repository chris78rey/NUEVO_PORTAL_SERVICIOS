/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DETALLES_MOVIMIENTOS_BANCOS")
@NamedQueries({
    @NamedQuery(name = "DetallesMovimientosBancos.findAll", query = "SELECT d FROM DetallesMovimientosBancos d")})
public class DetallesMovimientosBancos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLMVMBNC_ID")
    private Integer dtlmvmbncId;
    @Column(name = "MVM_MVM_ID")
    private Long mvmMvmId;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBE")
    private BigDecimal debe;
    @Column(name = "HABER")
    private BigDecimal haber;
    @Column(name = "TPOMVM_CODIGO")
    private String tpomvmCodigo;
    @Column(name = "ESTADO_GENERA")
    private Character estadoGenera;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "ASOCIACION")
    private String asociacion;
    @JoinColumn(name = "MVMBNCCNT_MVMBNCCNT_ID", referencedColumnName = "MVMBNCCNT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MovimientosBancosCnt movimientosBancosCnt;

    public DetallesMovimientosBancos() {
    }

    public DetallesMovimientosBancos(Integer dtlmvmbncId) {
        this.dtlmvmbncId = dtlmvmbncId;
    }

    public Integer getDtlmvmbncId() {
        return dtlmvmbncId;
    }

    public void setDtlmvmbncId(Integer dtlmvmbncId) {
        this.dtlmvmbncId = dtlmvmbncId;
    }

    public Long getMvmMvmId() {
        return mvmMvmId;
    }

    public void setMvmMvmId(Long mvmMvmId) {
        this.mvmMvmId = mvmMvmId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getTpomvmCodigo() {
        return tpomvmCodigo;
    }

    public void setTpomvmCodigo(String tpomvmCodigo) {
        this.tpomvmCodigo = tpomvmCodigo;
    }

    public Character getEstadoGenera() {
        return estadoGenera;
    }

    public void setEstadoGenera(Character estadoGenera) {
        this.estadoGenera = estadoGenera;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public String getAsociacion() {
        return asociacion;
    }

    public void setAsociacion(String asociacion) {
        this.asociacion = asociacion;
    }

    public MovimientosBancosCnt getMovimientosBancosCnt() {
        return movimientosBancosCnt;
    }

    public void setMovimientosBancosCnt(MovimientosBancosCnt movimientosBancosCnt) {
        this.movimientosBancosCnt = movimientosBancosCnt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlmvmbncId != null ? dtlmvmbncId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesMovimientosBancos)) {
            return false;
        }
        DetallesMovimientosBancos other = (DetallesMovimientosBancos) object;
        if ((this.dtlmvmbncId == null && other.dtlmvmbncId != null) || (this.dtlmvmbncId != null && !this.dtlmvmbncId.equals(other.dtlmvmbncId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesMovimientosBancos[ dtlmvmbncId=" + dtlmvmbncId + " ]";
    }
    
}
