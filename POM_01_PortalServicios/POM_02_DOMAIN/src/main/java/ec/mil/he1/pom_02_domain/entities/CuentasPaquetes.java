/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "CUENTAS_PAQUETES")
@NamedQueries({
    @NamedQuery(name = "CuentasPaquetes.findAll", query = "SELECT c FROM CuentasPaquetes c")})
public class CuentasPaquetes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CuentasPaquetesPK cuentasPaquetesPK;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD")
    private BigDecimal cantidad;
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Column(name = "PORCENTAJE_PROMOCION")
    private BigDecimal porcentajePromocion;
    @Column(name = "DESCUENTO_OTORGADO")
    private BigDecimal descuentoOtorgado;
    @Column(name = "IVA")
    private BigDecimal iva;
    @JoinColumns({
        @JoinColumn(name = "CNTS_DOCUMENTO", referencedColumnName = "DOCUMENTO", insertable = false, updatable = false),
        @JoinColumn(name = "CNTS_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "CNTS_DETALLE", referencedColumnName = "DETALLE", insertable = false, updatable = false),
        @JoinColumn(name = "CNTS_SEGURO", referencedColumnName = "SEGURO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cuentas cuentas;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;

    public CuentasPaquetes() {
    }

    public CuentasPaquetes(CuentasPaquetesPK cuentasPaquetesPK) {
        this.cuentasPaquetesPK = cuentasPaquetesPK;
    }

    public CuentasPaquetes(String cntsDocumento, long cntsNumero, long cntsDetalle, Character cntsSeguro, String sessionId) {
        this.cuentasPaquetesPK = new CuentasPaquetesPK(cntsDocumento, cntsNumero, cntsDetalle, cntsSeguro, sessionId);
    }

    public CuentasPaquetesPK getCuentasPaquetesPK() {
        return cuentasPaquetesPK;
    }

    public void setCuentasPaquetesPK(CuentasPaquetesPK cuentasPaquetesPK) {
        this.cuentasPaquetesPK = cuentasPaquetesPK;
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

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getPorcentajePromocion() {
        return porcentajePromocion;
    }

    public void setPorcentajePromocion(BigDecimal porcentajePromocion) {
        this.porcentajePromocion = porcentajePromocion;
    }

    public BigDecimal getDescuentoOtorgado() {
        return descuentoOtorgado;
    }

    public void setDescuentoOtorgado(BigDecimal descuentoOtorgado) {
        this.descuentoOtorgado = descuentoOtorgado;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public Cuentas getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuentasPaquetesPK != null ? cuentasPaquetesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasPaquetes)) {
            return false;
        }
        CuentasPaquetes other = (CuentasPaquetes) object;
        if ((this.cuentasPaquetesPK == null && other.cuentasPaquetesPK != null) || (this.cuentasPaquetesPK != null && !this.cuentasPaquetesPK.equals(other.cuentasPaquetesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CuentasPaquetes[ cuentasPaquetesPK=" + cuentasPaquetesPK + " ]";
    }
    
}
