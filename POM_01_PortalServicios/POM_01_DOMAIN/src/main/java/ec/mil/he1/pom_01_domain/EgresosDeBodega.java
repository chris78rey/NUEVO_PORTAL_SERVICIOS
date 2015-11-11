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
@Table(name = "EGRESOS_DE_BODEGA")
@NamedQueries({
    @NamedQuery(name = "EgresosDeBodega.findAll", query = "SELECT e FROM EgresosDeBodega e")})
public class EgresosDeBodega implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EgresosDeBodegaPK egresosDeBodegaPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONCEPTO")
    private String concepto;
    @Column(name = "SLCINS_NUMERO")
    private Integer slcinsNumero;
    @Column(name = "FECHA_SOLICITUD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PRS_CODIGO_ENTREGADO_POR")
    private String prsCodigoEntregadoPor;
    @Column(name = "ESTADO")
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public EgresosDeBodega() {
    }

    public EgresosDeBodega(EgresosDeBodegaPK egresosDeBodegaPK) {
        this.egresosDeBodegaPK = egresosDeBodegaPK;
    }

    public EgresosDeBodega(String tipo, int numero) {
        this.egresosDeBodegaPK = new EgresosDeBodegaPK(tipo, numero);
    }

    public EgresosDeBodegaPK getEgresosDeBodegaPK() {
        return egresosDeBodegaPK;
    }

    public void setEgresosDeBodegaPK(EgresosDeBodegaPK egresosDeBodegaPK) {
        this.egresosDeBodegaPK = egresosDeBodegaPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getSlcinsNumero() {
        return slcinsNumero;
    }

    public void setSlcinsNumero(Integer slcinsNumero) {
        this.slcinsNumero = slcinsNumero;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getPrsCodigoEntregadoPor() {
        return prsCodigoEntregadoPor;
    }

    public void setPrsCodigoEntregadoPor(String prsCodigoEntregadoPor) {
        this.prsCodigoEntregadoPor = prsCodigoEntregadoPor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (egresosDeBodegaPK != null ? egresosDeBodegaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresosDeBodega)) {
            return false;
        }
        EgresosDeBodega other = (EgresosDeBodega) object;
        if ((this.egresosDeBodegaPK == null && other.egresosDeBodegaPK != null) || (this.egresosDeBodegaPK != null && !this.egresosDeBodegaPK.equals(other.egresosDeBodegaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EgresosDeBodega[ egresosDeBodegaPK=" + egresosDeBodegaPK + " ]";
    }
    
}
