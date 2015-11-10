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
public class DetallesDeOrdenPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORDCMP_NUMERO")
    private int ordcmpNumero;
    @Basic(optional = false)
    @Column(name = "DTLCMP_ITM_TIPO")
    private Character dtlcmpItmTipo;
    @Basic(optional = false)
    @Column(name = "DTLCMP_ITM_SBS_SCC_CODIGO")
    private String dtlcmpItmSbsSccCodigo;
    @Basic(optional = false)
    @Column(name = "DTLCMP_ITM_SBS_CODIGO")
    private String dtlcmpItmSbsCodigo;
    @Basic(optional = false)
    @Column(name = "DTLCMP_ITM_CODIGO")
    private short dtlcmpItmCodigo;

    public DetallesDeOrdenPK() {
    }

    public DetallesDeOrdenPK(int ordcmpNumero, Character dtlcmpItmTipo, String dtlcmpItmSbsSccCodigo, String dtlcmpItmSbsCodigo, short dtlcmpItmCodigo) {
        this.ordcmpNumero = ordcmpNumero;
        this.dtlcmpItmTipo = dtlcmpItmTipo;
        this.dtlcmpItmSbsSccCodigo = dtlcmpItmSbsSccCodigo;
        this.dtlcmpItmSbsCodigo = dtlcmpItmSbsCodigo;
        this.dtlcmpItmCodigo = dtlcmpItmCodigo;
    }

    public int getOrdcmpNumero() {
        return ordcmpNumero;
    }

    public void setOrdcmpNumero(int ordcmpNumero) {
        this.ordcmpNumero = ordcmpNumero;
    }

    public Character getDtlcmpItmTipo() {
        return dtlcmpItmTipo;
    }

    public void setDtlcmpItmTipo(Character dtlcmpItmTipo) {
        this.dtlcmpItmTipo = dtlcmpItmTipo;
    }

    public String getDtlcmpItmSbsSccCodigo() {
        return dtlcmpItmSbsSccCodigo;
    }

    public void setDtlcmpItmSbsSccCodigo(String dtlcmpItmSbsSccCodigo) {
        this.dtlcmpItmSbsSccCodigo = dtlcmpItmSbsSccCodigo;
    }

    public String getDtlcmpItmSbsCodigo() {
        return dtlcmpItmSbsCodigo;
    }

    public void setDtlcmpItmSbsCodigo(String dtlcmpItmSbsCodigo) {
        this.dtlcmpItmSbsCodigo = dtlcmpItmSbsCodigo;
    }

    public short getDtlcmpItmCodigo() {
        return dtlcmpItmCodigo;
    }

    public void setDtlcmpItmCodigo(short dtlcmpItmCodigo) {
        this.dtlcmpItmCodigo = dtlcmpItmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) ordcmpNumero;
        hash += (dtlcmpItmTipo != null ? dtlcmpItmTipo.hashCode() : 0);
        hash += (dtlcmpItmSbsSccCodigo != null ? dtlcmpItmSbsSccCodigo.hashCode() : 0);
        hash += (dtlcmpItmSbsCodigo != null ? dtlcmpItmSbsCodigo.hashCode() : 0);
        hash += (int) dtlcmpItmCodigo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesDeOrdenPK)) {
            return false;
        }
        DetallesDeOrdenPK other = (DetallesDeOrdenPK) object;
        if (this.ordcmpNumero != other.ordcmpNumero) {
            return false;
        }
        if ((this.dtlcmpItmTipo == null && other.dtlcmpItmTipo != null) || (this.dtlcmpItmTipo != null && !this.dtlcmpItmTipo.equals(other.dtlcmpItmTipo))) {
            return false;
        }
        if ((this.dtlcmpItmSbsSccCodigo == null && other.dtlcmpItmSbsSccCodigo != null) || (this.dtlcmpItmSbsSccCodigo != null && !this.dtlcmpItmSbsSccCodigo.equals(other.dtlcmpItmSbsSccCodigo))) {
            return false;
        }
        if ((this.dtlcmpItmSbsCodigo == null && other.dtlcmpItmSbsCodigo != null) || (this.dtlcmpItmSbsCodigo != null && !this.dtlcmpItmSbsCodigo.equals(other.dtlcmpItmSbsCodigo))) {
            return false;
        }
        if (this.dtlcmpItmCodigo != other.dtlcmpItmCodigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesDeOrdenPK[ ordcmpNumero=" + ordcmpNumero + ", dtlcmpItmTipo=" + dtlcmpItmTipo + ", dtlcmpItmSbsSccCodigo=" + dtlcmpItmSbsSccCodigo + ", dtlcmpItmSbsCodigo=" + dtlcmpItmSbsCodigo + ", dtlcmpItmCodigo=" + dtlcmpItmCodigo + " ]";
    }
    
}
