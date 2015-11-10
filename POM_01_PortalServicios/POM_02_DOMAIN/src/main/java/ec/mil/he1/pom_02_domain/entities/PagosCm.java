/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PAGOS_CM")
@NamedQueries({
    @NamedQuery(name = "PagosCm.findAll", query = "SELECT p FROM PagosCm p")})
public class PagosCm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FORMA_PAGO")
    private String formaPago;
    @Column(name = "FECHA_CONTABILIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContabilizacion;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "RETENCION")
    private BigDecimal retencion;
    @Column(name = "SUBRETENCION")
    private BigDecimal subretencion;
    @Column(name = "FORMULA_RETENCION")
    private String formulaRetencion;
    @Column(name = "FECHA_RF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRf;
    @Column(name = "ESTADO_RF")
    private String estadoRf;
    @Column(name = "CODIGO_RF")
    private String codigoRf;
    @OneToMany(mappedBy = "pagosCm", fetch = FetchType.LAZY)
    private List<NotasCm> notasCmList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pagosCm", fetch = FetchType.LAZY)
    private List<DetallesPagoCm> detallesPagoCmList;
    @OneToMany(mappedBy = "pagosCm", fetch = FetchType.LAZY)
    private List<MovimientosDeCuenta> movimientosDeCuentaList;
    @JoinColumn(name = "ANT_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Anticipos anticipos;
    @JoinColumn(name = "CJA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cajas cajas;
    @JoinColumn(name = "MDOPGO_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private ModoDePago modoDePago;
    @JoinColumn(name = "PLNHNRMDC_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanillasHonorariosMdc planillasHonorariosMdc;

    public PagosCm() {
    }

    public PagosCm(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Date getFechaContabilizacion() {
        return fechaContabilizacion;
    }

    public void setFechaContabilizacion(Date fechaContabilizacion) {
        this.fechaContabilizacion = fechaContabilizacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
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

    public Date getFechaRf() {
        return fechaRf;
    }

    public void setFechaRf(Date fechaRf) {
        this.fechaRf = fechaRf;
    }

    public String getEstadoRf() {
        return estadoRf;
    }

    public void setEstadoRf(String estadoRf) {
        this.estadoRf = estadoRf;
    }

    public String getCodigoRf() {
        return codigoRf;
    }

    public void setCodigoRf(String codigoRf) {
        this.codigoRf = codigoRf;
    }

    public List<NotasCm> getNotasCmList() {
        return notasCmList;
    }

    public void setNotasCmList(List<NotasCm> notasCmList) {
        this.notasCmList = notasCmList;
    }

    public List<DetallesPagoCm> getDetallesPagoCmList() {
        return detallesPagoCmList;
    }

    public void setDetallesPagoCmList(List<DetallesPagoCm> detallesPagoCmList) {
        this.detallesPagoCmList = detallesPagoCmList;
    }

    public List<MovimientosDeCuenta> getMovimientosDeCuentaList() {
        return movimientosDeCuentaList;
    }

    public void setMovimientosDeCuentaList(List<MovimientosDeCuenta> movimientosDeCuentaList) {
        this.movimientosDeCuentaList = movimientosDeCuentaList;
    }

    public Anticipos getAnticipos() {
        return anticipos;
    }

    public void setAnticipos(Anticipos anticipos) {
        this.anticipos = anticipos;
    }

    public Cajas getCajas() {
        return cajas;
    }

    public void setCajas(Cajas cajas) {
        this.cajas = cajas;
    }

    public ModoDePago getModoDePago() {
        return modoDePago;
    }

    public void setModoDePago(ModoDePago modoDePago) {
        this.modoDePago = modoDePago;
    }

    public PlanillasHonorariosMdc getPlanillasHonorariosMdc() {
        return planillasHonorariosMdc;
    }

    public void setPlanillasHonorariosMdc(PlanillasHonorariosMdc planillasHonorariosMdc) {
        this.planillasHonorariosMdc = planillasHonorariosMdc;
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
        if (!(object instanceof PagosCm)) {
            return false;
        }
        PagosCm other = (PagosCm) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PagosCm[ numero=" + numero + " ]";
    }
    
}
