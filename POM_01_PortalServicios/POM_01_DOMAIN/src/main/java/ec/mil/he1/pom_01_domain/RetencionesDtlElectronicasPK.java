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
public class RetencionesDtlElectronicasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RTN_NUMERO")
    private long rtnNumero;
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "CODIGO_RETENCION")
    private String codigoRetencion;

    public RetencionesDtlElectronicasPK() {
    }

    public RetencionesDtlElectronicasPK(long rtnNumero, String codigo, String codigoRetencion) {
        this.rtnNumero = rtnNumero;
        this.codigo = codigo;
        this.codigoRetencion = codigoRetencion;
    }

    public long getRtnNumero() {
        return rtnNumero;
    }

    public void setRtnNumero(long rtnNumero) {
        this.rtnNumero = rtnNumero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoRetencion() {
        return codigoRetencion;
    }

    public void setCodigoRetencion(String codigoRetencion) {
        this.codigoRetencion = codigoRetencion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) rtnNumero;
        hash += (codigo != null ? codigo.hashCode() : 0);
        hash += (codigoRetencion != null ? codigoRetencion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesDtlElectronicasPK)) {
            return false;
        }
        RetencionesDtlElectronicasPK other = (RetencionesDtlElectronicasPK) object;
        if (this.rtnNumero != other.rtnNumero) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        if ((this.codigoRetencion == null && other.codigoRetencion != null) || (this.codigoRetencion != null && !this.codigoRetencion.equals(other.codigoRetencion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RetencionesDtlElectronicasPK[ rtnNumero=" + rtnNumero + ", codigo=" + codigo + ", codigoRetencion=" + codigoRetencion + " ]";
    }
    
}
