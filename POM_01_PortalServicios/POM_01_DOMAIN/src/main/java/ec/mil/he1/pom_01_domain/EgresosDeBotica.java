/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "EGRESOS_DE_BOTICA")
@NamedQueries({
    @NamedQuery(name = "EgresosDeBotica.findAll", query = "SELECT e FROM EgresosDeBotica e")})
public class EgresosDeBotica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EgresosDeBoticaPK egresosDeBoticaPK;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "TIPO_CEDULA")
    private String tipoCedula;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONCEPTO")
    private String concepto;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "PRS_RECIBIDO_POR")
    private String prsRecibidoPor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "PCNTMP_PCNTMP_ID")
    private Integer pcntmpPcntmpId;
    @Column(name = "CAMA")
    private String cama;
    @Column(name = "CLASE")
    private String clase;
    @Column(name = "DESCARGOS")
    private String descargos;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "CAJA")
    private String caja;
    @Column(name = "FACTURA_HASTA")
    private BigInteger facturaHasta;
    @Column(name = "FACTURA_DESDE")
    private BigInteger facturaDesde;
    @Column(name = "VALOR_ELABORACION_MEDICAMENTOS")
    private BigDecimal valorElaboracionMedicamentos;
    @Column(name = "MDCRCT_ID")
    private Integer mdcrctId;

    public EgresosDeBotica() {
    }

    public EgresosDeBotica(EgresosDeBoticaPK egresosDeBoticaPK) {
        this.egresosDeBoticaPK = egresosDeBoticaPK;
    }

    public EgresosDeBotica(String tipo, int numero) {
        this.egresosDeBoticaPK = new EgresosDeBoticaPK(tipo, numero);
    }

    public EgresosDeBoticaPK getEgresosDeBoticaPK() {
        return egresosDeBoticaPK;
    }

    public void setEgresosDeBoticaPK(EgresosDeBoticaPK egresosDeBoticaPK) {
        this.egresosDeBoticaPK = egresosDeBoticaPK;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoCedula() {
        return tipoCedula;
    }

    public void setTipoCedula(String tipoCedula) {
        this.tipoCedula = tipoCedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
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

    public String getPrsRecibidoPor() {
        return prsRecibidoPor;
    }

    public void setPrsRecibidoPor(String prsRecibidoPor) {
        this.prsRecibidoPor = prsRecibidoPor;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPcntmpPcntmpId() {
        return pcntmpPcntmpId;
    }

    public void setPcntmpPcntmpId(Integer pcntmpPcntmpId) {
        this.pcntmpPcntmpId = pcntmpPcntmpId;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDescargos() {
        return descargos;
    }

    public void setDescargos(String descargos) {
        this.descargos = descargos;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public BigInteger getFacturaHasta() {
        return facturaHasta;
    }

    public void setFacturaHasta(BigInteger facturaHasta) {
        this.facturaHasta = facturaHasta;
    }

    public BigInteger getFacturaDesde() {
        return facturaDesde;
    }

    public void setFacturaDesde(BigInteger facturaDesde) {
        this.facturaDesde = facturaDesde;
    }

    public BigDecimal getValorElaboracionMedicamentos() {
        return valorElaboracionMedicamentos;
    }

    public void setValorElaboracionMedicamentos(BigDecimal valorElaboracionMedicamentos) {
        this.valorElaboracionMedicamentos = valorElaboracionMedicamentos;
    }

    public Integer getMdcrctId() {
        return mdcrctId;
    }

    public void setMdcrctId(Integer mdcrctId) {
        this.mdcrctId = mdcrctId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (egresosDeBoticaPK != null ? egresosDeBoticaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresosDeBotica)) {
            return false;
        }
        EgresosDeBotica other = (EgresosDeBotica) object;
        if ((this.egresosDeBoticaPK == null && other.egresosDeBoticaPK != null) || (this.egresosDeBoticaPK != null && !this.egresosDeBoticaPK.equals(other.egresosDeBoticaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EgresosDeBotica[ egresosDeBoticaPK=" + egresosDeBoticaPK + " ]";
    }
    
}
