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
@Table(name = "TIPOS_DE_EXAMENES")
@NamedQueries({
    @NamedQuery(name = "TiposDeExamenes.findAll", query = "SELECT t FROM TiposDeExamenes t")})
public class TiposDeExamenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
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

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
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
        return "ec.mil.he1.pom_01_domain.TiposDeExamenes[ id=" + id + " ]";
    }
    
}
