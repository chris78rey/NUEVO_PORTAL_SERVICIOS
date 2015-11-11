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
@Table(name = "ANAMNESISES_FISIOLOGICA")
@NamedQueries({
    @NamedQuery(name = "AnamnesisesFisiologica.findAll", query = "SELECT a FROM AnamnesisesFisiologica a")})
public class AnamnesisesFisiologica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "GESTAS")
    private Short gestas;
    @Column(name = "PARA")
    private Short para;
    @Column(name = "ABORTO")
    private Short aborto;
    @Column(name = "TIPO_ABORTO")
    private String tipoAborto;
    @Column(name = "CESAREA")
    private Short cesarea;
    @Column(name = "PARTO_NORMAL")
    private Short partoNormal;
    @Column(name = "GEMELARES")
    private Character gemelares;
    @Column(name = "NUM_HIJOS")
    private Short numHijos;
    @Column(name = "NUM_MUERTOS")
    private Short numMuertos;
    @Column(name = "OTROS")
    private Short otros;
    @Column(name = "NINGUNO")
    private Character ninguno;
    @Column(name = "RN_PESO_BAJO")
    private Short rnPesoBajo;
    @Column(name = "RN_MAYOR_PESO")
    private Short rnMayorPeso;
    @Column(name = "FUP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fup;
    @Column(name = "MENARQUIA")
    private Short menarquia;
    @Column(name = "MENOPAUSIA")
    private Short menopausia;
    @Column(name = "CICLO_MENSTRUAL")
    private String cicloMenstrual;
    @Column(name = "DISMENORREAS")
    private Character dismenorreas;
    @Column(name = "TIPO_CICLO_MENSTRUAL")
    private String tipoCicloMenstrual;
    @Column(name = "FUM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fum;
    @Column(name = "VSA")
    private Short vsa;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "NPAREJAS")
    private Short nparejas;
    @Column(name = "INFERTILIDAD")
    private String infertilidad;
    @Column(name = "TIEMPO")
    private Short tiempo;
    @Column(name = "LACTANCIA_MATERNA")
    private Short lactanciaMaterna;
    @Column(name = "EPE")
    private Short epe;
    @Column(name = "VIOLENCIA_FISICA")
    private Character violenciaFisica;
    @Column(name = "VIOLENCIA_PSICOLOGICA")
    private Character violenciaPsicologica;
    @Column(name = "VIOLENCIA_SEXUAL")
    private Character violenciaSexual;
    @Column(name = "FECHA_ULTIMO_PAP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaUltimoPap;
    @Column(name = "METODO_ANTICONCEPTIVO")
    private String metodoAnticonceptivo;
    @Column(name = "TIEMPO_USO")
    private String tiempoUso;
    @Column(name = "ABANDONO_METODO")
    private Character abandonoMetodo;
    @Column(name = "CAUSA")
    private String causa;
    @Column(name = "HIJOS_VIVOS")
    private Short hijosVivos;

    public AnamnesisesFisiologica() {
    }

    public AnamnesisesFisiologica(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Short getGestas() {
        return gestas;
    }

    public void setGestas(Short gestas) {
        this.gestas = gestas;
    }

    public Short getPara() {
        return para;
    }

    public void setPara(Short para) {
        this.para = para;
    }

    public Short getAborto() {
        return aborto;
    }

    public void setAborto(Short aborto) {
        this.aborto = aborto;
    }

    public String getTipoAborto() {
        return tipoAborto;
    }

    public void setTipoAborto(String tipoAborto) {
        this.tipoAborto = tipoAborto;
    }

    public Short getCesarea() {
        return cesarea;
    }

    public void setCesarea(Short cesarea) {
        this.cesarea = cesarea;
    }

    public Short getPartoNormal() {
        return partoNormal;
    }

    public void setPartoNormal(Short partoNormal) {
        this.partoNormal = partoNormal;
    }

    public Character getGemelares() {
        return gemelares;
    }

    public void setGemelares(Character gemelares) {
        this.gemelares = gemelares;
    }

    public Short getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(Short numHijos) {
        this.numHijos = numHijos;
    }

    public Short getNumMuertos() {
        return numMuertos;
    }

    public void setNumMuertos(Short numMuertos) {
        this.numMuertos = numMuertos;
    }

    public Short getOtros() {
        return otros;
    }

    public void setOtros(Short otros) {
        this.otros = otros;
    }

    public Character getNinguno() {
        return ninguno;
    }

    public void setNinguno(Character ninguno) {
        this.ninguno = ninguno;
    }

    public Short getRnPesoBajo() {
        return rnPesoBajo;
    }

    public void setRnPesoBajo(Short rnPesoBajo) {
        this.rnPesoBajo = rnPesoBajo;
    }

    public Short getRnMayorPeso() {
        return rnMayorPeso;
    }

    public void setRnMayorPeso(Short rnMayorPeso) {
        this.rnMayorPeso = rnMayorPeso;
    }

    public Date getFup() {
        return fup;
    }

    public void setFup(Date fup) {
        this.fup = fup;
    }

    public Short getMenarquia() {
        return menarquia;
    }

    public void setMenarquia(Short menarquia) {
        this.menarquia = menarquia;
    }

    public Short getMenopausia() {
        return menopausia;
    }

    public void setMenopausia(Short menopausia) {
        this.menopausia = menopausia;
    }

    public String getCicloMenstrual() {
        return cicloMenstrual;
    }

    public void setCicloMenstrual(String cicloMenstrual) {
        this.cicloMenstrual = cicloMenstrual;
    }

    public Character getDismenorreas() {
        return dismenorreas;
    }

    public void setDismenorreas(Character dismenorreas) {
        this.dismenorreas = dismenorreas;
    }

    public String getTipoCicloMenstrual() {
        return tipoCicloMenstrual;
    }

    public void setTipoCicloMenstrual(String tipoCicloMenstrual) {
        this.tipoCicloMenstrual = tipoCicloMenstrual;
    }

    public Date getFum() {
        return fum;
    }

    public void setFum(Date fum) {
        this.fum = fum;
    }

    public Short getVsa() {
        return vsa;
    }

    public void setVsa(Short vsa) {
        this.vsa = vsa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Short getNparejas() {
        return nparejas;
    }

    public void setNparejas(Short nparejas) {
        this.nparejas = nparejas;
    }

    public String getInfertilidad() {
        return infertilidad;
    }

    public void setInfertilidad(String infertilidad) {
        this.infertilidad = infertilidad;
    }

    public Short getTiempo() {
        return tiempo;
    }

    public void setTiempo(Short tiempo) {
        this.tiempo = tiempo;
    }

    public Short getLactanciaMaterna() {
        return lactanciaMaterna;
    }

    public void setLactanciaMaterna(Short lactanciaMaterna) {
        this.lactanciaMaterna = lactanciaMaterna;
    }

    public Short getEpe() {
        return epe;
    }

    public void setEpe(Short epe) {
        this.epe = epe;
    }

    public Character getViolenciaFisica() {
        return violenciaFisica;
    }

    public void setViolenciaFisica(Character violenciaFisica) {
        this.violenciaFisica = violenciaFisica;
    }

    public Character getViolenciaPsicologica() {
        return violenciaPsicologica;
    }

    public void setViolenciaPsicologica(Character violenciaPsicologica) {
        this.violenciaPsicologica = violenciaPsicologica;
    }

    public Character getViolenciaSexual() {
        return violenciaSexual;
    }

    public void setViolenciaSexual(Character violenciaSexual) {
        this.violenciaSexual = violenciaSexual;
    }

    public Date getFechaUltimoPap() {
        return fechaUltimoPap;
    }

    public void setFechaUltimoPap(Date fechaUltimoPap) {
        this.fechaUltimoPap = fechaUltimoPap;
    }

    public String getMetodoAnticonceptivo() {
        return metodoAnticonceptivo;
    }

    public void setMetodoAnticonceptivo(String metodoAnticonceptivo) {
        this.metodoAnticonceptivo = metodoAnticonceptivo;
    }

    public String getTiempoUso() {
        return tiempoUso;
    }

    public void setTiempoUso(String tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    public Character getAbandonoMetodo() {
        return abandonoMetodo;
    }

    public void setAbandonoMetodo(Character abandonoMetodo) {
        this.abandonoMetodo = abandonoMetodo;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public Short getHijosVivos() {
        return hijosVivos;
    }

    public void setHijosVivos(Short hijosVivos) {
        this.hijosVivos = hijosVivos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcnNumeroHc != null ? pcnNumeroHc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnamnesisesFisiologica)) {
            return false;
        }
        AnamnesisesFisiologica other = (AnamnesisesFisiologica) object;
        if ((this.pcnNumeroHc == null && other.pcnNumeroHc != null) || (this.pcnNumeroHc != null && !this.pcnNumeroHc.equals(other.pcnNumeroHc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AnamnesisesFisiologica[ pcnNumeroHc=" + pcnNumeroHc + " ]";
    }
    
}
