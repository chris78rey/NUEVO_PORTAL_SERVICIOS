/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "FACTURAS")
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f")})
public class Facturas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FacturasPK facturasPK;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "CLNPGA_CODIGO")
    private String clnpgaCodigo;
    @Column(name = "CLNPGA_TIPO_CODIGO")
    private String clnpgaTipoCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "MONEDA_DE_TRABAJO")
    private String monedaDeTrabajo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "IVA")
    private BigDecimal iva;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "DESCUENTO_PROMOCIONES")
    private BigDecimal descuentoPromociones;
    @Column(name = "DESCUENTO_OTORGADO")
    private BigDecimal descuentoOtorgado;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "CTACBR_NUMERO")
    private Long ctacbrNumero;
    @Column(name = "PRS_CODIGO_MODIFICADO_POR")
    private String prsCodigoModificadoPor;
    @Column(name = "TOTALE")
    private BigDecimal totale;
    @Column(name = "IVAE")
    private BigDecimal ivae;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "DESCUENTO_PROMOCIONES_E")
    private BigDecimal descuentoPromocionesE;
    @Column(name = "DESCUENTO_OTORGADO_E")
    private BigDecimal descuentoOtorgadoE;
    @Column(name = "PRMATN_NUMERO")
    private Long prmatnNumero;
    @Column(name = "NUMERO_IMPRESION")
    private Integer numeroImpresion;
    @Column(name = "ENTREGADA_CONTABILIDAD")
    private Character entregadaContabilidad;
    @Column(name = "FECHA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @Column(name = "ENTREGADA_POR")
    private String entregadaPor;
    @Column(name = "GENERADO_FCTELE")
    private Character generadoFctele;

    public Facturas() {
    }

    public Facturas(FacturasPK facturasPK) {
        this.facturasPK = facturasPK;
    }

    public Facturas(int numero, String caja) {
        this.facturasPK = new FacturasPK(numero, caja);
    }

    public FacturasPK getFacturasPK() {
        return facturasPK;
    }

    public void setFacturasPK(FacturasPK facturasPK) {
        this.facturasPK = facturasPK;
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

    public String getClnpgaCodigo() {
        return clnpgaCodigo;
    }

    public void setClnpgaCodigo(String clnpgaCodigo) {
        this.clnpgaCodigo = clnpgaCodigo;
    }

    public String getClnpgaTipoCodigo() {
        return clnpgaTipoCodigo;
    }

    public void setClnpgaTipoCodigo(String clnpgaTipoCodigo) {
        this.clnpgaTipoCodigo = clnpgaTipoCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMonedaDeTrabajo() {
        return monedaDeTrabajo;
    }

    public void setMonedaDeTrabajo(String monedaDeTrabajo) {
        this.monedaDeTrabajo = monedaDeTrabajo;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getDescuentoPromociones() {
        return descuentoPromociones;
    }

    public void setDescuentoPromociones(BigDecimal descuentoPromociones) {
        this.descuentoPromociones = descuentoPromociones;
    }

    public BigDecimal getDescuentoOtorgado() {
        return descuentoOtorgado;
    }

    public void setDescuentoOtorgado(BigDecimal descuentoOtorgado) {
        this.descuentoOtorgado = descuentoOtorgado;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
    }

    public Long getCtacbrNumero() {
        return ctacbrNumero;
    }

    public void setCtacbrNumero(Long ctacbrNumero) {
        this.ctacbrNumero = ctacbrNumero;
    }

    public String getPrsCodigoModificadoPor() {
        return prsCodigoModificadoPor;
    }

    public void setPrsCodigoModificadoPor(String prsCodigoModificadoPor) {
        this.prsCodigoModificadoPor = prsCodigoModificadoPor;
    }

    public BigDecimal getTotale() {
        return totale;
    }

    public void setTotale(BigDecimal totale) {
        this.totale = totale;
    }

    public BigDecimal getIvae() {
        return ivae;
    }

    public void setIvae(BigDecimal ivae) {
        this.ivae = ivae;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BigDecimal getDescuentoPromocionesE() {
        return descuentoPromocionesE;
    }

    public void setDescuentoPromocionesE(BigDecimal descuentoPromocionesE) {
        this.descuentoPromocionesE = descuentoPromocionesE;
    }

    public BigDecimal getDescuentoOtorgadoE() {
        return descuentoOtorgadoE;
    }

    public void setDescuentoOtorgadoE(BigDecimal descuentoOtorgadoE) {
        this.descuentoOtorgadoE = descuentoOtorgadoE;
    }

    public Long getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Long prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public Integer getNumeroImpresion() {
        return numeroImpresion;
    }

    public void setNumeroImpresion(Integer numeroImpresion) {
        this.numeroImpresion = numeroImpresion;
    }

    public Character getEntregadaContabilidad() {
        return entregadaContabilidad;
    }

    public void setEntregadaContabilidad(Character entregadaContabilidad) {
        this.entregadaContabilidad = entregadaContabilidad;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEntregadaPor() {
        return entregadaPor;
    }

    public void setEntregadaPor(String entregadaPor) {
        this.entregadaPor = entregadaPor;
    }

    public Character getGeneradoFctele() {
        return generadoFctele;
    }

    public void setGeneradoFctele(Character generadoFctele) {
        this.generadoFctele = generadoFctele;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (facturasPK != null ? facturasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.facturasPK == null && other.facturasPK != null) || (this.facturasPK != null && !this.facturasPK.equals(other.facturasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Facturas[ facturasPK=" + facturasPK + " ]";
    }
    
}
