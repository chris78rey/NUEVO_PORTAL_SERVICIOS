/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

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
@Table(name = "PARAMETROS_BASE_ORGANICO")
@NamedQueries({
    @NamedQuery(name = "ParametrosBaseOrganico.findAll", query = "SELECT p FROM ParametrosBaseOrganico p")})
public class ParametrosBaseOrganico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PBO_IDPARAMETRO")
    private Long pboIdparametro;
    @Column(name = "PBO_DESCRIPCION")
    private String pboDescripcion;
    @Column(name = "PBO_PORCENTAJE")
    private BigInteger pboPorcentaje;
    @Column(name = "PBO_PARAMETRO")
    private BigInteger pboParametro;
    @Column(name = "PBO_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pboFechacreacion;
    @Column(name = "PBO_USER")
    private String pboUser;

    public ParametrosBaseOrganico() {
    }

    public ParametrosBaseOrganico(Long pboIdparametro) {
        this.pboIdparametro = pboIdparametro;
    }

    public Long getPboIdparametro() {
        return pboIdparametro;
    }

    public void setPboIdparametro(Long pboIdparametro) {
        this.pboIdparametro = pboIdparametro;
    }

    public String getPboDescripcion() {
        return pboDescripcion;
    }

    public void setPboDescripcion(String pboDescripcion) {
        this.pboDescripcion = pboDescripcion;
    }

    public BigInteger getPboPorcentaje() {
        return pboPorcentaje;
    }

    public void setPboPorcentaje(BigInteger pboPorcentaje) {
        this.pboPorcentaje = pboPorcentaje;
    }

    public BigInteger getPboParametro() {
        return pboParametro;
    }

    public void setPboParametro(BigInteger pboParametro) {
        this.pboParametro = pboParametro;
    }

    public Date getPboFechacreacion() {
        return pboFechacreacion;
    }

    public void setPboFechacreacion(Date pboFechacreacion) {
        this.pboFechacreacion = pboFechacreacion;
    }

    public String getPboUser() {
        return pboUser;
    }

    public void setPboUser(String pboUser) {
        this.pboUser = pboUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pboIdparametro != null ? pboIdparametro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosBaseOrganico)) {
            return false;
        }
        ParametrosBaseOrganico other = (ParametrosBaseOrganico) object;
        if ((this.pboIdparametro == null && other.pboIdparametro != null) || (this.pboIdparametro != null && !this.pboIdparametro.equals(other.pboIdparametro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.ParametrosBaseOrganico[ pboIdparametro=" + pboIdparametro + " ]";
    }
    
}
