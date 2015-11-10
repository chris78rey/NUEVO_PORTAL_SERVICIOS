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
public class ComercialesSnsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TRFITM_CNV_CONVENIO")
    private String trfitmCnvConvenio;
    @Basic(optional = false)
    @Column(name = "TRTITM_ATI_ANEXO")
    private String trtitmAtiAnexo;
    @Basic(optional = false)
    @Column(name = "TRFITM_TIPO")
    private String trfitmTipo;
    @Basic(optional = false)
    @Column(name = "TRFITM_CODIGO")
    private String trfitmCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private int codigo;

    public ComercialesSnsPK() {
    }

    public ComercialesSnsPK(String trfitmCnvConvenio, String trtitmAtiAnexo, String trfitmTipo, String trfitmCodigo, int codigo) {
        this.trfitmCnvConvenio = trfitmCnvConvenio;
        this.trtitmAtiAnexo = trtitmAtiAnexo;
        this.trfitmTipo = trfitmTipo;
        this.trfitmCodigo = trfitmCodigo;
        this.codigo = codigo;
    }

    public String getTrfitmCnvConvenio() {
        return trfitmCnvConvenio;
    }

    public void setTrfitmCnvConvenio(String trfitmCnvConvenio) {
        this.trfitmCnvConvenio = trfitmCnvConvenio;
    }

    public String getTrtitmAtiAnexo() {
        return trtitmAtiAnexo;
    }

    public void setTrtitmAtiAnexo(String trtitmAtiAnexo) {
        this.trtitmAtiAnexo = trtitmAtiAnexo;
    }

    public String getTrfitmTipo() {
        return trfitmTipo;
    }

    public void setTrfitmTipo(String trfitmTipo) {
        this.trfitmTipo = trfitmTipo;
    }

    public String getTrfitmCodigo() {
        return trfitmCodigo;
    }

    public void setTrfitmCodigo(String trfitmCodigo) {
        this.trfitmCodigo = trfitmCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trfitmCnvConvenio != null ? trfitmCnvConvenio.hashCode() : 0);
        hash += (trtitmAtiAnexo != null ? trtitmAtiAnexo.hashCode() : 0);
        hash += (trfitmTipo != null ? trfitmTipo.hashCode() : 0);
        hash += (trfitmCodigo != null ? trfitmCodigo.hashCode() : 0);
        hash += (int) codigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComercialesSnsPK)) {
            return false;
        }
        ComercialesSnsPK other = (ComercialesSnsPK) object;
        if ((this.trfitmCnvConvenio == null && other.trfitmCnvConvenio != null) || (this.trfitmCnvConvenio != null && !this.trfitmCnvConvenio.equals(other.trfitmCnvConvenio))) {
            return false;
        }
        if ((this.trtitmAtiAnexo == null && other.trtitmAtiAnexo != null) || (this.trtitmAtiAnexo != null && !this.trtitmAtiAnexo.equals(other.trtitmAtiAnexo))) {
            return false;
        }
        if ((this.trfitmTipo == null && other.trfitmTipo != null) || (this.trfitmTipo != null && !this.trfitmTipo.equals(other.trfitmTipo))) {
            return false;
        }
        if ((this.trfitmCodigo == null && other.trfitmCodigo != null) || (this.trfitmCodigo != null && !this.trfitmCodigo.equals(other.trfitmCodigo))) {
            return false;
        }
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ComercialesSnsPK[ trfitmCnvConvenio=" + trfitmCnvConvenio + ", trtitmAtiAnexo=" + trtitmAtiAnexo + ", trfitmTipo=" + trfitmTipo + ", trfitmCodigo=" + trfitmCodigo + ", codigo=" + codigo + " ]";
    }
    
}
