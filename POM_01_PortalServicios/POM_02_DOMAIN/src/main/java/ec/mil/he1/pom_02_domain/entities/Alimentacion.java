/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_02_domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "ALIMENTACION")
@NamedQueries({
    @NamedQuery(name = "Alimentacion.findAll", query = "SELECT a FROM Alimentacion a")})
public class Alimentacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ALI_IDALIMENTACION")
    private Long aliIdalimentacion;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    @Column(name = "ALI_NUMEROALMUERZO")
    private Long aliNumeroalmuerzo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ALI_TOTALVALOR")
    private BigDecimal aliTotalvalor;
    @JoinColumn(name = "RPG_IDROLPAGOS", referencedColumnName = "RPG_IDROLPAGOS")
    @ManyToOne(fetch = FetchType.LAZY)
    private Rolpagos rolpagos;

    public Alimentacion() {
    }

    public Alimentacion(Long aliIdalimentacion) {
        this.aliIdalimentacion = aliIdalimentacion;
    }

    public Long getAliIdalimentacion() {
        return aliIdalimentacion;
    }

    public void setAliIdalimentacion(Long aliIdalimentacion) {
        this.aliIdalimentacion = aliIdalimentacion;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public Long getAliNumeroalmuerzo() {
        return aliNumeroalmuerzo;
    }

    public void setAliNumeroalmuerzo(Long aliNumeroalmuerzo) {
        this.aliNumeroalmuerzo = aliNumeroalmuerzo;
    }

    public BigDecimal getAliTotalvalor() {
        return aliTotalvalor;
    }

    public void setAliTotalvalor(BigDecimal aliTotalvalor) {
        this.aliTotalvalor = aliTotalvalor;
    }

    public Rolpagos getRolpagos() {
        return rolpagos;
    }

    public void setRolpagos(Rolpagos rolpagos) {
        this.rolpagos = rolpagos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aliIdalimentacion != null ? aliIdalimentacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alimentacion)) {
            return false;
        }
        Alimentacion other = (Alimentacion) object;
        if ((this.aliIdalimentacion == null && other.aliIdalimentacion != null) || (this.aliIdalimentacion != null && !this.aliIdalimentacion.equals(other.aliIdalimentacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_02_domain.entities.Alimentacion[ aliIdalimentacion=" + aliIdalimentacion + " ]";
    }
    
}
