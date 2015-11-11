/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class RegistrosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SID")
    private BigInteger sid;
    @Basic(optional = false)
    @Column(name = "LINEA")
    private short linea;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;

    public RegistrosPK() {
    }

    public RegistrosPK(BigInteger sid, short linea, String tipo) {
        this.sid = sid;
        this.linea = linea;
        this.tipo = tipo;
    }

    public BigInteger getSid() {
        return sid;
    }

    public void setSid(BigInteger sid) {
        this.sid = sid;
    }

    public short getLinea() {
        return linea;
    }

    public void setLinea(short linea) {
        this.linea = linea;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sid != null ? sid.hashCode() : 0);
        hash += (int) linea;
        hash += (tipo != null ? tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistrosPK)) {
            return false;
        }
        RegistrosPK other = (RegistrosPK) object;
        if ((this.sid == null && other.sid != null) || (this.sid != null && !this.sid.equals(other.sid))) {
            return false;
        }
        if (this.linea != other.linea) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RegistrosPK[ sid=" + sid + ", linea=" + linea + ", tipo=" + tipo + " ]";
    }
    
}
