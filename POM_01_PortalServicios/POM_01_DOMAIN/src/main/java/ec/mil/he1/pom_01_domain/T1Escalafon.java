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
@Table(name = "T1_ESCALAFON")
@NamedQueries({
    @NamedQuery(name = "T1Escalafon.findAll", query = "SELECT t FROM T1Escalafon t")})
public class T1Escalafon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "T1_CEDULA")
    private String t1Cedula;
    @Column(name = "T1_NOMBRES")
    private String t1Nombres;
    @Column(name = "T1_UNIDAD")
    private String t1Unidad;

    public T1Escalafon() {
    }

    public T1Escalafon(String t1Cedula) {
        this.t1Cedula = t1Cedula;
    }

    public String getT1Cedula() {
        return t1Cedula;
    }

    public void setT1Cedula(String t1Cedula) {
        this.t1Cedula = t1Cedula;
    }

    public String getT1Nombres() {
        return t1Nombres;
    }

    public void setT1Nombres(String t1Nombres) {
        this.t1Nombres = t1Nombres;
    }

    public String getT1Unidad() {
        return t1Unidad;
    }

    public void setT1Unidad(String t1Unidad) {
        this.t1Unidad = t1Unidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (t1Cedula != null ? t1Cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof T1Escalafon)) {
            return false;
        }
        T1Escalafon other = (T1Escalafon) object;
        if ((this.t1Cedula == null && other.t1Cedula != null) || (this.t1Cedula != null && !this.t1Cedula.equals(other.t1Cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.T1Escalafon[ t1Cedula=" + t1Cedula + " ]";
    }
    
}
