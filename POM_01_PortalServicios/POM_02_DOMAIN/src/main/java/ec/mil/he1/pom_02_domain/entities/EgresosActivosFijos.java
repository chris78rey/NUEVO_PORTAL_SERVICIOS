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
@Table(name = "EGRESOS_ACTIVOS_FIJOS")
@NamedQueries({
    @NamedQuery(name = "EgresosActivosFijos.findAll", query = "SELECT e FROM EgresosActivosFijos e")})
public class EgresosActivosFijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EgresosActivosFijosPK egresosActivosFijosPK;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "egresosActivosFijos", fetch = FetchType.LAZY)
    private List<DetallesEgresosActivos> detallesEgresosActivosList;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumn(name = "PRS_CODIGO_ADMINISTRADOR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO_AUTORIZADO_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal2;

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

    public List<DetallesEgresosActivos> getDetallesEgresosActivosList() {
        return detallesEgresosActivosList;
    }

    public void setDetallesEgresosActivosList(List<DetallesEgresosActivos> detallesEgresosActivosList) {
        this.detallesEgresosActivosList = detallesEgresosActivosList;
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

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    public Personal getPersonal2() {
        return personal2;
    }

    public void setPersonal2(Personal personal2) {
        this.personal2 = personal2;
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
        return "ec.mil.he1.pom_02_domain.entities.EgresosActivosFijos[ egresosActivosFijosPK=" + egresosActivosFijosPK + " ]";
    }
    
}
