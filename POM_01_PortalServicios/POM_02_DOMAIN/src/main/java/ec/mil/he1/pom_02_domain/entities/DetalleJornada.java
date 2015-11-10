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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DETALLE_JORNADA")
@NamedQueries({
    @NamedQuery(name = "DetalleJornada.findAll", query = "SELECT d FROM DetalleJornada d")})
public class DetalleJornada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DTJ_IDDETALLE")
    private Long dtjIddetalle;
    @Column(name = "DTJ_DIA")
    private String dtjDia;
    @Column(name = "DTJ_HORAENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtjHoraentrada;
    @Column(name = "DTJ_HORASALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtjHorasalida;
    @Column(name = "DTJ_OBSERVACION")
    private String dtjObservacion;
    @Column(name = "DTJ_ESTADO")
    private Character dtjEstado;
    @Column(name = "DTJ_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtjFechacreacion;
    @Column(name = "DTJ_USER")
    private String dtjUser;
    @JoinColumn(name = "JRN_IDJORNADA", referencedColumnName = "JRN_IDJORNADA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Jornadas jornadas;

    public DetalleJornada() {
    }

    public DetalleJornada(Long dtjIddetalle) {
        this.dtjIddetalle = dtjIddetalle;
    }

    public Long getDtjIddetalle() {
        return dtjIddetalle;
    }

    public void setDtjIddetalle(Long dtjIddetalle) {
        this.dtjIddetalle = dtjIddetalle;
    }

    public String getDtjDia() {
        return dtjDia;
    }

    public void setDtjDia(String dtjDia) {
        this.dtjDia = dtjDia;
    }

    public Date getDtjHoraentrada() {
        return dtjHoraentrada;
    }

    public void setDtjHoraentrada(Date dtjHoraentrada) {
        this.dtjHoraentrada = dtjHoraentrada;
    }

    public Date getDtjHorasalida() {
        return dtjHorasalida;
    }

    public void setDtjHorasalida(Date dtjHorasalida) {
        this.dtjHorasalida = dtjHorasalida;
    }

    public String getDtjObservacion() {
        return dtjObservacion;
    }

    public void setDtjObservacion(String dtjObservacion) {
        this.dtjObservacion = dtjObservacion;
    }

    public Character getDtjEstado() {
        return dtjEstado;
    }

    public void setDtjEstado(Character dtjEstado) {
        this.dtjEstado = dtjEstado;
    }

    public Date getDtjFechacreacion() {
        return dtjFechacreacion;
    }

    public void setDtjFechacreacion(Date dtjFechacreacion) {
        this.dtjFechacreacion = dtjFechacreacion;
    }

    public String getDtjUser() {
        return dtjUser;
    }

    public void setDtjUser(String dtjUser) {
        this.dtjUser = dtjUser;
    }

    public Jornadas getJornadas() {
        return jornadas;
    }

    public void setJornadas(Jornadas jornadas) {
        this.jornadas = jornadas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtjIddetalle != null ? dtjIddetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleJornada)) {
            return false;
        }
        DetalleJornada other = (DetalleJornada) object;
        if ((this.dtjIddetalle == null && other.dtjIddetalle != null) || (this.dtjIddetalle != null && !this.dtjIddetalle.equals(other.dtjIddetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.DetalleJornada[ dtjIddetalle=" + dtjIddetalle + " ]";
    }
    
}
