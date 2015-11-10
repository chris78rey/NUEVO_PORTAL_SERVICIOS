/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
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
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PUERPERIOS")
@NamedQueries({
    @NamedQuery(name = "Puerperios.findAll", query = "SELECT p FROM Puerperios p")})
public class Puerperios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PuerperiosPK puerperiosPK;
    @Column(name = "HORAS_POST_PARTO")
    private Short horasPostParto;
    @Column(name = "DIAS_POST_PARTO")
    private Short diasPostParto;
    @Column(name = "PULSO")
    private Short pulso;
    @Column(name = "TENSION_ARTERIAL")
    private String tensionArterial;
    @Column(name = "INVOL_UTERINA")
    private String involUterina;
    @Column(name = "LOQUIOS")
    private String loquios;
    @JoinColumns({
        @JoinColumn(name = "RGSOBS_PCN_NUMERO_HC", referencedColumnName = "PCN_NUMERO_HC", insertable = false, updatable = false),
        @JoinColumn(name = "RGSOBS_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RegistrosObstetricia registrosObstetricia;

    public Puerperios() {
    }

    public Puerperios(PuerperiosPK puerperiosPK) {
        this.puerperiosPK = puerperiosPK;
    }

    public Puerperios(int rgsobsPcnNumeroHc, int rgsobsNumero, Date fecha) {
        this.puerperiosPK = new PuerperiosPK(rgsobsPcnNumeroHc, rgsobsNumero, fecha);
    }

    public PuerperiosPK getPuerperiosPK() {
        return puerperiosPK;
    }

    public void setPuerperiosPK(PuerperiosPK puerperiosPK) {
        this.puerperiosPK = puerperiosPK;
    }

    public Short getHorasPostParto() {
        return horasPostParto;
    }

    public void setHorasPostParto(Short horasPostParto) {
        this.horasPostParto = horasPostParto;
    }

    public Short getDiasPostParto() {
        return diasPostParto;
    }

    public void setDiasPostParto(Short diasPostParto) {
        this.diasPostParto = diasPostParto;
    }

    public Short getPulso() {
        return pulso;
    }

    public void setPulso(Short pulso) {
        this.pulso = pulso;
    }

    public String getTensionArterial() {
        return tensionArterial;
    }

    public void setTensionArterial(String tensionArterial) {
        this.tensionArterial = tensionArterial;
    }

    public String getInvolUterina() {
        return involUterina;
    }

    public void setInvolUterina(String involUterina) {
        this.involUterina = involUterina;
    }

    public String getLoquios() {
        return loquios;
    }

    public void setLoquios(String loquios) {
        this.loquios = loquios;
    }

    public RegistrosObstetricia getRegistrosObstetricia() {
        return registrosObstetricia;
    }

    public void setRegistrosObstetricia(RegistrosObstetricia registrosObstetricia) {
        this.registrosObstetricia = registrosObstetricia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (puerperiosPK != null ? puerperiosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puerperios)) {
            return false;
        }
        Puerperios other = (Puerperios) object;
        if ((this.puerperiosPK == null && other.puerperiosPK != null) || (this.puerperiosPK != null && !this.puerperiosPK.equals(other.puerperiosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Puerperios[ puerperiosPK=" + puerperiosPK + " ]";
    }
    
}
