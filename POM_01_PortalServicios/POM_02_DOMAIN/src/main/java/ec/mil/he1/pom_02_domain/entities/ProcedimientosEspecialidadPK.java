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
public class ProcedimientosEspecialidadPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ESP_CODIGO")
    private String espCodigo;
    @Basic(optional = false)
    @Column(name = "PRCHSP_CODIGO")
    private String prchspCodigo;
    @Basic(optional = false)
    @Column(name = "CNSPRC_CODIGO")
    private String cnsprcCodigo;

    public ProcedimientosEspecialidadPK() {
    }

    public ProcedimientosEspecialidadPK(String espCodigo, String prchspCodigo, String cnsprcCodigo) {
        this.espCodigo = espCodigo;
        this.prchspCodigo = prchspCodigo;
        this.cnsprcCodigo = cnsprcCodigo;
    }

    public String getEspCodigo() {
        return espCodigo;
    }

    public void setEspCodigo(String espCodigo) {
        this.espCodigo = espCodigo;
    }

    public String getPrchspCodigo() {
        return prchspCodigo;
    }

    public void setPrchspCodigo(String prchspCodigo) {
        this.prchspCodigo = prchspCodigo;
    }

    public String getCnsprcCodigo() {
        return cnsprcCodigo;
    }

    public void setCnsprcCodigo(String cnsprcCodigo) {
        this.cnsprcCodigo = cnsprcCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (espCodigo != null ? espCodigo.hashCode() : 0);
        hash += (prchspCodigo != null ? prchspCodigo.hashCode() : 0);
        hash += (cnsprcCodigo != null ? cnsprcCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosEspecialidadPK)) {
            return false;
        }
        ProcedimientosEspecialidadPK other = (ProcedimientosEspecialidadPK) object;
        if ((this.espCodigo == null && other.espCodigo != null) || (this.espCodigo != null && !this.espCodigo.equals(other.espCodigo))) {
            return false;
        }
        if ((this.prchspCodigo == null && other.prchspCodigo != null) || (this.prchspCodigo != null && !this.prchspCodigo.equals(other.prchspCodigo))) {
            return false;
        }
        if ((this.cnsprcCodigo == null && other.cnsprcCodigo != null) || (this.cnsprcCodigo != null && !this.cnsprcCodigo.equals(other.cnsprcCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ProcedimientosEspecialidadPK[ espCodigo=" + espCodigo + ", prchspCodigo=" + prchspCodigo + ", cnsprcCodigo=" + cnsprcCodigo + " ]";
    }
    
}
