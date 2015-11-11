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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "RECUPERACION_POST_ANESTESICA")
@NamedQueries({
    @NamedQuery(name = "RecuperacionPostAnestesica.findAll", query = "SELECT r FROM RecuperacionPostAnestesica r")})
public class RecuperacionPostAnestesica implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RecuperacionPostAnestesicaPK recuperacionPostAnestesicaPK;
    @Column(name = "GENERAL")
    private Character general;
    @Column(name = "CONDUCTIVA")
    private Character conductiva;
    @Column(name = "LOCAL")
    private Character local;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INDUCCION")
    private BigDecimal induccion;
    @Column(name = "MATENIMIENTO")
    private BigDecimal matenimiento;
    @Column(name = "CONSCIENTE")
    private Character consciente;
    @Column(name = "SEMICONSCIENTE")
    private Character semiconsciente;
    @Column(name = "INCONSCIENTE")
    private Character inconsciente;
    @Column(name = "SALIDA_DE_QUIROFANO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date salidaDeQuirofano;
    @Column(name = "ENTRADA_A_RECUPERACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entradaARecuperacion;
    @Column(name = "PRS_CODIGOENT")
    private String prsCodigoent;
    @Column(name = "PRS_CODIGORCB")
    private String prsCodigorcb;
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;

    public RecuperacionPostAnestesica() {
    }

    public RecuperacionPostAnestesica(RecuperacionPostAnestesicaPK recuperacionPostAnestesicaPK) {
        this.recuperacionPostAnestesicaPK = recuperacionPostAnestesicaPK;
    }

    public RecuperacionPostAnestesica(String rgsoprPrsCodigo, int rgsoprPrtoprslcNumero, int rgsoprPrtoprslcPcnNumeroHc) {
        this.recuperacionPostAnestesicaPK = new RecuperacionPostAnestesicaPK(rgsoprPrsCodigo, rgsoprPrtoprslcNumero, rgsoprPrtoprslcPcnNumeroHc);
    }

    public RecuperacionPostAnestesicaPK getRecuperacionPostAnestesicaPK() {
        return recuperacionPostAnestesicaPK;
    }

    public void setRecuperacionPostAnestesicaPK(RecuperacionPostAnestesicaPK recuperacionPostAnestesicaPK) {
        this.recuperacionPostAnestesicaPK = recuperacionPostAnestesicaPK;
    }

    public Character getGeneral() {
        return general;
    }

    public void setGeneral(Character general) {
        this.general = general;
    }

    public Character getConductiva() {
        return conductiva;
    }

    public void setConductiva(Character conductiva) {
        this.conductiva = conductiva;
    }

    public Character getLocal() {
        return local;
    }

    public void setLocal(Character local) {
        this.local = local;
    }

    public BigDecimal getInduccion() {
        return induccion;
    }

    public void setInduccion(BigDecimal induccion) {
        this.induccion = induccion;
    }

    public BigDecimal getMatenimiento() {
        return matenimiento;
    }

    public void setMatenimiento(BigDecimal matenimiento) {
        this.matenimiento = matenimiento;
    }

    public Character getConsciente() {
        return consciente;
    }

    public void setConsciente(Character consciente) {
        this.consciente = consciente;
    }

    public Character getSemiconsciente() {
        return semiconsciente;
    }

    public void setSemiconsciente(Character semiconsciente) {
        this.semiconsciente = semiconsciente;
    }

    public Character getInconsciente() {
        return inconsciente;
    }

    public void setInconsciente(Character inconsciente) {
        this.inconsciente = inconsciente;
    }

    public Date getSalidaDeQuirofano() {
        return salidaDeQuirofano;
    }

    public void setSalidaDeQuirofano(Date salidaDeQuirofano) {
        this.salidaDeQuirofano = salidaDeQuirofano;
    }

    public Date getEntradaARecuperacion() {
        return entradaARecuperacion;
    }

    public void setEntradaARecuperacion(Date entradaARecuperacion) {
        this.entradaARecuperacion = entradaARecuperacion;
    }

    public String getPrsCodigoent() {
        return prsCodigoent;
    }

    public void setPrsCodigoent(String prsCodigoent) {
        this.prsCodigoent = prsCodigoent;
    }

    public String getPrsCodigorcb() {
        return prsCodigorcb;
    }

    public void setPrsCodigorcb(String prsCodigorcb) {
        this.prsCodigorcb = prsCodigorcb;
    }

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recuperacionPostAnestesicaPK != null ? recuperacionPostAnestesicaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecuperacionPostAnestesica)) {
            return false;
        }
        RecuperacionPostAnestesica other = (RecuperacionPostAnestesica) object;
        if ((this.recuperacionPostAnestesicaPK == null && other.recuperacionPostAnestesicaPK != null) || (this.recuperacionPostAnestesicaPK != null && !this.recuperacionPostAnestesicaPK.equals(other.recuperacionPostAnestesicaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RecuperacionPostAnestesica[ recuperacionPostAnestesicaPK=" + recuperacionPostAnestesicaPK + " ]";
    }
    
}
