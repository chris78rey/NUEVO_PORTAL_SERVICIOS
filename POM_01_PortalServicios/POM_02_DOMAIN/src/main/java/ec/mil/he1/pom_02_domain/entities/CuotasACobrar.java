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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CUOTAS_A_COBRAR")
@NamedQueries({
    @NamedQuery(name = "CuotasACobrar.findAll", query = "SELECT c FROM CuotasACobrar c")})
public class CuotasACobrar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "MONEDA_DE_TRABAJO")
    private String monedaDeTrabajo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "VALORE")
    private BigDecimal valore;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "RETENCION_FUENTE")
    private BigInteger retencionFuente;
    @Column(name = "ANULADO_POR")
    private String anuladoPor;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "OBL_OBL_ID")
    private Long oblOblId;
    @Column(name = "RETENCION")
    private BigDecimal retencion;
    @Column(name = "SUBRETENCION")
    private BigDecimal subretencion;
    @Column(name = "FORMULA_RETENCION")
    private String formulaRetencion;
    @Column(name = "FECHA_PLAZO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPlazo;
    @Column(name = "RETIENE_IVA")
    private Character retieneIva;
    @Column(name = "CODIGO_RF")
    private String codigoRf;
    @Column(name = "FECHA_RET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRet;
    @Column(name = "ESTADO_RET")
    private String estadoRet;
    @Column(name = "INTERES")
    private BigDecimal interes;
    @Column(name = "INTERES_PORCENTAJE")
    private BigDecimal interesPorcentaje;
    @Column(name = "MORA")
    private BigDecimal mora;
    @Column(name = "MORA_PORCENTAJE")
    private BigDecimal moraPorcentaje;
    @Column(name = "SALDO")
    private BigDecimal saldo;
    @Column(name = "NUMERO_CUOTA")
    private Short numeroCuota;
    @Column(name = "COTCBRAMR_NUMERO")
    private Long cotcbramrNumero;
    @JoinColumn(name = "CJA_CODIGO_RETENIDA_EN", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cajas cajas;
    @JoinColumn(name = "CJA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cajas cajas1;
    @JoinColumn(name = "CTACBR_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CuentasPorCobrar cuentasPorCobrar;
    @JoinColumn(name = "MDOPGO_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModoDePago modoDePago;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuotasACobrar", fetch = FetchType.LAZY)
    private List<DetallePagosAgrupados> detallePagosAgrupadosList;

    public CuotasACobrar() {
    }

    public CuotasACobrar(Long numero) {
        this.numero = numero;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getMonedaDeTrabajo() {
        return monedaDeTrabajo;
    }

    public void setMonedaDeTrabajo(String monedaDeTrabajo) {
        this.monedaDeTrabajo = monedaDeTrabajo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
    }

    public BigDecimal getValore() {
        return valore;
    }

    public void setValore(BigDecimal valore) {
        this.valore = valore;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigInteger getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(BigInteger retencionFuente) {
        this.retencionFuente = retencionFuente;
    }

    public String getAnuladoPor() {
        return anuladoPor;
    }

    public void setAnuladoPor(String anuladoPor) {
        this.anuladoPor = anuladoPor;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getOblOblId() {
        return oblOblId;
    }

    public void setOblOblId(Long oblOblId) {
        this.oblOblId = oblOblId;
    }

    public BigDecimal getRetencion() {
        return retencion;
    }

    public void setRetencion(BigDecimal retencion) {
        this.retencion = retencion;
    }

    public BigDecimal getSubretencion() {
        return subretencion;
    }

    public void setSubretencion(BigDecimal subretencion) {
        this.subretencion = subretencion;
    }

    public String getFormulaRetencion() {
        return formulaRetencion;
    }

    public void setFormulaRetencion(String formulaRetencion) {
        this.formulaRetencion = formulaRetencion;
    }

    public Date getFechaPlazo() {
        return fechaPlazo;
    }

    public void setFechaPlazo(Date fechaPlazo) {
        this.fechaPlazo = fechaPlazo;
    }

    public Character getRetieneIva() {
        return retieneIva;
    }

    public void setRetieneIva(Character retieneIva) {
        this.retieneIva = retieneIva;
    }

    public String getCodigoRf() {
        return codigoRf;
    }

    public void setCodigoRf(String codigoRf) {
        this.codigoRf = codigoRf;
    }

    public Date getFechaRet() {
        return fechaRet;
    }

    public void setFechaRet(Date fechaRet) {
        this.fechaRet = fechaRet;
    }

    public String getEstadoRet() {
        return estadoRet;
    }

    public void setEstadoRet(String estadoRet) {
        this.estadoRet = estadoRet;
    }

    public BigDecimal getInteres() {
        return interes;
    }

    public void setInteres(BigDecimal interes) {
        this.interes = interes;
    }

    public BigDecimal getInteresPorcentaje() {
        return interesPorcentaje;
    }

    public void setInteresPorcentaje(BigDecimal interesPorcentaje) {
        this.interesPorcentaje = interesPorcentaje;
    }

    public BigDecimal getMora() {
        return mora;
    }

    public void setMora(BigDecimal mora) {
        this.mora = mora;
    }

    public BigDecimal getMoraPorcentaje() {
        return moraPorcentaje;
    }

    public void setMoraPorcentaje(BigDecimal moraPorcentaje) {
        this.moraPorcentaje = moraPorcentaje;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Short getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Short numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Long getCotcbramrNumero() {
        return cotcbramrNumero;
    }

    public void setCotcbramrNumero(Long cotcbramrNumero) {
        this.cotcbramrNumero = cotcbramrNumero;
    }

    public Cajas getCajas() {
        return cajas;
    }

    public void setCajas(Cajas cajas) {
        this.cajas = cajas;
    }

    public Cajas getCajas1() {
        return cajas1;
    }

    public void setCajas1(Cajas cajas1) {
        this.cajas1 = cajas1;
    }

    public CuentasPorCobrar getCuentasPorCobrar() {
        return cuentasPorCobrar;
    }

    public void setCuentasPorCobrar(CuentasPorCobrar cuentasPorCobrar) {
        this.cuentasPorCobrar = cuentasPorCobrar;
    }

    public ModoDePago getModoDePago() {
        return modoDePago;
    }

    public void setModoDePago(ModoDePago modoDePago) {
        this.modoDePago = modoDePago;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<DetallePagosAgrupados> getDetallePagosAgrupadosList() {
        return detallePagosAgrupadosList;
    }

    public void setDetallePagosAgrupadosList(List<DetallePagosAgrupados> detallePagosAgrupadosList) {
        this.detallePagosAgrupadosList = detallePagosAgrupadosList;
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
        if (!(object instanceof CuotasACobrar)) {
            return false;
        }
        CuotasACobrar other = (CuotasACobrar) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CuotasACobrar[ numero=" + numero + " ]";
    }
    
}
