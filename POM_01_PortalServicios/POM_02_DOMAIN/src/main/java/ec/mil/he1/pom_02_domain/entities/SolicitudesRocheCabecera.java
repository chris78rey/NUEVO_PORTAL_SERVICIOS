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
@Table(name = "SOLICITUDES_ROCHE_CABECERA")
@NamedQueries({
    @NamedQuery(name = "SolicitudesRocheCabecera.findAll", query = "SELECT s FROM SolicitudesRocheCabecera s")})
public class SolicitudesRocheCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SolicitudesRocheCabeceraPK solicitudesRocheCabeceraPK;
    @Column(name = "HC")
    private Integer hc;
    @Column(name = "PACIENTE")
    private String paciente;
    @Column(name = "FECHA_NACIMIENTO")
    private String fechaNacimiento;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "COD_PROCEDENCIA")
    private String codProcedencia;
    @Column(name = "PROCEDENCIA")
    private String procedencia;
    @Column(name = "COD_ATENCION")
    private Integer codAtencion;
    @Column(name = "ATENCION")
    private String atencion;
    @Column(name = "COD_SERVICIO")
    private Integer codServicio;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "COD_SITUACION")
    private String codSituacion;
    @Column(name = "SITUACION")
    private String situacion;
    @Column(name = "COD_FUERZA")
    private String codFuerza;
    @Column(name = "FUERZA")
    private String fuerza;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "MEDICO")
    private String medico;
    @Column(name = "COD_DESTINO")
    private String codDestino;
    @Column(name = "DESTINO")
    private String destino;
    @Column(name = "UBICACION")
    private String ubicacion;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "FECHA_GENERACION")
    private String fechaGeneracion;
    @Column(name = "GENERADOR")
    private String generador;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_TRANSMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTransmision;
    @Column(name = "ARCHIVO")
    private String archivo;
    @Column(name = "NOMBRE_ARCHIVO")
    private String nombreArchivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "solicitudesRocheCabecera", fetch = FetchType.LAZY)
    private List<SolicitudesRocheDetalle> solicitudesRocheDetalleList;

    public SolicitudesRocheCabecera() {
    }

    public SolicitudesRocheCabecera(SolicitudesRocheCabeceraPK solicitudesRocheCabeceraPK) {
        this.solicitudesRocheCabeceraPK = solicitudesRocheCabeceraPK;
    }

    public SolicitudesRocheCabecera(int id, int solicitud) {
        this.solicitudesRocheCabeceraPK = new SolicitudesRocheCabeceraPK(id, solicitud);
    }

    public SolicitudesRocheCabeceraPK getSolicitudesRocheCabeceraPK() {
        return solicitudesRocheCabeceraPK;
    }

    public void setSolicitudesRocheCabeceraPK(SolicitudesRocheCabeceraPK solicitudesRocheCabeceraPK) {
        this.solicitudesRocheCabeceraPK = solicitudesRocheCabeceraPK;
    }

    public Integer getHc() {
        return hc;
    }

    public void setHc(Integer hc) {
        this.hc = hc;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCodProcedencia() {
        return codProcedencia;
    }

    public void setCodProcedencia(String codProcedencia) {
        this.codProcedencia = codProcedencia;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public Integer getCodAtencion() {
        return codAtencion;
    }

    public void setCodAtencion(Integer codAtencion) {
        this.codAtencion = codAtencion;
    }

    public String getAtencion() {
        return atencion;
    }

    public void setAtencion(String atencion) {
        this.atencion = atencion;
    }

    public Integer getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(Integer codServicio) {
        this.codServicio = codServicio;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getCodSituacion() {
        return codSituacion;
    }

    public void setCodSituacion(String codSituacion) {
        this.codSituacion = codSituacion;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getCodFuerza() {
        return codFuerza;
    }

    public void setCodFuerza(String codFuerza) {
        this.codFuerza = codFuerza;
    }

    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(String codDestino) {
        this.codDestino = codDestino;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getGenerador() {
        return generador;
    }

    public void setGenerador(String generador) {
        this.generador = generador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaTransmision() {
        return fechaTransmision;
    }

    public void setFechaTransmision(Date fechaTransmision) {
        this.fechaTransmision = fechaTransmision;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public List<SolicitudesRocheDetalle> getSolicitudesRocheDetalleList() {
        return solicitudesRocheDetalleList;
    }

    public void setSolicitudesRocheDetalleList(List<SolicitudesRocheDetalle> solicitudesRocheDetalleList) {
        this.solicitudesRocheDetalleList = solicitudesRocheDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (solicitudesRocheCabeceraPK != null ? solicitudesRocheCabeceraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudesRocheCabecera)) {
            return false;
        }
        SolicitudesRocheCabecera other = (SolicitudesRocheCabecera) object;
        if ((this.solicitudesRocheCabeceraPK == null && other.solicitudesRocheCabeceraPK != null) || (this.solicitudesRocheCabeceraPK != null && !this.solicitudesRocheCabeceraPK.equals(other.solicitudesRocheCabeceraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SolicitudesRocheCabecera[ solicitudesRocheCabeceraPK=" + solicitudesRocheCabeceraPK + " ]";
    }
    
}
