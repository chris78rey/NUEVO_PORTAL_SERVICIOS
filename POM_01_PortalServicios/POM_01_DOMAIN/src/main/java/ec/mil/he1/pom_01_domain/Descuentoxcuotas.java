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
@Table(name = "DESCUENTOXCUOTAS")
@NamedQueries({
    @NamedQuery(name = "Descuentoxcuotas.findAll", query = "SELECT d FROM Descuentoxcuotas d")})
public class Descuentoxcuotas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DCC_IDDESCUENTO")
    private Long dccIddescuento;
    @Column(name = "CNV_IDNOVEDAD")
    private String cnvIdnovedad;
    @Column(name = "PRN_IDPERSONAL")
    private Long prnIdpersonal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DCC_VALOR")
    private BigDecimal dccValor;
    @Column(name = "DCC_CUOTAS")
    private Long dccCuotas;
    @Column(name = "DCC_VALORDESCUENTO")
    private BigDecimal dccValordescuento;
    @Column(name = "DCC_SALDO")
    private BigDecimal dccSaldo;
    @Column(name = "DCC_ESTADO")
    private Character dccEstado;
    @Column(name = "DCC_FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dccFechacreacion;
    @Column(name = "DCC_USER")
    private String dccUser;

    public Descuentoxcuotas() {
    }

    public Descuentoxcuotas(Long dccIddescuento) {
        this.dccIddescuento = dccIddescuento;
    }

    public Long getDccIddescuento() {
        return dccIddescuento;
    }

    public void setDccIddescuento(Long dccIddescuento) {
        this.dccIddescuento = dccIddescuento;
    }

    public String getCnvIdnovedad() {
        return cnvIdnovedad;
    }

    public void setCnvIdnovedad(String cnvIdnovedad) {
        this.cnvIdnovedad = cnvIdnovedad;
    }

    public Long getPrnIdpersonal() {
        return prnIdpersonal;
    }

    public void setPrnIdpersonal(Long prnIdpersonal) {
        this.prnIdpersonal = prnIdpersonal;
    }

    public BigDecimal getDccValor() {
        return dccValor;
    }

    public void setDccValor(BigDecimal dccValor) {
        this.dccValor = dccValor;
    }

    public Long getDccCuotas() {
        return dccCuotas;
    }

    public void setDccCuotas(Long dccCuotas) {
        this.dccCuotas = dccCuotas;
    }

    public BigDecimal getDccValordescuento() {
        return dccValordescuento;
    }

    public void setDccValordescuento(BigDecimal dccValordescuento) {
        this.dccValordescuento = dccValordescuento;
    }

    public BigDecimal getDccSaldo() {
        return dccSaldo;
    }

    public void setDccSaldo(BigDecimal dccSaldo) {
        this.dccSaldo = dccSaldo;
    }

    public Character getDccEstado() {
        return dccEstado;
    }

    public void setDccEstado(Character dccEstado) {
        this.dccEstado = dccEstado;
    }

    public Date getDccFechacreacion() {
        return dccFechacreacion;
    }

    public void setDccFechacreacion(Date dccFechacreacion) {
        this.dccFechacreacion = dccFechacreacion;
    }

    public String getDccUser() {
        return dccUser;
    }

    public void setDccUser(String dccUser) {
        this.dccUser = dccUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dccIddescuento != null ? dccIddescuento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Descuentoxcuotas)) {
            return false;
        }
        Descuentoxcuotas other = (Descuentoxcuotas) object;
        if ((this.dccIddescuento == null && other.dccIddescuento != null) || (this.dccIddescuento != null && !this.dccIddescuento.equals(other.dccIddescuento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.mil.he1.pom_01_domain.Descuentoxcuotas[ dccIddescuento=" + dccIddescuento + " ]";
    }
    
}
