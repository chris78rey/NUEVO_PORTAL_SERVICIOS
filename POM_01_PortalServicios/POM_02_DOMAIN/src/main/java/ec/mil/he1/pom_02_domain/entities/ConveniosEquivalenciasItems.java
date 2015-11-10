/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CONVENIOS_EQUIVALENCIAS_ITEMS")
@NamedQueries({
    @NamedQuery(name = "ConveniosEquivalenciasItems.findAll", query = "SELECT c FROM ConveniosEquivalenciasItems c")})
public class ConveniosEquivalenciasItems implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConveniosEquivalenciasItemsPK conveniosEquivalenciasItemsPK;
    @Column(name = "CMR_CODIGO")
    private Integer cmrCodigo;
    @JoinColumns({
        @JoinColumn(name = "TRFITM_CNV_CONVENIO", referencedColumnName = "CNV_CONVENIO", insertable = false, updatable = false),
        @JoinColumn(name = "TRFITM_ATI_ANEXO", referencedColumnName = "ANEXO", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AnexosTarifariosItems anexosTarifariosItems;
    @JoinColumns({
        @JoinColumn(name = "TRFITM_CNV_CONVENIO", referencedColumnName = "CNV_CONVENIO", insertable = false, updatable = false),
        @JoinColumn(name = "TRFITM_ATI_ANEXO", referencedColumnName = "ATI_ANEXO", insertable = false, updatable = false),
        @JoinColumn(name = "TRFITM_TIPO", referencedColumnName = "TIPO", insertable = false, updatable = false),
        @JoinColumn(name = "TRFITM_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false),
        @JoinColumn(name = "TRFITM_SECUENCIA", referencedColumnName = "SECUENCIA")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TarifariosItems tarifariosItems;

    public ConveniosEquivalenciasItems() {
    }

    public ConveniosEquivalenciasItems(ConveniosEquivalenciasItemsPK conveniosEquivalenciasItemsPK) {
        this.conveniosEquivalenciasItemsPK = conveniosEquivalenciasItemsPK;
    }

    public ConveniosEquivalenciasItems(String trfitmCnvConvenio, String trfitmAtiAnexo, String trfitmTipo, String trfitmCodigo, Character itmTipo, short itmCodigo, String itmSbsCodigo, String itmSbsSccCodigo) {
        this.conveniosEquivalenciasItemsPK = new ConveniosEquivalenciasItemsPK(trfitmCnvConvenio, trfitmAtiAnexo, trfitmTipo, trfitmCodigo, itmTipo, itmCodigo, itmSbsCodigo, itmSbsSccCodigo);
    }

    public ConveniosEquivalenciasItemsPK getConveniosEquivalenciasItemsPK() {
        return conveniosEquivalenciasItemsPK;
    }

    public void setConveniosEquivalenciasItemsPK(ConveniosEquivalenciasItemsPK conveniosEquivalenciasItemsPK) {
        this.conveniosEquivalenciasItemsPK = conveniosEquivalenciasItemsPK;
    }

    public Integer getCmrCodigo() {
        return cmrCodigo;
    }

    public void setCmrCodigo(Integer cmrCodigo) {
        this.cmrCodigo = cmrCodigo;
    }

    public AnexosTarifariosItems getAnexosTarifariosItems() {
        return anexosTarifariosItems;
    }

    public void setAnexosTarifariosItems(AnexosTarifariosItems anexosTarifariosItems) {
        this.anexosTarifariosItems = anexosTarifariosItems;
    }

    public TarifariosItems getTarifariosItems() {
        return tarifariosItems;
    }

    public void setTarifariosItems(TarifariosItems tarifariosItems) {
        this.tarifariosItems = tarifariosItems;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conveniosEquivalenciasItemsPK != null ? conveniosEquivalenciasItemsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConveniosEquivalenciasItems)) {
            return false;
        }
        ConveniosEquivalenciasItems other = (ConveniosEquivalenciasItems) object;
        if ((this.conveniosEquivalenciasItemsPK == null && other.conveniosEquivalenciasItemsPK != null) || (this.conveniosEquivalenciasItemsPK != null && !this.conveniosEquivalenciasItemsPK.equals(other.conveniosEquivalenciasItemsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ConveniosEquivalenciasItems[ conveniosEquivalenciasItemsPK=" + conveniosEquivalenciasItemsPK + " ]";
    }
    
}
