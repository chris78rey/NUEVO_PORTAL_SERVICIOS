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
public class MspRadiologiaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CODIGO_ITEM")
    private String codigoItem;
    @Basic(optional = false)
    @Column(name = "CONVENIO")
    private String convenio;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;

    public MspRadiologiaPK() {
    }

    public MspRadiologiaPK(String codigoItem, String convenio, String tipo) {
        this.codigoItem = codigoItem;
        this.convenio = convenio;
        this.tipo = tipo;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoItem != null ? codigoItem.hashCode() : 0);
        hash += (convenio != null ? convenio.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspRadiologiaPK)) {
            return false;
        }
        MspRadiologiaPK other = (MspRadiologiaPK) object;
        if ((this.codigoItem == null && other.codigoItem != null) || (this.codigoItem != null && !this.codigoItem.equals(other.codigoItem))) {
            return false;
        }
        if ((this.convenio == null && other.convenio != null) || (this.convenio != null && !this.convenio.equals(other.convenio))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MspRadiologiaPK[ codigoItem=" + codigoItem + ", convenio=" + convenio + ", tipo=" + tipo + " ]";
    }
    
}
