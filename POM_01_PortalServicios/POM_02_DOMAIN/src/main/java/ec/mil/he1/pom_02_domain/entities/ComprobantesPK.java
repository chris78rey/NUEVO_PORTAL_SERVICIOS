/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

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
public class ComprobantesPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "CLAVE")
    private int clave;
    @Basic(optional = false)
    @Column(name = "TPOCMPEMP_TPOCMP_CODIGO")
    private String tpocmpempTpocmpCodigo;
    @Basic(optional = false)
    @Column(name = "TPOCMPEMP_EMP_CODIGO")
    private String tpocmpempEmpCodigo;

    public ComprobantesPK() {
    }

    public ComprobantesPK(Date fecha, int clave, String tpocmpempTpocmpCodigo, String tpocmpempEmpCodigo) {
        this.fecha = fecha;
        this.clave = clave;
        this.tpocmpempTpocmpCodigo = tpocmpempTpocmpCodigo;
        this.tpocmpempEmpCodigo = tpocmpempEmpCodigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getTpocmpempTpocmpCodigo() {
        return tpocmpempTpocmpCodigo;
    }

    public void setTpocmpempTpocmpCodigo(String tpocmpempTpocmpCodigo) {
        this.tpocmpempTpocmpCodigo = tpocmpempTpocmpCodigo;
    }

    public String getTpocmpempEmpCodigo() {
        return tpocmpempEmpCodigo;
    }

    public void setTpocmpempEmpCodigo(String tpocmpempEmpCodigo) {
        this.tpocmpempEmpCodigo = tpocmpempEmpCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fecha != null ? fecha.hashCode() : 0);
        hash += (int) clave;
        hash += (tpocmpempTpocmpCodigo != null ? tpocmpempTpocmpCodigo.hashCode() : 0);
        hash += (tpocmpempEmpCodigo != null ? tpocmpempEmpCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprobantesPK)) {
            return false;
        }
        ComprobantesPK other = (ComprobantesPK) object;
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        if (this.clave != other.clave) {
            return false;
        }
        if ((this.tpocmpempTpocmpCodigo == null && other.tpocmpempTpocmpCodigo != null) || (this.tpocmpempTpocmpCodigo != null && !this.tpocmpempTpocmpCodigo.equals(other.tpocmpempTpocmpCodigo))) {
            return false;
        }
        if ((this.tpocmpempEmpCodigo == null && other.tpocmpempEmpCodigo != null) || (this.tpocmpempEmpCodigo != null && !this.tpocmpempEmpCodigo.equals(other.tpocmpempEmpCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ComprobantesPK[ fecha=" + fecha + ", clave=" + clave + ", tpocmpempTpocmpCodigo=" + tpocmpempTpocmpCodigo + ", tpocmpempEmpCodigo=" + tpocmpempEmpCodigo + " ]";
    }
    
}
