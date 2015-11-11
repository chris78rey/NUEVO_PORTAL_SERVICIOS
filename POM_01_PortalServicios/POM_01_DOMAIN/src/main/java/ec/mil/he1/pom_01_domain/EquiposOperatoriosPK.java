/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class EquiposOperatoriosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_PCN_NUMERO_HC")
    private int prtoprslcPcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "PRTOPRSLC_NUMERO")
    private int prtoprslcNumero;
    @Basic(optional = false)
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public EquiposOperatoriosPK() {
    }

    public EquiposOperatoriosPK(int prtoprslcPcnNumeroHc, int prtoprslcNumero, String prsCodigo) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
        this.prtoprslcNumero = prtoprslcNumero;
        this.prsCodigo = prsCodigo;
    }

    public int getPrtoprslcPcnNumeroHc() {
        return prtoprslcPcnNumeroHc;
    }

    public void setPrtoprslcPcnNumeroHc(int prtoprslcPcnNumeroHc) {
        this.prtoprslcPcnNumeroHc = prtoprslcPcnNumeroHc;
    }

    public int getPrtoprslcNumero() {
        return prtoprslcNumero;
    }

    public void setPrtoprslcNumero(int prtoprslcNumero) {
        this.prtoprslcNumero = prtoprslcNumero;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prtoprslcPcnNumeroHc;
        hash += (int) prtoprslcNumero;
        hash += (prsCodigo != null ? prsCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquiposOperatoriosPK)) {
            return false;
        }
        EquiposOperatoriosPK other = (EquiposOperatoriosPK) object;
        if (this.prtoprslcPcnNumeroHc != other.prtoprslcPcnNumeroHc) {
            return false;
        }
        if (this.prtoprslcNumero != other.prtoprslcNumero) {
            return false;
        }
        if ((this.prsCodigo == null && other.prsCodigo != null) || (this.prsCodigo != null && !this.prsCodigo.equals(other.prsCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EquiposOperatoriosPK[ prtoprslcPcnNumeroHc=" + prtoprslcPcnNumeroHc + ", prtoprslcNumero=" + prtoprslcNumero + ", prsCodigo=" + prsCodigo + " ]";
    }
    
}
