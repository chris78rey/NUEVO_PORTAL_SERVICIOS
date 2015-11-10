/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "SOLICITUDES_DE_INTERNACION")
@NamedQueries({
    @NamedQuery(name = "SolicitudesDeInternacion.findAll", query = "SELECT s FROM SolicitudesDeInternacion s")})
public class SolicitudesDeInternacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "FECHA_PROBABLE_INTERNACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProbableInternacion;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "ESTADO_ANULACION")
    private Character estadoAnulacion;
    @Column(name = "URGENTE")
    private Character urgente;
    @Column(name = "NOTA_DE_INTERNACION")
    private String notaDeInternacion;
    @Column(name = "PENSIONADO")
    private Character pensionado;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "ESPECIALIDAD", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Especialidades especialidades;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "TPOPRM_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiposPromociones tiposPromociones;

    public SolicitudesDeInternacion() {
    }

    public SolicitudesDeInternacion(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaProbableInternacion() {
        return fechaProbableInternacion;
    }

    public void setFechaProbableInternacion(Date fechaProbableInternacion) {
        this.fechaProbableInternacion = fechaProbableInternacion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Character getEstadoAnulacion() {
        return estadoAnulacion;
    }

    public void setEstadoAnulacion(Character estadoAnulacion) {
        this.estadoAnulacion = estadoAnulacion;
    }

    public Character getUrgente() {
        return urgente;
    }

    public void setUrgente(Character urgente) {
        this.urgente = urgente;
    }

    public String getNotaDeInternacion() {
        return notaDeInternacion;
    }

    public void setNotaDeInternacion(String notaDeInternacion) {
        this.notaDeInternacion = notaDeInternacion;
    }

    public Character getPensionado() {
        return pensionado;
    }

    public void setPensionado(Character pensionado) {
        this.pensionado = pensionado;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
    }

    public Especialidades getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public TiposPromociones getTiposPromociones() {
        return tiposPromociones;
    }

    public void setTiposPromociones(TiposPromociones tiposPromociones) {
        this.tiposPromociones = tiposPromociones;
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
        if (!(object instanceof SolicitudesDeInternacion)) {
            return false;
        }
        SolicitudesDeInternacion other = (SolicitudesDeInternacion) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.SolicitudesDeInternacion[ numero=" + numero + " ]";
    }
    
}
