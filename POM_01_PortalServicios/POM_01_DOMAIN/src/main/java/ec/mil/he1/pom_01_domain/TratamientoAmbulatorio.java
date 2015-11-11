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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TRATAMIENTO_AMBULATORIO")
@NamedQueries({
    @NamedQuery(name = "TratamientoAmbulatorio.findAll", query = "SELECT t FROM TratamientoAmbulatorio t")})
public class TratamientoAmbulatorio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TMA_IDTRATAMIENTO")
    private Long tmaIdtratamiento;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "TMA_FECHATRATAMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmaFechatratamiento;
    @Column(name = "TMA_DIAGNOSTICO")
    private String tmaDiagnostico;
    @Column(name = "TMA_SERVICIO")
    private String tmaServicio;
    @Column(name = "TMA_ESPECIALIDAD")
    private String tmaEspecialidad;
    @Column(name = "TMA_OBSERVACION")
    private String tmaObservacion;
    @Column(name = "TMA_FECHAINGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmaFechaingreso;
    @Column(name = "TMA_FECHASALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmaFechasalida;
    @Column(name = "TMA_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmaFechacreacion;
    @Column(name = "TMA_USER")
    private String tmaUser;

    public TratamientoAmbulatorio() {
    }

    public TratamientoAmbulatorio(Long tmaIdtratamiento) {
        this.tmaIdtratamiento = tmaIdtratamiento;
    }

    public Long getTmaIdtratamiento() {
        return tmaIdtratamiento;
    }

    public void setTmaIdtratamiento(Long tmaIdtratamiento) {
        this.tmaIdtratamiento = tmaIdtratamiento;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Date getTmaFechatratamiento() {
        return tmaFechatratamiento;
    }

    public void setTmaFechatratamiento(Date tmaFechatratamiento) {
        this.tmaFechatratamiento = tmaFechatratamiento;
    }

    public String getTmaDiagnostico() {
        return tmaDiagnostico;
    }

    public void setTmaDiagnostico(String tmaDiagnostico) {
        this.tmaDiagnostico = tmaDiagnostico;
    }

    public String getTmaServicio() {
        return tmaServicio;
    }

    public void setTmaServicio(String tmaServicio) {
        this.tmaServicio = tmaServicio;
    }

    public String getTmaEspecialidad() {
        return tmaEspecialidad;
    }

    public void setTmaEspecialidad(String tmaEspecialidad) {
        this.tmaEspecialidad = tmaEspecialidad;
    }

    public String getTmaObservacion() {
        return tmaObservacion;
    }

    public void setTmaObservacion(String tmaObservacion) {
        this.tmaObservacion = tmaObservacion;
    }

    public Date getTmaFechaingreso() {
        return tmaFechaingreso;
    }

    public void setTmaFechaingreso(Date tmaFechaingreso) {
        this.tmaFechaingreso = tmaFechaingreso;
    }

    public Date getTmaFechasalida() {
        return tmaFechasalida;
    }

    public void setTmaFechasalida(Date tmaFechasalida) {
        this.tmaFechasalida = tmaFechasalida;
    }

    public Date getTmaFechacreacion() {
        return tmaFechacreacion;
    }

    public void setTmaFechacreacion(Date tmaFechacreacion) {
        this.tmaFechacreacion = tmaFechacreacion;
    }

    public String getTmaUser() {
        return tmaUser;
    }

    public void setTmaUser(String tmaUser) {
        this.tmaUser = tmaUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tmaIdtratamiento != null ? tmaIdtratamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TratamientoAmbulatorio)) {
            return false;
        }
        TratamientoAmbulatorio other = (TratamientoAmbulatorio) object;
        if ((this.tmaIdtratamiento == null && other.tmaIdtratamiento != null) || (this.tmaIdtratamiento != null && !this.tmaIdtratamiento.equals(other.tmaIdtratamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TratamientoAmbulatorio[ tmaIdtratamiento=" + tmaIdtratamiento + " ]";
    }
    
}
