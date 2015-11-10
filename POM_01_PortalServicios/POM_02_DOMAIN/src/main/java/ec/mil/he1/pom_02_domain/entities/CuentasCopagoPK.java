/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class CuentasCopagoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CNTS_DOCUMENTO")
    private String cntsDocumento;
    @Basic(optional = false)
    @Column(name = "CNTS_NUMERO")
    private long cntsNumero;
    @Basic(optional = false)
    @Column(name = "CNTS_DETALLE")
    private long cntsDetalle;
    @Basic(optional = false)
    @Column(name = "CPGPCN_CPGPCN_ID")
    private BigInteger cpgpcnCpgpcnId;

    public CuentasCopagoPK() {
    }

    public CuentasCopagoPK(String cntsDocumento, long cntsNumero, long cntsDetalle, BigInteger cpgpcnCpgpcnId) {
        this.cntsDocumento = cntsDocumento;
        this.cntsNumero = cntsNumero;
        this.cntsDetalle = cntsDetalle;
        this.cpgpcnCpgpcnId = cpgpcnCpgpcnId;
    }

    public String getCntsDocumento() {
        return cntsDocumento;
    }

    public void setCntsDocumento(String cntsDocumento) {
        this.cntsDocumento = cntsDocumento;
    }

    public long getCntsNumero() {
        return cntsNumero;
    }

    public void setCntsNumero(long cntsNumero) {
        this.cntsNumero = cntsNumero;
    }

    public long getCntsDetalle() {
        return cntsDetalle;
    }

    public void setCntsDetalle(long cntsDetalle) {
        this.cntsDetalle = cntsDetalle;
    }

    public BigInteger getCpgpcnCpgpcnId() {
        return cpgpcnCpgpcnId;
    }

    public void setCpgpcnCpgpcnId(BigInteger cpgpcnCpgpcnId) {
        this.cpgpcnCpgpcnId = cpgpcnCpgpcnId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntsDocumento != null ? cntsDocumento.hashCode() : 0);
        hash += (int) cntsNumero;
        hash += (int) cntsDetalle;
        hash += (cpgpcnCpgpcnId != null ? cpgpcnCpgpcnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasCopagoPK)) {
            return false;
        }
        CuentasCopagoPK other = (CuentasCopagoPK) object;
        if ((this.cntsDocumento == null && other.cntsDocumento != null) || (this.cntsDocumento != null && !this.cntsDocumento.equals(other.cntsDocumento))) {
            return false;
        }
        if (this.cntsNumero != other.cntsNumero) {
            return false;
        }
        if (this.cntsDetalle != other.cntsDetalle) {
            return false;
        }
        if ((this.cpgpcnCpgpcnId == null && other.cpgpcnCpgpcnId != null) || (this.cpgpcnCpgpcnId != null && !this.cpgpcnCpgpcnId.equals(other.cpgpcnCpgpcnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.CuentasCopagoPK[ cntsDocumento=" + cntsDocumento + ", cntsNumero=" + cntsNumero + ", cntsDetalle=" + cntsDetalle + ", cpgpcnCpgpcnId=" + cpgpcnCpgpcnId + " ]";
    }
    
}
