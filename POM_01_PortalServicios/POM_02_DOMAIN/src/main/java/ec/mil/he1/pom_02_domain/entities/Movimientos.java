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
import javax.persistence.JoinColumns;
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
@Table(name = "MOVIMIENTOS")
@NamedQueries({
    @NamedQuery(name = "Movimientos.findAll", query = "SELECT m FROM Movimientos m")})
public class Movimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MVM_ID")
    private Long mvmId;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "CMP_TPOCMPEMP_EMP_CODIGO")
    private String cmpTpocmpempEmpCodigo;
    @Column(name = "CMP_TPOCMPEMP_TPOCMP_CODIGO")
    private String cmpTpocmpempTpocmpCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "SECUENCIA")
    private Short secuencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBE")
    private BigDecimal debe;
    @Column(name = "HABER")
    private BigDecimal haber;
    @Column(name = "DEBEE")
    private BigDecimal debee;
    @Column(name = "HABERE")
    private BigDecimal habere;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "TIPO_DE_CAMBIO")
    private BigDecimal tipoDeCambio;
    @Column(name = "MAYORIZADO")
    private Character mayorizado;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ASOCIACION")
    private String asociacion;
    @Column(name = "ESTADO_MOVIMIENTO")
    private Character estadoMovimiento;
    @Column(name = "COMPROMISO")
    private Character compromiso;
    @Column(name = "OBLIGACION")
    private Character obligacion;
    @Column(name = "PAGO")
    private Character pago;
    @Column(name = "AJUSTE_PRESUPUESTARIO")
    private Character ajustePresupuestario;
    @JoinColumn(name = "OBL_OBL_ID", referencedColumnName = "OBL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Obligaciones obligaciones;
    @JoinColumns({
        @JoinColumn(name = "SS_S_A_SC_CNT_MYR_EMP_CODIGO", referencedColumnName = "S_S_A_SC_CNT_MYR_EMP_CODIGO"),
        @JoinColumn(name = "SS_S_A_SC_CNT_MYR_CODIGO", referencedColumnName = "S_S_A_SC_CNT_MYR_CODIGO"),
        @JoinColumn(name = "SS_S_A_SC_CNT_CODIGO", referencedColumnName = "S_S_A_SC_CNT_CODIGO"),
        @JoinColumn(name = "SS_S_A_SC_CODIGO", referencedColumnName = "S_S_A_SC_CODIGO"),
        @JoinColumn(name = "SS_S_A_CODIGO", referencedColumnName = "S_S_A_CODIGO"),
        @JoinColumn(name = "SS_S_CODIGO", referencedColumnName = "S_S_CODIGO"),
        @JoinColumn(name = "SS_CODIGO", referencedColumnName = "S_CODIGO"),
        @JoinColumn(name = "S_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Subauxiliares3 subauxiliares3;

    public Movimientos() {
    }

    public Movimientos(Long mvmId) {
        this.mvmId = mvmId;
    }

    public Long getMvmId() {
        return mvmId;
    }

    public void setMvmId(Long mvmId) {
        this.mvmId = mvmId;
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

    public String getCmpTpocmpempEmpCodigo() {
        return cmpTpocmpempEmpCodigo;
    }

    public void setCmpTpocmpempEmpCodigo(String cmpTpocmpempEmpCodigo) {
        this.cmpTpocmpempEmpCodigo = cmpTpocmpempEmpCodigo;
    }

    public String getCmpTpocmpempTpocmpCodigo() {
        return cmpTpocmpempTpocmpCodigo;
    }

    public void setCmpTpocmpempTpocmpCodigo(String cmpTpocmpempTpocmpCodigo) {
        this.cmpTpocmpempTpocmpCodigo = cmpTpocmpempTpocmpCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Short secuencia) {
        this.secuencia = secuencia;
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

    public BigDecimal getDebee() {
        return debee;
    }

    public void setDebee(BigDecimal debee) {
        this.debee = debee;
    }

    public BigDecimal getHabere() {
        return habere;
    }

    public void setHabere(BigDecimal habere) {
        this.habere = habere;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(BigDecimal tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public Character getMayorizado() {
        return mayorizado;
    }

    public void setMayorizado(Character mayorizado) {
        this.mayorizado = mayorizado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAsociacion() {
        return asociacion;
    }

    public void setAsociacion(String asociacion) {
        this.asociacion = asociacion;
    }

    public Character getEstadoMovimiento() {
        return estadoMovimiento;
    }

    public void setEstadoMovimiento(Character estadoMovimiento) {
        this.estadoMovimiento = estadoMovimiento;
    }

    public Character getCompromiso() {
        return compromiso;
    }

    public void setCompromiso(Character compromiso) {
        this.compromiso = compromiso;
    }

    public Character getObligacion() {
        return obligacion;
    }

    public void setObligacion(Character obligacion) {
        this.obligacion = obligacion;
    }

    public Character getPago() {
        return pago;
    }

    public void setPago(Character pago) {
        this.pago = pago;
    }

    public Character getAjustePresupuestario() {
        return ajustePresupuestario;
    }

    public void setAjustePresupuestario(Character ajustePresupuestario) {
        this.ajustePresupuestario = ajustePresupuestario;
    }

    public Obligaciones getObligaciones() {
        return obligaciones;
    }

    public void setObligaciones(Obligaciones obligaciones) {
        this.obligaciones = obligaciones;
    }

    public Subauxiliares3 getSubauxiliares3() {
        return subauxiliares3;
    }

    public void setSubauxiliares3(Subauxiliares3 subauxiliares3) {
        this.subauxiliares3 = subauxiliares3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mvmId != null ? mvmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimientos)) {
            return false;
        }
        Movimientos other = (Movimientos) object;
        if ((this.mvmId == null && other.mvmId != null) || (this.mvmId != null && !this.mvmId.equals(other.mvmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Movimientos[ mvmId=" + mvmId + " ]";
    }
    
}
