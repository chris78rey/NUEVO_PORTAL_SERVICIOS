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
import javax.persistence.JoinColumns;
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
    @Column(name = "MONTO_CONTRATO")
    private BigDecimal montoContrato;
    @Column(name = "MONTO_BENEFICIO")
    private Integer montoBeneficio;
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
    @OneToMany(mappedBy = "asociados", fetch = FetchType.LAZY)
    private List<Asociados> asociadosList;
    @JoinColumn(name = "NUMERO_CNT_PREVIO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Asociados asociados;
    @JoinColumns({
        @JoinColumn(name = "CRG_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "CRG_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Cargos cargos;
    @JoinColumns({
        @JoinColumn(name = "CODIGO_CONTRATA", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "TIPO_CODIGO_CONTRATA", referencedColumnName = "TIPO_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ClientesPagan clientesPagan;
    @JoinColumns({
        @JoinColumn(name = "CODIGO_PAGA", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "TIPO_CODIGO_PAGA", referencedColumnName = "TIPO_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ClientesPagan clientesPagan1;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRM_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Promociones promociones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asociados", fetch = FetchType.LAZY)
    private List<Beneficiarios> beneficiariosList;

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

    public List<Asociados> getAsociadosList() {
        return asociadosList;
    }

    public void setAsociadosList(List<Asociados> asociadosList) {
        this.asociadosList = asociadosList;
    }

    public Asociados getAsociados() {
        return asociados;
    }

    public void setAsociados(Asociados asociados) {
        this.asociados = asociados;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public ClientesPagan getClientesPagan() {
        return clientesPagan;
    }

    public void setClientesPagan(ClientesPagan clientesPagan) {
        this.clientesPagan = clientesPagan;
    }

    public ClientesPagan getClientesPagan1() {
        return clientesPagan1;
    }

    public void setClientesPagan1(ClientesPagan clientesPagan1) {
        this.clientesPagan1 = clientesPagan1;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Promociones getPromociones() {
        return promociones;
    }

    public void setPromociones(Promociones promociones) {
        this.promociones = promociones;
    }

    public List<Beneficiarios> getBeneficiariosList() {
        return beneficiariosList;
    }

    public void setBeneficiariosList(List<Beneficiarios> beneficiariosList) {
        this.beneficiariosList = beneficiariosList;
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
        return "ec.mil.he1.pom_02_domain.entities.Asociados[ numero=" + numero + " ]";
    }
    
}
