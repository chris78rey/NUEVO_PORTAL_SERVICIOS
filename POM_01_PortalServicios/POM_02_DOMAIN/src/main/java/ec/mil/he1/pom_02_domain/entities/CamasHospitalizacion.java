/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @Column(name = "CARACTERISTICAS")
    private String caracteristicas;
    @Column(name = "FECHA_ACTUALIZA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualiza;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "camasHospitalizacion", fetch = FetchType.LAZY)
    private List<TurnosCamas> turnosCamasList;
    @JoinColumn(name = "AGRCRG_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrupadoresDeCargos agrupadoresDeCargos;
    @JoinColumns({
        @JoinColumn(name = "CRG_TIPO", referencedColumnName = "TIPO"),
        @JoinColumn(name = "CRG_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Cargos cargos;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

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

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Date getFechaActualiza() {
        return fechaActualiza;
    }

    public void setFechaActualiza(Date fechaActualiza) {
        this.fechaActualiza = fechaActualiza;
    }

    public List<TurnosCamas> getTurnosCamasList() {
        return turnosCamasList;
    }

    public void setTurnosCamasList(List<TurnosCamas> turnosCamasList) {
        this.turnosCamasList = turnosCamasList;
    }

    public AgrupadoresDeCargos getAgrupadoresDeCargos() {
        return agrupadoresDeCargos;
    }

    public void setAgrupadoresDeCargos(AgrupadoresDeCargos agrupadoresDeCargos) {
        this.agrupadoresDeCargos = agrupadoresDeCargos;
    }

    public Cargos getCargos() {
        return cargos;
    }

    public void setCargos(Cargos cargos) {
        this.cargos = cargos;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
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
        return "ec.mil.he1.pom_02_domain.entities.CamasHospitalizacion[ camasHospitalizacionPK=" + camasHospitalizacionPK + " ]";
    }
    
}
