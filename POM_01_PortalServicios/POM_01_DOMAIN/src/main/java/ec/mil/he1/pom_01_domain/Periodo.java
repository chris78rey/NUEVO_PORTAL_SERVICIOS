/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "PERIODO")
@NamedQueries({
    @NamedQuery(name = "Periodo.findAll", query = "SELECT p FROM Periodo p")})
public class Periodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRD_IDPERIODO")
    private Long prdIdperiodo;
    @Column(name = "PRD_PERIODO")
    private String prdPeriodo;
    @Column(name = "PRD_OBSERVACION")
    private String prdObservacion;
    @Column(name = "PRD_DIASVACACIONES")
    private BigInteger prdDiasvacaciones;
    @Column(name = "PRD_ESTADO")
    private Character prdEstado;
    @Column(name = "PRD_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prdFechacreacion;
    @Column(name = "PRD_USER")
    private String prdUser;

    public Periodo() {
    }

    public Periodo(Long prdIdperiodo) {
        this.prdIdperiodo = prdIdperiodo;
    }

    public Long getPrdIdperiodo() {
        return prdIdperiodo;
    }

    public void setPrdIdperiodo(Long prdIdperiodo) {
        this.prdIdperiodo = prdIdperiodo;
    }

    public String getPrdPeriodo() {
        return prdPeriodo;
    }

    public void setPrdPeriodo(String prdPeriodo) {
        this.prdPeriodo = prdPeriodo;
    }

    public String getPrdObservacion() {
        return prdObservacion;
    }

    public void setPrdObservacion(String prdObservacion) {
        this.prdObservacion = prdObservacion;
    }

    public BigInteger getPrdDiasvacaciones() {
        return prdDiasvacaciones;
    }

    public void setPrdDiasvacaciones(BigInteger prdDiasvacaciones) {
        this.prdDiasvacaciones = prdDiasvacaciones;
    }

    public Character getPrdEstado() {
        return prdEstado;
    }

    public void setPrdEstado(Character prdEstado) {
        this.prdEstado = prdEstado;
    }

    public Date getPrdFechacreacion() {
        return prdFechacreacion;
    }

    public void setPrdFechacreacion(Date prdFechacreacion) {
        this.prdFechacreacion = prdFechacreacion;
    }

    public String getPrdUser() {
        return prdUser;
    }

    public void setPrdUser(String prdUser) {
        this.prdUser = prdUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdIdperiodo != null ? prdIdperiodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodo)) {
            return false;
        }
        Periodo other = (Periodo) object;
        if ((this.prdIdperiodo == null && other.prdIdperiodo != null) || (this.prdIdperiodo != null && !this.prdIdperiodo.equals(other.prdIdperiodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Periodo[ prdIdperiodo=" + prdIdperiodo + " ]";
    }
    
}
