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
@Table(name = "EXCEPCIONES_TURNOS_CE")
@NamedQueries({
    @NamedQuery(name = "ExcepcionesTurnosCe.findAll", query = "SELECT e FROM ExcepcionesTurnosCe e")})
public class ExcepcionesTurnosCe implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExcepcionesTurnosCePK excepcionesTurnosCePK;
    @Column(name = "MOTIVO")
    private String motivo;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;

    public ExcepcionesTurnosCe() {
    }

    public ExcepcionesTurnosCe(ExcepcionesTurnosCePK excepcionesTurnosCePK) {
        this.excepcionesTurnosCePK = excepcionesTurnosCePK;
    }

    public ExcepcionesTurnosCe(String tipo, Date fecha, String prsCodigo) {
        this.excepcionesTurnosCePK = new ExcepcionesTurnosCePK(tipo, fecha, prsCodigo);
    }

    public ExcepcionesTurnosCePK getExcepcionesTurnosCePK() {
        return excepcionesTurnosCePK;
    }

    public void setExcepcionesTurnosCePK(ExcepcionesTurnosCePK excepcionesTurnosCePK) {
        this.excepcionesTurnosCePK = excepcionesTurnosCePK;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDprCodigo() {
        return dprCodigo;
    }

    public void setDprCodigo(String dprCodigo) {
        this.dprCodigo = dprCodigo;
    }

    public String getDprAraCodigo() {
        return dprAraCodigo;
    }

    public void setDprAraCodigo(String dprAraCodigo) {
        this.dprAraCodigo = dprAraCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (excepcionesTurnosCePK != null ? excepcionesTurnosCePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExcepcionesTurnosCe)) {
            return false;
        }
        ExcepcionesTurnosCe other = (ExcepcionesTurnosCe) object;
        if ((this.excepcionesTurnosCePK == null && other.excepcionesTurnosCePK != null) || (this.excepcionesTurnosCePK != null && !this.excepcionesTurnosCePK.equals(other.excepcionesTurnosCePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.ExcepcionesTurnosCe[ excepcionesTurnosCePK=" + excepcionesTurnosCePK + " ]";
    }
    
}
