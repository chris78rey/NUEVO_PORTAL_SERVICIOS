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
public class Subgrupos1TarifarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONVENIO")
    private String convenio;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "SBGTRF_GRPTRF_CODIGO")
    private String sbgtrfGrptrfCodigo;
    @Basic(optional = false)
    @Column(name = "SBGTRF_CODIGO")
    private String sbgtrfCodigo;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;

    public Subgrupos1TarifarioPK() {
    }

    public Subgrupos1TarifarioPK(String convenio, String tipo, String sbgtrfGrptrfCodigo, String sbgtrfCodigo, String codigo) {
        this.convenio = convenio;
        this.tipo = tipo;
        this.sbgtrfGrptrfCodigo = sbgtrfGrptrfCodigo;
        this.sbgtrfCodigo = sbgtrfCodigo;
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

    public String getSbgtrfGrptrfCodigo() {
        return sbgtrfGrptrfCodigo;
    }

    public void setSbgtrfGrptrfCodigo(String sbgtrfGrptrfCodigo) {
        this.sbgtrfGrptrfCodigo = sbgtrfGrptrfCodigo;
    }

    public String getSbgtrfCodigo() {
        return sbgtrfCodigo;
    }

    public void setSbgtrfCodigo(String sbgtrfCodigo) {
        this.sbgtrfCodigo = sbgtrfCodigo;
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
        hash += (sbgtrfGrptrfCodigo != null ? sbgtrfGrptrfCodigo.hashCode() : 0);
        hash += (sbgtrfCodigo != null ? sbgtrfCodigo.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subgrupos1TarifarioPK)) {
            return false;
        }
        Subgrupos1TarifarioPK other = (Subgrupos1TarifarioPK) object;
        if ((this.convenio == null && other.convenio != null) || (this.convenio != null && !this.convenio.equals(other.convenio))) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        if ((this.sbgtrfGrptrfCodigo == null && other.sbgtrfGrptrfCodigo != null) || (this.sbgtrfGrptrfCodigo != null && !this.sbgtrfGrptrfCodigo.equals(other.sbgtrfGrptrfCodigo))) {
            return false;
        }
        if ((this.sbgtrfCodigo == null && other.sbgtrfCodigo != null) || (this.sbgtrfCodigo != null && !this.sbgtrfCodigo.equals(other.sbgtrfCodigo))) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Subgrupos1TarifarioPK[ convenio=" + convenio + ", tipo=" + tipo + ", sbgtrfGrptrfCodigo=" + sbgtrfGrptrfCodigo + ", sbgtrfCodigo=" + sbgtrfCodigo + ", codigo=" + codigo + " ]";
    }
    
}
