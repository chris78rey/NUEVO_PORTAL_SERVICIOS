/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "PERIODOS_FONDO_RESERVA")
@NamedQueries({
    @NamedQuery(name = "PeriodosFondoReserva.findAll", query = "SELECT p FROM PeriodosFondoReserva p")})
public class PeriodosFondoReserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PeriodosFondoReservaPK periodosFondoReservaPK;
    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public PeriodosFondoReserva() {
    }

    public PeriodosFondoReserva(PeriodosFondoReservaPK periodosFondoReservaPK) {
        this.periodosFondoReservaPK = periodosFondoReservaPK;
    }

    public PeriodosFondoReserva(String emprolEmpCodigo, long emprolCodigo, Date fechaDesde, Date fechaHasta) {
        this.periodosFondoReservaPK = new PeriodosFondoReservaPK(emprolEmpCodigo, emprolCodigo, fechaDesde, fechaHasta);
    }

    public PeriodosFondoReservaPK getPeriodosFondoReservaPK() {
        return periodosFondoReservaPK;
    }

    public void setPeriodosFondoReservaPK(PeriodosFondoReservaPK periodosFondoReservaPK) {
        this.periodosFondoReservaPK = periodosFondoReservaPK;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (periodosFondoReservaPK != null ? periodosFondoReservaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeriodosFondoReserva)) {
            return false;
        }
        PeriodosFondoReserva other = (PeriodosFondoReserva) object;
        if ((this.periodosFondoReservaPK == null && other.periodosFondoReservaPK != null) || (this.periodosFondoReservaPK != null && !this.periodosFondoReservaPK.equals(other.periodosFondoReservaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.PeriodosFondoReserva[ periodosFondoReservaPK=" + periodosFondoReservaPK + " ]";
    }
    
}
