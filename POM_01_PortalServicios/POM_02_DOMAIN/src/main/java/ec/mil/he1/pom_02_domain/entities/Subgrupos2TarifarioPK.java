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
public class Subgrupos2TarifarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONVENIO")
    private String convenio;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "SBG1TRF_GRPTRF_CODIGO")
    private String sbg1trfGrptrfCodigo;
    @Basic(optional = false)
    @Column(name = "SBG1TRF_SBGTRF_CODIGO")
    private String sbg1trfSbgtrfCodigo;
    @Basic(optional = false)
    @Column(name = "SBG1TRF_CODIGO")
    private String sbg1trfCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public Subgrupos2TarifarioPK() {
    }

    public Subgrupos2TarifarioPK(String convenio, String tipo, String sbg1trfGrptrfCodigo, String sbg1trfSbgtrfCodigo, String sbg1trfCodigo, String codigo) {
        this.convenio = convenio;
        this.tipo = tipo;
        this.sbg1trfGrptrfCodigo = sbg1trfGrptrfCodigo;
        this.sbg1trfSbgtrfCodigo = sbg1trfSbgtrfCodigo;
        this.sbg1trfCodigo = sbg1trfCodigo;
        this.codigo = codigo;
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

    public String getSbg1trfGrptrfCodigo() {
        return sbg1trfGrptrfCodigo;
    }

    public void setSbg1trfGrptrfCodigo(String sbg1trfGrptrfCodigo) {
        this.sbg1trfGrptrfCodigo = sbg1trfGrptrfCodigo;
    }

    public String getSbg1trfSbgtrfCodigo() {
        return sbg1trfSbgtrfCodigo;
    }

    public void setSbg1trfSbgtrfCodigo(String sbg1trfSbgtrfCodigo) {
        this.sbg1trfSbgtrfCodigo = sbg1trfSbgtrfCodigo;
    }

    public String getSbg1trfCodigo() {
        return sbg1trfCodigo;
    }

    public void setSbg1trfCodigo(String sbg1trfCodigo) {
        this.sbg1trfCodigo = sbg1trfCodigo;
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
        hash += (convenio != null ? convenio.hashCode() : 0);
        hash += (tipo != null ? tipo.hashCode() : 0);
        hash += (sbg1trfGrptrfCodigo != null ? sbg1trfGrptrfCodigo.hashCode() : 0);
        hash += (sbg1trfSbgtrfCodigo != null ? sbg1trfSbgtrfCodigo.hashCode() : 0);
        hash += (sbg1trfCodigo != null ? sbg1trfCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subgrupos2TarifarioPK)) {
            return false;
        }
        Subgrupos2TarifarioPK other = (Subgrupos2TarifarioPK) object;
        if ((this.convenio == null && other.convenio != null) || (this.convenio != null && !this.convenio.equals(other.convenio))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.sbg1trfGrptrfCodigo == null && other.sbg1trfGrptrfCodigo != null) || (this.sbg1trfGrptrfCodigo != null && !this.sbg1trfGrptrfCodigo.equals(other.sbg1trfGrptrfCodigo))) {
            return false;
        }
        if ((this.sbg1trfSbgtrfCodigo == null && other.sbg1trfSbgtrfCodigo != null) || (this.sbg1trfSbgtrfCodigo != null && !this.sbg1trfSbgtrfCodigo.equals(other.sbg1trfSbgtrfCodigo))) {
            return false;
        }
        if ((this.sbg1trfCodigo == null && other.sbg1trfCodigo != null) || (this.sbg1trfCodigo != null && !this.sbg1trfCodigo.equals(other.sbg1trfCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Subgrupos2TarifarioPK[ convenio=" + convenio + ", tipo=" + tipo + ", sbg1trfGrptrfCodigo=" + sbg1trfGrptrfCodigo + ", sbg1trfSbgtrfCodigo=" + sbg1trfSbgtrfCodigo + ", sbg1trfCodigo=" + sbg1trfCodigo + ", codigo=" + codigo + " ]";
    }
    
}
