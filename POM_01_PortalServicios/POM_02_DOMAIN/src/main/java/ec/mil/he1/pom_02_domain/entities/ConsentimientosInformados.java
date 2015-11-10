/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "CONSENTIMIENTOS_INFORMADOS")
@NamedQueries({
    @NamedQuery(name = "ConsentimientosInformados.findAll", query = "SELECT c FROM ConsentimientosInformados c")})
public class ConsentimientosInformados implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConsentimientosInformadosPK consentimientosInformadosPK;
    @Column(name = "TRATAMIENTO_PROPOSITOS")
    private String tratamientoPropositos;
    @Column(name = "TRATAMIENTO_RESULTADOS")
    private String tratamientoResultados;
    @Column(name = "TRATAMIENTO_TERAPIA")
    private String tratamientoTerapia;
    @Column(name = "TRATAMIENTO_RIESGOS")
    private String tratamientoRiesgos;
    @Column(name = "CIRUGIA_RESULTADOS")
    private String cirugiaResultados;
    @Column(name = "CIRUGIA_INTERVENSIONES")
    private String cirugiaIntervensiones;
    @Column(name = "CIRUGIA_RIESGOS")
    private String cirugiaRiesgos;
    @Column(name = "ANESTESIA_RESULTADOS")
    private String anestesiaResultados;
    @Column(name = "ANESTESIA_PROPUESTA")
    private String anestesiaPropuesta;
    @Column(name = "ANESTESIA_RIESGOS")
    private String anestesiaRiesgos;
    @Column(name = "REPRESENTANTE")
    private String representante;
    @Column(name = "PARENTESCO")
    private String parentesco;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "CIRUGIA_PROPOSITOS")
    private String cirugiaPropositos;
    @Column(name = "ANESTESIA_PROPOSITOS")
    private String anestesiaPropositos;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "HJAEVL_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private HojasDeEvolucion hojasDeEvolucion;
    @JoinColumn(name = "PRMATN_PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumns({
        @JoinColumn(name = "PRMATN_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;
    @JoinColumn(name = "PRS_CODIGO_ANS", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGO_CRG", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @JoinColumn(name = "PRS_CODIGO_TRT", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal2;

    public ConsentimientosInformados() {
    }

    public ConsentimientosInformados(ConsentimientosInformadosPK consentimientosInformadosPK) {
        this.consentimientosInformadosPK = consentimientosInformadosPK;
    }

    public ConsentimientosInformados(int prmatnPcnNumeroHc, BigInteger hjaevlNumero, String tipo) {
        this.consentimientosInformadosPK = new ConsentimientosInformadosPK(prmatnPcnNumeroHc, hjaevlNumero, tipo);
    }

    public ConsentimientosInformadosPK getConsentimientosInformadosPK() {
        return consentimientosInformadosPK;
    }

    public void setConsentimientosInformadosPK(ConsentimientosInformadosPK consentimientosInformadosPK) {
        this.consentimientosInformadosPK = consentimientosInformadosPK;
    }

    public String getTratamientoPropositos() {
        return tratamientoPropositos;
    }

    public void setTratamientoPropositos(String tratamientoPropositos) {
        this.tratamientoPropositos = tratamientoPropositos;
    }

    public String getTratamientoResultados() {
        return tratamientoResultados;
    }

    public void setTratamientoResultados(String tratamientoResultados) {
        this.tratamientoResultados = tratamientoResultados;
    }

    public String getTratamientoTerapia() {
        return tratamientoTerapia;
    }

    public void setTratamientoTerapia(String tratamientoTerapia) {
        this.tratamientoTerapia = tratamientoTerapia;
    }

    public String getTratamientoRiesgos() {
        return tratamientoRiesgos;
    }

    public void setTratamientoRiesgos(String tratamientoRiesgos) {
        this.tratamientoRiesgos = tratamientoRiesgos;
    }

    public String getCirugiaResultados() {
        return cirugiaResultados;
    }

    public void setCirugiaResultados(String cirugiaResultados) {
        this.cirugiaResultados = cirugiaResultados;
    }

    public String getCirugiaIntervensiones() {
        return cirugiaIntervensiones;
    }

    public void setCirugiaIntervensiones(String cirugiaIntervensiones) {
        this.cirugiaIntervensiones = cirugiaIntervensiones;
    }

    public String getCirugiaRiesgos() {
        return cirugiaRiesgos;
    }

    public void setCirugiaRiesgos(String cirugiaRiesgos) {
        this.cirugiaRiesgos = cirugiaRiesgos;
    }

    public String getAnestesiaResultados() {
        return anestesiaResultados;
    }

    public void setAnestesiaResultados(String anestesiaResultados) {
        this.anestesiaResultados = anestesiaResultados;
    }

    public String getAnestesiaPropuesta() {
        return anestesiaPropuesta;
    }

    public void setAnestesiaPropuesta(String anestesiaPropuesta) {
        this.anestesiaPropuesta = anestesiaPropuesta;
    }

    public String getAnestesiaRiesgos() {
        return anestesiaRiesgos;
    }

    public void setAnestesiaRiesgos(String anestesiaRiesgos) {
        this.anestesiaRiesgos = anestesiaRiesgos;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCirugiaPropositos() {
        return cirugiaPropositos;
    }

    public void setCirugiaPropositos(String cirugiaPropositos) {
        this.cirugiaPropositos = cirugiaPropositos;
    }

    public String getAnestesiaPropositos() {
        return anestesiaPropositos;
    }

    public void setAnestesiaPropositos(String anestesiaPropositos) {
        this.anestesiaPropositos = anestesiaPropositos;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public HojasDeEvolucion getHojasDeEvolucion() {
        return hojasDeEvolucion;
    }

    public void setHojasDeEvolucion(HojasDeEvolucion hojasDeEvolucion) {
        this.hojasDeEvolucion = hojasDeEvolucion;
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

    public Personal getPersonal2() {
        return personal2;
    }

    public void setPersonal2(Personal personal2) {
        this.personal2 = personal2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consentimientosInformadosPK != null ? consentimientosInformadosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsentimientosInformados)) {
            return false;
        }
        ConsentimientosInformados other = (ConsentimientosInformados) object;
        if ((this.consentimientosInformadosPK == null && other.consentimientosInformadosPK != null) || (this.consentimientosInformadosPK != null && !this.consentimientosInformadosPK.equals(other.consentimientosInformadosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ConsentimientosInformados[ consentimientosInformadosPK=" + consentimientosInformadosPK + " ]";
    }
    
}
