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
public class DtlGrppqtExcSbbPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GPEX_CNV_CONVENIO")
    private String gpexCnvConvenio;
    @Basic(optional = false)
    @Column(name = "GPEX_CODIGO")
    private String gpexCodigo;
    @Basic(optional = false)
    @Column(name = "SBS_CODIGO")
    private String sbsCodigo;
    @Basic(optional = false)
    @Column(name = "SBS_SCC_CODIGO")
    private String sbsSccCodigo;

    public DtlGrppqtExcSbbPK() {
    }

    public DtlGrppqtExcSbbPK(String gpexCnvConvenio, String gpexCodigo, String sbsCodigo, String sbsSccCodigo) {
        this.gpexCnvConvenio = gpexCnvConvenio;
        this.gpexCodigo = gpexCodigo;
        this.sbsCodigo = sbsCodigo;
        this.sbsSccCodigo = sbsSccCodigo;
    }

    public String getGpexCnvConvenio() {
        return gpexCnvConvenio;
    }

    public void setGpexCnvConvenio(String gpexCnvConvenio) {
        this.gpexCnvConvenio = gpexCnvConvenio;
    }

    public String getGpexCodigo() {
        return gpexCodigo;
    }

    public void setGpexCodigo(String gpexCodigo) {
        this.gpexCodigo = gpexCodigo;
    }

    public String getSbsCodigo() {
        return sbsCodigo;
    }

    public void setSbsCodigo(String sbsCodigo) {
        this.sbsCodigo = sbsCodigo;
    }

    public String getSbsSccCodigo() {
        return sbsSccCodigo;
    }

    public void setSbsSccCodigo(String sbsSccCodigo) {
        this.sbsSccCodigo = sbsSccCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gpexCnvConvenio != null ? gpexCnvConvenio.hashCode() : 0);
        hash += (gpexCodigo != null ? gpexCodigo.hashCode() : 0);
        hash += (sbsCodigo != null ? sbsCodigo.hashCode() : 0);
        hash += (sbsSccCodigo != null ? sbsSccCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DtlGrppqtExcSbbPK)) {
            return false;
        }
        DtlGrppqtExcSbbPK other = (DtlGrppqtExcSbbPK) object;
        if ((this.gpexCnvConvenio == null && other.gpexCnvConvenio != null) || (this.gpexCnvConvenio != null && !this.gpexCnvConvenio.equals(other.gpexCnvConvenio))) {
            return false;
        }
        if ((this.gpexCodigo == null && other.gpexCodigo != null) || (this.gpexCodigo != null && !this.gpexCodigo.equals(other.gpexCodigo))) {
            return false;
        }
        if ((this.sbsCodigo == null && other.sbsCodigo != null) || (this.sbsCodigo != null && !this.sbsCodigo.equals(other.sbsCodigo))) {
            return false;
        }
        if ((this.sbsSccCodigo == null && other.sbsSccCodigo != null) || (this.sbsSccCodigo != null && !this.sbsSccCodigo.equals(other.sbsSccCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DtlGrppqtExcSbbPK[ gpexCnvConvenio=" + gpexCnvConvenio + ", gpexCodigo=" + gpexCodigo + ", sbsCodigo=" + sbsCodigo + ", sbsSccCodigo=" + sbsSccCodigo + " ]";
    }
    
}
