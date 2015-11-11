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
@Table(name = "TURNOS_DE_DETALLES")
@NamedQueries({
    @NamedQuery(name = "TurnosDeDetalles.findAll", query = "SELECT t FROM TurnosDeDetalles t")})
public class TurnosDeDetalles implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TurnosDeDetallesPK turnosDeDetallesPK;
    @Column(name = "DTLEXM_EXM_NUMERO")
    private Integer dtlexmExmNumero;
    @Column(name = "DTLEXM_VRBEXM_CODIGO")
    private Integer dtlexmVrbexmCodigo;
    @Column(name = "ESTADO_DE_ATENCION")
    private Short estadoDeAtencion;
    @Column(name = "MOTIVO")
    private String motivo;

    public TurnosDeDetalles() {
    }

    public TurnosDeDetalles(TurnosDeDetallesPK turnosDeDetallesPK) {
        this.turnosDeDetallesPK = turnosDeDetallesPK;
    }

    public TurnosDeDetalles(String dprAraCodigo, String dprCodigo, Date fecha, int numero) {
        this.turnosDeDetallesPK = new TurnosDeDetallesPK(dprAraCodigo, dprCodigo, fecha, numero);
    }

    public TurnosDeDetallesPK getTurnosDeDetallesPK() {
        return turnosDeDetallesPK;
    }

    public void setTurnosDeDetallesPK(TurnosDeDetallesPK turnosDeDetallesPK) {
        this.turnosDeDetallesPK = turnosDeDetallesPK;
    }

    public Integer getDtlexmExmNumero() {
        return dtlexmExmNumero;
    }

    public void setDtlexmExmNumero(Integer dtlexmExmNumero) {
        this.dtlexmExmNumero = dtlexmExmNumero;
    }

    public Integer getDtlexmVrbexmCodigo() {
        return dtlexmVrbexmCodigo;
    }

    public void setDtlexmVrbexmCodigo(Integer dtlexmVrbexmCodigo) {
        this.dtlexmVrbexmCodigo = dtlexmVrbexmCodigo;
    }

    public Short getEstadoDeAtencion() {
        return estadoDeAtencion;
    }

    public void setEstadoDeAtencion(Short estadoDeAtencion) {
        this.estadoDeAtencion = estadoDeAtencion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turnosDeDetallesPK != null ? turnosDeDetallesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurnosDeDetalles)) {
            return false;
        }
        TurnosDeDetalles other = (TurnosDeDetalles) object;
        if ((this.turnosDeDetallesPK == null && other.turnosDeDetallesPK != null) || (this.turnosDeDetallesPK != null && !this.turnosDeDetallesPK.equals(other.turnosDeDetallesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TurnosDeDetalles[ turnosDeDetallesPK=" + turnosDeDetallesPK + " ]";
    }
    
}
