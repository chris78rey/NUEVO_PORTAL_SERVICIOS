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
@Table(name = "REGULACIONES")
@NamedQueries({
    @NamedQuery(name = "Regulaciones.findAll", query = "SELECT r FROM Regulaciones r")})
public class Regulaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegulacionesPK regulacionesPK;
    @Column(name = "CONCEPTO")
    private String concepto;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "OBSERVACION")
    private String observacion;

    public Regulaciones() {
    }

    public Regulaciones(RegulacionesPK regulacionesPK) {
        this.regulacionesPK = regulacionesPK;
    }

    public Regulaciones(String tipo, int numero) {
        this.regulacionesPK = new RegulacionesPK(tipo, numero);
    }

    public RegulacionesPK getRegulacionesPK() {
        return regulacionesPK;
    }

    public void setRegulacionesPK(RegulacionesPK regulacionesPK) {
        this.regulacionesPK = regulacionesPK;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regulacionesPK != null ? regulacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regulaciones)) {
            return false;
        }
        Regulaciones other = (Regulaciones) object;
        if ((this.regulacionesPK == null && other.regulacionesPK != null) || (this.regulacionesPK != null && !this.regulacionesPK.equals(other.regulacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Regulaciones[ regulacionesPK=" + regulacionesPK + " ]";
    }
    
}
