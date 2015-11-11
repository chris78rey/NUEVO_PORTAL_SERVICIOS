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
public class ProcedimientosTarifariosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TRF_TIPO")
    private String trfTipo;
    @Basic(optional = false)
    @Column(name = "TRF_CODIGO_ITEM")
    private String trfCodigoItem;
    @Basic(optional = false)
    @Column(name = "TRF_CONVENIO")
    private String trfConvenio;
    @Basic(optional = false)
    @Column(name = "PRCHSP_CODIGO")
    private String prchspCodigo;

    public ProcedimientosTarifariosPK() {
    }

    public ProcedimientosTarifariosPK(String trfTipo, String trfCodigoItem, String trfConvenio, String prchspCodigo) {
        this.trfTipo = trfTipo;
        this.trfCodigoItem = trfCodigoItem;
        this.trfConvenio = trfConvenio;
        this.prchspCodigo = prchspCodigo;
    }

    public String getTrfTipo() {
        return trfTipo;
    }

    public void setTrfTipo(String trfTipo) {
        this.trfTipo = trfTipo;
    }

    public String getTrfCodigoItem() {
        return trfCodigoItem;
    }

    public void setTrfCodigoItem(String trfCodigoItem) {
        this.trfCodigoItem = trfCodigoItem;
    }

    public String getTrfConvenio() {
        return trfConvenio;
    }

    public void setTrfConvenio(String trfConvenio) {
        this.trfConvenio = trfConvenio;
    }

    public String getPrchspCodigo() {
        return prchspCodigo;
    }

    public void setPrchspCodigo(String prchspCodigo) {
        this.prchspCodigo = prchspCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trfTipo != null ? trfTipo.hashCode() : 0);
        hash += (trfCodigoItem != null ? trfCodigoItem.hashCode() : 0);
        hash += (trfConvenio != null ? trfConvenio.hashCode() : 0);
        hash += (prchspCodigo != null ? prchspCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosTarifariosPK)) {
            return false;
        }
        ProcedimientosTarifariosPK other = (ProcedimientosTarifariosPK) object;
        if ((this.trfTipo == null && other.trfTipo != null) || (this.trfTipo != null && !this.trfTipo.equals(other.trfTipo))) {
            return false;
        }
        if ((this.trfCodigoItem == null && other.trfCodigoItem != null) || (this.trfCodigoItem != null && !this.trfCodigoItem.equals(other.trfCodigoItem))) {
            return false;
        }
        if ((this.trfConvenio == null && other.trfConvenio != null) || (this.trfConvenio != null && !this.trfConvenio.equals(other.trfConvenio))) {
            return false;
        }
        if ((this.prchspCodigo == null && other.prchspCodigo != null) || (this.prchspCodigo != null && !this.prchspCodigo.equals(other.prchspCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ProcedimientosTarifariosPK[ trfTipo=" + trfTipo + ", trfCodigoItem=" + trfCodigoItem + ", trfConvenio=" + trfConvenio + ", prchspCodigo=" + prchspCodigo + " ]";
    }
    
}
