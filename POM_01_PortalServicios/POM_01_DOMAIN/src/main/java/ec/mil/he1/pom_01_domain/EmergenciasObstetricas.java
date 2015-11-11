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
@Table(name = "EMERGENCIAS_OBSTETRICAS")
@NamedQueries({
    @NamedQuery(name = "EmergenciasObstetricas.findAll", query = "SELECT e FROM EmergenciasObstetricas e")})
public class EmergenciasObstetricas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMG_ID")
    private String emgId;
    @Column(name = "GESTAS")
    private Short gestas;
    @Column(name = "PARTOS")
    private Short partos;
    @Column(name = "ABORTOS")
    private Short abortos;
    @Column(name = "CESAREAS")
    private Short cesareas;
    @Column(name = "FEC_ULT_MENS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecUltMens;
    @Column(name = "SEMANAS_GESTACION")
    private Short semanasGestacion;
    @Column(name = "MOVIMIENTO_FETAL")
    private Character movimientoFetal;
    @Column(name = "FREC_C_FETAL")
    private String frecCFetal;
    @Column(name = "MEMBRANAS_ROTAS")
    private Character membranasRotas;
    @Column(name = "TIEMPO")
    private String tiempo;
    @Column(name = "ALTURA_UTERINA")
    private String alturaUterina;
    @Column(name = "PRESENTACION")
    private String presentacion;
    @Column(name = "DILATACION")
    private String dilatacion;
    @Column(name = "BORRAMIENTO")
    private String borramiento;
    @Column(name = "PLANO")
    private String plano;
    @Column(name = "PELVIS_UTIL")
    private Character pelvisUtil;
    @Column(name = "SANGRADO_VAGINAL")
    private Character sangradoVaginal;
    @Column(name = "CONTRACCIONES")
    private String contracciones;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public EmergenciasObstetricas() {
    }

    public EmergenciasObstetricas(String emgId) {
        this.emgId = emgId;
    }

    public String getEmgId() {
        return emgId;
    }

    public void setEmgId(String emgId) {
        this.emgId = emgId;
    }

    public Short getGestas() {
        return gestas;
    }

    public void setGestas(Short gestas) {
        this.gestas = gestas;
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

    public Date getFecUltMens() {
        return fecUltMens;
    }

    public void setFecUltMens(Date fecUltMens) {
        this.fecUltMens = fecUltMens;
    }

    public Short getSemanasGestacion() {
        return semanasGestacion;
    }

    public void setSemanasGestacion(Short semanasGestacion) {
        this.semanasGestacion = semanasGestacion;
    }

    public Character getMovimientoFetal() {
        return movimientoFetal;
    }

    public void setMovimientoFetal(Character movimientoFetal) {
        this.movimientoFetal = movimientoFetal;
    }

    public String getFrecCFetal() {
        return frecCFetal;
    }

    public void setFrecCFetal(String frecCFetal) {
        this.frecCFetal = frecCFetal;
    }

    public Character getMembranasRotas() {
        return membranasRotas;
    }

    public void setMembranasRotas(Character membranasRotas) {
        this.membranasRotas = membranasRotas;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getAlturaUterina() {
        return alturaUterina;
    }

    public void setAlturaUterina(String alturaUterina) {
        this.alturaUterina = alturaUterina;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDilatacion() {
        return dilatacion;
    }

    public void setDilatacion(String dilatacion) {
        this.dilatacion = dilatacion;
    }

    public String getBorramiento() {
        return borramiento;
    }

    public void setBorramiento(String borramiento) {
        this.borramiento = borramiento;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Character getPelvisUtil() {
        return pelvisUtil;
    }

    public void setPelvisUtil(Character pelvisUtil) {
        this.pelvisUtil = pelvisUtil;
    }

    public Character getSangradoVaginal() {
        return sangradoVaginal;
    }

    public void setSangradoVaginal(Character sangradoVaginal) {
        this.sangradoVaginal = sangradoVaginal;
    }

    public String getContracciones() {
        return contracciones;
    }

    public void setContracciones(String contracciones) {
        this.contracciones = contracciones;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emgId != null ? emgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmergenciasObstetricas)) {
            return false;
        }
        EmergenciasObstetricas other = (EmergenciasObstetricas) object;
        if ((this.emgId == null && other.emgId != null) || (this.emgId != null && !this.emgId.equals(other.emgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EmergenciasObstetricas[ emgId=" + emgId + " ]";
    }
    
}
