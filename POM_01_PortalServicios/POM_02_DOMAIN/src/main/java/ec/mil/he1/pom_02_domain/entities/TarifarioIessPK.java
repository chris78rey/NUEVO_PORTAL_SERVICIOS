/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class TarifarioIessPK implements Serializable {
    @Column(name = "CONVENIO")
    private String convenio;
    @Column(name = "CODIGO_ITEM")
    private String codigoItem;

    public TarifarioIessPK() {
    }

    public TarifarioIessPK(String convenio, String codigoItem) {
        this.convenio = convenio;
        this.codigoItem = codigoItem;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(String codigoItem) {
        this.codigoItem = codigoItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (convenio != null ? convenio.hashCode() : 0);
        hash += (codigoItem != null ? codigoItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarifarioIessPK)) {
            return false;
        }
        TarifarioIessPK other = (TarifarioIessPK) object;
        if ((this.convenio == null && other.convenio != null) || (this.convenio != null && !this.convenio.equals(other.convenio))) {
            return false;
        }
        if ((this.codigoItem == null && other.codigoItem != null) || (this.codigoItem != null && !this.codigoItem.equals(other.codigoItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.TarifarioIessPK[ convenio=" + convenio + ", codigoItem=" + codigoItem + " ]";
    }
    
}
