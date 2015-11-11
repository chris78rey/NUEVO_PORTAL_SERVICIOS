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
public class DetallesManoObraPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "MNOOBRDPR_PRD_CODIGO")
    private int mnoobrdprPrdCodigo;
    @Basic(optional = false)
    @Column(name = "MNOOBRDPR_CLASIFICACION")
    private String mnoobrdprClasificacion;
    @Basic(optional = false)
    @Column(name = "MNOOBRDPR_DPR_ARA_CODIGO")
    private String mnoobrdprDprAraCodigo;
    @Basic(optional = false)
    @Column(name = "MNOOBRDPR_DPR_CODIGO")
    private String mnoobrdprDprCodigo;
    @Basic(optional = false)
    @Column(name = "TRA_CODIGO")
    private int traCodigo;

    public DetallesManoObraPK() {
    }

    public DetallesManoObraPK(int mnoobrdprPrdCodigo, String mnoobrdprClasificacion, String mnoobrdprDprAraCodigo, String mnoobrdprDprCodigo, int traCodigo) {
        this.mnoobrdprPrdCodigo = mnoobrdprPrdCodigo;
        this.mnoobrdprClasificacion = mnoobrdprClasificacion;
        this.mnoobrdprDprAraCodigo = mnoobrdprDprAraCodigo;
        this.mnoobrdprDprCodigo = mnoobrdprDprCodigo;
        this.traCodigo = traCodigo;
    }

    public int getMnoobrdprPrdCodigo() {
        return mnoobrdprPrdCodigo;
    }

    public void setMnoobrdprPrdCodigo(int mnoobrdprPrdCodigo) {
        this.mnoobrdprPrdCodigo = mnoobrdprPrdCodigo;
    }

    public String getMnoobrdprClasificacion() {
        return mnoobrdprClasificacion;
    }

    public void setMnoobrdprClasificacion(String mnoobrdprClasificacion) {
        this.mnoobrdprClasificacion = mnoobrdprClasificacion;
    }

    public String getMnoobrdprDprAraCodigo() {
        return mnoobrdprDprAraCodigo;
    }

    public void setMnoobrdprDprAraCodigo(String mnoobrdprDprAraCodigo) {
        this.mnoobrdprDprAraCodigo = mnoobrdprDprAraCodigo;
    }

    public String getMnoobrdprDprCodigo() {
        return mnoobrdprDprCodigo;
    }

    public void setMnoobrdprDprCodigo(String mnoobrdprDprCodigo) {
        this.mnoobrdprDprCodigo = mnoobrdprDprCodigo;
    }

    public int getTraCodigo() {
        return traCodigo;
    }

    public void setTraCodigo(int traCodigo) {
        this.traCodigo = traCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) mnoobrdprPrdCodigo;
        hash += (mnoobrdprClasificacion != null ? mnoobrdprClasificacion.hashCode() : 0);
        hash += (mnoobrdprDprAraCodigo != null ? mnoobrdprDprAraCodigo.hashCode() : 0);
        hash += (mnoobrdprDprCodigo != null ? mnoobrdprDprCodigo.hashCode() : 0);
        hash += (int) traCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesManoObraPK)) {
            return false;
        }
        DetallesManoObraPK other = (DetallesManoObraPK) object;
        if (this.mnoobrdprPrdCodigo != other.mnoobrdprPrdCodigo) {
            return false;
        }
        if ((this.mnoobrdprClasificacion == null && other.mnoobrdprClasificacion != null) || (this.mnoobrdprClasificacion != null && !this.mnoobrdprClasificacion.equals(other.mnoobrdprClasificacion))) {
            return false;
        }
        if ((this.mnoobrdprDprAraCodigo == null && other.mnoobrdprDprAraCodigo != null) || (this.mnoobrdprDprAraCodigo != null && !this.mnoobrdprDprAraCodigo.equals(other.mnoobrdprDprAraCodigo))) {
            return false;
        }
        if ((this.mnoobrdprDprCodigo == null && other.mnoobrdprDprCodigo != null) || (this.mnoobrdprDprCodigo != null && !this.mnoobrdprDprCodigo.equals(other.mnoobrdprDprCodigo))) {
            return false;
        }
        if (this.traCodigo != other.traCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesManoObraPK[ mnoobrdprPrdCodigo=" + mnoobrdprPrdCodigo + ", mnoobrdprClasificacion=" + mnoobrdprClasificacion + ", mnoobrdprDprAraCodigo=" + mnoobrdprDprAraCodigo + ", mnoobrdprDprCodigo=" + mnoobrdprDprCodigo + ", traCodigo=" + traCodigo + " ]";
    }
    
}
