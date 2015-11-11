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
@Table(name = "DETALLE_COTIZACION")
@NamedQueries({
    @NamedQuery(name = "DetalleCotizacion.findAll", query = "SELECT d FROM DetalleCotizacion d")})
public class DetalleCotizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleCotizacionPK detalleCotizacionPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO_UNITARIO")
    private BigDecimal precioUnitario;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "REGISTRO_SANITARIO")
    private String registroSanitario;
    @Column(name = "LUGAR_DE_ORIGEN")
    private String lugarDeOrigen;
    @Column(name = "PLAZO_DE_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plazoDeEntrega;
    @Column(name = "FORMA_DE_PAGO")
    private String formaDePago;
    @Column(name = "VALIDEZ_OFERTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validezOferta;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;
    @Column(name = "AUTORIZADO")
    private String autorizado;
    @Column(name = "AUTORIZADO_POR")
    private String autorizadoPor;
    @Column(name = "AUTORIZADO_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date autorizadoFecha;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "NUMERO_SOLICITUD")
    private Integer numeroSolicitud;

    public DetalleCotizacion() {
    }

    public DetalleCotizacion(DetalleCotizacionPK detalleCotizacionPK) {
        this.detalleCotizacionPK = detalleCotizacionPK;
    }

    public DetalleCotizacion(String itmSbsCodigo, Character itmTipo, String itmSbsSccCodigo, short itmCodigo, int oceNumero, short prdCodigo) {
        this.detalleCotizacionPK = new DetalleCotizacionPK(itmSbsCodigo, itmTipo, itmSbsSccCodigo, itmCodigo, oceNumero, prdCodigo);
    }

    public DetalleCotizacionPK getDetalleCotizacionPK() {
        return detalleCotizacionPK;
    }

    public void setDetalleCotizacionPK(DetalleCotizacionPK detalleCotizacionPK) {
        this.detalleCotizacionPK = detalleCotizacionPK;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getRegistroSanitario() {
        return registroSanitario;
    }

    public void setRegistroSanitario(String registroSanitario) {
        this.registroSanitario = registroSanitario;
    }

    public String getLugarDeOrigen() {
        return lugarDeOrigen;
    }

    public void setLugarDeOrigen(String lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }

    public Date getPlazoDeEntrega() {
        return plazoDeEntrega;
    }

    public void setPlazoDeEntrega(Date plazoDeEntrega) {
        this.plazoDeEntrega = plazoDeEntrega;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Date getValidezOferta() {
        return validezOferta;
    }

    public void setValidezOferta(Date validezOferta) {
        this.validezOferta = validezOferta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
    }

    public String getAutorizadoPor() {
        return autorizadoPor;
    }

    public void setAutorizadoPor(String autorizadoPor) {
        this.autorizadoPor = autorizadoPor;
    }

    public Date getAutorizadoFecha() {
        return autorizadoFecha;
    }

    public void setAutorizadoFecha(Date autorizadoFecha) {
        this.autorizadoFecha = autorizadoFecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(Integer numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleCotizacionPK != null ? detalleCotizacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCotizacion)) {
            return false;
        }
        DetalleCotizacion other = (DetalleCotizacion) object;
        if ((this.detalleCotizacionPK == null && other.detalleCotizacionPK != null) || (this.detalleCotizacionPK != null && !this.detalleCotizacionPK.equals(other.detalleCotizacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetalleCotizacion[ detalleCotizacionPK=" + detalleCotizacionPK + " ]";
    }
    
}
