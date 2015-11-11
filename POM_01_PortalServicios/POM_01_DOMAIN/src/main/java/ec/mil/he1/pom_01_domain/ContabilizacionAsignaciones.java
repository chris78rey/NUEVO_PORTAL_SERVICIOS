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
@Table(name = "CONTABILIZACION_ASIGNACIONES")
@NamedQueries({
    @NamedQuery(name = "ContabilizacionAsignaciones.findAll", query = "SELECT c FROM ContabilizacionAsignaciones c")})
public class ContabilizacionAsignaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContabilizacionAsignacionesPK contabilizacionAsignacionesPK;
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "ESTADO")
    private Character estado;
    @Column(name = "CMP_CODIGO")
    private String cmpCodigo;
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;

    public ContabilizacionAsignaciones() {
    }

    public ContabilizacionAsignaciones(ContabilizacionAsignacionesPK contabilizacionAsignacionesPK) {
        this.contabilizacionAsignacionesPK = contabilizacionAsignacionesPK;
    }

    public ContabilizacionAsignaciones(String empCodigo, long cntasgId) {
        this.contabilizacionAsignacionesPK = new ContabilizacionAsignacionesPK(empCodigo, cntasgId);
    }

    public ContabilizacionAsignacionesPK getContabilizacionAsignacionesPK() {
        return contabilizacionAsignacionesPK;
    }

    public void setContabilizacionAsignacionesPK(ContabilizacionAsignacionesPK contabilizacionAsignacionesPK) {
        this.contabilizacionAsignacionesPK = contabilizacionAsignacionesPK;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public String getCmpCodigo() {
        return cmpCodigo;
    }

    public void setCmpCodigo(String cmpCodigo) {
        this.cmpCodigo = cmpCodigo;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public Integer getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(Integer cmpClave) {
        this.cmpClave = cmpClave;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contabilizacionAsignacionesPK != null ? contabilizacionAsignacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContabilizacionAsignaciones)) {
            return false;
        }
        ContabilizacionAsignaciones other = (ContabilizacionAsignaciones) object;
        if ((this.contabilizacionAsignacionesPK == null && other.contabilizacionAsignacionesPK != null) || (this.contabilizacionAsignacionesPK != null && !this.contabilizacionAsignacionesPK.equals(other.contabilizacionAsignacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ContabilizacionAsignaciones[ contabilizacionAsignacionesPK=" + contabilizacionAsignacionesPK + " ]";
    }
    
}
