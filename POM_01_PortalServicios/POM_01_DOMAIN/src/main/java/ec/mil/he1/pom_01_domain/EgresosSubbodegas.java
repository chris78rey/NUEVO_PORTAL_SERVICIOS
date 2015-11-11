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
@Table(name = "EGRESOS_SUBBODEGAS")
@NamedQueries({
    @NamedQuery(name = "EgresosSubbodegas.findAll", query = "SELECT e FROM EgresosSubbodegas e")})
public class EgresosSubbodegas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EgresosSubbodegasPK egresosSubbodegasPK;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "PRMATN_NUMERO")
    private Integer prmatnNumero;
    @Column(name = "OBSERVACION")
    private String observacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "TIPO_CEDULA")
    private String tipoCedula;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "CAJA")
    private String caja;
    @Column(name = "DESCUENTO")
    private BigDecimal descuento;
    @Column(name = "FACTURA_HASTA")
    private BigInteger facturaHasta;
    @Column(name = "FACTURA_DESDE")
    private BigInteger facturaDesde;
    @Column(name = "VALOR_ELABORACION_MEDICAMENTOS")
    private Integer valorElaboracionMedicamentos;
    @Column(name = "MDCRCT_ID")
    private Integer mdcrctId;
    @Column(name = "INTERNADO")
    private String internado;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
    @Column(name = "DESCARGOS")
    private String descargos;
    @Column(name = "CAMA")
    private String cama;

    public EgresosSubbodegas() {
    }

    public EgresosSubbodegas(EgresosSubbodegasPK egresosSubbodegasPK) {
        this.egresosSubbodegasPK = egresosSubbodegasPK;
    }

    public EgresosSubbodegas(String tipo, int numero) {
        this.egresosSubbodegasPK = new EgresosSubbodegasPK(tipo, numero);
    }

    public EgresosSubbodegasPK getEgresosSubbodegasPK() {
        return egresosSubbodegasPK;
    }

    public void setEgresosSubbodegasPK(EgresosSubbodegasPK egresosSubbodegasPK) {
        this.egresosSubbodegasPK = egresosSubbodegasPK;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Integer getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Integer prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getTipoCedula() {
        return tipoCedula;
    }

    public void setTipoCedula(String tipoCedula) {
        this.tipoCedula = tipoCedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
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

    public Integer getValorElaboracionMedicamentos() {
        return valorElaboracionMedicamentos;
    }

    public void setValorElaboracionMedicamentos(Integer valorElaboracionMedicamentos) {
        this.valorElaboracionMedicamentos = valorElaboracionMedicamentos;
    }

    public Integer getMdcrctId() {
        return mdcrctId;
    }

    public void setMdcrctId(Integer mdcrctId) {
        this.mdcrctId = mdcrctId;
    }

    public String getInternado() {
        return internado;
    }

    public void setInternado(String internado) {
        this.internado = internado;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
    }

    public String getDescargos() {
        return descargos;
    }

    public void setDescargos(String descargos) {
        this.descargos = descargos;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (egresosSubbodegasPK != null ? egresosSubbodegasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresosSubbodegas)) {
            return false;
        }
        EgresosSubbodegas other = (EgresosSubbodegas) object;
        if ((this.egresosSubbodegasPK == null && other.egresosSubbodegasPK != null) || (this.egresosSubbodegasPK != null && !this.egresosSubbodegasPK.equals(other.egresosSubbodegasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EgresosSubbodegas[ egresosSubbodegasPK=" + egresosSubbodegasPK + " ]";
    }
    
}
