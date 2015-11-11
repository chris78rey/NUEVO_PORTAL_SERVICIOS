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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "CAMAS_HOSPITALIZACION")
@NamedQueries({
    @NamedQuery(name = "CamasHospitalizacion.findAll", query = "SELECT c FROM CamasHospitalizacion c")})
public class CamasHospitalizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CamasHospitalizacionPK camasHospitalizacionPK;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;
    @Column(name = "CRG_TIPO")
    private Character crgTipo;
    @Column(name = "CRG_CODIGO")
    private String crgCodigo;
    @Column(name = "CARACTERISTICAS")
    private String caracteristicas;
    @Column(name = "AGRCRG_CODIGO")
    private String agrcrgCodigo;
    @Column(name = "PRS_CODIGO")
    private String prsCodigo;
    @Column(name = "FECHA_ACTUALIZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualiza;

    public CamasHospitalizacion() {
    }

    public CamasHospitalizacion(CamasHospitalizacionPK camasHospitalizacionPK) {
        this.camasHospitalizacionPK = camasHospitalizacionPK;
    }

    public CamasHospitalizacion(short sala, String cama) {
        this.camasHospitalizacionPK = new CamasHospitalizacionPK(sala, cama);
    }

    public CamasHospitalizacionPK getCamasHospitalizacionPK() {
        return camasHospitalizacionPK;
    }

    public void setCamasHospitalizacionPK(CamasHospitalizacionPK camasHospitalizacionPK) {
        this.camasHospitalizacionPK = camasHospitalizacionPK;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    public Character getCrgTipo() {
        return crgTipo;
    }

    public void setCrgTipo(Character crgTipo) {
        this.crgTipo = crgTipo;
    }

    public String getCrgCodigo() {
        return crgCodigo;
    }

    public void setCrgCodigo(String crgCodigo) {
        this.crgCodigo = crgCodigo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getAgrcrgCodigo() {
        return agrcrgCodigo;
    }

    public void setAgrcrgCodigo(String agrcrgCodigo) {
        this.agrcrgCodigo = agrcrgCodigo;
    }

    public String getPrsCodigo() {
        return prsCodigo;
    }

    public void setPrsCodigo(String prsCodigo) {
        this.prsCodigo = prsCodigo;
    }

    public Date getFechaActualiza() {
        return fechaActualiza;
    }

    public void setFechaActualiza(Date fechaActualiza) {
        this.fechaActualiza = fechaActualiza;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (camasHospitalizacionPK != null ? camasHospitalizacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CamasHospitalizacion)) {
            return false;
        }
        CamasHospitalizacion other = (CamasHospitalizacion) object;
        if ((this.camasHospitalizacionPK == null && other.camasHospitalizacionPK != null) || (this.camasHospitalizacionPK != null && !this.camasHospitalizacionPK.equals(other.camasHospitalizacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CamasHospitalizacion[ camasHospitalizacionPK=" + camasHospitalizacionPK + " ]";
    }
    
}
