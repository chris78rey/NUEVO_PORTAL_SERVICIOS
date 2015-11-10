/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
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
@Table(name = "TIPOS_DE_EXAMENES")
@NamedQueries({
    @NamedQuery(name = "TiposDeExamenes.findAll", query = "SELECT t FROM TiposDeExamenes t")})
public class TiposDeExamenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "CARGAR_A_FACTURA")
    private Character cargarAFactura;
    @Column(name = "ESTADO_DE_ACTIVIDAD")
    private String estadoDeActividad;
    @Column(name = "FECHA_DE_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeCreacion;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "REQUERIMIENTO_DE_DIAGNOSTICO")
    private Character requerimientoDeDiagnostico;
    @Column(name = "TABLA_DE_DETALLE")
    private String tablaDeDetalle;
    @Column(name = "TURNO")
    private Character turno;
    @Column(name = "TIEMPO_ESTIMADO")
    private String tiempoEstimado;
    @Column(name = "FORMA_INVOCADA")
    private String formaInvocada;
    @Column(name = "PRIORIDAD_DE_TURNO")
    private Short prioridadDeTurno;
    @Column(name = "REPORTE_SOLICITUD")
    private String reporteSolicitud;
    @Column(name = "REPORTE_RESULTADO")
    private String reporteResultado;
    @Column(name = "LABORATORIO_FISICO")
    private String laboratorioFisico;
    @ManyToMany(mappedBy = "tiposDeExamenesList", fetch = FetchType.LAZY)
    private List<Departamentos> departamentosList;
    @JoinColumns({
        @JoinColumn(name = "CRG_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "CRG_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Cargos cargos;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @OneToMany(mappedBy = "tiposDeExamenes", fetch = FetchType.LAZY)
    private List<Examenes> examenesList;
    @OneToMany(mappedBy = "tiposDeExamenes", fetch = FetchType.LAZY)
    private List<VariablesDeExamenes> variablesDeExamenesList;
    @OneToMany(mappedBy = "tiposDeExamenes", fetch = FetchType.LAZY)
    private List<Perfiles> perfilesList;

    public TiposDeExamenes() {
    }

    public TiposDeExamenes(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Character getCargarAFactura() {
        return cargarAFactura;
    }

    public void setCargarAFactura(Character cargarAFactura) {
        this.cargarAFactura = cargarAFactura;
    }

    public String getEstadoDeActividad() {
        return estadoDeActividad;
    }

    public void setEstadoDeActividad(String estadoDeActividad) {
        this.estadoDeActividad = estadoDeActividad;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getRequerimientoDeDiagnostico() {
        return requerimientoDeDiagnostico;
    }

    public void setRequerimientoDeDiagnostico(Character requerimientoDeDiagnostico) {
        this.requerimientoDeDiagnostico = requerimientoDeDiagnostico;
    }

    public String getTablaDeDetalle() {
        return tablaDeDetalle;
    }

    public void setTablaDeDetalle(String tablaDeDetalle) {
        this.tablaDeDetalle = tablaDeDetalle;
    }

    public Character getTurno() {
        return turno;
    }

    public void setTurno(Character turno) {
        this.turno = turno;
    }

    public String getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public String getFormaInvocada() {
        return formaInvocada;
    }

    public void setFormaInvocada(String formaInvocada) {
        this.formaInvocada = formaInvocada;
    }

    public Short getPrioridadDeTurno() {
        return prioridadDeTurno;
    }

    public void setPrioridadDeTurno(Short prioridadDeTurno) {
        this.prioridadDeTurno = prioridadDeTurno;
    }

    public String getReporteSolicitud() {
        return reporteSolicitud;
    }

    public void setReporteSolicitud(String reporteSolicitud) {
        this.reporteSolicitud = reporteSolicitud;
    }

    public String getReporteResultado() {
        return reporteResultado;
    }

    public void setReporteResultado(String reporteResultado) {
        this.reporteResultado = reporteResultado;
    }

    public String getLaboratorioFisico() {
        return laboratorioFisico;
    }

    public void setLaboratorioFisico(String laboratorioFisico) {
        this.laboratorioFisico = laboratorioFisico;
    }

    public List<Departamentos> getDepartamentosList() {
        return departamentosList;
    }

    public void setDepartamentosList(List<Departamentos> departamentosList) {
        this.departamentosList = departamentosList;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public List<Examenes> getExamenesList() {
        return examenesList;
    }

    public void setExamenesList(List<Examenes> examenesList) {
        this.examenesList = examenesList;
    }

    public List<VariablesDeExamenes> getVariablesDeExamenesList() {
        return variablesDeExamenesList;
    }

    public void setVariablesDeExamenesList(List<VariablesDeExamenes> variablesDeExamenesList) {
        this.variablesDeExamenesList = variablesDeExamenesList;
    }

    public List<Perfiles> getPerfilesList() {
        return perfilesList;
    }

    public void setPerfilesList(List<Perfiles> perfilesList) {
        this.perfilesList = perfilesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposDeExamenes)) {
            return false;
        }
        TiposDeExamenes other = (TiposDeExamenes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TiposDeExamenes[ id=" + id + " ]";
    }
    
}
