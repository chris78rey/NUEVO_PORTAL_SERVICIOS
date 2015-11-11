/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
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
@Table(name = "TOXICIDADES_QUIMIOTERAPIA")
@NamedQueries({
    @NamedQuery(name = "ToxicidadesQuimioterapia.findAll", query = "SELECT t FROM ToxicidadesQuimioterapia t")})
public class ToxicidadesQuimioterapia implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ToxicidadesQuimioterapiaPK toxicidadesQuimioterapiaPK;
    @Column(name = "VALOR")
    private String valor;
    @Column(name = "GRADO")
    private String grado;

    public ToxicidadesQuimioterapia() {
    }

    public ToxicidadesQuimioterapia(ToxicidadesQuimioterapiaPK toxicidadesQuimioterapiaPK) {
        this.toxicidadesQuimioterapiaPK = toxicidadesQuimioterapiaPK;
    }

    public ToxicidadesQuimioterapia(int qmtNumero, String tpotxcCodigo, Date fecha) {
        this.toxicidadesQuimioterapiaPK = new ToxicidadesQuimioterapiaPK(qmtNumero, tpotxcCodigo, fecha);
    }

    public ToxicidadesQuimioterapiaPK getToxicidadesQuimioterapiaPK() {
        return toxicidadesQuimioterapiaPK;
    }

    public void setToxicidadesQuimioterapiaPK(ToxicidadesQuimioterapiaPK toxicidadesQuimioterapiaPK) {
        this.toxicidadesQuimioterapiaPK = toxicidadesQuimioterapiaPK;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (toxicidadesQuimioterapiaPK != null ? toxicidadesQuimioterapiaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ToxicidadesQuimioterapia)) {
            return false;
        }
        ToxicidadesQuimioterapia other = (ToxicidadesQuimioterapia) object;
        if ((this.toxicidadesQuimioterapiaPK == null && other.toxicidadesQuimioterapiaPK != null) || (this.toxicidadesQuimioterapiaPK != null && !this.toxicidadesQuimioterapiaPK.equals(other.toxicidadesQuimioterapiaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ToxicidadesQuimioterapia[ toxicidadesQuimioterapiaPK=" + toxicidadesQuimioterapiaPK + " ]";
    }
    
}
