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
public class MspCirugiaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CODIGO_ITEM")
    private String codigoItem;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "CONVENIO")
    private String convenio;

    public MspCirugiaPK() {
    }

    public MspCirugiaPK(String codigoItem, String tipo, String convenio) {
        this.codigoItem = codigoItem;
        this.tipo = tipo;
        this.convenio = convenio;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoItem != null ? codigoItem.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (convenio != null ? convenio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MspCirugiaPK)) {
            return false;
        }
        MspCirugiaPK other = (MspCirugiaPK) object;
        if ((this.codigoItem == null && other.codigoItem != null) || (this.codigoItem != null && !this.codigoItem.equals(other.codigoItem))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.convenio == null && other.convenio != null) || (this.convenio != null && !this.convenio.equals(other.convenio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.MspCirugiaPK[ codigoItem=" + codigoItem + ", tipo=" + tipo + ", convenio=" + convenio + " ]";
    }
    
}
