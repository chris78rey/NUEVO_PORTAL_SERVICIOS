/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "JORNADAS")
@NamedQueries({
    @NamedQuery(name = "Jornadas.findAll", query = "SELECT j FROM Jornadas j")})
public class Jornadas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "JRN_IDJORNADA")
    private Long jrnIdjornada;
    @Column(name = "JRN_TIPOJORNADA")
    private String jrnTipojornada;
    @Column(name = "JRN_ESTADO")
    private Character jrnEstado;
    @Column(name = "JRN_OBSERVACION")
    private String jrnObservacion;
    @Column(name = "JRN_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date jrnFechacreacion;
    @Column(name = "JRN_USER")
    private String jrnUser;
    @OneToMany(mappedBy = "jornadas", fetch = FetchType.LAZY)
    private List<Asistencias> asistenciasList;
    @OneToMany(mappedBy = "jornadas", fetch = FetchType.LAZY)
    private List<PersonalJornada> personalJornadaList;
    @OneToMany(mappedBy = "jornadas", fetch = FetchType.LAZY)
    private List<DetalleJornada> detalleJornadaList;

    public Jornadas() {
    }

    public Jornadas(Long jrnIdjornada) {
        this.jrnIdjornada = jrnIdjornada;
    }

    public Long getJrnIdjornada() {
        return jrnIdjornada;
    }

    public void setJrnIdjornada(Long jrnIdjornada) {
        this.jrnIdjornada = jrnIdjornada;
    }

    public String getJrnTipojornada() {
        return jrnTipojornada;
    }

    public void setJrnTipojornada(String jrnTipojornada) {
        this.jrnTipojornada = jrnTipojornada;
    }

    public Character getJrnEstado() {
        return jrnEstado;
    }

    public void setJrnEstado(Character jrnEstado) {
        this.jrnEstado = jrnEstado;
    }

    public String getJrnObservacion() {
        return jrnObservacion;
    }

    public void setJrnObservacion(String jrnObservacion) {
        this.jrnObservacion = jrnObservacion;
    }

    public Date getJrnFechacreacion() {
        return jrnFechacreacion;
    }

    public void setJrnFechacreacion(Date jrnFechacreacion) {
        this.jrnFechacreacion = jrnFechacreacion;
    }

    public String getJrnUser() {
        return jrnUser;
    }

    public void setJrnUser(String jrnUser) {
        this.jrnUser = jrnUser;
    }

    public List<Asistencias> getAsistenciasList() {
        return asistenciasList;
    }

    public void setAsistenciasList(List<Asistencias> asistenciasList) {
        this.asistenciasList = asistenciasList;
    }

    public List<PersonalJornada> getPersonalJornadaList() {
        return personalJornadaList;
    }

    public void setPersonalJornadaList(List<PersonalJornada> personalJornadaList) {
        this.personalJornadaList = personalJornadaList;
    }

    public List<DetalleJornada> getDetalleJornadaList() {
        return detalleJornadaList;
    }

    public void setDetalleJornadaList(List<DetalleJornada> detalleJornadaList) {
        this.detalleJornadaList = detalleJornadaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jrnIdjornada != null ? jrnIdjornada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jornadas)) {
            return false;
        }
        Jornadas other = (Jornadas) object;
        if ((this.jrnIdjornada == null && other.jrnIdjornada != null) || (this.jrnIdjornada != null && !this.jrnIdjornada.equals(other.jrnIdjornada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Jornadas[ jrnIdjornada=" + jrnIdjornada + " ]";
    }
    
}
