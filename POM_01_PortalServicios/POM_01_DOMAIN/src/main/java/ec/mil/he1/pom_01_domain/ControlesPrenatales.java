/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CONTROLES_PRENATALES")
@NamedQueries({
    @NamedQuery(name = "ControlesPrenatales.findAll", query = "SELECT c FROM ControlesPrenatales c")})
public class ControlesPrenatales implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ControlesPrenatalesPK controlesPrenatalesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SEMANAS_GESTACION")
    private BigDecimal semanasGestacion;
    @Column(name = "PESO")
    private Short peso;
    @Column(name = "TENSION_ARTERIAL")
    private String tensionArterial;
    @Column(name = "MOVIMIENTOS_FETALES")
    private Character movimientosFetales;
    @Column(name = "FRECUENCA_CARDIACA_F")
    private Short frecuencaCardiacaF;
    @Column(name = "PRESENTACION_FETAL")
    private String presentacionFetal;
    @Column(name = "SANGRADO_GENITAL")
    private Character sangradoGenital;
    @Column(name = "EDEMA")
    private Character edema;
    @Column(name = "ALIMENTACION_COMPLEMENTARIA")
    private String alimentacionComplementaria;
    @Column(name = "ULTRASONIDOS")
    private String ultrasonidos;
    @Column(name = "TERAPIA_MEDICAMENTOSA")
    private String terapiaMedicamentosa;
    @Column(name = "TERAPIA_HORMONAL")
    private String terapiaHormonal;
    @Column(name = "INFECCION_GENITO_URINARIAS")
    private Character infeccionGenitoUrinarias;
    @Column(name = "VULVOVAGINITIS")
    private Character vulvovaginitis;
    @Column(name = "AFU")
    private Short afu;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public ControlesPrenatales() {
    }

    public ControlesPrenatales(ControlesPrenatalesPK controlesPrenatalesPK) {
        this.controlesPrenatalesPK = controlesPrenatalesPK;
    }

    public ControlesPrenatales(int embNumero, int embPcnNumeroHc, Date fecha) {
        this.controlesPrenatalesPK = new ControlesPrenatalesPK(embNumero, embPcnNumeroHc, fecha);
    }

    public ControlesPrenatalesPK getControlesPrenatalesPK() {
        return controlesPrenatalesPK;
    }

    public void setControlesPrenatalesPK(ControlesPrenatalesPK controlesPrenatalesPK) {
        this.controlesPrenatalesPK = controlesPrenatalesPK;
    }

    public BigDecimal getSemanasGestacion() {
        return semanasGestacion;
    }

    public void setSemanasGestacion(BigDecimal semanasGestacion) {
        this.semanasGestacion = semanasGestacion;
    }

    public Short getPeso() {
        return peso;
    }

    public void setPeso(Short peso) {
        this.peso = peso;
    }

    public String getTensionArterial() {
        return tensionArterial;
    }

    public void setTensionArterial(String tensionArterial) {
        this.tensionArterial = tensionArterial;
    }

    public Character getMovimientosFetales() {
        return movimientosFetales;
    }

    public void setMovimientosFetales(Character movimientosFetales) {
        this.movimientosFetales = movimientosFetales;
    }

    public Short getFrecuencaCardiacaF() {
        return frecuencaCardiacaF;
    }

    public void setFrecuencaCardiacaF(Short frecuencaCardiacaF) {
        this.frecuencaCardiacaF = frecuencaCardiacaF;
    }

    public String getPresentacionFetal() {
        return presentacionFetal;
    }

    public void setPresentacionFetal(String presentacionFetal) {
        this.presentacionFetal = presentacionFetal;
    }

    public Character getSangradoGenital() {
        return sangradoGenital;
    }

    public void setSangradoGenital(Character sangradoGenital) {
        this.sangradoGenital = sangradoGenital;
    }

    public Character getEdema() {
        return edema;
    }

    public void setEdema(Character edema) {
        this.edema = edema;
    }

    public String getAlimentacionComplementaria() {
        return alimentacionComplementaria;
    }

    public void setAlimentacionComplementaria(String alimentacionComplementaria) {
        this.alimentacionComplementaria = alimentacionComplementaria;
    }

    public String getUltrasonidos() {
        return ultrasonidos;
    }

    public void setUltrasonidos(String ultrasonidos) {
        this.ultrasonidos = ultrasonidos;
    }

    public String getTerapiaMedicamentosa() {
        return terapiaMedicamentosa;
    }

    public void setTerapiaMedicamentosa(String terapiaMedicamentosa) {
        this.terapiaMedicamentosa = terapiaMedicamentosa;
    }

    public String getTerapiaHormonal() {
        return terapiaHormonal;
    }

    public void setTerapiaHormonal(String terapiaHormonal) {
        this.terapiaHormonal = terapiaHormonal;
    }

    public Character getInfeccionGenitoUrinarias() {
        return infeccionGenitoUrinarias;
    }

    public void setInfeccionGenitoUrinarias(Character infeccionGenitoUrinarias) {
        this.infeccionGenitoUrinarias = infeccionGenitoUrinarias;
    }

    public Character getVulvovaginitis() {
        return vulvovaginitis;
    }

    public void setVulvovaginitis(Character vulvovaginitis) {
        this.vulvovaginitis = vulvovaginitis;
    }

    public Short getAfu() {
        return afu;
    }

    public void setAfu(Short afu) {
        this.afu = afu;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (controlesPrenatalesPK != null ? controlesPrenatalesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlesPrenatales)) {
            return false;
        }
        ControlesPrenatales other = (ControlesPrenatales) object;
        if ((this.controlesPrenatalesPK == null && other.controlesPrenatalesPK != null) || (this.controlesPrenatalesPK != null && !this.controlesPrenatalesPK.equals(other.controlesPrenatalesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ControlesPrenatales[ controlesPrenatalesPK=" + controlesPrenatalesPK + " ]";
    }
    
}
