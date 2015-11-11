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
@Table(name = "CENTRO_COSTOS")
@NamedQueries({
    @NamedQuery(name = "CentroCostos.findAll", query = "SELECT c FROM CentroCostos c")})
public class CentroCostos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CCT_IDCENTROCOSTO")
    private String cctIdcentrocosto;
    @Column(name = "CCT_IDCCSUPERIOR")
    private String cctIdccsuperior;
    @Column(name = "CCT_NOMBRE")
    private String cctNombre;
    @Column(name = "CCT_CNTCONTABLE")
    private String cctCntcontable;
    @Column(name = "CCT_AFCNTCONTABLE")
    private String cctAfcntcontable;
    @Column(name = "CCT_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cctFechacreacion;
    @Column(name = "CCT_USER")
    private String cctUser;
    @Column(name = "CCT_NIVEL")
    private BigInteger cctNivel;

    public CentroCostos() {
    }

    public CentroCostos(String cctIdcentrocosto) {
        this.cctIdcentrocosto = cctIdcentrocosto;
    }

    public String getCctIdcentrocosto() {
        return cctIdcentrocosto;
    }

    public void setCctIdcentrocosto(String cctIdcentrocosto) {
        this.cctIdcentrocosto = cctIdcentrocosto;
    }

    public String getCctIdccsuperior() {
        return cctIdccsuperior;
    }

    public void setCctIdccsuperior(String cctIdccsuperior) {
        this.cctIdccsuperior = cctIdccsuperior;
    }

    public String getCctNombre() {
        return cctNombre;
    }

    public void setCctNombre(String cctNombre) {
        this.cctNombre = cctNombre;
    }

    public String getCctCntcontable() {
        return cctCntcontable;
    }

    public void setCctCntcontable(String cctCntcontable) {
        this.cctCntcontable = cctCntcontable;
    }

    public String getCctAfcntcontable() {
        return cctAfcntcontable;
    }

    public void setCctAfcntcontable(String cctAfcntcontable) {
        this.cctAfcntcontable = cctAfcntcontable;
    }

    public Date getCctFechacreacion() {
        return cctFechacreacion;
    }

    public void setCctFechacreacion(Date cctFechacreacion) {
        this.cctFechacreacion = cctFechacreacion;
    }

    public String getCctUser() {
        return cctUser;
    }

    public void setCctUser(String cctUser) {
        this.cctUser = cctUser;
    }

    public BigInteger getCctNivel() {
        return cctNivel;
    }

    public void setCctNivel(BigInteger cctNivel) {
        this.cctNivel = cctNivel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cctIdcentrocosto != null ? cctIdcentrocosto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentroCostos)) {
            return false;
        }
        CentroCostos other = (CentroCostos) object;
        if ((this.cctIdcentrocosto == null && other.cctIdcentrocosto != null) || (this.cctIdcentrocosto != null && !this.cctIdcentrocosto.equals(other.cctIdcentrocosto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.CentroCostos[ cctIdcentrocosto=" + cctIdcentrocosto + " ]";
    }
    
}
