/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "ORDEN_COTIZACIONES")
@NamedQueries({
    @NamedQuery(name = "OrdenCotizaciones.findAll", query = "SELECT o FROM OrdenCotizaciones o")})
public class OrdenCotizaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "SOLICITUD_DESDE")
    private Integer solicitudDesde;
    @Column(name = "SOLICITUD_HASTA")
    private Integer solicitudHasta;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public OrdenCotizaciones() {
    }

    public OrdenCotizaciones(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getSolicitudDesde() {
        return solicitudDesde;
    }

    public void setSolicitudDesde(Integer solicitudDesde) {
        this.solicitudDesde = solicitudDesde;
    }

    public Integer getSolicitudHasta() {
        return solicitudHasta;
    }

    public void setSolicitudHasta(Integer solicitudHasta) {
        this.solicitudHasta = solicitudHasta;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenCotizaciones)) {
            return false;
        }
        OrdenCotizaciones other = (OrdenCotizaciones) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.OrdenCotizaciones[ numero=" + numero + " ]";
    }
    
}
