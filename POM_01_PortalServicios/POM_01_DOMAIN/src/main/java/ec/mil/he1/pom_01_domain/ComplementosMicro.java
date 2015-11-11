/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "COMPLEMENTOS_MICRO")
@NamedQueries({
    @NamedQuery(name = "ComplementosMicro.findAll", query = "SELECT c FROM ComplementosMicro c")})
public class ComplementosMicro implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ComplementosMicroPK complementosMicroPK;
    @Column(name = "ORIGEN")
    private String origen;
    @Column(name = "FRESCO")
    private String fresco;
    @Column(name = "GRAM")
    private String gram;
    @Column(name = "KOH")
    private String koh;
    @Column(name = "MICOLOGICO")
    private String micologico;
    @Column(name = "PARASITOLOGICO")
    private String parasitologico;

    public ComplementosMicro() {
    }

    public ComplementosMicro(ComplementosMicroPK complementosMicroPK) {
        this.complementosMicroPK = complementosMicroPK;
    }

    public ComplementosMicro(int dtlexmExmNumero, int dtlexmVrbexmCodigo) {
        this.complementosMicroPK = new ComplementosMicroPK(dtlexmExmNumero, dtlexmVrbexmCodigo);
    }

    public ComplementosMicroPK getComplementosMicroPK() {
        return complementosMicroPK;
    }

    public void setComplementosMicroPK(ComplementosMicroPK complementosMicroPK) {
        this.complementosMicroPK = complementosMicroPK;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getFresco() {
        return fresco;
    }

    public void setFresco(String fresco) {
        this.fresco = fresco;
    }

    public String getGram() {
        return gram;
    }

    public void setGram(String gram) {
        this.gram = gram;
    }

    public String getKoh() {
        return koh;
    }

    public void setKoh(String koh) {
        this.koh = koh;
    }

    public String getMicologico() {
        return micologico;
    }

    public void setMicologico(String micologico) {
        this.micologico = micologico;
    }

    public String getParasitologico() {
        return parasitologico;
    }

    public void setParasitologico(String parasitologico) {
        this.parasitologico = parasitologico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complementosMicroPK != null ? complementosMicroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComplementosMicro)) {
            return false;
        }
        ComplementosMicro other = (ComplementosMicro) object;
        if ((this.complementosMicroPK == null && other.complementosMicroPK != null) || (this.complementosMicroPK != null && !this.complementosMicroPK.equals(other.complementosMicroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ComplementosMicro[ complementosMicroPK=" + complementosMicroPK + " ]";
    }
    
}
