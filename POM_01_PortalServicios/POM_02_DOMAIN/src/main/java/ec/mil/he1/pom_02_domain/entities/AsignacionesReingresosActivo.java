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
import javax.persistence.JoinColumns;
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
@Table(name = "ASIGNACIONES_REINGRESOS_ACTIVO")
@NamedQueries({
    @NamedQuery(name = "AsignacionesReingresosActivo.findAll", query = "SELECT a FROM AsignacionesReingresosActivo a")})
public class AsignacionesReingresosActivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsignacionesReingresosActivoPK asignacionesReingresosActivoPK;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asignacionesReingresosActivo", fetch = FetchType.LAZY)
    private List<DetallesAsignacionesReingres> detallesAsignacionesReingresList;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "EMP_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empresas empresas;
    @JoinColumn(name = "PRS_CODIGO_ENTREGADO_POR", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;

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

    public List<DetallesAsignacionesReingres> getDetallesAsignacionesReingresList() {
        return detallesAsignacionesReingresList;
    }

    public void setDetallesAsignacionesReingresList(List<DetallesAsignacionesReingres> detallesAsignacionesReingresList) {
        this.detallesAsignacionesReingresList = detallesAsignacionesReingresList;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
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
        return "ec.mil.he1.pom_02_domain.entities.AsignacionesReingresosActivo[ asignacionesReingresosActivoPK=" + asignacionesReingresosActivoPK + " ]";
    }
    
}
