/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class SignosVitalesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "HJAEVL_NUMERO")
    private BigInteger hjaevlNumero;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public SignosVitalesPK() {
    }

    public SignosVitalesPK(BigInteger hjaevlNumero, Date fecha) {
        this.hjaevlNumero = hjaevlNumero;
        this.fecha = fecha;
    }

    public BigInteger getHjaevlNumero() {
        return hjaevlNumero;
    }

    public void setHjaevlNumero(BigInteger hjaevlNumero) {
        this.hjaevlNumero = hjaevlNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hjaevlNumero != null ? hjaevlNumero.hashCode() : 0);
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SignosVitalesPK)) {
            return false;
        }
        SignosVitalesPK other = (SignosVitalesPK) object;
        if ((this.hjaevlNumero == null && other.hjaevlNumero != null) || (this.hjaevlNumero != null && !this.hjaevlNumero.equals(other.hjaevlNumero))) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.SignosVitalesPK[ hjaevlNumero=" + hjaevlNumero + ", fecha=" + fecha + " ]";
    }
    
}
