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
@Table(name = "LIBROS")
@NamedQueries({
    @NamedQuery(name = "Libros.findAll", query = "SELECT l FROM Libros l")})
public class Libros implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LibrosPK librosPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DEBE")
    private BigDecimal debe;
    @Column(name = "HABER")
    private BigDecimal haber;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "USUARIO_CREA")
    private String usuarioCrea;
    @Column(name = "NUMERO_DOCUMENTO")
    private Long numeroDocumento;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "FECHA_CONCILIACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaConciliacion;
    @Column(name = "USUARIO_CONCILIA")
    private String usuarioConcilia;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "ESTADO_CONTABILIZA")
    private String estadoContabiliza;
    @Column(name = "FECHA_REAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReal;
    @JoinColumn(name = "CNTMVMBNC_CNTMVMBNC_ID", referencedColumnName = "CNTMVMBNC_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ContabilizacionBancos contabilizacionBancos;
    @JoinColumns({
        @JoinColumn(name = "CNTBNC_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "CNTBNC_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "CNTBNC_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CuentasBancarias cuentasBancarias;
    @JoinColumns({
        @JoinColumn(name = "CNTBNC_EMP_CODIGO", referencedColumnName = "EMP_CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "CMP_TIPO", referencedColumnName = "TPOCMP_CODIGO")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposComprobantesEmpresas tiposComprobantesEmpresas;
    @JoinColumn(name = "TPOMVM_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TiposDeMovimientos tiposDeMovimientos;

    public Libros() {
    }

    public Libros(LibrosPK librosPK) {
        this.librosPK = librosPK;
    }

    public Libros(String cntbncEmpCodigo, String cntbncTipo, String cntbncNumero, String tpomvmCodigo, int numero) {
        this.librosPK = new LibrosPK(cntbncEmpCodigo, cntbncTipo, cntbncNumero, tpomvmCodigo, numero);
    }

    public LibrosPK getLibrosPK() {
        return librosPK;
    }

    public void setLibrosPK(LibrosPK librosPK) {
        this.librosPK = librosPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getDebe() {
        return debe;
    }

    public void setDebe(BigDecimal debe) {
        this.debe = debe;
    }

    public BigDecimal getHaber() {
        return haber;
    }

    public void setHaber(BigDecimal haber) {
        this.haber = haber;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuarioCrea() {
        return usuarioCrea;
    }

    public void setUsuarioCrea(String usuarioCrea) {
        this.usuarioCrea = usuarioCrea;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaConciliacion() {
        return fechaConciliacion;
    }

    public void setFechaConciliacion(Date fechaConciliacion) {
        this.fechaConciliacion = fechaConciliacion;
    }

    public String getUsuarioConcilia() {
        return usuarioConcilia;
    }

    public void setUsuarioConcilia(String usuarioConcilia) {
        this.usuarioConcilia = usuarioConcilia;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public String getEstadoContabiliza() {
        return estadoContabiliza;
    }

    public void setEstadoContabiliza(String estadoContabiliza) {
        this.estadoContabiliza = estadoContabiliza;
    }

    public Date getFechaReal() {
        return fechaReal;
    }

    public void setFechaReal(Date fechaReal) {
        this.fechaReal = fechaReal;
    }

    public ContabilizacionBancos getContabilizacionBancos() {
        return contabilizacionBancos;
    }

    public void setContabilizacionBancos(ContabilizacionBancos contabilizacionBancos) {
        this.contabilizacionBancos = contabilizacionBancos;
    }

    public CuentasBancarias getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(CuentasBancarias cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public TiposComprobantesEmpresas getTiposComprobantesEmpresas() {
        return tiposComprobantesEmpresas;
    }

    public void setTiposComprobantesEmpresas(TiposComprobantesEmpresas tiposComprobantesEmpresas) {
        this.tiposComprobantesEmpresas = tiposComprobantesEmpresas;
    }

    public TiposDeMovimientos getTiposDeMovimientos() {
        return tiposDeMovimientos;
    }

    public void setTiposDeMovimientos(TiposDeMovimientos tiposDeMovimientos) {
        this.tiposDeMovimientos = tiposDeMovimientos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (librosPK != null ? librosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libros)) {
            return false;
        }
        Libros other = (Libros) object;
        if ((this.librosPK == null && other.librosPK != null) || (this.librosPK != null && !this.librosPK.equals(other.librosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Libros[ librosPK=" + librosPK + " ]";
    }
    
}
