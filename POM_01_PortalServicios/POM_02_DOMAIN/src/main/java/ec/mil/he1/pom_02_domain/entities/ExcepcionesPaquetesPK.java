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
public class ExcepcionesPaquetesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PQT_CNV_CONVENIO")
    private String pqtCnvConvenio;
    @Basic(optional = false)
    @Column(name = "PQT_TIPO")
    private String pqtTipo;
    @Basic(optional = false)
    @Column(name = "PQT_CODIGO")
    private String pqtCodigo;
    @Basic(optional = false)
    @Column(name = "GPEX_CODIGO")
    private String gpexCodigo;

    public ExcepcionesPaquetesPK() {
    }

    public ExcepcionesPaquetesPK(String pqtCnvConvenio, String pqtTipo, String pqtCodigo, String gpexCodigo) {
        this.pqtCnvConvenio = pqtCnvConvenio;
        this.pqtTipo = pqtTipo;
        this.pqtCodigo = pqtCodigo;
        this.gpexCodigo = gpexCodigo;
    }

    public String getPqtCnvConvenio() {
        return pqtCnvConvenio;
    }

    public void setPqtCnvConvenio(String pqtCnvConvenio) {
        this.pqtCnvConvenio = pqtCnvConvenio;
    }

    public String getPqtTipo() {
        return pqtTipo;
    }

    public void setPqtTipo(String pqtTipo) {
        this.pqtTipo = pqtTipo;
    }

    public String getPqtCodigo() {
        return pqtCodigo;
    }

    public void setPqtCodigo(String pqtCodigo) {
        this.pqtCodigo = pqtCodigo;
    }

    public String getGpexCodigo() {
        return gpexCodigo;
    }

    public void setGpexCodigo(String gpexCodigo) {
        this.gpexCodigo = gpexCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pqtCnvConvenio != null ? pqtCnvConvenio.hashCode() : 0);
        hash += (pqtTipo != null ? pqtTipo.hashCode() : 0);
        hash += (pqtCodigo != null ? pqtCodigo.hashCode() : 0);
        hash += (gpexCodigo != null ? gpexCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcepcionesPaquetesPK)) {
            return false;
        }
        ExcepcionesPaquetesPK other = (ExcepcionesPaquetesPK) object;
        if ((this.pqtCnvConvenio == null && other.pqtCnvConvenio != null) || (this.pqtCnvConvenio != null && !this.pqtCnvConvenio.equals(other.pqtCnvConvenio))) {
            return false;
        }
        if ((this.pqtTipo == null && other.pqtTipo != null) || (this.pqtTipo != null && !this.pqtTipo.equals(other.pqtTipo))) {
            return false;
        }
        if ((this.pqtCodigo == null && other.pqtCodigo != null) || (this.pqtCodigo != null && !this.pqtCodigo.equals(other.pqtCodigo))) {
            return false;
        }
        if ((this.gpexCodigo == null && other.gpexCodigo != null) || (this.gpexCodigo != null && !this.gpexCodigo.equals(other.gpexCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ExcepcionesPaquetesPK[ pqtCnvConvenio=" + pqtCnvConvenio + ", pqtTipo=" + pqtTipo + ", pqtCodigo=" + pqtCodigo + ", gpexCodigo=" + gpexCodigo + " ]";
    }
    
}
