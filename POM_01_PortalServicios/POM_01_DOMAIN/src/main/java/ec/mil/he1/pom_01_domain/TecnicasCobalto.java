/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TECNICAS_COBALTO")
@NamedQueries({
    @NamedQuery(name = "TecnicasCobalto.findAll", query = "SELECT t FROM TecnicasCobalto t")})
public class TecnicasCobalto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TecnicasCobaltoPK tecnicasCobaltoPK;
    @Column(name = "TECNICA")
    private String tecnica;
    @Column(name = "ANCHO_CAMPO")
    private Short anchoCampo;
    @Column(name = "ALTO_CAMPO")
    private Short altoCampo;
    @Column(name = "TIMMER")
    private Short timmer;
    @Column(name = "DIAMETROS")
    private String diametros;
    @Column(name = "EQUIPO")
    private String equipo;
    @Column(name = "DISTANCIA")
    private Short distancia;
    @Column(name = "TAMANO_CAMPO")
    private Short tamanoCampo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AIRE_CAMPO")
    private BigDecimal aireCampo;
    @Column(name = "FACTOR")
    private Integer factor;
    @Column(name = "PIEL")
    private BigDecimal piel;
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Column(name = "TAR")
    private BigDecimal tar;
    @Column(name = "TUMOR")
    private Integer tumor;

    public TecnicasCobalto() {
    }

    public TecnicasCobalto(TecnicasCobaltoPK tecnicasCobaltoPK) {
        this.tecnicasCobaltoPK = tecnicasCobaltoPK;
    }

    public TecnicasCobalto(int fchcblNumero, short numero) {
        this.tecnicasCobaltoPK = new TecnicasCobaltoPK(fchcblNumero, numero);
    }

    public TecnicasCobaltoPK getTecnicasCobaltoPK() {
        return tecnicasCobaltoPK;
    }

    public void setTecnicasCobaltoPK(TecnicasCobaltoPK tecnicasCobaltoPK) {
        this.tecnicasCobaltoPK = tecnicasCobaltoPK;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public Short getAnchoCampo() {
        return anchoCampo;
    }

    public void setAnchoCampo(Short anchoCampo) {
        this.anchoCampo = anchoCampo;
    }

    public Short getAltoCampo() {
        return altoCampo;
    }

    public void setAltoCampo(Short altoCampo) {
        this.altoCampo = altoCampo;
    }

    public Short getTimmer() {
        return timmer;
    }

    public void setTimmer(Short timmer) {
        this.timmer = timmer;
    }

    public String getDiametros() {
        return diametros;
    }

    public void setDiametros(String diametros) {
        this.diametros = diametros;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Short getDistancia() {
        return distancia;
    }

    public void setDistancia(Short distancia) {
        this.distancia = distancia;
    }

    public Short getTamanoCampo() {
        return tamanoCampo;
    }

    public void setTamanoCampo(Short tamanoCampo) {
        this.tamanoCampo = tamanoCampo;
    }

    public BigDecimal getAireCampo() {
        return aireCampo;
    }

    public void setAireCampo(BigDecimal aireCampo) {
        this.aireCampo = aireCampo;
    }

    public Integer getFactor() {
        return factor;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
    }

    public BigDecimal getPiel() {
        return piel;
    }

    public void setPiel(BigDecimal piel) {
        this.piel = piel;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public BigDecimal getTar() {
        return tar;
    }

    public void setTar(BigDecimal tar) {
        this.tar = tar;
    }

    public Integer getTumor() {
        return tumor;
    }

    public void setTumor(Integer tumor) {
        this.tumor = tumor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tecnicasCobaltoPK != null ? tecnicasCobaltoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TecnicasCobalto)) {
            return false;
        }
        TecnicasCobalto other = (TecnicasCobalto) object;
        if ((this.tecnicasCobaltoPK == null && other.tecnicasCobaltoPK != null) || (this.tecnicasCobaltoPK != null && !this.tecnicasCobaltoPK.equals(other.tecnicasCobaltoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TecnicasCobalto[ tecnicasCobaltoPK=" + tecnicasCobaltoPK + " ]";
    }
    
}
