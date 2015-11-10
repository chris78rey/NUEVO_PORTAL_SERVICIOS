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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "EPICRISIS")
@NamedQueries({
    @NamedQuery(name = "Epicrisis.findAll", query = "SELECT e FROM Epicrisis e")})
public class Epicrisis implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EpicrisisPK epicrisisPK;
    @Column(name = "INFECCION_NOCOSOMIAL")
    private Character infeccionNocosomial;
    @Column(name = "FECHA_REALIZADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRealizada;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "DIAGNOSTICO_PRIMARIO")
    private String diagnosticoPrimario;
    @Column(name = "HISTORIA_BREVE")
    private String historiaBreve;
    @Column(name = "HALLAZGOS_LABORATORIOS_RX")
    private String hallazgosLaboratoriosRx;
    @Column(name = "EVOLUCION")
    private Character evolucion;
    @Column(name = "DETALLES_EVOLUCION")
    private String detallesEvolucion;
    @Column(name = "COMPLICACION")
    private String complicacion;
    @Column(name = "CONDICION")
    private String condicion;
    @Column(name = "TRATAMIENTO")
    private String tratamiento;
    @Column(name = "PRONOSTICO")
    private String pronostico;
    @Column(name = "RECETA")
    private String receta;
    @Column(name = "SONDA_UTILIZADA")
    private String sondaUtilizada;
    @Column(name = "TRANSFERIDO_A")
    private String transferidoA;
    @Column(name = "MOTIVO_TRANSFERENCIA")
    private String motivoTransferencia;
    @Column(name = "FECHA_TRANSFERENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTransferencia;
    @Column(name = "TIPO_TRATAMIENTO")
    private String tipoTratamiento;
    @Column(name = "REVISADO")
    private Character revisado;
    @Column(name = "DETALLES_COND_PRON")
    private String detallesCondPron;
    @Column(name = "ALTA")
    private Character alta;
    @Column(name = "ASINTOMATICO")
    private Character asintomatico;
    @Column(name = "DISCAPACIDAD")
    private Character discapacidad;
    @Column(name = "RETIRO")
    private Character retiro;
    @Column(name = "DEFUNCION")
    private Character defuncion;
    @Column(name = "DIAS_INCAPACIDAD")
    private Long diasIncapacidad;
    @Column(name = "MOTIVO_EGRESO")
    private String motivoEgreso;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "DX_CAUSA_EXTERNA")
    private String dxCausaExterna;
    @JoinColumn(name = "DGNPCN_DGNPCN_ID", referencedColumnName = "DGNPCN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DiagnosticosPaciente diagnosticosPaciente;
    @JoinColumn(name = "HJAEVL_NUMERO", referencedColumnName = "NUMERO")
    @ManyToOne(fetch = FetchType.LAZY)
    private HojasDeEvolucion hojasDeEvolucion;
    @JoinColumns({
        @JoinColumn(name = "PRMATN_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO_TRATANTE", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @JoinColumn(name = "USF_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private UnidadesSaludFfaa unidadesSaludFfaa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "epicrisis", fetch = FetchType.LAZY)
    private List<DiagnosticosSecundarios> diagnosticosSecundariosList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "epicrisis", fetch = FetchType.LAZY)
    private Uci uci;

    public Epicrisis() {
    }

    public Epicrisis(EpicrisisPK epicrisisPK) {
        this.epicrisisPK = epicrisisPK;
    }

    public Epicrisis(long prmatnNumero, int prmatnPcnNumeroHc) {
        this.epicrisisPK = new EpicrisisPK(prmatnNumero, prmatnPcnNumeroHc);
    }

    public EpicrisisPK getEpicrisisPK() {
        return epicrisisPK;
    }

    public void setEpicrisisPK(EpicrisisPK epicrisisPK) {
        this.epicrisisPK = epicrisisPK;
    }

    public Character getInfeccionNocosomial() {
        return infeccionNocosomial;
    }

    public void setInfeccionNocosomial(Character infeccionNocosomial) {
        this.infeccionNocosomial = infeccionNocosomial;
    }

    public Date getFechaRealizada() {
        return fechaRealizada;
    }

    public void setFechaRealizada(Date fechaRealizada) {
        this.fechaRealizada = fechaRealizada;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getDiagnosticoPrimario() {
        return diagnosticoPrimario;
    }

    public void setDiagnosticoPrimario(String diagnosticoPrimario) {
        this.diagnosticoPrimario = diagnosticoPrimario;
    }

    public String getHistoriaBreve() {
        return historiaBreve;
    }

    public void setHistoriaBreve(String historiaBreve) {
        this.historiaBreve = historiaBreve;
    }

    public String getHallazgosLaboratoriosRx() {
        return hallazgosLaboratoriosRx;
    }

    public void setHallazgosLaboratoriosRx(String hallazgosLaboratoriosRx) {
        this.hallazgosLaboratoriosRx = hallazgosLaboratoriosRx;
    }

    public Character getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(Character evolucion) {
        this.evolucion = evolucion;
    }

    public String getDetallesEvolucion() {
        return detallesEvolucion;
    }

    public void setDetallesEvolucion(String detallesEvolucion) {
        this.detallesEvolucion = detallesEvolucion;
    }

    public String getComplicacion() {
        return complicacion;
    }

    public void setComplicacion(String complicacion) {
        this.complicacion = complicacion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getSondaUtilizada() {
        return sondaUtilizada;
    }

    public void setSondaUtilizada(String sondaUtilizada) {
        this.sondaUtilizada = sondaUtilizada;
    }

    public String getTransferidoA() {
        return transferidoA;
    }

    public void setTransferidoA(String transferidoA) {
        this.transferidoA = transferidoA;
    }

    public String getMotivoTransferencia() {
        return motivoTransferencia;
    }

    public void setMotivoTransferencia(String motivoTransferencia) {
        this.motivoTransferencia = motivoTransferencia;
    }

    public Date getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(Date fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public Character getRevisado() {
        return revisado;
    }

    public void setRevisado(Character revisado) {
        this.revisado = revisado;
    }

    public String getDetallesCondPron() {
        return detallesCondPron;
    }

    public void setDetallesCondPron(String detallesCondPron) {
        this.detallesCondPron = detallesCondPron;
    }

    public Character getAlta() {
        return alta;
    }

    public void setAlta(Character alta) {
        this.alta = alta;
    }

    public Character getAsintomatico() {
        return asintomatico;
    }

    public void setAsintomatico(Character asintomatico) {
        this.asintomatico = asintomatico;
    }

    public Character getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Character discapacidad) {
        this.discapacidad = discapacidad;
    }

    public Character getRetiro() {
        return retiro;
    }

    public void setRetiro(Character retiro) {
        this.retiro = retiro;
    }

    public Character getDefuncion() {
        return defuncion;
    }

    public void setDefuncion(Character defuncion) {
        this.defuncion = defuncion;
    }

    public Long getDiasIncapacidad() {
        return diasIncapacidad;
    }

    public void setDiasIncapacidad(Long diasIncapacidad) {
        this.diasIncapacidad = diasIncapacidad;
    }

    public String getMotivoEgreso() {
        return motivoEgreso;
    }

    public void setMotivoEgreso(String motivoEgreso) {
        this.motivoEgreso = motivoEgreso;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDxCausaExterna() {
        return dxCausaExterna;
    }

    public void setDxCausaExterna(String dxCausaExterna) {
        this.dxCausaExterna = dxCausaExterna;
    }

    public DiagnosticosPaciente getDiagnosticosPaciente() {
        return diagnosticosPaciente;
    }

    public void setDiagnosticosPaciente(DiagnosticosPaciente diagnosticosPaciente) {
        this.diagnosticosPaciente = diagnosticosPaciente;
    }

    public HojasDeEvolucion getHojasDeEvolucion() {
        return hojasDeEvolucion;
    }

    public void setHojasDeEvolucion(HojasDeEvolucion hojasDeEvolucion) {
        this.hojasDeEvolucion = hojasDeEvolucion;
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

    public UnidadesSaludFfaa getUnidadesSaludFfaa() {
        return unidadesSaludFfaa;
    }

    public void setUnidadesSaludFfaa(UnidadesSaludFfaa unidadesSaludFfaa) {
        this.unidadesSaludFfaa = unidadesSaludFfaa;
    }

    public List<DiagnosticosSecundarios> getDiagnosticosSecundariosList() {
        return diagnosticosSecundariosList;
    }

    public void setDiagnosticosSecundariosList(List<DiagnosticosSecundarios> diagnosticosSecundariosList) {
        this.diagnosticosSecundariosList = diagnosticosSecundariosList;
    }

    public Uci getUci() {
        return uci;
    }

    public void setUci(Uci uci) {
        this.uci = uci;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (epicrisisPK != null ? epicrisisPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Epicrisis)) {
            return false;
        }
        Epicrisis other = (Epicrisis) object;
        if ((this.epicrisisPK == null && other.epicrisisPK != null) || (this.epicrisisPK != null && !this.epicrisisPK.equals(other.epicrisisPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Epicrisis[ epicrisisPK=" + epicrisisPK + " ]";
    }
    
}
