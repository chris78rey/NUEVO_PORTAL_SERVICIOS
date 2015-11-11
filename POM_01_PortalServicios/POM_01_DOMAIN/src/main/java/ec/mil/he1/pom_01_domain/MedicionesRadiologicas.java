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
@Table(name = "MEDICIONES_RADIOLOGICAS")
@NamedQueries({
    @NamedQuery(name = "MedicionesRadiologicas.findAll", query = "SELECT m FROM MedicionesRadiologicas m")})
public class MedicionesRadiologicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MDCRDL_ID")
    private Long mdcrdlId;
    @Column(name = "FCHBRQ_NUMERO")
    private Integer fchbrqNumero;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "DISTANCIA")
    private Short distancia;
    @Column(name = "ACTIVIDAD")
    private BigInteger actividad;

    public MedicionesRadiologicas() {
    }

    public MedicionesRadiologicas(Long mdcrdlId) {
        this.mdcrdlId = mdcrdlId;
    }

    public Long getMdcrdlId() {
        return mdcrdlId;
    }

    public void setMdcrdlId(Long mdcrdlId) {
        this.mdcrdlId = mdcrdlId;
    }

    public Integer getFchbrqNumero() {
        return fchbrqNumero;
    }

    public void setFchbrqNumero(Integer fchbrqNumero) {
        this.fchbrqNumero = fchbrqNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Short getDistancia() {
        return distancia;
    }

    public void setDistancia(Short distancia) {
        this.distancia = distancia;
    }

    public BigInteger getActividad() {
        return actividad;
    }

    public void setActividad(BigInteger actividad) {
        this.actividad = actividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mdcrdlId != null ? mdcrdlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedicionesRadiologicas)) {
            return false;
        }
        MedicionesRadiologicas other = (MedicionesRadiologicas) object;
        if ((this.mdcrdlId == null && other.mdcrdlId != null) || (this.mdcrdlId != null && !this.mdcrdlId.equals(other.mdcrdlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.MedicionesRadiologicas[ mdcrdlId=" + mdcrdlId + " ]";
    }
    
}
