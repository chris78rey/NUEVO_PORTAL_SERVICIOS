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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturas", fetch = FetchType.LAZY)
    private List<DetallesFactura> detallesFacturaList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "facturas", fetch = FetchType.LAZY)
    private FacturaElectronicaSri facturaElectronicaSri;
    @OneToMany(mappedBy = "facturas", fetch = FetchType.LAZY)
    private List<DescuentosGenerados> descuentosGeneradosList;
    @OneToMany(mappedBy = "facturas", fetch = FetchType.LAZY)
    private List<Notas> notasList;
    @OneToMany(mappedBy = "facturas", fetch = FetchType.LAZY)
    private List<Ncrs> ncrsList;
    @JoinColumn(name = "CAJA", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cajas cajas;
    @JoinColumns({
        @JoinColumn(name = "CLNPGA_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "CLNPGA_TIPO_CODIGO", referencedColumnName = "TIPO_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ClientesPagan clientesPagan;
    @JoinColumn(name = "CTACBR_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CuentasPorCobrar cuentasPorCobrar;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO_MODIFICADO_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;

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

    public List<DetallesFactura> getDetallesFacturaList() {
        return detallesFacturaList;
    }

    public void setDetallesFacturaList(List<DetallesFactura> detallesFacturaList) {
        this.detallesFacturaList = detallesFacturaList;
    }

    public FacturaElectronicaSri getFacturaElectronicaSri() {
        return facturaElectronicaSri;
    }

    public void setFacturaElectronicaSri(FacturaElectronicaSri facturaElectronicaSri) {
        this.facturaElectronicaSri = facturaElectronicaSri;
    }

    public List<DescuentosGenerados> getDescuentosGeneradosList() {
        return descuentosGeneradosList;
    }

    public void setDescuentosGeneradosList(List<DescuentosGenerados> descuentosGeneradosList) {
        this.descuentosGeneradosList = descuentosGeneradosList;
    }

    public List<Notas> getNotasList() {
        return notasList;
    }

    public void setNotasList(List<Notas> notasList) {
        this.notasList = notasList;
    }

    public List<Ncrs> getNcrsList() {
        return ncrsList;
    }

    public void setNcrsList(List<Ncrs> ncrsList) {
        this.ncrsList = ncrsList;
    }

    public Cajas getCajas() {
        return cajas;
    }

    public void setCajas(Cajas cajas) {
        this.cajas = cajas;
    }

    public ClientesPagan getClientesPagan() {
        return clientesPagan;
    }

    public void setClientesPagan(ClientesPagan clientesPagan) {
        this.clientesPagan = clientesPagan;
    }

    public CuentasPorCobrar getCuentasPorCobrar() {
        return cuentasPorCobrar;
    }

    public void setCuentasPorCobrar(CuentasPorCobrar cuentasPorCobrar) {
        this.cuentasPorCobrar = cuentasPorCobrar;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
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
        return "ec.mil.he1.pom_02_domain.entities.Facturas[ facturasPK=" + facturasPK + " ]";
    }
    
}
