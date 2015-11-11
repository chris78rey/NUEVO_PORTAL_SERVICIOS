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
@Table(name = "ASIGNACIONES_REINGRESOS_ACTIVO")
@NamedQueries({
    @NamedQuery(name = "AsignacionesReingresosActivo.findAll", query = "SELECT a FROM AsignacionesReingresosActivo a")})
public class AsignacionesReingresosActivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsignacionesReingresosActivoPK asignacionesReingresosActivoPK;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "PRS_CODIGO_ENTREGADO_POR")
    private String prsCodigoEntregadoPor;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "CMP_TIPO")
    private String cmpTipo;
    @Column(name = "CMP_CLAVE")
    private Integer cmpClave;

    public AsignacionesReingresosActivo() {
    }

    public AsignacionesReingresosActivo(AsignacionesReingresosActivoPK asignacionesReingresosActivoPK) {
        this.asignacionesReingresosActivoPK = asignacionesReingresosActivoPK;
    }

    public AsignacionesReingresosActivo(String empCodigo, String tipoMovimiento, int numero) {
        this.asignacionesReingresosActivoPK = new AsignacionesReingresosActivoPK(empCodigo, tipoMovimiento, numero);
    }

    public AsignacionesReingresosActivoPK getAsignacionesReingresosActivoPK() {
        return asignacionesReingresosActivoPK;
    }

    public void setAsignacionesReingresosActivoPK(AsignacionesReingresosActivoPK asignacionesReingresosActivoPK) {
        this.asignacionesReingresosActivoPK = asignacionesReingresosActivoPK;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
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

    public String getPrsCodigoEntregadoPor() {
        return prsCodigoEntregadoPor;
    }

    public void setPrsCodigoEntregadoPor(String prsCodigoEntregadoPor) {
        this.prsCodigoEntregadoPor = prsCodigoEntregadoPor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asignacionesReingresosActivoPK != null ? asignacionesReingresosActivoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsignacionesReingresosActivo)) {
            return false;
        }
        AsignacionesReingresosActivo other = (AsignacionesReingresosActivo) object;
        if ((this.asignacionesReingresosActivoPK == null && other.asignacionesReingresosActivoPK != null) || (this.asignacionesReingresosActivoPK != null && !this.asignacionesReingresosActivoPK.equals(other.asignacionesReingresosActivoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AsignacionesReingresosActivo[ asignacionesReingresosActivoPK=" + asignacionesReingresosActivoPK + " ]";
    }
    
}
