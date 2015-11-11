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
public class PeriodosFondoReservaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMPROL_EMP_CODIGO")
    private String emprolEmpCodigo;
    @Basic(optional = false)
    @Column(name = "EMPROL_CODIGO")
    private long emprolCodigo;
    @Basic(optional = false)
    @Column(name = "FECHA_DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDesde;
    @Basic(optional = false)
    @Column(name = "FECHA_HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHasta;

    public PeriodosFondoReservaPK() {
    }

    public PeriodosFondoReservaPK(String emprolEmpCodigo, long emprolCodigo, Date fechaDesde, Date fechaHasta) {
        this.emprolEmpCodigo = emprolEmpCodigo;
        this.emprolCodigo = emprolCodigo;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public String getEmprolEmpCodigo() {
        return emprolEmpCodigo;
    }

    public void setEmprolEmpCodigo(String emprolEmpCodigo) {
        this.emprolEmpCodigo = emprolEmpCodigo;
    }

    public long getEmprolCodigo() {
        return emprolCodigo;
    }

    public void setEmprolCodigo(long emprolCodigo) {
        this.emprolCodigo = emprolCodigo;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emprolEmpCodigo != null ? emprolEmpCodigo.hashCode() : 0);
        hash += (int) emprolCodigo;
        hash += (fechaDesde != null ? fechaDesde.hashCode() : 0);
        hash += (fechaHasta != null ? fechaHasta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodosFondoReservaPK)) {
            return false;
        }
        PeriodosFondoReservaPK other = (PeriodosFondoReservaPK) object;
        if ((this.emprolEmpCodigo == null && other.emprolEmpCodigo != null) || (this.emprolEmpCodigo != null && !this.emprolEmpCodigo.equals(other.emprolEmpCodigo))) {
            return false;
        }
        if (this.emprolCodigo != other.emprolCodigo) {
            return false;
        }
        if ((this.fechaDesde == null && other.fechaDesde != null) || (this.fechaDesde != null && !this.fechaDesde.equals(other.fechaDesde))) {
            return false;
        }
        if ((this.fechaHasta == null && other.fechaHasta != null) || (this.fechaHasta != null && !this.fechaHasta.equals(other.fechaHasta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PeriodosFondoReservaPK[ emprolEmpCodigo=" + emprolEmpCodigo + ", emprolCodigo=" + emprolCodigo + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + " ]";
    }
    
}
