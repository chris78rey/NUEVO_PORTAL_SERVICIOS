/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "HOJAS_DE_EVOLUCION")
@NamedQueries({
    @NamedQuery(name = "HojasDeEvolucion.findAll", query = "SELECT h FROM HojasDeEvolucion h")})
public class HojasDeEvolucion implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private BigDecimal numero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "SERVICIO_CEX")
    private String servicioCex;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "RESULTADO_EXAMEN_FISICO")
    private String resultadoExamenFisico;
    @Column(name = "TIPO_EVOLUCION")
    private String tipoEvolucion;
    @Column(name = "POOL")
    private Integer pool;
    @Column(name = "DGNPCN_ID")
    private Long dgnpcnId;
    @Column(name = "MINUTOS")
    private Short minutos;
    @Column(name = "COMPLEJIDAD")
    private String complejidad;
    @Column(name = "PRMATN_NUMERO")
    private Long prmatnNumero;
    @Column(name = "REVISADO")
    private Character revisado;
//    @OneToMany(mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<PartesOperatoriosSolicitud> partesOperatoriosSolicitudList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<ConsentimientosInformados> consentimientosInformadosList;
//    @OneToMany(mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<RegistrosPaciente> registrosPacienteList;
//    @OneToMany(mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<PrescripcionesMedicas> prescripcionesMedicasList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<Problemas> problemasList;
//    @OneToMany(mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<ProcedimientosMenores> procedimientosMenoresList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<SignosVitales> signosVitalesList;
//    @OneToMany(mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<Epicrisis> epicrisisList;
//    @JoinColumns({
//        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
//        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Departamentos departamentos;
//    @JoinColumns({
//        @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC"),
//        @JoinColumn(name = "INTCNS_NUMERO", referencedColumnName = "NUMERO")})
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Interconsultas interconsultas;
//    @JoinColumn(name = "MOTIVO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Motivos motivos;
//    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Pacientes pacientes;
//    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Personal personal;
//    @JoinColumn(name = "PRS_CODIGO_REVISADO", referencedColumnName = "CODIGO")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Personal personal1;
//    @OneToMany(mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<AutorizacionesPacientes> autorizacionesPacientesList;
//    @OneToMany(mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<Interconsultas> interconsultasList;
//    @OneToMany(mappedBy = "hojasDeEvolucion1", fetch = FetchType.LAZY)
//    private List<Interconsultas> interconsultasList1;
//    @OneToMany(mappedBy = "hojasDeEvolucion", fetch = FetchType.LAZY)
//    private List<SolicitudesDeExamenes> solicitudesDeExamenesList;

    public HojasDeEvolucion() {
    }

    public HojasDeEvolucion(BigDecimal numero) {
        this.numero = numero;
    }

    public BigDecimal getNumero() {
        return numero;
    }

    public void setNumero(BigDecimal numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getServicioCex() {
        return servicioCex;
    }

    public void setServicioCex(String servicioCex) {
        this.servicioCex = servicioCex;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResultadoExamenFisico() {
        return resultadoExamenFisico;
    }

    public void setResultadoExamenFisico(String resultadoExamenFisico) {
        this.resultadoExamenFisico = resultadoExamenFisico;
    }

    public String getTipoEvolucion() {
        return tipoEvolucion;
    }

    public void setTipoEvolucion(String tipoEvolucion) {
        this.tipoEvolucion = tipoEvolucion;
    }

    public Integer getPool() {
        return pool;
    }

    public void setPool(Integer pool) {
        this.pool = pool;
    }

    public Long getDgnpcnId() {
        return dgnpcnId;
    }

    public void setDgnpcnId(Long dgnpcnId) {
        this.dgnpcnId = dgnpcnId;
    }

    public Short getMinutos() {
        return minutos;
    }

    public void setMinutos(Short minutos) {
        this.minutos = minutos;
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }

    public Long getPrmatnNumero() {
        return prmatnNumero;
    }

    public void setPrmatnNumero(Long prmatnNumero) {
        this.prmatnNumero = prmatnNumero;
    }

    public Character getRevisado() {
        return revisado;
    }

    public void setRevisado(Character revisado) {
        this.revisado = revisado;
    }

//    public List<PartesOperatoriosSolicitud> getPartesOperatoriosSolicitudList() {
//        return partesOperatoriosSolicitudList;
//    }
//
//    public void setPartesOperatoriosSolicitudList(List<PartesOperatoriosSolicitud> partesOperatoriosSolicitudList) {
//        this.partesOperatoriosSolicitudList = partesOperatoriosSolicitudList;
//    }
//
//    public List<ConsentimientosInformados> getConsentimientosInformadosList() {
//        return consentimientosInformadosList;
//    }
//
//    public void setConsentimientosInformadosList(List<ConsentimientosInformados> consentimientosInformadosList) {
//        this.consentimientosInformadosList = consentimientosInformadosList;
//    }
//
//    public List<RegistrosPaciente> getRegistrosPacienteList() {
//        return registrosPacienteList;
//    }
//
//    public void setRegistrosPacienteList(List<RegistrosPaciente> registrosPacienteList) {
//        this.registrosPacienteList = registrosPacienteList;
//    }
//
//    public List<PrescripcionesMedicas> getPrescripcionesMedicasList() {
//        return prescripcionesMedicasList;
//    }
//
//    public void setPrescripcionesMedicasList(List<PrescripcionesMedicas> prescripcionesMedicasList) {
//        this.prescripcionesMedicasList = prescripcionesMedicasList;
//    }
//
//    public List<Problemas> getProblemasList() {
//        return problemasList;
//    }
//
//    public void setProblemasList(List<Problemas> problemasList) {
//        this.problemasList = problemasList;
//    }
//
//    public List<ProcedimientosMenores> getProcedimientosMenoresList() {
//        return procedimientosMenoresList;
//    }
//
//    public void setProcedimientosMenoresList(List<ProcedimientosMenores> procedimientosMenoresList) {
//        this.procedimientosMenoresList = procedimientosMenoresList;
//    }
//
//    public List<SignosVitales> getSignosVitalesList() {
//        return signosVitalesList;
//    }
//
//    public void setSignosVitalesList(List<SignosVitales> signosVitalesList) {
//        this.signosVitalesList = signosVitalesList;
//    }
//
//    public List<Epicrisis> getEpicrisisList() {
//        return epicrisisList;
//    }
//
//    public void setEpicrisisList(List<Epicrisis> epicrisisList) {
//        this.epicrisisList = epicrisisList;
//    }
//
//    public Departamentos getDepartamentos() {
//        return departamentos;
//    }
//
//    public void setDepartamentos(Departamentos departamentos) {
//        this.departamentos = departamentos;
//    }
//
//    public Interconsultas getInterconsultas() {
//        return interconsultas;
//    }
//
//    public void setInterconsultas(Interconsultas interconsultas) {
//        this.interconsultas = interconsultas;
//    }
//
//    public Motivos getMotivos() {
//        return motivos;
//    }
//
//    public void setMotivos(Motivos motivos) {
//        this.motivos = motivos;
//    }

//    public Pacientes getPacientes() {
//        return pacientes;
//    }
//
//    public void setPacientes(Pacientes pacientes) { 
//        this.pacientes = pacientes;
//    }
//
//    public Personal getPersonal() {
//        return personal;
//    }

//    public void setPersonal(Personal personal) {
//        this.personal = personal;
//    }
//
//    public Personal getPersonal1() {
//        return personal1;
//    }
//
//    public void setPersonal1(Personal personal1) {
//        this.personal1 = personal1;
//    }
//
//    public List<AutorizacionesPacientes> getAutorizacionesPacientesList() {
//        return autorizacionesPacientesList;
//    }
//
//    public void setAutorizacionesPacientesList(List<AutorizacionesPacientes> autorizacionesPacientesList) {
//        this.autorizacionesPacientesList = autorizacionesPacientesList;
//    }
//
//    public List<Interconsultas> getInterconsultasList() {
//        return interconsultasList;
//    }
//
//    public void setInterconsultasList(List<Interconsultas> interconsultasList) {
//        this.interconsultasList = interconsultasList;
//    }
//
//    public List<Interconsultas> getInterconsultasList1() {
//        return interconsultasList1;
//    }
//
//    public void setInterconsultasList1(List<Interconsultas> interconsultasList1) {
//        this.interconsultasList1 = interconsultasList1;
//    }
//
//    public List<SolicitudesDeExamenes> getSolicitudesDeExamenesList() {
//        return solicitudesDeExamenesList;
//    }
//
//    public void setSolicitudesDeExamenesList(List<SolicitudesDeExamenes> solicitudesDeExamenesList) {
//        this.solicitudesDeExamenesList = solicitudesDeExamenesList;
//    }

    @Override 
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HojasDeEvolucion)) {
            return false;
        }
        HojasDeEvolucion other = (HojasDeEvolucion) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.HojasDeEvolucion[ numero=" + numero + " ]";
    }
    
}
