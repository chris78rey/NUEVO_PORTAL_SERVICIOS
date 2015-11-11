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
@Table(name = "EXAMENES")
@NamedQueries({
    @NamedQuery(name = "Examenes.findAll", query = "SELECT e FROM Examenes e")})
public class Examenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "SLCEXM_NUMERO")
    private Integer slcexmNumero;
    @Column(name = "TPOEXM_ID")
    private String tpoexmId;
    @Column(name = "ESTADO_DE_EXAMEN")
    private String estadoDeExamen;
    @Column(name = "DGNPCN_DGNPCN_ID")
    private Long dgnpcnDgnpcnId;
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

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Integer getSlcexmNumero() {
        return slcexmNumero;
    }

    public void setSlcexmNumero(Integer slcexmNumero) {
        this.slcexmNumero = slcexmNumero;
    }

    public String getTpoexmId() {
        return tpoexmId;
    }

    public void setTpoexmId(String tpoexmId) {
        this.tpoexmId = tpoexmId;
    }

    public String getEstadoDeExamen() {
        return estadoDeExamen;
    }

    public void setEstadoDeExamen(String estadoDeExamen) {
        this.estadoDeExamen = estadoDeExamen;
    }

    public Long getDgnpcnDgnpcnId() {
        return dgnpcnDgnpcnId;
    }

    public void setDgnpcnDgnpcnId(Long dgnpcnDgnpcnId) {
        this.dgnpcnDgnpcnId = dgnpcnDgnpcnId;
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
        return "ec.mil.he1.pom_01_domain.Examenes[ numero=" + numero + " ]";
    }
    
}
