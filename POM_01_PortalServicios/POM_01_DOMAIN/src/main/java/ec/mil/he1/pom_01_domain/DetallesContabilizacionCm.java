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
@Table(name = "DETALLES_CONTABILIZACION_CM")
@NamedQueries({
    @NamedQuery(name = "DetallesContabilizacionCm.findAll", query = "SELECT d FROM DetallesContabilizacionCm d")})
public class DetallesContabilizacionCm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNTINGCM_CNTINGCM_ID")
    private Long cntingcmCntingcmId;
    @Id
    @Basic(optional = false)
    @Column(name = "DTLCNTCM_ID")
    private Long dtlcntcmId;
    @Column(name = "CJA_CODIGO")
    private String cjaCodigo;
    @Column(name = "PLNHNRMDC_NUMERO")
    private String plnhnrmdcNumero;
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
    @Column(name = "PRMATN_NUMERO")
    private String prmatnNumero;
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "SALDO")
    private BigDecimal saldo;
    @Column(name = "DESCUENTOS")
    private BigDecimal descuentos;
    @Column(name = "PLNHNR_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plnhnrFecha;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "ORDEN")
    private String orden;

    public DetallesContabilizacionCm() {
    }

    public DetallesContabilizacionCm(Long dtlcntcmId) {
        this.dtlcntcmId = dtlcntcmId;
    }

    public Long getCntingcmCntingcmId() {
        return cntingcmCntingcmId;
    }

    public void setCntingcmCntingcmId(Long cntingcmCntingcmId) {
        this.cntingcmCntingcmId = cntingcmCntingcmId;
    }

    public Long getDtlcntcmId() {
        return dtlcntcmId;
    }

    public void setDtlcntcmId(Long dtlcntcmId) {
        this.dtlcntcmId = dtlcntcmId;
    }

    public String getCjaCodigo() {
        return cjaCodigo;
    }

    public void setCjaCodigo(String cjaCodigo) {
        this.cjaCodigo = cjaCodigo;
    }

    public String getPlnhnrmdcNumero() {
        return plnhnrmdcNumero;
    }

    public void setPlnhnrmdcNumero(String plnhnrmdcNumero) {
        this.plnhnrmdcNumero = plnhnrmdcNumero;
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

    public String getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(String prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(BigDecimal descuentos) {
        this.descuentos = descuentos;
    }

    public Date getPlnhnrFecha() {
        return plnhnrFecha;
    }

    public void setPlnhnrFecha(Date plnhnrFecha) {
        this.plnhnrFecha = plnhnrFecha;
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
        hash += (dtlcntcmId != null ? dtlcntcmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesContabilizacionCm)) {
            return false;
        }
        DetallesContabilizacionCm other = (DetallesContabilizacionCm) object;
        if ((this.dtlcntcmId == null && other.dtlcntcmId != null) || (this.dtlcntcmId != null && !this.dtlcntcmId.equals(other.dtlcntcmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesContabilizacionCm[ dtlcntcmId=" + dtlcntcmId + " ]";
    }
    
}
