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
@Table(name = "TABLAS_IMPUESTO_RENTA")
@NamedQueries({
    @NamedQuery(name = "TablasImpuestoRenta.findAll", query = "SELECT t FROM TablasImpuestoRenta t")})
public class TablasImpuestoRenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ANO_RIGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anoRige;
    @Column(name = "ESTADO_DE_DISPONIBILIDAD")
    private Character estadoDeDisponibilidad;

    public TablasImpuestoRenta() {
    }

    public TablasImpuestoRenta(Date anoRige) {
        this.anoRige = anoRige;
    }

    public Date getAnoRige() {
        return anoRige;
    }

    public void setAnoRige(Date anoRige) {
        this.anoRige = anoRige;
    }

    public Character getEstadoDeDisponibilidad() {
        return estadoDeDisponibilidad;
    }

    public void setEstadoDeDisponibilidad(Character estadoDeDisponibilidad) {
        this.estadoDeDisponibilidad = estadoDeDisponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (anoRige != null ? anoRige.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablasImpuestoRenta)) {
            return false;
        }
        TablasImpuestoRenta other = (TablasImpuestoRenta) object;
        if ((this.anoRige == null && other.anoRige != null) || (this.anoRige != null && !this.anoRige.equals(other.anoRige))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.TablasImpuestoRenta[ anoRige=" + anoRige + " ]";
    }
    
}
