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
public class ClasificacionManoDeObraPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRD_NUMERO")
    private int prdNumero;
    @Basic(optional = false)
    @Column(name = "MNOOBR_TIPO")
    private String mnoobrTipo;
    @Basic(optional = false)
    @Column(name = "MNOOBR_CODIGO")
    private int mnoobrCodigo;
    @Basic(optional = false)
    @Column(name = "CLASIFICACION")
    private String clasificacion;

    public ClasificacionManoDeObraPK() {
    }

    public ClasificacionManoDeObraPK(int prdNumero, String mnoobrTipo, int mnoobrCodigo, String clasificacion) {
        this.prdNumero = prdNumero;
        this.mnoobrTipo = mnoobrTipo;
        this.mnoobrCodigo = mnoobrCodigo;
        this.clasificacion = clasificacion;
    }

    public int getPrdNumero() {
        return prdNumero;
    }

    public void setPrdNumero(int prdNumero) {
        this.prdNumero = prdNumero;
    }

    public String getMnoobrTipo() {
        return mnoobrTipo;
    }

    public void setMnoobrTipo(String mnoobrTipo) {
        this.mnoobrTipo = mnoobrTipo;
    }

    public int getMnoobrCodigo() {
        return mnoobrCodigo;
    }

    public void setMnoobrCodigo(int mnoobrCodigo) {
        this.mnoobrCodigo = mnoobrCodigo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) prdNumero;
        hash += (mnoobrTipo != null ? mnoobrTipo.hashCode() : 0);
        hash += (int) mnoobrCodigo;
        hash += (clasificacion != null ? clasificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasificacionManoDeObraPK)) {
            return false;
        }
        ClasificacionManoDeObraPK other = (ClasificacionManoDeObraPK) object;
        if (this.prdNumero != other.prdNumero) {
            return false;
        }
        if ((this.mnoobrTipo == null && other.mnoobrTipo != null) || (this.mnoobrTipo != null && !this.mnoobrTipo.equals(other.mnoobrTipo))) {
            return false;
        }
        if (this.mnoobrCodigo != other.mnoobrCodigo) {
            return false;
        }
        if ((this.clasificacion == null && other.clasificacion != null) || (this.clasificacion != null && !this.clasificacion.equals(other.clasificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ClasificacionManoDeObraPK[ prdNumero=" + prdNumero + ", mnoobrTipo=" + mnoobrTipo + ", mnoobrCodigo=" + mnoobrCodigo + ", clasificacion=" + clasificacion + " ]";
    }
    
}
