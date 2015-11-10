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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EXAMENES")
@NamedQueries({
    @NamedQuery(name = "Examenes.findAll", query = "SELECT e FROM Examenes e")})
public class Examenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "ESTADO_DE_EXAMEN")
    private String estadoDeExamen;
    @Column(name = "DATOS_CLINICOS")
    private String datosClinicos;
    @Column(name = "DIAGNOSTICO_GENERAL")
    private String diagnosticoGeneral;
    @Column(name = "FECHA_DE_RESULTADOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeResultados;
    @Column(name = "NUMERO_INTERNO")
    private String numeroInterno;
    @Column(name = "PCTEXT_NUMERO_DE_PACIENTE")
    private Integer pctextNumeroDePaciente;
    @Column(name = "USUARIO_CONFIRMA")
    private String usuarioConfirma;
    @Column(name = "FASE_CICLO_MENSTRUAL")
    private String faseCicloMenstrual;
    @Column(name = "TOMADO")
    private Character tomado;
    @Column(name = "OBSERVACION_RESULTADO")
    private String observacionResultado;
    @Column(name = "TRANSMITIDO")
    private String transmitido;
    @Column(name = "FECHA_TOMADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTomado;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private CaracteristicasDeMuestra caracteristicasDeMuestra;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private Biopsias biopsias;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private Inmunohistoquimicas inmunohistoquimicas;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private Citologias citologias;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private List<DiagnosticosDeExamenes> diagnosticosDeExamenesList;
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "SLCEXM_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private SolicitudesDeExamenes solicitudesDeExamenes;
    @JoinColumn(name = "TPOEXM_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private TiposDeExamenes tiposDeExamenes;
    @OneToMany(mappedBy = "examenes", fetch = FetchType.LAZY)
    private List<TurnosDeLaboratorios> turnosDeLaboratoriosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private List<DetallesDeExamenes> detallesDeExamenesList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private InformesEndoscopia informesEndoscopia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private List<BiopsiasDetalles> biopsiasDetallesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private List<ProtocolosPaciente> protocolosPacienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private List<ExamenesModificatorios> examenesModificatoriosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examenes1", fetch = FetchType.LAZY)
    private List<ExamenesModificatorios> examenesModificatoriosList1;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "examenes", fetch = FetchType.LAZY)
    private Papanicolaous papanicolaous;

    public Examenes() {
    }

    public Examenes(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEstadoDeExamen() {
        return estadoDeExamen;
    }

    public void setEstadoDeExamen(String estadoDeExamen) {
        this.estadoDeExamen = estadoDeExamen;
    }

    public String getDatosClinicos() {
        return datosClinicos;
    }

    public void setDatosClinicos(String datosClinicos) {
        this.datosClinicos = datosClinicos;
    }

    public String getDiagnosticoGeneral() {
        return diagnosticoGeneral;
    }

    public void setDiagnosticoGeneral(String diagnosticoGeneral) {
        this.diagnosticoGeneral = diagnosticoGeneral;
    }

    public Date getFechaDeResultados() {
        return fechaDeResultados;
    }

    public void setFechaDeResultados(Date fechaDeResultados) {
        this.fechaDeResultados = fechaDeResultados;
    }

    public String getNumeroInterno() {
        return numeroInterno;
    }

    public void setNumeroInterno(String numeroInterno) {
        this.numeroInterno = numeroInterno;
    }

    public Integer getPctextNumeroDePaciente() {
        return pctextNumeroDePaciente;
    }

    public void setPctextNumeroDePaciente(Integer pctextNumeroDePaciente) {
        this.pctextNumeroDePaciente = pctextNumeroDePaciente;
    }

    public String getUsuarioConfirma() {
        return usuarioConfirma;
    }

    public void setUsuarioConfirma(String usuarioConfirma) {
        this.usuarioConfirma = usuarioConfirma;
    }

    public String getFaseCicloMenstrual() {
        return faseCicloMenstrual;
    }

    public void setFaseCicloMenstrual(String faseCicloMenstrual) {
        this.faseCicloMenstrual = faseCicloMenstrual;
    }

    public Character getTomado() {
        return tomado;
    }

    public void setTomado(Character tomado) {
        this.tomado = tomado;
    }

    public String getObservacionResultado() {
        return observacionResultado;
    }

    public void setObservacionResultado(String observacionResultado) {
        this.observacionResultado = observacionResultado;
    }

    public String getTransmitido() {
        return transmitido;
    }

    public void setTransmitido(String transmitido) {
        this.transmitido = transmitido;
    }

    public Date getFechaTomado() {
        return fechaTomado;
    }

    public void setFechaTomado(Date fechaTomado) {
        this.fechaTomado = fechaTomado;
    }

    public CaracteristicasDeMuestra getCaracteristicasDeMuestra() {
        return caracteristicasDeMuestra;
    }

    public void setCaracteristicasDeMuestra(CaracteristicasDeMuestra caracteristicasDeMuestra) {
        this.caracteristicasDeMuestra = caracteristicasDeMuestra;
    }

    public Biopsias getBiopsias() {
        return biopsias;
    }

    public void setBiopsias(Biopsias biopsias) {
        this.biopsias = biopsias;
    }

    public Inmunohistoquimicas getInmunohistoquimicas() {
        return inmunohistoquimicas;
    }

    public void setInmunohistoquimicas(Inmunohistoquimicas inmunohistoquimicas) {
        this.inmunohistoquimicas = inmunohistoquimicas;
    }

    public Citologias getCitologias() {
        return citologias;
    }

    public void setCitologias(Citologias citologias) {
        this.citologias = citologias;
    }

    public List<DiagnosticosDeExamenes> getDiagnosticosDeExamenesList() {
        return diagnosticosDeExamenesList;
    }

    public void setDiagnosticosDeExamenesList(List<DiagnosticosDeExamenes> diagnosticosDeExamenesList) {
        this.diagnosticosDeExamenesList = diagnosticosDeExamenesList;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
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

    public SolicitudesDeExamenes getSolicitudesDeExamenes() {
        return solicitudesDeExamenes;
    }

    public void setSolicitudesDeExamenes(SolicitudesDeExamenes solicitudesDeExamenes) {
        this.solicitudesDeExamenes = solicitudesDeExamenes;
    }

    public TiposDeExamenes getTiposDeExamenes() {
        return tiposDeExamenes;
    }

    public void setTiposDeExamenes(TiposDeExamenes tiposDeExamenes) {
        this.tiposDeExamenes = tiposDeExamenes;
    }

    public List<TurnosDeLaboratorios> getTurnosDeLaboratoriosList() {
        return turnosDeLaboratoriosList;
    }

    public void setTurnosDeLaboratoriosList(List<TurnosDeLaboratorios> turnosDeLaboratoriosList) {
        this.turnosDeLaboratoriosList = turnosDeLaboratoriosList;
    }

    public List<DetallesDeExamenes> getDetallesDeExamenesList() {
        return detallesDeExamenesList;
    }

    public void setDetallesDeExamenesList(List<DetallesDeExamenes> detallesDeExamenesList) {
        this.detallesDeExamenesList = detallesDeExamenesList;
    }

    public InformesEndoscopia getInformesEndoscopia() {
        return informesEndoscopia;
    }

    public void setInformesEndoscopia(InformesEndoscopia informesEndoscopia) {
        this.informesEndoscopia = informesEndoscopia;
    }

    public List<BiopsiasDetalles> getBiopsiasDetallesList() {
        return biopsiasDetallesList;
    }

    public void setBiopsiasDetallesList(List<BiopsiasDetalles> biopsiasDetallesList) {
        this.biopsiasDetallesList = biopsiasDetallesList;
    }

    public List<ProtocolosPaciente> getProtocolosPacienteList() {
        return protocolosPacienteList;
    }

    public void setProtocolosPacienteList(List<ProtocolosPaciente> protocolosPacienteList) {
        this.protocolosPacienteList = protocolosPacienteList;
    }

    public List<ExamenesModificatorios> getExamenesModificatoriosList() {
        return examenesModificatoriosList;
    }

    public void setExamenesModificatoriosList(List<ExamenesModificatorios> examenesModificatoriosList) {
        this.examenesModificatoriosList = examenesModificatoriosList;
    }

    public List<ExamenesModificatorios> getExamenesModificatoriosList1() {
        return examenesModificatoriosList1;
    }

    public void setExamenesModificatoriosList1(List<ExamenesModificatorios> examenesModificatoriosList1) {
        this.examenesModificatoriosList1 = examenesModificatoriosList1;
    }

    public Papanicolaous getPapanicolaous() {
        return papanicolaous;
    }

    public void setPapanicolaous(Papanicolaous papanicolaous) {
        this.papanicolaous = papanicolaous;
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
        if (!(object instanceof Examenes)) {
            return false;
        }
        Examenes other = (Examenes) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Examenes[ numero=" + numero + " ]";
    }
    
}
