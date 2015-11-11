/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.he1.pom_01_domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author christian_ruiz
 */
@Entity
@Table(name = "DETALLES_IMPUESTO_RENTA")
@NamedQueries({
    @NamedQuery(name = "DetallesImpuestoRenta.findAll", query = "SELECT d FROM DetallesImpuestoRenta d")})
public class DetallesImpuestoRenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesImpuestoRentaPK detallesImpuestoRentaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LIMITE_INFERIOR")
    private BigDecimal limiteInferior;
    @Column(name = "LIMITE_SUPERIOR")
    private BigDecimal limiteSuperior;
    @Column(name = "IMPUESTO_BASICO")
    private BigDecimal impuestoBasico;
    @Column(name = "IMPUESTO_EXEDENTE")
    private BigDecimal impuestoExedente;

    public DetallesImpuestoRenta() {
    }

    public DetallesImpuestoRenta(DetallesImpuestoRentaPK detallesImpuestoRentaPK) {
        this.detallesImpuestoRentaPK = detallesImpuestoRentaPK;
    }

    public DetallesImpuestoRenta(Date tblimprntAnoRige, int numero) {
        this.detallesImpuestoRentaPK = new DetallesImpuestoRentaPK(tblimprntAnoRige, numero);
    }

    public DetallesImpuestoRentaPK getDetallesImpuestoRentaPK() {
        return detallesImpuestoRentaPK;
    }

    public void setDetallesImpuestoRentaPK(DetallesImpuestoRentaPK detallesImpuestoRentaPK) {
        this.detallesImpuestoRentaPK = detallesImpuestoRentaPK;
    }

    public BigDecimal getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(BigDecimal limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public BigDecimal getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(BigDecimal limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public BigDecimal getImpuestoBasico() {
        return impuestoBasico;
    }

    public void setImpuestoBasico(BigDecimal impuestoBasico) {
        this.impuestoBasico = impuestoBasico;
    }

    public BigDecimal getImpuestoExedente() {
        return impuestoExedente;
    }

    public void setImpuestoExedente(BigDecimal impuestoExedente) {
        this.impuestoExedente = impuestoExedente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesImpuestoRentaPK != null ? detallesImpuestoRentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesImpuestoRenta)) {
            return false;
        }
        DetallesImpuestoRenta other = (DetallesImpuestoRenta) object;
        if ((this.detallesImpuestoRentaPK == null && other.detallesImpuestoRentaPK != null) || (this.detallesImpuestoRentaPK != null && !this.detallesImpuestoRentaPK.equals(other.detallesImpuestoRentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.DetallesImpuestoRenta[ detallesImpuestoRentaPK=" + detallesImpuestoRentaPK + " ]";
    }
    
}
