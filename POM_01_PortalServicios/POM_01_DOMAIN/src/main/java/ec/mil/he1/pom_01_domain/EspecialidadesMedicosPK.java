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
public class EspecialidadesMedicosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ESP_CODIGO")
    private String espCodigo;
    @Basic(optional = false)
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;

    public EspecialidadesMedicosPK() {
    }

    public EspecialidadesMedicosPK(String espCodigo, String prsCodigo) {
        this.espCodigo = espCodigo;
        this.prsCodigo = prsCodigo;
    }

    public String getEspCodigo() {
        return espCodigo;
    }

    public void setEspCodigo(String espCodigo) {
        this.espCodigo = espCodigo;
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
        hash += (espCodigo != null ? espCodigo.hashCode() : 0);
        hash += (prsCodigo != null ? prsCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecialidadesMedicosPK)) {
            return false;
        }
        EspecialidadesMedicosPK other = (EspecialidadesMedicosPK) object;
        if ((this.espCodigo == null && other.espCodigo != null) || (this.espCodigo != null && !this.espCodigo.equals(other.espCodigo))) {
            return false;
        }
        if ((this.prsCodigo == null && other.prsCodigo != null) || (this.prsCodigo != null && !this.prsCodigo.equals(other.prsCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.EspecialidadesMedicosPK[ espCodigo=" + espCodigo + ", prsCodigo=" + prsCodigo + " ]";
    }
    
}
