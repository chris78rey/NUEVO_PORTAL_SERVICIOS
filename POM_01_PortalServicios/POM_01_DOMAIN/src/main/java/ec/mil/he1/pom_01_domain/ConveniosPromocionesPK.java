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
public class ConveniosPromocionesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CNV_CONVENIO")
    private String cnvConvenio;
    @Basic(optional = false)
    @Column(name = "PRM_CODIGO")
    private String prmCodigo;

    public ConveniosPromocionesPK() {
    }

    public ConveniosPromocionesPK(String cnvConvenio, String prmCodigo) {
        this.cnvConvenio = cnvConvenio;
        this.prmCodigo = prmCodigo;
    }

    public String getCnvConvenio() {
        return cnvConvenio;
    }

    public void setCnvConvenio(String cnvConvenio) {
        this.cnvConvenio = cnvConvenio;
    }

    public String getPrmCodigo() {
        return prmCodigo;
    }

    public void setPrmCodigo(String prmCodigo) {
        this.prmCodigo = prmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnvConvenio != null ? cnvConvenio.hashCode() : 0);
        hash += (prmCodigo != null ? prmCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConveniosPromocionesPK)) {
            return false;
        }
        ConveniosPromocionesPK other = (ConveniosPromocionesPK) object;
        if ((this.cnvConvenio == null && other.cnvConvenio != null) || (this.cnvConvenio != null && !this.cnvConvenio.equals(other.cnvConvenio))) {
            return false;
        }
        if ((this.prmCodigo == null && other.prmCodigo != null) || (this.prmCodigo != null && !this.prmCodigo.equals(other.prmCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ConveniosPromocionesPK[ cnvConvenio=" + cnvConvenio + ", prmCodigo=" + prmCodigo + " ]";
    }
    
}
