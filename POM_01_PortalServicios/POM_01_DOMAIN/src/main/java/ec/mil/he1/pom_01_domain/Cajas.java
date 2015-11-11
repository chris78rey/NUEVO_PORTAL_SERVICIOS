/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "CAJAS")
@NamedQueries({
    @NamedQuery(name = "Cajas.findAll", query = "SELECT c FROM Cajas c")})
public class Cajas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "NOMBRE_SECUENCIA")
    private String nombreSecuencia;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "NOMBRE_SECUENCIA_CTACBR")
    private String nombreSecuenciaCtacbr;
    @Column(name = "PUNTO_SERVICIO")
    private Short puntoServicio;
    @Column(name = "NUMERO_ESTABLECIMIENTO")
    private Short numeroEstablecimiento;
    @Column(name = "AUTORIZACION_SRI")
    private BigInteger autorizacionSri;
    @Column(name = "VALIDO_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validoHasta;
    @Column(name = "TIPO_CAJA")
    private Character tipoCaja;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "REPORTE")
    private String reporte;
    @Column(name = "LINEAS_POR_COMPROBANTE")
    private Long lineasPorComprobante;
    @Column(name = "SECUENCIAL")
    private String secuencial;
    @Column(name = "CODIGO_NUMERICO")
    private String codigoNumerico;
    @Column(name = "SECUENCIAL_NCR")
    private String secuencialNcr;
    @Column(name = "CODIGO_NUMERICO_NCR")
    private String codigoNumericoNcr;
    @Column(name = "FACTURA_ELECTRONICA")
    private Character facturaElectronica;
    @Column(name = "SECUENCIAL_RTN")
    private String secuencialRtn;
    @Column(name = "CODIGO_NUMERICO_RTN")
    private String codigoNumericoRtn;

    public Cajas() {
    }

    public Cajas(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreSecuencia() {
        return nombreSecuencia;
    }

    public void setNombreSecuencia(String nombreSecuencia) {
        this.nombreSecuencia = nombreSecuencia;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public String getNombreSecuenciaCtacbr() {
        return nombreSecuenciaCtacbr;
    }

    public void setNombreSecuenciaCtacbr(String nombreSecuenciaCtacbr) {
        this.nombreSecuenciaCtacbr = nombreSecuenciaCtacbr;
    }

    public Short getPuntoServicio() {
        return puntoServicio;
    }

    public void setPuntoServicio(Short puntoServicio) {
        this.puntoServicio = puntoServicio;
    }

    public Short getNumeroEstablecimiento() {
        return numeroEstablecimiento;
    }

    public void setNumeroEstablecimiento(Short numeroEstablecimiento) {
        this.numeroEstablecimiento = numeroEstablecimiento;
    }

    public BigInteger getAutorizacionSri() {
        return autorizacionSri;
    }

    public void setAutorizacionSri(BigInteger autorizacionSri) {
        this.autorizacionSri = autorizacionSri;
    }

    public Date getValidoHasta() {
        return validoHasta;
    }

    public void setValidoHasta(Date validoHasta) {
        this.validoHasta = validoHasta;
    }

    public Character getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(Character tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    public Long getLineasPorComprobante() {
        return lineasPorComprobante;
    }

    public void setLineasPorComprobante(Long lineasPorComprobante) {
        this.lineasPorComprobante = lineasPorComprobante;
    }

    public String getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(String secuencial) {
        this.secuencial = secuencial;
    }

    public String getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(String codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getSecuencialNcr() {
        return secuencialNcr;
    }

    public void setSecuencialNcr(String secuencialNcr) {
        this.secuencialNcr = secuencialNcr;
    }

    public String getCodigoNumericoNcr() {
        return codigoNumericoNcr;
    }

    public void setCodigoNumericoNcr(String codigoNumericoNcr) {
        this.codigoNumericoNcr = codigoNumericoNcr;
    }

    public Character getFacturaElectronica() {
        return facturaElectronica;
    }

    public void setFacturaElectronica(Character facturaElectronica) {
        this.facturaElectronica = facturaElectronica;
    }

    public String getSecuencialRtn() {
        return secuencialRtn;
    }

    public void setSecuencialRtn(String secuencialRtn) {
        this.secuencialRtn = secuencialRtn;
    }

    public String getCodigoNumericoRtn() {
        return codigoNumericoRtn;
    }

    public void setCodigoNumericoRtn(String codigoNumericoRtn) {
        this.codigoNumericoRtn = codigoNumericoRtn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cajas)) {
            return false;
        }
        Cajas other = (Cajas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Cajas[ codigo=" + codigo + " ]";
    }
    
}
