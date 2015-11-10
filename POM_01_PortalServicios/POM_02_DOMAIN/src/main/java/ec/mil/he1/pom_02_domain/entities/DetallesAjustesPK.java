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
public class DetallesAjustesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DA_SECUENCIA")
    private long daSecuencia;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_CODIGO")
    private String itmSbsCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_CODIGO")
    private short itmCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_SBS_SCC_CODIGO")
    private String itmSbsSccCodigo;
    @Basic(optional = false)
    @Column(name = "ITM_TIPO")
    private Character itmTipo;

    public DetallesAjustesPK() {
    }

    public DetallesAjustesPK(long daSecuencia, String itmSbsCodigo, short itmCodigo, String itmSbsSccCodigo, Character itmTipo) {
        this.daSecuencia = daSecuencia;
        this.itmSbsCodigo = itmSbsCodigo;
        this.itmCodigo = itmCodigo;
        this.itmSbsSccCodigo = itmSbsSccCodigo;
        this.itmTipo = itmTipo;
    }

    public long getDaSecuencia() {
        return daSecuencia;
    }

    public void setDaSecuencia(long daSecuencia) {
        this.daSecuencia = daSecuencia;
    }

    public String getItmSbsCodigo() {
        return itmSbsCodigo;
    }

    public void setItmSbsCodigo(String itmSbsCodigo) {
        this.itmSbsCodigo = itmSbsCodigo;
    }

    public short getItmCodigo() {
        return itmCodigo;
    }

    public void setItmCodigo(short itmCodigo) {
        this.itmCodigo = itmCodigo;
    }

    public String getItmSbsSccCodigo() {
        return itmSbsSccCodigo;
    }

    public void setItmSbsSccCodigo(String itmSbsSccCodigo) {
        this.itmSbsSccCodigo = itmSbsSccCodigo;
    }

    public Character getItmTipo() {
        return itmTipo;
    }

    public void setItmTipo(Character itmTipo) {
        this.itmTipo = itmTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) daSecuencia;
        hash += (itmSbsCodigo != null ? itmSbsCodigo.hashCode() : 0);
        hash += (int) itmCodigo;
        hash += (itmSbsSccCodigo != null ? itmSbsSccCodigo.hashCode() : 0);
        hash += (itmTipo != null ? itmTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesAjustesPK)) {
            return false;
        }
        DetallesAjustesPK other = (DetallesAjustesPK) object;
        if (this.daSecuencia != other.daSecuencia) {
            return false;
        }
        if ((this.itmSbsCodigo == null && other.itmSbsCodigo != null) || (this.itmSbsCodigo != null && !this.itmSbsCodigo.equals(other.itmSbsCodigo))) {
            return false;
        }
        if (this.itmCodigo != other.itmCodigo) {
            return false;
        }
        if ((this.itmSbsSccCodigo == null && other.itmSbsSccCodigo != null) || (this.itmSbsSccCodigo != null && !this.itmSbsSccCodigo.equals(other.itmSbsSccCodigo))) {
            return false;
        }
        if ((this.itmTipo == null && other.itmTipo != null) || (this.itmTipo != null && !this.itmTipo.equals(other.itmTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetallesAjustesPK[ daSecuencia=" + daSecuencia + ", itmSbsCodigo=" + itmSbsCodigo + ", itmCodigo=" + itmCodigo + ", itmSbsSccCodigo=" + itmSbsSccCodigo + ", itmTipo=" + itmTipo + " ]";
    }
    
}
