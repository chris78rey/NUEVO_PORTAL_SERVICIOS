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
@Table(name = "INGESTAS_Y_ELIMINACIONES")
@NamedQueries({
    @NamedQuery(name = "IngestasYEliminaciones.findAll", query = "SELECT i FROM IngestasYEliminaciones i")})
public class IngestasYEliminaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IngestasYEliminacionesPK ingestasYEliminacionesPK;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "FECHA_DE_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeRegistro;
    @Column(name = "FECHA_INGESTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngesta;
    @Column(name = "TIPO_SOLUCION_INGESTA")
    private String tipoSolucionIngesta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CANTIDAD_INGESTA")
    private BigDecimal cantidadIngesta;
    @Column(name = "FECHA_EMPIEZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmpieza;
    @Column(name = "TIPO_SOLUCION_LIQUIDOS")
    private String tipoSolucionLiquidos;
    @Column(name = "FECHA_DISCONTINUA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDiscontinua;
    @Column(name = "CANTIDAD_LIQUIDOS")
    private BigDecimal cantidadLiquidos;
    @Column(name = "FECHA_ELIMINACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEliminacion;
    @Column(name = "CANTIDAD_ORINAS")
    private BigDecimal cantidadOrinas;
    @Column(name = "CANTIDAD_OTROS")
    private BigDecimal cantidadOtros;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "TURNO")
    private String turno;
    @Column(name = "DESCRIPCION_OTROS")
    private String descripcionOtros;
    @Column(name = "BANIO")
    private Character banio;

    public IngestasYEliminaciones() {
    }

    public IngestasYEliminaciones(IngestasYEliminacionesPK ingestasYEliminacionesPK) {
        this.ingestasYEliminacionesPK = ingestasYEliminacionesPK;
    }

    public IngestasYEliminaciones(int prmatnNumero, int prmatnPcnNumeroHc, int numero) {
        this.ingestasYEliminacionesPK = new IngestasYEliminacionesPK(prmatnNumero, prmatnPcnNumeroHc, numero);
    }

    public IngestasYEliminacionesPK getIngestasYEliminacionesPK() {
        return ingestasYEliminacionesPK;
    }

    public void setIngestasYEliminacionesPK(IngestasYEliminacionesPK ingestasYEliminacionesPK) {
        this.ingestasYEliminacionesPK = ingestasYEliminacionesPK;
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

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public Date getFechaIngesta() {
        return fechaIngesta;
    }

    public void setFechaIngesta(Date fechaIngesta) {
        this.fechaIngesta = fechaIngesta;
    }

    public String getTipoSolucionIngesta() {
        return tipoSolucionIngesta;
    }

    public void setTipoSolucionIngesta(String tipoSolucionIngesta) {
        this.tipoSolucionIngesta = tipoSolucionIngesta;
    }

    public BigDecimal getCantidadIngesta() {
        return cantidadIngesta;
    }

    public void setCantidadIngesta(BigDecimal cantidadIngesta) {
        this.cantidadIngesta = cantidadIngesta;
    }

    public Date getFechaEmpieza() {
        return fechaEmpieza;
    }

    public void setFechaEmpieza(Date fechaEmpieza) {
        this.fechaEmpieza = fechaEmpieza;
    }

    public String getTipoSolucionLiquidos() {
        return tipoSolucionLiquidos;
    }

    public void setTipoSolucionLiquidos(String tipoSolucionLiquidos) {
        this.tipoSolucionLiquidos = tipoSolucionLiquidos;
    }

    public Date getFechaDiscontinua() {
        return fechaDiscontinua;
    }

    public void setFechaDiscontinua(Date fechaDiscontinua) {
        this.fechaDiscontinua = fechaDiscontinua;
    }

    public BigDecimal getCantidadLiquidos() {
        return cantidadLiquidos;
    }

    public void setCantidadLiquidos(BigDecimal cantidadLiquidos) {
        this.cantidadLiquidos = cantidadLiquidos;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public BigDecimal getCantidadOrinas() {
        return cantidadOrinas;
    }

    public void setCantidadOrinas(BigDecimal cantidadOrinas) {
        this.cantidadOrinas = cantidadOrinas;
    }

    public BigDecimal getCantidadOtros() {
        return cantidadOtros;
    }

    public void setCantidadOtros(BigDecimal cantidadOtros) {
        this.cantidadOtros = cantidadOtros;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDescripcionOtros() {
        return descripcionOtros;
    }

    public void setDescripcionOtros(String descripcionOtros) {
        this.descripcionOtros = descripcionOtros;
    }

    public Character getBanio() {
        return banio;
    }

    public void setBanio(Character banio) {
        this.banio = banio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ingestasYEliminacionesPK != null ? ingestasYEliminacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IngestasYEliminaciones)) {
            return false;
        }
        IngestasYEliminaciones other = (IngestasYEliminaciones) object;
        if ((this.ingestasYEliminacionesPK == null && other.ingestasYEliminacionesPK != null) || (this.ingestasYEliminacionesPK != null && !this.ingestasYEliminacionesPK.equals(other.ingestasYEliminacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.IngestasYEliminaciones[ ingestasYEliminacionesPK=" + ingestasYEliminacionesPK + " ]";
    }
    
}
