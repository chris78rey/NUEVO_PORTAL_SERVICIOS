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
public class ConveniosEquivalenciasItemsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "TRFITM_CNV_CONVENIO")
    private String trfitmCnvConvenio;
    @Basic(optional = false)
    @Column(name = "TRFITM_ATI_ANEXO")
    private String trfitmAtiAnexo;
    @Basic(optional = false)
    @Column(name = "TRFITM_TIPO")
    private String trfitmTipo;
    @Basic(optional = false)
    @Column(name = "TRFITM_CODIGO")
    private String trfitmCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_TIPO")
    private Character itmTipo;
    @Basic(optional = false)
    @Column(name = "ITM_CODIGO")
    private short itmCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;

    public ConveniosEquivalenciasItemsPK() {
    }

    public ConveniosEquivalenciasItemsPK(String trfitmCnvConvenio, String trfitmAtiAnexo, String trfitmTipo, String trfitmCodigo, Character itmTipo, short itmCodigo, String itmSbsCodigo, String itmSbsSccCodigo) {
        this.trfitmCnvConvenio = trfitmCnvConvenio;
        this.trfitmAtiAnexo = trfitmAtiAnexo;
        this.trfitmTipo = trfitmTipo;
        this.trfitmCodigo = trfitmCodigo;
        this.itmTipo = itmTipo;
        this.itmCodigo = itmCodigo;
        this.itmSbsCodigo = itmSbsCodigo;
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public String getTrfitmCnvConvenio() {
        return trfitmCnvConvenio;
    }

    public void setTrfitmCnvConvenio(String trfitmCnvConvenio) {
        this.trfitmCnvConvenio = trfitmCnvConvenio;
    }

    public String getTrfitmAtiAnexo() {
        return trfitmAtiAnexo;
    }

    public void setTrfitmAtiAnexo(String trfitmAtiAnexo) {
        this.trfitmAtiAnexo = trfitmAtiAnexo;
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

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    public short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(short itmCodigo) {
        this.itmCodigo = itmCodigo;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trfitmCnvConvenio != null ? trfitmCnvConvenio.hashCode() : 0);
        hash += (trfitmAtiAnexo != null ? trfitmAtiAnexo.hashCode() : 0);
        hash += (trfitmTipo != null ? trfitmTipo.hashCode() : 0);
        hash += (trfitmCodigo != null ? trfitmCodigo.hashCode() : 0);
        hash += (itmTipo != null ? itmTipo.hashCode() : 0);
        hash += (int) itmCodigo;
        hash += (itmSbsCodigo != null ? itmSbsCodigo.hashCode() : 0);
        hash += (itmSbsSccCodigo != null ? itmSbsSccCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConveniosEquivalenciasItemsPK)) {
            return false;
        }
        ConveniosEquivalenciasItemsPK other = (ConveniosEquivalenciasItemsPK) object;
        if ((this.trfitmCnvConvenio == null && other.trfitmCnvConvenio != null) || (this.trfitmCnvConvenio != null && !this.trfitmCnvConvenio.equals(other.trfitmCnvConvenio))) {
            return false;
        }
        if ((this.trfitmAtiAnexo == null && other.trfitmAtiAnexo != null) || (this.trfitmAtiAnexo != null && !this.trfitmAtiAnexo.equals(other.trfitmAtiAnexo))) {
            return false;
        }
        if ((this.trfitmTipo == null && other.trfitmTipo != null) || (this.trfitmTipo != null && !this.trfitmTipo.equals(other.trfitmTipo))) {
            return false;
        }
        if ((this.trfitmCodigo == null && other.trfitmCodigo != null) || (this.trfitmCodigo != null && !this.trfitmCodigo.equals(other.trfitmCodigo))) {
            return false;
        }
        if ((this.itmTipo == null && other.itmTipo != null) || (this.itmTipo != null && !this.itmTipo.equals(other.itmTipo))) {
            return false;
        }
        if (this.itmCodigo != other.itmCodigo) {
            return false;
        }
        if ((this.itmSbsCodigo == null && other.itmSbsCodigo != null) || (this.itmSbsCodigo != null && !this.itmSbsCodigo.equals(other.itmSbsCodigo))) {
            return false;
        }
        if ((this.itmSbsSccCodigo == null && other.itmSbsSccCodigo != null) || (this.itmSbsSccCodigo != null && !this.itmSbsSccCodigo.equals(other.itmSbsSccCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ConveniosEquivalenciasItemsPK[ trfitmCnvConvenio=" + trfitmCnvConvenio + ", trfitmAtiAnexo=" + trfitmAtiAnexo + ", trfitmTipo=" + trfitmTipo + ", trfitmCodigo=" + trfitmCodigo + ", itmTipo=" + itmTipo + ", itmCodigo=" + itmCodigo + ", itmSbsCodigo=" + itmSbsCodigo + ", itmSbsSccCodigo=" + itmSbsSccCodigo + " ]";
    }
    
}
