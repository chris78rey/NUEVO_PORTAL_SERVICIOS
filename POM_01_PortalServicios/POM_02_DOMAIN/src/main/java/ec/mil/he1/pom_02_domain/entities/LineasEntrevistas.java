/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "LINEAS_ENTREVISTAS")
@NamedQueries({
    @NamedQuery(name = "LineasEntrevistas.findAll", query = "SELECT l FROM LineasEntrevistas l")})
public class LineasEntrevistas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LineasEntrevistasPK lineasEntrevistasPK;
    @Column(name = "RESPUESTA")
    private Character respuesta;
    @JoinColumn(name = "DNN_NUMERO", referencedColumnName = "NUMERO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Donantes donantes;
    @JoinColumn(name = "PRGENT_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private PreguntasEntrevistas preguntasEntrevistas;

    public LineasEntrevistas() {
    }

    public LineasEntrevistas(LineasEntrevistasPK lineasEntrevistasPK) {
        this.lineasEntrevistasPK = lineasEntrevistasPK;
    }

    public LineasEntrevistas(int dnnNumero, BigInteger numeroEntrevista) {
        this.lineasEntrevistasPK = new LineasEntrevistasPK(dnnNumero, numeroEntrevista);
    }

    public LineasEntrevistasPK getLineasEntrevistasPK() {
        return lineasEntrevistasPK;
    }

    public void setLineasEntrevistasPK(LineasEntrevistasPK lineasEntrevistasPK) {
        this.lineasEntrevistasPK = lineasEntrevistasPK;
    }

    public Character getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Character respuesta) {
        this.respuesta = respuesta;
    }

    public Donantes getDonantes() {
        return donantes;
    }

    public void setDonantes(Donantes donantes) {
        this.donantes = donantes;
    }

    public PreguntasEntrevistas getPreguntasEntrevistas() {
        return preguntasEntrevistas;
    }

    public void setPreguntasEntrevistas(PreguntasEntrevistas preguntasEntrevistas) {
        this.preguntasEntrevistas = preguntasEntrevistas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lineasEntrevistasPK != null ? lineasEntrevistasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineasEntrevistas)) {
            return false;
        }
        LineasEntrevistas other = (LineasEntrevistas) object;
        if ((this.lineasEntrevistasPK == null && other.lineasEntrevistasPK != null) || (this.lineasEntrevistasPK != null && !this.lineasEntrevistasPK.equals(other.lineasEntrevistasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.LineasEntrevistas[ lineasEntrevistasPK=" + lineasEntrevistasPK + " ]";
    }
    
}
