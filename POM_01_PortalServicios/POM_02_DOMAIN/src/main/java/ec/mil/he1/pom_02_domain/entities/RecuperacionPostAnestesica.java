/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
    @Column(name = "PCN_NUMERO_HC")
    private Integer pcnNumeroHc;
    @JoinColumn(name = "PRS_CODIGOENT", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumn(name = "PRS_CODIGORCB", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal1;
    @JoinColumns({
        @JoinColumn(name = "RGSOPR_PRTOPRSLC_PCN_NUMERO_HC", referencedColumnName = "PRTOPRSLC_PCN_NUMERO_HC", insertable = false, updatable = false),
        @JoinColumn(name = "RGSOPR_PRTOPRSLC_NUMERO", referencedColumnName = "PRTOPRSLC_NUMERO", insertable = false, updatable = false),
        @JoinColumn(name = "RGSOPR_PRS_CODIGO", referencedColumnName = "PRS_CODIGO", insertable = false, updatable = false)})
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private RegistrosOperatorios registrosOperatorios;

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

    public Integer getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(Integer pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal1() {
        return personal1;
    }

    public void setPersonal1(Personal personal1) {
        this.personal1 = personal1;
    }

    public RegistrosOperatorios getRegistrosOperatorios() {
        return registrosOperatorios;
    }

    public void setRegistrosOperatorios(RegistrosOperatorios registrosOperatorios) {
        this.registrosOperatorios = registrosOperatorios;
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
        return "ec.mil.he1.pom_02_domain.entities.RecuperacionPostAnestesica[ recuperacionPostAnestesicaPK=" + recuperacionPostAnestesicaPK + " ]";
    }
    
}
