/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TRANSACCIONES_JN")
@NamedQueries({
    @NamedQuery(name = "TransaccionesJn.findAll", query = "SELECT t FROM TransaccionesJn t")})
public class TransaccionesJn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Column(name = "ITM_CODIGO")
    private Short itmCodigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Column(name = "TRNS_TRN_ID")
    private BigDecimal trnsTrnId;
    @Column(name = "NUMERO_EGRESO")
    private BigInteger numeroEgreso;
    @Column(name = "FECHA_ANULACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAnulacion;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "TIPO_EGRESO")
    private String tipoEgreso;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @JoinColumn(name = "TRNS_TRN_ID", referencedColumnName = "TRN_ID", insertable = false, updatable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Transacciones transacciones;

    public TransaccionesJn() {
    }

    public TransaccionesJn(BigDecimal trnsTrnId) {
        this.trnsTrnId = trnsTrnId;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public Short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(Short itmCodigo) {
        this.itmCodigo = itmCodigo;
    }

    public BigDecimal getTrnsTrnId() {
        return trnsTrnId;
    }

    public void setTrnsTrnId(BigDecimal trnsTrnId) {
        this.trnsTrnId = trnsTrnId;
    }

    public BigInteger getNumeroEgreso() {
        return numeroEgreso;
    }

    public void setNumeroEgreso(BigInteger numeroEgreso) {
        this.numeroEgreso = numeroEgreso;
    }

    public Date getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(Date fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoEgreso() {
        return tipoEgreso;
    }

    public void setTipoEgreso(String tipoEgreso) {
        this.tipoEgreso = tipoEgreso;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public Transacciones getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Transacciones transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnsTrnId != null ? trnsTrnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TransaccionesJn)) {
            return false;
        }
        TransaccionesJn other = (TransaccionesJn) object;
        if ((this.trnsTrnId == null && other.trnsTrnId != null) || (this.trnsTrnId != null && !this.trnsTrnId.equals(other.trnsTrnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TransaccionesJn[ trnsTrnId=" + trnsTrnId + " ]";
    }
    
}
