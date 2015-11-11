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
@Table(name = "TRANSFERENCIAS")
@NamedQueries({
    @NamedQuery(name = "Transferencias.findAll", query = "SELECT t FROM Transferencias t")})
public class Transferencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TransferenciasPK transferenciasPK;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL")
    private BigDecimal total;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO_INCREMENTAN")
    private String dprCodigoIncrementan;
    @Column(name = "DPR_ARA_CODIGO_INCREMENTAN")
    private String dprAraCodigoIncrementan;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PRS_CODIGO_SE_ENTREGA")
    private String prsCodigoSeEntrega;

    public Transferencias() {
    }

    public Transferencias(TransferenciasPK transferenciasPK) {
        this.transferenciasPK = transferenciasPK;
    }

    public Transferencias(String tipo, int numero) {
        this.transferenciasPK = new TransferenciasPK(tipo, numero);
    }

    public TransferenciasPK getTransferenciasPK() {
        return transferenciasPK;
    }

    public void setTransferenciasPK(TransferenciasPK transferenciasPK) {
        this.transferenciasPK = transferenciasPK;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public String getDprCodigoIncrementan() {
        return dprCodigoIncrementan;
    }

    public void setDprCodigoIncrementan(String dprCodigoIncrementan) {
        this.dprCodigoIncrementan = dprCodigoIncrementan;
    }

    public String getDprAraCodigoIncrementan() {
        return dprAraCodigoIncrementan;
    }

    public void setDprAraCodigoIncrementan(String dprAraCodigoIncrementan) {
        this.dprAraCodigoIncrementan = dprAraCodigoIncrementan;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getPrsCodigoSeEntrega() {
        return prsCodigoSeEntrega;
    }

    public void setPrsCodigoSeEntrega(String prsCodigoSeEntrega) {
        this.prsCodigoSeEntrega = prsCodigoSeEntrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transferenciasPK != null ? transferenciasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transferencias)) {
            return false;
        }
        Transferencias other = (Transferencias) object;
        if ((this.transferenciasPK == null && other.transferenciasPK != null) || (this.transferenciasPK != null && !this.transferenciasPK.equals(other.transferenciasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Transferencias[ transferenciasPK=" + transferenciasPK + " ]";
    }
    
}
