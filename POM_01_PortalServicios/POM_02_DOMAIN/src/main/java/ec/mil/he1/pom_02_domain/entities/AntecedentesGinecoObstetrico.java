/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ANTECEDENTES_GINECO_OBSTETRICO")
@NamedQueries({
    @NamedQuery(name = "AntecedentesGinecoObstetrico.findAll", query = "SELECT a FROM AntecedentesGinecoObstetrico a")})
public class AntecedentesGinecoObstetrico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "MAMOGRAFIA")
    private Character mamografia;
    @Column(name = "MENARQUIA")
    private Short menarquia;
    @Column(name = "CICLOS_DIAS")
    private Short ciclosDias;
    @Column(name = "CICLOS_TIEMPO")
    private Short ciclosTiempo;
    @Column(name = "MENOPAUSIA")
    private Short menopausia;
    @Column(name = "VSA")
    private Short vsa;
    @Column(name = "FUM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fum;
    @Column(name = "GESTACIONES")
    private Short gestaciones;
    @Column(name = "PARTOS")
    private Short partos;
    @Column(name = "ABORTOS")
    private Short abortos;
    @Column(name = "CESAREAS")
    private Short cesareas;
    @Column(name = "HIJOS_VIVOS")
    private Short hijosVivos;
    @Column(name = "FUP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fup;
    @Column(name = "METODO_DE_REGULACION")
    private String metodoDeRegulacion;
    @Column(name = "TRH")
    private String trh;
    @Column(name = "FUC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fuc;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "CICLO_MENSTRUAL")
    private String cicloMenstrual;
    @Column(name = "NPAREJAS")
    private Short nparejas;
    @Column(name = "INFERTILIDAD")
    private String infertilidad;
    @Column(name = "TIEMPO")
    private Short tiempo;
    @Column(name = "TIEMPO_USO")
    private String tiempoUso;
    @Column(name = "CAUSA")
    private String causa;
    @Column(name = "EPE")
    private Short epe;
    @Column(name = "TIPO_ABORTO")
    private String tipoAborto;
    @Column(name = "NUM_HIJOS")
    private Short numHijos;
    @Column(name = "NUM_MUERTOS")
    private Short numMuertos;
    @Column(name = "OTROS")
    private Short otros;
    @Column(name = "GEMELARES")
    private Character gemelares;
    @Column(name = "RN_PESO_BAJO")
    private Short rnPesoBajo;
    @Column(name = "RN_MAYOR_PESO")
    private Short rnMayorPeso;
    @Column(name = "LACTANCIA_MATERNA")
    private Short lactanciaMaterna;
    @Column(name = "DISMENORREAS")
    private Character dismenorreas;
    @Column(name = "ABANDONO_METODO")
    private Character abandonoMetodo;
    @Column(name = "PARA")
    private Short para;
    @JoinColumn(name = "PCN_NUMERO_HC", referencedColumnName = "NUMERO_HC", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Pacientes pacientes;

    public AntecedentesGinecoObstetrico() {
    }

    public AntecedentesGinecoObstetrico(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Character getMamografia() {
        return mamografia;
    }

    public void setMamografia(Character mamografia) {
        this.mamografia = mamografia;
    }

    public Short getMenarquia() {
        return menarquia;
    }

    public void setMenarquia(Short menarquia) {
        this.menarquia = menarquia;
    }

    public Short getCiclosDias() {
        return ciclosDias;
    }

    public void setCiclosDias(Short ciclosDias) {
        this.ciclosDias = ciclosDias;
    }

    public Short getCiclosTiempo() {
        return ciclosTiempo;
    }

    public void setCiclosTiempo(Short ciclosTiempo) {
        this.ciclosTiempo = ciclosTiempo;
    }

    public Short getMenopausia() {
        return menopausia;
    }

    public void setMenopausia(Short menopausia) {
        this.menopausia = menopausia;
    }

    public Short getVsa() {
        return vsa;
    }

    public void setVsa(Short vsa) {
        this.vsa = vsa;
    }

    public Date getFum() {
        return fum;
    }

    public void setFum(Date fum) {
        this.fum = fum;
    }

    public Short getGestaciones() {
        return gestaciones;
    }

    public void setGestaciones(Short gestaciones) {
        this.gestaciones = gestaciones;
    }

    public Short getPartos() {
        return partos;
    }

    public void setPartos(Short partos) {
        this.partos = partos;
    }

    public Short getAbortos() {
        return abortos;
    }

    public void setAbortos(Short abortos) {
        this.abortos = abortos;
    }

    public Short getCesareas() {
        return cesareas;
    }

    public void setCesareas(Short cesareas) {
        this.cesareas = cesareas;
    }

    public Short getHijosVivos() {
        return hijosVivos;
    }

    public void setHijosVivos(Short hijosVivos) {
        this.hijosVivos = hijosVivos;
    }

    public Date getFup() {
        return fup;
    }

    public void setFup(Date fup) {
        this.fup = fup;
    }

    public String getMetodoDeRegulacion() {
        return metodoDeRegulacion;
    }

    public void setMetodoDeRegulacion(String metodoDeRegulacion) {
        this.metodoDeRegulacion = metodoDeRegulacion;
    }

    public String getTrh() {
        return trh;
    }

    public void setTrh(String trh) {
        this.trh = trh;
    }

    public Date getFuc() {
        return fuc;
    }

    public void setFuc(Date fuc) {
        this.fuc = fuc;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCicloMenstrual() {
        return cicloMenstrual;
    }

    public void setCicloMenstrual(String cicloMenstrual) {
        this.cicloMenstrual = cicloMenstrual;
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

    public String getTiempoUso() {
        return tiempoUso;
    }

    public void setTiempoUso(String tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public Short getEpe() {
        return epe;
    }

    public void setEpe(Short epe) {
        this.epe = epe;
    }

    public String getTipoAborto() {
        return tipoAborto;
    }

    public void setTipoAborto(String tipoAborto) {
        this.tipoAborto = tipoAborto;
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

    public Character getGemelares() {
        return gemelares;
    }

    public void setGemelares(Character gemelares) {
        this.gemelares = gemelares;
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

    public Short getLactanciaMaterna() {
        return lactanciaMaterna;
    }

    public void setLactanciaMaterna(Short lactanciaMaterna) {
        this.lactanciaMaterna = lactanciaMaterna;
    }

    public Character getDismenorreas() {
        return dismenorreas;
    }

    public void setDismenorreas(Character dismenorreas) {
        this.dismenorreas = dismenorreas;
    }

    public Character getAbandonoMetodo() {
        return abandonoMetodo;
    }

    public void setAbandonoMetodo(Character abandonoMetodo) {
        this.abandonoMetodo = abandonoMetodo;
    }

    public Short getPara() {
        return para;
    }

    public void setPara(Short para) {
        this.para = para;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
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
        if (!(object instanceof AntecedentesGinecoObstetrico)) {
            return false;
        }
        AntecedentesGinecoObstetrico other = (AntecedentesGinecoObstetrico) object;
        if ((this.pcnNumeroHc == null && other.pcnNumeroHc != null) || (this.pcnNumeroHc != null && !this.pcnNumeroHc.equals(other.pcnNumeroHc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.AntecedentesGinecoObstetrico[ pcnNumeroHc=" + pcnNumeroHc + " ]";
    }
    
}
