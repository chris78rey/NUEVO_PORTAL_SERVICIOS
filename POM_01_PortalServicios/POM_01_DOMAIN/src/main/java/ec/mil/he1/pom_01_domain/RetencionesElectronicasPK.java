/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Embeddable
public class RetencionesElectronicasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CMP_TPOCMPEMP_EMP_CODIGO")
    private String cmpTpocmpempEmpCodigo;
    @Basic(optional = false)
    @Column(name = "CMP_TPOCMPEMP_TPOCMP_CODIGO")
    private String cmpTpocmpempTpocmpCodigo;
    @Basic(optional = false)
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Basic(optional = false)
    @Column(name = "CMP_CLAVE")
    private long cmpClave;
    @Basic(optional = false)
    @Column(name = "RTN_CAJA")
    private String rtnCaja;

    public RetencionesElectronicasPK() {
    }

    public RetencionesElectronicasPK(String cmpTpocmpempEmpCodigo, String cmpTpocmpempTpocmpCodigo, Date cmpFecha, long cmpClave, String rtnCaja) {
        this.cmpTpocmpempEmpCodigo = cmpTpocmpempEmpCodigo;
        this.cmpTpocmpempTpocmpCodigo = cmpTpocmpempTpocmpCodigo;
        this.cmpFecha = cmpFecha;
        this.cmpClave = cmpClave;
        this.rtnCaja = rtnCaja;
    }

    public String getCmpTpocmpempEmpCodigo() {
        return cmpTpocmpempEmpCodigo;
    }

    public void setCmpTpocmpempEmpCodigo(String cmpTpocmpempEmpCodigo) {
        this.cmpTpocmpempEmpCodigo = cmpTpocmpempEmpCodigo;
    }

    public String getCmpTpocmpempTpocmpCodigo() {
        return cmpTpocmpempTpocmpCodigo;
    }

    public void setCmpTpocmpempTpocmpCodigo(String cmpTpocmpempTpocmpCodigo) {
        this.cmpTpocmpempTpocmpCodigo = cmpTpocmpempTpocmpCodigo;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public long getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(long cmpClave) {
        this.cmpClave = cmpClave;
    }

    public String getRtnCaja() {
        return rtnCaja;
    }

    public void setRtnCaja(String rtnCaja) {
        this.rtnCaja = rtnCaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmpTpocmpempEmpCodigo != null ? cmpTpocmpempEmpCodigo.hashCode() : 0);
        hash += (cmpTpocmpempTpocmpCodigo != null ? cmpTpocmpempTpocmpCodigo.hashCode() : 0);
        hash += (cmpFecha != null ? cmpFecha.hashCode() : 0);
        hash += (int) cmpClave;
        hash += (rtnCaja != null ? rtnCaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetencionesElectronicasPK)) {
            return false;
        }
        RetencionesElectronicasPK other = (RetencionesElectronicasPK) object;
        if ((this.cmpTpocmpempEmpCodigo == null && other.cmpTpocmpempEmpCodigo != null) || (this.cmpTpocmpempEmpCodigo != null && !this.cmpTpocmpempEmpCodigo.equals(other.cmpTpocmpempEmpCodigo))) {
            return false;
        }
        if ((this.cmpTpocmpempTpocmpCodigo == null && other.cmpTpocmpempTpocmpCodigo != null) || (this.cmpTpocmpempTpocmpCodigo != null && !this.cmpTpocmpempTpocmpCodigo.equals(other.cmpTpocmpempTpocmpCodigo))) {
            return false;
        }
        if ((this.cmpFecha == null && other.cmpFecha != null) || (this.cmpFecha != null && !this.cmpFecha.equals(other.cmpFecha))) {
            return false;
        }
        if (this.cmpClave != other.cmpClave) {
            return false;
        }
        if ((this.rtnCaja == null && other.rtnCaja != null) || (this.rtnCaja != null && !this.rtnCaja.equals(other.rtnCaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.RetencionesElectronicasPK[ cmpTpocmpempEmpCodigo=" + cmpTpocmpempEmpCodigo + ", cmpTpocmpempTpocmpCodigo=" + cmpTpocmpempTpocmpCodigo + ", cmpFecha=" + cmpFecha + ", cmpClave=" + cmpClave + ", rtnCaja=" + rtnCaja + " ]";
    }
    
}
