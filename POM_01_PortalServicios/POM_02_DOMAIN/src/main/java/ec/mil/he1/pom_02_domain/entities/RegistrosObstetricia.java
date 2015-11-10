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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "REGISTROS_OBSTETRICIA")
@NamedQueries({
    @NamedQuery(name = "RegistrosObstetricia.findAll", query = "SELECT r FROM RegistrosObstetricia r")})
public class RegistrosObstetricia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegistrosObstetriciaPK registrosObstetriciaPK;
    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "FUM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fum;
    @Column(name = "FPP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fpp;
    @Column(name = "EDAD_GESTACIONAL")
    private Short edadGestacional;
    @Column(name = "TAMANO_FETAL_ADECUADO")
    private Character tamanoFetalAdecuado;
    @Column(name = "PRESENTACION")
    private String presentacion;
    @Column(name = "INICIO")
    private String inicio;
    @Column(name = "MEMBRANAS")
    private String membranas;
    @Column(name = "FECHA_RUPTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRuptura;
    @Column(name = "TERMINACION")
    private String terminacion;
    @Column(name = "FECHA_TERMINACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTerminacion;
    @Column(name = "ALUMBRAMIENTO_EXP")
    private Character alumbramientoExp;
    @Column(name = "PLACENTA_COMPLETA")
    private Character placentaCompleta;
    @Column(name = "EPISIOTOMIA")
    private Character episiotomia;
    @Column(name = "DESGARROS")
    private Character desgarros;
    @Column(name = "INDICACION_DEL_PARTO")
    private String indicacionDelParto;
    @Column(name = "MEDICACION_PARTO")
    private String medicacionParto;
    @Column(name = "FECHA_EGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEgreso;
    @Column(name = "ESTADO_EGRESO")
    private String estadoEgreso;
    @Column(name = "ANTICONCEPCION")
    private String anticoncepcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registrosObstetricia", fetch = FetchType.LAZY)
    private List<Puerperios> puerperiosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "registrosObstetricia", fetch = FetchType.LAZY)
    private List<RecienNacidos> recienNacidosList;
    @JoinColumns({
        @JoinColumn(name = "EMB_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC"),
        @JoinColumn(name = "EMB_NUMERO", referencedColumnName = "NUMERO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Embarazos embarazos;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;
    @JoinColumns({
        @JoinColumn(name = "PRMATN_NUMERO", referencedColumnName = "NUMERO"),
        @JoinColumn(name = "PRMATN_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC")})
    @ManyToOne(fetch = FetchType.LAZY)
    private PermanenciasYAtenciones permanenciasYAtenciones;

    public RegistrosObstetricia() {
    }

    public RegistrosObstetricia(RegistrosObstetriciaPK registrosObstetriciaPK) {
        this.registrosObstetriciaPK = registrosObstetriciaPK;
    }

    public RegistrosObstetricia(int pcnNumeroHc, int numero) {
        this.registrosObstetriciaPK = new RegistrosObstetriciaPK(pcnNumeroHc, numero);
    }

    public RegistrosObstetriciaPK getRegistrosObstetriciaPK() {
        return registrosObstetriciaPK;
    }

    public void setRegistrosObstetriciaPK(RegistrosObstetriciaPK registrosObstetriciaPK) {
        this.registrosObstetriciaPK = registrosObstetriciaPK;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFum() {
        return fum;
    }

    public void setFum(Date fum) {
        this.fum = fum;
    }

    public Date getFpp() {
        return fpp;
    }

    public void setFpp(Date fpp) {
        this.fpp = fpp;
    }

    public Short getEdadGestacional() {
        return edadGestacional;
    }

    public void setEdadGestacional(Short edadGestacional) {
        this.edadGestacional = edadGestacional;
    }

    public Character getTamanoFetalAdecuado() {
        return tamanoFetalAdecuado;
    }

    public void setTamanoFetalAdecuado(Character tamanoFetalAdecuado) {
        this.tamanoFetalAdecuado = tamanoFetalAdecuado;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getMembranas() {
        return membranas;
    }

    public void setMembranas(String membranas) {
        this.membranas = membranas;
    }

    public Date getFechaRuptura() {
        return fechaRuptura;
    }

    public void setFechaRuptura(Date fechaRuptura) {
        this.fechaRuptura = fechaRuptura;
    }

    public String getTerminacion() {
        return terminacion;
    }

    public void setTerminacion(String terminacion) {
        this.terminacion = terminacion;
    }

    public Date getFechaTerminacion() {
        return fechaTerminacion;
    }

    public void setFechaTerminacion(Date fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    public Character getAlumbramientoExp() {
        return alumbramientoExp;
    }

    public void setAlumbramientoExp(Character alumbramientoExp) {
        this.alumbramientoExp = alumbramientoExp;
    }

    public Character getPlacentaCompleta() {
        return placentaCompleta;
    }

    public void setPlacentaCompleta(Character placentaCompleta) {
        this.placentaCompleta = placentaCompleta;
    }

    public Character getEpisiotomia() {
        return episiotomia;
    }

    public void setEpisiotomia(Character episiotomia) {
        this.episiotomia = episiotomia;
    }

    public Character getDesgarros() {
        return desgarros;
    }

    public void setDesgarros(Character desgarros) {
        this.desgarros = desgarros;
    }

    public String getIndicacionDelParto() {
        return indicacionDelParto;
    }

    public void setIndicacionDelParto(String indicacionDelParto) {
        this.indicacionDelParto = indicacionDelParto;
    }

    public String getMedicacionParto() {
        return medicacionParto;
    }

    public void setMedicacionParto(String medicacionParto) {
        this.medicacionParto = medicacionParto;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public String getEstadoEgreso() {
        return estadoEgreso;
    }

    public void setEstadoEgreso(String estadoEgreso) {
        this.estadoEgreso = estadoEgreso;
    }

    public String getAnticoncepcion() {
        return anticoncepcion;
    }

    public void setAnticoncepcion(String anticoncepcion) {
        this.anticoncepcion = anticoncepcion;
    }

    public List<Puerperios> getPuerperiosList() {
        return puerperiosList;
    }

    public void setPuerperiosList(List<Puerperios> puerperiosList) {
        this.puerperiosList = puerperiosList;
    }

    public List<RecienNacidos> getRecienNacidosList() {
        return recienNacidosList;
    }

    public void setRecienNacidosList(List<RecienNacidos> recienNacidosList) {
        this.recienNacidosList = recienNacidosList;
    }

    public Embarazos getEmbarazos() {
        return embarazos;
    }

    public void setEmbarazos(Embarazos embarazos) {
        this.embarazos = embarazos;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registrosObstetriciaPK != null ? registrosObstetriciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrosObstetricia)) {
            return false;
        }
        RegistrosObstetricia other = (RegistrosObstetricia) object;
        if ((this.registrosObstetriciaPK == null && other.registrosObstetriciaPK != null) || (this.registrosObstetriciaPK != null && !this.registrosObstetriciaPK.equals(other.registrosObstetriciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RegistrosObstetricia[ registrosObstetriciaPK=" + registrosObstetriciaPK + " ]";
    }
    
}
