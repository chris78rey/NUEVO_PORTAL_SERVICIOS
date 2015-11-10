/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class RegistrosDeCierrePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ANIO")
    private short anio;
    @Basic(optional = false)
    @Column(name = "MES")
    private short mes;
    @Basic(optional = false)
    @Column(name = "LOCAL")
    private String local;

    public RegistrosDeCierrePK() {
    }

    public RegistrosDeCierrePK(short anio, short mes, String local) {
        this.anio = anio;
        this.mes = mes;
        this.local = local;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public short getMes() {
        return mes;
    }

    public void setMes(short mes) {
        this.mes = mes;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) anio;
        hash += (int) mes;
        hash += (local != null ? local.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrosDeCierrePK)) {
            return false;
        }
        RegistrosDeCierrePK other = (RegistrosDeCierrePK) object;
        if (this.anio != other.anio) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        if ((this.local == null && other.local != null) || (this.local != null && !this.local.equals(other.local))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.RegistrosDeCierrePK[ anio=" + anio + ", mes=" + mes + ", local=" + local + " ]";
    }
    
}
