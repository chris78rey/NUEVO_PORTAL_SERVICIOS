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
public class AsociacionesComprobantePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CMP_TPOCMPEMP_EMP_CODIGO")
    private String cmpTpocmpempEmpCodigo;
    @Basic(optional = false)
    @Column(name = "ASCTPOCMP_TPOCMP_CODIGO")
    private String asctpocmpTpocmpCodigo;
    @Basic(optional = false)
    @Column(name = "CMP_FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpFecha;
    @Basic(optional = false)
    @Column(name = "CMP_CLAVE")
    private int cmpClave;
    @Basic(optional = false)
    @Column(name = "ASCTPOCMP_NOMBRE")
    private String asctpocmpNombre;

    public AsociacionesComprobantePK() {
    }

    public AsociacionesComprobantePK(String cmpTpocmpempEmpCodigo, String asctpocmpTpocmpCodigo, Date cmpFecha, int cmpClave, String asctpocmpNombre) {
        this.cmpTpocmpempEmpCodigo = cmpTpocmpempEmpCodigo;
        this.asctpocmpTpocmpCodigo = asctpocmpTpocmpCodigo;
        this.cmpFecha = cmpFecha;
        this.cmpClave = cmpClave;
        this.asctpocmpNombre = asctpocmpNombre;
    }

    public String getCmpTpocmpempEmpCodigo() {
        return cmpTpocmpempEmpCodigo;
    }

    public void setCmpTpocmpempEmpCodigo(String cmpTpocmpempEmpCodigo) {
        this.cmpTpocmpempEmpCodigo = cmpTpocmpempEmpCodigo;
    }

    public String getAsctpocmpTpocmpCodigo() {
        return asctpocmpTpocmpCodigo;
    }

    public void setAsctpocmpTpocmpCodigo(String asctpocmpTpocmpCodigo) {
        this.asctpocmpTpocmpCodigo = asctpocmpTpocmpCodigo;
    }

    public Date getCmpFecha() {
        return cmpFecha;
    }

    public void setCmpFecha(Date cmpFecha) {
        this.cmpFecha = cmpFecha;
    }

    public int getCmpClave() {
        return cmpClave;
    }

    public void setCmpClave(int cmpClave) {
        this.cmpClave = cmpClave;
    }

    public String getAsctpocmpNombre() {
        return asctpocmpNombre;
    }

    public void setAsctpocmpNombre(String asctpocmpNombre) {
        this.asctpocmpNombre = asctpocmpNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmpTpocmpempEmpCodigo != null ? cmpTpocmpempEmpCodigo.hashCode() : 0);
        hash += (asctpocmpTpocmpCodigo != null ? asctpocmpTpocmpCodigo.hashCode() : 0);
        hash += (cmpFecha != null ? cmpFecha.hashCode() : 0);
        hash += (int) cmpClave;
        hash += (asctpocmpNombre != null ? asctpocmpNombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsociacionesComprobantePK)) {
            return false;
        }
        AsociacionesComprobantePK other = (AsociacionesComprobantePK) object;
        if ((this.cmpTpocmpempEmpCodigo == null && other.cmpTpocmpempEmpCodigo != null) || (this.cmpTpocmpempEmpCodigo != null && !this.cmpTpocmpempEmpCodigo.equals(other.cmpTpocmpempEmpCodigo))) {
            return false;
        }
        if ((this.asctpocmpTpocmpCodigo == null && other.asctpocmpTpocmpCodigo != null) || (this.asctpocmpTpocmpCodigo != null && !this.asctpocmpTpocmpCodigo.equals(other.asctpocmpTpocmpCodigo))) {
            return false;
        }
        if ((this.cmpFecha == null && other.cmpFecha != null) || (this.cmpFecha != null && !this.cmpFecha.equals(other.cmpFecha))) {
            return false;
        }
        if (this.cmpClave != other.cmpClave) {
            return false;
        }
        if ((this.asctpocmpNombre == null && other.asctpocmpNombre != null) || (this.asctpocmpNombre != null && !this.asctpocmpNombre.equals(other.asctpocmpNombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.AsociacionesComprobantePK[ cmpTpocmpempEmpCodigo=" + cmpTpocmpempEmpCodigo + ", asctpocmpTpocmpCodigo=" + asctpocmpTpocmpCodigo + ", cmpFecha=" + cmpFecha + ", cmpClave=" + cmpClave + ", asctpocmpNombre=" + asctpocmpNombre + " ]";
    }
    
}
