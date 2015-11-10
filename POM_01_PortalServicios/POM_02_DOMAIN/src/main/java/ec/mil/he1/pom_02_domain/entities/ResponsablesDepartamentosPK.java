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
public class ResponsablesDepartamentosPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Basic(optional = false)
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Basic(optional = false)
    @Column(name = "FECHA_DE_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeIngreso;

    public ResponsablesDepartamentosPK() {
    }

    public ResponsablesDepartamentosPK(String dprAraCodigo, String dprCodigo, Date fechaDeIngreso) {
        this.dprAraCodigo = dprAraCodigo;
        this.dprCodigo = dprCodigo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dprAraCodigo != null ? dprAraCodigo.hashCode() : 0);
        hash += (dprCodigo != null ? dprCodigo.hashCode() : 0);
        hash += (fechaDeIngreso != null ? fechaDeIngreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResponsablesDepartamentosPK)) {
            return false;
        }
        ResponsablesDepartamentosPK other = (ResponsablesDepartamentosPK) object;
        if ((this.dprAraCodigo == null && other.dprAraCodigo != null) || (this.dprAraCodigo != null && !this.dprAraCodigo.equals(other.dprAraCodigo))) {
            return false;
        }
        if ((this.dprCodigo == null && other.dprCodigo != null) || (this.dprCodigo != null && !this.dprCodigo.equals(other.dprCodigo))) {
            return false;
        }
        if ((this.fechaDeIngreso == null && other.fechaDeIngreso != null) || (this.fechaDeIngreso != null && !this.fechaDeIngreso.equals(other.fechaDeIngreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ResponsablesDepartamentosPK[ dprAraCodigo=" + dprAraCodigo + ", dprCodigo=" + dprCodigo + ", fechaDeIngreso=" + fechaDeIngreso + " ]";
    }
    
}
