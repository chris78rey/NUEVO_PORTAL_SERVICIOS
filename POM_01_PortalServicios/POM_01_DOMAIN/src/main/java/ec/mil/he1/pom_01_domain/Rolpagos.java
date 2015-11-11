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
@Table(name = "ROLPAGOS")
@NamedQueries({
    @NamedQuery(name = "Rolpagos.findAll", query = "SELECT r FROM Rolpagos r")})
public class Rolpagos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RPG_IDROLPAGOS")
    private Long rpgIdrolpagos;
    @Column(name = "EMP_IDEMPRESA")
    private Long empIdempresa;
    @Column(name = "RPG_ANIO")
    private Long rpgAnio;
    @Column(name = "RPG_MES")
    private String rpgMes;
    @Column(name = "RPG_QUINCENA")
    private Long rpgQuincena;
    @Column(name = "RPG_ESTADO")
    private Character rpgEstado;
    @Column(name = "RPG_FECHAELABORACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rpgFechaelaboracion;
    @Column(name = "RPG_USER")
    private String rpgUser;
    @Column(name = "RPG_DESCRIPCION")
    private String rpgDescripcion;

    public Rolpagos() {
    }

    public Rolpagos(Long rpgIdrolpagos) {
        this.rpgIdrolpagos = rpgIdrolpagos;
    }

    public Long getRpgIdrolpagos() {
        return rpgIdrolpagos;
    }

    public void setRpgIdrolpagos(Long rpgIdrolpagos) {
        this.rpgIdrolpagos = rpgIdrolpagos;
    }

    public Long getEmpIdempresa() {
        return empIdempresa;
    }

    public void setEmpIdempresa(Long empIdempresa) {
        this.empIdempresa = empIdempresa;
    }

    public Long getRpgAnio() {
        return rpgAnio;
    }

    public void setRpgAnio(Long rpgAnio) {
        this.rpgAnio = rpgAnio;
    }

    public String getRpgMes() {
        return rpgMes;
    }

    public void setRpgMes(String rpgMes) {
        this.rpgMes = rpgMes;
    }

    public Long getRpgQuincena() {
        return rpgQuincena;
    }

    public void setRpgQuincena(Long rpgQuincena) {
        this.rpgQuincena = rpgQuincena;
    }

    public Character getRpgEstado() {
        return rpgEstado;
    }

    public void setRpgEstado(Character rpgEstado) {
        this.rpgEstado = rpgEstado;
    }

    public Date getRpgFechaelaboracion() {
        return rpgFechaelaboracion;
    }

    public void setRpgFechaelaboracion(Date rpgFechaelaboracion) {
        this.rpgFechaelaboracion = rpgFechaelaboracion;
    }

    public String getRpgUser() {
        return rpgUser;
    }

    public void setRpgUser(String rpgUser) {
        this.rpgUser = rpgUser;
    }

    public String getRpgDescripcion() {
        return rpgDescripcion;
    }

    public void setRpgDescripcion(String rpgDescripcion) {
        this.rpgDescripcion = rpgDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rpgIdrolpagos != null ? rpgIdrolpagos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rolpagos)) {
            return false;
        }
        Rolpagos other = (Rolpagos) object;
        if ((this.rpgIdrolpagos == null && other.rpgIdrolpagos != null) || (this.rpgIdrolpagos != null && !this.rpgIdrolpagos.equals(other.rpgIdrolpagos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Rolpagos[ rpgIdrolpagos=" + rpgIdrolpagos + " ]";
    }
    
}
