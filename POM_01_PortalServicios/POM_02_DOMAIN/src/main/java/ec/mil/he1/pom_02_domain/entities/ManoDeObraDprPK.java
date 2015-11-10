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
public class ManoDeObraDprPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRD_CODIGO")
    private int prdCodigo;
    @Basic(optional = false)
    @Column(name = "CLASIFICACION")
    private String clasificacion;
    @Basic(optional = false)
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;

    public ManoDeObraDprPK() {
    }

    public ManoDeObraDprPK(int prdCodigo, String clasificacion, String dprAraCodigo, String dprCodigo) {
        this.prdCodigo = prdCodigo;
        this.clasificacion = clasificacion;
        this.dprAraCodigo = dprAraCodigo;
        this.dprCodigo = dprCodigo;
    }

    public int getPrdCodigo() {
        return prdCodigo;
    }

    public void setPrdCodigo(int prdCodigo) {
        this.prdCodigo = prdCodigo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prdCodigo;
        hash += (clasificacion != null ? clasificacion.hashCode() : 0);
        hash += (dprAraCodigo != null ? dprAraCodigo.hashCode() : 0);
        hash += (dprCodigo != null ? dprCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ManoDeObraDprPK)) {
            return false;
        }
        ManoDeObraDprPK other = (ManoDeObraDprPK) object;
        if (this.prdCodigo != other.prdCodigo) {
            return false;
        }
        if ((this.clasificacion == null && other.clasificacion != null) || (this.clasificacion != null && !this.clasificacion.equals(other.clasificacion))) {
            return false;
        }
        if ((this.dprAraCodigo == null && other.dprAraCodigo != null) || (this.dprAraCodigo != null && !this.dprAraCodigo.equals(other.dprAraCodigo))) {
            return false;
        }
        if ((this.dprCodigo == null && other.dprCodigo != null) || (this.dprCodigo != null && !this.dprCodigo.equals(other.dprCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ManoDeObraDprPK[ prdCodigo=" + prdCodigo + ", clasificacion=" + clasificacion + ", dprAraCodigo=" + dprAraCodigo + ", dprCodigo=" + dprCodigo + " ]";
    }
    
}
