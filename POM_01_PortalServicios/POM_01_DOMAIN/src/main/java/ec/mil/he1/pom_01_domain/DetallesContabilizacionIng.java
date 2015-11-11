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
@Table(name = "DETALLES_CONTABILIZACION_ING")
@NamedQueries({
    @NamedQuery(name = "DetallesContabilizacionIng.findAll", query = "SELECT d FROM DetallesContabilizacionIng d")})
public class DetallesContabilizacionIng implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLCNTING_ID")
    private Long dtlcntingId;
    @Column(name = "CNTING_CNTING_ID")
    private Long cntingCntingId;
    @Column(name = "CJA_CODIGO")
    private String cjaCodigo;
    @Column(name = "CTACBR_NUMERO")
    private String ctacbrNumero;
    @Column(name = "NUMERO_HC")
    private Integer numeroHc;
    @Column(name = "APELLIDO_PATERNO")
    private String apellidoPaterno;
    @Column(name = "APELLIDO_MATERNO")
    private String apellidoMaterno;
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Column(name = "CLNPGA_TIPO_CODIGO")
    private String clnpgaTipoCodigo;
    @Column(name = "CLNPGA_CODIGO")
    private String clnpgaCodigo;
    @Column(name = "CLNPGA_APELLIDOS")
    private String clnpgaApellidos;
    @Column(name = "CLNPGA_NOMBRES")
    private String clnpgaNombres;
    @Column(name = "FACTURAS")
    private String facturas;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "MDOPGO_NUMERO")
    private String mdopgoNumero;
    @Column(name = "MDOPGO_DESCRIPCION")
    private String mdopgoDescripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "PRMATN_NUMERO")
    private String prmatnNumero;
    @Column(name = "AGRUPADOR_CONTABLE")
    private String agrupadorContable;
    @Column(name = "CTACBR_TOTAL")
    private BigDecimal ctacbrTotal;
    @Column(name = "CTACBR_SALDO")
    private BigDecimal ctacbrSaldo;
    @Column(name = "CTACBR_IVA")
    private BigDecimal ctacbrIva;
    @Column(name = "CTACBR_SALDO_IVA")
    private BigDecimal ctacbrSaldoIva;
    @Column(name = "POR_ANTICIPOS")
    private BigDecimal porAnticipos;
    @Column(name = "DESCUENTOS")
    private BigDecimal descuentos;
    @Column(name = "CTACBR_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctacbrFecha;
    @Column(name = "CTACBR_ESTADO")
    private String ctacbrEstado;
    @Column(name = "OBL_OBL_ID")
    private Long oblOblId;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "ORDEN")
    private String orden;

    public DetallesContabilizacionIng() {
    }

    public DetallesContabilizacionIng(Long dtlcntingId) {
        this.dtlcntingId = dtlcntingId;
    }

    public Long getDtlcntingId() {
        return dtlcntingId;
    }

    public void setDtlcntingId(Long dtlcntingId) {
        this.dtlcntingId = dtlcntingId;
    }

    public Long getCntingCntingId() {
        return cntingCntingId;
    }

    public void setCntingCntingId(Long cntingCntingId) {
        this.cntingCntingId = cntingCntingId;
    }

    public String getCjaCodigo() {
        return cjaCodigo;
    }

    public void setCjaCodigo(String cjaCodigo) {
        this.cjaCodigo = cjaCodigo;
    }

    public String getCtacbrNumero() {
        return ctacbrNumero;
    }

    public void setCtacbrNumero(String ctacbrNumero) {
        this.ctacbrNumero = ctacbrNumero;
    }

    public Integer getNumeroHc() {
        return numeroHc;
    }

    public void setNumeroHc(Integer numeroHc) {
        this.numeroHc = numeroHc;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getClnpgaTipoCodigo() {
        return clnpgaTipoCodigo;
    }

    public void setClnpgaTipoCodigo(String clnpgaTipoCodigo) {
        this.clnpgaTipoCodigo = clnpgaTipoCodigo;
    }

    public String getClnpgaCodigo() {
        return clnpgaCodigo;
    }

    public void setClnpgaCodigo(String clnpgaCodigo) {
        this.clnpgaCodigo = clnpgaCodigo;
    }

    public String getClnpgaApellidos() {
        return clnpgaApellidos;
    }

    public void setClnpgaApellidos(String clnpgaApellidos) {
        this.clnpgaApellidos = clnpgaApellidos;
    }

    public String getClnpgaNombres() {
        return clnpgaNombres;
    }

    public void setClnpgaNombres(String clnpgaNombres) {
        this.clnpgaNombres = clnpgaNombres;
    }

    public String getFacturas() {
        return facturas;
    }

    public void setFacturas(String facturas) {
        this.facturas = facturas;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMdopgoNumero() {
        return mdopgoNumero;
    }

    public void setMdopgoNumero(String mdopgoNumero) {
        this.mdopgoNumero = mdopgoNumero;
    }

    public String getMdopgoDescripcion() {
        return mdopgoDescripcion;
    }

    public void setMdopgoDescripcion(String mdopgoDescripcion) {
        this.mdopgoDescripcion = mdopgoDescripcion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
    }

    public String getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(String prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public String getAgrupadorContable() {
        return agrupadorContable;
    }

    public void setAgrupadorContable(String agrupadorContable) {
        this.agrupadorContable = agrupadorContable;
    }

    public BigDecimal getCtacbrTotal() {
        return ctacbrTotal;
    }

    public void setCtacbrTotal(BigDecimal ctacbrTotal) {
        this.ctacbrTotal = ctacbrTotal;
    }

    public BigDecimal getCtacbrSaldo() {
        return ctacbrSaldo;
    }

    public void setCtacbrSaldo(BigDecimal ctacbrSaldo) {
        this.ctacbrSaldo = ctacbrSaldo;
    }

    public BigDecimal getCtacbrIva() {
        return ctacbrIva;
    }

    public void setCtacbrIva(BigDecimal ctacbrIva) {
        this.ctacbrIva = ctacbrIva;
    }

    public BigDecimal getCtacbrSaldoIva() {
        return ctacbrSaldoIva;
    }

    public void setCtacbrSaldoIva(BigDecimal ctacbrSaldoIva) {
        this.ctacbrSaldoIva = ctacbrSaldoIva;
    }

    public BigDecimal getPorAnticipos() {
        return porAnticipos;
    }

    public void setPorAnticipos(BigDecimal porAnticipos) {
        this.porAnticipos = porAnticipos;
    }

    public BigDecimal getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(BigDecimal descuentos) {
        this.descuentos = descuentos;
    }

    public Date getCtacbrFecha() {
        return ctacbrFecha;
    }

    public void setCtacbrFecha(Date ctacbrFecha) {
        this.ctacbrFecha = ctacbrFecha;
    }

    public String getCtacbrEstado() {
        return ctacbrEstado;
    }

    public void setCtacbrEstado(String ctacbrEstado) {
        this.ctacbrEstado = ctacbrEstado;
    }

    public Long getOblOblId() {
        return oblOblId;
    }

    public void setOblOblId(Long oblOblId) {
        this.oblOblId = oblOblId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtlcntingId != null ? dtlcntingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesContabilizacionIng)) {
            return false;
        }
        DetallesContabilizacionIng other = (DetallesContabilizacionIng) object;
        if ((this.dtlcntingId == null && other.dtlcntingId != null) || (this.dtlcntingId != null && !this.dtlcntingId.equals(other.dtlcntingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesContabilizacionIng[ dtlcntingId=" + dtlcntingId + " ]";
    }
    
}
