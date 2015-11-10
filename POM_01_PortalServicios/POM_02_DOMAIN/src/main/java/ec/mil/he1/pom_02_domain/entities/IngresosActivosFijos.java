/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "INGRESOS_ACTIVOS_FIJOS")
@NamedQueries({
    @NamedQuery(name = "IngresosActivosFijos.findAll", query = "SELECT i FROM IngresosActivosFijos i")})
public class IngresosActivosFijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IngresosActivosFijosPK ingresosActivosFijosPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "MOTIVO_INGRESO")
    private String motivoIngreso;
    @Column(name = "SERIE_FACTURA")
    private String serieFactura;
    @Column(name = "NUMERO_FACTURA")
    private BigInteger numeroFactura;
    @Column(name = "FECHA_FACTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFactura;
    @Column(name = "DIAS_PLAZO")
    private Short diasPlazo;
    @Column(name = "AUTORIZACION_SRI")
    private BigInteger autorizacionSri;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "FECHA_CADUCIDAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCaducidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingresosActivosFijos", fetch = FetchType.LAZY)
    private List<DetallesIngresosActivos> detallesIngresosActivosList;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumns({
        @JoinColumn(name = "PRVACTFJO_EMP_CODIGO", referencedColumnName = "EMP_CODIGO"),
        @JoinColumn(name = "PRVACTFJO_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private ProveedoresActivosFijos proveedoresActivosFijos;

    public IngresosActivosFijos() {
    }

    public IngresosActivosFijos(IngresosActivosFijosPK ingresosActivosFijosPK) {
        this.ingresosActivosFijosPK = ingresosActivosFijosPK;
    }

    public IngresosActivosFijos(String empCodigo, int numero) {
        this.ingresosActivosFijosPK = new IngresosActivosFijosPK(empCodigo, numero);
    }

    public IngresosActivosFijosPK getIngresosActivosFijosPK() {
        return ingresosActivosFijosPK;
    }

    public void setIngresosActivosFijosPK(IngresosActivosFijosPK ingresosActivosFijosPK) {
        this.ingresosActivosFijosPK = ingresosActivosFijosPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivoIngreso() {
        return motivoIngreso;
    }

    public void setMotivoIngreso(String motivoIngreso) {
        this.motivoIngreso = motivoIngreso;
    }

    public String getSerieFactura() {
        return serieFactura;
    }

    public void setSerieFactura(String serieFactura) {
        this.serieFactura = serieFactura;
    }

    public BigInteger getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(BigInteger numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Short getDiasPlazo() {
        return diasPlazo;
    }

    public void setDiasPlazo(Short diasPlazo) {
        this.diasPlazo = diasPlazo;
    }

    public BigInteger getAutorizacionSri() {
        return autorizacionSri;
    }

    public void setAutorizacionSri(BigInteger autorizacionSri) {
        this.autorizacionSri = autorizacionSri;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCmpTipo() {
        return cmpTipo;
    }

    public void setCmpTipo(String cmpTipo) {
        this.cmpTipo = cmpTipo;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public List<DetallesIngresosActivos> getDetallesIngresosActivosList() {
        return detallesIngresosActivosList;
    }

    public void setDetallesIngresosActivosList(List<DetallesIngresosActivos> detallesIngresosActivosList) {
        this.detallesIngresosActivosList = detallesIngresosActivosList;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public ProveedoresActivosFijos getProveedoresActivosFijos() {
        return proveedoresActivosFijos;
    }

    public void setProveedoresActivosFijos(ProveedoresActivosFijos proveedoresActivosFijos) {
        this.proveedoresActivosFijos = proveedoresActivosFijos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ingresosActivosFijosPK != null ? ingresosActivosFijosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngresosActivosFijos)) {
            return false;
        }
        IngresosActivosFijos other = (IngresosActivosFijos) object;
        if ((this.ingresosActivosFijosPK == null && other.ingresosActivosFijosPK != null) || (this.ingresosActivosFijosPK != null && !this.ingresosActivosFijosPK.equals(other.ingresosActivosFijosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.IngresosActivosFijos[ ingresosActivosFijosPK=" + ingresosActivosFijosPK + " ]";
    }
    
}
