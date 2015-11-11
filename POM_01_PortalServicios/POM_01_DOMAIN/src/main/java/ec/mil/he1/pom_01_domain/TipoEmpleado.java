/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "TIPO_EMPLEADO")
@NamedQueries({
    @NamedQuery(name = "TipoEmpleado.findAll", query = "SELECT t FROM TipoEmpleado t")})
public class TipoEmpleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TPE_IDTIPOEMPLEADO")
    private Long tpeIdtipoempleado;
    @Column(name = "TPE_TIPO")
    private String tpeTipo;
    @Column(name = "TPE_USER")
    private String tpeUser;

    public TipoEmpleado() {
    }

    public TipoEmpleado(Long tpeIdtipoempleado) {
        this.tpeIdtipoempleado = tpeIdtipoempleado;
    }

    public Long getTpeIdtipoempleado() {
        return tpeIdtipoempleado;
    }

    public void setTpeIdtipoempleado(Long tpeIdtipoempleado) {
        this.tpeIdtipoempleado = tpeIdtipoempleado;
    }

    public String getTpeTipo() {
        return tpeTipo;
    }

    public void setTpeTipo(String tpeTipo) {
        this.tpeTipo = tpeTipo;
    }

    public String getTpeUser() {
        return tpeUser;
    }

    public void setTpeUser(String tpeUser) {
        this.tpeUser = tpeUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpeIdtipoempleado != null ? tpeIdtipoempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEmpleado)) {
            return false;
        }
        TipoEmpleado other = (TipoEmpleado) object;
        if ((this.tpeIdtipoempleado == null && other.tpeIdtipoempleado != null) || (this.tpeIdtipoempleado != null && !this.tpeIdtipoempleado.equals(other.tpeIdtipoempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TipoEmpleado[ tpeIdtipoempleado=" + tpeIdtipoempleado + " ]";
    }
    
}
