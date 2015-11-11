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
@Table(name = "EGRESOS_ACTIVOS_FIJOS")
@NamedQueries({
    @NamedQuery(name = "EgresosActivosFijos.findAll", query = "SELECT e FROM EgresosActivosFijos e")})
public class EgresosActivosFijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EgresosActivosFijosPK egresosActivosFijosPK;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "PRS_CODIGO_AUTORIZADO_POR")
    private String prsCodigoAutorizadoPor;
    @Column(name = "PRS_CODIGO_ADMINISTRADOR")
    private String prsCodigoAdministrador;
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

    public EgresosActivosFijos() {
    }

    public EgresosActivosFijos(EgresosActivosFijosPK egresosActivosFijosPK) {
        this.egresosActivosFijosPK = egresosActivosFijosPK;
    }

    public EgresosActivosFijos(String empCodigo, int numero) {
        this.egresosActivosFijosPK = new EgresosActivosFijosPK(empCodigo, numero);
    }

    public EgresosActivosFijosPK getEgresosActivosFijosPK() {
        return egresosActivosFijosPK;
    }

    public void setEgresosActivosFijosPK(EgresosActivosFijosPK egresosActivosFijosPK) {
        this.egresosActivosFijosPK = egresosActivosFijosPK;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getPrsCodigoAutorizadoPor() {
        return prsCodigoAutorizadoPor;
    }

    public void setPrsCodigoAutorizadoPor(String prsCodigoAutorizadoPor) {
        this.prsCodigoAutorizadoPor = prsCodigoAutorizadoPor;
    }

    public String getPrsCodigoAdministrador() {
        return prsCodigoAdministrador;
    }

    public void setPrsCodigoAdministrador(String prsCodigoAdministrador) {
        this.prsCodigoAdministrador = prsCodigoAdministrador;
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
        hash += (egresosActivosFijosPK != null ? egresosActivosFijosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EgresosActivosFijos)) {
            return false;
        }
        EgresosActivosFijos other = (EgresosActivosFijos) object;
        if ((this.egresosActivosFijosPK == null && other.egresosActivosFijosPK != null) || (this.egresosActivosFijosPK != null && !this.egresosActivosFijosPK.equals(other.egresosActivosFijosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EgresosActivosFijos[ egresosActivosFijosPK=" + egresosActivosFijosPK + " ]";
    }
    
}
