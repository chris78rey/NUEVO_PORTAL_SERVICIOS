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
public class GruposDetallesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FRMROL_EMP_CODIGO")
    private String frmrolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "FRMROL_CODIGO")
    private String frmrolCodigo;
    @Basic(optional = false)
    @Column(name = "SECUENCIA")
    private short secuencia;

    public GruposDetallesPK() {
    }

    public GruposDetallesPK(String frmrolEmpCodigo, String frmrolCodigo, short secuencia) {
        this.frmrolEmpCodigo = frmrolEmpCodigo;
        this.frmrolCodigo = frmrolCodigo;
        this.secuencia = secuencia;
    }

    public String getFrmrolEmpCodigo() {
        return frmrolEmpCodigo;
    }

    public void setFrmrolEmpCodigo(String frmrolEmpCodigo) {
        this.frmrolEmpCodigo = frmrolEmpCodigo;
    }

    public String getFrmrolCodigo() {
        return frmrolCodigo;
    }

    public void setFrmrolCodigo(String frmrolCodigo) {
        this.frmrolCodigo = frmrolCodigo;
    }

    public short getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(short secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (frmrolEmpCodigo != null ? frmrolEmpCodigo.hashCode() : 0);
        hash += (frmrolCodigo != null ? frmrolCodigo.hashCode() : 0);
        hash += (int) secuencia;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GruposDetallesPK)) {
            return false;
        }
        GruposDetallesPK other = (GruposDetallesPK) object;
        if ((this.frmrolEmpCodigo == null && other.frmrolEmpCodigo != null) || (this.frmrolEmpCodigo != null && !this.frmrolEmpCodigo.equals(other.frmrolEmpCodigo))) {
            return false;
        }
        if ((this.frmrolCodigo == null && other.frmrolCodigo != null) || (this.frmrolCodigo != null && !this.frmrolCodigo.equals(other.frmrolCodigo))) {
            return false;
        }
        if (this.secuencia != other.secuencia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.GruposDetallesPK[ frmrolEmpCodigo=" + frmrolEmpCodigo + ", frmrolCodigo=" + frmrolCodigo + ", secuencia=" + secuencia + " ]";
    }
    
}
