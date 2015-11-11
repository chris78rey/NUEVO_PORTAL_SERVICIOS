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
@Table(name = "HORARIOS_MEDICO")
@NamedQueries({
    @NamedQuery(name = "HorariosMedico.findAll", query = "SELECT h FROM HorariosMedico h")})
public class HorariosMedico implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HorariosMedicoPK horariosMedicoPK;
    @Column(name = "DPR_CODIGO")
    private String dprCodigo;
    @Column(name = "DPR_ARA_CODIGO")
    private String dprAraCodigo;
    @Column(name = "DIA")
    private String dia;
    @Column(name = "HORA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicial;
    @Column(name = "HORA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFinal;
    @Column(name = "TURNOS_POSIBLES")
    private Short turnosPosibles;
    @Column(name = "TIEMPO")
    private Short tiempo;
    @Column(name = "DISPONIBILIDAD")
    private Character disponibilidad;

    public HorariosMedico() {
    }

    public HorariosMedico(HorariosMedicoPK horariosMedicoPK) {
        this.horariosMedicoPK = horariosMedicoPK;
    }

    public HorariosMedico(String prsCodigo, int numero) {
        this.horariosMedicoPK = new HorariosMedicoPK(prsCodigo, numero);
    }

    public HorariosMedicoPK getHorariosMedicoPK() {
        return horariosMedicoPK;
    }

    public void setHorariosMedicoPK(HorariosMedicoPK horariosMedicoPK) {
        this.horariosMedicoPK = horariosMedicoPK;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Short getTurnosPosibles() {
        return turnosPosibles;
    }

    public void setTurnosPosibles(Short turnosPosibles) {
        this.turnosPosibles = turnosPosibles;
    }

    public Short getTiempo() {
        return tiempo;
    }

    public void setTiempo(Short tiempo) {
        this.tiempo = tiempo;
    }

    public Character getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Character disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (horariosMedicoPK != null ? horariosMedicoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorariosMedico)) {
            return false;
        }
        HorariosMedico other = (HorariosMedico) object;
        if ((this.horariosMedicoPK == null && other.horariosMedicoPK != null) || (this.horariosMedicoPK != null && !this.horariosMedicoPK.equals(other.horariosMedicoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.HorariosMedico[ horariosMedicoPK=" + horariosMedicoPK + " ]";
    }
    
}
