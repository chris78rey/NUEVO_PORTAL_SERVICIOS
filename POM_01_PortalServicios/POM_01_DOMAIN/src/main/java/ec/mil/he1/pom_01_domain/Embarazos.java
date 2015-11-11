/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "EMBARAZOS")
@NamedQueries({
    @NamedQuery(name = "Embarazos.findAll", query = "SELECT e FROM Embarazos e")})
public class Embarazos implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmbarazosPK embarazosPK;
    @Column(name = "PESO_ANTERIOR")
    private Short pesoAnterior;
    @Column(name = "FUM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fum;
    @Column(name = "FPP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fpp;
    @Column(name = "FPPUS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fppus;
    @Column(name = "DUDAS")
    private Character dudas;
    @Column(name = "ANTITETANICA_PREVIA")
    private Character antitetanicaPrevia;
    @Column(name = "ANTITETANICA_ACTUAL1")
    private Short antitetanicaActual1;
    @Column(name = "ANTITETANICA_ACTUAL2")
    private Short antitetanicaActual2;
    @Column(name = "SENSIBILIDAD")
    private Character sensibilidad;
    @Column(name = "FUMA")
    private Character fuma;
    @Column(name = "CIGARRILLOS_POR_DIA")
    private Short cigarrillosPorDia;
    @Column(name = "HOSPITALIZACION")
    private Character hospitalizacion;
    @Column(name = "TRASLADO")
    private Character traslado;
    @Column(name = "EX_CLINICO_NORMAL")
    private Character exClinicoNormal;
    @Column(name = "EX_MAMAS_NORMAL")
    private Character exMamasNormal;
    @Column(name = "EX_ODONTOLIGICO_NORMAL")
    private Character exOdontoligicoNormal;
    @Column(name = "PELVIS_NORMAL")
    private Character pelvisNormal;
    @Column(name = "PAPANICOLAUS_NORMAL")
    private Character papanicolausNormal;
    @Column(name = "COLPOSCOPIA_NORMAL")
    private Character colposcopiaNormal;
    @Column(name = "CERVIX_NORMAL")
    private Character cervixNormal;
    @Column(name = "VDRL")
    private String vdrl;
    @Column(name = "FECHA_VDRL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVdrl;
    @Column(name = "GLUCOSA")
    private Short glucosa;
    @Column(name = "FECHA_GLUCOSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaGlucosa;
    @Column(name = "HB1")
    private Short hb1;
    @Column(name = "FECHA_HB1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHb1;
    @Column(name = "HB2")
    private Short hb2;
    @Column(name = "FECHA_HB2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHb2;
    @Column(name = "CMP_ANT_EMBARAZO")
    private String cmpAntEmbarazo;
    @Column(name = "ATN_ULT_PARTO")
    private String atnUltParto;
    @Column(name = "LUGAR")
    private String lugar;
    @Column(name = "TIPO_SANGRE_PADRE")
    private String tipoSangrePadre;

    public Embarazos() {
    }

    public Embarazos(EmbarazosPK embarazosPK) {
        this.embarazosPK = embarazosPK;
    }

    public Embarazos(int pcnNumeroHc, int numero) {
        this.embarazosPK = new EmbarazosPK(pcnNumeroHc, numero);
    }

    public EmbarazosPK getEmbarazosPK() {
        return embarazosPK;
    }

    public void setEmbarazosPK(EmbarazosPK embarazosPK) {
        this.embarazosPK = embarazosPK;
    }

    public Short getPesoAnterior() {
        return pesoAnterior;
    }

    public void setPesoAnterior(Short pesoAnterior) {
        this.pesoAnterior = pesoAnterior;
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

    public Date getFppus() {
        return fppus;
    }

    public void setFppus(Date fppus) {
        this.fppus = fppus;
    }

    public Character getDudas() {
        return dudas;
    }

    public void setDudas(Character dudas) {
        this.dudas = dudas;
    }

    public Character getAntitetanicaPrevia() {
        return antitetanicaPrevia;
    }

    public void setAntitetanicaPrevia(Character antitetanicaPrevia) {
        this.antitetanicaPrevia = antitetanicaPrevia;
    }

    public Short getAntitetanicaActual1() {
        return antitetanicaActual1;
    }

    public void setAntitetanicaActual1(Short antitetanicaActual1) {
        this.antitetanicaActual1 = antitetanicaActual1;
    }

    public Short getAntitetanicaActual2() {
        return antitetanicaActual2;
    }

    public void setAntitetanicaActual2(Short antitetanicaActual2) {
        this.antitetanicaActual2 = antitetanicaActual2;
    }

    public Character getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(Character sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public Character getFuma() {
        return fuma;
    }

    public void setFuma(Character fuma) {
        this.fuma = fuma;
    }

    public Short getCigarrillosPorDia() {
        return cigarrillosPorDia;
    }

    public void setCigarrillosPorDia(Short cigarrillosPorDia) {
        this.cigarrillosPorDia = cigarrillosPorDia;
    }

    public Character getHospitalizacion() {
        return hospitalizacion;
    }

    public void setHospitalizacion(Character hospitalizacion) {
        this.hospitalizacion = hospitalizacion;
    }

    public Character getTraslado() {
        return traslado;
    }

    public void setTraslado(Character traslado) {
        this.traslado = traslado;
    }

    public Character getExClinicoNormal() {
        return exClinicoNormal;
    }

    public void setExClinicoNormal(Character exClinicoNormal) {
        this.exClinicoNormal = exClinicoNormal;
    }

    public Character getExMamasNormal() {
        return exMamasNormal;
    }

    public void setExMamasNormal(Character exMamasNormal) {
        this.exMamasNormal = exMamasNormal;
    }

    public Character getExOdontoligicoNormal() {
        return exOdontoligicoNormal;
    }

    public void setExOdontoligicoNormal(Character exOdontoligicoNormal) {
        this.exOdontoligicoNormal = exOdontoligicoNormal;
    }

    public Character getPelvisNormal() {
        return pelvisNormal;
    }

    public void setPelvisNormal(Character pelvisNormal) {
        this.pelvisNormal = pelvisNormal;
    }

    public Character getPapanicolausNormal() {
        return papanicolausNormal;
    }

    public void setPapanicolausNormal(Character papanicolausNormal) {
        this.papanicolausNormal = papanicolausNormal;
    }

    public Character getColposcopiaNormal() {
        return colposcopiaNormal;
    }

    public void setColposcopiaNormal(Character colposcopiaNormal) {
        this.colposcopiaNormal = colposcopiaNormal;
    }

    public Character getCervixNormal() {
        return cervixNormal;
    }

    public void setCervixNormal(Character cervixNormal) {
        this.cervixNormal = cervixNormal;
    }

    public String getVdrl() {
        return vdrl;
    }

    public void setVdrl(String vdrl) {
        this.vdrl = vdrl;
    }

    public Date getFechaVdrl() {
        return fechaVdrl;
    }

    public void setFechaVdrl(Date fechaVdrl) {
        this.fechaVdrl = fechaVdrl;
    }

    public Short getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(Short glucosa) {
        this.glucosa = glucosa;
    }

    public Date getFechaGlucosa() {
        return fechaGlucosa;
    }

    public void setFechaGlucosa(Date fechaGlucosa) {
        this.fechaGlucosa = fechaGlucosa;
    }

    public Short getHb1() {
        return hb1;
    }

    public void setHb1(Short hb1) {
        this.hb1 = hb1;
    }

    public Date getFechaHb1() {
        return fechaHb1;
    }

    public void setFechaHb1(Date fechaHb1) {
        this.fechaHb1 = fechaHb1;
    }

    public Short getHb2() {
        return hb2;
    }

    public void setHb2(Short hb2) {
        this.hb2 = hb2;
    }

    public Date getFechaHb2() {
        return fechaHb2;
    }

    public void setFechaHb2(Date fechaHb2) {
        this.fechaHb2 = fechaHb2;
    }

    public String getCmpAntEmbarazo() {
        return cmpAntEmbarazo;
    }

    public void setCmpAntEmbarazo(String cmpAntEmbarazo) {
        this.cmpAntEmbarazo = cmpAntEmbarazo;
    }

    public String getAtnUltParto() {
        return atnUltParto;
    }

    public void setAtnUltParto(String atnUltParto) {
        this.atnUltParto = atnUltParto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipoSangrePadre() {
        return tipoSangrePadre;
    }

    public void setTipoSangrePadre(String tipoSangrePadre) {
        this.tipoSangrePadre = tipoSangrePadre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (embarazosPK != null ? embarazosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Embarazos)) {
            return false;
        }
        Embarazos other = (Embarazos) object;
        if ((this.embarazosPK == null && other.embarazosPK != null) || (this.embarazosPK != null && !this.embarazosPK.equals(other.embarazosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Embarazos[ embarazosPK=" + embarazosPK + " ]";
    }
    
}
