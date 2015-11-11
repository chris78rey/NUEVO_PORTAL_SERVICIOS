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
@Table(name = "ERRORES")
@NamedQueries({
    @NamedQuery(name = "Errores.findAll", query = "SELECT e FROM Errores e")})
public class Errores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ERR_ID")
    private Long errId;
    @Column(name = "SESION")
    private String sesion;
    @Column(name = "LINEA")
    private Short linea;
    @Column(name = "MENSAJE")
    private String mensaje;

    public Errores() {
    }

    public Errores(Long errId) {
        this.errId = errId;
    }

    public Long getErrId() {
        return errId;
    }

    public void setErrId(Long errId) {
        this.errId = errId;
    }

    public String getSesion() {
        return sesion;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    public Short getLinea() {
        return linea;
    }

    public void setLinea(Short linea) {
        this.linea = linea;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (errId != null ? errId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Errores)) {
            return false;
        }
        Errores other = (Errores) object;
        if ((this.errId == null && other.errId != null) || (this.errId != null && !this.errId.equals(other.errId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Errores[ errId=" + errId + " ]";
    }
    
}
