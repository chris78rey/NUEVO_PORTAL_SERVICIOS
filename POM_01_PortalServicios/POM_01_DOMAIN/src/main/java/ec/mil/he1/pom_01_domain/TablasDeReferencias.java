/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "TABLAS_DE_REFERENCIAS")
@NamedQueries({
    @NamedQuery(name = "TablasDeReferencias.findAll", query = "SELECT t FROM TablasDeReferencias t")})
public class TablasDeReferencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TablasDeReferenciasPK tablasDeReferenciasPK;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHA_VALIDEZ_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaValidezHasta;

    public TablasDeReferencias() {
    }

    public TablasDeReferencias(TablasDeReferenciasPK tablasDeReferenciasPK) {
        this.tablasDeReferenciasPK = tablasDeReferenciasPK;
    }

    public TablasDeReferencias(String codigoTabla, String codigo, Date fechaValidezDesde) {
        this.tablasDeReferenciasPK = new TablasDeReferenciasPK(codigoTabla, codigo, fechaValidezDesde);
    }

    public TablasDeReferenciasPK getTablasDeReferenciasPK() {
        return tablasDeReferenciasPK;
    }

    public void setTablasDeReferenciasPK(TablasDeReferenciasPK tablasDeReferenciasPK) {
        this.tablasDeReferenciasPK = tablasDeReferenciasPK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaValidezHasta() {
        return fechaValidezHasta;
    }

    public void setFechaValidezHasta(Date fechaValidezHasta) {
        this.fechaValidezHasta = fechaValidezHasta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tablasDeReferenciasPK != null ? tablasDeReferenciasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablasDeReferencias)) {
            return false;
        }
        TablasDeReferencias other = (TablasDeReferencias) object;
        if ((this.tablasDeReferenciasPK == null && other.tablasDeReferenciasPK != null) || (this.tablasDeReferenciasPK != null && !this.tablasDeReferenciasPK.equals(other.tablasDeReferenciasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TablasDeReferencias[ tablasDeReferenciasPK=" + tablasDeReferenciasPK + " ]";
    }
    
}
