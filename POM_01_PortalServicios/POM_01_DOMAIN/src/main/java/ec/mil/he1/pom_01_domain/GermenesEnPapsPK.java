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
public class GermenesEnPapsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GRM_CODIGO")
    private String grmCodigo;
    @Basic(optional = false)
    @Column(name = "PPN_EXM_NUMERO")
    private int ppnExmNumero;
    @Basic(optional = false)
    @Column(name = "PPN_PRS_CODIGO")
    private String ppnPrsCodigo;

    public GermenesEnPapsPK() {
    }

    public GermenesEnPapsPK(String grmCodigo, int ppnExmNumero, String ppnPrsCodigo) {
        this.grmCodigo = grmCodigo;
        this.ppnExmNumero = ppnExmNumero;
        this.ppnPrsCodigo = ppnPrsCodigo;
    }

    public String getGrmCodigo() {
        return grmCodigo;
    }

    public void setGrmCodigo(String grmCodigo) {
        this.grmCodigo = grmCodigo;
    }

    public int getPpnExmNumero() {
        return ppnExmNumero;
    }

    public void setPpnExmNumero(int ppnExmNumero) {
        this.ppnExmNumero = ppnExmNumero;
    }

    public String getPpnPrsCodigo() {
        return ppnPrsCodigo;
    }

    public void setPpnPrsCodigo(String ppnPrsCodigo) {
        this.ppnPrsCodigo = ppnPrsCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grmCodigo != null ? grmCodigo.hashCode() : 0);
        hash += (int) ppnExmNumero;
        hash += (ppnPrsCodigo != null ? ppnPrsCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GermenesEnPapsPK)) {
            return false;
        }
        GermenesEnPapsPK other = (GermenesEnPapsPK) object;
        if ((this.grmCodigo == null && other.grmCodigo != null) || (this.grmCodigo != null && !this.grmCodigo.equals(other.grmCodigo))) {
            return false;
        }
        if (this.ppnExmNumero != other.ppnExmNumero) {
            return false;
        }
        if ((this.ppnPrsCodigo == null && other.ppnPrsCodigo != null) || (this.ppnPrsCodigo != null && !this.ppnPrsCodigo.equals(other.ppnPrsCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.GermenesEnPapsPK[ grmCodigo=" + grmCodigo + ", ppnExmNumero=" + ppnExmNumero + ", ppnPrsCodigo=" + ppnPrsCodigo + " ]";
    }
    
}
