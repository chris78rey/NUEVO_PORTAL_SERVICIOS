/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ANTECEDENTES_INFANTILES")
@NamedQueries({
    @NamedQuery(name = "AntecedentesInfantiles.findAll", query = "SELECT a FROM AntecedentesInfantiles a")})
public class AntecedentesInfantiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @Column(name = "TIPO_PARTO")
    private String tipoParto;
    @Column(name = "LUGAR_PARTO")
    private String lugarParto;
    @Column(name = "ATENCION_PROFESIONAL")
    private Character atencionProfesional;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EDAD_GESTACIONAL")
    private BigDecimal edadGestacional;
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "TALLA")
    private BigDecimal talla;
    @Column(name = "PER_CEFALICO")
    private BigDecimal perCefalico;
    @Column(name = "N_ORDEN_NACIMIENTO")
    private Integer nOrdenNacimiento;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "APGAR")
    private Short apgar;
    @Column(name = "ALIMENTACION_NATURAL")
    private Character alimentacionNatural;
    @Column(name = "ALIMENTACION_ARTIFICIAL")
    private Character alimentacionArtificial;
    @Column(name = "ALIMENTACION_COMPLEMENTARIA")
    private String alimentacionComplementaria;
    @Column(name = "NOMBRE_ESTABLECIMIENTO")
    private String nombreEstablecimiento;
    @Column(name = "APGAR5")
    private Short apgar5;

    public AntecedentesInfantiles() {
    }

    public AntecedentesInfantiles(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getTipoParto() {
        return tipoParto;
    }

    public void setTipoParto(String tipoParto) {
        this.tipoParto = tipoParto;
    }

    public String getLugarParto() {
        return lugarParto;
    }

    public void setLugarParto(String lugarParto) {
        this.lugarParto = lugarParto;
    }

    public Character getAtencionProfesional() {
        return atencionProfesional;
    }

    public void setAtencionProfesional(Character atencionProfesional) {
        this.atencionProfesional = atencionProfesional;
    }

    public BigDecimal getEdadGestacional() {
        return edadGestacional;
    }

    public void setEdadGestacional(BigDecimal edadGestacional) {
        this.edadGestacional = edadGestacional;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getTalla() {
        return talla;
    }

    public void setTalla(BigDecimal talla) {
        this.talla = talla;
    }

    public BigDecimal getPerCefalico() {
        return perCefalico;
    }

    public void setPerCefalico(BigDecimal perCefalico) {
        this.perCefalico = perCefalico;
    }

    public Integer getNOrdenNacimiento() {
        return nOrdenNacimiento;
    }

    public void setNOrdenNacimiento(Integer nOrdenNacimiento) {
        this.nOrdenNacimiento = nOrdenNacimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Short getApgar() {
        return apgar;
    }

    public void setApgar(Short apgar) {
        this.apgar = apgar;
    }

    public Character getAlimentacionNatural() {
        return alimentacionNatural;
    }

    public void setAlimentacionNatural(Character alimentacionNatural) {
        this.alimentacionNatural = alimentacionNatural;
    }

    public Character getAlimentacionArtificial() {
        return alimentacionArtificial;
    }

    public void setAlimentacionArtificial(Character alimentacionArtificial) {
        this.alimentacionArtificial = alimentacionArtificial;
    }

    public String getAlimentacionComplementaria() {
        return alimentacionComplementaria;
    }

    public void setAlimentacionComplementaria(String alimentacionComplementaria) {
        this.alimentacionComplementaria = alimentacionComplementaria;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public void setNombreEstablecimiento(String nombreEstablecimiento) {
        this.nombreEstablecimiento = nombreEstablecimiento;
    }

    public Short getApgar5() {
        return apgar5;
    }

    public void setApgar5(Short apgar5) {
        this.apgar5 = apgar5;
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
        if (!(object instanceof AntecedentesInfantiles)) {
            return false;
        }
        AntecedentesInfantiles other = (AntecedentesInfantiles) object;
        if ((this.pcnNumeroHc == null && other.pcnNumeroHc != null) || (this.pcnNumeroHc != null && !this.pcnNumeroHc.equals(other.pcnNumeroHc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AntecedentesInfantiles[ pcnNumeroHc=" + pcnNumeroHc + " ]";
    }
    
}
