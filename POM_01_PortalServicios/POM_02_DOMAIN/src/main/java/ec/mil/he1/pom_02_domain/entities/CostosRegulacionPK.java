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
public class CostosRegulacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DTLCRR_ITM_CODIGO")
    private short dtlcrrItmCodigo;
    @Basic(optional = false)
    @Column(name = "DTLCRR_ITM_SBS_CODIGO")
    private String dtlcrrItmSbsCodigo;
    @Basic(optional = false)
    @Column(name = "DTLCRR_ITM_SBS_SCC_CODIGO")
    private String dtlcrrItmSbsSccCodigo;
    @Basic(optional = false)
    @Column(name = "DTLCRR_ITM_TIPO")
    private Character dtlcrrItmTipo;
    @Basic(optional = false)
    @Column(name = "DTLCRR_RGTCRR_ANIO")
    private short dtlcrrRgtcrrAnio;
    @Basic(optional = false)
    @Column(name = "DTLCRR_RGTCRR_LOCAL")
    private String dtlcrrRgtcrrLocal;
    @Basic(optional = false)
    @Column(name = "DTLCRR_RGTCRR_MES")
    private short dtlcrrRgtcrrMes;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;

    public CostosRegulacionPK() {
    }

    public CostosRegulacionPK(short dtlcrrItmCodigo, String dtlcrrItmSbsCodigo, String dtlcrrItmSbsSccCodigo, Character dtlcrrItmTipo, short dtlcrrRgtcrrAnio, String dtlcrrRgtcrrLocal, short dtlcrrRgtcrrMes, String tipo) {
        this.dtlcrrItmCodigo = dtlcrrItmCodigo;
        this.dtlcrrItmSbsCodigo = dtlcrrItmSbsCodigo;
        this.dtlcrrItmSbsSccCodigo = dtlcrrItmSbsSccCodigo;
        this.dtlcrrItmTipo = dtlcrrItmTipo;
        this.dtlcrrRgtcrrAnio = dtlcrrRgtcrrAnio;
        this.dtlcrrRgtcrrLocal = dtlcrrRgtcrrLocal;
        this.dtlcrrRgtcrrMes = dtlcrrRgtcrrMes;
        this.tipo = tipo;
    }

    public short getDtlcrrItmCodigo() {
        return dtlcrrItmCodigo;
    }

    public void setDtlcrrItmCodigo(short dtlcrrItmCodigo) {
        this.dtlcrrItmCodigo = dtlcrrItmCodigo;
    }

    public String getDtlcrrItmSbsCodigo() {
        return dtlcrrItmSbsCodigo;
    }

    public void setDtlcrrItmSbsCodigo(String dtlcrrItmSbsCodigo) {
        this.dtlcrrItmSbsCodigo = dtlcrrItmSbsCodigo;
    }

    public String getDtlcrrItmSbsSccCodigo() {
        return dtlcrrItmSbsSccCodigo;
    }

    public void setDtlcrrItmSbsSccCodigo(String dtlcrrItmSbsSccCodigo) {
        this.dtlcrrItmSbsSccCodigo = dtlcrrItmSbsSccCodigo;
    }

    public Character getDtlcrrItmTipo() {
        return dtlcrrItmTipo;
    }

    public void setDtlcrrItmTipo(Character dtlcrrItmTipo) {
        this.dtlcrrItmTipo = dtlcrrItmTipo;
    }

    public short getDtlcrrRgtcrrAnio() {
        return dtlcrrRgtcrrAnio;
    }

    public void setDtlcrrRgtcrrAnio(short dtlcrrRgtcrrAnio) {
        this.dtlcrrRgtcrrAnio = dtlcrrRgtcrrAnio;
    }

    public String getDtlcrrRgtcrrLocal() {
        return dtlcrrRgtcrrLocal;
    }

    public void setDtlcrrRgtcrrLocal(String dtlcrrRgtcrrLocal) {
        this.dtlcrrRgtcrrLocal = dtlcrrRgtcrrLocal;
    }

    public short getDtlcrrRgtcrrMes() {
        return dtlcrrRgtcrrMes;
    }

    public void setDtlcrrRgtcrrMes(short dtlcrrRgtcrrMes) {
        this.dtlcrrRgtcrrMes = dtlcrrRgtcrrMes;
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
        hash += (int) dtlcrrItmCodigo;
        hash += (dtlcrrItmSbsCodigo != null ? dtlcrrItmSbsCodigo.hashCode() : 0);
        hash += (dtlcrrItmSbsSccCodigo != null ? dtlcrrItmSbsSccCodigo.hashCode() : 0);
        hash += (dtlcrrItmTipo != null ? dtlcrrItmTipo.hashCode() : 0);
        hash += (int) dtlcrrRgtcrrAnio;
        hash += (dtlcrrRgtcrrLocal != null ? dtlcrrRgtcrrLocal.hashCode() : 0);
        hash += (int) dtlcrrRgtcrrMes;
        hash += (tipo != null ? tipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostosRegulacionPK)) {
            return false;
        }
        CostosRegulacionPK other = (CostosRegulacionPK) object;
        if (this.dtlcrrItmCodigo != other.dtlcrrItmCodigo) {
            return false;
        }
        if ((this.dtlcrrItmSbsCodigo == null && other.dtlcrrItmSbsCodigo != null) || (this.dtlcrrItmSbsCodigo != null && !this.dtlcrrItmSbsCodigo.equals(other.dtlcrrItmSbsCodigo))) {
            return false;
        }
        if ((this.dtlcrrItmSbsSccCodigo == null && other.dtlcrrItmSbsSccCodigo != null) || (this.dtlcrrItmSbsSccCodigo != null && !this.dtlcrrItmSbsSccCodigo.equals(other.dtlcrrItmSbsSccCodigo))) {
            return false;
        }
        if ((this.dtlcrrItmTipo == null && other.dtlcrrItmTipo != null) || (this.dtlcrrItmTipo != null && !this.dtlcrrItmTipo.equals(other.dtlcrrItmTipo))) {
            return false;
        }
        if (this.dtlcrrRgtcrrAnio != other.dtlcrrRgtcrrAnio) {
            return false;
        }
        if ((this.dtlcrrRgtcrrLocal == null && other.dtlcrrRgtcrrLocal != null) || (this.dtlcrrRgtcrrLocal != null && !this.dtlcrrRgtcrrLocal.equals(other.dtlcrrRgtcrrLocal))) {
            return false;
        }
        if (this.dtlcrrRgtcrrMes != other.dtlcrrRgtcrrMes) {
            return false;
        }
        if ((this.tipo == null && other.tipo != null) || (this.tipo != null && !this.tipo.equals(other.tipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CostosRegulacionPK[ dtlcrrItmCodigo=" + dtlcrrItmCodigo + ", dtlcrrItmSbsCodigo=" + dtlcrrItmSbsCodigo + ", dtlcrrItmSbsSccCodigo=" + dtlcrrItmSbsSccCodigo + ", dtlcrrItmTipo=" + dtlcrrItmTipo + ", dtlcrrRgtcrrAnio=" + dtlcrrRgtcrrAnio + ", dtlcrrRgtcrrLocal=" + dtlcrrRgtcrrLocal + ", dtlcrrRgtcrrMes=" + dtlcrrRgtcrrMes + ", tipo=" + tipo + " ]";
    }
    
}
