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
@Table(name = "PLANILLAS_HONORARIOS_MDC")
@NamedQueries({
    @NamedQuery(name = "PlanillasHonorariosMdc.findAll", query = "SELECT p FROM PlanillasHonorariosMdc p")})
public class PlanillasHonorariosMdc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "SALDO")
    private BigDecimal saldo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "EMERGENCIA")
    private Character emergencia;
    @Column(name = "ABIERTA")
    private Character abierta;
    @Column(name = "A_CONTABILIZARSE")
    private Character aContabilizarse;
    @Column(name = "ESTADO_CIERRE")
    private String estadoCierre;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "CONTABILIZADO")
    private Character contabilizado;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @OneToMany(mappedBy = "planillasHonorariosMdc", fetch = FetchType.LAZY)
    private List<DetallesHonorariosMedicos> detallesHonorariosMedicosList;
    @OneToMany(mappedBy = "planillasHonorariosMdc", fetch = FetchType.LAZY)
    private List<NotasCm> notasCmList;
    @JoinColumn(name = "CJA_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cajas cajas;
    @JoinColumns({
        @JoinColumn(name = "CLNPGA_CODIGO", referencedColumnName = "CODIGO"),
        @JoinColumn(name = "CLNPGA_TIPO_CODIGO", referencedColumnName = "TIPO_CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ClientesPagan clientesPagan;
    @JoinColumns({
        @JoinColumn(name = "PRMATN_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(mappedBy = "planillasHonorariosMdc", fetch = FetchType.LAZY)
    private List<DescuentosCm> descuentosCmList;
    @OneToMany(mappedBy = "planillasHonorariosMdc", fetch = FetchType.LAZY)
    private List<PagosCm> pagosCmList;

    public PlanillasHonorariosMdc() {
    }

    public PlanillasHonorariosMdc(Integer numero) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(Character emergencia) {
        this.emergencia = emergencia;
    }

    public Character getAbierta() {
        return abierta;
    }

    public void setAbierta(Character abierta) {
        this.abierta = abierta;
    }

    public Character getAContabilizarse() {
        return aContabilizarse;
    }

    public void setAContabilizarse(Character aContabilizarse) {
        this.aContabilizarse = aContabilizarse;
    }

    public String getEstadoCierre() {
        return estadoCierre;
    }

    public void setEstadoCierre(String estadoCierre) {
        this.estadoCierre = estadoCierre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Character getContabilizado() {
        return contabilizado;
    }

    public void setContabilizado(Character contabilizado) {
        this.contabilizado = contabilizado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<DetallesHonorariosMedicos> getDetallesHonorariosMedicosList() {
        return detallesHonorariosMedicosList;
    }

    public void setDetallesHonorariosMedicosList(List<DetallesHonorariosMedicos> detallesHonorariosMedicosList) {
        this.detallesHonorariosMedicosList = detallesHonorariosMedicosList;
    }

    public List<NotasCm> getNotasCmList() {
        return notasCmList;
    }

    public void setNotasCmList(List<NotasCm> notasCmList) {
        this.notasCmList = notasCmList;
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

    public PermanenciasYAtenciones getPermanenciasYAtenciones() {
        return permanenciasYAtenciones;
    }

    public void setPermanenciasYAtenciones(PermanenciasYAtenciones permanenciasYAtenciones) {
        this.permanenciasYAtenciones = permanenciasYAtenciones;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<DescuentosCm> getDescuentosCmList() {
        return descuentosCmList;
    }

    public void setDescuentosCmList(List<DescuentosCm> descuentosCmList) {
        this.descuentosCmList = descuentosCmList;
    }

    public List<PagosCm> getPagosCmList() {
        return pagosCmList;
    }

    public void setPagosCmList(List<PagosCm> pagosCmList) {
        this.pagosCmList = pagosCmList;
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
        if (!(object instanceof PlanillasHonorariosMdc)) {
            return false;
        }
        PlanillasHonorariosMdc other = (PlanillasHonorariosMdc) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.PlanillasHonorariosMdc[ numero=" + numero + " ]";
    }
    
}
