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
public class DetallesGrpPqtExcPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GPEX_CNV_CONVENIO")
    private String gpexCnvConvenio;
    @Basic(optional = false)
    @Column(name = "GPEX_CODIGO")
    private String gpexCodigo;
    @Basic(optional = false)
    @Column(name = "TIPO_ITEM")
    private String tipoItem;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public DetallesGrpPqtExcPK() {
    }

    public DetallesGrpPqtExcPK(String gpexCnvConvenio, String gpexCodigo, String tipoItem, String tipo, String codigo) {
        this.gpexCnvConvenio = gpexCnvConvenio;
        this.gpexCodigo = gpexCodigo;
        this.tipoItem = tipoItem;
        this.tipo = tipo;
        this.codigo = codigo;
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

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gpexCnvConvenio != null ? gpexCnvConvenio.hashCode() : 0);
        hash += (gpexCodigo != null ? gpexCodigo.hashCode() : 0);
        hash += (tipoItem != null ? tipoItem.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesGrpPqtExcPK)) {
            return false;
        }
        DetallesGrpPqtExcPK other = (DetallesGrpPqtExcPK) object;
        if ((this.gpexCnvConvenio == null && other.gpexCnvConvenio != null) || (this.gpexCnvConvenio != null && !this.gpexCnvConvenio.equals(other.gpexCnvConvenio))) {
            return false;
        }
        if ((this.gpexCodigo == null && other.gpexCodigo != null) || (this.gpexCodigo != null && !this.gpexCodigo.equals(other.gpexCodigo))) {
            return false;
        }
        if ((this.tipoItem == null && other.tipoItem != null) || (this.tipoItem != null && !this.tipoItem.equals(other.tipoItem))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesGrpPqtExcPK[ gpexCnvConvenio=" + gpexCnvConvenio + ", gpexCodigo=" + gpexCodigo + ", tipoItem=" + tipoItem + ", tipo=" + tipo + ", codigo=" + codigo + " ]";
    }
    
}
