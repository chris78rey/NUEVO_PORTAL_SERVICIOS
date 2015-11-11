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
public class CuentasPaquetesPK implements Serializable {
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
    @Column(name = "CNTS_SEGURO")
    private Character cntsSeguro;
    @Basic(optional = false)
    @Column(name = "SESSION_ID")
    private String sessionId;

    public CuentasPaquetesPK() {
    }

    public CuentasPaquetesPK(String cntsDocumento, long cntsNumero, long cntsDetalle, Character cntsSeguro, String sessionId) {
        this.cntsDocumento = cntsDocumento;
        this.cntsNumero = cntsNumero;
        this.cntsDetalle = cntsDetalle;
        this.cntsSeguro = cntsSeguro;
        this.sessionId = sessionId;
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

    public Character getCntsSeguro() {
        return cntsSeguro;
    }

    public void setCntsSeguro(Character cntsSeguro) {
        this.cntsSeguro = cntsSeguro;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cntsDocumento != null ? cntsDocumento.hashCode() : 0);
        hash += (int) cntsNumero;
        hash += (int) cntsDetalle;
        hash += (cntsSeguro != null ? cntsSeguro.hashCode() : 0);
        hash += (sessionId != null ? sessionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentasPaquetesPK)) {
            return false;
        }
        CuentasPaquetesPK other = (CuentasPaquetesPK) object;
        if ((this.cntsDocumento == null && other.cntsDocumento != null) || (this.cntsDocumento != null && !this.cntsDocumento.equals(other.cntsDocumento))) {
            return false;
        }
        if (this.cntsNumero != other.cntsNumero) {
            return false;
        }
        if (this.cntsDetalle != other.cntsDetalle) {
            return false;
        }
        if ((this.cntsSeguro == null && other.cntsSeguro != null) || (this.cntsSeguro != null && !this.cntsSeguro.equals(other.cntsSeguro))) {
            return false;
        }
        if ((this.sessionId == null && other.sessionId != null) || (this.sessionId != null && !this.sessionId.equals(other.sessionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CuentasPaquetesPK[ cntsDocumento=" + cntsDocumento + ", cntsNumero=" + cntsNumero + ", cntsDetalle=" + cntsDetalle + ", cntsSeguro=" + cntsSeguro + ", sessionId=" + sessionId + " ]";
    }
    
}
