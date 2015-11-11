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
@Table(name = "ASOCIADOS")
@NamedQueries({
    @NamedQuery(name = "Asociados.findAll", query = "SELECT a FROM Asociados a")})
public class Asociados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "CONTRATO")
    private Integer contrato;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TERCERA_EDAD")
    private BigDecimal terceraEdad;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FECHA_CONTRATACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContratacion;
    @Column(name = "TIPO_CONTRATO")
    private String tipoContrato;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PRM_CODIGO")
    private String prmCodigo;
    @Column(name = "NUMERO_CNT_PREVIO")
    private Integer numeroCntPrevio;
    @Column(name = "MONTO_CONTRATO")
    private BigDecimal montoContrato;
    @Column(name = "MONTO_BENEFICIO")
    private Integer montoBeneficio;
    @Column(name = "CODIGO_CONTRATA")
    private String codigoContrata;
    @Column(name = "TIPO_CODIGO_CONTRATA")
    private String tipoCodigoContrata;
    @Column(name = "CODIGO_PAGA")
    private String codigoPaga;
    @Column(name = "TIPO_CODIGO_PAGA")
    private String tipoCodigoPaga;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Column(name = "BNF_PRINCIPAL")
    private Integer bnfPrincipal;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "MONTO_DEVENGADO")
    private BigDecimal montoDevengado;
    @Column(name = "PAGARE_VENDIDO")
    private String pagareVendido;
    @Column(name = "CONDICION_CARENCIA")
    private String condicionCarencia;
    @Column(name = "CARENCIA")
    private Short carencia;
    @Column(name = "CLASIFICACION")
    private String clasificacion;

    public Asociados() {
    }

    public Asociados(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getContrato() {
        return contrato;
    }

    public void setContrato(Integer contrato) {
        this.contrato = contrato;
    }

    public BigDecimal getTerceraEdad() {
        return terceraEdad;
    }

    public void setTerceraEdad(BigDecimal terceraEdad) {
        this.terceraEdad = terceraEdad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getPrmCodigo() {
        return prmCodigo;
    }

    public void setPrmCodigo(String prmCodigo) {
        this.prmCodigo = prmCodigo;
    }

    public Integer getNumeroCntPrevio() {
        return numeroCntPrevio;
    }

    public void setNumeroCntPrevio(Integer numeroCntPrevio) {
        this.numeroCntPrevio = numeroCntPrevio;
    }

    public BigDecimal getMontoContrato() {
        return montoContrato;
    }

    public void setMontoContrato(BigDecimal montoContrato) {
        this.montoContrato = montoContrato;
    }

    public Integer getMontoBeneficio() {
        return montoBeneficio;
    }

    public void setMontoBeneficio(Integer montoBeneficio) {
        this.montoBeneficio = montoBeneficio;
    }

    public String getCodigoContrata() {
        return codigoContrata;
    }

    public void setCodigoContrata(String codigoContrata) {
        this.codigoContrata = codigoContrata;
    }

    public String getTipoCodigoContrata() {
        return tipoCodigoContrata;
    }

    public void setTipoCodigoContrata(String tipoCodigoContrata) {
        this.tipoCodigoContrata = tipoCodigoContrata;
    }

    public String getCodigoPaga() {
        return codigoPaga;
    }

    public void setCodigoPaga(String codigoPaga) {
        this.codigoPaga = codigoPaga;
    }

    public String getTipoCodigoPaga() {
        return tipoCodigoPaga;
    }

    public void setTipoCodigoPaga(String tipoCodigoPaga) {
        this.tipoCodigoPaga = tipoCodigoPaga;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
    }

    public Integer getBnfPrincipal() {
        return bnfPrincipal;
    }

    public void setBnfPrincipal(Integer bnfPrincipal) {
        this.bnfPrincipal = bnfPrincipal;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getMontoDevengado() {
        return montoDevengado;
    }

    public void setMontoDevengado(BigDecimal montoDevengado) {
        this.montoDevengado = montoDevengado;
    }

    public String getPagareVendido() {
        return pagareVendido;
    }

    public void setPagareVendido(String pagareVendido) {
        this.pagareVendido = pagareVendido;
    }

    public String getCondicionCarencia() {
        return condicionCarencia;
    }

    public void setCondicionCarencia(String condicionCarencia) {
        this.condicionCarencia = condicionCarencia;
    }

    public Short getCarencia() {
        return carencia;
    }

    public void setCarencia(Short carencia) {
        this.carencia = carencia;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
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
        if (!(object instanceof Asociados)) {
            return false;
        }
        Asociados other = (Asociados) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Asociados[ numero=" + numero + " ]";
    }
    
}
