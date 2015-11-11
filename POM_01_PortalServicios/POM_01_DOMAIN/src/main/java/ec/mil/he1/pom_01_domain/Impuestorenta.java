/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "IMPUESTORENTA")
@NamedQueries({
    @NamedQuery(name = "Impuestorenta.findAll", query = "SELECT i FROM Impuestorenta i")})
public class Impuestorenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IRT_IDIMPUESTO")
    private Long irtIdimpuesto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "IRT_FRACCIONBASICA")
    private BigDecimal irtFraccionbasica;
    @Column(name = "IRT_EXCESOFRACCIONBASICA")
    private BigDecimal irtExcesofraccionbasica;
    @Column(name = "IRT_IMPUESTOFRACCIONBASICA")
    private BigDecimal irtImpuestofraccionbasica;
    @Column(name = "IRT_PORCENTAJE")
    private BigDecimal irtPorcentaje;
    @Column(name = "IRT_USER")
    private String irtUser;
    @Column(name = "IRT_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date irtFechacreacion;
    @Column(name = "IRT_ANIO")
    private String irtAnio;

    public Impuestorenta() {
    }

    public Impuestorenta(Long irtIdimpuesto) {
        this.irtIdimpuesto = irtIdimpuesto;
    }

    public Long getIrtIdimpuesto() {
        return irtIdimpuesto;
    }

    public void setIrtIdimpuesto(Long irtIdimpuesto) {
        this.irtIdimpuesto = irtIdimpuesto;
    }

    public BigDecimal getIrtFraccionbasica() {
        return irtFraccionbasica;
    }

    public void setIrtFraccionbasica(BigDecimal irtFraccionbasica) {
        this.irtFraccionbasica = irtFraccionbasica;
    }

    public BigDecimal getIrtExcesofraccionbasica() {
        return irtExcesofraccionbasica;
    }

    public void setIrtExcesofraccionbasica(BigDecimal irtExcesofraccionbasica) {
        this.irtExcesofraccionbasica = irtExcesofraccionbasica;
    }

    public BigDecimal getIrtImpuestofraccionbasica() {
        return irtImpuestofraccionbasica;
    }

    public void setIrtImpuestofraccionbasica(BigDecimal irtImpuestofraccionbasica) {
        this.irtImpuestofraccionbasica = irtImpuestofraccionbasica;
    }

    public BigDecimal getIrtPorcentaje() {
        return irtPorcentaje;
    }

    public void setIrtPorcentaje(BigDecimal irtPorcentaje) {
        this.irtPorcentaje = irtPorcentaje;
    }

    public String getIrtUser() {
        return irtUser;
    }

    public void setIrtUser(String irtUser) {
        this.irtUser = irtUser;
    }

    public Date getIrtFechacreacion() {
        return irtFechacreacion;
    }

    public void setIrtFechacreacion(Date irtFechacreacion) {
        this.irtFechacreacion = irtFechacreacion;
    }

    public String getIrtAnio() {
        return irtAnio;
    }

    public void setIrtAnio(String irtAnio) {
        this.irtAnio = irtAnio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (irtIdimpuesto != null ? irtIdimpuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Impuestorenta)) {
            return false;
        }
        Impuestorenta other = (Impuestorenta) object;
        if ((this.irtIdimpuesto == null && other.irtIdimpuesto != null) || (this.irtIdimpuesto != null && !this.irtIdimpuesto.equals(other.irtIdimpuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Impuestorenta[ irtIdimpuesto=" + irtIdimpuesto + " ]";
    }
    
}
