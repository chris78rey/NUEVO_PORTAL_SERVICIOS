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
public class FacturasAutomaticasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PCN_NUMERO_HC")
    private int pcnNumeroHc;
    @Basic(optional = false)
    @Column(name = "CJA_CODIGO")
    private String cjaCodigo;
    @Basic(optional = false)
    @Column(name = "DESDEHASTA")
    private String desdehasta;

    public FacturasAutomaticasPK() {
    }

    public FacturasAutomaticasPK(int pcnNumeroHc, String cjaCodigo, String desdehasta) {
        this.pcnNumeroHc = pcnNumeroHc;
        this.cjaCodigo = cjaCodigo;
        this.desdehasta = desdehasta;
    }

    public int getPcnNumeroHc() {
        return pcnNumeroHc;
    }

    public void setPcnNumeroHc(int pcnNumeroHc) {
        this.pcnNumeroHc = pcnNumeroHc;
    }

    public String getCjaCodigo() {
        return cjaCodigo;
    }

    public void setCjaCodigo(String cjaCodigo) {
        this.cjaCodigo = cjaCodigo;
    }

    public String getDesdehasta() {
        return desdehasta;
    }

    public void setDesdehasta(String desdehasta) {
        this.desdehasta = desdehasta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pcnNumeroHc;
        hash += (cjaCodigo != null ? cjaCodigo.hashCode() : 0);
        hash += (desdehasta != null ? desdehasta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturasAutomaticasPK)) {
            return false;
        }
        FacturasAutomaticasPK other = (FacturasAutomaticasPK) object;
        if (this.pcnNumeroHc != other.pcnNumeroHc) {
            return false;
        }
        if ((this.cjaCodigo == null && other.cjaCodigo != null) || (this.cjaCodigo != null && !this.cjaCodigo.equals(other.cjaCodigo))) {
            return false;
        }
        if ((this.desdehasta == null && other.desdehasta != null) || (this.desdehasta != null && !this.desdehasta.equals(other.desdehasta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.FacturasAutomaticasPK[ pcnNumeroHc=" + pcnNumeroHc + ", cjaCodigo=" + cjaCodigo + ", desdehasta=" + desdehasta + " ]";
    }
    
}
