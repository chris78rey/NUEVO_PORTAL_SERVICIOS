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
@Table(name = "TNMS")
@NamedQueries({
    @NamedQuery(name = "Tnms.findAll", query = "SELECT t FROM Tnms t")})
public class Tnms implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TnmsPK tnmsPK;
    @Column(name = "CLSDGN_NUMERO")
    private Short clsdgnNumero;
    @Column(name = "T")
    private String t;
    @Column(name = "N")
    private String n;
    @Column(name = "M")
    private String m;
    @Column(name = "ESTADIO")
    private String estadio;

    public Tnms() {
    }

    public Tnms(TnmsPK tnmsPK) {
        this.tnmsPK = tnmsPK;
    }

    public Tnms(long dgnDgnId, Date fecha) {
        this.tnmsPK = new TnmsPK(dgnDgnId, fecha);
    }

    public TnmsPK getTnmsPK() {
        return tnmsPK;
    }

    public void setTnmsPK(TnmsPK tnmsPK) {
        this.tnmsPK = tnmsPK;
    }

    public Short getClsdgnNumero() {
        return clsdgnNumero;
    }

    public void setClsdgnNumero(Short clsdgnNumero) {
        this.clsdgnNumero = clsdgnNumero;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tnmsPK != null ? tnmsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tnms)) {
            return false;
        }
        Tnms other = (Tnms) object;
        if ((this.tnmsPK == null && other.tnmsPK != null) || (this.tnmsPK != null && !this.tnmsPK.equals(other.tnmsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Tnms[ tnmsPK=" + tnmsPK + " ]";
    }
    
}
