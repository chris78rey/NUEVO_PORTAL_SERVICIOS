/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "REGULACIONES_ACTIVOS_FIJOS")
@NamedQueries({
    @NamedQuery(name = "RegulacionesActivosFijos.findAll", query = "SELECT r FROM RegulacionesActivosFijos r")})
public class RegulacionesActivosFijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegulacionesActivosFijosPK regulacionesActivosFijosPK;
    @Column(name = "MOTIVO_REGULACION")
    private String motivoRegulacion;
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
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regulacionesActivosFijos", fetch = FetchType.LAZY)
    private List<DetallesRegulacionesActivos> detallesRegulacionesActivosList;

    public RegulacionesActivosFijos() {
    }

    public RegulacionesActivosFijos(RegulacionesActivosFijosPK regulacionesActivosFijosPK) {
        this.regulacionesActivosFijosPK = regulacionesActivosFijosPK;
    }

    public RegulacionesActivosFijos(String empCodigo, int numero) {
        this.regulacionesActivosFijosPK = new RegulacionesActivosFijosPK(empCodigo, numero);
    }

    public RegulacionesActivosFijosPK getRegulacionesActivosFijosPK() {
        return regulacionesActivosFijosPK;
    }

    public void setRegulacionesActivosFijosPK(RegulacionesActivosFijosPK regulacionesActivosFijosPK) {
        this.regulacionesActivosFijosPK = regulacionesActivosFijosPK;
    }

    public String getMotivoRegulacion() {
        return motivoRegulacion;
    }

    public void setMotivoRegulacion(String motivoRegulacion) {
        this.motivoRegulacion = motivoRegulacion;
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

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<DetallesRegulacionesActivos> getDetallesRegulacionesActivosList() {
        return detallesRegulacionesActivosList;
    }

    public void setDetallesRegulacionesActivosList(List<DetallesRegulacionesActivos> detallesRegulacionesActivosList) {
        this.detallesRegulacionesActivosList = detallesRegulacionesActivosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regulacionesActivosFijosPK != null ? regulacionesActivosFijosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegulacionesActivosFijos)) {
            return false;
        }
        RegulacionesActivosFijos other = (RegulacionesActivosFijos) object;
        if ((this.regulacionesActivosFijosPK == null && other.regulacionesActivosFijosPK != null) || (this.regulacionesActivosFijosPK != null && !this.regulacionesActivosFijosPK.equals(other.regulacionesActivosFijosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RegulacionesActivosFijos[ regulacionesActivosFijosPK=" + regulacionesActivosFijosPK + " ]";
    }
    
}
