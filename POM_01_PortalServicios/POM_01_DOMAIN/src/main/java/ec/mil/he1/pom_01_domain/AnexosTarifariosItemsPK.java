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
public class AnexosTarifariosItemsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CNV_CONVENIO")
    private String cnvConvenio;
    @Basic(optional = false)
    @Column(name = "ANEXO")
    private String anexo;

    public AnexosTarifariosItemsPK() {
    }

    public AnexosTarifariosItemsPK(String cnvConvenio, String anexo) {
        this.cnvConvenio = cnvConvenio;
        this.anexo = anexo;
    }

    public String getCnvConvenio() {
        return cnvConvenio;
    }

    public void setCnvConvenio(String cnvConvenio) {
        this.cnvConvenio = cnvConvenio;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnvConvenio != null ? cnvConvenio.hashCode() : 0);
        hash += (anexo != null ? anexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnexosTarifariosItemsPK)) {
            return false;
        }
        AnexosTarifariosItemsPK other = (AnexosTarifariosItemsPK) object;
        if ((this.cnvConvenio == null && other.cnvConvenio != null) || (this.cnvConvenio != null && !this.cnvConvenio.equals(other.cnvConvenio))) {
            return false;
        }
        if ((this.anexo == null && other.anexo != null) || (this.anexo != null && !this.anexo.equals(other.anexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AnexosTarifariosItemsPK[ cnvConvenio=" + cnvConvenio + ", anexo=" + anexo + " ]";
    }
    
}
