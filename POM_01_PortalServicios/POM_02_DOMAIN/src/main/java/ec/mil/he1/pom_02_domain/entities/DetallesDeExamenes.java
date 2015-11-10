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
@Table(name = "DETALLES_DE_EXAMENES")
@NamedQueries({
    @NamedQuery(name = "DetallesDeExamenes.findAll", query = "SELECT d FROM DetallesDeExamenes d")})
public class DetallesDeExamenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesDeExamenesPK detallesDeExamenesPK;
    @Column(name = "INDICADOR_DE_NORMALIDAD")
    private Character indicadorDeNormalidad;
    @Column(name = "ORIGEN")
    private String origen;
    @Column(name = "RESULTADO")
    private String resultado;
    @Column(name = "ESTADO_DE_ACTIVIDAD")
    private String estadoDeActividad;
    @Column(name = "TOMADO")
    private Character tomado;
    @Column(name = "FECHA_RESULTADOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResultados;
    @Column(name = "CONFIRMADO")
    private Character confirmado;
    @Column(name = "USUARIO_CONFIRMA")
    private String usuarioConfirma;
    @Column(name = "INSTRUMENTO")
    private String instrumento;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "RANGO_INFERIOR")
    private String rangoInferior;
    @Column(name = "RANGO_SUPERIOR")
    private String rangoSuperior;
    @Column(name = "RANGO_TEXTO")
    private String rangoTexto;
    @Column(name = "ID_RANGO")
    private Short idRango;
    @Column(name = "ACTUALIZADO")
    private String actualizado;
    @Column(name = "UNIDADES")
    private String unidades;
    @Column(name = "FECHA_TOMADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTomado;
    @Column(name = "USUARIO_TOMADO")
    private String usuarioTomado;
    @OneToMany(mappedBy = "detallesDeExamenes", fetch = FetchType.LAZY)
    private List<TurnosDeDetalles> turnosDeDetallesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detallesDeExamenes", fetch = FetchType.LAZY)
    private List<GermenesDePruebas> germenesDePruebasList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "detallesDeExamenes", fetch = FetchType.LAZY)
    private ComplementosMicro complementosMicro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detallesDeExamenes", fetch = FetchType.LAZY)
    private List<ComplementosAResultados> complementosAResultadosList;
    @JoinColumn(name = "EXM_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Examenes examenes;
    @JoinColumn(name = "VRBEXM_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private VariablesDeExamenes variablesDeExamenes;

    public DetallesDeExamenes() {
    }

    public DetallesDeExamenes(DetallesDeExamenesPK detallesDeExamenesPK) {
        this.detallesDeExamenesPK = detallesDeExamenesPK;
    }

    public DetallesDeExamenes(int exmNumero, int vrbexmCodigo) {
        this.detallesDeExamenesPK = new DetallesDeExamenesPK(exmNumero, vrbexmCodigo);
    }

    public DetallesDeExamenesPK getDetallesDeExamenesPK() {
        return detallesDeExamenesPK;
    }

    public void setDetallesDeExamenesPK(DetallesDeExamenesPK detallesDeExamenesPK) {
        this.detallesDeExamenesPK = detallesDeExamenesPK;
    }

    public Character getIndicadorDeNormalidad() {
        return indicadorDeNormalidad;
    }

    public void setIndicadorDeNormalidad(Character indicadorDeNormalidad) {
        this.indicadorDeNormalidad = indicadorDeNormalidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getEstadoDeActividad() {
        return estadoDeActividad;
    }

    public void setEstadoDeActividad(String estadoDeActividad) {
        this.estadoDeActividad = estadoDeActividad;
    }

    public Character getTomado() {
        return tomado;
    }

    public void setTomado(Character tomado) {
        this.tomado = tomado;
    }

    public Date getFechaResultados() {
        return fechaResultados;
    }

    public void setFechaResultados(Date fechaResultados) {
        this.fechaResultados = fechaResultados;
    }

    public Character getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Character confirmado) {
        this.confirmado = confirmado;
    }

    public String getUsuarioConfirma() {
        return usuarioConfirma;
    }

    public void setUsuarioConfirma(String usuarioConfirma) {
        this.usuarioConfirma = usuarioConfirma;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getRangoInferior() {
        return rangoInferior;
    }

    public void setRangoInferior(String rangoInferior) {
        this.rangoInferior = rangoInferior;
    }

    public String getRangoSuperior() {
        return rangoSuperior;
    }

    public void setRangoSuperior(String rangoSuperior) {
        this.rangoSuperior = rangoSuperior;
    }

    public String getRangoTexto() {
        return rangoTexto;
    }

    public void setRangoTexto(String rangoTexto) {
        this.rangoTexto = rangoTexto;
    }

    public Short getIdRango() {
        return idRango;
    }

    public void setIdRango(Short idRango) {
        this.idRango = idRango;
    }

    public String getActualizado() {
        return actualizado;
    }

    public void setActualizado(String actualizado) {
        this.actualizado = actualizado;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public Date getFechaTomado() {
        return fechaTomado;
    }

    public void setFechaTomado(Date fechaTomado) {
        this.fechaTomado = fechaTomado;
    }

    public String getUsuarioTomado() {
        return usuarioTomado;
    }

    public void setUsuarioTomado(String usuarioTomado) {
        this.usuarioTomado = usuarioTomado;
    }

    public List<TurnosDeDetalles> getTurnosDeDetallesList() {
        return turnosDeDetallesList;
    }

    public void setTurnosDeDetallesList(List<TurnosDeDetalles> turnosDeDetallesList) {
        this.turnosDeDetallesList = turnosDeDetallesList;
    }

    public List<GermenesDePruebas> getGermenesDePruebasList() {
        return germenesDePruebasList;
    }

    public void setGermenesDePruebasList(List<GermenesDePruebas> germenesDePruebasList) {
        this.germenesDePruebasList = germenesDePruebasList;
    }

    public ComplementosMicro getComplementosMicro() {
        return complementosMicro;
    }

    public void setComplementosMicro(ComplementosMicro complementosMicro) {
        this.complementosMicro = complementosMicro;
    }

    public List<ComplementosAResultados> getComplementosAResultadosList() {
        return complementosAResultadosList;
    }

    public void setComplementosAResultadosList(List<ComplementosAResultados> complementosAResultadosList) {
        this.complementosAResultadosList = complementosAResultadosList;
    }

    public Examenes getExamenes() {
        return examenes;
    }

    public void setExamenes(Examenes examenes) {
        this.examenes = examenes;
    }

    public VariablesDeExamenes getVariablesDeExamenes() {
        return variablesDeExamenes;
    }

    public void setVariablesDeExamenes(VariablesDeExamenes variablesDeExamenes) {
        this.variablesDeExamenes = variablesDeExamenes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesDeExamenesPK != null ? detallesDeExamenesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDeExamenes)) {
            return false;
        }
        DetallesDeExamenes other = (DetallesDeExamenes) object;
        if ((this.detallesDeExamenesPK == null && other.detallesDeExamenesPK != null) || (this.detallesDeExamenesPK != null && !this.detallesDeExamenesPK.equals(other.detallesDeExamenesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesDeExamenes[ detallesDeExamenesPK=" + detallesDeExamenesPK + " ]";
    }
    
}
