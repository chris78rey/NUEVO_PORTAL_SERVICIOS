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
@Table(name = "INFORMACIONES_ANESTESICAS")
@NamedQueries({
    @NamedQuery(name = "InformacionesAnestesicas.findAll", query = "SELECT i FROM InformacionesAnestesicas i")})
public class InformacionesAnestesicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InformacionesAnestesicasPK informacionesAnestesicasPK;
    @Column(name = "PRS_CODIGO_REALIZADO_POR")
    private String prsCodigoRealizadoPor;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO")
    private BigDecimal peso;
    @Column(name = "TALLA")
    private Short talla;
    @Column(name = "TRANSANESTESICO")
    private Short transanestesico;
    @Column(name = "POSTQUIRUGICO")
    private Short postquirugico;
    @Column(name = "QUIRURGICO")
    private Short quirurgico;
    @Column(name = "HORA_CIRUGIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaCirugia;
    @Column(name = "TIPO_DE_CIRUGIA")
    private String tipoDeCirugia;
    @Column(name = "PREANESTESIA")
    private String preanestesia;
    @Column(name = "RIESGO_ASA")
    private String riesgoAsa;
    @Column(name = "TECNICA_ANESTESICA")
    private String tecnicaAnestesica;
    @Column(name = "HISTOPATOLOGICA")
    private Character histopatologica;

    public InformacionesAnestesicas() {
    }

    public InformacionesAnestesicas(InformacionesAnestesicasPK informacionesAnestesicasPK) {
        this.informacionesAnestesicasPK = informacionesAnestesicasPK;
    }

    public InformacionesAnestesicas(int prtoprslcPcnNumeroHc, int prtoprslcNumero) {
        this.informacionesAnestesicasPK = new InformacionesAnestesicasPK(prtoprslcPcnNumeroHc, prtoprslcNumero);
    }

    public InformacionesAnestesicasPK getInformacionesAnestesicasPK() {
        return informacionesAnestesicasPK;
    }

    public void setInformacionesAnestesicasPK(InformacionesAnestesicasPK informacionesAnestesicasPK) {
        this.informacionesAnestesicasPK = informacionesAnestesicasPK;
    }

    public String getPrsCodigoRealizadoPor() {
        return prsCodigoRealizadoPor;
    }

    public void setPrsCodigoRealizadoPor(String prsCodigoRealizadoPor) {
        this.prsCodigoRealizadoPor = prsCodigoRealizadoPor;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Short getTalla() {
        return talla;
    }

    public void setTalla(Short talla) {
        this.talla = talla;
    }

    public Short getTransanestesico() {
        return transanestesico;
    }

    public void setTransanestesico(Short transanestesico) {
        this.transanestesico = transanestesico;
    }

    public Short getPostquirugico() {
        return postquirugico;
    }

    public void setPostquirugico(Short postquirugico) {
        this.postquirugico = postquirugico;
    }

    public Short getQuirurgico() {
        return quirurgico;
    }

    public void setQuirurgico(Short quirurgico) {
        this.quirurgico = quirurgico;
    }

    public Date getHoraCirugia() {
        return horaCirugia;
    }

    public void setHoraCirugia(Date horaCirugia) {
        this.horaCirugia = horaCirugia;
    }

    public String getTipoDeCirugia() {
        return tipoDeCirugia;
    }

    public void setTipoDeCirugia(String tipoDeCirugia) {
        this.tipoDeCirugia = tipoDeCirugia;
    }

    public String getPreanestesia() {
        return preanestesia;
    }

    public void setPreanestesia(String preanestesia) {
        this.preanestesia = preanestesia;
    }

    public String getRiesgoAsa() {
        return riesgoAsa;
    }

    public void setRiesgoAsa(String riesgoAsa) {
        this.riesgoAsa = riesgoAsa;
    }

    public String getTecnicaAnestesica() {
        return tecnicaAnestesica;
    }

    public void setTecnicaAnestesica(String tecnicaAnestesica) {
        this.tecnicaAnestesica = tecnicaAnestesica;
    }

    public Character getHistopatologica() {
        return histopatologica;
    }

    public void setHistopatologica(Character histopatologica) {
        this.histopatologica = histopatologica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (informacionesAnestesicasPK != null ? informacionesAnestesicasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InformacionesAnestesicas)) {
            return false;
        }
        InformacionesAnestesicas other = (InformacionesAnestesicas) object;
        if ((this.informacionesAnestesicasPK == null && other.informacionesAnestesicasPK != null) || (this.informacionesAnestesicasPK != null && !this.informacionesAnestesicasPK.equals(other.informacionesAnestesicasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.InformacionesAnestesicas[ informacionesAnestesicasPK=" + informacionesAnestesicasPK + " ]";
    }
    
}
