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
@Table(name = "CONTRA_REFERENCIAS")
@NamedQueries({
    @NamedQuery(name = "ContraReferencias.findAll", query = "SELECT c FROM ContraReferencias c")})
public class ContraReferencias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "REFERIDO_A")
    private Integer referidoA;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "RESUMEN")
    private String resumen;
    @Column(name = "HALLAZGOS")
    private String hallazgos;
    @Column(name = "TRATAMIENTO")
    private String tratamiento;
    @Column(name = "TRATAMIENTO_RECOMENDADO")
    private String tratamientoRecomendado;
    @Column(name = "SALA")
    private Short sala;
    @Column(name = "CAMA")
    private String cama;
    @Column(name = "SEGURO")
    private String seguro;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "ENTIDAD")
    private String entidad;
    @Column(name = "ENTIDAD_REFERIDO")
    private String entidadReferido;
    @Column(name = "TIPO_ENTIDAD")
    private String tipoEntidad;
    @Column(name = "DISTRITO")
    private String distrito;
    @Column(name = "ESPECIALIDAD")
    private String especialidad;
    @Column(name = "ESTABLECIMIENTO")
    private Integer establecimiento;
    @Column(name = "TIPO_ENTIDAD_REFERIDO")
    private String tipoEntidadReferido;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "TRATANTE_EXTERNO")
    private String tratanteExterno;
    @Column(name = "CODIGO_MSP_MEDICO")
    private String codigoMspMedico;
    @Column(name = "REFERENCIA_JUSTIFICADA")
    private Character referenciaJustificada;
    @Column(name = "TIPOCNT")
    private String tipocnt;
    @Column(name = "TIPO_REFERENCIA_INICIAL")
    private String tipoReferenciaInicial;
    @Column(name = "REFERENCIA_INICIAL")
    private Integer referenciaInicial;
    @ManyToMany(mappedBy = "contraReferenciasList", fetch = FetchType.LAZY)
    private List<DiagnosticosPaciente> diagnosticosPacienteList;
    @OneToMany(mappedBy = "contraReferencias", fetch = FetchType.LAZY)
    private List<ReferenciasDiagnosticos> referenciasDiagnosticosList;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumns({
        @JoinColumn(name = "PRMATN_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO_TRATANTE", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;

    public ContraReferencias() {
    }

    public ContraReferencias(Integer numero) {
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

    public Integer getReferidoA() {
        return referidoA;
    }

    public void setReferidoA(Integer referidoA) {
        this.referidoA = referidoA;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getHallazgos() {
        return hallazgos;
    }

    public void setHallazgos(String hallazgos) {
        this.hallazgos = hallazgos;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getTratamientoRecomendado() {
        return tratamientoRecomendado;
    }

    public void setTratamientoRecomendado(String tratamientoRecomendado) {
        this.tratamientoRecomendado = tratamientoRecomendado;
    }

    public Short getSala() {
        return sala;
    }

    public void setSala(Short sala) {
        this.sala = sala;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getEntidadReferido() {
        return entidadReferido;
    }

    public void setEntidadReferido(String entidadReferido) {
        this.entidadReferido = entidadReferido;
    }

    public String getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(String tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Integer establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getTipoEntidadReferido() {
        return tipoEntidadReferido;
    }

    public void setTipoEntidadReferido(String tipoEntidadReferido) {
        this.tipoEntidadReferido = tipoEntidadReferido;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getTratanteExterno() {
        return tratanteExterno;
    }

    public void setTratanteExterno(String tratanteExterno) {
        this.tratanteExterno = tratanteExterno;
    }

    public String getCodigoMspMedico() {
        return codigoMspMedico;
    }

    public void setCodigoMspMedico(String codigoMspMedico) {
        this.codigoMspMedico = codigoMspMedico;
    }

    public Character getReferenciaJustificada() {
        return referenciaJustificada;
    }

    public void setReferenciaJustificada(Character referenciaJustificada) {
        this.referenciaJustificada = referenciaJustificada;
    }

    public String getTipocnt() {
        return tipocnt;
    }

    public void setTipocnt(String tipocnt) {
        this.tipocnt = tipocnt;
    }

    public String getTipoReferenciaInicial() {
        return tipoReferenciaInicial;
    }

    public void setTipoReferenciaInicial(String tipoReferenciaInicial) {
        this.tipoReferenciaInicial = tipoReferenciaInicial;
    }

    public Integer getReferenciaInicial() {
        return referenciaInicial;
    }

    public void setReferenciaInicial(Integer referenciaInicial) {
        this.referenciaInicial = referenciaInicial;
    }

    public List<DiagnosticosPaciente> getDiagnosticosPacienteList() {
        return diagnosticosPacienteList;
    }

    public void setDiagnosticosPacienteList(List<DiagnosticosPaciente> diagnosticosPacienteList) {
        this.diagnosticosPacienteList = diagnosticosPacienteList;
    }

    public List<ReferenciasDiagnosticos> getReferenciasDiagnosticosList() {
        return referenciasDiagnosticosList;
    }

    public void setReferenciasDiagnosticosList(List<ReferenciasDiagnosticos> referenciasDiagnosticosList) {
        this.referenciasDiagnosticosList = referenciasDiagnosticosList;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public PermanenciasYAtenciones getPermanenciasYAtenciones() {
        return permanenciasYAtenciones;
    }

    public void setPermanenciasYAtenciones(PermanenciasYAtenciones permanenciasYAtenciones) {
        this.permanenciasYAtenciones = permanenciasYAtenciones;
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
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContraReferencias)) {
            return false;
        }
        ContraReferencias other = (ContraReferencias) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ContraReferencias[ numero=" + numero + " ]";
    }
    
}
