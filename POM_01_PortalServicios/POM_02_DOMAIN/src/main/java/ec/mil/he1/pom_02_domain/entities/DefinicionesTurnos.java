/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DEFINICIONES_TURNOS")
@NamedQueries({
    @NamedQuery(name = "DefinicionesTurnos.findAll", query = "SELECT d FROM DefinicionesTurnos d")})
public class DefinicionesTurnos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SECUENCIAL")
    private Integer secuencial;
    @Column(name = "DIA")
    private Character dia;
    @Column(name = "HORA_FIN")
    private Integer horaFin;
    @Column(name = "HORA_INICIO")
    private Integer horaInicio;
    @Column(name = "TURNOS_POSIBLES")
    private BigInteger turnosPosibles;
    @JoinColumns({
        @JoinColumn(name = "DPR_ARA_CODIGO", referencedColumnName = "ARA_CODIGO"),
        @JoinColumn(name = "DPR_CODIGO", referencedColumnName = "CODIGO")})
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamentos departamentos;
    @JoinColumn(name = "PRS_CODIGO", referencedColumnName = "CODIGO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Personal personal;

    public DefinicionesTurnos() {
    }

    public DefinicionesTurnos(Integer secuencial) {
        this.secuencial = secuencial;
    }

    public Integer getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(Integer secuencial) {
        this.secuencial = secuencial;
    }

    public Character getDia() {
        return dia;
    }

    public void setDia(Character dia) {
        this.dia = dia;
    }

    public Integer getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Integer horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }

    public BigInteger getTurnosPosibles() {
        return turnosPosibles;
    }

    public void setTurnosPosibles(BigInteger turnosPosibles) {
        this.turnosPosibles = turnosPosibles;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
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
        hash += (secuencial != null ? secuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DefinicionesTurnos)) {
            return false;
        }
        DefinicionesTurnos other = (DefinicionesTurnos) object;
        if ((this.secuencial == null && other.secuencial != null) || (this.secuencial != null && !this.secuencial.equals(other.secuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DefinicionesTurnos[ secuencial=" + secuencial + " ]";
    }
    
}
