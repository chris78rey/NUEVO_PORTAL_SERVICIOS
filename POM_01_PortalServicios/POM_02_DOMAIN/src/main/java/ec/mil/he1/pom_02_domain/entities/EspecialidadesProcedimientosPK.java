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
public class EspecialidadesProcedimientosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ESP_CODIGO")
    private String espCodigo;
    @Basic(optional = false)
    @Column(name = "PRC_CODIGO")
    private String prcCodigo;

    public EspecialidadesProcedimientosPK() {
    }

    public EspecialidadesProcedimientosPK(String espCodigo, String prcCodigo) {
        this.espCodigo = espCodigo;
        this.prcCodigo = prcCodigo;
    }

    public String getEspCodigo() {
        return espCodigo;
    }

    public void setEspCodigo(String espCodigo) {
        this.espCodigo = espCodigo;
    }

    public String getPrcCodigo() {
        return prcCodigo;
    }

    public void setPrcCodigo(String prcCodigo) {
        this.prcCodigo = prcCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (espCodigo != null ? espCodigo.hashCode() : 0);
        hash += (prcCodigo != null ? prcCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecialidadesProcedimientosPK)) {
            return false;
        }
        EspecialidadesProcedimientosPK other = (EspecialidadesProcedimientosPK) object;
        if ((this.espCodigo == null && other.espCodigo != null) || (this.espCodigo != null && !this.espCodigo.equals(other.espCodigo))) {
            return false;
        }
        if ((this.prcCodigo == null && other.prcCodigo != null) || (this.prcCodigo != null && !this.prcCodigo.equals(other.prcCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.EspecialidadesProcedimientosPK[ espCodigo=" + espCodigo + ", prcCodigo=" + prcCodigo + " ]";
    }
    
}
